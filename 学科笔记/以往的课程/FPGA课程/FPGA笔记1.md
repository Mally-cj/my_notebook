# FPGA笔记

EDA (Eelectronic  Design Automation )

按集成度分类

低密度LDPLD

(1)PROM:成本低，存储容易

（2）FPLA: 不经常生产和使用了

（3）EAL:速度快

（4）GAL:、





PROM:与阵列固定，或阵列可以编程



背

a,b是数据输入

将实体结构体话取名，



```vhdl
Architecture arch_name of en_name is
 begin
     functional statement:
End architecture arch_name:
    
    
```

#### 顺序语句

顺序语句一定是在并行语句里面



#### 并行语句

​    when…… else
vhdl中用到了很多的并行语句，因此速度会快很多

<=是赋值符号



只有一个实体，但会有若干个结构体

实体名一定和工程名一模一样





## 2020.4.7

一个结构里，最外层一定是并行语句，顺序语句必须嵌套在并行语句里面



P1和P2是2个进程

fpga的进程只有2个状态：运行和挂起

进程醒来的条件是敏感信号表，当敏感信号变量表中的任何一个发生变化，进程启动

```
Architecture arch_name of en_name is
begin 
P1:process（variable lists)
	begin
		
end process;   
P2:process（variable lists)
end process;   

```





```
--实体声明
entity test2 is
port(
a,b:in bit;
s:in bit;
y:out bit
   );
end entity test2;
--结构体（实体内部逻辑）
architecture one of test2 is
begin
	y<=a when s='0'else b;
end architecture one;
```





```vhdl
Library ieee;
use IEEE.std_logic_1164.all;
--实体声明
entity test2 is
port(
a,b,s:in std_logic;
	 y:out std_logic );
end entity test2;
--结构体（实体内部逻辑）
architecture one of test2 is
 begin
	process(a,b,s)
 begin
	if s='0' then
	y<=a;else
	y<=b;
end if;
	end process;
end architecture one;
```



2020.4.9

回顾

not语句优先级最高，其它是并排的，可以通过括号提高优先级。

process启动的标志是敏感信号

结构体的最外层一定是process或者并行语句

正课：

D触发器：当

std_logic  有9种值：

‘U’ ：unknown

```
--上升沿判断
if clk'event and clk='1'  --如果时钟发生跳变，
if clk='0' and clk'last_value='0'
if rising_edge(clk)  --检测上升沿，如果为true，就真

--下降沿判断
if falling_edge(clk)
```

```
then q1<=d
end if
end process
q<=q1
end bhv
```

$$
库library =
\begin{cases}
包1 =
\begin{cases}
数据类型\\
函数
\end{cases}
\\
包……\\
包n
\end{cases}
$$

使用库里的包   

```
use lib_name.package_name.std_logic;
use lib_name.package_name.all;  --把这个包里的所有都引入
```

常用的库：

std standard（自动导入，不用特别去弄）， work （用户库），IEE库（系统库，用到的数据类型都在这里）

```
use IEEE.STD_LOGIC_
```

不同的进程不允许有相同的敏感信号



3.3 含有层次结构的VHDL描述

```
乘法器由n位加法器组成，

1个加法器由n个全加器组成，

1个全加器由2个半加器和1个或门组成。
```

以上组合起来就是一个层次电路

例3-17

逻辑位矢量 std_logic_vector()

有点像数组

```
signal a:std_logic_vector(n-1 downto 0);--从高往低一啊不能用这个
signal b:std_logic_vector(4 downto 0);

```

**a&b**

要求：1.a和b的数据类型要一致

​			2.两边的操作数不能交换位置

```
library IEEE;
use IEEE.set_ligic_1164.all;
entity h_adder is
port(a,b:in std_logic;
co,so:out std_logic）;
end entity h_adder;
architecture fh1 of h_adder is
	signal abs:std_logic_vectore(1 downto 0);
begin
abs<=a&b   --不是与门的意思，是表示a与b相连，
process(abc) 
)

```





结构体的总结

```vhdl
Architecture arch_name_of en_name is
 begin
	process(variable)
     begin
     	case(biaodashi) is
     	when ——>……；
     	
     	when ——>……；
    	end case;
    end process:
 
 end;
```



2020.4.14

如果以后做设计需要用到自己设计的东西，就在用户库里找。

case与if语句不一样，其中的when是并行的，例3-17



```vhdl
library IEEE;
USE IEEE.STD_LOGIC_1164.ALL;
ENTITY H_ADDER IS
PORT(a,b:IN STD_LOGIC;
co,so: OUT STD_LOGIC);

END ENTITY h_adder;
ARCHITECTURE fh1 OF h_adder is
SIGNAL abc:STD_LOGIC_VECTOR(1 DOWNTO 0);
BEGIN 
	abc<= a & b ;
 PROCESS(abc)
	BEGIN
	 CASE abc IS
	  WHEN "00"=>so<='0';co<='0';
	  WHEN "01"=>so<='1';co<='0';
	  WHEN "10"=>so<='1';co<='0';
	  WHEN "11"=>so<='1';co<='1';
	  WHEN OTHERS=>NULL;
	END CASE;
 END PROceSS;
END ARCHITECTURE fh1;

```



## 2020.4.16

rom可写可读

例3-20

buffer是既可以输出又可以输入

信号分为端口信号和中间信号

信号和变量的区别，信号

例3-21

