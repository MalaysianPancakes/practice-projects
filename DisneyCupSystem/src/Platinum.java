public class Platinum extends Customer {
    private int bonusBucks;

    public Platinum(int customerBonusBucks, String customerLastName, String customerFirstName, String customerGuestID, float customerAmountSpent) {
        super(customerLastName, customerFirstName, customerGuestID, customerAmountSpent);
        this.bonusBucks = customerBonusBucks;
    }

    public int getBonusBucks() {
        return this.bonusBucks;
    }

    public void setBonusBucks(int newBonusBucks) {
        this.bonusBucks = newBonusBucks;
    }
}
