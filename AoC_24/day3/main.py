import re

def process_memory(memory):
    """
    Processes the corrupted memory, handling `do()` and `don't()` instructions
    to enable or disable `mul`. Calculates the sum of results from enabled `mul` instructions.
    """
    # Regex patterns
    mul_pattern = r"mul\((\d{1,3}),(\d{1,3})\)"
    do_pattern = r"do\(\)"
    dont_pattern = r"don't\(\)"

    # Initial state: mul instructions are enabled
    mul_enabled = True
    total = 0

    # Find all relevant patterns (do, don't, mul)
    matches = re.finditer(rf"{do_pattern}|{dont_pattern}|{mul_pattern}", memory)

    # Process matches sequentially
    for match in matches:
        token = match.group()
        if re.fullmatch(do_pattern, token):
            mul_enabled = True
        elif re.fullmatch(dont_pattern, token):
            mul_enabled = False
        elif re.fullmatch(mul_pattern, token) and mul_enabled:
            # Extract numbers and calculate the result if mul is enabled
            x, y = map(int, match.groups())
            total += x * y

    return total


def process_file(file_path):
    # Read the file as a single string
    with open(file_path, 'r') as file:
        content = file.read()

    # Regex pattern for valid mul instructions
    pattern = r"mul\((\d{1,3}),(\d{1,3})\)"

    # Find all valid mul patterns
    matches = re.findall(pattern, content)

    # Calculate the total from the matches
    total = sum(int(x) * int(y) for x, y in matches)

    return total



if __name__ == "__main__":
    file_path = 'data.txt'  # Path to your input file
    #total = process_file(file_path)
    #print("Total sum of valid 'mul' instructions:", total)
    with open(file_path, 'r') as file:
        content = file.read()
    print(process_memory(content))
