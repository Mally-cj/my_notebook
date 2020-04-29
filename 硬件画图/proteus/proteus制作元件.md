# proteus制作元件



## 做元件

参考  https://zhidao.baidu.com/question/750433677036060612.html

一.画电路图

step 1:

![mark](http://mally.oss-cn-qingdao.aliyuncs.com/PicGo上传的图片/20200414/181351414.png)

遇到问题：

**1.查找元件要用具体型号**

异或门 74LS86

非门 	74LS04

与门 	74LS08

与非门 74LS00

**2.终端和元件管脚有什么区别？**

可以 器件A+引脚+线+端子+器件B 或者 器件A+引脚+线+引脚+器件B，

端子可以理解为排针；

留接口是用来扩展的

图中的终端 是从  终端模式->input,

step 2:  框住电路图的后，工具-> 编译模型

![mark](http://mally.oss-cn-qingdao.aliyuncs.com/PicGo上传的图片/20200414/195442138.png)

保存模型

<img src="http://mally.oss-cn-qingdao.aliyuncs.com/PicGo上传的图片/20200414/195748705.png" alt="mark" style="zoom:50%;" />

二.封装模型

step3：画元件图

![mark](http://mally.oss-cn-qingdao.aliyuncs.com/PicGo上传的图片/20200414/204905200.png)

step4:双击管脚，把这个pin name和 eletrical type与电路图对应

![mark](http://mally.oss-cn-qingdao.aliyuncs.com/PicGo上传的图片/20200414/205008592.png)

制作元件

<img src="http://mally.oss-cn-qingdao.aliyuncs.com/PicGo上传的图片/20200414/211510238.png" alt="mark" style="zoom: 67%;" />



如此就完成了，可以在库里找，但是不能拿来仿真。