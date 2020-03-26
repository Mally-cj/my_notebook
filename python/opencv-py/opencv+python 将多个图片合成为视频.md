# opencv+python 将多个图片合成为视频

小记：

1.保证每张图片的分辨率一样，才能做出可以播放的视频。因此对于这个视频，我新建一个文件夹，里面放了8张一模一样的图片，如果运行程序后，去用播放器能播放出，那么就成功了，这时大小应该是MB；否则视频的大小会为KB，就失败了。

2.opencv只支持avi.

代码

```python
# -*- coding: UTF-8 -*-
import os
import cv2
import time


# 图片合成视频
def picvideo(path, size):
    filelist = os.listdir(path)
# 获取该目录下的所有文件名

    '''
    fps:
    帧率：1秒钟有n张图片写进去[控制一张图片停留5秒钟，那就是帧率为1，重复播放这张图片5次] 
    如果文件夹下有50张 749*677的图片，这里设置1秒钟播放5张，那么这个视频的时长就是10秒
    '''
    fps = 2

    file_path = "/home/mally/图片/opencv图片" + str(int(time.time())) + ".avi"  # 导出路径
    fourcc = cv2.VideoWriter_fourcc('I', '4', '2', '0')  # 不同视频编码对应不同视频格式（例：'I','4','2','0' 对应avi格式）

    video = cv2.VideoWriter(file_path, fourcc, fps, size)
    for item in filelist:
        if item.endswith('.png'):  # 判断图片后缀是否是.png
            item = path + '/' + item
            img = cv2.imread(item)  # 使用opencv读取图像，直接返回numpy.ndarray 对象，通道顺序为BGR ，注意是BGR，通道值默认范围0-255。

            video.write(img)  # 把图片写进视频

    video.release()  # 释放
    # cap=cv2.VideoCapture

path ='/home/mally/图片/text'
#文件路径
size = (749,677) #图片的分辨率片
picvideo(path,size)

```

