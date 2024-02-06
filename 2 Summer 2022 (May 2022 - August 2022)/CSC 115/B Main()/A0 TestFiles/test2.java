public class test2 {
    public static void main (String[] args) {
        int[] array = {2};
        String result = "{";
        if (array.length == 0) {
            result += "}";
        } else if (array.length == 1) {
            result += array[0] + "}";
        } else if (array.length >= 1) {
            for(int i=0; i<(array.length); i++) {
                result += array[i];
                if (i==array.length-1) {
                    break;
                }
                result+=",";
            }
        }
        result += "}";
        System.out.println("String: "+result);
    }
}
