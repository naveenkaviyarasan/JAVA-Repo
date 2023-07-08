public class Solution {
    public String multiply(String num1, String num2) {
        int n1 = num1.length();
        int n2 = num2.length();
        int[] result = new int[n1 + n2];

        StringBuilder sb1 = new StringBuilder(num1).reverse();
        StringBuilder sb2 = new StringBuilder(num2).reverse();

        for (int i = 0; i < n2; i++) {
            int digit2 = sb2.charAt(i) - '0';
            int carry = 0;
            for (int j = 0; j < n1; j++) {
                int digit1 = sb1.charAt(j) - '0';

                int temp = result[i + j] + digit1 * digit2 + carry;

                carry = temp / 10;
                result[i + j] = temp % 10;
            }

            if (carry > 0) {
                result[i + n1] += carry;
            }
        }

        StringBuilder product = new StringBuilder();
        for (int i = n1 + n2 - 1; i >= 0; i--) {
            product.append(result[i]);
        }

        while (product.length() > 1 && product.charAt(0) == '0') {
            product.deleteCharAt(0);
        }

        return product.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.multiply("2", "3"));  
        System.out.println(solution.multiply("123", "456"));  
    }
}
