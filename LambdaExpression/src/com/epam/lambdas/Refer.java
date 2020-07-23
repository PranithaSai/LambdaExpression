package com.epam.lambdas;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
public class Refer {
	public static void main(String[] args) {
        List<String> Li = Arrays.asList("abab","aaaa","accca","abcdef","abccba","abdc","zzxyxzz");
        List<String> palindromes = Refer.findPalindrome(Li, (stri) -> Refer.isPalindrome((String) stri));
 
        System.out.println("Palindromes are " + palindromes);
    }
 
    public static boolean isPalindrome(String stri) {
      StringBuffer s =new StringBuffer();
      for(int i = stri.length()-1; i >= 0 ; i--) {
      s = s.append(stri.charAt(i));
      }
      if(stri.equalsIgnoreCase(s.toString())) {
        return true;
      } else {
        return false;
      }
        } 
    public static List<String> findPalindrome(List<String> list, Predicate<String> predicate) { 
      List<String> sorted = new ArrayList<String>(); 
      list.stream().filter((i) -> (predicate.test((String) i))).forEach((i) -> {sorted.add((String) i);});
        return sorted;
 
    }

}
