[题目来源](https://blog.csdn.net/biongbiongdou/article/details/79643221?ops_request_misc=%257B%2522request%255Fid%2522%253A%2522159999665119195162105071%2522%252C%2522scm%2522%253A%252220140713.130102334.pc%255Fblog.%2522%257D&request_id=159999665119195162105071&biz_id=0&utm_medium=distribute.pc_search_result.none-task-blog-2~blog~first_rank_v2~rank_blog_default-1-79643221.pc_v2_rank_blog_default&utm_term=matlab&spm=1018.2118.3001.4187) ：

测试是否能云同步

### 基础运算

1. $z_2=\frac{1}{2}\ln(x+\sqrt{1+x^2})，其中x=\left[ \begin{matrix}
      2 & 1+2i\\
     -0.45 & 5 & 
     \end{matrix} \right]$

```
x=[2 1+2i;-0.45 5];  
z2=1/2*log(x+(1+x^2)^(1/2))
```

2. $z_3=\frac{e^{0.3a}-e^{-0.3a}}
   {2}sin(a+0.3)+In\frac{0.3+a}{2},a=-3.0,-2.9,...,2.9,3.0$

   

```
a=-3.0:0.1:3.0
z3=0.5*(exp(0.3*a)-exp(-0.3*a)).*sin(a+0.3)+log(0.5*(0.3+a))
```



### 矩阵运算

1. 

$$
A=\left[
 \begin{matrix}
  12 & 34 &-4 \\
  34 & 7  &87 \\
   3 & 65 &7 \\
  \end{matrix}
  \right] ,B= \left[
 \begin{matrix}
   1 & 3 & -1 \\
   2 & 0 & 3 \\
   3 & -2 &7 
  \end{matrix}
  \right]
$$

求下列表达式（1）A\*B+A.*B 	(2)A^3和A.^3   

    clear
    A=[12 34 -4;34 7 87;3 65 7]
    B=[1 3 -1;  2  0 3; 3 -2 7]
    A*B
    A.*B
    A^3
    A.^3

2. 求矩阵的行列式值，迹，秩和范数。

   ```
   det(A)
   trace(A)
   rank(A)
   norm(A)
   ```

   

3. 求解线性方程$\left[
    \begin{matrix}
     \frac{1}{2} & \frac{1}{3} &\frac{1}{4} \\
     \frac{1}{3} & \frac{1}{4} &\frac{1}{5} \\
     \frac{1}{4} & \frac{1}{5} &\frac{1}{6} \\
     \end{matrix}
     \right]  \left[
    \begin{matrix}
      x_1 \\
      x_2 \\
      x_3 
     \end{matrix}
     \right]
     =\left[
    \begin{matrix}
      0.95 \\
      0.67 \\
      0.52
     \end{matrix}
     \right]$ 求 解x

    ```
    A=[1/2 1/3 1/4;1/3 1/4 1/5;1/4 1/5 1/6] 
    b=[0.95;0.67;0.52] 
    X=A\b 
    ```



#### 分段函数

求分段函数的值
$$
y=
\begin{cases}
x^2+x-6 & x\geq 0且x\neq-3 \\
x^2-5x+6 & 0\leq x<5 且x\neq 3\\
x^2-x-1  &其它
\end{cases}
$$

```matlab
% 新建一个函数，写如下
function y = f(x)
if x<0&&x~=-3  
     y=x^2+x-6;  
elseif x>=0&&x<5&&x~=2&&x~=3  
     y=x^2-5*x+6;  
else
     y=x^2-x-1;
end  

% 再把这写在测试脚本里
i=0  
for x=[-5.0,-3.0,1.0,2.0,2.5,3.0,5.0]  
     i=i+1;  
     y=f(x)  
end 
```





```
\1. format short 
\2. n1=1:100; 
\3. pai=sqrt(6*sum(1./(n1.*n1))) 
\4. n2=1:1000; 
\5. pai=sqrt(6*sum(1./(n2.*n2))) 
\6. n3=1:10000; 
\7. pai=sqrt(6*sum(1./(n3.*n3))) 
```





#### 计算定积分

$$
I_1=\int_{0}^{2\pi}\sqrt{cost^2+4sin(2t)^2+1dt}
$$

<一> 因为没有已知的字母，故可以用inline

```
f=inline('sqrt(cos(x.^2)+4*sin(4*x.^2)+1)');
q=quad(f,0,2*pi)
```

<二> 用@

变量名=@(输入参数列表)运算表达式这样产生的函数句柄变量不指向特定的函数, 而是一个函数表达式。 [来源处](https://blog.csdn.net/weixin_38009585/article/details/81016997)

```matlab
f=@(x)sqrt(cos(x.^2)+4*sin(4*x.^2)+1);
q=quad(f,0,2*pi)
```





## 画图

##### 坐标轴设置

* 标题引入变量

```
 title(sprintf("Diagramm for a = %d", id))
```

**figure()** 建立新的窗口

```
figure();   %%创建一个新的窗口
figure('NumberTitle', 'off', 'Name', '晓博基于BP神经网络的xor测试程序');  %%自定义新窗口名称
```

**surf(x,y,z)**    生成有面片的图形

**plot3(x,y,z)**   显示三维图形

**meshgrid ()**   生成空间的(x,y,z)坐标

> 比如 [X,Y]=meshgrid(-4:0.5:22,-11:0.5:10);调用这个语句时，X轴方向会有26\*2=52个点，Y轴方向会有21\*2=42个点，所以，这个会有52\*42=2184个点，其实这是生成一个xoy平面的表单。
>
> ```matlab
> [x,y]=meshgrid(-1:1,-1:1);
> x
> y
> ```
>
> 显示为
>
> x =
>
>     -1     0     1
>     -1     0     1
>     -1     0     1
>
>
> y =
>
>     -1    -1    -1
>      0     0     0
>      1     1     1

##### 绘制三维图形

```
[x,y]=meshgrid(-2:0.1:2);
z=x*exp(-x.^2-y.^2);

figure('Name', '简单三维显示  plot3()');
plot3(x,y,z);    %%简单的三维坐标显示

figure('Name', '由填充完的面片组成的 surf()');
surf(x,y,z) %%生成有面片的图形

figure('Name', '由线条构成的 mesh()');
mesh(x,y,z)
```



![mark](http://mally.oss-cn-qingdao.aliyuncs.com/PicGo上传的图片/20200925/194203710.png)



##### 绘制多面体 patch

```matlab
vert=[1 1 1;1 2 1;2 2 1;2 1 1;1 1 2;1 2 2;2 2 2;2 1 2];%%顶点
fac=[1 2 3 4;2 6 7 3;4 3 7 8;1 5 8 4;1 2 6 5;5 6 7 8];%%面由顶点序号定义
subplot(1,3,1)
%% flat为面着色，可以看出面的边缘；interp是插值着色，对边缘进行了插值处理。
patch('faces',fac,'vertices',vert,'Facecolor','w'); %%（立方体由顶点和面定义）
view(3);
subplot(1,3,2)
patch('faces',fac,'vertices',vert,'FaceVertexCData',hsv(6),'Facecolor','flat');
view(3);
subplot(1,3,3)
patch('faces',fac,'vertices',vert,'FaceVertexCData',hsv(8),'Facecolor','interp');
view(3);
```



##### 旋转图象   rotate() 函数 

Pause（）函数是延迟等待函数，例如程序中出现pause（5），那么在执行到该语句时，停留5秒然后继续。

**view(az,el)**   指定视点方向，设置三维图的视角

> *view(2)*  sets the default two-dimensional view, az = 0, el = 90. 
>
> *view(3)*  sets the default three-dimensional view, az = –37.5, el = 30.

```
x=meshgrid(-10:0.5:10) 
y=x';      %% 把x矩阵转置
z=sin((x.^2+y.^2).^(1/2)).*(x.^2+y.^2).^(1/2) ;
h=surf(x,y,z) 
axis([-15,15,-15 15,-15,15]);

while 1
    rotate(h,[0 0 1],1)
    pause(0.05) 
end

% 程序运行后观察到是一个帽子图形在旋转，函数rotate(h,[0 0 1],1)中，h是图形句柄，
%[0 0 1]决定了旋转轴的方向，此处为z轴，1表示旋转角度（度）。
```





##### 动画制作

```matlab
clc
clear
M=moviein(16);
for j=1:16
    sphere(j);
    axis equal   %表示x轴和y轴的单位长度相同。
    axis off	 %关闭所有坐标轴线、刻度标记和标签。
    M(j)=getframe;
end
movie(M,2)
%使用动画制作函数movie（）生成的动画成为电影动画。程序中使用了moviein函数
%创建一个结构体数组，专门用来装载动画的各帧；
%使用getframe函数把绘制的图形装入结构体，程序最后一句为播放2次。
```

```

```

## 曲线

##### zplane

幅频特性 zplane  ，可以见数字信号处理实验2

zplane(z, p) 绘制出列向量z中的零点(以符号"○" 表示)和列向量p中的极点(以符号"×"表示)，同时画出参考单位圆，并在多阶零点和极点的右上角标出其阶数。如果z和p为矩阵，则zplane以不同的颜色分别绘出z和p各列中的零点和极点。

  zplane(B, A) 绘制出系统函数H(z)的零极点图。其中B和A为系统函数H(z) = B(z)/A(z)的分子和分母多项式系数向量。 zplane(B, A) 输入的是传递函数模型，函数首先调用root函数以求出它们的零极点。

##### freqz

相频特性 freqz，可以见数字信号处理实验2

 MATLAB提供了专门用于求离散系统频响特性的函数freqz(),调用freqz()的格式有一下两种：

  （1）[H,w] = freqz(B,A,N)

B和A分别为离散系统的系统函数的分子、分母多项式的系数向量，N为正整数，返回向量H则包含了离散系统频响在0-PI范围内N个频率等分点的值，向量w则包含0-PI范围内N个频率等分点。调用中若N默认，默认值为512。

（2）[H,w] = freqz(B,A,N,'whole')

  该调用格式将计算离散系统在0—2PI范内的N个频率等分点的频率响应的值。

  因此，可以先调用freqz()函数计算系统的频率响应，然后利用abs()和angle()函数及plot()函数，即可绘制出系统在0—2PI范围内的频响曲线。

  （3）[h,f]=freqz(b,1,2048,75000,'whole');

B:系统函数分子系数
A:系统函数分母系数
2048:整个单位圆上分为多少个点用以计算频率响应
75000:采样频率
'whole':在整个单位圆上计算频率响应,对应的角频率范围是[0,2pi],不加whole只在上半圆计算,对应角频率范围是[0,pi]

[h,f]=freqz(b,1,2048,75000,'whole');
h是频率响应=b/1，你这个是fir滤波器，所以，分母恒为1.







#### 有限长序列

```

```

