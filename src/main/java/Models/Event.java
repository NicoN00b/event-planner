package Models;

import java.util.ArrayList;
import java.util.List;

public class Event {
    private int Guests = 0;
    private List<String> DinnerMenu = new ArrayList<>();
    private List<String> Libations = new ArrayList<>();
    private List<String> Entertainment = new ArrayList<>();


    public Event(int Guests, List<String> DinnerMenu, List<String> Libations, List<String> Entertainment){
        this.Guests = Guests;
        this.DinnerMenu = DinnerMenu;
        this.Libations = Libations;
        this.Entertainment = Entertainment;
    }

    public int getGuests() {
        return Guests;
    }

    public List<String> getDinnerMenu() {
        return DinnerMenu;
    }

    public List<String> getLibations() {
        return Libations;
    }

    public List<String> getEntertainment() {
        return Entertainment;
    }

    public static void giveEstimate(){
        //create price based on event input

    }
}
