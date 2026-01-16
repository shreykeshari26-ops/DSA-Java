package String;

import java.util.Arrays;

public class LC242_validAnagram {
    // Valid Anagram (LeetCode 242): Sort both strings and compare characters to check if they are anagrams.
        public boolean isAnagram(String s, String t) {

            char[] ch= s.toCharArray();
            char[] bh= t.toCharArray();
            int idx1=0;
            int idx2=0;
            if(ch.length!=bh.length){
                return false;}
            if(ch.length==bh.length){
                Arrays.sort(ch);
                Arrays.sort(bh);
                while(idx1<ch.length && idx2<bh.length){
                    if(ch[idx1]!=bh[idx2]){
                        return false;

                    }
                    idx1++;
                    idx2++;
                }
            }
            return true;
        }
    }


