# ubuntu黑屏有声音

### 小记

2020年4月30日的情况

症状： 开机运行4~5min后，忽然黑屏，但是电脑是有在运作的，因为播放的视频依然有声音，就只是屏幕黑了。

解决办法：更新nvdia



### 2020.4.30解决过程：

#### 0.出现问题

2020/4/29开机出现问题，就是一切正常4-5min之后忽然黑屏，但是声音还在。这个情况已经出现过2次，但是前2次都是反复开关重启之后自己好了，这次不知道能不能，郁闷，思考还要不要用ubuntu，毕竟这么不稳定，可是学习计算机视觉所见的教材配置的环境都是用ubuntu。

#### 1.得到启发

2020/4/30 忽发奇想 在微信读书里搜 “ubuntu黑屏”，然后看到了这篇文章，由于原文章打开链接会出现问题，就直接复制了。


>现在已经完全抛弃windows了，完全用ubuntu来干活了。不是windows不好，是中国的windows生态环境太差了，随便装个国产小软件会附带给用户装一堆垃圾的东西，什么各种毒霸，各种手机助手，各种输入法。
>
>稍微点错个什么按钮就装一堆的垃圾，到处都是陷阱，就连开源的SourceForge推出的FileZilla安装器，后台还偷偷自动下载Norton 360强制安装。他妈的老外都被中国这帮臭流氓软件公司带坏了。用户还根本没得选择，所以干脆痛下决心，把Windows干掉，直接上ubuntu了。
>
>使用方法习惯了几天就好了，把eclipse也换成了IntelliJIDEA，感觉开发效率比用windows的时候还高不少，现在再看别人用windows觉得那玩意就是渣渣啊。除了网银还得虚拟机，别的真的没啥需要windows来做的。而且，说实话，在linux下用命令行解决问题比用界面解决快多了。
>
>但是，又说但是了，Linux系统虽然很好，可显卡厂商对它支持并不好，我用了半年ubuntu，基本出问题都是在nVidia显卡上，Linus Torvalds曾经在大会上当众对英伟达竖中指，并说"Fuckyou nVidia"。我的使用的感觉也是一样的。
>
>官方linux版本驱动更新太慢，ppa的bumble bee里面有最新的驱动，但是不稳定。昨晚上就被搞黑屏了。笔记本是intel/nVidia双显卡，平时都是用intel集显，没啥大问题，昨晚下载安装了xorg-edgers的349驱动，然后选了一下nVidia显卡，结果直接启动黑屏了，怎么折腾都不行。
>
>Google被屏蔽，百度上翻好几页基本都是建议重装系统，所以再次吐槽百度，搜索正经事出来的结果就是垃圾。特别提醒程序员们，如果想提高自己的各种水平，花钱买VPN翻墙上google也不能用百度，用百度的程序员处于鄙视链的最底层，是程序员里的败类，不管你用什么语言。
>然后还是翻墙上了谷歌，第一条就搜到想要的答案了。很快就解决了，适用于nVidia更新非官方显卡驱动后启动黑屏或花屏，整理方法如下，记录一下，省的以后忘了。
>
>```
>\1. 启动黑屏后可以按Ctrl-Alt-F1进入命令行界面。这个是基础知识，需连网。
>\2. 进入cli模式后，sudo apt-getinstall ppa-purge
>\3. sudo ppa-purge xorg-edgers
>\4. sudo apt-get purge nvidia-*
>\5. 创建一个临时文件夹如 mkdir ~/tmp
>\6. cp /etc/X11/xorg.conf* ~/tmp
>\7. sudo apt-get autoremove
>\8. sudo apt-get update
>\9. sudo apt-get upgrade
>\10. sudo reboot
>\11. 重启后还是C+A+F1进命令行
>\12. sudo apt-get install nvidia-331nvidia-prime
>\13. sudo cp~/tmp/xorg.conf.nvidia-xconfig-original /etc/X11/xorg.conf
>\14. sudo vi /etc/X11/xorg.conf
>```
><img src="http://mally.oss-cn-qingdao.aliyuncs.com/PicGo上传的图片/20200430/104312147.png" alt="mark" style="zoom: 80%;" />
>
>15.确保内容如下
>最后重启，解决。最后启动完成可能会报错，这个用一下 dpkg-reconfigure nvidia-331 nvidia->331-uvm nvidia-settings 就可以了。再重启应该就没事了。





####     2.开始实验

先看看开机后后台在干什么。

重新开机，还没有测试它今天会不会黑屏，登陆之后就直接按 F3+Ctrl+Alt，进入如下

<img src="http://mally.oss-cn-qingdao.aliyuncs.com/PicGo上传的图片/20200430/103420079.jpg" alt="mark" style="zoom:67%;" />

可见确实nvidia显卡有问题

#### 3.根据错误搜索到这篇文章

[ubuntu 18.04 boot error ucsi_acpi USBC000:00: PPM init failed (-110)](https://askubuntu.com/questions/1195764/ubuntu-18-04-boot-error-ucsi-acpi-usbc00000-ppm-init-failed-110)

与我的问题相近：黑屏但是电脑是有在运行的

它提出的解决办法是更新显卡

#### 4.询问网友建议

询问山科linux兴趣小组 群的网友们

建议是 不要用nvidia驱动，用开源驱动

但是我想试试更新nvidia驱动试试，因为上面的那个文章事情发生的时间和我差不多。

墙内的游览器建议用bin



#### 5.回到电脑操作

（1）按Ctrl+C可以输入命令，就像是图形界面用不了，而可以用命令行一样

<img src="http://mally.oss-cn-qingdao.aliyuncs.com/PicGo上传的图片/20200430/105657382.jpg" alt="mark" style="zoom:50%;" />

我输入一个ls测试，如上图

（2）根据这个博客   [Ubuntu下查看显卡型号](https://blog.csdn.net/jyl1999xxxx/article/details/78871622)

```
sudo dpkg --list | grep nvidia-*
```

知道目前的型号是430

（3）更新驱动，[根据  Ubuntu18.04更新驱动最完美的方法](https://blog.csdn.net/hgtjcxy/article/details/89926991)

```shell
$ sudo add-apt-repository ppa:graphics-drivers/ppa
$ sudo apt update
$ ubuntu-drivers devices
```

然后显示了很多，但是没有nvidia-440,只有435，所以我又输入如下

```bash
$ sudo apt install nvidia-driver-435
```

然后接下来都是默认选，

最后 输入关机命令

```
$ poweroff
```

（4）重启，似乎好了，超过5min也不会黑了

看一下此时的nvidia版本

```shell
dpkg -l |grep nvidia
```

看 [dpkg命令的用法](https://www.cnblogs.com/TankXiao/p/3332457.html)，

dpkg是软件管理，l是显示包的版本 ，grep是正则表达式。

<img src="http://mally.oss-cn-qingdao.aliyuncs.com/PicGo上传的图片/20200430/115803527.png" alt="mark" style="zoom:50%;" />



#### 6.测试结果

