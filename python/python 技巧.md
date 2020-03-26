# python 技巧

| 名称     | 描述                     |
| -------- | ------------------------ |
| type()   | 返回参数的数据类型       |
| dtype    | 返回数组中元素的数据类型 |
| astype() | 对数据类型进行转换       |

## 创建多维列表

```python
big=10
use = [[[0 for a in range(big)] for b in range(big) ]for c in range(big)]
```

让窗口可调大小

```
cv2.namedWindow('img1', cv2.WINDOW_NORMAL)
```



合并窗口

<一>用imshow

```
img=np.hstack([img1,img2,img3])
cv2.imshow("img",img)
cv2.waitKey()
```

<二>用matplotlib.pyplot



数字转字符 str()

```
name="1:img   2:binary("+str(t1)+")      3:otsu("+str(t2)+")"
cv2.imshow(name,img)
```

