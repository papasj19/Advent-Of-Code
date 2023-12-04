# This is a sample Python script.

# Press ⌃R to execute it or replace it with your code.
# Press Double ⇧ to search everywhere for classes, files, tool windows, actions, and settings.


def print_hi(data):
    totalPoints = 0
    for line in data:
        matches = 0
        points = 0
        counterWinner = 0
        winners = []
        cardNums = []
        locationSplit = line.index("|")
        numbers = [int(s) for s in line.split() if s.isdigit() and line.index(s) < locationSplit]

        winners = numbers[0:10]

        cardNums = numbers[10:]

        for winner in winners:
            if winner in cardNums:
                matches = matches + 1

        if matches < 3:
            points = matches
        else:
            points = 2 * matches

        totalPoints = totalPoints + points



    print(totalPoints)





# Press the green button in the gutter to run the script.
if __name__ == '__main__':
    file1 = open("data", "r")

    data = file1.readlines()
    print_hi(data)

# See PyCharm help at https://www.jetbrains.com/help/pycharm/
