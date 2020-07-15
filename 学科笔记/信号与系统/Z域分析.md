#### 小记

电信18-4  201801100402  陈洁

#### z变换定义

序列f(k)的双边z变换
$$
F(z)=\sum_{k=-\infty}^{\infty}f(k)z^{-k}
$$
序列f(k)的单边z变换
$$
F(z)=\sum_{k=0}^{\infty}f(k)z^{-k}
$$


* **变换条件：**z变换定义为一无穷幂级数之和，显然只有当该幂级数收敛，即

$$
\sum_{k=-\infty}^{\infty}|f(k)z^{-k}|<\infty
$$

​						时，z变换才存在。

* **收敛域**：对于序列f(k),满足$\sum_{k=-\infty}^{\infty}|f(k)z^{-k}|<\infty$,这样的z值集合就是z变换F(z)的收敛域

#### Z域和S域关系

对于一个连续信号f(t),每隔时间T冲激抽样依次，其抽样信号可表示为
$$
f_s(t)=f(t)\delta_T(t)=f(t)\sum_{k=-\infty}^{\infty}\delta(t-kT)=\sum_{k=-\infty}^{\infty}f(kT)\delta(t-kT)
$$
两边取双边拉普拉斯变换，得
$$
F_{sb}=\sum_{k=-\infty}^{\infty}f(kT)e^{-kTs}
$$
从图形上，s平面与z平面有如下映射关系：
（1）s平面上的虚轴（σ＝0，s＝jω）映射到z平面是单位圆，￼即；s右半平面（σ＞0）映射到z平面是单位圆外部区域，￼即；s左半平面（σ＜0）映射到z平面是单位圆内部区域，即￼。
（2）由于$e^{jω}$是以2π为周期的周期函数，￼因此，在s平面的沿虚轴移动，对应于z平面上即为沿单位圆周期性旋转，每平移Ωs，则沿单位圆转一周。所以z平面与s平面映射并不是单值的。



#### Z域变换性质

![mark](http://mally.oss-cn-qingdao.aliyuncs.com/PicGo上传的图片/20200701/113940765.png)





常用Z变换

![img](file:///C:\Users\53055\Documents\Tencent Files\601882280\Image\C2C\Image1\{5C6DDFCB-116E-988E-2472-0676B1DCE659}.png)

