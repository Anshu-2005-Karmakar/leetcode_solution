import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> mp = new HashMap<>();

        for (String s : strs) {
            String key = sortString(s);

            if (!mp.containsKey(key)) {
                mp.put(key, new ArrayList<>());
            }

            mp.get(key).add(s);
        }

        return new ArrayList<>(mp.values());
    }

    private String sortString(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}