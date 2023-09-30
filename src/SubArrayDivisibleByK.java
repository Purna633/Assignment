
import java.util.HashMap;
import java.util.Map;
public class SubArrayDivisibleByK {
        public static int SubArrayDivisibleByK(int[] A, int K) {
            int prefixSum = 0;
            int count = 0;
            Map<Integer, Integer> hashMap = new HashMap<>();
            // Initialize with one 0 remainder
            hashMap.put(0, 1);

            for (int i = 0; i < A.length; i++) {
                prefixSum += A[i];
                // Calculate positive remainder
                int remainder = (prefixSum % K + K) % K;

                if (hashMap.containsKey(remainder)) {
                    count += hashMap.get(remainder);
                }

                hashMap.put(remainder, hashMap.getOrDefault(remainder, 0) + 1);
            }

            return count;
        }

        public static void main(String[] args) {
            int[] A = {4, 5, 0, -2, -3, 1};
            int K = 5;
            int result = SubArrayDivisibleByK(A, K);
            System.out.println("Output: " + result);
        }

}
