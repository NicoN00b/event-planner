package Models;

import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class EventTest {
    @Test
    public void newGuest_returnGuestNum_1() throws Exception {
        int testGuests = 1;
        List<String> testDinnerMenu = new ArrayList<>();
        List<String> testLibations = new ArrayList<>();
        List<String> testEntertainment = new ArrayList<>();
        Event testEvent = new Event(testGuests, testDinnerMenu, testLibations, testEntertainment);
        assertEquals(1, testEvent.getGuests());
    }

}