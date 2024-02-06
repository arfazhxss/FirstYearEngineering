public class ClothingItemList {
    private static final int INITIAL_SZ = 4;
    private ClothingItem[] clothes;
    private int count;

    public ClothingItemList() {
        clothes = new ClothingItem[INITIAL_SZ];
        count = 0;
    }
    public int getSize() {
        return count;
    }
    public void addClothingItem (ClothingItem c) {
        if (count >= clothes.length) {
            expandAndCopy();
        }
        clothes[count] = c;
        count++;
    }
    private void expandAndCopy() {
    ClothingItem[] newClothes = new ClothingItem[2*clothes.length];
    for(int i=0; i<count; i++)
    newClothes[i] = clothes[i];
    clothes = newClothes;
    }
    public String toString() {
    String s = "";
    for(int i=0; i<count; i++)
    s += clothes[i] + "\n";
    return s;
    }
    public int getCount() {
    return count;
    }
    }