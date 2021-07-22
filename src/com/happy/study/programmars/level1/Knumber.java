package com.happy.study.programmars.level1;

import java.util.Arrays;

public class Knumber {
    //array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을 때, k번째에 있는 수
    //2차원 배열 commands가 매개변수로 주어질 때
    // 2번째부터 5번째까지 자른뒤 정렬 후 3번째
    // i = 2, j = 5, k = 3

    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int[]temp = Arrays.copyOfRange(array,commands[i][0]-1,commands[i][1]);
            Arrays.sort(temp);
            answer[i] = temp[commands[i][2]-1];
        }
        return answer;
    }
}

// Arrays.copyOfRange
// Arrays.sort()