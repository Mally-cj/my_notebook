# Proteus做C51最小系统的仿真

本文是看完[Proteus第二课C51最小系统的仿真-流水灯实验](https://www.bilibili.com/video/av81129425?from=search&seid=15823771711517571627)的学习笔记，强烈建议greenhand去看一下这个视频，特别详细。

*本文的仿真图以及代码链接*
链接：https://pan.baidu.com/s/1beSpB_Q5cc45XzubXCzkAQ 
提取码：vrjd
### 一.画最小系统

==51最小系统 由3部分组成。分别是晶振电路，复位电路，C51芯片==

1.连接晶振电路

晶振:CRYSTAL

电容：Capacitors 22pF   选择02013A220JAT2

添加地线：在左侧菜单栏的终端模式中选择ground

2.连接复位电路

电阻：RES

按键：BUTTON

电容：CAP-ELEC

然后修改调整：

- 改晶振改为12Hz
- 改C3为10uF
- 改电源的字符串为+5V
- 在EA处添加+5V电源



### 二.画LED灯电路（外设）

（用到的器件见下图）



### 三.其它

（1）配置供电网：名字要一一对应，不然仿真会出现问题

![mark](http://mally.oss-cn-qingdao.aliyuncs.com/PicGo上传的图片/20200415/145538327.png)



（2）连网络标号

菜单左栏第4个，选择连线连线标号模式![mark](http://mally.oss-cn-qingdao.aliyuncs.com/PicGo上传的图片/20200415/150708563.png)

把鼠标移到R2电阻接出来的导线上，会出现叉号，然后双击，会跳出编辑连线框 

<img src="http://mally.oss-cn-qingdao.aliyuncs.com/PicGo上传的图片/20200415/150811927.png" alt="mark" style="zoom:50%;" />

给单片机的P1.0口也添加网络标号，但注意要先添加一段导线才行。这样就把单片机的P1.0和对应的LED灯相连起来了，其他的也是这么操作。



全部弄完之后是这样滴！:ballot_box_with_check:

![这是连接好之后的图片](https://img-blog.csdnimg.cn/20200208125212682.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQzMjM1NTQw,size_16,color_FFFFFF,t_70)

总共用到了这些器件

![在这里插入图片描述](https://img-blog.csdnimg.cn/20200208130008145.png)

### 四.输入代码

1.代码在keil中敲好后，变成hex文件，

[如何用keil新建工程写代码](https://jingyan.baidu.com/article/a948d6511538fd0a2dcd2ee4.html)

```c
#include <stdio.h>
#include <reg52.h>
#define	LED P1
void delay(unsigned int ms)
{
unsigned int t1,t2;
for(t1=0;t1<ms;++t1)
	for(t2=0;t2<110;++t2);
}
void main()
{
 while(1)
 {
 LED=0x55;
 delay(500);
 LED=0xaa;
 delay(500);
 }
}
```

2.然后在电路图里，双击C51芯片，添加hex文件

![在这里插入图片描述](https://img-blog.csdnimg.cn/20200208131214600.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQzMjM1NTQw,size_16,color_FFFFFF,t_70)



### 五.仿真

1.点击左下角仿真

![mark](http://mally.oss-cn-qingdao.aliyuncs.com/PicGo上传的图片/20200415/161735134.png)



2.然后报错了，意思是 电源和地接在一起了。

![mark](http://mally.oss-cn-qingdao.aliyuncs.com/PicGo上传的图片/20200415/161918197.png)

在 [文章](https://www.cnblogs.com/cricketx/p/12008002.html)和up主的帮助下，发现真是犯了个小白错误。

![mark](http://mally.oss-cn-qingdao.aliyuncs.com/PicGo上传的图片/20200415/162245239.png)

名称VCC/VDD表示依次从上到下对应，故而VCC对+5V, VDD对VCC.

而出现错误的原因是，选择了左下角的“是否使用默认电路连接设置？”，把这个勾划掉，再把那些移除就行了。

![mark](http://mally.oss-cn-qingdao.aliyuncs.com/PicGo上传的图片/20200415/162734876.png)

### 六. 来自特别乐于助人的up主的解答

**1.AD与 Proteus的区别：**

AD不能仿真，一般用于画PCB板

protues是以仿真为主

**2.关于仿真和实物学习：**

<u>板子呢，初级可以单片机，先买个单片机板子一套，然后里面有程序例子，跟着改，烧录到板子，看看效果。如果有板子，仿真就用的少。学习时最好用板子，因为仿真和事物有很大差距。</u>
<u>仿真的作用是在设计一个新电路的时候用的，先仿真，看看效果，如果可以，就搭建实物电路，这样减少成本</u>



**3.推荐学习网站**

有电路问题可以去 [51黑电子论坛](http://www.51hei.com/bbs/)
