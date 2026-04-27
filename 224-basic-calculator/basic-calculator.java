import java.util.*;

public class Solution {
  
    public static void main(String[] args) {
        Solution sol = new Solution();
        String expression = "1 + (2 + 3) - 4";
        System.out.println("Result: " + sol.calculate(expression));
    }

    public int calculate(String s) {
        int[] index = new int[1];
        return helper(s.toCharArray(), index);
    }

    private int helper(char[] arr, int[] index) {
        int sum = 0;
        int operator = 1;

        while (index[0] < arr.length) {
            char curr = arr[index[0]];

            if (curr == ' ') {
                index[0]++;
                continue;
            }

            if (curr == '(') {
                index[0]++;
                sum += operator * helper(arr, index);
            } else if (curr == '-') {
                operator = -1;
            } else if (curr == '+') {
                operator = 1;
            } else if (curr == ')') {
                break;
            } else if (Character.isDigit(curr)) {
                long val = 0;
                while (index[0] < arr.length && Character.isDigit(arr[index[0]])) {
                    val = val * 10 + (arr[index[0]] - '0');
                    index[0]++;
                }
                sum += (int)val * operator;
                index[0]--;
            }
            index[0]++;
        }
        return sum;
    }
}