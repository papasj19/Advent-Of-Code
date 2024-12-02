
# Press the green button in the gutter to run the script.
if __name__ == '__main__':

    file_path = 'data.txt'
    column1 = []
    column2 = []


    with open(file_path, 'r') as file:
        for line in file:
            values = line.split()
            if len(values) == 2:
                column1.append(int(values[0]))
                column2.append(int(values[1]))

    column2.sort()
    column1.sort()

    diff = 0
    # part 1
    for num1, num2 in zip(column1, column2):
        diff += abs(num1 - num2)

    print(diff)

    #part 2
    similarity_score = 0
    for num1 in column1:
        count = 0
        for num2 in column2:
            if num1 == num2:
                count += 1
        similarity_score += num1 * count

    print(similarity_score)
