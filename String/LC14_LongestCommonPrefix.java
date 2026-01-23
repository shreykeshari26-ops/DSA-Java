package String;

public class LC14_LongestCommonPrefix {

        public String longestCommonPrefix(String[] strs) {

            // edge case
            if (strs.length == 0) return "";

            int idx = 0;
            StringBuilder result = new StringBuilder();

            // outer loop for index
            while (idx < strs[0].length()) {

                // inner loop to compare all strings
                for (int i = 1; i < strs.length; i++) {

                    // index out of bounds OR mismatch
                    if (idx >= strs[i].length() ||
                            strs[i].charAt(idx) != strs[0].charAt(idx)) {
                        return result.toString();
                    }
                }

                // all strings matched at idx
                result.append(strs[0].charAt(idx));
                idx++;
            }

            return result.toString();
        }
    }


