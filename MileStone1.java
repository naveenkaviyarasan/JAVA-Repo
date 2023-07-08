public class Solution {
    public String multiply(String num1, String num2) {
        int n1 = num1.length();
        int n2 = num2.length();
        int[] result = new int[n1 + n2];

        // Step 2
        StringBuilder sb1 = new StringBuilder(num1).reverse();
        StringBuilder sb2 = new StringBuilder(num2).reverse();

        // Step 3
        for (int i = 0; i < n2; i++) {
            int digit2 = sb2.charAt(i) - '0';
            int carry = 0;
            for (int j = 0; j < n1; j++) {
                int digit1 = sb1.charAt(j) - '0';

                // Multiply digit1 with digit2 and add carry
                int temp = result[i + j] + digit1 * digit2 + carry;

                // Update carry and result
                carry = temp / 10;
                result[i + j] = temp % 10;
            }

            // Add the remaining carry if any
            if (carry > 0) {
                result[i + n1] += carry;
            }
        }

        // Step 4
        StringBuilder product = new StringBuilder();
        for (int i = n1 + n2 - 1; i >= 0; i--) {
            product.append(result[i]);
        }

        // Step 5
        while (product.length() > 1 && product.charAt(0) == '0') {
            product.deleteCharAt(0);
        }

        // Step 7
        return product.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.multiply("2", "3"));  // Output: "6"
        System.out.println(solution.multiply("123", "456"));  // Output: "56088"
    }
}
