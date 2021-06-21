##### 函数

*不定长参数





全局函数

对于列表，默认就已经是全局了

```python
def test():
    for i in range(len(a)):a[i]=a[i]+2


a=[3,4,5]
print("before test=",a)
test()
print("after  test=",a)
```

```python
a=0
def test():
    global a
    a=a+3

def test2(a):
    a=a+9


a=2
print("before test=",a)
test()
print("after  test=",a)

test2(a)
print("after test2=",a)
```

**函数传入参数数量可变**

```python
# 在参数名前面的*表示args是一个可变参数
def add(*args):
    total = 0
    for val in args:
        total += val
    return total


# 在调用add函数时可以传入0个或多个参数
print(add())
print(add(1))
print(add(1, 2))
print(add(1, 2, 3))
print(add(1, 3, 5, 7, 9))
```

**传递参数时可以不按照设定的顺序进行传递**

```python
def count( a=10,b=20,c=3):
    return a+b**c

print(count(1,2,3))
print(count(c=3,a=1,b=2))
```
**c里的头文件，python里的 模块化管理函数**

** __name__是Python中一个隐含的变量它代表了模块的名字**

```python
# 只有被Python解释器直接执行的模块的名字才是__main__
if __name__ == '__main__':
    foo()
```

**格式化字符串**

```python
a, b = 5, 10
print(f'{a} * {b} = {a * b}')
```

##### 使用集合set 

```
# 创建集合的字面量语法
set1 = {1, 2, 3, 3, 3, 2}
print('Length =', len(set1))  //为3
# 创建集合的构造器语法(面向对象部分会进行详细讲解)
set2 = set(range(1, 10))
set3 = set((1, 2, 3, 3, 2, 1))
print(set2, set3)
# 创建集合的推导式语法(推导式也可以用于推导集合)
set4 = {num for num in range(1, 100) if num % 3 == 0 or num % 5 == 0}

set1.add(4)
set2.update([11, 12]) 
set2.discard(5)  			 //移除某指定的元素
if 4 in set2:
    set2.remove(4)
    //remove的元素在set当中没有的话会报错，而discard不会。
print(set1, set2)
print(set3.pop())
print(set3)

# 集合的交集、并集、差集、对称差运算
print(set1 & set2)
# print(set1.intersection(set2))
print(set1 | set2)
# print(set1.union(set2))
print(set1 - set2)
# print(set1.difference(set2))
print(set1 ^ set2)
# print(set1.symmetric_difference(set2))
# 判断子集和超集
print(set2 <= set1)
# print(set2.issubset(set1))
```

##### 使用字典

```python
# 创建字典的字面量语法
scores = {'骆昊': 95, '白元芳': 78, '狄仁杰': 82}
print(scores)
# 创建字典的构造器语法
items1 = dict(one=1, two=2, three=3, four=4)
# 通过zip函数将两个序列压成字典
items2 = dict(zip(['a', 'b', 'c'], '123'))
# 创建字典的推导式语法
items3 = {num: num ** 2 for num in range(1, 10)}
print(items1, items2, items3)
# 通过键可以获取字典中对应的值
print(scores['骆昊'])
print(scores['狄仁杰'])
# 对字典中所有键值对进行遍历
for key in scores:
    print(f'{key}: {scores[key]}')
# 更新字典中的元素
scores['白元芳'] = 65
scores['诸葛王朗'] = 71
scores.update(冷面=67, 方启鹤=85)
print(scores)
if '武则天' in scores:
    print(scores['武则天'])
print(scores.get('武则天'))
# get方法也是通过键获取对应的值但是可以设置默认值
print(scores.get('武则天', 60))
# 删除字典中的元素
print(scores.popitem())
print(scores.popitem())
print(scores.pop('骆昊', 100))
# 清空字典
scores.clear()
print(scores)
```

