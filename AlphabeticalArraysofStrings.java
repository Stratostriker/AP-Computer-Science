public class AlphabeticalArraysofStrings {
    public static void main(String[] args) {
        //test code
        String[] test1 = {"A", "car", "drove", "fast"};
        System.out.println(isAlphabetical(test1));
        String[] test2 = {"A", "cat", "ran", "fast"};
        System.out.println(isAlphabetical(test2));
        String[] test3 = {"He", "read", "4", "words"};
        System.out.println(isAlphabetical(test3));
        String[] test4 = {"I'm", "really", "Really", "tired"};
        System.out.println(isAlphabetical(test4));
        String test5[] = {"tomato"};
        System.out.println(isAlphabetical(test5));
        String test6[] = {};
        System.out.println(isAlphabetical(test6));
    }
    public static boolean isAlphabetical(String[] words) {
        //loops through the string array
        for (int i = 0; i < words.length - 1; i++) {
            //compares each word in the string array to the next word
            if (words[i].compareToIgnoreCase(words[i + 1]) > 0) {
                //returns false if the string are not in ascending order
                return false;
            }
        }
        //returns true if all string are in ascending order
        return true;
    }
}