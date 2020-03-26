# leetcode7 两数之和 (python3)

#### get：

1.转换字符串

2.翻转字符串

#### 调bug过程：

遗漏了这一句

```
假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231,  231 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。

```

##### <一> 利用取余不断得到各个位置的数字

```python
class Solution:
    def reverse(self, x: int) -> int:   
        flag=0
        if(x<0):
            x=x*(-1)
            flag=1

        a=0
        while(x>0):
            a=a*10+x%10
            x//=10

        if(flag==1):a*=-1
        if(a>= -2**31 and a<= 2**31):return a

        return 0
```

#####  <二>转化成字符串后反转

```python
class Solution:
    def reverse(self, x: int) -> int:   
        flag=0
        if x<0:
            flag=1
            x*=-1

        a=str(x) //转成字符串
        a=a[::-1] //反转
        a=int(a)  //由于要返回int类型
        
        if flag==1:a*=-1
        if a>= -2**31 and a<= 2**31:
            return a
        return 0
```

