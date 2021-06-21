body 元素的内容会显示在浏览器中。

title 元素的内容会显示在浏览器的标题栏中。



标题居中

```
<h1 align="center">This is heading 1</h1>
```

##### 

##### 文本

\<p>用于建立段落

\<br/> 是一个换行符

&nbsp 缩进

&gt大于号

&It 小于号

加粗 \<strong>加粗 </strong>



##### 图片

```html
<img src="18.png" alt="商品图片" title=“这是最新的商品”>
```

alt是在图片损坏的时候的帮助文字

title是给图片的文字注释，当鼠标移到图片上时，就会显示



```html
<body>
    <img src="18.png" alt="商品图片" title=“这是最新的商品”>
    <!-- 指定超链接调转的路径 -->
    <a href="https://www.w3school.com.cn/html/html_entities.asp">详情游览</a>

    <!-- 点击图片跳转 -->
    <a href="https://www.w3school.com.cn/html/html_entities.asp">  <img src="18.png" alt="商品图片" title=“这是最新的商品”<img src="18.png" alt="商品图片" title=“这是最新的商品”>   </a>
<br> <br>
</body>
```



##### 表格

* \<tr>分割 若干单元格

* \<td>分隔列

* 边框线 用“border”属性设置,>1为有，0为无，越大边框越宽

* 标题用\<caption>

* 表头的那行 则把 \<td>换成\<th>， 表头内容就会自动加粗，水平居中

* "colspan",“rowspan”规定单元格可横跨的列数,行数



**示例一**

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



示例二

<table border="1" align="center">
        <tr>
            <td align="center">日期</td>
            <td align="center">上午</td>
            <td align="center">下午</td>
            <td align="center">晚上</td>
        </tr>
        <tr>
            <td>星期一</td>
            <td>英语</td>
            <td>高数</td>
            <td rowspan="5" align="center">自习</td>
        </tr>
        <tr>
            <td>星期二</td>
            <td rowspan="2" align="center">计算机原理</td>
            <td>毛概</td>
        </tr>
        <tr>
            <td>星期三</td>
            <td>体育</td>
        </tr>
        <tr>
            <td>星期四</td>
            <td colspan="2" align="center">企业招聘</td>
        </tr>
        <tr>
            <td>星期五</td>
            <td>云计算</td>
            <td>数据库开发</td>
        </tr>
        <tr>
            <td>星期六</td>
            <td rowspan="2" colspan="3" align="center">休息</td>
        </tr>
        <tr>
            <td>星期天</td>
        </tr>
    </table>



```
<table border="1" width="50%" align="center">
        <tr>
            <td align="center">日期</td>
            <td align="center">上午</td>
            <td align="center">下午</td>
            <td align="center">晚上</td>
        </tr>
        <tr>
            <td>星期一</td>
            <td>英语</td>
            <td>高数</td>
            <td rowspan="5" align="center">自习</td>
        </tr>
        <tr>
            <td>星期二</td>
            <td rowspan="2" align="center">计算机原理</td>
            <td>毛概</td>
        </tr>
        <tr>
            <td>星期三</td>
            <td>体育</td>
        </tr>
        <tr>
            <td>星期四</td>
            <td colspan="2" align="center">企业招聘</td>
        </tr>
        <tr>
            <td>星期五</td>
            <td>云计算</td>
            <td>数据库开发</td>
        </tr>
        <tr>
            <td>星期六</td>
            <td rowspan="2" colspan="3" align="center">休息</td>
        </tr>
        <tr>
            <td>星期天</td>
        </tr>
    </table>
```



##### 表单

<form>
      用户名：<input type="text" name="userName"/> <br/>
      密码：<input type="text" name="passWord"/> <br/>
      <input type="submit">
</form>  

```
<form>
      用户名：<input type="text" name="userName"/> <br/>
      密码：<input type="text" name="passWord"/> <br/>
      <input type="submit">
</form>  
```













```
<!DOCTYPE html>
    <html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>注册</title>
    </head>
<body>  
    hikk
    <form>
        用户名：<input type="text" name="userName" value="匿名类" maxlength="8"/> <br/>
        <!-- type指定元素的类型，默认为text -->
        <!-- maxlenth控制输入长度不能超过8 -->

        密码：<input type="text" name="passWord" /> <br/>
        性别：<input name="gender" type="radio" checked>男<input name="gender" type="radio">女<br/>
        <!-- 让name相同的原因是想只能单选 -->
        <!-- cheked是默认选男 -->

        爱好：<input type="checkbox">美食 <input type="checkbox">音乐 <input type="checkbox">运动 <br/>
        <input type="submit">
        <input type="reset">    
        籍贯：
        <select name="" id="">
            <option value="青岛"> </option>
        </select>
    </form>  
</body>
</html>
```

