# python做信号图 文案

用python对信号做处理：http://bigsec.net/b52/scipydoc/frequency_process.html

part1：展示

冲击函数 impulse function



sudo tar jxf  22.tar.bz2    /usr/share/stardict/dic

画冲击函数 dirac

```
import numpy as np
import matplotlib.pyplot as plt
from sympy import DiracDelta

def make_dirac():
    # 画dirac
    qi=-10  #坐标轴的起始位置
    mo=-qi
    num=1000 #样本数量
    scope=0.5   #激励作用的范围
    xie=100000
    x=np.linspace(qi,mo,num)
    y=np.zeros(x.shape,np.float32)
    for i in range(num):
        if x[i]>scope:break
        if x[i]<-scope:continue

        if x[i]>=0 :
                y[i]=(x[i]-scope)*(-xie)
        elif x[i]<0:
            y[i]=(x[i]+scope)*xie

    plt.plot(x, y, lw=2, label="dirac_func")
    plt.legend()
    plt.show()

def make_step_func():
    qi = -10  # 坐标轴的起始位置
    mo = -qi
    num = 1000  # 样本数量

    x = np.linspace(qi, mo, num)
    y=x>0
    plt.plot(x, y, lw=2, label="step_func")
    plt.legend()
    plt.show()


def rope_func():
    qi = -10  # 坐标轴的起始位置
    mo = -qi
    num = 1000  # 样本数量

    x = np.linspace(qi, mo, num)
    y = (x > 0) * x
    plt.plot(x, y, lw=2, label="rope_func")
    plt.legend()
    plt.show()


```

part2： 画时变和时不变函数

一天后看是这个样子

两个对比图

```
def combi():
    def f1(t,i):
        return (t-i>0)*(t-i)

    qi,mo=-10,10  # 坐标轴的起始位置
    ylim_min,ylim_max=-4,15     #y轴的范围
    num = 1000  # 样本数量
    image_list = []
    t1 = 6
    t0 = 4

    x = np.linspace(qi, mo)

    for i in range(0, t0 + 1):

        #picture 1
        x1=t1-i  # 点动
        ax1=plt.subplot(1,2,1)
        ax1.set_xlim(qi, mo, 0.1)
        ax1.set_ylim(ylim_min, ylim_max)
        ax1.set_title('函数不变，t变')
        ax1.plot(x, f1(x,0), lw=2, label="y=u(t)")
        ax1.legend()
        plt.plot(x1, f1(x1,0), 'bo')

        if (i == t0):
            plt.annotate('y值为2', xy=(x1, f1(x1,0)), xytext=(x1, f1(x1,0) + 3), arrowprops=dict(facecolor='red', shrink=0.01))
        plt.annotate('(%d,%d)' % (x1,f1(x1,0)), xy=(x1 ,f1(x1,0)))
        plt.annotate('y=u(t)', xy=(1,1),xytext=(t1-3, t1-7))    #曲线的标签

        #picture 2
        x2=t1     #点不动
        ax2 = plt.subplot(1,2,2)
        ax2.set_xlim(qi, mo, 0.1)
        ax2.set_ylim(ylim_min, ylim_max)
        ax2.set_title('函数变，t不变')
        ax2.plot(x, f1(x, i), lw=2, label="y=u(t-t0)")  #函数曲线
        ax2.legend()    #显示图标
        plt.annotate('y=u(t+%d)' % i, xy=(1,1),xytext=(t1-3, t1-7)) #给函数图像做注释

        if i == t0:
            plt.savefig('comb.png')
            image_list.append(imageio.imread('comb.png'))
            # image_list.append(imageio.imread('comb.png'))

            plt.plot(x2, f1(x2,i), 'bo')
            y2=f1(x2,i)
            plt.annotate('(%d,%d)' % (x2, y2),xy=(x2,y2),xytext=(x2 + 0.8, y2 - 0.8))
            plt.annotate('y值为2', xy=(x2, y2), xytext=(x2, y2 + 3),arrowprops=dict(facecolor='red', shrink=0.01))

        plt.savefig('comb.png')
        plt.close()  # 这样会清楚旧图
        image_list.append(imageio.imread('comb.png'))
    imageio.mimsave('comb.gif', image_list, duration=1)
```

```
t \leq 0：y=0
```

$$
t \leq 0：y=0
$$

$$
2<t\leq3:y=\frac{1}{2}t-\frac{1}{4}
$$

$$
3<t: y=\frac{1}{4}t^2+\frac{1}{2}t+\frac{3}{4}
$$

