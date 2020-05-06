#### 更新目录updatedb 

用来创建或更新 slocate/locate 命令所必需的数据库文件。

```bash
sudo updatedb
```

#### 查找文件locate

```
locate eigen3   #查找eigen3在哪
```

#### 使用cmake编译文件

```bash
mkdir build
cd build
cmake..
make     //也可以使用多线程 make -j4
```

提交文件

```
git add*
git commit -m"new file"
git push
```



和钉钉

git常用命令

from  http://www.wendev.site/article/26

```
git init                                        # 创建一个新本地仓库 
git add xxx                                # 将xxx文件添加到本地仓库 
git add -A                                  # 将当前目录及其子目录下所有文件添加到本地仓库 
git commit -m "xxx"                   # 创建一次提交，提交说明为xxx 
git remote add origin xxx          # 把xxx设置为当前本地仓库的远程仓库，名为origin 
git push xxx ***                         # 把提交推到远程仓库xxx的***分支，什么都不写（只写git push）的话默认origin仓库你当前的分支 
git pull                                        # 从远程仓库里拉取代码 
git clone xxxx                          # 把远程地址为xxxx的仓库克隆到本地 
git branch xxx                          # 创建一个叫xxx的新分支 
git checkout xxx                        # 切换到xxx分支 
git status                                  # 列出当前仓库状态 
git log                                     # 列出提交日志
```



#### Linux常用软件安装方式

（1）软件包内提供install.sh ,setup.sh等安装程序 或以 .bin格式单个执行文件

（2）deb方式：deb经过gzip和tar打包而成，处理它的经典程序是dpkg，经常是通过apt来运行

（3）RPM:仅用于安装用RPM打包的软件

（4）源码方式：使用源码自己通过编译生成二进制文件



#### 快捷键

* Ctrl+C：结束终止当前命令，如果你输入了一大串字符，但是不想运行，可以按这个组合键静茹下一行，放弃这个命令。也可以在不知道哪里能输入命令的时候，输入这个。
* Tab：代码补全
* Ctrl+A：让光标一道命令的最前面



#### 查询帮助文档

```
# man ls
```

