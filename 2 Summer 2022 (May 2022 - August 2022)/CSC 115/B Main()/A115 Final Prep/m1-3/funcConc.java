public class funcConc {
    public static int func (int[] arr, int val) {
        int repNum=0;
        int max=0;
        if (arr.length!=0) {
            for (int i=1; i<arr.length; i++) {
                if ((arr[i]==val)&&(arr[i-1]==val)) {++repNum;}
                else if ((arr[i]!=val)&&(arr[i-1]==val)) {
                    ++repNum;
                    if (repNum>max) {
                        max=repNum;
                    }
                    repNum=0;
                }
            }
        } return max;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,2,2,33,3,3,3,4,4,5,5,5,4,4,4,6,4,4,6,6,6,4,7,6,4,4,4};
        System.out.println(func(arr, 4));
    }
}