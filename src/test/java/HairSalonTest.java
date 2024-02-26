import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class HairSalonTest {

    HairSalon hairSalon = new HairSalon();

    @Test
    public void testGetOpeningDays() {
        String[] expected = {"Monday", "Tuesday"};
        String[] actual = hairSalon.getOpeningDays();
        assertArrayEquals(expected, actual);

    }

    @Test
    public void testSalonIsOpenOnMonday() {
        assertTrue(hairSalon.isOpen("Monday"));
    }

    @Test
    public void testSalonIsClosedOnWednesday() {
        assertFalse(hairSalon.isOpen("Wednesday"));

    }

    @Test
    public void testExceptionIsThrownIfWeekdayDoesNotEndInDay() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> hairSalon.isOpen("chicken"));
    }

}