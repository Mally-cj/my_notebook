#### 由来

贝尔实验室以C为基本的架构，再引入面向对象的概念时，形成了最初的C++语言。

#### 是一种编译式语言。

> 什么是编译式语言和解释式语言？
>
> 编译程序必须把源程序读入主存器后才可以开始编译。经过编译后所产生的可执行文件可直接对应成机器码，故可在计算机上直接运行，不需要每次运行时都重新翻译，因而运行速度自然较快。
>
> 解释器（Interpreter）每解释完一行源代码并执行完后才会再解释下一行。解释的过程中如果发生错误，解释就会立刻停止。由于使用解释器翻译的程序每次执行时都必须再翻译一次，因此运行速度较慢。不过因为仅需存取原始程序，不需要再转换为其他类型文件，所以所占用的内存较少。

面向程序设计（Object-Oriented Programming，OOP）的三特性：封装，继承，多态。

> 多态最直接的定义就是让具有继承关系的不同类对象可以调用相同名称的成员函数，并产生不同的响应结果



##### IDE上会看到compile和build，有何区别？

> 源代码（.cpp)经过编译后产生目标文件（.obj)，即机器码，它能让计算机明白应该执行的指令与操作。但是编译通过，只能说明语法上没有错误，不能保证程序运行上没有错误。
>
> 由于用户编译的C++程序中可能会使用到函数库（扩展名为*.lib）中的函数，或者一个程序可能分为数个文件来开发，这些文件在编译为目标文件后，必须通过链接程序（linker，或称为链接器），最后才会产生可执行文件（扩展名为*.exe）
>
> 理论上来说应该先点"complile",再点"build"。不过大多数IDE里，“build”都会自动先给你compile再build。



C++的编写规则可分为哪四个部分？

> 预处理区、程序区块、程序语句和程序注释
#### 程序架构

* 头文件区

  ```
  #include<头文件的文件名>  //预处理器会在编译环境默认的路径找指定的文件。
  #include<头文件的文件名>  
  /*预处理器会先寻找当前程序文件的工作目录中是否有指定的文件。如果找不到，就再到系统目录.  （include目录）中寻找。*/
  ```

  

* 主程序区 

  ```c++
  int main()
  {
  return 0; //如果返回值为0，就表示停止运行程序并且将控制权还给操作系统
  }
  ```

  ```
  int main(int argc,char *argv[])
  ```
  
  * argc表示命令行参数的个数
  * argv[]是不定长度的字符串指针数组，此数组中的元素个数由用户输入的参数而定
  * 

#### 数据类型方面

c++属于静态内存分配

![mark](http://mally.oss-cn-qingdao.aliyuncs.com/PicGo上传的图片/20200406/221538676.png)



字母”U"或“u”与“L"放在==整常数==后面表示为无符号整数（unsigned）和长整数（long）

#### 字符串

```c
char字符串变量[字符串长度]="初始字符串";						\\方式1
char字符串变量[字符串长度]='字符1'，'字符2',……,'字符n','\0';		\\方式2
```

“方式1”的声明方式会自动在字符串结尾附加’\0’结束符，“方式2”则是以字符数组来进行初始化，不过需要在结尾加上’\0’结束符。



由于字符串不是C++的基本数据类型，因此也无法直接使用数组名把一个字符串赋值给另一个字符串，如果需要赋值字符串，就只能从字符数组中逐个取出字符进行复制。





#### 指针

指针本身是一种变量类型，存储的内容就是内容的地址。

当指针变





#### 函数

传递参数的方式可以分为3种：`传值调用`,   `传址调用`，和 `传引用调用`。

> 传引用方式中的函数中形式参数不会另外分配内存来存放实际参数传入的地址，而是直接把形式参数作为一个实际参数的一个别名alias



**函数传数组参数**

传递数组自由第一维可以省略不用填入元素个数，其余维数都要

```
#include "cstdio"
using namespace std;
void print (int arr[][5],int r)
{
    for(int i=1;i<=r;++i)for(int j=1;j<5;++j)printf("%d\n",arr[i][j]);
}
int main()
{
    int arr[][4]={{1,2,3,4},{5,6,7,8}};
    
}
```





**函数指针**

指向函数的指针变量称为函数指针

函数名称其实也是一个指针变量，其本身所存储的值为函数内容所在内容的起始地址。

```
int iFunc();
int (*piFunc)();
piFunc=iFunc;
```



**函数指针数组**



#### union

union和结构体的不同在于 struct是把所有元素整成一个整体，而union是所有元素共用空间。

```
#include "cstdio"
using namespace std;
int main()
{
    union key{
        int k;
        char ch[2];
    };
    struct key2{
        int k;
        char ch[2];
    };

    key u;
    key2 u2;
    u.k=258;
    printf("%d %d  %d\n",u.ch[0],u.ch[1],u.k);
    printf("%d    %d\n", sizeof(u), sizeof(u2));    //4,8(结构体的大小不是简单叠加）
    
    u.ch[0]='5',u.ch[1]='1';
    printf("%c  %c\n",u.k,u.ch[1]); // 5 1
}
```





#### 变量种类

5种等级变量：auto，static，extern，static，register

函数重载

