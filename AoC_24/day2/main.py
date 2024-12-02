

def is_safe(row):
    if all(row[i] < row[i + 1] for i in range(len(row) - 1)):  # Increasing
        trend = "increasing"
    elif all(row[i] > row[i + 1] for i in range(len(row) - 1)):  # Decreasing
        trend = "decreasing"
    else:
        return False

    for i in range(len(row) - 1):
        diff = abs(row[i] - row[i + 1])
        if diff < 1 or diff > 3:
            return False

    return True



def can_be_safe_with_removal(row):
    for i in range(len(row)):
        modified_row = row[:i] + row[i + 1:]
        if is_safe(modified_row):
            return True
    return False



if __name__ == '__main__':
    file_path = 'data.txt'
    rows = []

    with open(file_path, 'r') as file:
        for line in file:
            row = list(map(int, line.split()))
            rows.append(row)



    # part 1

    valid_row_count = 0
    other = 0

    for row in rows:
        if is_safe(row):
            valid_row_count += 1

#part 2
    for row in rows:
        if is_safe(row) or can_be_safe_with_removal(row):
            other += 1

    print(other)