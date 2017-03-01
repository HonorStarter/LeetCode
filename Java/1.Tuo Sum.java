//2017年春节做的第一道题，一切重新开始！
/*题目：求数组中两数之和等于target的，返回数组
Given nums = [2, 7, 11, 15], target = 9,
Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].*/

//我的答案：
public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for(int i=0;i<nums.length;i++)
        {
        	for(int j=nums.length-1;j>i;j--)
        	{
        		if( nums[i]+nums[j] == target)
        		{
        			result[0] = i;
        			result[1] = j;
        			return result;
        		}
        	}
        }
		return null;
    }
//好的解法

public class Solution {
    public int[] twoSum(int[] numbers, int target) {
    int[] result = new int[2];
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    for (int i = 0; i < numbers.length; i++) {
        if (map.containsKey(target - numbers[i])) {
            result[1] = i ;
            result[0] = map.get(target - numbers[i]);
            return result;
        }
        map.put(numbers[i], i);
    }
    return result;
  }
}
//是每遍历一个就放在Map里，遍历一遍就足够，完全的用空间换时间
