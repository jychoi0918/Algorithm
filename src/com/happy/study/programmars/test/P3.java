package com.happy.study.programmars.test;

import java.util.Arrays;
import java.util.HashMap;

public class P3 {
//    [[4, 3], [3, 1], [2, 2], [1, 4]]
public int solution(int N, int[][] trees) {


    HashMap<Integer,Integer> hm = new HashMap<>();

    int [] num = new int [trees.length];


    int min=0;
    int x = 0;
    for (int[] tree : trees) {

        num[x++]=tree[0];
        hm.put(tree[0],tree[1]);

    }
    Arrays.sort(num);
    min=num[0];
    int cnt = 1;
    for (int i = 1; i < trees.length ; i++) {
        if(hm.get(num[i])<min){
            min=hm.get(num[i]);
             cnt++;
        }


    }




    int answer = cnt;
    return answer;
}

}
/*
    A 시는 N x N 크기의 정사각형 모양의 격자로 이루어져 있습니다. 이 시의 (0, 0) 위치의 격자 칸에는 공사장이 있으며, 몇몇 격자 칸에는 나무가 심겨 있습니다. 이때, 서로 다른 두 나무가 가로 또는 세로 방향으로 같은 선상에 있지 않습니다. A 시에서는 무분별한 공사 확장을 막기 위해 그린벨트를 지정하여 모든 나무를 보호하려 합니다. 그린벨트의 경계선은 다음 규칙에 따라 지정합니다.

        그린벨트 경계선의 시작 지점은 A 시의 북쪽 또는 서쪽 경계지점에 있는 격자 선들의 교차점 중 하나입니다.
        그린벨트 경계선의 시작 지점부터 남쪽, 혹은 동쪽 방향으로만 격자 선을 따라 이동하면서 그린벨트 경계선을 지정합니다.
        그린벨트 경계선의 끝 지점은 A 시의 동쪽 또는 남쪽 경계지점에 있는 격자 선들의 교차점 중 하나입니다.
        그린벨트 경계선은 하나만 지정하며, 그린벨트 경계선을 기준으로 A 시를 두 지역으로 나누었을 때, 나무들이 속한 지역의 전체 격자 칸이 그린벨트가 됩니다.
        A 시에 있는 모든 나무가 그린벨트 안에 들어가야 하며, 그린벨트로 지정되는 면적은 최소가 되어야 합니다.
        예를 들어 A 시가 다음과 같이 5 x 5 모양일 때,

        green-belt1

        위 규칙에 따라 경계선을 그리면 다음과 같이 그린벨트가 지정됩니다.

        green-belt2

        이때, 나무가 심겨있는 격자 칸 중 몇 개는 그린벨트 경계선과 맞닿아있게 됩니다. 위 예시에서는 ②, ③, ④번 나무가 심겨있는 격자 칸이 경계선에 맞닿아있습니다.

        A시의 크기 N과 나무들의 위치정보가 들어있는 2차원 배열 trees가 매개변수로 주어질 때, 규칙에 따라 그린벨트의 경계선을 지정했을 경우, 나무가 심겨있는 격자칸 중 경계선과 맞닿아 있는 격자칸의 개수를 return 하도록 solution 함수를 완성해주세요.

        제한사항
        N은 A 시의 한 변의 길이를 나타내며, A 시는 N x N 크기의 정사각형 모양의 격자입니다.
        N은 2 이상 100,000 이하의 자연수입니다.
        trees는 나무들의 위치 정보가 [가로 방향, 세로 방향] 순으로 들어있는 2차원 배열입니다.
        나무의 개수는 1 이상 N 이하입니다.
        서로 다른 두 나무가 가로 혹은 세로 방향으로 같은 선상에 위치한 경우는 주어지지 않습니다.
        즉, 모든 나무의 가로 좌표는 서로 다르며, 모든 나무의 세로 좌표도 서로 다릅니다.
        입출력 예
        N   trees   result
        5   [[4, 3], [3, 1], [2, 2], [1, 4]]   3
        5   [[3, 3], [2, 2], [1, 1]]   1
        입출력 예 설명
        입출력 예 #1
        문제의 예시와 같습니다.

        입출력 예 #2
        아래 그림과 같이 ③번 나무만 경계선에 맞닿아 있습니다.
*/
