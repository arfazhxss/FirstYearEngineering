public class Question1 {
    public static void main (String[] args) {
        int[] a = {2,2,4,5};
        System.out.println(isSorted(a));

    }
        public static boolean isSorted (int[] array) {
            int arrLen = array.length;
            int counSum = 1;
            for (int i=1;i<arrLen;i++) {
                if (array[i]>=array[i-1]) {
                    counSum++;
                }
            }
            if (counSum==arrLen) return true;
            else return false;
    }
}