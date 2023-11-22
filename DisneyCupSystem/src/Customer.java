

public class Customer {
    private String lastName;
    private String firstName;
    private String guestID;
    private float amountSpent;

    public Customer(String customerLastName, String customerFirstName, String customerGuestID, float customerAmountSpent) {
        this.lastName = customerLastName;
        this.firstName = customerFirstName;
        this.guestID = customerGuestID;
        this.amountSpent = customerAmountSpent;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getGuestID() {
        return this.guestID;
    }

    public float getAmountSpent() {
        return this.amountSpent;
    }

    public void setLastName(String newLastName) {
        this.lastName = newLastName;
    }

    public void setFirstName(String newFirstName) {
        this.firstName = newFirstName;
    }

    public void setGuestID(String newGuestID) {
        this.guestID = newGuestID;
    }

    public void setAmountSpent(float newAmountSpent) {
        this.amountSpent = newAmountSpent;
    }

    public String getCustomerInfo() { return this.lastName + ", " + this.firstName + ", " + this.guestID + ", " + this.amountSpent; }

    public float calculateDrinkPrice(int drinkSize, float costPerOz) {
        float totalPrice = (float)drinkSize * costPerOz;
        return totalPrice;
    }

    public float calculatePersonalizedCupPrice(int cupType, double graphicSize) {
        double totalPrice = 0.0;
        if (cupType == 1) {
            totalPrice = graphicSize * 12.0 / 18.0;
        }

        if (cupType == 2) {
            totalPrice = graphicSize * 20.0 / 25.875;
        }

        if (cupType == 3) {
            totalPrice = graphicSize * 32.0 / 38.5;
        }

        return (float)totalPrice;
    }



}   // end file
