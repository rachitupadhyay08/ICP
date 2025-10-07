package Assignment8;

import java.util.Stack;

public class Simplify_Path {
    public static void main(String[] args) {
        String path = "/a/./b/../../c/";
        System.out.println(simplifyPath(path)); 
    }

    public static String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] parts = path.split("/");

        for (String dir : parts) {
            if (dir.equals("") || dir.equals(".")) {
                continue; 
            } else if (dir.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop(); 
                }
            } else {
                stack.push(dir); 
            }
        }

        StringBuilder result = new StringBuilder();
        for (String dir : stack) {
            result.append("/").append(dir);
        }

        return result.length() == 0 ? "/" : result.toString();
    }
}
