package DayThree;

public class Rucksack {

    private String entire;
    private String comp1;
    private String comp2;
    private char commonLetter;

    public char getCommonLetter() {
        return commonLetter;
    }



    public Rucksack(String entire) {
        this.entire = entire;
        setCompartments();
        setCommonLet(determineCommonLetter());
    }

    public void setCompartments(){
        String comp1 = entire.substring(0, (entire.length()/2));
        String comp2 = entire.substring((entire).length()/2);
        setComp1(comp1);
        setComp2(comp2);
    }

    public void setComp1(String comp1) {
        this.comp1 = comp1;
    }

    public void setComp2(String comp2) {
        this.comp2 = comp2;
    }

    public void setCommonLetter(char commonLetter) {
        this.commonLetter = commonLetter;
    }

    public int determineCommonLetter(){
        int index = 0;
        for (int i = 0; i < comp1.length(); i++) {
            for (int j = 0; j < comp2.length(); j++) {
                if (comp1.charAt(i)==comp2.charAt(j)) {
                    index = i;
                }
            }
        }
        return index;
    }

    public void setCommonLet(int location){
        this.commonLetter = comp1.charAt(location);
    }

    public String getEntire() {
        return entire;
    }
}
