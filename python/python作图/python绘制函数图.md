# python绘制函数图

[plt.plot官方传送门](https://matplotlib.org/api/_as_gen/matplotlib.pyplot.plot.html#matplotlib.pyplot.plot)

[python做gif动图](https://blog.csdn.net/FrankieHello/article/details/102600413?ops_request_misc=%7B%22request%5Fid%22%3A%22158298002219724845014535%22%2C%22scm%22%3A%2220140713.130056874..%22%7D&request_id=158298002219724845014535&biz_id=0&utm_source=distribute.pc_search_result.none-task)

[matplotlib基本功](https://blog.csdn.net/qq_34859482/article/details/80617391)：https://blog.csdn.net/qq_34859482/article/details/80617391

显示中文：https://www.cnblogs.com/zhizhan/p/5615947.html

布局（显示子图）：https://blog.csdn.net/qq_34859482/article/details/80617391#t20

画面积图：https://www.cnblogs.com/ws17345067708/p/10653097.html

或者https://www.jianshu.com/p/aaa7b9090da1

做二维卷积动态图：https://www.jianshu.com/p/abb7d9b82e2a

#### plt.plot

(x, y,  ls="-", lw=2, label=“plot figure”)

- x: x轴上的数值
- y: y轴上的数值
- ls：折线图的线条风格
- lw：折线图的线条宽度
- label：标记图内容的标签文本

```
#    基础代码
import matplotlib.pyplot as plt
import numpy as np

x = np.linspace(0.05, 10, 1000)
y0=np.sin(x)
y1 = np.sin(x+1)
# y2=np.sin(x)
t1=3
f1=np.sin(t1)
plt.plot(x, y0, ls=":", lw=2, label="plot figure")
plt.plot(x,y1,ls="--",lw=1,label="plot delay")
plt.plot(t1,f1,'bo')

plt.legend()  #不写这个，就没有label
plt.show()

```

```
import numpy as np
import imageio
import matplotlib.pyplot as plt

def my_picture():
    x=np.linspace(-10,10,1000)
    image_list = []

    for i in range(10):
        y0=np.sin(-x)
        y1=np.sin(-(x-i))
        y2=np.sin(-x-i)
        plt.plot(x, y0, ls=":", lw=2, label="plot figure")
        plt.plot(x, y1, ls="-", lw=3, label="plot delay")
        plt.plot(x, y2, ls="--", lw=4, label="plot 444")

        plt.savefig('my1.png')
        plt.close()
        image_list.append(imageio.imread('my1.png'))
    imageio.mimsave('my.gif',image_list,duration=1)

my_picture()
```

#### 基本坐标轴设置

```
import matplotlib.pyplot as plt
from matplotlib.pyplot import MultipleLocator
#从pyplot导入MultipleLocator类，这个类用于设置刻度间隔
  
x_values=list(range(11))
y_values=[x**2 for x in x_values]
plt.plot(x_values,y_values,c='green')
plt.title('Squares',fontsize=24)
plt.tick_params(axis='both',which='major',labelsize=14)
plt.xlabel('Numbers',fontsize=14)
plt.ylabel('Squares',fontsize=14)
x_major_locator=MultipleLocator(1)
#把x轴的刻度间隔设置为1，并存在变量里
y_major_locator=MultipleLocator(10)
#把y轴的刻度间隔设置为10，并存在变量里
ax=plt.gca()
#ax为两条坐标轴的实例
ax.xaxis.set_major_locator(x_major_locator)
#把x轴的主刻度设置为1的倍数
ax.yaxis.set_major_locator(y_major_locator)
#把y轴的主刻度设置为10的倍数
plt.xlim(-0.5,11)
#把x轴的刻度范围设置为-0.5到11，因为0.5不满一个刻度间隔，所以数字不会显示出来，但是能看到一点空白
plt.ylim(-5,110)
#把y轴的刻度范围设置为-5到110，同理，-5不会标出来，但是能看到一点空白
plt.show()
```



#### 计算积分

```
from sympy import *
x = symbols('x')
print(integrate(x, (x, 1, 2)))
```

#### 加注释

1.带箭头的

plt.annotate( s=text', xy=(0,2), xytext=(0,10),arrowprops=dict(facecolor='r', headlength=5 ,headwidth=5, width=2  ) )  

s为注释文本

xy指的是注释的点

xytext是注释所在的位置

arrowprops就是多加了箭头

更多详细可以参考这个博客：https://blog.csdn.net/TeFuirnever/article/details/88946088

```pyth
  plt.plot(x1, y1, 'bo')
    plt.annotate('(%d %d)'%(x1,y1), xy=(x1, y1),xytext=(x1,y1+0.4))
```



#### 重叠图：

在折线图上填色

```
x=np.linspace(-10,10,20)
y=inv_h(x,2)
plt.plot(x,y)
plt.fill(x, y, 'r',alpha=0.5,label='y1') 
```

https://www.jianshu.com/p/45a868db5ac0



画动图gif

```
   qi = -10  # 坐标轴的起始位置
    mo = -qi
    num = 1000  # 样本数量

    sum_list = []
    image_list = []
    for i in range(1,5):
        x1=i
        y1=i
        x = np.linspace(qi, mo, num)
        y = (x > 0) * x
        plt.plot(x, y, lw=2, label="u(t)")
        plt.plot(x1,y1,'bo')
        plt.savefig('temp.png')
        plt.close()     #这样会清楚旧图
        image_list.append(imageio.imread('temp.png'))
    imageio.mimsave('pic.gif', image_list, duration=1)
```

###### 分辨率

matplotlib.rcParams[‘figure.figsize’]#图片像素 
  matplotlib.rcParams[‘savefig.dpi’]#分辨率 
  plt.savefig(‘plot123_2.png’, dpi=200)#指定分辨率

#### 图中图

https://blog.csdn.net/changzoe/article/details/78851329



给子图设置坐标轴

```
ax2.set_xlim(qi, mo, 0.1)
ax2.set_ylim(-4, 16)
```