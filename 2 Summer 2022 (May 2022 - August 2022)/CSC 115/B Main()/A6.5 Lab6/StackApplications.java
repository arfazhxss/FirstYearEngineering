public class StackApplications {

    /*
     * Purpose: determines whether every '(' bracket
     *  in str is matched with a following ')'
     * Parameters: String str - the String check
     * Returns: boolean - true if brackets are matched, false otherwise
     */
    public static boolean doBracketsMatch(String str) {
        StackArrayBased testString = new StackArrayBased();

        for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '(') {
                    testString.push('(');
                }
                else if (str.charAt(i) == ')') {
                        if (testString.isEmpty()) {
                                return false;
                        } else testString.pop();
                }
        }
        
        return testString.isEmpty();
    }
}