### 一．遇到的bug
1.陷入死循环后，即使打开其他的编辑器编辑代码，依然会运行那个死循环的代码，也就是说每次运行一个代码，matlap都会把他们运行完才结束。强行打破运行的方法是按ctrl和c。
2.在图像显现出来时，就是用imshow之前，如果没有用subplot要用figure，否则出不来。
3.如果是function，第一行不可以写其他的，除了%，只能写function ##
### 二．会考题型
**1.图像翻转**

**2.矩阵合并**即图像合并，“，”表示左右合并，“；”表示上下合并。
a=[1 3 4 5];
b=[1 5 6 7];
c=[8 9 6 5];
ud=[a;b;c];
lr=[a,b,c];
display(ud);
display(lr);
**4.循环体题目**
注意While和 if 每次完之后都有end。会用continue和break；*switch
**5.人机交互 input和display**
a=input('enter number','s'); %若是2个，则是输入字符串。
b=input('enter number');  %此处为1个就是输入数据。
display('you have finished input');
fprintf('you input are %s and %d',a,b);  
**6.二维绘图和三维绘图**
**5.二维绘图和三维绘图（据说不考）**
Plot绘制坐标轴（hold on 使先不呈现；也可如此plot(x1, y1,x2,y2,…) 实现多个在一个坐标轴）；
Plotyy左右2个纵坐标，共用横坐标。
Figure出现新窗口
Plot3画三维图





## 图像翻转代码
```
figure(1);
pic=imread('23.jpeg');
subplot(221);
imshow(pic);
title('origin');

a=pic(end:-1:1,:,1:1:end);
subplot(223);
imshow(a);
title('right-left');

a=pic(:,end:-1:1,1:1:end);
subplot(224);
imshow(a);
title('down-up');

%figure1 is to show the picture of right-left and down-up.
%fugure2 is to show the result of the change of the third parameter. 

figure(2);
a=pic(:,:,1:1:end);
%it could  also be written as a=pic(:,:,1:3),beacuse there just 3 color aisle.
subplot(131);
imshow(a);
title('3par-positive sequence');

a=pic(:,:,end:-1:1);
subplot(132);
imshow(a);
title('3par-inverted sequence');

a=pic(:,:);
subplot(133);
imshow(a);
title('3par has been ignored');

```
![**subplot使三张图片拼在了一起**](https://img-blog.csdnimg.cn/20190103170916914.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQzMjM1NTQw,size_16,color_FFFFFF,t_70)

![在这里插入图片描述](https://img-blog.csdnimg.cn/20190103171058407.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQzMjM1NTQw,size_16,color_FFFFFF,t_70)


虽然代码很长，但不要看了麻烦啦，其实要写一个翻转只有第一部分的代码啦。

其实还有一个疑惑，就是为什么有些图片第3个parameter如何改都是灰色的呢，比如这张照片。明天课上问老师。![在这里插入图片描述](https://img-blog.csdnimg.cn/20190103171349604.gif)


如果想要把图片保存到文件里，可以用imwrite；比如如下把right-left保存起来。

```
figure(1);
pic=imread('23.jpeg');
subplot(221);
imshow(pic);
title('origin');

a=pic(end:-1:1,:,1:1:end);
b=a;
subplot(223);
imshow(a);
title('right-left');
imwrite(a,'332.jpg');


```
这时翻转后的图片被命名为332存在了matlap的work文件夹里。