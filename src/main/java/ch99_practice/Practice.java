package ch99_practice;

import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int sum = 0;
        for (int n : numbers) {
            sum+= n;
        }
        int avg = sum / numbers.length;
        return avg;
    }
}