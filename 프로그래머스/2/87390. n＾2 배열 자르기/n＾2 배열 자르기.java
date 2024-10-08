import java.util.*;

class Solution {
    public int[] solution(int n, long left, long right) {
        int len = (int) (right - left + 1);
        int[] answer = new int[len];
        int cnt = 0;

        for (long i = left; i <= right; i++) {
            answer[cnt] = (int) (Math.max(i / n, i % n) + 1);
            cnt++;
        }

        return answer;
    }
}