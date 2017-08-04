package Models;

import java.util.ArrayList;
import java.util.List;

public class Event {
    private int mGuests = 0;
    private List<String> mDinnerMenu = new ArrayList<>();
    private List<String> mLibations = new ArrayList<>();
    private List<String> mEntertainment = new ArrayList<>();


    public Event(int Guests, List<String> food, List<String> bev, List<String> party){
        mGuests = Guests;
        mDinnerMenu.addAll(food);
        mLibations.addAll(bev);
        mEntertainment.addAll(party);
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
        double priceDinnerMenu = mGuests * 9.99 * mDinnerMenu.size();
        double priceLibations = mGuests * 12.99 * mLibations.size();
        double priceEntertainment = 200 * mEntertainment.size();

        double totalCost = priceDinnerMenu + priceEntertainment + priceLibations;

        return totalCost;
    }

    public double nonProfit(){
        double priceDinnerMenu = mGuests * 9.99 * mDinnerMenu.size();
        double priceLibations = mGuests * 12.99 * mLibations.size();
        double priceEntertainment = 200 * mEntertainment.size();

        double totalCost = priceDinnerMenu + priceEntertainment + priceLibations - 100;

        return totalCost;
    }

    public double student(){
        double priceDinnerMenu = mGuests * 9.99 * mDinnerMenu.size();
        double priceLibations = mGuests * 12.99 * mLibations.size();
        double priceEntertainment = 200 * mEntertainment.size();

        double totalCost = priceDinnerMenu + priceEntertainment + priceLibations - 50;

        return totalCost;
    }
}
