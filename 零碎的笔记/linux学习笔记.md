给初学者的建议：
学习linux的注意事项：
1.linux严格区分大小写
2.linux所有内容都是以文件形式保存，包括硬件
硬盘文件是/dev/sd[a-p]
光盘文件是/dev/sr0
因此如果只是靠命令行，而没有写入配置文件，都只是临时生效。

3.linux不靠扩展名区分文件类型
```
windows的一些扩展名
压缩包：*.gz ,  *.bz2 , *.tar.bz2 , *.tgz等
二进制软件包： .rpm
脚本文件： *.sh
配置文件：*.conf
网页文件：*.html，*.php
```
linux靠文件权限区分文件

4.linux所有的存储设备都必须挂载之后用户才能使用，包括硬盘,U盘和光盘。
5.windows下的程序不能直接在linux中安装和运行。


root是最高权限用户，
安装日志
/root/install.log 存储了安装在系统中的软件包及其版本信息
/root/install.log.stslog 存储了安装过程中留下的事件记录
/root/anaconda-ks.cfg :存储了配置文件的格式记录， 可以用于手工配置好一台电脑的系统后，其他电脑就都可以用这个文件去自动配置。


**用户及文件权限管理**
$ sudo adduser lilei 创建lilei这个新用户
$ ls /home查看有哪些用户
$ groups lilei 查看lilei在哪个用户组
$ sudo deluser lilei-- remove-home 删除lilei这个用户![在这里插入图片描述](https://img-blog.csdnimg.cn/20191230154508709.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQzMjM1NTQw,size_3,color_FFFFFF,t_70) 
$ ls -AsSh  列出目录下所有文件的大小
$ ls -l 列出目录下文件的长信息
$ls -dl<file> 列出某个文件的长信息
![在这里插入图片描述](https://img-blog.csdnimg.cn/20191230160839371.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQzMjM1NTQw,size_16,color_FFFFFF,t_70)
$ sudo chown <user> <file name> 更改文件拥有者
如sudo chown cj iphone6 把iphone6这个文件的持有者改为cj
$ ll <file name>查看文件的持有者  如 ll iphone6。 
$ echo”hello“》<file> 把” “写入文件



**环境变量与文件查找**
declare 创建变量
<img src="https://img-blog.csdnimg.cn/20191230175302318.png" width=“2%”>


**shell**
1.#！/bin/Bash   这一句不可以省略和删除，它表示以下写的是shell程序。
其他以#开头的，都是注释。
2.如何执行脚本。
方法一：赋予执行权限，再用绝对路径或者相对路径去运行

```bash
cd /home/shiyanlou
vim hello.sh				#写脚本
chmod 755 hello.sh    		#添加可执行权限
./hello.sh
```
方法二：通过Bash调用执行脚本
$ bash hello.sh


linux目录文件及基本操作
![在这里插入图片描述](https://img-blog.csdnimg.cn/20200106090137654.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQzMjM1NTQw,size_16,color_FFFFFF,t_70)

