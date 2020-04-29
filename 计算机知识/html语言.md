body 元素的内容会显示在浏览器中。

title 元素的内容会显示在浏览器的标题栏中。



标题居中

```
<h1 align="center">This is heading 1</h1>
```



\<p>用于建立段落

\<br/> 是一个换行符





##### 表格

* \<tr>分割 若干单元格

* \<td>分隔列

* 边框线 用“border”属性设置,>1为有，0为无，越大边框越宽

* 标题用\<caption>

* 表头的那行 则把 \<td>换成\<th>， 表头内容就会自动加粗，水平居中

* "colspan",“rowspan”规定单元格可横跨的列数,行数



<table border="2">
   <caption>标题</caption>
    <tr>
    <th>表头0</th><th>表头1</th> <th>表头2</th>
    </tr>
    <tr>
    <th>1-1</th>	<td colspan="2">1-2</td> 
    </tr>
    <tr>
    		<td>2-1</td><td colspan="2">2-2</td>
    </tr>
</table>

```
<table border="2">
   <caption>标题</caption>
    <tr>
    		<th>表头0</th><th>表头1</th> <th>表头2</th>
    </tr>
    <tr>
    		<th>1-1</th>	<td colspan="2">1-2</td> 
    </tr>
    <tr>
    		<td>2-1</td><td colspan="2">2-2</td>
    </tr>
</table>
```







