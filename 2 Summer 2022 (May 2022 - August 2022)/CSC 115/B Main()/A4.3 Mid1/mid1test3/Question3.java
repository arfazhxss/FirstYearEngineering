public class Question3 {
    public static void main (String[] args) {
    ClothingItem c0;
    System.out.println("C");
    ClothingItem c1 = new ClothingItem(35.99, "233WW");
    ClothingItem c2 = new ClothingItem(45.45, "341XY");
    c0 = new ClothingItem();
    System.out.println("D: " + c0.getBarcode());
    System.out.println("E: " + c1.getBarcode());
    System.out.println("F: " + c2.getBarcode());
    c2 = c0;
    System.out.println("G: " + c0.getBarcode());
    System.out.println("H: " + c1.getBarcode());
    System.out.println("I: " + c2.getBarcode());
    c0 = c1;
    System.out.println("J: " + c0.getBarcode());
    System.out.println("K: " + c1.getBarcode());
    System.out.println("L: " + c2.getBarcode());
    System.out.println(c2.compareTo(c1));
    }
    }