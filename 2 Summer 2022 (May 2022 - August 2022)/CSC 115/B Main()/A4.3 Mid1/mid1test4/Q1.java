public class Q1 {
    public static int longOcc (int[] arr, int val) {
        int count = 0;
        // int countTwo = 0;
        if (arr.length!=0) {
            for (int i=1;i<arr.length;i++) {
                if ((arr[i-1]==val)&&(arr[i-1]==arr[i])) {
                    count++;
                } else if (arr[i-1]==val) {
                    if ((arr[i-1]==val)&&(arr[i-1]==arr[i])) {
                        count = 0;
                    }
                    count++;
                }
            }
            if (arr[arr.length-1]==val) {
                count++;
            }
            return count;
        }
        return 0;
    }
    public static void main(String[] args) {
        int i =0;
        // a = new int[15];
        int[] a =  new int[] {};
        System.out.println("test["+(i++)+"]:\t"+longOcc(a,5));
        int[] b = {1,1,1,1};
        System.out.println("test["+(i++)+"]:\t"+longOcc(b,1));
        int[] c = {1,1,1,1};
        System.out.println("test["+(i++)+"]:\t"+longOcc(c,5));
        int[] d = {1,3,3,2,4,4,1,4,4,4,3};
        System.out.println("test["+(i++)+"]:\t"+longOcc(d,5));
        int[] e = {1,3,3,2,4,4,1,4,4,4,3};
        System.out.println("test["+(i++)+"]:\t"+longOcc(e,2));
        int[] f = {1,3,3,2,4,4,1,4,4,4,3};
        System.out.println("test["+(i++)+"]:\t"+longOcc(f,3));
        int[] g = {1,3,3,2,4,4,1,4,4,4,3};
        System.out.println("test["+(i++)+"]:\t"+longOcc(g,4));
    }
    }