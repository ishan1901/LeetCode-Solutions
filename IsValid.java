public class IsValid {
    public boolean isValid(String s) {
        char[] brackets = s.toCharArray();
        if (s.length() % 2 != 0) {
            return false;
        }  
        Deque<Character> stack = new ArrayDeque<>();
        for (char c : brackets) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
                continue;
            }
            if (stack.isEmpty()) {return false;}
            if (c == ')' && stack.pop() != '(') {return false;}
            if (c == '}' && stack.pop() != '{') {return false;}
            if (c == ']' && stack.pop() != '[') {return false;}
        }
        return stack.isEmpty();
    }
}
