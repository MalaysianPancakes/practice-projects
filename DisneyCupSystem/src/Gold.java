
public class Gold extends Customer {
    private int discountPercent;

    public Gold(int customerDiscountPercent, String customerLastName, String customerFirstName, String customerGuestID, float customerAmountSpent) {
        super(customerLastName, customerFirstName, customerGuestID, customerAmountSpent);
        this.discountPercent = customerDiscountPercent;
    }

    public int getDiscountPercent() {
        return this.discountPercent;
    }

    public void setDiscountPercent(int newDiscountPercent) {
        this.discountPercent = newDiscountPercent;
    }
}
