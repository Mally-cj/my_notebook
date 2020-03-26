# matplotlib库的使用

##### plot 画折线图，现趋势

**plt.plot(x,y,ls='-',lw=2,label='plot figure')**

plt.legend() #没有这个，标签不会显示

- ls ：折线风格
- lw：折线图的线条宽度
- label：标签 

技巧：1.label=r"\$sin(x)$", 这样就可以有Tex规范的渲染效果

---

##### savefig()

保存图片

plt.savefig("ttt.png")

血的教训：一定要在plot之后立马保存，不要在show之后，不然变白纸

---

##### subplot()

技巧:

###### 非等分画子图

通过多次调用subplot实现

如ax1=fig.addsubplot(121)



---

##### plt.legend()

:star:指出图例要放置的地方

plt.legend(loc=,bbox_to_anchor=(x1,y2) , ncol=, title="",shadow=True,fancybpx=True)

+ loc 图例的位置，可以是"upper right"

|  位置参数值  | 位置数值 |              |      |              |      |
| :----------: | -------- | ------------ | ---- | ------------ | ---- |
| upper right  | 1        | upper left   | 2    | lower left   | 3    |
| lower right  | 4        | lower left   | 4    | center right | 7    |
| lower center | 8        | upper center | 9    | center       | 10   |

+ bbox_to_anchor=(a1,b1,a2,b2)，以x轴长度为aa，y轴长度为bb.

  图例 到左侧x轴的距离是 aa\*a1，到底部y轴的距离是 bb\*b1

  图例线框  到左侧x轴的距离是 aa\*a2，到底部y轴的距离是 bb\*b2

+ shadow 线框是否添加阴影

+ fancybox 线框是圆角还是直角



---

##### scatter()  画点图

ply.scatter(x,y,label="scatter figure")

---

##### xlim()

plt.xlim(xmin,xmax)

:heart:技巧：可以借助这个逆序排图， 例如plt.xlim(10,1),这时x轴就会是递减的

---

##### xlabel()

plt.xlabel(string，ffontsize=,bbox=)设置x轴标签

- string：标签文本内容

---

##### grid绘制网格

plt.grid(linestyle=":",color="r")

- linestyle:网格线的线条风格
- color：网格线的线条颜色

---

##### axhline()

plt.axline(y=0.0,c="r",ls="--",lw=2) 绘制平行于x轴的水平参考线

- y:水平参考线的出发点
- c：颜色

---

##### axvspan()

plt.axvspan(xmin=1.0,xmax=2.0, facecolor="y",alpha=0.3)垂直于x轴的参考区域

plt.axhspan,垂直于y轴的

- ximin,xmax:参考区域的起始位置和终点位置

- facecolor:参考区域的填充颜色

- aplha:参考区域的填充颜色的透明度

  

---

##### annotate()

添加图形内容细节的指向型注释文本

plt.annotate(string,xy=(x1,y1),xytext=(x2,y2),weight="bold",color="b",

arrowprops=dict(arrowstyle="->",connectionstyle="barc3",color="b"))

- xy： 被注释图像内容的位置坐标
- xytext：注释文本的位置坐标
- weight：注释文本的字体粗细风格
- color：注释文本的字体颜色
- arrowprops:指示被注释内容的箭头的属性字典

技巧：

###### 1.有弧度指示图解

###### 2.有箭头指示的趋势线

---

##### text()

添加图像内容细节的无指向型注释文本

plt.text(x,y,string,weight="bold",color="b")

- string： 注释文本内容

---

##### title()

添加图形内容的标题

plt.title(string,loc,family,size,style,color,alpha，bbox=)

- famliy 字体类别
- style 字体风格

技巧：

###### 1.加水印

   alpha=0.5,改变透明度

###### 2.圆角文本框

bbox=dict(boxstyle="round",ec,fc=)

```python
        plt.title("right demo", loc="right", family="Comic Sans Ms", size=20, style="oblique", color="c")

```

---

##### rcParams()

```
plt.rcParams['font.sans-serif']=['SimHei']			#展现图表里的中文字体
plt.rcParams['axes.unicode_minus'] = False  # 用来正常显示负号
```

---

table()

添加表格

plt.table(cellText=,colLabels=,rowLabels=,colWidths=,colColours=,rowLoc=,rowLabels=)

---

##### locator

ax.xaxis.set_major_locator(AutoMinorLocator(1.0))设置著要刻度线的显示位置

ax.xaxis.set_minor_locator(AutoMinorLocator(4))设置次要刻度线的显示位置

AutoMinorLocator(4)表示要把每一份主刻度线条等分成4份

----

##### suptitle()

是画布标题的问题，而title()是Axes实例的图形标题的文本内容

plt.suptitle("name",fontsize=25)

---

##### tick_params()

刻度线样式

---

##### 设置刻度标签

ax.xaxis.set_minor_formatter(FromatS)设置次要刻度线的显示位置

```
ax2.yaxis.set_major_formatter(FormatStrFormatter(r"$\yen%1.1f$"))
```

---

圆角文本框

---

##### axvline

plt.axvline(x=4,ls="-",c="green")#添加垂直直线

