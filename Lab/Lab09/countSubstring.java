package Lab.Lab09;

public class countSubstring {
  public static void main(String[] args) {
    System.out.println(countSubstring("aabaa", "aa")); // Output: 2
    System.out.println(countSubstring("abcdef", "xyz")); // Output: 0
    System.out.println(countSubstring("abababab", "ab")); // Output: 4
    System.out.println(countSubstring("abcabcabc", "abc")); // Output: 3
    System.out.println(countSubstring("banana", "na")); // Output: 2
    System.out.println(countSubstring("thisisjustatest", "test")); // Output: 1
    System.out.println(countSubstring("ababa", "ab")); // Output: 2
    System.out.println(countSubstring("aaa", "a")); // Output: 3
    System.out.println(countSubstring("aaaaa", "aaa")); // Output: 3
  }

  // use .substring .length .equals
  public static int countSubstring(String str1, String str2) {
    // Base case
    if (str1.length() < str2.length()) return 0;
    // If match: return 1 + recursive call
    if (str2.equals(str1.substring(0, str2.length()))) return 1 + countSubstring(str1.substring(1), str2);
    // If no match: return recursive call
    else return countSubstring(str1.substring(1), str2);
  }
}
