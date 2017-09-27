/**
 * The following code needs a lot of TLC. So give it some!
 *
 * 1. Fix all checkstyle errors
 * 2. Determine what it does (it's going to be tough before you finish #1)
 * 3. Improve the name of the methods and variables
 * 4. Add comments and Javadoc comments where needed
 * 5. Remove unnecessary comments as appropriate
 */
public class ReclamationProject {

    /**
     * The main that can be used to text out the largestMatch method.
     * @param args unused
     */
    public static void main(final String[] args) {
        System.out.println(largestMatch("123abcdef", "abcdefghijk"));
    }

     /**
      * A method that takes two strings as an input and returns the
      * largest substring that the two strings have in common.
      * @param str1 a String taken as the input
      * @param str2 a String taken as the input
      * @return match the largest substring that the two Strings have in common
      */
    static String largestMatch(final String str1, final String str2) {
        String smaller = str1; //always shorter
        String larger = str2; //always longer
        String match = ""; //the largest matching section between the two strings

        //makes sure that larger is longer length than smaller
        if (smaller.length() > larger.length()) {
            String temp = str1;
            smaller = str2;
            larger = temp;
        }

        //goes through the all comparisons of two words
        for (int i = 0; i < smaller.length(); i++) {
            for (int j = smaller.length() - i; j > 0; j--) {
                for (int k = 0; k < larger.length() - j; k++) {
                    //checks if there is a substring that matches between the Strings
                    //checks the substring that matches is greater than the last match
                    //assigns greatest matching substring to match
                    if (smaller.regionMatches(i, larger, k, j) && j > match.length()) {
                        match = smaller.substring(i, i + j);
                    }
                }
            }
        }
        return match;
    }
}
