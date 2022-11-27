import java.util.Stack;

boolean checkPalindrom(String input) {
    char[] c = input.toCharArray();
    Stack<Character> s = new Stack<>();
    s.push(' ');
    boolean isEven = input.length() % 2 == 0;

    for(int i = 0; i < (isEven ? c.length / 2 : c.length / 2 - 1); i++) {
        s.push(c[i]);
    }   

    for(int i = c.length / 2; i < c.length; i++) {
        if(s.peek() == c[i]) s.pop();
    }   

    if(s.peek() == ' ') return true;
    return false;
}
