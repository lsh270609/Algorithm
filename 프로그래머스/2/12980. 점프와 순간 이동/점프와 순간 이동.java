class Solution {
    public int solution(int n) {
        int ans = 0;

        while (n >= 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                ans++;
                n -= 1;
            }
        }

        return ans;
    }
}