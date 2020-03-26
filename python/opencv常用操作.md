#### opencv 播放mp4

[参考博客](https://www.jb51.net/article/152219.htm)

```python
# 获得视频的格式
import cv2
videoCapture = cv2.VideoCapture('test.mp4')

# 获得码率及尺寸
fps = videoCapture.get(cv2.CAP_PROP_FPS)
size = (int(videoCapture.get(cv2.CAP_PROP_FRAME_WIDTH)),
        int(videoCapture.get(cv2.CAP_PROP_FRAME_HEIGHT)))
fNUMS = videoCapture.get(cv2.CAP_PROP_FRAME_COUNT)

# 读帧
success, frame = videoCapture.read()
while success:
    cv2.imshow('windows', frame)  # 显示
    c=cv2.waitKey(int(1000/fps) )  # 延迟
    if(c==27):          # ESC键退出
        break
    success, frame = videoCapture.read()  # 获取下一帧

videoCapture.release()
```

##### convertScaleAbs

