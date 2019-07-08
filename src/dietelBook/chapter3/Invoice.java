

/**
 * <p> Created by Onikoyi Damola Olutoba  12/02/19 </p>
 */

package dietelBook.chapter3;

public class Invoice {
    private String partNumber;
    private String partDescription;
    private int itemPurchased;
    private double pricePerItem;
    private double invoiceAmount;

    //constructor
    public Invoice(String partNumber, String partDescription, int itemPurchased, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.itemPurchased = itemPurchased;
        this.pricePerItem = pricePerItem;

    } //end constructor

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public int getItemPurchased() {
        return itemPurchased;
    }

    public void setItemPurchased(int itemPurchased) {
        if (itemPurchased < 0)
            itemPurchased = 0;
        this.itemPurchased = itemPurchased;

    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {
        if (pricePerItem < 0)
            pricePerItem = 0.0;
        this.pricePerItem = pricePerItem;
    }

    public double getInvoiceAmount() {
        return invoiceAmount;
    } //end method getInvoiceAmount

    public void setInvoiceAmount() {
        invoiceAmount = itemPurchased * pricePerItem;
        System.out.println("The invoice price is: $" + invoiceAmount);
    } //end method setInvoiceAmount

} //end class
