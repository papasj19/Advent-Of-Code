COLORS = ["red", "blue", "green"]



def print_hi(name):
    # Use a breakpoint in the code line below to debug your script.
    print(f'Hi, {name}')


def cycleInfo(mydata):
    numRed = 0
    numBlue = 0
    numGreen = 0
    total = 0

    for game in mydata:
        numRed = 0
        numBlue = 0
        numGreen = 0
        msbRed = 0
        msbBlue = 0
        msbGreen = 0
        sectionsGame = game.split(":")
        colorSections = sectionsGame[1].split(";")
        for section in colorSections:
             numRed = 0
             numBlue = 0
             numGreen = 0
             if 'red' in section:
                locationRed = section.index("red")
                numRed = numRed + int(section[locationRed-2])
                if section[locationRed-3].isdigit():
                    msbRed = int(section[locationRed-3])
                    msbRed = (msbRed*10) + numRed
                    numRed = msbRed

             if 'blue' in section:
                locationBlue = section.index("blue")
                numBlue = numBlue + int(section[locationBlue-2])
                if section[locationBlue-3].isdigit():
                    msbBlue = int(section[locationBlue-3])
                    msbBlue = (msbBlue*10) + numBlue
                    numBlue = msbBlue

             if 'green' in section:
                locationGreen = section.index("green")
                numGreen = numGreen + int(section[locationGreen-2])
                if section[locationGreen-3].isdigit():
                    msbGreen = int(section[locationGreen-3])
                    msbGreen = (msbGreen*10) + numGreen
                    numGreen = msbGreen
        id = 0
        if numRed <= 12 and numGreen <= 13 and numBlue <= 14:
            if len(sectionsGame[0]) != 8:
                if not sectionsGame[0][len(sectionsGame[0])-2].isdigit():
                    id = int(sectionsGame[0][len(sectionsGame[0])-1])
                    total = total + int(sectionsGame[0][len(sectionsGame[0])-1])
                else:
                    largeDig = (int(sectionsGame[0][len(sectionsGame[0])-2]))*10
                    smallDig = int(sectionsGame[0][len(sectionsGame[0])-1])
                    id = largeDig + smallDig
                    total = total + largeDig + smallDig
            elif len(sectionsGame[0]) == 8:
                id = 100
                total = total + 100
        print(total)




if __name__ == '__main__':

    file1 = open("mainData", "r")
    data = file1.readlines()
    cycleInfo(data)

