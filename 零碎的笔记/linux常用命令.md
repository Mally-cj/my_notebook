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

