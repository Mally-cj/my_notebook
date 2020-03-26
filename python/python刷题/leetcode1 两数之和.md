# leetcode1 两数之和 

#### get：
 学会用字典

#### 思路：
用字典，第一遍把所有数据都存在字典里，就算有重复的，字典记录的也是最后出现的那个。

#### 调bug过程：

   1.    j=dict.get(target-a)，此处原本写的是j=dict[target-a],

         会在这个数据上  [2,5,5,11] 10  开始报错。

```
class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        tt=len(nums)
        dict={}
        for i in range (0,tt):
            dict[nums[i]]=i

   
        for i in range (0,tt-1):
            a=nums[i]
            j=dict.get(target-a)
            if(j!=None and j!=i):
                return [i,j]
                break

```

