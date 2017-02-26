public class GroupAnagrams {
    
    private String makeKey(String s) {
        char[] characterArray = s.toCharArray();
        Arrays.sort(characterArray);
        return new String(characterArray);
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        if (strs.length == 0) {return result;}
        Map<String , List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            String s = makeKey(strs[i]);
            if (!map.containsKey(s)) {
                map.put(s, new ArrayList<>());
            }
            map.get(s).add(strs[i]);
        }
        for (String s : map.keySet()) {
            result.add(map.get(s));
        }
        return result;
    }
}
