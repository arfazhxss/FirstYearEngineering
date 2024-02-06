public class Question5 {
    public static void main (String[] args) {
    ClothingItem c1 = new ClothingItem(35.99, "233WW");
    ClothingItem c2 = new ClothingItem(45.45, "341XY");
    ClothingItemList l = new ClothingItemList();
    l.addClothingItem(c1);
    l.addClothingItem(c2);
    System.out.println(l);
    }
}