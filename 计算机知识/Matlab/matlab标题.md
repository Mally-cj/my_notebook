### 标题加变量

加变量有2种方式

 1. `title(sprintf("%d次拟合曲线", i))`
 2. `title ( ['运行时间: ',num2str(i) ] );`



注意事项
title这句代码需要放在Plot()后面


示例

```c
x=0:0.1:1;
y=[-0.447 1.798 3.28 6.18 7.02 7.32 7.88 9.56 9.56 9.30 11.2];
 
figure('NumberTitle', 'off', 'Name', '比较多次多项式最小二乘拟合曲线');  %%自定义新窗口名称
for i=1:4
p=polyfit(x,y,i);
xi=linspace(0,1,100);
yi=polyval(p,xi);
 
disp(i)
subplot(2,2,i)
plot(x,y,'o',xi,yi);
title(sprintf("%d次多项式最小二乘拟合", i))
end
```
![在这里插入图片描述](https://img-blog.csdnimg.cn/20201115101444159.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQzMjM1NTQw,size_16,color_FFFFFF,t_70#pic_center)



改变位置大小

```
title('y=x','position',[23,-4],'FontSize',16);
```

