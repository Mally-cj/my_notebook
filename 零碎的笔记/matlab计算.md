[题目来源](https://blog.csdn.net/biongbiongdou/article/details/79643221?ops_request_misc=%257B%2522request%255Fid%2522%253A%2522159999665119195162105071%2522%252C%2522scm%2522%253A%252220140713.130102334.pc%255Fblog.%2522%257D&request_id=159999665119195162105071&biz_id=0&utm_medium=distribute.pc_search_result.none-task-blog-2~blog~first_rank_v2~rank_blog_default-1-79643221.pc_v2_rank_blog_default&utm_term=matlab&spm=1018.2118.3001.4187) ：

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



画图

line 画直线



### 卷积运算

conv计算两个有限长序列的卷积（或计算两个多项式相乘）



当两个序列不是从0开始时，使用convu

