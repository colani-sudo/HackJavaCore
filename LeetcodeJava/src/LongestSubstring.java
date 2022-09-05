import java.lang.Math;

public class LongestSubstring {

        public int lengthOfLongestSubstring(String s) {
            int maxLength = 0;
            int j, i = 0;
            while(i<s.length()){
                boolean[] checked = new boolean[256];
                j=i;
                while(j < s.length() && checked[s.charAt(j)] == false){
                    maxLength = Math.max(maxLength, (j-i+1));
                    checked[s.charAt(j)] = true;
                    j=j+1;
                }
                checked[s.charAt(i)] = false;
                i++;
            }
            return maxLength;
        }
    }

