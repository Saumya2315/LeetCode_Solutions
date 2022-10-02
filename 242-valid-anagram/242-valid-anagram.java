class Solution {
    public boolean isAnagram(String s, String t) {
        int[] count = new int[128];
        if (s.length() != t.length())
            return false;
        for (final char c : s.toCharArray()){
                      ++count[c];
        }
        for (final char c : t.toCharArray()){
          if (--count[c] < 0)
            return false;
        }
    return true;
    }
}