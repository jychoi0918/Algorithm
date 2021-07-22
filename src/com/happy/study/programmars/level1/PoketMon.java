package com.happy.study.programmars.level1;

import java.util.HashSet;

public class PoketMon {
    //1. N/2마리 포켓몬 가질수 있다.
    //2. 같은 종류 폰케몬 같은 번호
    //3. N마리 폰켓몬의 종류 번호가 담긴 배열 nums가 매개변수로 주어질 때,
    // N/2마리의 폰켓몬을 선택하는 방법 중,
    // 가장 많은 종류의 폰켓몬을 선택하는 방법을 찾아,
    // 그때의 폰켓몬 종류 번호의 개수를 return

    public int solution(int[] nums) {
        HashSet<Integer> numbers = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            numbers.add(nums[i]);
        }

        if(numbers.size()>nums.length/2){
            return nums.length/2;
        }

        return numbers.size();
    }
}

 // set은 순서 X,  중복 X  따라서 중복값 제거시 유리!