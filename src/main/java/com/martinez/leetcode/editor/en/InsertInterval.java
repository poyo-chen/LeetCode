package com.martinez.leetcode.editor.en;

import java.util.ArrayList;
import java.util.List;

public class InsertInterval {

  // input: [[1,3],[6,9]], newInterval = [2,5]
  public int[][] insert(int[][] intervals, int[] newInterval) {
    List<int[]> result = new ArrayList<>();
    //1. 設定指針
    int[] merge = newInterval;
    //2. 若i>=intervals.length，則將merge加入result中
    if (intervals.length == 0) {
      return new int[][]{newInterval};
    }
    //3 將指針跟intervals[i]比較
    for (int[] interval : intervals) {
      //4. 若無交集，則不需合併，將merge加入result中，並替換指針為下一個區間
      if (merge[1] < interval[0]) {
        result.add(merge);
        merge = interval;
      } else if (merge[0] <= interval[1]) {
        //5. 若有交集，則合併
        merge[0] = Math.min(merge[0], interval[0]);
        merge[1] = Math.max(merge[1], interval[1]);
      } else {
        //6. 若無交集，則不需合併，且尚未到達指針，將intervals[i]加入result中
        result.add(interval);
      }
    }
    result.add(merge);
    //8. 回傳intervals
    return result.toArray(new int[result.size()][]);
  }
}
