import java.util.GregorianCalendar;

public class CountingTimeWithComposite {
    private int modifyCounter;
    GregorianCalendar gregorianCalendar = new GregorianCalendar();

    public void add(int field, int amount) {
        modifyCounter++;
        gregorianCalendar.add(field, amount);
    }

    public void roll(int field, int amount) {
        modifyCounter++;
        gregorianCalendar.roll(field, amount);
    }

    /**
     * Tells how many times the Calender days have been modified using add() and roll().
     *
     * @return the number of times the add and roll method has been used.
     */
    public int getModifyCounter() {
        return modifyCounter;
    }

    public GregorianCalendar getGregorianCalendar() {
        return gregorianCalendar;
    }
}
