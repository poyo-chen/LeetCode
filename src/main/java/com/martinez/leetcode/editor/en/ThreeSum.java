package com.martinez.leetcode.editor.en;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

  public List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    //1. 先排序
    Arrays.sort(nums);

    for (int i = 0; i < nums.length && nums[i] <= 0; i++) {
      // 2. 若nums[i]>0，則跳出迴圈
      if (i > 0 && nums[i] == nums[i - 1]) {
        continue;
      }
      //3. 檢查nums[i]+nums[left]+nums[right]是否為0
      twoSum(i, nums, result);
    }
    //9. 回傳list
    return result;
  }

  private void twoSum(int i, int[] nums, List<List<Integer>> result) {
    //4. 設定指針
    int left = i + 1, right = nums.length - 1;
    while (left < right) {
      int sum = nums[i] + nums[left] + nums[right];
      if (sum > 0) {
        //5. 若nums[i]+nums[left]+nums[right]>0，則right--
        right--;
      } else if (sum < 0) {
        //6. 若nums[i]+nums[left]+nums[right]<0，則left++
        left++;
      } else {
        //7. 若nums[i]+nums[left]+nums[right]==0，則將nums[i]+nums[left]+nums[right]加入result中
        result.add(Arrays.asList(nums[i], nums[left], nums[right]));
        //8. 若nums[i]+nums[left]+nums[right]==0，則left++，且nums[left]不可重複
        left++;
        while (left < right && nums[left] == nums[left - 1]) {
          left++;
        }
      }
    }
  }
}
