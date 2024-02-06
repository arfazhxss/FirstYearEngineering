import java.util.Arrays;
public class mid1tests {
    public static int[] copyArray(int[] arr) {
        int[] copy = new int[arr.length];
        for (int i=0;i<arr.length;i++) {
            copy[i]=arr[i];
        }
        return copy;
    }
    public static void changeArray(int[] arr,int val) {
        for (int i=0;i<arr.length;i++) {
            if (arr[i]==val) {
                arr[i]=arr[i]-1;
            }
        }
    }
    public static void arrayTest() {
        int[] n1 = {1,3,4,3,2};
        int[] n2 = n1;
        int[] n3 = copyArray(n1);
        System.out.println("test1: The usuals");
        System.out.println("n1: "+Arrays.toString(n1));
        System.out.println("n2: "+Arrays.toString(n2));
        System.out.println("n3: "+Arrays.toString(n3));


        changeArray(n1, 3);
        int[] n4 = copyArray(n1);
        System.out.println("test2: Afer changing n1 and creating n4");
        System.out.println("n1: "+Arrays.toString(n1));
        System.out.println("n2: "+Arrays.toString(n2));
        System.out.println("n3: "+Arrays.toString(n3));
        System.out.println("n4: "+Arrays.toString(n4));


        changeArray(n2, 2);
        System.out.println("test3: After changing n2");
        System.out.println("n1: "+Arrays.toString(n1));
        System.out.println("n2: "+Arrays.toString(n2));
        System.out.println("n3: "+Arrays.toString(n3));
        System.out.println("n4: "+Arrays.toString(n4));
    }
    public static void main (String[] args) {
        arrayTest();
    }
}