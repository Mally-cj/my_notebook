# 安装keil5

目标： 安装能让C51和arm共生的keil5

### 1.下载和依照软件安装管家的keil5 mdk。

地址：https://mp.weixin.qq.com/s/2vDabhV5QNpCvu_OJ_8rOw



### 2.下载 共生文件
链接：https://pan.baidu.com/s/1OJjGv9JW0sDTPl7L_AHdyA 
提取码：65jn

（假定我的keil安装在  C:\keil_v5\ 目录中.）

### 3.把共生文件 的 c51文件夹，复制到  c:\keil_v5\ 目录下;

期间遇到问是否替换的，直接替换

### 4.
(1)用记事本方式把  共生文件中的TOOLS.INI  和 keil5安装目录下的TOOLS.INI都打开）。
（2）修改共生文件中的TOOLS.INI  ，
把  PATH="D:\keil_v5\C51\"改成 你的keil目录中，比如 我改成PATH="C:\keil_v5\C51\"
（3）把改好后的TOOLS.INI 全选复制 ，粘贴到  keil5安装目录下的TOOLS.INI的最后一行后面

### 5.破解

（1）重启电脑后，用管理员身份打开keil5

（2）在文件中选择   “许可与管理"

<img src="https://cdn.jsdelivr.net/gh/Mally-cj/img-folder/window\2.png" alt="img" style="zoom: 50%;" />

（3）破解步骤在软件安装管家里有很相似的步骤，故这里就不细说

破解软件建议使用我提供的共生安装包里的keygen_new2032.exe，因为软件安装管家的证书有效期只有几个月。

![img](https://cdn.jsdelivr.net/gh/Mally-cj/img-folder/window\CX33}2846RMR]AXW@GZKG9E.png)

![](https://cdn.jsdelivr.net/gh/Mally-cj/img-folder/window\20200401204759.png)





### ![4](C:%5CUsers%5C53055%5CDocuments%5Cmarkdown%E6%96%87%E4%BB%B6%5C%E5%8D%95%E7%89%87%E6%9C%BA%E5%AE%9E%E9%AA%8C%E6%8A%A5%E5%91%8A%5C%E4%BD%BF%E7%94%A8%E7%9A%84%E5%9B%BE%E7%89%87%5C4.png)

6.打开共生文件下的stc-isp-15xx-v6.87B.exe。

按如下操作，那个单片机型号不重要，只有在进行硬件在线仿真的时候才需要更改它。

![img](https://cdn.jsdelivr.net/gh/Mally-cj/img-folder/window\TQ~XQOI%T09H02SSYVGYYHN.png)

如此就安装完成了。