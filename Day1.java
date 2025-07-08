import java.util.Arrays;

public class Day1 {
    // LeetCode 2595: https://leetcode.com/problems/number-of-even-and-odd-bits
    public int[] evenOddBit(int n) {
        int even = 0, odd = 0;
        int pos = 0;

        while (n > 0) {
            if ((n & 1) == 1) {
                if (pos % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }
            n >>= 1;
            pos++;
        }

        return new int[]{even, odd};
    }

    public static void main(String[] args) {
        Day1 d = new Day1();
        System.out.println(Arrays.toString(d.evenOddBit(17))); // Output: [2, 0]
    }
}
