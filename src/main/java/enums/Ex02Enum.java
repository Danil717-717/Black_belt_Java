package enums;

import java.util.Arrays;

public class Ex02Enum {


    public static void main(String[] args) {
        Today2 today2 = new enums.Today2(enums.WeekDays2.MONDAY);
        today2.daysInfo();
        System.out.println(today2.weekDays2);

        WeekDays2 w1 = WeekDays2.FRIDAY;
        WeekDays2 w2 = WeekDays2.FRIDAY;
        WeekDays2 w3 = WeekDays2.MONDAY;
        System.out.println(w1==w3);

        //System.out.println(WeekDays2.FRIDAY==WeekDays3.FRIDAY);
        System.out.println(WeekDays2.FRIDAY.equals(WeekDays3.FRIDAY));

        WeekDays2 w15 = WeekDays2.valueOf("MONDAY");
        System.out.println(w15);

        WeekDays2[] arr = WeekDays2.values();
        System.out.println(Arrays.toString(arr));

    }

}

enum WeekDays2 {
    MONDAY("bad"),
    TUESDAY("bad"),
    WEDNESDAY("so-so"),
    THURSDAY,
    FRIDAY("good"),
    SATURDAY("great"),
    SUNDAY("good");

    private String mood;
    private  WeekDays2(String mood){
        this.mood=mood;
    }

    private WeekDays2(){
    }

    public String getMood(){
        return mood;
    }
}


enum WeekDays3 {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;
}

class Today2 {
    enums.WeekDays2 weekDays2;

    public Today2(WeekDays2 weekDays2) {
        this.weekDays2 = weekDays2;
    }

    void daysInfo() {
        switch (weekDays2) {
            case MONDAY:
            case THURSDAY:
            case WEDNESDAY:
            case TUESDAY:
            case FRIDAY:
                System.out.println("Go work!");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Weekend!");
                break;
        }
        System.out.println("Nastroenie v etot den: " + weekDays2.getMood());
    }

}


