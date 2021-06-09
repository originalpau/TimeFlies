import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) {
        CountingTime countingTime = new CountingTime();
        countingTime.set(2021, 6, 9);
        System.out.println("START DATE USING CountingTime");
        printCalendarTime(countingTime);
        int rollDays = 10;
        int addMonths = 2;
        for (int i = 0; i < rollDays; i++) {
            countingTime.roll(Calendar.DATE, 1);
        }
        for (int i = 0; i < addMonths; i++) {
            countingTime.add(Calendar.MONTH, 1);
        }
        System.out.println("countingTime date modifiers used " + countingTime.getModifyCounter() + " times.");
        System.out.println("NEW DATE");
        printCalendarTime(countingTime);

        CountingTimeWithComposite countingTimeWithComposite = new CountingTimeWithComposite();
        countingTimeWithComposite.getGregorianCalendar().set(2021, 6, 9);
        System.out.println("START DATE USING CountingTime");
        printCalendarTime(countingTimeWithComposite.getGregorianCalendar());
        for (int i = 0; i < rollDays; i++) {
            countingTimeWithComposite.roll(Calendar.DATE, 1);
        }
        for (int i = 0; i < addMonths; i++) {
            countingTimeWithComposite.add(Calendar.MONTH, 1);
        }
        System.out.println("countingTimeWithComposite date modifiers used "
                + countingTimeWithComposite.getModifyCounter() + " times.");
        System.out.println("NEW DATE (Composite class)");
        printCalendarTime(countingTimeWithComposite.getGregorianCalendar());

    }

    private static void printCalendarTime(GregorianCalendar cal) {
        System.out.println("Date: " + cal.get(Calendar.DATE) +
                        " Month: " + cal.get(Calendar.MONTH) +
                        " Year: " + cal.get(Calendar.YEAR) + "\n");
    }
}
