# py画复杂图

```
import matplotlib.patches as patches
import matplotlib.pyplot as plt

fig=plt.figure(1,figsize=(8,9),dpi=72)
fotsize=0.5*fig.dpi

ax=fig.add_subplot(1,1,1,frameon=False,xticks=[],yticks=[])

boxStyles=patches.BoxStyle.get_styles()
boxStylesNames=list(boxStyles.keys())
boxStylesNames.sort()


for i,name in enumerate(boxStylesNames):
    ax.text(float(i+0.5)/len(boxStylesNames),
            (float(len(boxStylesNames))-0.5-i)/len(boxStylesNames),
            name,
            ha="center",
            size=fotsize,
            transform=ax.transAxes,
            bbox=dict(boxStyle=name,fc="w",ec="k"))
plt.show()
```

<img src="/home/mally/codes/githubs/my_notebook/python/python作图/圖片/2.png" alt="image-20200312221706093" style="zoom:50%;" />