public class ClothingItem {
    double price; // in dollars
    String barcode; // unique barcode
    public ClothingItem () {
    price = 0.0;
    barcode = "unknown";
    System.out.println("A");
    }
    public ClothingItem (double price, String barcode) {
    this.price = price;
    this.barcode = barcode;
    System.out.println("B");
    }
    public void setPrice (double price) {
    this.price = price;
    }
    public double getPrice () {
    return price;
    }
    public void setBarcode (String barcode) {
    this.barcode = barcode;
    }
    public String getBarcode () {
    return barcode;
    }
    public String toString () {
    return barcode + ": $" + price;
    }
    public int compareTo (ClothingItem otherItem) {
        if (this.getPrice()==otherItem.getPrice()) return 0;
        else if (this.getPrice()<otherItem.getPrice()) return -1;
        else if (this.getPrice()>otherItem.getPrice()) return 1;
    return 0;
    }
    }