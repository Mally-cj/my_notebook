 

字段类型与宽度

| 类型       | 代号 | 备注                                                      |
| ---------- | ---- | --------------------------------------------------------- |
| 字符型     | C    | 用双引号，单引号或者方括号阔气来的字符串。如‘PC',"3.1415" |
| 数值型     | N    |                                                           |
| 货币型     | Y    |                                                           |
| 日期型     | D    | 必须用{}括起来，比如{06/39/1999}，如果是空白日期就是{}    |
| 日期时间型 | T    | 同日期型                                                  |
| 逻辑型     | L    |                                                           |
| 浮点型     | F    |                                                           |
| 整型       | I    |                                                           |
| 双精度型   | B    |                                                           |
| 备注型     | M    |                                                           |
| 通用型     | G    |                                                           |



VFP表达式的构成元素：常量，bian'liang

#### 常量

1. 数值型常量
2. 字符型常量
3. 日期型和日期时间型常量
4. 逻辑型常量
5. 货币型常量，以$开头，并四舍五入到效输4位

6. 浮点型常量

#### 变量

##### 内存变量

1. 命名规则：字母或下划线开始

    ```visual basic
    && 两种赋值方式
    s= "Visual foxPro"  &&第1种，定义变量B并赋值
    
    store 2*4 to a		&&第2种,store<表达式> TO <内存变量表>
    ```

2. 变量显示

   <通配符>有？和* 两种，前者代表单个字符，后者代表一个或多个字符

3. 内存变量清除命令

   ```visual basic
   release a,b				&&清除内存变量a和b
   release all 			&&清除用户定义的所有内存变量
   release all like a*		&&清除所有首字母为A的内存变量
   release all except a*	&&清除所有字母除了首字母为A的内存变量
   ```
```
   
   

##### 数组

​```visual basic
dimension x(3),a(2,3)   &&分别定义数组名为x的一维数组和数组名为a的二维数组
```



### 表达式

```visual basic
activate window 

```



运算符有以下4钟：

* 完全连接运算符+

* 不完全连接运算符-

* 字符串包含运算符$

* 精确比较运算符==

  ```visual basic
  "计算机 "+"世界"		&&”计算机 世界“
  "计算机 "-"世界"		&&"计算机世界"
  ?"BC"$"ABCD"		&&询问 “BC"是否是"ABCD"的子串 .T.
  ?"XY"$"ABCD"		&& .F.
  
  ```

日期型号加减单位是天数，日期时间型加减单位是秒数

```
{^1996/10/28 11:00:00 a}+10

```



#### 函数

type函数能返回表达式的类型，也能测出函数的类型

```visual basic
? type("DATE()")	&&如此测试date()这个函数的返回值
?date()			    &&日期处理型函数

```

表数据相关函数

```
use sb.dbf		
?EOF()  &&问当前指针是不是文件末了,此时是.F.
go bottom
?EOF()  &&.F.
skip 1
?EOF()  &&.T.

```

表达式值的显示

？？显示后不换行

？显示后换行







##### **练习题**

1. ==注意一个英文字母编码是1个字节，1个汉字是2个字节==

```visual basic
?round(82.2275m2)       &&82.23
?sqrt(4)				&&2.00
?ABS(-4)				&&4
?EXP(2)					&&7.39
?INT(7.5)				&&7.5
?MOD(8.7,3)				&&2.7
?substr("ABCD",2.2)		&&BCD
?LEFT("ABCD",2)			&&AB
?SUBSTR("城市经济",5,4)	 &&经济	
?len("ABCD")			&&4
?STR(3.14,5,1)			&&3.1
?upper("aBC")			&&ABC
?VAL("3.14")			&&3.14
?ALLTRIM(" ABCD ")		&&ABCD ,	去除空格
?SPACE(4)				&&留四个空
?CHR(65)				&&a
?ASC("A")				&&65，		判断首字母的ascii值
?ASC("WORK")			&&87
?TYPE("STR(3.14,5,1)")	&&c
```

2. 交互打印乘法表

   ```
   clear 
   	?"输入一个数字后，打印它的乘法表"
   	input"请输入1个数字" to a
   	for i=1 to a
   		for j=i to a
   		 str1=str(i,1)+'*'+str(j,1)+'='+str(i*j,2)+" "
   		 ??str1
   		 endfor
   		 ?
   		 
   	endfor
   ```

   

VF命令和子句的书写规则

1. 子句顺序随意，但是内部必须用空格分开
2. 一行命令最多为8192个字符，可以用“；”换行




#### 常用子句 

书写规则：子句内的各部分必须用空格割开，但各子句的次序必须任意排列

1. 范围子句

   ```visual basic
   display all  &&所有记录
   display next 3  &&显示从当前记录起的第3个记录
   display record 3  &&显示第3个记录
   display rest 	&&显示从当前记录到最后一个记录止的所有记录
   ```

   

2. for子句

   ```visual basic
   use sb
   GO 2	&&指向第2个记录
   list next 3 for 价格>1000   &&显示第2,3,4条中价格大于1000的记录
   ```

   

3. while子句

4. fields子句

   范围，for，while子句能把需要操作的记录筛选出来，而fiels子句则能确定需要操作的字段。

   ```
   list fields 名称   &&只显示名称那一列
   ```

   

5. off子句

   list和display都自动显示记录号，若不要显示它们，就加off

   list和display两者区别：前者为滚动方式输出，后者为分屏输出；单写list会打印完整的表，但是display不会。

   

#### 表的复制

1. 从表复制出表或者其它类型的文件

   ```visual basic
   use sb   &&打开sb这个表
   copy to b1  &&对sb.dbf原样复制，如果含有备注型字段，那么还会生成b1.fpt
   
   copy to b2 SDF	&&以系统数据格式复制，产生文本文件 b2.txt
   type b2.txt		&& type命令用来显示文本文件的内容 
   
   copy to b3 xls  &&以xls的文件格式复制，产生b3.xls
   ```

   

2. 仅复制表的结构，不复制表中的数据

   ```
   use sb
   copy structure to sb2 fields 名称，价格，编号
   ```

   

3. 复制任何文件 

   ```visual basic
   copy file a1.dbf to a2.dbf   &&从a1.dbf复制得到a2.dbf，但是a1这时必须是关闭的。
   ```

   

#### 表数据的替换

1. 成批替换数据

   replace命令能直接将字段值用指定的表达式值替换

   ```visual basic
   use sb
   replace 价格 with 价格-1000，部门 with "11" for 主要设备 && 主要设备的价格都减少1000，部门均改为11
   ```
   

additive用于备注型字段，表示将表达式值添加到字段的原有内容

```visual basic
   use sb
   replace 备注 with ","+编号+名称 additive
   && 首记录的“备注”字段的数据变为“从光华仪表厂租入，100-1车床”
```



2. 单个记录与数组间的数据传送

   （1）将记录传送到数组或内存变量

   ```visual basic
   use sb
   go 5
   scatter memvar
   ?m.编号,m.名称
   ```

   （2）将数组或内存变量的数据传送到记录

   ```visual basic
   use sb
   go 3
   scatter to a momo		&&第3各记录（包括备注型字段）的数据传送给数组A
   go 4					
   gather from a			&&gather命令将数组传到当前指针的位置，也就是第4条记录
   display					
   ```

   

3. 成批记录与数组间的数据传送

   （1）将表的一批记录复制到数组

   ```visual basic
   use sb
   dimension jz(2,3)		&&建立2行3列的二维数组jz
   copy to array jz fields 名称,价格,部门 for 价格>240000	&&把数据复制到数组
   use c1
   append from array jz	&&把数组jz中的数据追加到c1.dbf中 
   ```

   

   

#### 过滤器

在打开表的时候，先过滤

```visual basic
use sb
set fielter to year(启用日期)>=1990 and year(启用日期)<=1995
list			&&只显示1990-1995年的记录
set fielter to	&&取消过滤器
list 			&&显示全部记录

```

#### 建表和表结构的修改

（1）建表

```visual basic
create table sp(货号 c(6),品名 c(8),进口 l(1),单价 n(7,2), 数量 n(2,0),开单日期 d(8),生产单位 c(16),备注 m(4),商标 g(4))    &&创建表格
insert into sp values("LX-750","影碟机",.T.,5900,4,{96/08/10},"松下电器公司","kk","kk") &&添加数据
insert into sp values("YU-120","彩电",.F.,6700,4,{96/10/10},"上海电视机厂","kk","kk")
```

（2）表结构的修改

```vb
alter table dx add 摘要 m(4) 		&&添加名为“摘要”的备注型字段
alter table dx drop	摘要			&&删除名为“摘要”的备注型字段
alter table dx alter 摘要 c(6)     &&把摘要改为字符宽度为6的字符型字段
copy structure to <文件名>[fields(字段名)]
```



### 记录的维护命令

#### 记录定位

go  [数值表达式|bottom|top]  把指针移到第几各记录

recno()  当前记录的记录号

skip [数值表达式]	若为负数值则向文件头移动，否则向文件尾移动

```
use sb	
?recno()		&&显示当前记录的记录号，当前会显示1
go bottom
skip -1
go top			&&指针移到表的第一个记录
```



#### 记录的插入

insert into 表名(字段1，字段2...字段n) values(表达式1,表达式2,...表达式n)，不必实现打开，在指针处添加记录。

append from追加字段

```
go 3
insert into sb()
```



记录的删除

删除记录有2步，先删除标记，再用物理删除命令彻底删除

delete 逻辑删除命令，也就是删除标记可恢复

pack	物理上删除带有删除标记的记录，不可恢复

recall	恢复那些带删除标记但是没有被物理删除的记录

zar		物理删除当前表中的所有记录





























