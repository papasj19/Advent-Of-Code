package DayThree;

public class GroupRucksack {

    private Rucksack elfOne;
    private Rucksack elfTwo;
    private Rucksack elfThree;

    public GroupRucksack(Rucksack elfOne, Rucksack elfTwo, Rucksack elfThree) {
        this.elfOne = elfOne;
        this.elfTwo = elfTwo;
        this.elfThree = elfThree;
    }

    public Rucksack getElfOne() {
        return elfOne;
    }

    public Rucksack getElfTwo() {
        return elfTwo;
    }

    public Rucksack getElfThree() {
        return elfThree;
    }
}
