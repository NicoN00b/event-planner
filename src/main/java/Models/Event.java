package Models;

import java.util.ArrayList;
import java.util.List;

public class Event {
    private int mGuests = 0;
    private List<String> mDinnerMenu = new ArrayList<>();
    private List<String> mLibations = new ArrayList<>();
    private List<String> mEntertainment = new ArrayList<>();


    public Event(int Guests, List<String> DinnerMenu, List<String> Libations, List<String> Entertainment){
        mGuests = Guests;
        mDinnerMenu.addAll(mDinnerMenu);
        mLibations.addAll(mLibations);
        mEntertainment.addAll(mEntertainment);
    }

    public int getGuests() {
        return mGuests;
    }

    public List<String> getDinnerMenu() {
        return mDinnerMenu;
    }

    public List<String> getLibations() {
        return mLibations;
    }

    public List<String> getEntertainment() {
        return mEntertainment;
    }

    public double giveEstimate(){

        //create price based on event input

    }
}
