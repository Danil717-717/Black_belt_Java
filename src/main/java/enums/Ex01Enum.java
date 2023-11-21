package enums;

public class Ex01Enum {

    public static void main(String[] args) {
        Today today = new Today(WeekDays.MONDAY);
        today.daysInfo();
    }

}

enum WeekDays{
    MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY;
}

class Today{
    WeekDays weekDays;
    public Today(WeekDays weekDays){
        this.weekDays = weekDays;
    }

    void daysInfo(){
        switch (weekDays){
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
    }

}
