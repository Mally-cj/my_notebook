# c++/c 使用技巧

#### 注释

如果要对一整段代码进行注释，而不想用注释块，可以使用

```
#if 0
cout<<"the text wouldn't  be print"<<endl;
cout<<"the text wouldn't  be print"<<endl;
cout<<"the text wouldn't  be print"<<endl;
cout<<"the text wouldn't  be print"<<endl;
#end if
```

要使用的時候把0改成1，就可以了。



#### 命名规则

1.类型名和函数名均以大写字母开头的单词组合而成

```
class Node;
class LeftNode;
void SetValue(int value);
```

2.变量名和参数名采用第一个单词首字母小写而后面的单词首字母大写的单词组合

```
bool flag;
int drawMode;
```

3.符号变量和宏名用全大写的单词组合而成，并在单词间用下划线分隔

```
const int MAX=100;
const int MAX_LENGTH=1024;
```

4.给静态变量加前缀_s

```
static int s_initValue;
```

5.给全局变量加_g

```
int g_howMuchMoney
```

#### 写法技巧

:star: 使用指针来减少不定长字符串的空间浪费

```
  char name1[4][10]={"to","reduce","waste","spaces"};
  char *name2[4]={"to","reduce","waste","spaces"};
```



:star: 使用原有的字符或字符串作为新声明字符串的初值

```c++
string字符串1（个数，字符）；//声明又重复字符个数的字符串
string字符串2（字符串名称1);//声明把字符串1作为字符串2的初值
string字符串3（字符串名称1，起始位置，长度);
```
示例
```
 string str1(4,'a');
 string str2(str1);
 string str3(str1,0,3);
 cout<<str3<<endl;  //aaa
```



调试

```

```

