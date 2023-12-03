# This is a sample Python script.

# Press ⌃R to execute it or replace it with your code.
# Press Double ⇧ to search everywhere for classes, files, tool windows, actions, and settings.

from word2number import w2n


def part_two(given):

    firstDigFound = False
    firstDig = 0
    secDig = 0
    secDigFound = False
    locationDigOne = 1000
    locationDigTwo = 1000

    for dude in given:
        if dude.isdigit() and not firstDigFound:
            firstDig = dude
            locationDigOne = given.index(dude)
            firstDigFound = True
        elif dude.isdigit() and firstDigFound:
            secDig = dude
            locationDigTwo = given.index(dude)
            secDigFound = True
        elif dude.isdigit() and secDigFound:
            secDig = dude
            locationDigTwo = given.index(dude)


    result1 = "one" in given
    result2 = "two" in given
    result3 = "three" in given
    result4 = "four" in given
    result5 = "five" in given
    result6 = "six" in given
    result7 = "seven" in given
    result8 = "eight" in given
    result9 = "nine" in given
    location1 = 1000
    location2 = 1000
    location3 = 1000
    location4 = 1000
    location5 = 1000
    location6 = 1000
    location7 = 1000
    location8 = 1000
    location9 = 1000
    if result1:
        location1 = given.index("one")
    if result2:
        location2 = given.index("two")
    if result3:
        location3 = given.index("three")
    if result4:
        location4 = given.index("four")
    if result5:
        location5 = given.index("five")
    if result6:
        location6 = given.index("six")
    if result7:
        location7 = given.index("seven")
    if result8:
        location8 = given.index("eight")
    if result9:
        location9 = given.index("nine")

    myList = [locationDigOne,locationDigTwo,location1,location2,location3,location4,location5,location6,location7,location8,location9]
    nice = min(myList)
    currentMax = -1000
    for thelocation in myList:
        if thelocation != 1000 and thelocation > currentMax:
            currentMax = thelocation

    firstDigFinal = 0
    secDigFinal = 0


    if given[nice].isdigit():
        firstDigFinal = given[nice]
    elif location1 == nice:
        firstDigFinal = 1
    elif location2 == nice:
        firstDigFinal = 2
    elif location3 == nice:
        firstDigFinal = 3
    elif location4 == nice:
        firstDigFinal = 4
    elif location5 == nice:
        firstDigFinal = 5
    elif location6 == nice:
        firstDigFinal = 6
    elif location7 == nice:
        firstDigFinal = 7
    elif location8 == nice:
        firstDigFinal = 8
    elif location9 == nice:
        firstDigFinal = 9


    if given[currentMax].isdigit():
        secDigFinal = given[currentMax]
    elif location1 == currentMax:
        secDigFinal = 1
    elif location2 == currentMax:
        secDigFinal = 2
    elif location3 == currentMax:
        secDigFinal = 3
    elif location4 == currentMax:
        secDigFinal = 4
    elif location5 == currentMax:
        secDigFinal = 5
    elif location6 == currentMax:
        secDigFinal = 6
    elif location7 == currentMax:
        secDigFinal = 7
    elif location8 == currentMax:
        secDigFinal = 8
    elif location9 == currentMax:
        secDigFinal = 9

    return (int(firstDigFinal)*10) + int(secDigFinal)










def print_hi(stringCheck):
    firstDigFound = False
    firstDig = 0
    secDig = 0
    secDigFound = False

    for dude in stringCheck:
        if dude.isdigit() and not firstDigFound:
            firstDig = dude
            firstDigFound = True
        elif dude.isdigit() and firstDigFound:
            secDig = dude
            secDigFound = True
        elif dude.isdigit() and secDigFound:
            secDig = dude
    if not secDigFound:
        secDig = firstDig
    return (int(firstDig) * 10) + int(secDig)




# Press the green button in the gutter to run the script.
if __name__ == '__main__':
    file1 = open("data", "r")
    data = file1.readlines()
    total = 0
    temp = 0
    for guy in data:
        temp = print_hi(guy)
        #total = total + temp
        #print(total)
        total = total + part_two(guy)
        print(part_two(guy))
        print(total)

    print(total)







# See PyCharm help at https://www.jetbrains.com/help/pycharm/
