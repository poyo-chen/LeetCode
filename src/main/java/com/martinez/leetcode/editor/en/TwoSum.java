package com.martinez.leetcode.editor.en;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] solution(int[] numbers, int target) {
//        可任意順序版本
//        先給定一個空的map, 依序檢查nums陣列
//        檢查map中是否有nums的key，若有則取出它的位置(該位置表示他與target的差值)
//        若查無則將該target的差值存入map，及他的位置
//        numbers=[2,7,11,15],target=9
//        1.檢查numbers[0]=2是否出現在map，無則將[7,0]存入map，表示若陣列中有7的對應的和在位置0
//        2.檢查numbers[1]=7出現在map中，則將當前位置及該對應和的位置回傳。
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(numbers[i])) {
                return new int[]{i, map.get(numbers[i])};
            } else {
                map.put(target - numbers[i], i);
            }
        }
        return null;
    }

    public int[] solution2(int[]numbers,int target){
        //不可任意順序版本
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(target - numbers[i])) {
                result[1] = i;
                result[0] = map.get(target - numbers[i]);
                return result;
            }
            map.put(numbers[i], i);
        }
        return result;
    }
}
