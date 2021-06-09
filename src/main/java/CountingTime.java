import java.util.GregorianCalendar;

public class CountingTime extends GregorianCalendar {
    private int modifyCounter;


    @Override
    public void add(int field, int amount) {
        modifyCounter++;
        super.add(field, amount);
    }

    @Override
    public void roll(int field, int amount) {
        modifyCounter++;
        super.roll(field, amount);
    }

    /**
     * Tells how many times the Calender days have been modified using add() and roll().
     *
     * @return the number of times the add and roll method has been used.
     */
    public int getModifyCounter() {
        return modifyCounter;
    }
}
