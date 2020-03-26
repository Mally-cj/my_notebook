# python基础练习

### Exercise 1: for

**题目：**有四个数字：1、2、3、4，能组成多少个互不相同且无重复数字的三位数？各是多少？

**题解：**

用列表实现木桶法

```python
# 2020.2.4
use=[None]*1000
ans=0
for i in range (1,5):
    for d in range (1,5):
        for k in range (1,5):
            if (i!=d)  and (k!=d) and i!=k :
                now=i*100+d*10+k*1
                if(use[now]==None):
                        ans+=1
                        use[now]=1
                        print(ans,":",now)
```

### Exercise 2:多维列表

**题目:**有8个数字：1到7，选3个数字会有多少种组合？

**题解：**

```python
# 2020.2.4
big=9
use = [[[0 for a in range(big)] for b in range(big) ]for c in range(big)]
for i in range (1,big):
    for d in range (i+1,big):
        for k in range (d+1,big):
            if i!=d  and k!=d and i!=k and use[i][d][k]==0 :
                use[i][d][k]=1
                print(i,d,k)
```

### Exercise 3: while

**题目：**一个整数，它加上100后是一个完全平方数，再加上168又是一个完全平方数，请问该数是多少？

**题解：**

假设一个数加上100后为$x^2$，则$x^2$加上168后为 $ (x+c)^2$ 。枚举一个数

```python
#2020.2.4

a=10
while 1:
    suc=0
    for i in range(1,10):
        if (a+i)*(a+i)==a*a+168:
            suc=1
            break
    if(suc==1):
        print("answer=",a*a-100)
        break
    a=a+1
```

### Exercise 4: 判斷第几天

**题目：**输入某年某月某日，判断这一天是这一年的第几天？

**题解：**

```python
#2020.2.4

year=int(input("year="))
mon=int(input("month="))
day=int(input("day="))

month=[0,31,27,31,30,31,30,31,31,30,31,30,31]

if year%400==0 or year%100==0 and year%4==0:month[2]=28
ans=day
for i in range(1,mon):
    ans+=month[i]

print('%d,%d,is the %d day of year %d'%(mon,day,ans,year))
```

### Exercise 5: gcd 和lcf

**题目：**输入某年某月某日，判断这一天是这一年的第几天？

**题解：**

```python
#2020.2.4
def gcd(x,y):
    if x%y==0:return y
    return gcd(y,x%y)

def lcf(x,y):
    return x*y/gcd(x,y)
if __name__=='__main__':
    x=9
    y=3
    print("gcd=%d,  lcf=%d"%(gcd(x,y),lcf(x,y)))
```

### Exercise 6: 区分// 和 /

**题目：**实现判断一个数是不是回文数的函数。

**题解：**

```c++
#2020.2.4
#实现判断一个数是不是回文数的函数。

def is_palindrome(a):
    c=a
    b=0
    while(c>0):
        b=b*10+c% 10
        c//=10                # 卡顿处，此处原本写c/=10,但是会把它变成double
        #print("c=",c)	#可以改成/，再把这去注释看看，为什么不能写/=
    return a==b

if __name__ == '__main__':
    x=99
    if is_palindrome(x):print(x," is palindrome")
    else: print(x," isn't palindrome")
```

### Exercise 7: 使用yield

**题目：**生成斐波拉切数列

**题解：**

<一>普通写法 

有经验的开发者会指出，直接在 fab 函数中用 print 打印数字会导致该函数可复用性较差，因为 fab 函数返回 None，其他函数无法获得该函数生成的数列。

```python
def fib(n):
    a=0
    b=1
    for i in range(n):
        a,b=b,a+b
        print(a)

if __name__ == '__main__':
    fib(20)
```

<二>用yield做成斐波拉切数列的生成器

```python
def fib(n):
    a=0
    b=1
    for i in range(n):
        a,b=b,a+b
        yield (a)

if __name__ == '__main__':
    for i in fib(6):
        print(i)
```

### Exercise 8: 跑马灯

**题目：**在屏幕上显示跑马灯文字。

**题解：**

```
import os
import time


def main():
    content = '北京欢迎你为你开天辟地…………'
    while True:
        # 清理屏幕上的输出
        os.system('cls')  # os.system('clear')
        print(content)
        # 休眠200毫秒
        time.sleep(0.2)
        content = content[1:] + content[0]


if __name__ == '__main__':
    main()
```

### Exercise 9: 生成验证码

**题目：**设计一个函数产生指定长度的验证码，验证码由大小写字母和数字构成

**题解：**

```c++
import random
def generate(code_len=4):
    all_chars = '0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ'
    tt = len(all_chars)
    list=''
    for i in range (code_len):
       list+=(all_chars[random.randint(0,tt)])
    return  list

if __name__ == '__main__':
    print(generate(9))
```

### Exercise 10: 获取文件后缀名

**题目：**设计一个函数产生指定长度的验证码，验证码由大小写字母和数字构成

**题解：

```
def get_suffix(filename, has_dot=False):
    """
    获取文件名的后缀名

    :param filename: 文件名
    :param has_dot: 返回的后缀名是否需要带点
    :return: 文件的后缀名
    """
    pos = filename.rfind('.')
    if 0 < pos < len(filename) - 1:
        if has_dot==0:  pos +=1
        index=pos
        return filename[index:]
    else:
        return ''


if __name__ == '__main__':
    ff='ch2.md'
    print(get_suffix(ff,0))
```

