numpy的使用

## 参考博文

[传送门1](https://www.runoob.com/numpy/numpy-ndarray-object.html)：https://www.runoob.com/numpy/numpy-ndarray-object.html

[numpy中文手册2017版](https://yiyibooks.cn/xx/NumPy_v111/user/index.html)：https://yiyibooks.cn/xx/NumPy_v111/user/index.html

numpy的部分详细翻译：https://blog.csdn.net/qq_38963607/article/details/82773163

NumPy(Numerical Python) 是 Python 语言的一个扩展程序库，支持大量的维度数组与矩阵运算，此外也针对数组运算提供大量的数学函数库



## 基本概念

- NumPy的数组类被称作ndarray。通常被称作数组
- axes叫轴，是numpy的维度，比如[1,2,3]是1维，它这个维度的长度是3，矩阵就是2维的。
- rank叫秩， 描述轴的个数
- ndarray.ndim 是数组轴的个数，即秩
- ndarray.itemsize是数组中每个元素的字节大小

##### 打印数组
 当你打印一个数组，NumPy以类似嵌套列表的形式显示它，但是呈以下布局：

  最后的轴从左到右打印， 次后的轴从顶向下打印，剩下的轴从顶向下打印，每个切片通过一个空行与下一个隔开

```
	>>> a = arange(6)                         # 1d array
	>>> print a
	[0 1 2 3 4 5]
	>>>
	>>> b = arange(12).reshape(4,3)           # 2d array
	>>> print b
	[[ 0  1  2]
	 [ 3  4  5]
	 [ 6  7  8]
	 [ 9 10 11]]
	>>>
	>>> c = arange(24).reshape(2,3,4)         # 3d array
	>>> print c
	[[[ 0  1  2  3]
	  [ 4  5  6  7]
	  [ 8  9 10 11]]
	 
	 [[12 13 14 15]
	  [16 17 18 19]
	  [20 21 22 23]]]
```



## 创建数组

```
x=np.ones([3,2],np.uint8)   #创建
x=np.zeros([3,4],np.float32)
X=np.empty([3,4],np.uint8)     #创建未初始化的数组，里面全是随机数，默认情况下，创建的数组的dtype是float64。

x=np.
x=np.arange(0,10,0.5,np.float)   #arange( start,end,step,dtype)
b=np.arange(2,5,0.5).reshape(2,3)  		#把矩阵变成2行3列
#mat 可以把传入的列表建成矩阵,但是不能大于2维
a=np.mat([[2,3,4],[3,4,5]])

# 建立等差数列 np.linspace(start, stop, num=50, endpoint=True, retstep=False, dtype=None)
# num表示标本数量
# endpoint 	该值为 true 时，数列中中包含stop值，反之不包含，默认是True。
# retstep   如果为 True 时，生成的数组中会显示间距，反之不显示。
x=np.linspace(0,10,50,dtype=np.uint8)

#建立等比数列  np.logspace(start, stop, num=50, endpoint=True, base=10.0, dtype=None)
# 对数 log 的底数。
x=np.logspace(0,10,10,base=2)

x=np.array([[1,2,3],[4,5,6]])  #用已知数建立数组
```

### 改

```python
x=np.zeros([6,6],np.uint8)

print(x[0:6:2].shape)       #(3,6)
print(x[0:6:2][::1].shape)  #(3,6)
print(x[0:6:2][::2].shape)  # (2,6)

#借助这个，可以给特定行赋值
x[0,0]=1  #改变1个值
x[0:6:2,0:6:3]=2   #把在0，2，4行 且在0，3列的数都赋值为2
```

### 查

```python
x=np.zeros([6,4,3],np.uint8)

aa=x[x>1]
print("aa=",aa)   #把x数组中x>1的数组的数都放入aa中

bb=np.max(x,axis=0)          #返回由每列最大的数组成的数组
print("bb.shape=",bb.shape)  #(4,3)

bb=np.max(x,axis=1)          #返回由每行最大的数组成的数组
print("bb.shape=",bb.shape)  #(6,3)


bb=np.max(x,axis=2)          #返回由每层最大的数组成的数组
print("bb.shape=",bb.shape)  #(6,4)

print(x.shape)
x[0:5:1, 0:6:2, 0]=3
bb=x[np.where(x==3)]        ##返回由满足条件组成的数组
print("shape=",bb.shape)
```

##### max和argmax区别？

max返回最大值，argmax返回最大值的下标

```python
import numpy as np
a = np.array([[1, 6, 5, 2],
              [9, 6, 2, 9],
              [3, 7, 9, 1]])
print("argmax=",np.argmax(a, axis=0))   #[1 2 2 1]

print("max=",np.max(a,axis=0))  # [9 7 9 9]
```

##### clip

numpy.clip(a, a_min, a_max, out=None)[source]

这个函数将将数组中的元素限制在a_min, a_max之间，大于a_max的就使得它等于 a_max，小于a_min,的就使得它等于a_min。

##### expand_dims

 img = np.expand_dims(img, axis=-1)

axis=-1是指在最后一个轴后添加新的轴

