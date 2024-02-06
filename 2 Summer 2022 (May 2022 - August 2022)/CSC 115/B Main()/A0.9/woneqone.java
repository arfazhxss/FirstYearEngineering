public class woneqone {
    public static void addOne(int x) {
        ++x;
        System.out.println("In addOne, x: "+x);
    }

    public static void addOneToFirst(int[] nums) {
        System.out.println("In addOneToFirst, nums: ");
        printArray(nums);
        nums[0]=nums[0]+1;
    }

    public static void printArray(int[] nums) {
        System.out.print("[");
        for(int i=0; i<nums.length;i++) {
            System.out.print(nums[i]);
            if (i != nums.length-1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        int x = 7;
        addOne(x);
        System.out.println("After addOne, x: "+x);

        int[] vals = {1,2,3,4,5};
        addOneToFirst(vals);
        System.out.println("After AddToOneFirst, vals: ");
        printArray(vals);
    }
}