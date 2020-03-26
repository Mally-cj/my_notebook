# leetcode0215 找数组中的第k个最大元素

<一>快速选择

[原理参见leedcode官方题解](https://leetcode-cn.com/problems/kth-largest-element-in-an-array/solution/shu-zu-zhong-de-di-kge-zui-da-yuan-su-by-leetcode/)

时间复杂度 : 平均情况 $O(N)$，最坏情况 $O(N^2)$。

空间复杂度 : $O(1)$。

执行用时 :140 ms, 在所有 Python3 提交中击败了31.22% 的用户

内存消耗 :14.1 MB, 在所有 Python3 提交中击败了52.42%的用户

```python
class Solution:
    def findKthLargest(self, nums, k):
        def partition(left, right, pivot_index):
            pivot=nums[pivot_index]
            nums[pivot_index],nums[right]=nums[right],nums[pivot_index]
            a = left  #保证a左边的都是大于pivot的

            for i in range(left, right):
                if nums[i] > pivot:
                    nums[a],nums[i]=nums[i],nums[a]
                    a+=1

            nums[a],nums[right]=nums[right],nums[a]
            return  a

        def select(left:int, right:int, k_smallest):
            if left==right:return nums[left]
            index=random.randint(left,right)
            index= partition(left,right,index)

            if index ==k_smallest: return nums[index]
            if index < k_smallest: return select(index+1,right,k_smallest)
            if index > k_smallest : return  select(left,index-1,k_smallest)
        return select(0,len(nums)-1,k-1)


```



<二>用sort全排

时间复杂度：$O（ N log_2 N)$

执行用时 :60 ms, 在所有 Python3 提交中击败了96.95% 的用户

内存消耗 :14 MB, 在所有 Python3 提交中击败了52.96%的用户

```python
class Solution:
    def findKthLargest(self, nums: List[int], k: int) -> int:
        nums.sort()
        tt=len(nums)
        return nums[tt-k]
```

<三> 自定义sort排序规则

执行用时 :92 ms, 在所有 Python3 提交中击败了48.58% 的用户

内存消耗 :14 MB, 在所有 Python3 提交中击败了52.85%的用户

```python
import functools
class Solution:
    def findKthLargest(self, nums: List[int], k: int) -> int:
      def cmp(a, b):
        if b < a: return -1
        if a < b:return 1
        return 0

      nums=sorted(nums,key=functools.cmp_to_key(cmp))
      return nums[k-1]
```

<四>用heapq的模块化函数

执行用时 :68 ms, 在所有 Python3 提交中击败了91.53% 的用户

内存消耗 :14.1 MB, 在所有 Python3 提交中击败了52.63%的用户

时间复杂度 : $O(Nlog_2⁡k)$。

空间复杂度 : $O(k)$，用于存储堆元素。

```python
class Solution:
    def findKthLargest(self, nums, k):
        
        return heapq.nlargest(k, nums)[-1]

```
