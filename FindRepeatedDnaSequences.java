public class FindRepeatedDnaSequences {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> result = new ArrayList<>();
        if (s.length() < 10) {
            return result;
        }
        HashMap<String, Integer> map = new HashMap<>();
        int i = 0;
        while (i < s.length()) {
            if (i + 10 > s.length()) {
                break;
            }
            String str = s.substring(i, i+10);
            if (map.containsKey(str)) {
                if (map.get(str) == 1) {
                    result.add(str);
                }
                int value = map.get(str);
                map.put(str, value+1);
            } else {
                map.put(str, 1);
            }
            i++;
        }
        return result;
    }
}
