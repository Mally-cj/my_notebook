# EDA与VHDL实验报告

## 小记

大二下的一门课，学完一门课了，记录一下~

EDA与VHDL这门课，实验部分包括vhdl和Altium Design，vhdl的实验算是认真做的，有稍微推导，希望给初学的你一些帮助。

在写AD报告，真是用2天半，学习使用，最后一个多层原理图实验没有做。



## 实验一  3-8译码器（bdf实现）

**一、实验目的**

1、掌握组合逻辑电路的设计方法。

2、掌握组合逻辑电路的静态测试方法。

3、初步掌握EDA软件的基本操作与应用。

4、初步了解可编程器件的设计全过程。

**二、实验仪器**

  计算机、QuartusII软件。

**三、实验内容**

1、新建一个设计工程；

2、新建一个bdf文件，（not，and3，input ，output）输入并连接如图1所示原理图；

<img src="http://mally.oss-cn-qingdao.aliyuncs.com/PicGo上传的图片/20200611/094225925.png" alt="mark"  />

由数电书上的逻辑式 画图

![mark](http://mally.oss-cn-qingdao.aliyuncs.com/PicGo上传的图片/20200611/095655323.png)

但是要求的数电书上的有所不同，在于数电书上的74HC138的Y要取反，世面上这两种芯片都有

3、编译

4.新建仿真波形文件，进行仿真。



![mark](http://mally.oss-cn-qingdao.aliyuncs.com/PicGo上传的图片/20200611/102308971.jpg)

由这张表可以知道，应该给a2，a1，a0分别输入半周期为10ns，20ns，40ns的时钟，得到

![mark](http://mally.oss-cn-qingdao.aliyuncs.com/PicGo上传的图片/20200611/103112955.png)







## 实验二 VHDL软件设计

**一、实验目的**

1、熟悉EDA开发平台的基本操作。

2、掌握EDA开发工具的VHDL设计方法。

3、掌握硬件描述语言设计的编译与验证方法。

**二、实验仪器**

  计算机、Max+plusII或QuartusII软件。

**三、实验内容**

1、24进制加法计数器设计与验证。

> 代码原理：
>
> qa为4位的2进制度数，每次变为1001，就是9，那么qb就+1，
>
> 如果qb为3并且qa=0011，那么qb=0，qb=0，表示 已经到23了

```vhdl
LIBRARY IEEE;
USE ieee.std_logic_1164.ALL;
USE ieee.std_logic_unsigned.ALL;
ENTITY work2 IS
PORT(en,clk: IN  STD_LOGIC;
  qa:out STD_LOGIC_VECTOR(3 DOWNTO 0); 
         --个位数计数
  qb:out STD_LOGIC_VECTOR(1 DOWNTO 0));
          --十位数计数
END work2;

ARCHITECTURE a1 OF work2 IS
BEGIN
process(clk)
variable  tma:STD_LOGIC_VECTOR(3 DOWNTO 0);
variable  tmb:STD_LOGIC_VECTOR(1 DOWNTO 0);
begin
   if clk'event and clk='1' then
      if en='1' then
           if tma="1001" then tma:="0000";tmb:=tmb+1;
           Elsif  tmb="10" and tma="0011" then tma:="0000";
                    tmb:="00";
           else tma:=tma+1;
           end if;
      end if; 
  end if;  
  qa<=tma;
  qb<=tmb; 
  end process;  
 
END a1;  
```

![mark](http://mally.oss-cn-qingdao.aliyuncs.com/PicGo上传的图片/20200611/122620312.png)



2、修改以上程序获得60进制加法计数器并进行功能和时间仿真验证。

```vhdl
LIBRARY IEEE;
USE ieee.std_logic_1164.ALL;
USE ieee.std_logic_unsigned.ALL;
ENTITY work2 IS
PORT(en,clk: IN  STD_LOGIC;
  qa:out STD_LOGIC_VECTOR(3 DOWNTO 0); 
         --个位数计数
  qb:out STD_LOGIC_VECTOR(2 DOWNTO 0));
          --十位数计数
END work2;

ARCHITECTURE a1 OF work2 IS
BEGIN
process(clk)
variable  tma:STD_LOGIC_VECTOR(3 DOWNTO 0);
variable  tmb:STD_LOGIC_VECTOR(2 DOWNTO 0);
begin
   if clk'event and clk='1' then
      if en='1' then
           if tma="1001" then tma:="0000";tmb:=tmb+1;
           Elsif  tmb="111"  then tma:="0000";
                    tmb:="000";
           else tma:=tma+1;
           end if;
      end if; 
  end if;  
  qa<=tma;
  qb<=tmb; 
  end process;  
 
END a1;  
```

![mark](http://mally.oss-cn-qingdao.aliyuncs.com/PicGo上传的图片/20200611/123832546.png)

3、自行设计纪录方式，完成实验报告

***四**、实验研究与思考*

1、比较图形设计和语言设计方法的差别和优缺点。

用逻辑图形虽然简单，但设计效率低很难进行大规模电路设计。





## 实验三 *3-8译码器*

***一、实验目的***

1、掌握组合逻辑电路的设计方法。

2、掌握组合逻辑电路的静态测试方法。

3、初步掌握EDA软件的基本操作与应用。

4、初步了解可编程器件的设计全过程。

**二、实验仪器**

  PC机一台　QuartusII　软件

**三、实验内容**

1、新建一个设计工程；

2、使用vhdl中的case语句实现3-8译码器；

（原理可参见实验一）

```vhdl
library IEEE;
use IEEE.STD_LOGIC_1164.ALL;
entity work3 is
port( a: in std_logic_vector(2 downto 0);
  b: out std_logic_vector(7 downto 0));
end work3;
architecture Behavioral of work3 is
begin
process(a)
begin
 case a is
  when "000"=> b <="11111110";
  when "001"=> b <="11111101";
  when "010"=> b <="11111011";
  when "011"=> b <="11110111";
  when "100"=> b <="11101111";
  when "101"=> b <="11011111";
  when "110"=> b <="10111111";
  when "111"=> b <="01111111";
  when others=> b <="11111111";
 end case;
end process;
end Behavioral;

```

![mark](http://mally.oss-cn-qingdao.aliyuncs.com/PicGo上传的图片/20200611/141905438.png)





## 实验四 组合逻辑电路的VHDL描述

*一、实验目的*

1、掌握组合逻辑电路的设计方法。

2、掌握组合逻辑电路的静态测试方法。

3、熟悉FPGA设计的过程，比较原理图输入和文本输入的优劣。

*二、实验仪器*

  PC机一台　QuartusII　软件

*三、**实验内容*

1、用VHDL语言设计一个四舍五入判别电路，其输入为8421BCD码，要求当输入大于或等于6时，判别电路输出为１，反之为０。

```vhdl
library IEEE;
use IEEE.STD_LOGIC_1164.ALL;

entity work4a is
port( a: in std_logic_vector(3 downto 0);
  b: out std_logic );
end work4a;

architecture Behavioral of work4a is
begin
process(a)
begin
 case a is
  when "0000"=> b <='0';
  when "0001"=> b <='0';
  when "0010"=> b <='0';
  when "0011"=> b <='0';
  when "0100"=> b <='0';
  when "0101"=> b <='0';
  when others=>b <='1';
 end case;
end process;
end Behavioral;

```

![mark](http://mally.oss-cn-qingdao.aliyuncs.com/PicGo上传的图片/20200611/145211317.png)

2、用VHDL语言设计四个开关控制一盏灯的逻辑电路，要求改变任意开关的状态能够引起灯亮灭状态的改变。（即任一开关的合断改

变原来灯亮灭的状态，参考电路原理图如图4.2所示。）

![mark](http://mally.oss-cn-qingdao.aliyuncs.com/PicGo上传的图片/20200611/145914951.png)



 思路分析：

最开始的时候肯定是所有开关都是关闭的，就是0000，那么灯是灭的，只

要有一个开关打开了，灯就亮了，也就是1000，0100，0010，0001时，灯是亮的；

如果此时再打开一个开关，那么灯就是灭的，即有2个1时，灯必定是灭的；

若有3个1，在2个1的基础上知道，必定是亮的；

同理推得4个1，灯是灭的。

可见只要是偶数个1就能使得灯是灭的。

观察电路图，它是采用异或的方式，(a^b)^(c^d),我们来倒证试试。

因为异或运算 符合交换律和结合律，因此可以去除括号，得到 a^b^c^d;

那么可以把1的都排在前面，即比如2个1时，1^1^0^0，又因为1^1=0,因此可以知道只要有偶数个1，01的异或结果就会为0.

故而，我们可以用异或性质简化算法。

(C语言中使用异或特性实现巧妙的去重，见https://blog.csdn.net/weixin_44034328/article/details/104162751)



<一>浅显版

```vhdl
library IEEE;
use IEEE.STD_LOGIC_1164.ALL;

entity work4a is
port( a: in std_logic_vector(3 downto 0);
  b: out std_logic );
end work4a;

architecture Behavioral of work4a is
begin
process(a)
begin
 case a is
  when "0001"=> b <='1';
  when "0010"=> b <='1';
  when "0100"=> b <='1';
  when "1000"=> b <='1';
  when "1110"=> b <='1';
  when "1101"=> b <='1';
  when "1011"=> b <='1';
  when "0111"=> b <='1';
  when others=>b <='0';
 end case;
end process;
end Behavioral;

```

<二>巧妙版

```vhdl
library IEEE;
use IEEE.STD_LOGIC_1164.ALL;

entity work4b is
port( a: in std_logic_vector(3 downto 0);
  Y: out std_logic );
end work4b;

architecture Behavioral of work4b is
begin
	Y <= a(0) xor a(1) xor a(2) xor a(3); 
end architecture Behavioral;

```

![mark](http://mally.oss-cn-qingdao.aliyuncs.com/PicGo上传的图片/20200611/174627675.png)

图4.2 灯控参考电路

3、用VHDL语言设计一个优先排队电路，其中：A=1，最高优先级；B=1，次高优先级；C=1，  最低优先级。要求输出端最多只能有一端为“１”，即只能是优先级较高的输入端所对应的输出端为“１”。

```
LIBRARY IEEE;
USE IEEE.STD_LOGIC_1164.ALL;
ENTITY exp4c IS
PORT (A, B, C : IN STD_LOGIC;
		QA,QB,QC : OUT STD_LOGIC);
END ENTITY exp4c;

ARCHITECTURE ONE OF exp4c IS
	BEGIN 
	PROCESS(A,B,C)
		BEGIN
			
			QA <='0';
			QB <='0';
			QC <='0';
			
			IF(A='1')
			THEN QA<='1' ;
			
			ELSIF (B='1')
			THEN QB <= '1';
			
			ELSIF (C='1')
			THEN QC <= '1';
			END IF;
	
	END PROCESS;
END ARCHITECTURE ONE;

```





![mark](http://mally.oss-cn-qingdao.aliyuncs.com/PicGo上传的图片/20200515/082131999.png)

4、自行设计纪录方式，完成实验报告

*四、实验研究与思考*

1、CPLD和FPGA有什么差别？设计中应该注意什么问题？

（1）在结构上，CPLD是宏单元结构，是一种可编程逻辑器件，它可以在制造完成后由用户根据自己需要定义其逻辑功能。

​		FPGA是查找表结构，解决了定制电路的不足，又可u了原有可编程器件门电路数有限的缺点。

（2）CPLD更适合完成各种算法和组合逻辑，FPGA更适合于完成时序逻辑。

（3）FPGA掉电后将丢失原有的逻辑信息二CPLD却能保持原有的逻辑信息。

FPGA是大规模可编程逻辑器件的另一大类PLD器件，其逻辑规模比CPLD大得多，应用范围也更宽。

2、图形设计方法中采用LPM设计有什么好处？

 



## 实验五 扫描显示驱动电路

**一、实验目的**

1、了解实验系统中8位八段数码管显示模块的工作原理；

2、掌握计数器和地址发生器的VHDL描述方法；

3、掌握LED数码管7段译码器的VHDL描述方法；

4、掌握编码器的VHDL描述方法；

5、设计标准扫描驱动电路模块，以备后面实验用。

**二、实验仪器**

PC机一台　QuartusII　软件  EDA实验箱

**三、实验内容**

图6.1所示的是8位数码扫描显示电路，其中每个数码管的8个段：h、g、f、e、d、c、b、a（h是小数点）都分别连在一起，8个数码管分别由8个选通信号k1、k2、…k8来选择。被选通的数码管显示数据，其余关闭。如在某一时刻，k3为高电平，其余选通信号为低电平，这时仅k3对应的数码管显示来自段信号端的数据，而其它7个数码管呈现关闭状态。根据这种电路状况，如果希望在8个数码管显示希望的数据，就必须使得8个选通信号k1、k2、…k8分别被单独选通，并在此同时，在段信号输入口加上希望在该对应数码管上显示的数据，于是随着选通信号的扫变，就能实现扫描显示的目的。其VHDL示例程序如程序10.1所示。

![图6.1 8位数码扫描显示电路图](http://mally.oss-cn-qingdao.aliyuncs.com/PicGo上传的图片/20200519/204713322.png) 



1、实验内容1：理解程序中各语句的含义，以及该例的整体功能。对该例进行编辑、编译、综合、适配、仿真，给出仿真波形。

2、自行设计纪录方式，完成实验报告

【例5.1】

```vhdl
LIBRARY IEEE;
USE IEEE.STD_LOGIC_1164.ALL;
USE IEEE.STD_LOGIC_UNSIGNED.ALL;
ENTITY SCAN_LED IS                                    
    PORT (   CLK  : IN STD_LOGIC; 
              SG   : OUT STD_LOGIC_VECTOR(6 DOWNTO 0);   --段控制信号输出
              BT   : OUT STD_LOGIC_VECTOR(7 DOWNTO 0) );  --位控制信号输出
END;
ARCHITECTURE one OF SCAN_LED IS
    SIGNAL CNT8  : STD_LOGIC_VECTOR(2 DOWNTO 0); --CNT8随着时间增加
    SIGNAL    A  : INTEGER RANGE 0 TO 15;
BEGIN
P1:PROCESS( CNT8 )                                       --编码器
       BEGIN
         CASE  CNT8  IS
          WHEN "000" =>  BT <= "00000001" ; A <= 1 ;
          WHEN "001" =>  BT <= "00000010" ; A <= 3 ; 
          WHEN "010" =>  BT <= "00000100" ; A <= 5 ;
          WHEN "011" =>  BT <= "00001000" ; A <= 7 ;
          WHEN "100" =>  BT <= "00010000" ; A <= 9 ;
          WHEN "101" =>  BT <= "00100000" ; A <= 11 ;
          WHEN "110" =>  BT <= "01000000" ; A <= 13 ;
          WHEN "111" =>  BT <= "10000000" ; A <= 15 ;
          WHEN OTHERS =>  NULL ;
        END CASE ;
     END PROCESS P1;
P2:PROCESS(CLK)                                              --计数器
       BEGIN
          IF CLK'EVENT AND CLK = '1' THEN CNT8 <= CNT8 + 1;   
          END IF;
	   END PROCESS P2 ;   
P3:PROCESS( A )                                                 –-译码电路
       BEGIN
         CASE  A  IS
            WHEN 0  => SG <= "0111111";  WHEN 1  => SG <= "0000110"; 
       		WHEN 2  => SG <= "1011011";  WHEN 3  => SG <= "1001111"; 
        	WHEN 4  => SG <= "1100110";  WHEN 5  => SG <= "1101101"; 
        	WHEN 6  => SG <= "1111101";  WHEN 7  => SG <= "0000111";
        	WHEN 8  => SG <= "1111111";  WHEN 9  => SG <= "1101111"; 
        	WHEN 10 => SG <= "1110111";  WHEN 11 => SG <= "1111100";
        	WHEN 12 => SG <= "0111001";  WHEN 13 => SG <= "1011110"; 
        	WHEN 14 => SG <= "1111001";  WHEN 15 => SG <= "1110001";
        	WHEN OTHERS =>  NULL ;
      END CASE ;
       END PROCESS P3;    
END;
```



例6.1是扫描显示的示例程序，其中clk是扫描时钟；SG为7段控制信号，由高位至低位分别接g、f、e、d、c、b、a 7个段；BT是位选控制信号，接图5-20中的8个选通信号：k1、k2、…k8 。程序中CNT8是一个3位计数器，作扫描计数信号，由进程P2生成；进程P3是7段译码查表输出程序，与例5-18相同；进程P1是对8个数码管选通的扫描程序，例如当CNT8等于"001" 时，K2对应的数码管被选通，同时，A被赋值3，再由进程P3译码输出"1001111"，显示在数码管上即为“3”；当CNT8扫变时，将能在8个数码管上显示数据：13579BDF 。

四、实验研究与思考

1、字形编码的种类，即一个8段数码管可产生多少种字符，产生所有字符需多少根译码信号线？

可产生$2^8=256$ 种字符，至少需要8根译码信号线。但假如只编译0-F，16个字符，则至少只需要4根译码信号线。

2、字符显示亮度和扫描频率的关系，且让人感觉不出光烁现象的最低扫描频率是多少？

扫描频率越高，显示亮度越低。人眼看是否闪烁于所用的时钟和分频方式有关，在频率稳定和分频均匀的情况下，最低扫描频率为256HZ，若分频不均匀或不稳定，则需要更高的频率

3、扫描显示和静态显示有什么差别？使用扫描显示有什么好处？ 

(1)显示不同

LED显示屏静态扫du描：系统在每一次显示输出后，能保持显示不变，仅仅在待显示数字需要改变时，才更新其数字显示器中锁存的内容。

LED显示屏动态扫描：CPU需定时地对每位LED显示器进行扫描，每位LED显示器分时轮流工作，每次只能使一位LED显示，但由于人眼视觉暂留现象，仍感觉所有的LED显示器都同时显示。

 （2）优点不同

LED显示屏静态扫描：显示占用CPU时间少，显示稳定可靠。

LED显示屏动态扫描：显示的是使用硬件少，占用 I/O少。

（3）缺点不同

LED显示屏静态扫描：当显示位数较多时，占用I/O较多。

LED显示屏动态扫描：占用CPU时间长，只要不执行显示程序，就立刻停止显示。

五.仿真图

![mark](http://mally.oss-cn-qingdao.aliyuncs.com/PicGo上传的图片/20200519/210620517.png)



## *实验六 函数信号发生器*

 

*一、实验目的*

1、了解函数信号发生的方法。

2、掌握LPM_ROM的使用方法。

3、了解DAC0832的工作原理和控制时序。

4、掌握DAC0832的控制时序的VHDL设计实现方法。

5、了解低通滤波电路的原理及其在信号发生中的应用。

2、熟悉SignalTap II测试方法。

*二、实验仪器*

计算机、QuartusII软件、EDA试验箱、示波器。

三、实验内容

1、在Quartus II上完成正弦信号发生器设计，包括仿真和资源利用情况了解（假设利用Cyclone器件）。最后在实验系统上实测。示例程序如例9.1，

【例9.1】 正弦信号发生器顶层设计

```vhdl
//正弦信号发生器顶层设计
LIBRARY IEEE;                                           --正弦信号发生器源文件
USE IEEE.STD_LOGIC_1164.ALL;
USE IEEE.STD_LOGIC_UNSIGNED.ALL;
ENTITY signt2 IS
      PORT ( CLK  : IN STD_LOGIC;                           --信号源时钟
            DOUT : OUT STD_LOGIC_VECTOR (7 DOWNTO 0) );  --8位波形数据输出
END;
ARCHITECTURE DACC OF signt2 IS
COMPONENT data_rom                --调用波形数据存储器LPM_ROM文件：data_rom.vhd声明
PORT(address : IN STD_LOGIC_VECTOR (5 DOWNTO 0) ;   --6位地址信号
	         clock : IN STD_LOGIC ;                           --地址锁存时钟
	              q : OUT STD_LOGIC_VECTOR (7 DOWNTO 0)	);
END COMPONENT;
    SIGNAL Q1 : STD_LOGIC_VECTOR (5 DOWNTO 0);            --设定内部节点作为地址计数器
    BEGIN
PROCESS(CLK )                                          --LPM_ROM地址发生器进程
        BEGIN
IF CLK'EVENT AND CLK = '1' THEN  Q1<=Q1+1;       --Q1作为地址发生器计数器
END IF;
END PROCESS;
u1 : data_rom PORT MAP(address=>Q1, q => DOUT,clock=>CLK); --例化
END;
```

**四、实验研究与思考**

1、采用本方法估计可以产生的正弦波的频率能到多少？

2、若要产生任意信号波形和高速波形输出应该注意什么问题？

​	要注意注意DA的速度是否能满足条件。



五.实验结果

在exp6b中

![mark](http://mally.oss-cn-qingdao.aliyuncs.com/PicGo上传的图片/20200522/143512054.png)



## AD实验

因为做的不是心满意足，就记录一下可以分享的经验吧

AD使用过程

1.如果打开后发现没有右侧栏了， 选择察看>桌面布局>Default

<img src="C:%5CUsers%5C53055%5CAppData%5CRoaming%5CTypora%5Ctypora-user-images%5Cimage-20200618082952097.png" alt="image-20200618082952097" style="zoom: 50%;" />

 再把弹出来的框拉到右边去，

然后一般是把器件库给固定 。![image-20200618083149611](C:%5CUsers%5C53055%5CAppData%5CRoaming%5CTypora%5Ctypora-user-images%5Cimage-20200618083149611.png)



2.给工程添加新的。。。

![mark](http://mally.oss-cn-qingdao.aliyuncs.com/PicGo上传的图片/20200618/092238853.png)

原理图：让人更直观的看到电路的连接方案，用来检查电器连接是否正确

因此画PCB元器件库很关注它的外表是什么样的，而画原理图库时器件的外观可以随意，因为只时用它做原理上的解释

3.这2个官方元器件库比较常用

Devicess主要是元器件，Connectors主要是插件

![mark](http://mally.oss-cn-qingdao.aliyuncs.com/PicGo上传的图片/20200618/093217993.png)

（记住常用的，比如header是排针）

4.快捷键，p是连线

5.自己画原理图库（杜洋视频第2集）

* 添加引脚时，鼠标要朝外；

* 按Tab键可以设置引脚名称，还可以修改引脚长度

画好之后，左栏里的放置就可以添加到原理图库了。

<img src="http://mally.oss-cn-qingdao.aliyuncs.com/PicGo上传的图片/20200618/100245583.png" alt="mark" style="zoom: 67%;" />

![mark](http://mally.oss-cn-qingdao.aliyuncs.com/PicGo上传的图片/20200618/101347689.png)

6.推荐学习 [杜样的AD视频](https://www.bilibili.com/video/BV1zJ411g7Fu?from=search&seid=861364181860909470) 来入门，封装没有就去立创EDA下载。