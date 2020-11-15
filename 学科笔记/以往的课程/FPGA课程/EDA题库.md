##  EDA题库

## 说明

水课一门，本人也是考前小白翻书查的，有错请多指教在评论区回复，分享一下题库
选择题序号改变，总共有88道，其中问过老师的有==高亮==

[TOC]



![mark](http://mally.oss-cn-qingdao.aliyuncs.com/PicGo上传的图片/20200629/114639359.png)

#### 一. 填空题(24)

1. 一般把EDA技术的发展分为（CAD）、（CAE）和（EDA）三个阶段。

    > CAD （Computer aided design）计算机辅助设计，
    >
    > CAE(Computer aided engineering)计算机辅助工程，
    >
    > EDA(Electronic Design Automation)电子设计自动化技术

2. EDA设计流程包括 （设计准备） 、（设计输入）、 （设计处理） 和（器件编程）  四个步骤。

3. 时序仿真是在设计输入完成之后，选择具体器件并完成布局、布线之后进行的时序关系仿真,因此又称为 （时序仿真）。  

4. VHDL的数据对象包括 （变量） 、（常量） 和 （信号），它们是用来存放各种类型数据的容器。  

5. 图形文件设计结束后一定要通过（仿真），检查设计文件是否正确。 

6. 以EDA方式设计实现的电路设计文件，最终可以编程下载到（FPGA）或者（CPLD）芯片中，完成硬件设计和验证。 

7. VHDL源程序的文件名应与（实体名）相同，否则无法通过编译。
8. 常用 EDA 的设计输入方式包括（文本输入方式）、（图形输入方式）、（波形输入方式） 。 
9. 在 VHDL 程序中，（实体）和（结构体）是两个必须的基本部分。 
10. 将硬件描述语言转化为硬件电路的重要工具软件称为 （HDL 综合器）。 
11. VHDL 的数据对象分为（常量）、（变量）和（信号）3 类。 
12. VHDL 的 操作 符 包括 （算术 运算 符 ）和 （符号运算符） 。
13. 常用硬件描述语言有（Verilog HDL）、（AHDL）以及（VHDL）。 

	> AHDL已经过时，Vreilog HDL是类c语言，而VHDL是类ADA语言。

14. VHDL基本语句有（顺序语句）、 （并行语句）和属性自定义语句。
15. VHDL 同或逻辑操作符是 （XNOR）。 
16. 一个完整的VHDL程序应包含三个基本部分，即库文件说明、（程序包应用说明）和（实体和结构体说明）。 
17. VHDL 不等于关系运算符是  （ /= ） 。 
18. STD_LOGIC_1164程序包是 （IEEE  ）  库中最常用的程序包。  
19. 文本输入是指采用（硬件描述语言） 进行电路设计的方式。
20. 当前最流行的并成为IEEE标准的硬件描述语言包括（vhdl） 和 （verilog） 。
21. 采用PLD进行的数字系统设计，是基于（芯片）的设计或称之为（自底向上） 的设计。

	> PLD(Programmable Logic Devices)可编程逻辑器件

22. 硬件描述语言HDL给PLD和数字系统的设计带来了更新的设计方法和理念，产生了目前最常用的并称之为（自顶向下）的设计法。

23. EDA工具大致可以分为（设计输入编辑器） 、（仿真器） 、 （hdl综合器） 、 （适配器） 以及 （下载器） 等5个模块。

24. 将硬件描述语言转化为硬件电路的重要工具软件称为（HDL综合器）



#### 二.选择题(88)

1. 基于EDA软件的FPGA/CPLD设计流程为：原理图/HDL文本输入→________→综合→适配→__________→编程下载→硬件测试。

    A. 功能仿真					B. 时序仿真

    C. 逻辑综合					D. 配置

    > 解：A,B
    >
    > 功能仿真是程序设计完，时序仿真是步线完
    >
    > 课本第7页

2. IP核在EDA技术和开发中具有十分重要的地位；提供用VHDL等硬件描述语言描述的功能块，但不涉及实现该功能块的具体电路的IP核为__________。

    A. 软IP						B. 固IP

    C. 硬IP						D. 全对

    > A,课本P25

3. 综合是EDA设计流程的关键步骤，在下面对综合的描述中，_________是错误的。

    A. 综合就是把抽象设计层次中的一种表示转化成另一种表示的过程。

    B. 综合就是将电路的高级语言转化成低级的，可与FPGA / CPLD的基本结构相映射的网表文件。

    C. 为实现系统的速度、面积、性能的要求，需要对综合加以约束，称为综合约束。

    D. 综合可理解为，将软件描述与给定的硬件结构用电路网表文件表示的映射过程，并且这种映射关系是唯一的（即综合结果是唯一的）。

    > D,课本P7

4. 大规模可编程器件主要有FPGA、CPLD两类，其中CPLD通过_______实现其逻辑功能。

    A. 可编程乘积项逻辑			B. 查找表（LUT）

    C. 输入缓冲					D. 输出缓冲

    > A,课本P15

5. ==VHDL语言是一种结构化设计语言；一个设计实体（电路模块）包括实体与结构体两部分，结构体描述___________。==

    A. 器件外部特性				B. 器件的内部功能   

    C. 器件外部特性与内部功能	D. 器件的综合约束

    > B，实体描述的是器件的外部特性，就是端口，结构体描述的是器件内部功能

6. 电子系统设计优化，主要考虑提高资源利用率减少功耗（即面积优化），以及提高运行速度（即速度优化）；下列方法中________不属于面积优化。

    A. 流水线设计				B. 资源共享

    C. 逻辑优化					D. 串行化

    > A,  面积优化就是资源优化，看目录第7章

7. 进程中的信号赋值语句，其信号更新是_________。

    A. 立即完成					B. 在进程的最后完成

    C. 按顺序完成				D. 都不对

    > B

8. 不完整的IF语句，其综合结果可实现________。

    A. 时序逻辑电路				B. 组合逻辑电路

    C. 双向电路					D. 三态控制电路

    > A

9. 状态机编码方式中，其中_________占用触发器较多，但其简单的编码方式可减少状态译码组合逻辑资源，且易于控制非法状态。

   A. 一位热码编码				B. 顺序编码

   C. 状态位直接输出型编码		D. 格雷码编码

	> A，课本P232

10. 以下不属于FPGA结构组成部分的是？（  ）

    A.可编程逻辑模块（CLB）B.可编程I/O单元（IOB）

    C.可编程内部连线（PIA）D.可编程逻辑宏单元（LAB）

    > D
    >
    > 来源于https://baike.baidu.com/item/FPGA/935826?fr=aladdin#2&qq-pf-to=pcqq.c2c
    >
    > FPGA采用了[逻辑单元](https://baike.baidu.com/item/逻辑单元)阵列LCA（Logic Cell Array）这样一个概念，内部包括可配置逻辑模块
    >
    > [ ![img](https://bkimg.cdn.bcebos.com/pic/bba1cd11728b4710667f121fcdcec3fdfd032395?x-bce-process=image/resize,m_lfit,w_220,h_220,limit_1) ](https://baike.baidu.com/pic/FPGA/935826/0/bba1cd11728b4710667f121fcdcec3fdfd032395?fr=lemma&ct=single)
    >
    > CLB（Configurable Logic Block）、输入输出模块IOB（Input Output Block）和内部连线（Interconnect）三个部分。 现场可编程门阵列（FPGA）是可编程器件，与传统逻辑电路和门阵列（如PAL，GAL及CPLD器件）相比，FPGA具有不同的结构。FPGA利用小型查找表（16×1RAM）来实现组合逻辑，每个查找表连接到一个D[触发器](https://baike.baidu.com/item/触发器)的输入端，触发器再来驱动其他逻辑电路或驱动I/O，由此构成了既可实现组合逻辑功能又可实现时序逻辑功能的基本[逻辑单元](https://baike.baidu.com/item/逻辑单元)模块，这些模块间利用金属连线互相连接或连接到I/O模块。FPGA的逻辑是通过向内部静态[存储单元](https://baike.baidu.com/item/存储单元)加载编程数据来实现的，存储在存储器单元中的值决定了逻辑单元的逻辑功能以及各模块之间或模块与I/O间的联接方式，并最终决定了FPGA所能实现的功能，FPGA允许无限次的编程。

11. 下列对VHDL语句结构和语法规则的描述，不正确的是（  ）

A.进程是由说明部分、结构体和敏感信号三部分组成；

B.信号名称由英文字母、数字和下划线符号三种类型字符组成；

C.信号方向类型定义可分为输入信号（in）、输出信号（out）、输入/输出信号（inout）和反馈输出信号（buffer）四种；

D.描述电路功能实现的结构体区，需要用关键字Architecture声明；

> A，课本P29

12. 在CPLD/FPGA两类可编程逻辑实现技术中，CPLD是基于（  ）

A.乘积项结构						B.查找表（LUT）

C.输入输出缓存					D.静态存储器结构（SRAM）

> A  ，fpga是基于查找表逻辑结构LUT

13. Altium Designer是用于设计（  ）的工具软件？

A.电气工程B.电子工程

C.机械工程D.建筑工程

> B

14. 下面哪种说法不正确？（  ）

A.一个FPGA项目可以包含一个或多个PCB项目

B.一个PCB项目可以包含一个或多个FPGA项目

C.一个FPGA项目可以包含一个或多个软处理器核

D.一个软处理器核内只可以包含一个嵌入式项目

> A

==15. 用VHDL语法执行算术运算函数时，需要调用的程序包是（  ）==

A.std_logic_1164					B.std_logic_arith

C.std_logic_unsigned		  D.std_logic_signed

> B，
>
> 在后面的大题中，有因为用了‘+’而要引入std_logic_unsigned
>
> 如果能确定引入的算术是做无符号运算，就用 std_logic_unsigned，
>
> 但如果不能确定是否无符号，就得用std_logic_arith，也就是说它包含无符号和有符号运算符号

16. 在VHDL电路设计中，CASE-WHEN语句是（  ）

A.顺序执行语句B.并行执行语句

C.循环执行语句D.移位执行语句

> A，case语句比if更快，执行更接近于并行方式，课本P54

17. Altium Designer不支持的可编程器件供应商是（  ）

A. Altera	B. Atmel	C. Microsemi	D. Lattice

> B

18. 在VHDL电路设计中，顺序执行语句是（  ）

A.For –Loop	B. When –Else		C. With –Select		D. For –Generate

> A
>
> <img src="http://mally.oss-cn-qingdao.aliyuncs.com/PicGo上传的图片/20200626/225413030.png" alt="mark" style="zoom:50%;" />



19. 一个项目的输入输出端口是定义在（ A ）

A. 实体中；.B. 结构体中；C. 任何位置；D. 进程中。

20. MAXPLUS2中编译VHDL源程序时要求( C )

A. 文件名和实体可以不同名；B. 文件名和实体名无关；C. 文件名和实体名要相同；D. 不确定。

###### 21th

21. VHDL语言中变量定义的位置是( D )

A. 实体中中任何位置；B. 实体中特定位置；C. 结构体中任何位置；D. 结构体中特定位置。

22. 可以不必声明而直接引用的数据类型是( C )

    A. STD_LOGIC ；B. STD_LOGIC_VECTOR；	C. BIT；	D. ARRAY。 

    > 课本P44,  在定义BIT或BIT_VECTOR类型时，程序不需要显示打开包

23. MAXPLUS2不支持的输入方式是( D )

	A 文本输入；.B. 原理图输入；C. 波形输入；D. 矢量输入。 

24. 大规模可编程器件主要有FPGA、CPLD两类，下列对FPGA结构与工作原理的描述中，正确的是( C )

    A.  FPGA全称为复杂可编程逻辑器件；												B.  FPGA是基于乘积项结构的可编程逻辑器件；
	C. 基于SRAM的FPGA器件，在每次上电后必须进行一次配置；   D. 在Altera公司生产的器件中，MAX7000系列属FPGA结构。 
    
> C出现在课本P12,这是CPLD和FPGA的区别

25. 下面不属于顺序语句的是( C )

    A.  IF语句；B.  LOOP语句；C. PROCESS语句；D. CASE语句。 

    > 一个结构体中可以含有多个process结构，process结构本身是并行语句，而vhdl中的所有顺		  序描述语句都必须放在进程语句中

26. VHDL语言是一种结构化设计语言；一个设计实体（电路模块）包括实体与结构体两部分，实体描述的是( A )

    A. 器件外部特性；B. 器件的内部功能；C. 器件的综合约束；D. 器件外部特性与内部功能。 

27. 进程中的信号赋值语句，其信号更新是(C )

    A. 按顺序完成；B. 比变量更快完成；C. 在进程的最后完成；D. 都不对。 

28. 嵌套使用IF语句，其综合结果可实现：( A )

    A. 带优先级且条件相与的逻辑电路；

    B. 条件相或的逻辑电路；C. 三态控制电路；D. 双向控制电路。



29. 综合是EDA设计流程的关键步骤，在下面对综合的描述中，__D___是错误的。
    A. 综合就是把抽象设计层次中的一种表示转化成另一种表示的过程；
    B. 综合就是将电路的高级语言转化成低级的，可与FPGA / CPLD的基本结构相映射的网表文件；
    C.为实现系统的速度、面积、性能的要求，需要对综合加以约束，称为综合约束；
    D. 综合可理解为一种映射过程，并且这种映射关系是唯一的，即综合结果是唯一的。
30. 大规模可编程器件主要有FPGA、CPLD两类，下列对FPGA结构与工作原理的描述中，正确的是__C__。
    A. FPGA全称为复杂可编程逻辑器件； 											B. FPGA是基于乘积项结构的可编程逻辑器件；
    C.基于SRAM的FPGA器件，在每次上电后必须进行一次配置；D. 在Altera公司生产的器件中，MAX7000系列属FPGA结构。
31. 进程中的信号赋值语句，其信号更新是___C___。
    A.按顺序完成；B.比变量更快完成；C.在进程的最后完成；D.都不对。    
32. VHDL语言是一种结构化设计语言；一个设计实体（电路模块）包括实体与结构体两部分，结构体描述   B______。
    A. 器件外部特性；B.器件的内部功能；C. 器件的综合约束；D.器件外部特性与内部功能
33. 子系统设计优化，主要考虑提高资源利用率减少功耗（即面积优化），以及提高运行速度（即速度优化）；指出下列哪些方法是面积优化  B。
     ①流水线设计 ②资源共享 ③逻辑优化 ④串行化 ⑤寄存器配平⑥关键路径法
    A. ①③⑤  B. ②③④C. ②⑤⑥    D. ①④⑥
34. 下列标识符中，B______是不合法的标识符。
    A. State0        B. 9moon    C. Not_Ack_0        D. signall

	> B错误在数字开头

35. 关于VHDL中的数字，请找出以下数字中最大的一个：A。
    A. 2#1111_1110#	B. 8#276#	C. 10#170# 	D. 16#E#E1

    > 在课本P36有详细计算方法
    >
    > A选项：B11111110=D254
    >
    > B选项:	O276=D190
    >
    > C选项：D170
    >
    > D选项：H E0=D224
    >
    > 因此A最大

36. 下列EDA软件中，哪一个不具有逻辑综合功能：____B。
    A. Max+Plus IIB. ModelSimC.    Quartus IID.    Synplify







37. ==大规模可编程器件主要有FPGA、CPLD两类，下列对CPLD结构与工作原理的描述中，正确的是_______。==
        A. CPLD是基于查找表结构的可编程逻辑器件；
        B. CPLD即是现场可编程逻辑器件的英文简称；
        C. 早期的CPLD是从GAL的结构扩展而来；
        D. 在Xilinx公司生产的器件中，XC9500系列属CPLD结构

	> CD，课本原话P15有说c是对的

38. 综合是EDA设计流程的关键步骤，综合就是把抽象设计层次中的一种表示转化成另一种表示的过程；在下面对综合的描述中，_________是正确的。
    A. 综合就是将电路的高级语言转化成低级的，可与FPGA / CPLD的基本结构相映射的网表文件.
    B. 综合是纯软件的转换过程，与器件硬件结构无关；
    C. 为实现系统的速度、面积、性能的要求，需要对综合加以约束，称为强制综合。
    D. 综合可理解为，将软件描述与给定的硬件结构用电路网表文件表示的映射过程，并且这种映射关系是唯一的；

	> A

___
39.  IP核在EDA技术和开发中具有十分重要的地位，IP分软IP、固IP、硬IP；下列所描述的IP核中，对于硬IP的正确描述为______。
    A.提供用VHDL等硬件描述语言描述的功能块，但不涉及实现该功能块的具体电路；
    B. 提供设计的最总产品----模型库；
    C.以网表文件的形式提交用户，完成了综合的功能块；
    D. 都不是。

	> D 课本P25

40. 基于EDA软件的FPGA / CPLD设计流程为：原理图/HDL文本输入→________→综合→适配→__________→编程下载→硬件测试。
    ①功能仿真  ②时序仿真③逻辑综合④配置⑤引脚锁定
        A．③①  B. ⑤②    C.④⑤      D. ①②    

	>D，课本P25

41. 下面对利用原理图输入设计方法进行数字电路系统设计，那一种说法是不正确的______。
    A. 原理图输入设计方法直观便捷，但不适合完成较大规模的电路系统设计； B. 原理图输入设计方法一般是一种自底向上的设计方法；
    C. 原理图输入设计方法无法对电路进行功能描述；												D.原理图输入设计方法也可进行层次化设计。

	> C

42. 在VHDL语言中，下列对进程（PROCESS）语句的语句结构及语法规则的描述中，不正确的是_______。
    A. PROCESS为一无限循环语句；敏感信号发生更新时启动进程，执行完成后，等待下一次进程启动。
    B. 敏感信号参数表中，不一定要列出进程中使用的所有输入信号；
    C. 进程由说明部分、结构体部分、和敏感信号三部分组成；
    D.当前进程中声明的变量不可用于其他进程。

    > C，结构体包含进程，
    >
    > 除了没有方向说明外，信号与端口port的概念一直，它们的使用和定义范围是实体，结构体和程序包，因此在进程中不允许定义信号，只准将信号列入敏感表

43. 嵌套使用IF语句，其综合结果可实现________。
    A. 带优先级且条件相与的逻辑电路；B. 条件相或的逻辑电路；C.三态控制电路；D.双向控制电路。

> A

44. ==电子系统设计优化，主要考虑提高资源利用率减少功耗----即面积优化，以及提高运行速度----即速度优化；指出下列那种方法不属于速度优化：___________。==
    A. 流水线设计B. 串行化C.  关键路径法    D. 寄存器配平

> B，  AC在书上可以找到是速度优化，而B是降低速度，实现面积优化（资源优化），D书中没有，（此题问过老师）

45. 在一个VHDL设计中idata是一个信号，数据类型为integer，数据范围0 to 127，下面哪个赋值语句是正确的________。
    A. idata := 32;   B. idata <= 16#A0#;	C. idata <= 16#7#E1;	D. idata := B#1010#;

> C，课本36
>
> 因为 HA0=D160,大于127，故B错





46. 在VHDL标识符命名规则中，以（　　　）开头的标识符是正确的．
    Ａ．字母　　　　Ｂ．数字　　　　　Ｃ．汉字　　　　　Ｄ．下划线

> A

47. 在下列标识符中，（     ）是VHDL合法标识符．
    Ａ．4h_adde     B．h_adde4_        Ｃ．h_adder_4           Ｄ．_h_adde

> C

48. 在下列标识符中，（    ）是VHDL错误的标识符．
    Ａ．4h_adde     B．h_adde4        Ｃ．h_adder_4           Ｄ．h_adde

> A，因为它以数字开头

49. VHDL程序中的中间信号必须在__________中定义，变量必须在__________中定义．（      ）
    Ａ．实体  进程         B．结构体  进程        Ｃ．进程  进程       Ｄ．结构体  结构体

> B

50. 在VHDL中，目标变量的赋值符号是（　　）．
    Ａ．＝：　　　　Ｂ．＝　　　　　　Ｃ．：＝　　　　　　Ｄ．＜＝

> C

51. 在VHDL中，目标信号的赋值符号是（　　　）．
    Ａ．＝：　　　　Ｂ．＝　　　　　　Ｃ．：＝　　　　　　Ｄ．＜＝

> D

52. 在VHDL的FOR_LOOP语句中的循环变量是一个临时变量，属于LOOＰ语句的局部变量，（　　　）事先声明．
    Ａ．必须　　　　Ｂ．不必　　　　　Ｃ．其类型要　　　　　　Ｄ．其属性要

>B



53. 大规模可编程器件主要有FPGA、CPLD两类，下列对CPLD结构与工作原理的描述中，正确的是：___ _
    	A. CPLD是基于查找表结构的可编程逻辑器件
    	B. CPLD即是现场可编程逻辑器件的英文简称
    	C. 早期的CPLD是从FPGA的结构扩展而来
    	D. 在Xilinx公司生产的器件中，XC9500系列属CPLD结构

> D

54. 基于VHDL设计的仿真包括有①门级时序仿真、②行为仿真、③功能仿真和④前端功能仿真这四种，按照自顶向下的设计流程，其先后顺序应该是：_________
    	A．①②③④		B.②①④③		C．④③②①		D．②④③①

> D

55. IP核在EDA技术和开发中具有十分重要的地位，IP分软IP、固IP、硬IP；下列所描述的IP核中，对于固IP的正确描述为：__________
     A．提供用VHDL等硬件描述语言描述的功能块，但不涉及实现该功能块的具体电路
    B．提供设计的最总产品——模型库
    C．以可执行文件的形式提交用户，完成了综合的功能块
    D．都不是

> D

56. 下面对利用原理图输入设计方法进行数字电路系统设计，哪一种说法是正确的：_________
    A．原理图输入设计方法直观便捷，很适合完成较大规模的电路系统设计
    B．原理图输入设计方法一般是一种自底向上的设计方法
    C．原理图输入设计方法无法对电路进行功能描述
    D．原理图输入设计方法不适合进行层次化设计

>  B

57. ==在VHDL语言中，下列对进程（PROCESS）语句的语句结构及语法规则的描述中，不正确的是：_______==
    A．PROCESS为一无限循环语句
    B．敏感信号发生更新时启动进程，执行完成后，等待下一次进程启动

> 没有答案，AB说法都正确

58. 对于信号和变量的说法，哪一个是不正确的：_________
    	A．信号用于作为进程中局部数据存储单元
    	B．变量的赋值是立即完成的
    	C．信号在整个结构体内的任何地方都能适用
    	D．变量和信号的赋值符号不一样

> A

59. 下列状态机的状态编码，_________方式有“输出速度快、难以有效控制非法状态出现”这个特点。
    	A．状态位直接输出型编码
    	B．一位热码编码
    	C．顺序编码
    	D．格雷编码

> A

60. VHDL语言共支持四种常用库，其中哪种库是用户的VHDL设计现行工作库：_______
    	A．IEEE库
    	B．VITAL库
    	C．STD库
    	D．WORK工作库

> D

61. ==下列4个VHDL标识符中正确的是：_______==

A．10#128#				B．16#E#E1
C．74HC124				D．X_16

> 答案选D
>
> 由课本38页的标识符知识知
>
> AB错在含有#,标识符中不能由“#”
>
> C错在标识符必须以字母开头
>
> ###### :star:标识符命名规则
>
> 1.只能使用26个字母的大小写，数字以及下划线
> 2.必须以字母开头，
> 3.“_"前后必须有字母或数字
> 4.标识符不区分大小写
> 5.允许包含回车符，空格符，换行符



62. 下列语句中，不属于并行语句的是：______
    	A．进程语句
    	B．CASE语句
    	C．元件例化语句
    	D．WHEN…ELSE…语句

> B
> 



63. PLD主要有FPGA、CPLD两类，下列对CPLD结构与工作原理的描述中正确的是（B）
    A、	CPLD即是现场课编程逻辑器件的英文简称
    B、	CPLD是基于与或阵列的可编程逻辑器件
    C、	在Altera公司生产的器件中，ACEX系列属CPLD结构

64. 基于EDA软件的FPGA/CPLD设计流程为原理图HDL文本输入→综合→ A →时序仿真→编程下载→硬件测试。
    A、适配	B、语法分析	C、配置

65. 在EDA工具中，能将硬件描述语言转化为硬件电路的重要工具软件是（D）
    A、仿真器		B、下载器		C、适配器		D、综合器

66. VHDL常用的库是  C  标准库。
    A、WORK		B、STD	C、IEEE	D、PACKAGE

67. 在VHDL的CASE语句中条件句中的“=>”不是操作符，它只相当于 B
    A、IF		B、THEN		C、AND		D、OR

68. ==在VHDL中PROCESS语句内是由  (C) 语句组成的。==

    A、并行	B、顺序和并行		C、顺序	D、任向

    > process语句里必须放顺序语句，顺序语句里可以嵌套并行语句，
    >
    > 而B的意思的process里面顺序和并行是相同优先级，也就是可以只有并行语句，那显然是错的。

69. 下列那个流程是正确的基于EDA软件的FPGA / CPLD设计流程： B
    A. 原理图/HDL文本输入→适配→综合→功能仿真→编程下载→硬件测试
    B. 原理图/HDL文本输入→功能仿真→综合→适配→编程下载→硬件测试
    C. 原理图/HDL文本输入→功能仿真→综合→编程下载→→适配硬件测试；
    D. 原理图/HDL文本输入→功能仿真→适配→编程下载→综合→硬件测试

70. 综合是EDA设计流程的关键步骤，综合就是把抽象设计层次中的一种表示转化成另一种表示的过程；在下面对综合的描述中，_________是错误的。 

A. 综合就是将电路的高级语言转化成低级的，可与FPGA / CPLD的基本结构相映射的网表文件；
B. 为实现系统的速度、面积、性能的要求，需要对综合加以约束，称为综合约束；
C. 综合是纯软件的转换过程，与器件硬件结构无关；
D. 综合可理解为，将软件描述与给定的硬件结构用电路网表文件表示的映射过程，并且这种映射关系不是唯一的。 

> C

71. CPLD的可编程是主要基于什么结构：。
    A .查找表（LUT）；
    B. ROM可编程； 
    C. PAL可编程；
    D. 与或阵列可编程； 

> D

72. IP核在EDA技术和开发中具有十分重要的地位，以HDL方式提供的IP被称为：。
    A. 硬IP；
    B. 固IP；
    C. 软IP；
    D. 都不是；

> C,课本P25

73. ==在VHDL语言中，下列对时钟边沿检测描述中，错误的是_______。==
    A. if clk’event and clk = ‘1’ then
    B. if falling_edge(clk) then  
    C. if clk’event and clk = ‘0’ then
    D.if clk’stable and not clk = ‘1’ then

> D，第四个stable是稳定的状态，如果要用stable判断，前面得加not

74. 在一个VHDL设计中Idata是一个信号，数据类型为std_logic_vector，试指出下面那个赋值语句是错误的。
    A.  idata <= “00001111”
    B.  idata <= b”0000_1111”;
    C.  idata <= X”AB”
    D.  idata <= 16”01”;

> D。 应写成X"01",课本P37

75. 执行（   ）命令操作，元器件按垂直均匀分布。
     A.Vertically              B.Distribute Vertically	 C.Center Vertically   D.Distribute 

 > B

76. 执行( D )命令操作,元器件按底端对齐. 
    A.Align Right  B.Align Top  C.Align Left  D.Align Bottom
77. 执行( A)命令操作,元器件按右端对齐. 
    A.Align Right  B.Align Top   C.Align Left  D.Align Bottom 
78. 原理图设计时,实现连接导线应选择( B )命令. 
    A.Place /Line             B.Place/Wire     C.Wire               D.Line 
79. 进行原理图设计，必须启动（B  ）编辑器。
     A.PCB                     B.Schematic     C Schematic Library    D.PCB Library 
80. 往原理图图样上放置元器件前必须先（B  ）。 
    A.打开浏览器                      B.装载元器件库 
    C.打开PCB编辑器              D.创建设计数据库文件 
81. 印制电路板的（ B）层主要是作为说明使用。 
    A.Keep Out Layer                  B.Top Overlay   
    C.Mechanical Layers               D.Multi Layer 
82. 在放置元器件封装过程中，按（D  ）键使元器件封装旋转。 
    A.X          B.Y       C.L           D.空格键 
83. 在放置元器件封装过程中，按（  B）键使元器件在竖直方向上下翻转。 
    A.X          B.Y       C.L           D.空格键 
84. PCB的布局是指( B )。 
    A.连线排列                       B.元器件的排列 
    C.元器件与连线排列           D.除元器件与连线以外的实体排列 
85. Protel99 SE提供了多达（ C ）层为铜膜信号层。 
    A.2           B.16           C.32          D.8 
86. 在印制电路板的（B ）层画出的封闭多边形，用于定义印制电路板形状及尺寸。 
    A.Multi Layer         B. Mechanical Layers	 C.Top Overlay       D.Bottom overlay 
87. 印制电路板的（  B）层主要用于绘制元器件外形轮廓以及标识元器件标号等。该类层共有两层。 
    A.Keep Out Layer              B.Silkscreen Layers
     C.Mechanical Layers         D.Multi Layer 
88. 根据元器件的焊盘种类不同，元件封装可分为插针式元器件封装和（A ）两种类型。
     A. 表贴式元器件封装      B. 焊盘       C. 导线                  D.过孔

#### 三．判断题(8)

1. FPGA内主要由LUT和寄存器组成，倾向实现复杂时序逻辑电路设计，而CPLD内主要由乘积项逻辑组成，倾向实现组合逻辑电路设计。（对）

2. FPGA集成度和复杂度高于CPLD，所以FPGA可实现简单和低成本的逻辑电路设计，而CPLD适合复杂逻辑电路设计。 （错）

3. Mealy型状态机输出只当前状态有关，和输入无关。（错）

  > Mealy型状态机输出只当前状态（存储器）有关，和输入有关。
  >
  > MOOR型状态机输出只和当前状态有关。

4. MOOR型状态机输出不仅和当前状态有关，还和输入有关。（错）

5. CPLD的基本结构是查找表结构。（错）

6. FPGA的基本结构是乘积项选择矩阵。错

7. 信号具有全局性特征，它不但可以作为一个设计实体内部各单元之间数据传送的载体，而且可通过信号与其他的实体进行通信（对）。

8. 变量具有局部特征，它的有效只局限于所定义的一个进程中，或一个子程序中，它是一个局部的、暂时性数据对象。（对）

#### 四、VHDL程序填空(5)

1. 下面程序是1位十进制计数器的VHDL描述，试补充完整。

   ```vhdl
   LIBRARY IEEE;
   USE IEEE._____________.ALL;
   USE IEEE.STD_LOGIC_UNSIGNED.ALL;
   
   ENTITY CNT10 IS
   	PORT ( CLK : IN STD_LOGIC ;
   		    Q   : OUT STD_LOGIC_VECTOR(3 DOWNTO 0)) ;
   END CNT10;
   
   ARCHITECTURE bhv OF ______ IS
   	SIGNAL Q1 : STD_LOGIC_VECTOR(3 DOWNTO 0);
   BEGIN
   	PROCESS (CLK) 
   	_______
   		IF  __________________  THEN	-- 边沿检测
   			IF Q1 > 10 THEN
   				Q1 <= (OTHERS => '0');	-- 置零
   			ELSE
   				Q1 <= Q1 + 1 ;			-- 加1
   			END IF;
   		END IF;
   	END PROCESS ;
   	__________
   END bhv;
   ```

   

 > 关键词EVENT是信号属性函数，在IEEE库的STD_LOGIC_1164程序包里。  课本P57

   <img src="http://mally.oss-cn-qingdao.aliyuncs.com/PicGo上传的图片/20200627/001026293.png" alt="mark" style="zoom:67%;" />

2. 下面是一个多路选择器的VHDL描述，试补充完整。

   ```vhdl
   LIBRARY IEEE;
   USE IEEE.STD_LOGIC_1164.ALL;
   ENTITY bmux IS
   	PORT (	sel : ____ STD_LOGIC;
   			A, B : IN STD_LOGIC_VECTOR(7 DOWNTO 0);
   			Y	: ____ STD_LOGIC_VECTOR(___ DOWNTO 0)) ;
   END bmux;
   ARCHITECTURE bhv OF bmux IS
   BEGIN
   	y <= A when sel = '1' ______
              ______;
   END bhv;
   
   ```
   
   > <img src="https://img-blog.csdn.net/20180518101342672?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3UwMTI5MjM3NTE=/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70" alt="img" style="zoom:33%;" />  <img src="https://img-blog.csdn.net/20180518101412649?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3UwMTI5MjM3NTE=/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70" alt="img" style="zoom: 50%;" />
   >
   > when else条件信号赋值语句 是并行处理语句，只能用在architecture,block 中
   >
   > 答案如下
   >
   > <img src="http://mally.oss-cn-qingdao.aliyuncs.com/PicGo上传的图片/20200627/173711209.png" alt="mark" style="zoom:67%;" />
   
   

3.以下程序是一个BCD码表示0～99计数器的VHDL描述，试补充完整。（答案已给出）

![mark](http://mally.oss-cn-qingdao.aliyuncs.com/PicGo上传的图片/20200627/173950349.png)
> 1. 因为第22行 使用了+，故而要引入 ieee.std_logic_unsigned.all;
> 2. -- cqi:=(others=>'0')  等价于cqi:="00000000" --

```vhdl
LIBRARY IEEE;
USE IEEE.STD_LOGIC_1164.ALL;
use IEEE.STD_LOGIC_UNSIGNED.ALL;
ENTITY testcode IS
	PORT( clk,rst,en: in std_logic;
			cq: out std_logic_vector(7 downto 0);
			cout:out std_logic
		  );
END ENTITY testcode;

ARCHITECTURE bhv of testcode IS
BEGIN
	PROCESS(clk,rst,en)
		variable cqi:std_logic_vector(7 downto 0);
	BEGIN
	-- cqi:=(others=>'0')等价于cqi:="00000000" --
		if rst='1' then cqi:=(others=>'0');
		else 
			if clk'event and clk='1'then
					if en='1' then
						if cqi(3 downto 0) < "1001" then cqi:= cqi+1 ;
							else
								if cqi(7 downto 4 )<"1001" then cqi:=cqi+16;
									else cqi:= (others=>'0');
								end if;
								cqi(3 downto 0):="0000";
						end if;
					end if;
			end if;
		end if;
		if cqi="10011001" then cout<='1';
		else cout<='0';
		end if;
		cq <= cqi;
	end PROCESS;
end ARCHITECTURE bhv;
```



4.下面程序是可预置带计数使能异步复位加法计数器的VHDL描述，试补充完整：

![mark](http://mally.oss-cn-qingdao.aliyuncs.com/PicGo上传的图片/20200627/174358188.png)

```vhdl
LIBRARY IEEE;
USE IEEE.STD_LOGIC_1164.ALL;
ENTITY testcode IS
	PORT( data:in std_logic_vector(7 downto 0);
			load,en,clk,rst: in std_logic;
			q: out std_logic_vector(7 downto 0)
		  );
END ENTITY testcode;

ARCHITECTURE bhv of testcode IS
  signal cout: std_logic_vector(7 downto 0);
 begin
  process(clk,rst)
  begin
	if rst='1'then cout<="00000000";
		elsif clk'event and clk='1' then 
			if load='1'then cout<=data;
			elsif en='1'then cout<=count+1;
			end if;
		end if;
	end process;
	q<=count;
	
end ARCHITECTURE bhv;
```



5.下面程序是一个10线－4线优先编码器的VHDL描述，试补充完整。

![mark](http://mally.oss-cn-qingdao.aliyuncs.com/PicGo上传的图片/20200627/174519588.png)

```vhdl
LIBRARY IEEE;
USE IEEE.STD_LOGIC_1164.ALL;
ENTITY testcode IS
	PORT( din: in std_logic_vector(9 downto 0);
			output:out std_logic_vector(3 downto 0)
		  );
END ENTITY testcode;

ARCHITECTURE bhv of testcode IS
  signal SIN: std_logic_vector(3 downto 0);
 begin
  process(din)
  begin
	IF (din(9)='0') then SIN <= "1001";
			 ELSIF (din(8)=’0’) THEN  SIN <= "1000";
			 ELSIF (din(7)='0') THEN  SIN <= "0111"; 
          ELSIF (din(6)='0') THEN  SIN <= "0110"; 
          ELSIF (din(5)='0') THEN  SIN <= "0101";
          ELSIF (din(4)='0') THEN  SIN <= "0100";
          ELSIF (din(3)='0') THEN  SIN <= "0011";
          ELSIF (din(2)='0') THEN  SIN <= "0010";
          ELSIF (din(1)='0') THEN  SIN <= "0001";
          ELSE  SIN <= "0000";
   END IF;
  END PROCESS;
  Output <= sin;
		
end ARCHITECTURE bhv;
							
			
```



#### 五 . 简答题(14)

1. **硬件描述语言VHDL的特点是什么？** 

> 1.具有强大的语言结构，设计方法多样。只需要用简单明确的VHDL语言程序就可以描述十分复杂的硬件电路，它支持自顶下的设计方式，也支持自底向上的设计方法。
>
> 2.VHDL具有强大的硬件描述能力。既可以用行为描述，寄存器描述或者结构描述，也可以采用三者的混合描述方法。
>
> 3.VHDL语言具有与设计平台无关的特性，便于移植。
>
> 4.VHDL语言的设计描述与器件无关，因此采用VHDL语言时，设计人员并不需要首先考虑选择进行设计的器件。
>
> 5.VHDL语言易于共享和复用。VHDL语言基于库library的设计方法。



2. 信号与变量的区别有哪些？信号可以用来描述哪些硬件特性？  

> 1.信号具有全局特性，不但可以作为一个设计实体内部各单元之间数据传送的载体，而且还可以通过信号与其它的实体进行通信。变量具有局部特征，只能在定义的process中有效。
>
> 2.信号延时赋值，它发生在一个进程结束时；变量立即赋值，因为它其实是一个暂时性数据。
>
> 3.信号的代入使用<=，变量的代入使用:=；
> 4.在综合后，信号可以找到与之对应的硬件结构，比如一根传输导线，一个输入/输出端口，但是变量找不到。

3. 名词解释：VHDL、实体说明、.结构体、类属表、数据对象、并行语句、程序包。  

> 1. VHDL：非常高速集成电路的硬件描述语言
> 2. 实体说明entity：用来描述电路器件的外部情况及信号端口的基本性质。
> 3. 结构体architecture：通过若干并行语句来描述设计实体的逻辑功能（行为描述）或内部电路结构（结构描述），从而建立设计实体输出与输入之间的关系。
> 4. 类属表：用来确定设计实体中定义的局部常数，用以将信息参数传递到实体，用类属表知名器件的一些特征。最常用的是上升沿个下降沿之类的延迟时间，负载电容，驱动能力和功耗等。
> 5. 数据对象：数据对象是数据类型的载体，共有3种形式：常量constant，变量variable，信号signal
> 6. 并行语句，有5种类型，分别为块语句，进程语句，信号赋值语句，子程序调用语句和元件例化语句。他们的内部既可以包含并行运行的，也可以包含顺序运行的逻辑描述语句。
> 7. 程序包：可定义一些公用的子程序，常量以及自定义数据类型等待。程序包由2个独立的单元组成：程序包声明单元和程序包实体单元构成。



4. 名词解释：结构体

5. 名词解释：类属表

6. 名词解释：并行语句

7. 名词解释：程序包 

8. 元件例化语句的作用是什么？ 

> 把已经设计好的设计实体称为一个元件或一个模块，它可以被高层次的设计引用。是使VHDL设计构成自上而下层次设计的重要途径。

9. 什么是并行语句？什么是顺序语句？  

>  并行语句主要用来描述模块之间的联系，顺序语句一般用来实现模块算法部分。 

10. 简述层次结构设计的优点。 

> 1.层次化设计是一种模块化的设计方法，设计人员对设计的描述由上至下逐步展开，符合常规的思维习惯。
>
> 2.由于顶层设计与具体的器件和工艺无关，因此易于在各种可编程逻辑器件中移植。
>
> 3.层次化的设计方法可以使多个设计人员同时进行操作。有利于对设计任务进行合理的分配并用系统工程的方法对设计进行管理。

11. 在数字系统设计中锁定引脚的作用是什么？  

>  答：将设计文件中的输入、输出信号定位到所选器件的具体物理管脚上。   

12. 简述EDA技术的发展趋势： 

> ①超大规模集成电路的集成度和工艺水平不断提高，深亚微米工艺已经走向成熟，在一个芯片上完成的系统级的集成已成为可能；
>
> ②由于工艺线宽的不断减小，在半导体材料上的许多寄生效应已经不能简单地被忽略，这就对EDA工具提出了更高的要求。同时，也使得IC生产线的投资更为巨大。可编程逻辑器件开始进入传统的ASIC市场；
>
> ③高性能的EDA工具得到长足的发展，其自动化核智能化程度不断提高，为嵌入式系统设计提供了功能强大的开发环境； 
>
> ④计算机硬件平台性能大幅度提高，为复杂的SOC设计提供了物理基础。

13. 简述VHDL的程序结构。 

> 1.库 Library 2.程序包集 Package  3.实体模块Entity   4.结构体Architecture  5配置结构  Configuration（课本P28)

14. 写出进程语句结构的一般表达式。

(课本P54)

```vhdl
[进程标号：]PROCESS[(敏感信号参数表)] is
[进程说明部分]
BEGIN
	顺序描述语句
END PROCESS[进程标号]；
```

15. 什么是综合？

> 将用行为和功能层次表达的电子系统转换为低层次的，便于具体实现的模块组合装配的过程。

#### 六 改错题(1)

![mark](http://mally.oss-cn-qingdao.aliyuncs.com/PicGo上传的图片/20200701/224346023.png)

1. 在程序中存在两处错误，试指出，并说明理由：

   第9行，tmp的类型定义错，因为从下文代码中可见tmp应与A同数据类型

   第29行和20行之间，少了WHEN OTHERS语句，因为当条件句中的选择语句不能完全覆盖CASE语句中表达式的值时，最末必须加“WHEN OTHERS=><顺序语句>"

2. 修改相应行的程序：

   错误1	行号：**9**    程序改为：**TMP ：STD_LOGIC_VECTOR( 3 DOWNTO  0)**

   错误2	行号：**29**    程序改为：**该语句后添加：WHEN OTHERS >=  LED7S <= ‘00000000’；**

#### 七 阅读下列VHDL程序，画出原理图（RTL级）

```vhdl
LIBRARY IEEE;
USE IEEE.STD_LOGIC_1164.ALL;

ENTITY HAD IS
	PORT (	a : IN STD_LOGIC;
			b : IN STD_LOGIC;
			c : OUT STD_LOGIC;
			d : OUT STD_LOGIC
		);
END ENTITY HAD;

ARCHITECTURE fh1 OF HAD IS
BEGIN
	c <= NOT(a NAND b);
	d <= (a OR b)AND(a NAND b);
END ARCHITECTURE fh1;
```

<img src="http://mally.oss-cn-qingdao.aliyuncs.com/PicGo上传的图片/20200701/230612527.png" alt="mark" style="zoom:150%;" />

#### 八 请按题中要求写出相应VHDL程序(2)

1. 带计数使能的异步复位计数器

   输入端口：	clk		时钟信号

   rst		异步复位信号

   en		计数使能

   load		同步装载

   data		（装载）数据输入，位宽为10

   输出端口：	q		计数输出，位宽为10

   ```vhdl
   LIBRARY IEEE;
   USE IEEE.STD_LOGIC_1164.ALL;
   use IEEE.STD_LOGIC_UNSIGNED.ALL;
   
   ENTITY testcode IS
   	PORT( clk,rst,en,load:in STD_LOGIC;
   			data:in STD_LOGIC_VECTOR(9 DOWNTO 0);
   			q:OUT STD_LOGIC_VECTOR(9 DOWNTO 0)
   		  );
   END ENTITY testcode;
   
   ARCHITECTURE bhv of testcode IS
     
    begin
     process(clk,rst,en,load,data)
   	  variable Q1:STD_LOGIC_VECTOR(9 DOWNTO 0);
   	  begin
   		IF RST='1' then Q1:=(others=>'0');
   			ELSIF clk='1' AND CLK'EVENT THEN 
   			IF load='1'THEN Q1:=DATA;
   				ELSE 
   					IF en='1'THEN Q1:=Q1+1;
   					END IF;
   			END IF;
   	   END IF;
   		Q<=Q1;
     END PROCESS;
   end ARCHITECTURE bhv;			
   ```

   

2. 看原理图，写出相应VHDL描述

   ![mark](http://mally.oss-cn-qingdao.aliyuncs.com/PicGo上传的图片/20200701/233746715.png)

   > 析：使用了三态门
   >
   > STD_LOGICC可以定义9种数据，其中‘Z’表示高阻态，（课本P45)

   ```vhdl
   LIBRARY IEEE;
   USE IEEE.STD_LOGIC_1164.ALL;
   
   ENTITY testcode IS
   	PORT( e,a:IN STD_LOGIC;
   			y:INOUT STD_LOGIC;
   			b:out STD_LOGIC
   		  );
   END ENTITY testcode;
   
   ARCHITECTURE bhv of testcode IS
     
    BEGIN
     PROCESS(e,a,y)
   	  BEGIN
   		IF e='0' THEN 
   			b <= y;
   			y <= 'Z';
   		ELSE 
   			b <= 'Z';
   			y <= A;
   		END IF;
     END PROCESS;
   
   end ARCHITECTURE bhv;	
   ```

   

