package com.happy.study.programmars.test;

import java.util.Arrays;

public class P1 {

    //매달 k 일은 아파트 관리비를 내는 날입니다.
    // 만약 그달의 k 일이 주말(토요일, 일요일)이라면 관리비는 k 일로부터 가장 가까운 평일 납부
    //1월 1일에 해당하는 요일 day와 매달 관리비를 내야 하는 날짜 k가 매개변수로 주어질 때,
    // 그해의 1월부터 12월까지 매달 k 일이 평일이면 0을, 주말이면 1을 순서대로 배열에 담아 return
    //월요일: 0, 화요일: 1, 수요일: 2, 목요일: 3, 금요일: 4, 토요일: 5, 일요일: 6
    //k는 1 이상 28 이하의 자연수입니다.

    //며칠인지에 따라 요일
    public String solution(int day, int k) {
        int[] answer = new int[12];
        //12번 돌리기
        int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int cntDate = 0;
        int today;
        int x = 0;

        //7로 나누어 요일찾기

        for (int i = 0; i < month.length ; i++) {

            if(i==0) {
                cntDate = k-1 + day;
            }else{
                cntDate +=month[i-1];
            }

           today = cntDate % 7;

            if(today==5||today==6){
                answer[x++]=1;
            } else {
                answer[x++]=0;
            }

        }


        return Arrays.toString(answer);
    }

    public static void main(String[] args) {
        P1 p1 = new P1();
        System.out.println( p1.solution(0,1));

    }
}
