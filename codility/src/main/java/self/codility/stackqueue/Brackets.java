package self.codility.stackqueue;

import java.util.Stack;

public class Brackets {

    public int solution(String s) {

        int retVal = 1;
        char[] charArray = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        char tmp;
        for (int index = 0; index < charArray.length; index++) {
            if (charArray[index] == '(' || charArray[index] == '[' || charArray[index] == '{') {
                stack.push(charArray[index]);
            } else if (charArray[index] == ')' || charArray[index] == ']' || charArray[index] == '}') {
                if (stack.size() > 0) {
                    tmp = stack.pop();
                    if (!properlyChar(tmp , charArray[index])){
                        retVal = 0;
                        break;
                    }
                }else {
                    retVal = 0;
                    break;
                }
            }
        }
        if (stack.size() > 0){
            retVal = 0;
        }
        return retVal;

    }

    private boolean properlyChar(char a, char b) {
        boolean retVal = false;
        if ((a == '(' && b == ')') || (a == '{' && b == '}') || (a == '[' && b == ']')) {
            retVal = true;
        }
        return retVal;
    }
}
