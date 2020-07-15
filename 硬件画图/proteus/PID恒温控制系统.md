#### 一.模板文件搭建

1.新建文件夹PID_HOMEWORK，在其中新建一个project，放工程

2.将示例文件代码中的usr复制到PID_HOMEWORK中

把usr中的c文件加入项目，使用![mark](http://mally.oss-cn-qingdao.aliyuncs.com/PicGo上传的图片/20200625/150429388.png)

把usr中的h文件加入项目，在下面填入头文件存放地址

![mark](http://mally.oss-cn-qingdao.aliyuncs.com/PicGo上传的图片/20200625/150525421.png)

3.编译报错后

![image-20200625150643856](C:%5CUsers%5C53055%5CAppData%5CRoaming%5CTypora%5Ctypora-user-images%5Cimage-20200625150643856.png)

把存储空间更改，这个错误就解决了
![img](file:///C:\Users\53055\AppData\Roaming\Tencent\Users\601882280\QQ\WinTemp\RichOle\KWR~SMXCS9~~C~XCMCLG6PX.png)

二.思路分析

由于proteus仿真中，DHT1温度值不会自动发生变化，只能通过摁下面的按键来让温度升高

![mark](http://mally.oss-cn-qingdao.aliyuncs.com/PicGo上传的图片/20200625/153245839.png)
$$
\Downarrow 温度升高
$$

$$
PID检测到超过它的预设值，不断
$$





