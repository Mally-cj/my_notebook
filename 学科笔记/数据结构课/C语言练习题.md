
# sdkd 的C语言2018练习题（电信）

### 第1次上机练习

第1次上机练习（第3周）：
根据课堂所讲的三个例题，完成如下功能：
1.从键盘读入三个整数，计算三个整数的和与积，并输出。
2.从键盘读入两个整数，计算两个整数中的小值，输出结果。
3.从键盘读入两个整数，计算两个整数的差的绝对值（提示：先求解，后根据大小取相反数；或者先比较大小，再相减；或者对负数乘以-1）。
4.从键盘读入两个整数，对每个数做判断，如果比100大，输出“数很大”；如果比0小，输出“数很小”。
5.编写程序完成：从键盘读入两个正整数x和y，判断大数是否是小数的倍数。
6.编写程序完成：使用循环，计算1至5的和与积，并输出。
7.编写程序完成：使用循环，输出1到10之间的偶数和，奇数的乘积。
8.从键盘读入四个整数，计算并输出最大值和最小值。
9.从键盘读入两个正整数，一个1位数，一个2位数，输出组合成的大值和小值。（例如，输入8和34，则大值是834，小值是348.输入3和56，大值是563，小值是356，且不知道先输入是1位数还是2位数）
10.编写一个程序，从键盘读入一个字符，并输出。（"%c"）
11.编写一个程序，从键盘读入两个double类型数，计算并输入二者之和。（"%lf"）
12.编写一个程序，从键盘读入一个字符串，并输出。（"%s"，得用字符数组）

```
#include<stdio.h>
int main(void)
{  /*9.从键盘读入两个正整数，一个1位数，一个2位数，输出组合成的大值和小值。
    （例如，输入8和34，则大值是834，小值是348.输入3和56，大值是563，小值是356，
    且不知道先输入是1位数还是2位数）
    */
    int tem;
    int a,b;
    scanf("%d %d",&a,&b);
   if(a<b){tem=a;a=b;b=tem;}
    int maxn,minn;
    maxn=a*10+b;
    minn=a+b*100;
    if(maxn<minn){tem=maxn;maxn=minn;minn=tem;}
    printf("maxn=%d    minn=%d\n",maxn,minn);
return 0;


}

```

```
#include<stdio.h>
int main(void)
{  /*10.编写一个程序，从键盘读入一个字符，并输出。（"%c"）*/
char a;
scanf("%c",&a);
printf("%c",a);
return 0;


}

```

```
#include<stdio.h>
int main(void)
{  /*11.编写一个程序，从键盘读入两个double类型数，计算并输入二者之和。（"%lf"）*/
double a,b;
scanf("%lf %lf",&a,&b);
printf("%lf",a+b);
return 0;
}

```

```
#include<stdio.h>
int main(void)
{  /*12.编写一个程序，从键盘读入一个字符串，并输出。（"%s"，得用字符数组）*/
char all[1000];
scanf("%s",all);
printf("%s",all);

return 0;
}


```



### 第2次上机练习

第2次上机练习（第4周）：
1.从键盘读入10个整数（包括正数、负数和0），输出其中的最大值和最小值（先将第一个数设为最大值和最小值）。
2.从键盘读入一个正整数，输出各个位数字之和。（用%取余数，用x/10获取下次循环的数值）
3.从键盘读入n，求解1！+2！+3！+...+n！。（n不要太大否则可能溢出）
4.编写程序完成：从键盘读入10个整数，输出大于20的整数的个数。用for(i=0;i<10;i=i+1) 实现循环10次。
5.从键盘读入两个正整数x和y，计算x与y之间的整数和(含x和y)，并不知道x，y中哪个大。
6.从键盘读入两个正整数x和y，（要求y小于5，x小于100）计算并输出x的y次幂的值。
7.从键盘读入一个大于1的正整数x，判断它是否是3的幂（是幂次，不是倍数），输出结果(可以采用多种方法：取余数判断除尽或者取幂次。3是，6不是，9是)。

8. 编写程序完成：从键盘读入20个整数，它们都是0-9之间的个位数，输出0-9元素的个数（例如0:1个，1:2个...9:1个）。
9.从键盘读入20个整数，如果输入的正数超过5个，则输出前5个正数的和，否则输出所有正数的和，并输出其余数的和。（例如，如果读入3个正数，则输出全部正数的和与负数的和；如果读入8个正数，则计算前5个正数的和，再计算剩余15个数字之和）。

常见问题：
1.变量必须先定义，再使用。
2.变量必须先赋值或者从键盘读入数据，才能做各种运算。
3.遇到分号; 、{、 }、），要回车。
4.累加求和t或者求乘积s，累加的变量需要设正确的初值t=0，s=1。
5.初值的设置要放在循环外面。
6.if和for后面必须接（），马上回车，建议接{}，里面写句子。
7.if和for后面一般不会直接加分号; 。
8.循环语句for的初始值设置、循环条件、循环增量的含义及执行步骤。
9.if 和 for 可以相互嵌套，只要成对的{} 匹配就可以。
10.对结果的输出需要判断是输出一次，还是多次，从而知道是放在循环体里，还是放在外面。
11.表示并且使用 && 表示或者 || 
12.if 后面条件两项及以上，请使用 if(x>10&&x<100) 形式，或者 if(x>100||x<0) 
13.直接退出循环，请使用break; 通常前面会有一个判断条件，如下：
if(   )
  break;
14.十个元素数组int a[10]，下标从0开始到9结束，即a[0]到a[9]，a[10]越界，非法。
15.数组使用循环操作每个元素
for(i=0;i<10;i=i+1)
  a[i]=i;
16.正确理解函数的说明、定义、调用

```
#include<stdio.h>
int main(void)
{  /*1.从键盘读入10个整数（包括正数、负数和0），输出其中的最大值和最小值（先将第一个数设为最大值和最小值）。*/
int a,minn,maxn;
scanf("%d",&a);
minn=maxn=a;
for(int i=1;i<=9;i++)
{
    scanf("%d",&a);
    if(a<minn)minn=a;
    if(a>maxn)maxn=a;
}
printf("maxn=%d    minn=%d\n",maxn,minn);

return 0;
}

```

```
#include<stdio.h>
int main(void)
{ /* 2.从键盘读入一个正整数，输出各个位数字之和。（用%取余数，用x/10获取下次循环的数值）*/
    int a,sum=0;
    scanf("%d",&a);
    while(a>0)
    {
        sum+=a%10;
        a=a/10;
    }
    printf("sum=%d\n",sum);
return 0;
}

```

```
#include<stdio.h>
int main(void)
{ /* 3.从键盘读入n，求解1！+2！+3！+...+n！。（n不要太大否则可能溢出）*/
    int n;
    long long int sum=0;
    scanf("%d",&n);
    for(int i=1;i<=n;i++)
    {long long int  now=1;
        for(int d=1;d<=i;d++)
        {
            now*=d;
        }
        sum+=now;
    }
    printf("sum=%d\n",sum);
return 0;
}

```

```
#include<stdio.h>
int main(void)
{ /* 4.编写程序完成：从键盘读入10个整数，输出大于20的整数的个数。用for(i=0;i<10;i=i+1) 实现循环10次。*/
   int a,cnt=0;
   for(int i=0;i<10;i++)
   {
       scanf("%d",&a);
       if(a>20)cnt++;
   }
   printf("cnt=%d",cnt);
return 0;
}

```

```
#include<stdio.h>
int main(void)
{ /*5.从键盘读入两个正整数x和y，计算x与y之间的整数和(含x和y)，并不知道x，y中哪个大。*/
  int x,y,tem;
  scanf("%d %d",&x,&y);
  if(x>y){tem=x;x=y;y=tem;}
  int sum=0;
  for(int i=x;i<=y;i++)
    sum+=i;
  printf("the sum of itergers between from x to y is %d",sum);
return 0;
}

```

```
#include<stdio.h>
int main(void)
{ /*6.从键盘读入两个正整数x和y，（要求y小于5，x小于100）计算并输出x的y次幂的值。*/
    int x,y,ans=1;
    scanf("%d %d",&x,&y);
    for(int i=1;i<=y;i++)
      ans*=x;

  printf("x to  power of y is %d",ans);
return 0;
}

```

```
#include<stdio.h>
int main(void)
{ /*
    7.从键盘读入一个大于1的正整数x，判断它是否是3的幂（是幂次，不是倍数），
    输出结果(可以采用多种方法：取余数判断除尽或者取幂次。3是，6不是，9是)。
    */
    int x,yes=1;
    scanf("%d",&x);
    while(x>1)
    {
        if(x%3){yes=0;break;}
        x=x/3;

    }
if(yes)printf("x is the power of 3.");
else printf("x is not the power of 3.");
return 0;
}

```

```
#include<stdio.h>
int main(void)
{ /*
    7.
    从键盘读入一个大于1的正整数x，判断它是否是3的幂（是幂次，不是倍数），
    输出结果(可以采用多种方法：取余数判断除尽或者取幂次。3是，6不是，9是)。
    解法二：老师上课讲的那种解法，但是我觉得这样子，当数很大时，花的时间很多。
    */
    int x,yes=1;
    scanf("%d",&x);
    int d=1;
    while(d<x)
    {
        d*=3;
    }
if(d==x)printf("x is the power of 3.");
else printf("x is not the power of 3.");
return 0;
}

```

```
#include<stdio.h>
int main(void)
{ /*
    8. 编写程序完成：
    从键盘读入20个整数，它们都是0-9之间的个位数，输出0-9元素的个数（例如0:1个，1:2个...9:1个）。
    */
    int cnt_num[20];
    for(int i=0;i<=9;i++)cnt_num[i]=0;
    for(int i=1;i<=20;i++)
    {int x;
        scanf("%d",&x);
        cnt_num[x]++;
    }
    for(int i=0;i<=9;i++)
        printf("%d: %d 个,   ",i,cnt_num[i]);
    printf("\n");
return 0;
}

```

```
#include<stdio.h>
int main(void)
{ /*
    9.从键盘读入20个整数，如果输入的正数超过5个，则输出前5个正数的和，
    否则输出所有正数的和，并输出其余数的和。
    （例如，如果读入3个正数，则输出全部正数的和与负数的和；
    如果读入8个正数，则计算前5个正数的和，再计算剩余15个数字之和）。

    */
    int cnt=0,sumz=0,sumf=0;
    int x;
    for(int i=1;i<=10;i++)
    {
        scanf("%d",&x);
       if(x>0)cnt++;
       if(x>0&&cnt<=5)sumz+=x;
       else sumf+=x;
    }

    printf(" %d   %d\n",sumz,sumf);
return 0;
}

```



### 第3次上机练习

1.写一个程序，判断从键盘读入的正整数是否是对称数（12321是，789不是）。（从低到高位求得各位数字，形成新的数，与原数比较是否相等）
2.从键盘读入10个正整数，输出质数的个数。（用到二重循环，即一个循环控制10次，里边还有一个循环用来判断质数，选做）
3.从键盘读入整数，当读入0时结束循环，输出正数和负数各有多少个。
4.从键盘读入一个正整数，输出各个数字中最大的值(若输入1265，则输出6)。
5.编写一个程序，准备从键盘读入10个整数，计算读入的正整数之和，如果读入了负数，程序立刻结束，输出求和的结果（如果在准备读入的10个数中输入了负数，立刻结束，不管到没到10次，即使用break）。
6.编写一个程序，从键盘读入10个整数，计算输入的整数中除了10的倍数之外，其余所有数的和及累加求和元素数量（当输入的数是10的倍数时，将此数忽略求和与统计。例如，读入10个整数，包括一个20，一个30，累加求和时不计算这两个，求和元素的数量为8）。
7.建立一个包含10个整数的数组，从键盘读入10个整数，然后依次输出，两个整数之间用逗号隔开。

8. 建立一个包含10个整数的数组，从键盘读入10个整数，然后按照输入的逆序输出。
9.建立一个包含10个整数的数组，从键盘读入10个整数，然后输出奇数次输入的数（即第1,3,5,7,9次输入的数字）。
10.写两个函数，分别返回两个整数中的最大值和最小值，从键盘读入4个整数，调用这两个函数，输出4个数中的最大值和最小值。
11. 写两个函数，分别返回两个整数中的最大值和最小值，从键盘读入4个整数，调用这两个函数求出4个数中的最大值和最小值，比较“4个数的和”与“最大值和最小值的积”哪个大。
12.设有10门课程，提示问否通过，输入0表示通过，输入1表示没通过。如果没有通过再给两次补考的机会，若都是输入1，则表示这门课没通过。请计算出共有几门课一次通过，几门课补考通过，几门课没有通过。
13.题目同上，如果两门课没通过，则表示需要降级，请判断某学生是否需要降级。
14. 一球从100米高度自由落下，每次落地后反跳回原高度的一半；再落下，求它在第10次落地时，共经过多少米？第10次反弹多高？（参考答案：第10次落地经过299.609375米，第10次弹起距离0.097656米，选作）。
15. 猴子吃桃问题。猴子第1天摘了若干个桃子，当即吃了一半零一个；第2剩下的吃了一半零一个，依次循环。到第十天时想吃就剩下一个桃子。求第一天摘了几个桃子？。（参考答案：total=1534）

常见问题：
1.二重循环的基本规则：1) 内层的循环变量和外层的关系，2) 内层循环是否存在需要复位的变量（累加求和、连乘求积）。
2.continue和break的区别和联系。

```
#include<stdio.h>
int main(void)
{
    /*
    1.写一个程序，判断从键盘读入的正整数是否是对称数（12321是，789不是）。
    （从低到高位求得各位数字，形成新的数，与原数比较是否相等）
    */
  int a,b=0,c;
  scanf("%d",&a);
  c=a;
  while(a>0)
  {
      b=b*10+a%10;
      a=a/10;
  }
  if(c==b)printf("the number is symmetrical\n");
  else printf("the number isn't symmetrical\n");
  return 0;

}

```

```
#include<stdio.h>
int main(void)
{
    /*
    2.从键盘读入10个正整数，输出质数的个数。（用到二重循环，即一个循环控制10次，里边还有一个循环用来判断质数，选做）
    */
int a,yes;
int cnt=0;
 for(int i=1;i<=10;i++)
 {   yes=1;
     scanf("%d",&a);
     if(a==0||a==1)yes=0;
     for(int d=2;d*d<=a;d++)
     {
         if(a%d==0){yes=0;break;}
     }
     if(yes)cnt++;
 }
 printf("the number of primer is %d\n",cnt);
  return 0;

}

```

```
#include<stdio.h>
int main(void)
{
    /*
    3.从键盘读入整数，当读入0时结束循环，输出正数和负数各有多少个。
    */
    int a;
    int num_z=0,num_f=0;
while(scanf("%d",&a))
{
    if(a==0)break;
    if(a>0)num_z++;
    else num_f++;
}
printf("the number of positive number is %d,the number of negative is %d\n",num_z,num_f);
  return 0;

}

```

```
#include<stdio.h>
int main(void)
{
    /*
   4.从键盘读入一个正整数，输出各个数字中最大的值(若输入1265，则输出6)。
    */
    int a,maxn;
    scanf("%d",&a);
    maxn=a%10;
while(a>0)
{int b=a%10;
    if(b>maxn)maxn=b;
    a=a/10;
}
printf("the max value of each number is %d\n ",maxn);
  return 0;

}

```

```
#include<stdio.h>
int main(void)
{
    /*
  5.编写一个程序，准备从键盘读入10个整数，计算读入的正整数之和，
  如果读入了负数，程序立刻结束，输出求和的结果
  （如果在准备读入的10个数中输入了负数，立刻结束，不管到没到10次，即使用break）。
    */
    int a,sum=0;
   for(int i=1;i<=10;i++)
   {
       scanf("%d",&a);
    if(a<0)break;
    sum+=a;
   }
   printf("the sum of the numbers from the keyboard is %d\n ",sum);
  return 0;

}

```

```
#include<stdio.h>
int main(void)
{
    /*
 6.编写一个程序，从键盘读入10个整数，计算输入的整数中除了10的倍数之外，其余所有数的和及累加求和元素数量
 （当输入的数是10的倍数时，将此数忽略求和与统计。
   例如，读入10个整数，包括一个20，一个30，累加求和时不计算这两个，求和元素的数量为8）。
    */
    int a,sum=0;
    int cnt=0;
   for(int i=1;i<=10;i++)
   {
       scanf("%d",&a);
    if(a%10==0&&a!=0)continue;
    sum+=a;
    cnt++;
   }
   printf("the sum and the number of the numbers from the keybord,which is not the mulitiple of 10 , is %d and %d\n ",sum,cnt);
  return 0;

}

```

```
#include<stdio.h>
int main(void)
{
    /*
7.建立一个包含10个整数的数组，从键盘读入10个整数，然后依次输出，两个整数之间用逗号隔开。
    */
    int all[10];
   for(int i=0;i<10;i++)
   {
       scanf("%d",&all[i]);
   
   }
  for(int i=0;i<10;i++)
    printf("%d,",all[i]);
  return 0;

}

```

```
#include<stdio.h>
int main(void)
{
    /*
8. 建立一个包含10个整数的数组，从键盘读入10个整数，然后按照输入的逆序输出。
    */
    int all[10];
   for(int i=0;i<10;i++)
   {
       scanf("%d",&all[i]);

   }
  for(int i=9;i>0;i--)
    printf("%d ",all[i]);
  return 0;

}

```

```
#include<stdio.h>
int main(void)
{
    /*
9.建立一个包含10个整数的数组，从键盘读入10个整数，然后输出奇数次输入的数（即第1,3,5,7,9次输入的数字）。
    */
    int all[10];
   for(int i=0;i<10;i++)
   {
       scanf("%d",&all[i]);

   }
  for(int i=0;i<10;i+=2)
    printf("%d ",all[i]);
  return 0;

}

```

```
#include<stdio.h>
int max_of(int a,int b)
{
    if(a>b)return a;
    else return b;
}
int min_of(int a,int b)
{
    if(a<b)return a;
    else return b;
}
int main(void)
{
    /*
10.写两个函数，分别返回两个整数中的最大值和最小值，从键盘读入4个整数，调用这两个函数，输出4个数中的最大值和最小值。
    */
    int maxn,minn,a;
    scanf("%d",&a);
    minn=maxn=a;
    for(int i=1;i<=3;i++)
    {
        scanf("%d",&a);
        maxn=max_of(a,maxn);
        minn=min_of(a,minn);
    }
    printf("the maximum and the minimun of the numbers is %d and %d\n",maxn,minn);
  return 0;

}

```

```
#include<stdio.h>
int max_of(int a,int b)
{
    if(a>b)return a;
    else return b;
}
int min_of(int a,int b)
{
    if(a<b)return a;
    else return b;
}
int main(void)
{
    /*
11. 写两个函数，分别返回两个整数中的最大值和最小值，从键盘读入4个整数，
调用这两个函数求出4个数中的最大值和最小值，比较“4个数的和”与“最大值和最小值的积”哪个大。
    */
    int maxn,minn,a;
    int sum,product;
    scanf("%d",&a);
    sum=product=a;
    minn=maxn=a;
    for(int i=1;i<=3;i++)
    {
        scanf("%d",&a);
        maxn=max_of(a,maxn);
        minn=min_of(a,minn);
        sum+=a;
    }
    product=maxn*minn;
    printf("the maximum and the minimun of the numbers is %d and %d\n",maxn,minn);
  printf("the sum of four numbers is %d,the product between maximum and minimun is %d\n ",sum,product);
  if(sum>product)printf("sum >product ");
  else printf("sum< product");
  return 0;

}

```

```
#include<stdio.h>
int main(void)
{
    /*12.设有10门课程，提示问否通过，输入0表示通过，输入1表示没通过。
    如果没有通过再给两次补考的机会，若都是输入1，则表示这门课没通过。
    请计算出共有几门课一次通过，几门课补考通过，几门课没有通过。
    */
    int thro=0,bu=0;
    for(int i=1;i<=10;i++)
    {int a;
        scanf("%d",&a);
        if(a==0){thro++;continue;}
        for(int d=1;d<=2;d++)
        {
            scanf("%d",&a);
            if(a==0){bu++;break;}
        }

    }
    printf("%d subjects pass at first,\n %d subjects pass by several tests,\n",thro,bu);
    printf("%d subjects don't pass at the end",10-thro-bu);
    return 0;

}

```

```
#include<stdio.h>
int main(void)
{
    /*12.设有10门课程，提示问否通过，输入0表示通过，输入1表示没通过。
    如果没有通过再给两次补考的机会，若都是输入1，则表示这门课没通过。
    请计算出共有几门课一次通过，几门课补考通过，几门课没有通过。
    13.题目同上，如果两门课没通过，则表示需要降级，请判断某学生是否需要降级。
    */
    int thro=0,bu=0;
    for(int i=1;i<=10;i++)
    {int a;
        scanf("%d",&a);
        if(a==0){thro++;continue;}
        for(int d=1;d<=2;d++)
        {
            scanf("%d",&a);
            if(a==0){bu++;break;}
            if(a==1&&d==2)printf("No.%d student will downgrading.",i);
        }

    }
    printf("%d subjects pass at first,\n %d subjects pass by several tests,\n",thro,bu);
    printf("%d subjects don't pass at the end",10-thro-bu);
    return 0;

}

```

```
#include<stdio.h>
int main(void)
{
    /*14. 一球从100米高度自由落下，每次落地后反跳回原高度的一半；
    再落下，求它在第10次落地时，共经过多少米？第10次反弹多高？
    （参考答案：第10次落地经过299.609375米，第10次弹起距离0.097656米，选作）。
    */
    double h=100.0;
    double sum=100.0;
    for(int i=1;i<=10;i++)
    {
        sum+=h;
        h=h/2;
    }
    sum-=h*2;
    printf("%lf  %lf",sum,h);
    return 0;

}

```

```
#include<stdio.h>
int main(void)
{
    /*
    15. 猴子吃桃问题。
    猴子第1天摘了若干个桃子，当即吃了一半零一个；第2剩下的吃了一半零一个，依次循环。
    到第十天时想吃就剩下一个桃子。求第一天摘了几个桃子？。（参考答案：total=1534）
  */
  int sum=1;
  for(int i=9;i>=1;i--)
  {sum=(sum+1)*2;

  }
  printf("at the first day,the monkey pick %d peaches.\n",sum);
    return 0;

}

```

### 第4次上机练习

```
#include<stdio.h>
int main(void)
{
    /*1.从键盘读入个位数n，求和s=1+12+123+...12..n.(例如，输入5，求解s=1+12+123+1234+12345)。*/
    int n,sum=0,a=0;
    scanf("%d",&n);
    for(int i=1;i<=n;i++)
    {
        a=a*10+i;
        sum+=a;
    }
    printf("s=%d",sum);
    return 0;

}

```

```
#include<stdio.h>
int main(void)
{
    /*
    2.从键盘读入个位数n（不等于0），求和s=n+nn+nnn+...nn..n(最后的值是n位).
    (例如，输入5，求解s=5+55+555+5555+55555)
    */
    int n,sum=0,a=0;
    scanf("%d",&n);
    for(int i=1;i<=n;i++)
    {
        a=a*10+n;
        sum+=a;
    }
    printf("s=%d",sum);
    return 0;

}

```

```
#include<stdio.h>
int main(void)
{
    /*
    3.从键盘读入一个正整数，判断其是否是质数。
    （只能被1和自身整除，1既不是质数也不是合数，应该考虑2的情况。
    判断方法：采用1到n除尽两次；或者2到n-1没有除尽的情况；或者2到根号n没有除尽的情况）
    */
    int n,yes=1;
    scanf("%d",&n);
    for(int i=2;i<n;i++)
    if(n%i==0){yes=0;break;}
    if(yes&&n>1)printf("%d is prime.\n",n);
    else printf("%d is not prime.\n",n);

    return 0;

}

```

```
#include<stdio.h>
int main(void)
{
    /*
   4.从键盘读入个位数n（大于0），输出如下结果。
   （例如读入3）
    1
    121
    12321
    */
    int n,k,i;
    int all[30];
    scanf("%d",&n);
  for( i=1;i<=n;i++)
  {
     for(k=1;k<=i;k++)printf("%d",k);
     for( k=i-1;k>=1;k--)printf("%d",k);
     printf("\n");
  }

    return 0;

}

```

```
#include<stdio.h>
int main(void)
{
    /*
  5.计算1-999之间的同构数
  （就是该数在平方的右面，如5的平方为25，则5是同构数，选作）。
  (1,1;5,25;6,36;25,625;76,5776;376,141376;625,390625)
    */
    int i,a;
  for(i=1;i<=9;i++)
  {a=i*i;
  if(a%10==i)printf("%d,%d;\n",i,a);

  }
  for(i=10;i<=99;i++)
  {
      a=i*i;
      if(a%100==i)printf("%d,%d;\n",i,a);
  }
  for(i=100;i<=999;i++)
  {
      a=i*i;
      if(a%1000==i)printf("%d,%d;\n",i,a);
  }

    return 0;

}

```

```
#include<stdio.h>
int main(void)
{
    /*
6.从键盘读入一个三位正整数，输出各个位组合形成的最大数。
（如输入362或236，则输出632，选作）
    */
  int n,all[3];
  scanf("%d",&n);
  int t=0;
  while(n>0){all[t++]=n%10;n=n/10;}
  for(int i=1;i<=3;i++)
  {
      int p=0;
      for(int d=0;d<3;d++)if(all[i]>all[p])p=i;
      printf("%d",all[p]);
      all[p]=0;
  }
    return 0;

}

```

```

#include<stdio.h>
int main(void)
{
    /*
7.从键盘读入一个正整数（至少3位数），且各个位数字不同，
找出各个位中最大的数字，输出该数字将正整数分隔的结果。
（例如输入32751，最大是7，得到的两组数分别是32和51；若输入237，最大是7，只能输出一组数，是23，选作）
    */
int n,all[100],p=0,t,i;
scanf("%d",&n);
t=0;
while(n>0){all[t]=n%10;n=n/10;if(all[t]>all[p])p=t;t++;}
for(i=0;i<=t/2;i++){int a=all[i];  all[i]=all[t-i-1];  all[t-i-1]=a;}

p=t-1-p;
if(p==0)for(i=1;i<t;i++)printf("%d",all[i]);
else if(p==t-1)for(i=0;i<t-1;i++)printf("%d",all[i]);
else for(i=0;i<t;i++)if(i!=p)printf("%d",all[i]);else printf("和");
return 0;}


```

```
#include<stdio.h>
int main(void)
{
    /*
8.从键盘读入一个正整数（各个位数字不同），输出各个位组合形成的最大数。（思考）
    */
 int n,all[10];
 scanf("%d",&n);
 int t=0;
 while(n>0){all[n%10]=1;n=n/10;}
 for(int i=9;i>=0;i--)
if(all[i]==1)printf("%d",i);
 printf("\n");
return 0;
}

```
```
#include<stdio.h>
int main(void)
{
/*0.编写程序，求解鸡兔同笼问题（有若干只鸡兔同在一个笼子里，
从上面数，有35个头，从下面数，有94只脚。问笼中各有多少只鸡和兔？）。*/

    int head,foot;
    scanf("%d %d",&head,&foot);
    int rabbit=(foot-head*2)/2;
    int chicken=head-rabbit;
    printf("the numbers of rabbit is %d\n,the numbers of chicken is %d\n",rabbit,chicken);
    return 0;
}

```
```
#include<stdio.h>
int main(void)
{
/*0.编写程序，求解鸡兔同笼问题（有若干只鸡兔同在一个笼子里，
从上面数，有35个头，从下面数，有94只脚。问笼中各有多少只鸡和兔？）。*/

    int head,foot;
    scanf("%d %d",&head,&foot);
    int rabbit=(foot-head*2)/2;
    int chicken=head-rabbit;
    printf("the numbers of rabbit is %d\n,the numbers of chicken is %d\n",rabbit,chicken);
    return 0;
}

```

```
#include<stdio.h>
int main(void)
{
    /*
    1.从键盘读入整数，计算读入的数据之和，当
    读入0时，结束，输出最后的结果(不知道输入多少个数，以0为结束标志)。
    */
    int a,sum=0;
    while(scanf("%d",&a))
    {
        sum+=a;
        if(a==0)break;
    }
    printf("sum=%d\n",sum);
    return 0;
}

```

```
#include<stdio.h>
int main(void)
{
    /*
   2.从键盘读入正整数n，求和=1 n +2 n +3 n +4 n。
    */
  int n,sum=0;
  scanf("%d",&n);
  for(int i=1;i<=4;i++)
    {
        int k=1;
        for(int d=1;d<=n;d++)k*=i;
        sum+=k;
    }
    printf("sum=%d\n",sum);
    return 0;
}

```

```
#include<stdio.h>
int main(void)
{
    /*
  3.从键盘读入10个数，计算并输出最大值和最小值及出现在的位置
  (即最大值和最小值各是第几次输入的。请分别使用数组和不使用数组两种方法求解)。
    */
/*用数组的方法
  int all[20];
  for(int i=1;i<=10;i++)
    scanf("%d",&all[i]);
  int mi,ma;
  mi=ma=1;
  for(int i=1;i<=10;i++)
  {
      if(all[i]<all[mi])mi=i;
      if(all[i]>all[ma])ma=i;
  }

  printf("最小值在第%d位，最大值在第%d位 \n",mi,ma);
  */
  //不用数组的方法
  int mi,ma,a;
  int minn,maxn;
  scanf("%d",&minn);
  maxn=minn;
  mi=ma=1;
  for(int i=2;i<=10;i++)
  {
      scanf("%d",&a);
      if(a<minn){minn=a;mi=i;}
      if(a>maxn){maxn=a;ma=i;}
  }
  printf("最小值在第%d位，最大值在第%d位 \n",mi,ma);
    return 0;
}

```

```
#include<stdio.h>
int main(void)
{
/*
4.从键盘读入一个正整数n，输出1到1000之间前n个不能被7整除的元素，
如果不够n个，输出符合要求的元素，并输出“不足n个”。
*/
int n,cnt=0;
scanf("%d",&n);
for(int i=1;i<=1000;i++)
{
    if(i%7){printf("%d\n",i);cnt++;}
    if(cnt>=n)break;
}
if(cnt<n)printf("不足%d个\n",n);
    return 0;
}

```

```
#include<stdio.h>
int main(void)
{
/*
5.从键盘读入两个正整数，输出从个位开始各个位有相同数字的次数。
（两个数的位数不一定相同，从个位开始对应位比较，
例如输入2356和1179396，相同位相同的数字有6和3，因此次数是2）。
*/
int a,b;
scanf("%d %d",&a,&b);
int mid;
if(a>b){mid=a;a=b;b=mid;}
int cnt=0;
while(a>0)
{
    int g=a%10;a=a/10;
    int k=b%10;b=b/10;
    if(g==k)cnt++;
}
printf("%d",cnt);
    return 0;
}

```

```
#include<stdio.h>
int main(void)
{
/*
6.定义两个含有10个整数的数组（每10个元素称为一个向量），
从键盘读入20个数，分别给每个向量赋值，计算两个向量的内积
（即对应元素乘积，最后累加求和，结果是一个数）。
*/
int arr1[20],arr2[20],i,sum=0;
for(i=1;i<=10;i++)scanf("%d",&arr1[i]);
for(i=1;i<=10;i++)scanf("%d",&arr2[i]);
for(i=1;i<=10;i++)sum+=arr1[i]*arr2[i];
printf("%d",sum);
    return 0;
}

```

```
#include<stdio.h>
int main(void)
{
/*
7.从键盘读入10组数，每组2个正整数，每组以这两个数的乘积为一个值，求这10个乘积中的最大值。
（例如输入的5组数如下：1,2；3,4；5,2；67,89；5,10.
则计算得到的5组乘积为2,12,10,5963,50，求其中的最大值。
请分别使用数组和不使用数组两种方法求解。5组数是为了简便，说明问题）
*/
/*不使用数组
int i,a,b,maxn=0,c;
for(i=1;i<=10;i++)
    {
        scanf("%d %d",&a,&b);
        c=a*b;
        if(c>maxn)maxn=c;
    }
    printf("%d",maxn);
    */
    //使用数组
    int all[40],i,maxn=0,c;
    for(int i=0;i<10;i++)scanf("%d %d",&all[i*2+1],&all[i*2+2]);
    for(i=1;i<=10;i++){c=all[i*2+1]*all[i*2+2];if(c>maxn)maxn=c;}
    printf("%d",maxn);
    return 0;
}

```

```
#include<stdio.h>
int main(void)
{
/*
8.从键盘读入一个正整数，该数各个位数字有重复的，输出不重复的数字。
（例如输入1232461，则输出是3,4,6，因为1和2重复出现多次）
*/
int a,all[10];
scanf("%d",&a);
for(int i=0;i<=9;i++)all[i]=0;
while(a>0)
{
    int k=a%10;
    a=a/10;
    all[k]++;
}
for(int i=0;i<9;i++)if(all[i]==1)printf("%d  ",i);
    return 0;
}

```

```
#include<stdio.h>
int main(void)
{
/*
9. 有1、2、4、5几个数字，能组成多少个互不相同且无重复数字的2位数？输出该数。

*/
int all[]={0,1,2,4,5},cnt=0;
for(int i=1;i<=4;i++)
    for(int d=1;d<=4;d++)
if(i!=d){cnt++;printf("%d%d\n",all[i],all[d]);}
printf("有%d个\n",cnt);
    return 0;
}

```

```
#include<stdio.h>
int main(void)
{
/*
10.从键盘读入两个正整数，以这两个正整数生成两个新数。
（例如输入12,345，则生成新数为12345和34512）

*/
int a,b,ga=1,gb=1;
scanf("%d %d",&a,&b);
while(ga<=a)ga*=10;
while(gb<=b)gb*=10;
printf("%d\n",a+b*ga);
printf("%d\n",b+a*gb);
    return 0;
}

```

```
#include<stdio.h>
int main(void)
{
/*
11.从键盘读入一个正整数x，和另一个正整数n，以x的逆序输出n个数字。
（例如x为123，n为8，则输出为32132132）
*/
int x,n,all[20],cnt=0,t=1;
scanf("%d %d",&x,&n);
while(x>0)
{
    int k=x%10;
    x=x/10;
    cnt++;
    all[cnt]=k;

}
for(int i=1;i<=n;i++)
{
    printf("%d",all[t]);
    t=t+1;
    if(t>cnt)t=1;
}
    return 0;
}

```

```
#include<stdio.h>
int main(void)
{
/*
12.根据课上所讲方法，定义一个含有10个整数的数组，从键盘读入数据，使用二重循环
（即for循环里边还有另一个for循环，请注意每个for的起点和终点，两个循环变量i和j 是否有联系），
将10个元素递减排序。
*/
//如下使用选择排序法
int all[20],i,d;
for(i=1;i<=10;i++)scanf("%d",&all[i]);
for(d=1;d<=9;d++)
{int p=d;
for(i=d+1;i<=10;i++)
    if(all[i]>all[p])p=i;

int mid=all[d];
all[d]=all[p];
all[p]=mid;
}
for(i=1;i<=10;i++)printf("%d ",all[i]);
    return 0;
}

```
```
#include<stdio.h>
int main(void)
{
    /*
    13.判断从键盘读入的正整数的各个位数字是否为单调递减的。
    （如753是，758则不是；同理可以判断单调递增的情况，选作）。
    */
    int n,all[20],t=0;
    scanf("%d",&n);
    while(n>0)
    {
        int k=n%10;
        n=n/10;
        t++;
        all[t]=k;
    }
    if(t==1){printf("不具有单调性\n");return 0;}
    int yes=1;
    if(all[2]-all[1]>0)
       {

           for(int i=1; i<t; i++)
        {
            if(all[i+1]<=all[i])
            {
                yes=0;
                break;
            }
        }
            if(yes)printf("单调递减");
        }
    if(all[2]==all[1])yes=0;
    if(all[2]-all[1]<0)
       {
        for(int i=1; i<t; i++)
        {
            if(all[i+1]>=all[i])
            {
                yes=0;
                break;
            }
        }
            if(yes)
                printf("单调递增");

       }
    if(yes==0)
        printf("不具有单调性");

    return 0;
}


```

 ```
#include<stdio.h>
int main(void)
{
    /*
   14.从键盘读入正整数，判断相邻两位的数字是否存在差1的定情况，存在几次。
   （4527存在一次，78924存在两次，选作）
    */
    int n,all[20],t=0;
    scanf("%d",&n);
    while(n>0)
    {
        int k=n%10;
        n=n/10;
        t++;
        all[t]=k;
    }
    if(t==1){printf("不存在\n");return 0;}
    int cnt=0;
  for(int i=1;i<t;i++)
  {
      int g=all[i+1]-all[i];
      if(g==-1||g==1)cnt++;
  }
  printf("存在%d次",cnt);


    return 0;
}


 ```
 ```
#include<stdio.h>
int main(void)
{
    /*
  15.从键盘读入一个正整数，该数各个位数字有重复的，输出重复次数最多的数字和对应的次数。
    若重复次数相同，随便输出一个就行。
  （例如输入12324611，则输出是1，因为它重复次数最多，重复3次）
    */
    int n,all[20],t=0,p=0;
    scanf("%d",&n);
    for(int i=0;i<=9;i++)all[i]=0;
    while(n>0)
    {
        int k=n%10;
        n=n/10;
       all[k]++;
       if(all[k]>all[p])p=k;
    }
    printf("重复最多的是%d，重复了次%d。",p,all[p]);

    return 0;
}


 ```
 ```
#include<stdio.h>
int main(void)
{
    /*
    16.从键盘读入一个正整数（可能含有多个0，其它数字不重复），
    输出各个位组合形成的最小数。
   （输入890120，输出1289.选作）
    */
    int n,all[20],t=0,p=0;
    scanf("%d",&n);
    for(int i=0;i<=9;i++)all[i]=0;
    while(n>0)
    {
        int k=n%10;
        n=n/10;
       all[k]++;
    }
    for(int i=1;i<=9;i++)while(all[i]){printf("%d",i);all[i]--;}
    return 0;
}


 ```

 题目的意思是兔子在第3个月生兔子，但是在第6个月生完兔子后死掉，所以每个 月的兔子数量为上个月的兔子基数+新生的兔子（倒数第2个月的兔子数量）-死掉的兔子（倒数第6个月新增的兔子数量）。

<table>
    <thead>
        <tr>
            <th>第几个月</th>
            <th>1</th>  <th>2</th>  <th>3</th>  <th>4</th><th>5</th>  <th>6</th>
             <th>7</th>  <th>8</th>  <th>9</th>  <th>10</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td>兔子增加数量</td>
            <td>+1</td> <td>+0</td> <td>+1</td> <td>+1</td> <td>+2</td> <td>+3</td> <td>+5</td> <td>+7</td>                    	<td>+12</td> <td>+18</td> 
        </tr>
        <tr>
            <td>兔子减少数</td>
            <td>-0</td> <td>-0</td> <td>-0</td> <td>-0</td> <td>-0</td> 
             <td>-1</td> <td>-0</td> <td>-1</td> <td>-1</td> <td>-2</td>
        </tr>
        <tr>
            <td>兔子当前数</td>
            <td>1</td> <td>1</td> <td>2</td> <td>3</td> <td>5</td> 
             <td>7</td> <td>12</td> <td>18</td> <td>29</td> <td>45</td>

    </tbody>
</table>

```
#include<stdio.h>
int main(void)
{
    /*
    17.思考课堂讲授的斐波那契数列的兔子问题，
    若假设老兔子只能活6个月，然后淘汰，则如何求第10个月兔子的对数。
    */
    int i;
    int add[20],now[20];
    now[1]=1;
    now[2]=1;
    add[1]=1;
    add[2]=0;
    for(i=3;i<=10;i++)
    {now[i]=now[i-1]+now[i-2];
    add[i]=now[i-2];
    if(i>=6)now[i]-=add[i-5];

    }
        printf("%d",now[10]);
    return 0;
}

```





### 第5次上机练习

```
#include<stdio.h>
int main(void)
{
    /*
    1.从键盘读入整数，计算读入的数据之和，当
    读入0时，结束，输出最后的结果(不知道输入多少个数，以0为结束标志)。
    */
    int a,sum=0;
    while(scanf("%d",&a))
    {
        sum+=a;
        if(a==0)break;
    }
    printf("sum=%d\n",sum);
    return 0;
}

```

```
#include<stdio.h>
int main(void)
{
    /*
   2.从键盘读入正整数n，求和=1 n +2 n +3 n +4 n。
    */
  int n,sum=0;
  scanf("%d",&n);
  for(int i=1;i<=4;i++)
    {
        int k=1;
        for(int d=1;d<=n;d++)k*=i;
        sum+=k;
    }
    printf("sum=%d\n",sum);
    return 0;
}

```

```
#include<stdio.h>
int main(void)
{
    /*
  3.从键盘读入10个数，计算并输出最大值和最小值及出现在的位置
  (即最大值和最小值各是第几次输入的。请分别使用数组和不使用数组两种方法求解)。
    */
/*用数组的方法
  int all[20];
  for(int i=1;i<=10;i++)
    scanf("%d",&all[i]);
  int mi,ma;
  mi=ma=1;
  for(int i=1;i<=10;i++)
  {
      if(all[i]<all[mi])mi=i;
      if(all[i]>all[ma])ma=i;
  }

  printf("最小值在第%d位，最大值在第%d位 \n",mi,ma);
  */
  //不用数组的方法
  int mi,ma,a;
  int minn,maxn;
  scanf("%d",&minn);
  maxn=minn;
  mi=ma=1;
  for(int i=2;i<=10;i++)
  {
      scanf("%d",&a);
      if(a<minn){minn=a;mi=i;}
      if(a>maxn){maxn=a;ma=i;}
  }
  printf("最小值在第%d位，最大值在第%d位 \n",mi,ma);
    return 0;
}

```

```
#include<stdio.h>
int main(void)
{
/*
4.从键盘读入一个正整数n，输出1到1000之间前n个不能被7整除的元素，
如果不够n个，输出符合要求的元素，并输出“不足n个”。
*/
int n,cnt=0;
scanf("%d",&n);
for(int i=1;i<=1000;i++)
{
    if(i%7){printf("%d\n",i);cnt++;}
    if(cnt>=n)break;
}
if(cnt<n)printf("不足%d个\n",n);
    return 0;
}

```

```
#include<stdio.h>
int main(void)
{
/*
5.从键盘读入两个正整数，输出从个位开始各个位有相同数字的次数。
（两个数的位数不一定相同，从个位开始对应位比较，
例如输入2356和1179396，相同位相同的数字有6和3，因此次数是2）。
*/
int a,b;
scanf("%d %d",&a,&b);
int mid;
if(a>b){mid=a;a=b;b=mid;}
int cnt=0;
while(a>0)
{
    int g=a%10;a=a/10;
    int k=b%10;b=b/10;
    if(g==k)cnt++;
}
printf("%d",cnt);
    return 0;
}

```

```
#include<stdio.h>
int main(void)
{
/*
6.定义两个含有10个整数的数组（每10个元素称为一个向量），
从键盘读入20个数，分别给每个向量赋值，计算两个向量的内积
（即对应元素乘积，最后累加求和，结果是一个数）。
*/
int arr1[20],arr2[20],i,sum=0;
for(i=1;i<=10;i++)scanf("%d",&arr1[i]);
for(i=1;i<=10;i++)scanf("%d",&arr2[i]);
for(i=1;i<=10;i++)sum+=arr1[i]*arr2[i];
printf("%d",sum);
    return 0;
}

```

```
#include<stdio.h>
int main(void)
{
/*
7.从键盘读入10组数，每组2个正整数，每组以这两个数的乘积为一个值，求这10个乘积中的最大值。
（例如输入的5组数如下：1,2；3,4；5,2；67,89；5,10.
则计算得到的5组乘积为2,12,10,5963,50，求其中的最大值。
请分别使用数组和不使用数组两种方法求解。5组数是为了简便，说明问题）
*/
/*不使用数组
int i,a,b,maxn=0,c;
for(i=1;i<=10;i++)
    {
        scanf("%d %d",&a,&b);
        c=a*b;
        if(c>maxn)maxn=c;
    }
    printf("%d",maxn);
    */
    //使用数组
    int all[40],i,maxn=0,c;
    for(int i=0;i<10;i++)scanf("%d %d",&all[i*2+1],&all[i*2+2]);
    for(i=1;i<=10;i++){c=all[i*2+1]*all[i*2+2];if(c>maxn)maxn=c;}
    printf("%d",maxn);
    return 0;
}

```

```
#include<stdio.h>
int main(void)
{
/*
8.从键盘读入一个正整数，该数各个位数字有重复的，输出不重复的数字。
（例如输入1232461，则输出是3,4,6，因为1和2重复出现多次）
*/
int a,all[10];
scanf("%d",&a);
for(int i=0;i<=9;i++)all[i]=0;
while(a>0)
{
    int k=a%10;
    a=a/10;
    all[k]++;
}
for(int i=0;i<9;i++)if(all[i]==1)printf("%d  ",i);
    return 0;
}

```

```
#include<stdio.h>
int main(void)
{
/*
9. 有1、2、4、5几个数字，能组成多少个互不相同且无重复数字的2位数？输出该数。

*/
int all[]={0,1,2,4,5},cnt=0;
for(int i=1;i<=4;i++)
    for(int d=1;d<=4;d++)
if(i!=d){cnt++;printf("%d%d\n",all[i],all[d]);}
printf("有%d个\n",cnt);
    return 0;
}

```

```
#include<stdio.h>
int main(void)
{
/*
10.从键盘读入两个正整数，以这两个正整数生成两个新数。
（例如输入12,345，则生成新数为12345和34512）

*/
int a,b,ga=1,gb=1;
scanf("%d %d",&a,&b);
while(ga<=a)ga*=10;
while(gb<=b)gb*=10;
printf("%d\n",a+b*ga);
printf("%d\n",b+a*gb);
    return 0;
}

```

```
#include<stdio.h>
int main(void)
{
/*
11.从键盘读入一个正整数x，和另一个正整数n，以x的逆序输出n个数字。
（例如x为123，n为8，则输出为32132132）
*/
int x,n,all[20],cnt=0,t=1;
scanf("%d %d",&x,&n);
while(x>0)
{
    int k=x%10;
    x=x/10;
    cnt++;
    all[cnt]=k;

}
for(int i=1;i<=n;i++)
{
    printf("%d",all[t]);
    t=t+1;
    if(t>cnt)t=1;
}
    return 0;
}

```

```
#include<stdio.h>
int main(void)
{
/*
12.根据课上所讲方法，定义一个含有10个整数的数组，从键盘读入数据，使用二重循环
（即for循环里边还有另一个for循环，请注意每个for的起点和终点，两个循环变量i和j 是否有联系），
将10个元素递减排序。
*/
//如下使用选择排序法
int all[20],i,d;
for(i=1;i<=10;i++)scanf("%d",&all[i]);
for(d=1;d<=9;d++)
{int p=d;
for(i=d+1;i<=10;i++)
    if(all[i]>all[p])p=i;

int mid=all[d];
all[d]=all[p];
all[p]=mid;
}
for(i=1;i<=10;i++)printf("%d ",all[i]);
    return 0;
}

```
```
#include<stdio.h>
int main(void)
{
    /*
    13.判断从键盘读入的正整数的各个位数字是否为单调递减的。
    （如753是，758则不是；同理可以判断单调递增的情况，选作）。
    */
    int n,all[20],t=0;
    scanf("%d",&n);
    while(n>0)
    {
        int k=n%10;
        n=n/10;
        t++;
        all[t]=k;
    }
    if(t==1){printf("不具有单调性\n");return 0;}
    int yes=1;
    if(all[2]-all[1]>0)
       {

           for(int i=1; i<t; i++)
        {
            if(all[i+1]<=all[i])
            {
                yes=0;
                break;
            }
        }
            if(yes)printf("单调递减");
        }
    if(all[2]==all[1])yes=0;
    if(all[2]-all[1]<0)
       {
        for(int i=1; i<t; i++)
        {
            if(all[i+1]>=all[i])
            {
                yes=0;
                break;
            }
        }
            if(yes)
                printf("单调递增");

       }
    if(yes==0)
        printf("不具有单调性");

    return 0;
}


```

 ```
#include<stdio.h>
int main(void)
{
    /*
   14.从键盘读入正整数，判断相邻两位的数字是否存在差1的定情况，存在几次。
   （4527存在一次，78924存在两次，选作）
    */
    int n,all[20],t=0;
    scanf("%d",&n);
    while(n>0)
    {
        int k=n%10;
        n=n/10;
        t++;
        all[t]=k;
    }
    if(t==1){printf("不存在\n");return 0;}
    int cnt=0;
  for(int i=1;i<t;i++)
  {
      int g=all[i+1]-all[i];
      if(g==-1||g==1)cnt++;
  }
  printf("存在%d次",cnt);


    return 0;
}


 ```
 ```
#include<stdio.h>
int main(void)
{
    /*
  15.从键盘读入一个正整数，该数各个位数字有重复的，输出重复次数最多的数字和对应的次数。
    若重复次数相同，随便输出一个就行。
  （例如输入12324611，则输出是1，因为它重复次数最多，重复3次）
    */
    int n,all[20],t=0,p=0;
    scanf("%d",&n);
    for(int i=0;i<=9;i++)all[i]=0;
    while(n>0)
    {
        int k=n%10;
        n=n/10;
       all[k]++;
       if(all[k]>all[p])p=k;
    }
    printf("重复最多的是%d，重复了次%d。",p,all[p]);

    return 0;
}


 ```
 ```
#include<stdio.h>
int main(void)
{
    /*
    16.从键盘读入一个正整数（可能含有多个0，其它数字不重复），
    输出各个位组合形成的最小数。
   （输入890120，输出1289.选作）
    */
    int n,all[20],t=0,p=0;
    scanf("%d",&n);
    for(int i=0;i<=9;i++)all[i]=0;
    while(n>0)
    {
        int k=n%10;
        n=n/10;
       all[k]++;
    }
    for(int i=1;i<=9;i++)while(all[i]){printf("%d",i);all[i]--;}
    return 0;
}


 ```

 题目的意思是兔子在第3个月生兔子，但是在第6个月生完兔子后死掉，所以每个 月的兔子数量为上个月的兔子基数+新生的兔子（倒数第2个月的兔子数量）-死掉的兔子（倒数第6个月新增的兔子数量）。

<table>
    <thead>
        <tr>
            <th>第几个月</th>
            <th>1</th>  <th>2</th>  <th>3</th>  <th>4</th><th>5</th>  <th>6</th>
             <th>7</th>  <th>8</th>  <th>9</th>  <th>10</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td>兔子增加数量</td>
            <td>+1</td> <td>+0</td> <td>+1</td> <td>+1</td> <td>+2</td> <td>+3</td> <td>+5</td> <td>+7</td>                    	<td>+12</td> <td>+18</td> 
        </tr>
        <tr>
            <td>兔子减少数</td>
            <td>-0</td> <td>-0</td> <td>-0</td> <td>-0</td> <td>-0</td> 
             <td>-1</td> <td>-0</td> <td>-1</td> <td>-1</td> <td>-2</td>
        </tr>
        <tr>
            <td>兔子当前数</td>
            <td>1</td> <td>1</td> <td>2</td> <td>3</td> <td>5</td> 
             <td>7</td> <td>12</td> <td>18</td> <td>29</td> <td>45</td>

    </tbody>
</table>

```
#include<stdio.h>
int main(void)
{
    /*
    17.思考课堂讲授的斐波那契数列的兔子问题，
    若假设老兔子只能活6个月，然后淘汰，则如何求第10个月兔子的对数。
    */
    int i;
    int add[20],now[20];
    now[1]=1;
    now[2]=1;
    add[1]=1;
    add[2]=0;
    for(i=3;i<=10;i++)
    {now[i]=now[i-1]+now[i-2];
    add[i]=now[i-2];
    if(i>=6)now[i]-=add[i-5];

    }
        printf("%d",now[10]);
    return 0;
}
```
### 第6次上机练习
0.1请用汉语描述选择排序和插入排序（升序）的特点，每轮排序的起始条件是什么？本轮结束时状态是什么？若设有10个元素，外层循环的起始点和终止点是什么？内外层的循环增量有什么关系？选择排序中，找到最小值后应如何处理？插入排序是如何找到某元素正确位置的？ 

选择排序是给每个位置建立等级，从头到尾找它的专属元素。
插入排序是前面的是已经有序的数列，把当前的这个元素插入到前面的序列中，并保持该序列有序。
选择排序
每轮的起始条件是第i个位置，每轮结束时前i个位置已确定了。
外层循环的起点是第1个位置，终止点是倒数第2个位置。
内层循环的起点是外层循环的当前i。
找到最小值后，与外层循环的i交换。

插入排序的每轮排序是第i个（即外层决定的），本轮结束时i位置以前包括i都是有序数列。
外层循环的起始点是第2个位置，终止点是倒数第1个位置。
内层循环的起点是外层循环的当前i。
插入排序是通过不断往前，把当前位置上比它大的元素往后移1位，最终找到一个元素比它大，就break，把这个外层循环给的元素放到找到的位置的后面。

```
#include<stdio.h>
int main(void)
{
   /* 1.从键盘读入10个整数存入数组，计算大于100元素的个数，
   并计算大于100的元素中，奇数和偶数各有多少个。
   */
   int all[20],cnt=0,odd=0,even=0;
   for(int i=1;i<=10;i++)
   {
       scanf("%d",&all[i]);
       if(all[i]>100)
       {
        cnt++;
        if(all[i]%2)odd++;else even++;
       }
   }
   printf("大于100个有%d个，其中奇数有%d个，偶数有%d个",cnt,odd,even);
   return 0;
}

```

```
#include<stdio.h>
long long int pow(int a,int n)
{
    int now=1;
    for(int i=1;i<=n;i++)now*=a;
    return now;

}
int main(void)
{
   /*
   2.从键盘读入两个正整数m，n（不要太大），输出1到100之间奇数的m次方与偶数的n次方。
   */
   int m,n;
   scanf("%d %d",&m,&n);
   for(int i=1;i<=100;i++)
   {
       if(i%2)printf("%d:%lld\n",i,pow(i,m));
       else printf("%d:%lld\n",i,pow(i,n));
   }
   return 0;
}

```

```
#include<stdio.h>
int main(void)
{
   /*
   3.编程输出从键盘读入的大于1的正整数的质数因子。因子从大到小输出
   （如读入6，输出3.2， 读入16，输出2）（请比较本题和第7题有何不同？）
   */
   int a,all[1000],t=0;
 scanf("%d",&a);
 for(int i=2;i<=a;i++)
 {
     if(a%i!=0)continue;
     all[t++]=i;
     while(a%i==0){a=a/i;}

 }
 for(int i=t-1;i>=0;i--)printf("%d  ",all[i]);
   return 0;
}

```

```
#include<stdio.h>
int addition(int a,int b){return a+b;}
int multi(int a,int b){return a*b;}
int main(void)
{
   /*
   4编写两个函数，分别用来计算两个整数的和与两个整数的积，
   从键盘读入四个整数a,b,c,d，调用上面写的函数，计算并输出(a+b)*(c+d)与a*b+c*d.
   */
  int a,b,c,d;
  scanf("%d %d %d %d",&a,&b,&c,&d);
  int ans1=multi(addition(a,b),addition(c,d));
  int ans2=addition(multi(a,b),multi(c,d));
  printf("(a+b)*(c+d)=%d \n a*b+c*d=%d\n",ans1,ans2);
   return 0;
}

```

```
#include<stdio.h>
void diao(int n)
{
    if(n==0)return;
    diao(n-2);
    printf("%d\n",n);

}
int main(void)
{
   /*
   5编写一个递归函数，能够根据输入的正整数n，从小到大输出不大于n的偶数。
   编写主函数，使用从键盘读入的n，调用该函数，输出结果。
   */
 int n;
 scanf("%d",&n);
 if(n%2)n=n-1;
 diao(n);
   return 0;
}

```

```
#include<stdio.h>
void insertsort(int arr[],int n)
{
    int i,d;
    for(i=1;i<n;i++)
    {

        int g=arr[i];
        for(d=i;d>0&&arr[d-1]>g;d--)
            arr[d]=arr[d-1];
        arr[d]=g;

    }
}
int main(void)
{
   /*
  6.建立一个整数数组，含有10个元素，从键盘读入元素，对数组元素按递增排序。
  编写子函数，完成排序，主函数调用该子函数，完成排序过程。
   */
 int all[10];
 for(int i=0;i<10;i++)scanf("%d",&all[i]);
 insertsort(all,10);
 for(int i=0;i<10;i++)printf("%d ",all[i]);
   return 0;
}

```

```
#include<stdio.h>

int main(void)
{
   /*
7.编程输出从键盘读入的大于1的正整数的质数因式分解式。
（如读入6，输出2 3.读入16，输出 2 2 2 2.选作）。
   */
 int n;
 scanf("%d",&n);
 for(int i=2;i<=n;i++)
 {
     while(n%i==0)
     {
         printf("%d ",i);
         n=n/i;
     }
 }
   return 0;
}

```

```
#include<stdio.h>
int main(void)
{
   /*
8.编程输出3位的水仙花数。水仙花数是指一个 n 位正整数 ( n≥3 )，
它的每个位上的数字的 n 次幂之和等于它本身。(水仙花数：153,370,371,407)
   */
for(int i=100;i<=999;i++)
{
    int a=i,sum=0;
    while(a)
    {
        int k=a%10;
        sum+=k*k*k;
        a=a/10;
    }
    if(sum==i)printf("%d\n",i);
}
   return 0;
}

```

```
#include<stdio.h>
int main(void)
{
   /*
9. 编程输出小于1000的完数。完数是指它所有的真因子
（即除了自身以外的约数）的和等于它本身。
（完数：6=1+2+3,28=1+2+4+7+14,496）
   */
for(int i=1;i<1000;i++)
{
    int sum=0;
    for(int d=1;d<i;d++)
    {
        if(i%d==0)
        {
            sum+=d;
        }
    }
    if(sum==i)printf("%d\n",i);

}
   return 0;
}

```

```
#include<stdio.h>
int main(void)
{
   /*
10.从键盘读入两个正整数x和y，从个位开始，以x和y的各个位交替组成一个新数。
  （例如输入123和56889，则输出39281865）。
   */
int x,y;
int a[20],b[20],anum=0,bnum=0,k;
scanf("%d %d",&x,&y);
while(x>0){k=x%10;x=x/10;a[anum++]=k;}
while(y>0){k=y%10;y=y/10;b[bnum++]=k;}
int t=0,p=0;
while(1)
{
    if(t<anum)printf("%d",a[t]);
    if(p<bnum)printf("%d",b[p]);
    t++;p++;
    if(t>=anum&&p>=bnum)break;
}
   return 0;
}

```

```
#include<stdio.h>
int main(void)
{
   /*
11.从键盘读入两个正整数x和y，从个位开始，以x的奇数位和y的偶数位，组成一个新数。
（例如输入123和5678345，则输出34186）。
   */
int x,y;
int a[20],b[20],anum=0,bnum=0,k,i;
scanf("%d %d",&x,&y);

//判断是几位数，方面下面做处理
int weix=1,weiy=1;
k=10;
while(k<=x){k*=10;weix++;}
k=10;
while(k<=y){k*=10;weiy++;}
printf("%d  %d\n",weix,weiy);
//把可用的数据读入数组
int yes;
if(weix%2)yes=1;else yes=0;
while(x>0){k=x%10;if(yes)a[anum++]=k;x=x/10;yes=!yes;}
if(weix%2)yes=0;else yes=1;
while(y>0){k=y%10;if(yes)b[bnum++]=k;y=y/10;yes=!yes;}

//输出数
int t=0,p=0;
while(1)
{
    if(t<anum)printf("%d",a[t]);
    if(p<bnum)printf("%d",b[p]);
    t++;p++;
    if(t>=anum&&p>=bnum)break;
}
   return 0;
}

```

```
#include<stdio.h>
int gcd(int a,int b)
{
    if(a%b==0)return b;
    return gcd(b,a%b);
}
int main(void)
{
   /*
12.从键盘读入两个正整数做分数，求他们的最简式。
（例如输入6和12，则最简式是1/2（用输出语句输出三个符号）;
输入12和6，最简式是2）(本题实际上是找到最大的公因子，再做除法)
   */
int a,b;
scanf("%d %d",&a,&b);
int m=a,n=b;if(m>n){int c=m;m=n;n=c;}
int f=gcd(n,m);
printf("%d/%d\n",a/f,b/f);
   return 0;
}

```

```
#include<stdio.h>
int main(void)
{
   /*
13.从键盘读入一个正整数x，再读入两个正整数m和n，
从个位开始向前数，输出从m位开始的n位数字。
（例如x是12345，m是3，n是6，则输出321543，选作）
   */
int x,m,n;
int all[20];
scanf("%d %d %d",&x,&m,&n);
int t=1;
while(x>0){all[t++]=x%10;x=x/10;}
while(n--)
{printf("%d",all[m++]);
if(m>=t)m=1;

}
   return 0;
}

```
### 第7次上机练习

```
#include<stdio.h>
int main(void)
{
   /*
0.0定义一个存放10个整数的数组，从键盘读入10个整数存放到数组中，求所有元素的和。
   */
int a;
int all[20],sum=0;
for(int i=1;i<=10;i++){scanf("%d",&all[i]);sum+=all[i];}
printf("sum=%d\n",sum);
   return 0;
}

```

```
#include<stdio.h>
int gcd(int a,int b)
{
    if(a%b==0)return b;
    return gcd(b,a%b);
}
int suan(int a,int b)
{
    return a/gcd(a,b)*b;
}
int main(void)
{
   /*
1.编写2个函数，分别用来计算两个正整数的最大公约数和最小公倍数，
从键盘读入两个正整数，调用这两个函数，计算最大公约数和最小公倍数。
   */
int a,b;
scanf("%d %d",&a,&b);
int div=gcd(a,b);
int mul=suan(a,b);
printf("最大公约数是%d,最小公倍数是%d\n",div,mul);
   return 0;
}

```

```
#include<stdio.h>
int prime(int a)
{
    if(a<2)return 0;
    for(int i=2;i<a;i++)
        if(a%i==0)return 0;
    return 1;
}
int main(void)
{
   /*
2.建立一个含有10个元素的整数数组，从键盘读入10个正整数元素放入数组中。
写一个子函数，用来判断一个正整数是否为质数。调用该子函数，输出数组中的质数和。
   */
int all[10],sum=0;
for(int i=0;i<10;i++)
{
    scanf("%d",&all[i]);
    if(prime(all[i]))sum+=all[i];
}
printf("质数和为%d\n",sum);
   return 0;
}

```

```
#include<stdio.h>
void zheng(int n){
    if(n==0)return ;
    zheng(n-1);
    printf("%d ",n);
    }
void fan(int n)
{
    printf("%d ",n);
    if(n==1)return;
    zheng(n-1);
}
int main(void)
{
   /*
3.编写2个递归函数，从键盘读入n，调用这两个函数，分别输出1…n和n…1。
   */
int n;
scanf("%d",&n);
zheng(n);
printf("\n");
fan(n);
   return 0;
}

```

```
#include<stdio.h>
int sum=0,acu=1;
void he(int n){
    if(n==0)return ;
    he(n-1);
   sum+=n;
    }
void ji(int n){
    if(n==0)return ;
    ji(n-1);
    acu*=n;
    }
int main(void)
{
   /*
4.编写递归函数，用来求解1+2+…+n的和，从键盘读入正整数n，求出结果。
编写递归函数，用来求解1*2*…*n的积，从键盘读入正整数n，求出结果。
   */
int n;
scanf("%d",&n);
he(n);
ji(n);
printf("和为%d，积为%d\n",sum,acu);
   return 0;
}

```

```
#include<stdio.h>
long long int f1(int x)
{
    int sum=0;
    for(int i=1;i<=x;i++)sum+=i;
    return sum;
}
long long int f2(int x)
{
    int acu=1;
    for(int i=1;i<=x;i++)acu*=i;
    return acu;
}
int main(void)
{
   /*
5.编写两个子函数，f1( int x)用来计算1到x的和Σx，f2(int x)用来计算1到x的乘积Пx。
从键盘读入两个正整数m和n，调用函数计算并输出1到m的和，1到n的乘积。
   */
int m,n;
scanf("%d%d",&m,&n);

printf("和为%lld，积为%lld\n",f1(m),f2(n));
   return 0;
}

```

```
#include<stdio.h>
long long int fn(int x)
{
    int acu=1;
    for(int i=1;i<=x;i++)acu*=i;
    return acu;
}
int main(void)
{
   /*
6.编写函数int fn(int x)，能够计算x的阶乘。编写main函数，
调用fn函数，计算1！+2！+3！+4！(因此，主函数中应该调用4次fn才对)。
   */
int x;
long long int sum=0;
scanf("%d",&x);
for(int i=1;i<=x;i++)
    sum+=fn(i);
printf("和为%lld\n",sum);
   return 0;
}

```

```
#include<stdio.h>
int fn(int n)
{
    int cnt=0;
    for(int i=2;i<=n;i++)
    {
        int yes=1;
        for(int d=2;d<i;d++)
        if(i%d==0){yes=0;break;}
        if(yes)cnt++;
    }
    return cnt;
}
int main(void)
{
   /*
7.编写一个函数，int fn(int n)，输出小于n的质数共有多少个，
编写main函数，读入一个正整数n，调用该函数，输出结果。
   */
int n;
scanf("%d",&n);
printf("小于n的质数有%d个\n",fn(n));
   return 0;
}

```

```
#include<stdio.h>
int main(void)
{
   /*
8.定义一个存放10个整数的数组，从键盘读入10个整数存放到数组中，
求出大于平均值的元素的个数（平均值请用浮点数）。
   */
int all[10],cnt=0;
double sum=0;
for(int i=0;i<10;i++){scanf("%d",&all[i]);sum+=all[i];}
sum=sum/10;
for(int i=0;i<10;i++){if(all[i]>sum)cnt++;}
printf("平均值为%llf，大于平均值的元素有%d个",sum,cnt);

   return 0;
}

```

```
#include<stdio.h>
int main(void)
{
   /*
9.定义一个存放10个整数的数组，从键盘读入10个整数存放到数组中，
找到最小值放在首位，找到最大值放在末尾。
其它元素位置随意，但是元素不能缺失（假设元素不重复）。
   */
int all[10],cnt=0;
int ma=0,mi=0;
for(int i=0;i<10;i++)
    {
        scanf("%d",&all[i]);
        if(all[i]>all[ma])ma=i;
        if(all[i]<all[mi])mi=i;
    }
    int mid;
    mid=all[0];all[0]=all[mi];all[mi]=mid;
    mid=all[9];all[9]=all[ma];all[ma]=mid;
   for(int i=0;i<10;i++)printf("%d ",all[i]);

   return 0;
}

```

```
#include<stdio.h>
int main(void)
{
   /*
10.定义一个存放10个整数的数组，从键盘读入10个整数存放到数组中（数组元素存在相等的情况），
求出最大值和最小值，以及最大值和最小值的个数，最大值、最小值的首次出现及最后出现的位置。
   */
int all[10];
int i,ma=0,mi=0;
for(i=0;i<10;i++)
    {
        scanf("%d",&all[i]);
        if(all[i]>all[ma])ma=i;
        if(all[i]<all[mi])mi=i;
    }

    int ap,ad,bp,bd;
    int cnta=0,cntb=0;
for(int i=0;i<10;i++)
{
    if(all[i]==all[ma])
    {

        cnta++;
        ad=i;
        if(cnta==1)ap=i;
    }
    if(all[i]==all[mi])
    {
        cntb++;
        bd=i;
        if(cntb==1)bp=i;
    }
}
printf("最大值为%d，最小值为%d\n最大值出现%d次，最小值出现%d次\n",all[ma],all[mi],cnta,cntb);
printf("最大值首次出现在第%d位,最后出现在第%d位\n 最小值首次出现在第%d位，最后出现在第%d位",ap+1,ad+1,bp+1,bd+1);

   return 0;
}

```

```
#include<stdio.h>
int now=0;
int eat[10];
int jud(int a,int b)
{
    int yes=0;
    for(int i=a;i<=a+b;i++)
        if(i%15==0)yes=i/15;
    if(yes)
    {
        if(eat[yes]==0)
        {
            eat[yes]=1;
            now+=2;
        }
    }
}
int main(void)
{
   /*
11.蜗牛爬树问题，有树100米，一只蜗牛白天向上爬4米，晚上滑落2米。
每隔五天，由于疲劳，会多滑落1米。每到15米处，有食物补充，可以比平时多爬2米。问第几天能爬到树顶
（今天是第48天，初始97米,爬了4米,爬至101米）。
   */
int i;
for(i=1;;i++)
{

  jud(now,4);
    now+=4;
    if(now>=100)break;
    now-=2;
jud(now+2,2);
    if(i%5==0&&i/5){now-=1;}
    printf("第%d天晚上，蜗牛在第%d米\n",i,now);
}
printf("第%d天，爬到树顶",i);
   return 0;
}


```

```
#include<stdio.h>
#include<string.h>
int main(void)
{
   /*
12.编程计算并输出杨辉三角（形状可以如下，也可以是等腰三角形形状）。
1
1  1
1  2  1
1  3  3  1
1  4  6  4  1
1  5  10  10  5  1
   */
int i,d,all[30];
memset(all,0,sizeof(all));
all[1]=1;
int tem,last=0;
printf("1\n");
for(int i=2;i<=10;i++)
   {
       for(int d=1;d<=i;d++)
{
    tem=all[d];
    all[d]=all[d]+last;
    last=tem;
    printf("%d  ",all[d]);
}
printf("\n");
}

   return 0;
}

```

```
#include<stdio.h>
void diao(int* a,int d)
{
    if(d==*a)return;
  if(*a%d==0){
    while(*a%d==0)
    {
        *a=*a/d;
    }
    printf("%d\n",d);
    }
    diao(a,d+1);
}
int main(void)
{
   /*
13.从键盘读入一个正整数，要求只能写一个子函数，主函数中不能有循环
调用该子函数，正序输出质数因子，子函数中，只能使用一次循环（选做）。
   */
   int n;
scanf("%d",&n);
diao(&n,2);
   return 0;
}



```

```
#include<stdio.h>
void diao(int *n,int a)
{
    if(*n%a==0)*n=*n/a;
    else return;
    diao(n,a);
}
int main(void)
{
   /*
 13.从键盘读入一个正整数，要求只能写一个子函数，调用该子函数，
 正序输出质数因子，子函数中，只能使用一次循环（选做）。
   */
   int n;
   scanf("%d",&n);
  for(int i=2;i<=n;i++)
  {
      if(n%i==0)
      {
          diao(&n,i);
          printf("%d  ",i);
      }
  }
   return 0;
}

```

### 第8次上机练习

```
#include<stdio.h>
int main(void)
{
   /*
 0.0定义1个存放10个整数的数组a，从键盘读入10个正整数存放到数组中，
    输出奇数和减去偶数和的值。
   */
  int a[10];
  int ji=0,ou=0;
  for(int i=0;i<10;i++)
  {
      scanf("%d",&a[i]);
      if(a[i]%2)ji+=a[i];
      else ou+=a[i];
  }
  printf("%d",ji-ou);
   return 0;
}

```

```
#include<stdio.h>
int main(void)
{/*
   0.1建立2个整数数组，各含有5个元素，从键盘读入10个整数放入数组中，
   计算2个数组元素的内积（对应元素乘积，然后求和）。
   */
 int arr[10][2],sum=0;
 for(int i=1;i<=5;i++)
    {
        scanf("%d %d",&arr[i][0],&arr[i][1]);
         sum+=arr[i][0]*arr[i][1];
    }
    printf("%d",sum);
    return 0;
}


```

```
#include<stdio.h>
int ji(int arr[],int n)
{
    int i=0,mul=1;
    for(i=0;i<n;i++)
        mul*=arr[i];
    return mul;
}
int main(void)
{/*
   0.2. 建立一个整数数组int a[10]，从键盘读入10个整数放到数组中。
   定义一个子函数，输入参数是数组名和数组长度，
   该子函数用来计算并返回数组元素的乘积。调用该子函数，输出数组元素的积。
   */
 int i,a[10];
 for(i=0;i<10;i++)
    scanf("%d",&a[i]);
int  mul=ji(a,10);
 printf("数组元素的积为%d",mul);
    return 0;
}


```

```
#include<stdio.h>
double sum=0;
int ji(int arr[],int n)
{
   int cnt=0,i;
    for(i=0;i<n;i++)if(arr[i]>sum)cnt++;
    return cnt;
}
int main(void)
{/*
   0.3.编写一个子函数int fn(int a[],int len)，传入参数为整数数组名和数组长度，
   完成功能为，返回值是传入的数组中大于平均值的元素的个数。
   主函数读入10个正整数，放在数组中，调用该子函数，输出结果（平均值请用浮点数表示）。
*/
 int i,a[10];
 for(i=0;i<10;i++)
    {
        scanf("%d",&a[i]);sum+=a[i];
    }
    sum/=10;
 printf("大于平均值的元素的个数是%d",ji(a,10));
    return 0;
}


```

```
#include<stdio.h>
int main(void)
{/*
  1.定义2个存放10个整数的数组，分别为a和b，从键盘分别读入10个整数存放到数组a和b中。
  修改a和b数组中元素的值，a[i]修改为读入时a[i]与b[i]元素的和，
  b[i]修改为读入时a[i]与b[i]元素的积。求出修改后的a中的最大值，b中的最小值。
*/
 int a[10],b[10],maxa,minb,i;
 for(i=0;i<10;i++)scanf("%d",&a[i]);
 for(i=0;i<10;i++)scanf("%d",&b[i]);
 maxa=a[0]+b[0];
 minb=a[0]*b[0];
 for(i=0;i<10;i++)
 {
     int c,d;
     c=a[i]+b[i];d=a[i]*b[i];
     a[i]=c;b[i]=d;
     if(a[i]>maxa)maxa=a[i];
     if(b[i]<minb)minb=b[i];
 }
 printf("a中的最大值是%d，b中的最小值是%d\n",maxa,minb);
    return 0;
}


```

```
#include<stdio.h>
int main(void)
{/*
  2.已知数组含有10个元素，元素已经排好顺序且存在重复，计算共有几个不同的数
  （如果输入的是个位数如下：1122456777，则不同的数有6个）。
*/
 char arr[10],now;
 int cnt=0,i;
 for(i=0;i<10;i++){scanf("%c",&arr[i]);if(now!=arr[i]){now=arr[i];cnt++;}}
 printf("不同的数有%d个",cnt);

    return 0;
}


```

```
#include<stdio.h>
int main(void)
{
/*
  3.提示“请您输入整数”，如果该值大于或等于100，提示“您输入的值很大”，结束。
  如果小于100且大于或等于0，提示“您输入的值很小”，结束。如果小于0，提示“请您重新输入”，
  根据其输入继续做判断直到满足上面给出的两项结束条件之一。
*/
int n;
printf("请您输入整数\n");
while(1)
{
scanf("%d",&n);
if(n>=100){printf("您输入的值很大\n");break;}
else if(n<0){printf("请您重新输入\n");continue;}
else {printf("您输入的值很小\n");break;}
}
    return 0;
}


```

```
#include<stdio.h>
int main(void)
{
/*
 4. 某公司成立，每天收入为10元，每天消费规律为，第1天消费1元，
 以后每天消费金额是前一天的2倍。
   输出该公司盈利能保持盈利的天数（按总收入和总支出来判断）。
*/
int i,tot=0,d;
double now=0.5;
for(int i=1;;i++)
{

    tot+=10;
    now*=2;
    tot-=now;
    if(tot==0){d=i;break;}
    if(tot<0){d=i-1;break;}

}
printf("该公司盈利能保持盈利的天数为%d",d);

    return 0;
}


```

```
#include<stdio.h>
int main(void)
{
/*
5.甲乙两队各派10人参与10项比赛，每人参与1项比赛，已知各队每个人的比赛成绩。
建立两个数组，存放从键盘录入的每队10个人的成绩（为正整数），成绩高的表示该项目获胜，成绩相等是平局。
已知规则是一个项目获胜得3分，平局1分，失败0分。
计算甲乙两队的最后得分和获胜队名称和得分；如果得分相等，输出“平局”和得分。
*/
int a[20],b[20],as=0,bs=0,i;
for(i=1;i<=10;i++)scanf("%d",&a[i]);
for(i=1;i<=10;i++)scanf("%d",&b[i]);
for(i=1;i<=10;i++)
{
if(a[i]>b[i])as+=3;
else if(a[i]<b[i])bs+=3;
else {as+=1;bs+=1;}
}
printf("甲最后得分为%d,乙最后得分为%d\n",as,bs);
if(as>bs)printf("甲队获胜，得分为%d\n",as);
if(as<bs)printf("乙队获胜，得分为%d\n",bs);
if(as==bs)printf("平局，得分为%d",as);

    return 0;
}


```

```
#include<stdio.h>
int midfin(int arr[],int qi,int mo,int n)
{
    int mid=(mo-qi)/2+qi;
    if(arr[mid]==n)return mid;
    if(mid==qi)return 0;
    if(arr[mid]>n)return midfin(arr,qi,mid,n);
    else return midfin(arr,mid,mo,n);

}
int main(void)
{
/*
6.有一个已经排好顺序的数组，含有10个整数(自己先设好元素的值)。从键盘读入一个整数，
用折半查找法判断该数是否在数组中。
（折半查找是指每次查找元素的范围是上次的一半，可先百度一下定义）。
*/
int all[10];
for(int i=0;i<10;i++)scanf("%d",&all[i]);
int n;
scanf("%d",&n);
int yes=midfin(all,0,9,n);
if(yes==0)printf("不在数组中");else printf("在数组all[%d]中\n",yes);

    return 0;
}


```

```
#include<stdio.h>
int main(void)
{
/*
7.定义一个二维数组int a[3][4],从键盘读入12个整数，放到数组中，
输出每行元素的和与每列元素的乘积。
*/
int all[3][4],i,d;
int he[3],ji[4];
for(i=0;i<3;i++)he[i]=0;
for(d=0;d<4;d++)ji[d]=0;
for(i=0;i<3;i++)
    for(d=0;d<4;d++)
   {
    scanf("%d",&all[i][d]);
    he[i]+=all[i][d];
    ji[d]+=all[i][d];
   }
   for(i=0;i<3;i++)printf("第%d行的元素和为%d\n",i+1,he[i]);
   for(d=0;d<4;d++)printf("第%d列的元素积是%d\n",d+1,ji[d]);

    return 0;
}


```

```
#include<stdio.h>
int main(void)
{
/*
8.定义一个二维整数数组，含有4行4列，从键盘读入所有元素，计算并输出对角线元素的和。
*/
int all[4][4],i,d;
int sum=0;
for(i=0;i<4;i++)
    for(d=0;d<4;d++)
   {
    scanf("%d",&all[i][d]);
    if(i==d||3-d==i)sum+=all[i][d];
   }
  printf("对角线元素的和为%d\n",sum);
    return 0;
}


```

```
#include<stdio.h>
const int maxn=1e5+10;
int noprime[maxn];
void madeprime()
{
    for(int i=2;i*i<=maxn;i++)
        {
            if(noprime[i])continue;
        for(int d=i+i;d<=maxn;d+=i)
        noprime[d]=1;
    }

}
int maxprime(int a)
{
    if(a<2)return 1;
    for(int i=a;i>=2;i--)
        if(a%i==0&&noprime[i]==0)return i;
}
int main(void)
{
/*
9.定义2个数组a,b，每个数组存放10个整数，从键盘读入10个大于2的正整数存放到数组a中，
  求出数组a中每个元素的最大质因子，放入数组b对应的位置中，输出a和b的值（选作）。
*/
madeprime();
int i,d,a[10],b[10];
for(i=0;i<10;i++){scanf("%d",&a[i]);b[i]=maxprime(a[i]);}
printf("a数组为:");
for(i=0;i<10;i++)printf("%d ",a[i]);
printf("\nb数组为:");
for(d=0;d<10;d++)printf("%d ",b[d]);
    return 0;
}


```

### 第9次上机练习

//这一部分指针还不熟悉，有些题目先问一问老师
第13题还没有做，因为涉及到动态存储，先学一下再做。

1.如果i是变量，且指针变量p指向i，下面哪些表达式是合法的，合法的表达式含义是什么？哪些表示i？
*p 合法，表示i的值
&p,合法，表示i的地址
*&p,
&*p,
*i,不合法
&i,合法，i的地址
*&i,
&*i.
2.已知int i;int *p,*q;p=q=&i;下面哪些赋值是合法的？
p=i;不合法
*p=&i;不合法
&p=q;不合法
p=&q;合法
p=*&p;不合法
p=q;合法
p=*q;不合法
*p=q;不合法
*p=*q;合法
3.已知p是指针，当使用*p访问元素时，需要经过哪些步骤？是否可以有多个相同类型的指针指向同一个变量？是否每个指针都可以修改该变量的值？
4.C语言函数调用是传值的，其基本含义是什么？使用指针做函数参数是否违反此规则？
5. 请描述以下概念：
变量名，变量类型，变量值，变量地址，指针，指向。
int a[10]; a[10]=10;//括号含义有什么不同？
int *p; *p=10; x=3*5;//星号含义有什么不同？

```
#include<stdio.h>
double ave=0;
int fn(int a[],int len)
{
    int cnt=0;
    for(int i=0;i<len;i++)
        if(a[i]>ave)cnt++;
    return cnt;
}
int main(void)
{
  /*
6.编写一个子函数int fn(int a[],int len)，传入参数为整数数组名和数组长度，
完成功能为，返回值是传入的数组中大于平均值的元素的个数。
主函数读入10个正整数，放在数组中，调用该子函数，输出结果（平均值请用浮点数表示）。
*/
int a[10];
for(int i=0;i<10;i++){scanf("%d",&a[i]);ave+=a[i];}
ave/=10;
int get=fn(a,10);
printf("大于平均值的元素有%d个\n",get);
    return 0;
}


```

```
#include<stdio.h>
int fn(int a,int b,int *p)
{
    *p=a*b;
    return (a+b);
}
int main(void)
{
  /*
7.编写一个子函数int fn(int a,int b,int *p)，用来计算两个整数的和与积，和用return语句返回，
  积用指针变量p保存。主函数读入变量a，b，调用该子函数，输出a与b的和与积。
*/
int a,b,p;
scanf("%d%d",&a,&b);
int he;
he=fn(a,b,&p);
printf("a与b的和为%d，积为%d\n",he,p);
    return 0;
}


```

```
#include<stdio.h>
int main(void)
{
  /*
8.定义一个存放10个整数的数组，从键盘读入10个整数存放到数组中，
  将每个元素的值加1，输出修改后的数组元素。
*/
int a[10];
int *p=a;
for(int i=0;i<10;i++){scanf("%d",&a[i]);a[i]+=1;}
for(int i=0;i<10;i++) printf("%d ",*p++);
    return 0;
}


```

```
#include<stdio.h>
void find(int a[],int *pmax,int *pmin)
{
    *pmax=a[0];
    *pmin=a[0];
    for(int i=0;i<10;i++)
    {
        if(a[i]>*pmax)*pmax=a[i];
        if(a[i]<*pmin)*pmin=a[i];
    }
}
int main(void)
{
  /*
9.使用数组名和指针变量作函数参数，写一个子函数void find(int a[],int *pmax,int *pmin)，
  计算传入的数组a中最大值和最小值，并用两个指针变量保存该值。
  主函数建立含有10个整数的数组，并从键盘读入元素，调用子函数，输出最大值和最小值。
*/
int a[10],maxn,minn;
for(int i=0;i<10;i++)scanf("%d",&a[i]);
find(a,&maxn,&minn);
printf("最大值为%d,最小值为%d\n",maxn,minn);
    return 0;
}


```

```
#include<stdio.h>
int fn1(int n)
{
    int cnt=0;
   for(int i=1;i<=n;i++)if(n%i==0)cnt++;
   return cnt;
}
int fn2(int a)
{
    if(a==2)return 1;else return 0;
}
char fn3(int a)
{
    if(a)return'y';else return'n';
}
int main(void)
{
  /*
11.编写三个函数，用来判断输入的正整数是否是质数，返回值分别为：
返回除尽1到x之间因子的次数；返回除尽因子次数是否等于2；
返回字符'y'或者'n'表示是或不是质数；在主函数中分别调用此三个函数，输出结果
*/
int n;
scanf("%d",&n);
    int get=fn1(n);
    int yes=fn2(get);
    printf("%c",fn3(yes));

    return 0;
}


```

这题是真的麻烦
```C
#include<stdio.h>
int strlen(char a[])
{
    int p=1;
    while(*(a+1)!='\0'){p++;a++;}
    return p;

}
int max(int a,int b){if(a>b)return a;else return b;}
void swap(char *a,char *b){char mid;mid=*a;*a=*b;*b=mid;}
void swapd(int *a,int *b){int mid;mid=*a;*a=*b;*b=mid;}
void swaparr(char x[],char y[],int a,int b)
{
    for(int i=0;i<max(a,b);i++)
    swap(&x[i],&y[i]);
}
int yiwei(char a[],char b[],int times,int lena,int lenb)
{
    int i;
    for( i=lena-1+times;i-times>=0;i--){a[i]=a[i-times];}
    if((lena+times)>lenb)for(;i>=0;i--)a[i]='0';
  //  else for(int i=lena+times;i<=lenb;i++)a[i]='0';
        for(int i=lenb;i<=lenb+times;i++)b[i]='0';
    a[lena+times]='\0';
    b[lena+times]='\0';

    //for(int i=0;i<lena+times;i++)printf("%c",a[i]);printf("\n");
     //for(int i=0;i<lena+times;i++)printf("%c",b[i]);printf("\n");
}
void add(char a[],char b[],char c[])
{
    int lena=strlen(a);
    int last=0,t=0;
    for(int i=lena-1;i>=0;i--)
        {
            int get=a[i]+b[i]-'0'-'0'+last;
            c[t++]=get%10+'0';

            last=get/10;
        }
        c[t]='\0';


}

int main(void)
{
    /*
    12.从键盘读入两个正整数x和y，查找x中的高位最大数字和y中低位的最大数字，将两个对齐相加，求最后的结果。
    （例如x为164564，y为2394901，则将x的第二个数字6与y的第五个数字9对齐相加，输出最后的结果，选作）
    */
    int i;
    char x[200],y[200];
    scanf("%s %s",x,y);
    int lenx=strlen(x),leny=strlen(y);
    int px=0,py=leny-1;

    //找到位置
    for(i=1;i<lenx;i++)if(x[i]>x[px])px=i;
    for(i=leny-1;i>=0;i--)if(x[i]>x[py])py=i;

    //函数对x移位，对y补位
    if(py<px){swaparr(x,y,lenx,leny);swapd(&py,&px);}
    int bu=yiwei(x,y,py-px,lenx,leny);

    //函数对x和y做加法
    char ans[200];
    add(x,y,ans);
    for(int i=strlen(ans)-1;i>=0;i--)printf("%c",ans[i]);
    return 0;
}

```



### 第10次上机练习

```
#include<stdio.h>
int fn(int a[],int *b)
{
    int t=0;
   for(int i=0;i<10;i++)
    if(a[i]<0)t++;else *b++;
   return t;
}
int main(void)
{
    /*
    5.int fn1(int a[])和int fn1(int *a)两者无论是从形式上还是功能上完全等价，
    即函数参数是数组名、指针变量、地址是等价的。定义一个子函数int fn2(int *a)，
    能够计算传入的数组中正整数的个数。
    主函数建立含有10个整数的数组，并从键盘读入元素，调用子函数，输出数组中正整数的个数及非正整数的个数。
    */
    int a[10];
    for(int i=0;i<10;i++)
    scanf("%d",&a[i]);
    int pos,disp;
    disp=fn(a,&pos);
    printf("正整数有%d个，非正整数有%d个\n",pos,disp);
    return 0;
}

```

```
#include<stdio.h>
int fn(int a[],int len)
{
    int sum=0;
   for(int i=0;i<len;i++)
    sum+=a[i];
   return sum;
}
int main(void)
{
    /*
   6.编写一个函数，int fn（int a [],int len）,该函数求解数组a的len个元素的和。编写一个主函数，
   建立一个整数数组，含有从键盘读入的10个元素，调用该子函数两次，输出该数组前5个元素的和与后4个元素的和。
    */
    int a[10];
    for(int i=0;i<10;i++)
    scanf("%d",&a[i]);
    int sum;
    sum=fn(&a[0],5);
    printf("前5个元素的和为%d\n",sum);
    sum=fn(&a[5],4);
     printf("后4个元素的和为%d\n",sum);
    return 0;
}

```

```
#include<stdio.h>
void fn(int a,int b,int p[])
{
    p[1]=a+b;
    p[2]=a-b;
    p[3]=a*b;
}
int main(void)
{
    /*
  8.将数组名做函数参数，用来带回多个值。
编写一个子函数void fn(int a,int b,int p[])，用来计算传入的两个正整数a和b的和、差、积，结果放在数组p中。
  主函数从键盘读入两个整数，调用子函数，求得结果，并输出。
    */
  int a,b;
  int ans[4];
  scanf("%d %d",&a,&b);
  fn(a,b,ans);
  printf("%d  %d  %d",ans[1],ans[2],ans[3]);
    return 0;
}

```

```
#include<stdio.h>
void fn(int a[],int len)
{
    int sum=0,mul=1;
   for(int i=1;i<=len;i++)
   {
       sum+=a[i];
       mul*=a[i];
   }
   a[1]=sum;
   a[len]=mul;
}
int main(void)
{
    /*
 9.编写一个子函数，void fn（int a[],int len）,
 该函数用来计算数组中len个元素的和与积，将结果放在数组len长度的首位和末位。
 编写一个主函数，建立一个整数数组，
 含有10个元素,分别是1到10，依次调用该子函数fn（a,5），fn（a,2），fn（a,10），a[0]和a[9]各是多少？
    */
 int a[11];
 for(int i=1;i<=10;i++)scanf("%d",&a[i]);
 fn(a,5);
 fn(a,2);
 fn(a,10);
 printf("a[0]=%d  a[9]=%d\n",a[0],a[9]);
    return 0;
}

```

```
#include<stdio.h>
int main(void)
{
    /*
 10.一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法（选作）。
    */
 int a[100];
 int n;
 scanf("%d",&n);
 a[0]=1;
 a[1]=1;
 for(int i=2;i<=n;i++)a[i]=a[i-1]+a[i-2];
 printf("跳上n级有%d种",a[n]);
    return 0;
}

```

```
#include<stdio.h>
int main(void)
{
    /*
 11.一只青蛙一次可以跳上1级台阶，也可以跳上2级，……，它也可以跳上n级。
 求该青蛙跳上一个n级的台阶总共有多少种跳法（选作）。
    */
 int a[100];
 int n;
 scanf("%d",&n);
 a[0]=1;
 a[1]=1;
 for(int i=2;i<=n;i++)
 {
     a[i]=0;
     for(int d=0;d<i;d++)
        a[i]+=a[d];
 }
 printf("跳上n级有%d种",a[n]);
    return 0;
}

```

```c
#include<stdio.h>
int main(void)
{
    /*
12.已知n个人（以编号1，2，3...n分别表示）围坐在一张圆桌周围。
从编号为k的人开始报数，数到m的那个人出列；他的下一个人又从1开始报数，数到m的那个人又出列；
依此规律重复下去，直到圆桌周围的人全部出列。输出出列人的编号（使用数组，思考）。
    */
 int n,k,cnt=1,m;
 int all[100];
 k=3;
 n=10;
 m=4;
 for(int i=0;i<n;i++)all[i]=1;
 while(1)
 {
     if(all[k]==1)
     {
            if(cnt%m==0){all[k]=0;printf("%d 出列\n",k+1);}
            if((cnt/m)==n)break;
            cnt++;
            }
            k++;
            if(k==n)k=0;

 }
 printf("游戏结束");
    return 0;
}

```

### 第11次上机练习

第11次上机练习（第13周）：
0.0.定义一个学生结构包括如下字段，学生学号：整数；姓名：字符串(20个字符)；10门课的成绩：整数。定义一个学生变量，从键盘读入该同学的信息，并输出；定义一个学生数组，含有10个学生，读入每位同学的信息，输出每位同学的学号、姓名和该同学的总成绩；输出总分最高同学的学号、姓名和总成绩；输出单科最高分的同学学号和姓名。（若有多个同学成绩相同，则都要输出；使用循环读入10位同学信息，使用循环读入每位同学成绩；请注意读入姓名的写法）。
0.1.定义一个函数，输入参数是上题的学生结构，返回值是该学生的总成绩，使用该函数完成上题的。

```
#include<stdio.h>
struct student
{
    int num;
    char name[20];
    int score[12];
};
void get(student* a)
{
    scanf("%d %s",&a->num,a->name);
    for(int i=1;i<=10;i++)scanf("%d",&a->score[i]);

}
int fn(student a)
{
    int sum=0;
    for(int i=1;i<=10;i++)sum=sum+a.score[i];
    return sum;
}
int main(void)
{
    /*
0.0.定义一个学生结构包括如下字段，学生学号：整数；姓名：
    字符串(20个字符)；10门课的成绩：整数。
    定义一个学生变量，从键盘读入该同学的信息，并输出；
    定义一个学生数组，含有10个学生，读入每位同学的信息，输出每位同学的学号、姓名和该同学的总成绩；
    输出总分最高同学的学号、姓名和总成绩；输出单科最高分的同学学号和姓名。
    （若有多个同学成绩相同，则都要输出；
    使用循环读入10位同学信息，使用循环读入每位同学成绩；请注意读入姓名的写法）。
    0.1.定义一个函数，输入参数是上题的学生结构，返回值是该学生的总成绩，使用该函数完成上题的。
 */
 student a;
 int tot;
 get(&a);
 printf("学生学号：%d；姓名：%s  10门课的成绩:",a.num,a.name);
 for(int i=1;i<=10;i++)printf("%d ",a.score[i]);printf("\n");

 student many[20];
 int most=-1,p=0;
 for(int i=1;i<=10;i++)
 {
     get(&many[i]);
     printf("学生学号：%d；姓名：%s  ",many[i].num,many[i].name);
    int b=fn(many[i]);
     if(b>most){most=b;p=i;}
     printf("总成绩为：%d\n",b);
 }
 printf("总分最高同学的学号为%d  姓名为%s 总成绩为%d\n",many[p].num,many[p].name,most);

 for(int i=1;i<=10;i++)
 {
   int t=1;
    for(int d=2;d<=10;d++)
       {
       if(many[d].score[i] > many[t].score[i])t=d;}
    printf("第%2d个科目：最高同学的学号为%d  姓名为%s  \n",i,many[t].num,many[t].name);
}
return 0;
}

```

1.以下对数组名a和正整数i，叙述正确的有：
数组名表示数组首元素的地址；
数组名表示全部的元素；
数组名表示全部元素的地址；
数组名可以自增和自减运算；
a+i合法；*(a+i)合法；*a+i合法；a[i]合法；&a[i]合法；*&a[i]合法；&*a[i]合法；
数组名不能放在等号的左面；
变量的地址不能放在等号的左面；
表达式不能放在等号的左面；
2.当指针p指向数组a时，i为正整数，以下叙述正确的有：
指针只能指向首元素；
指针可以自增自减运算；
p与a完全等价；
p+i，a+i，p[i],a[i]等价；
*(p+i),*(a+i)，p[i]，a[i]等价；
3.当将主函数中变量的地址作为子函数的参数调用时，以下对子函数叙述正确的是：
一定会修改主函数的变量值，因为传递了地址；
一定无法修改主函数的变量值，因为函数调用是传值的；
可以修改主函数变量的地址，因为传递了地址；
一定无法修改主函数变量的地址的值，因为函数调用是传值的；
4.以下叙述正确的是：
一个指针可以同时指向多个变量；
一个指针可以指向多个变量，但是某个时刻只能指向一个变量；
一个指针只能指向一个变量；
多个指针可以同时指向一个变量；
当两个指针指向某些变量时，该两个指针的值必然不同；
当两个指针指向某些变量时，该两个指针的地址必然不同；
当两个指针指向同一个变量时，该两个指针的值必然相同；
当两个指针指向同一个变量时，该两个指针的地址必然不同；
5.以下叙述正确的是：
主函数和子函数的地址空间不一样；
主函数的变量名在子函数中不能访问；
子函数的变量名在主函数中不能访问；
主函数和子函数不能有相同的变量名；
主函数和子函数必须有相同的变量名；
当需要进行参数传递时，主函数和子函数必须有相同的变量名；
6.以下对函数void fun(void);的叙述正确的是：
该函数没有返回值，因此无法调用；
该函数没有输入参数，因此无法调用；
该函数没有返回值，因此调用无价值；
该函数没有输入参数，因此调用无价值；
该函数没有返回值，因此函数体中无return 语句；
该函数没有返回值，因此函数体中无return  x;语句；
该函数没有返回值，因此不能写成z=fun()；
该函数没有返回值，因此不能写成printf("%d",fun())；
7.以下叙述正确的是
不同类型的变量占据的内存空间大小必然不同；
相同类型的变量占据的内存空间大小可能不同；
字符数组必然有一个结束标志'\0';
字符串必然有一个结束标志'\0';
8.指针是变量，是否有指向指针的指针？指针是否可以指向一个一维数组，而非其单个元素？ 
9.int *p[3]、int (*p)[3]、int *fun()、void *fun(void *)、int (*fn)(int a[],int len) 都表示什么含义？ 
10.已知一个函数定义如下,定义一个能指向该函数的指针，指向该函数，并用指针计算3和5的和：
int add(int a,int b)
{
return a+b;
}
11.为什么需要结构？如何定义一个结构？结构变量有地址吗？ 





### 第12次上机练习

```
#include<stdio.h>
#include<stdlib.h>
int main(void)
{
   /*
0.2 建立一个整数数组含有50个元素，从键盘读入50个整数，
放入数组中，使用选择或者插入排序，实现数组元素升序排列。
   */
   //以下使用插入排序
int arr[51];
for(int i=0;i<50;i++)
scanf("%d",&arr[i]);
    
for(int i=1;i<50;i++)
{
    int d,e=arr[i];
    for( d=i;d>0&&arr[d-1]>e;d--)arr[d]=arr[d-1];
    arr[d]=e;
}
for(int i=0;i<50;i++)printf("%d ",arr[i]);
   return 0;
}

```

```
#include <stdio.h>
int fn(int a[],int len)
{
    int sum=0;
    for(int i=0;i<len;i++)
        sum+=a[i];
    return sum;
}
int main()
{
    /*
    0.3编写一个函数，int fn（int a [],int len）,该函数求解数组a的len个元素的和。
    */

	int i;
	int a[]={0,1,2,3,4,5,6,7,8,9};
	int sum=fn(a,10);
	printf("sum=%d\n",sum);

return 0;
}

```

```
#include<stdio.h>
int fn(int a,int b,int *p)
{
    *p=a*b;
    return a+b;
}
int main(void)
{
    /*
    0.4.编写一个子函数int fn(int a,int b,int *p)，用来计算两个整数的和与积，
    和用return语句返回，积用指针变量p保存。主函数读入变量a，b，
    调用该子函数，输出a与b的和与积。
    */
    int a,b,sum,mul;
    scanf("%d %d",&a,&b);
    sum=fn(a,b,&mul);
    printf("a+b=%d  a*b=%d\n",sum,mul);
    return 0;

}

```

```
#include<stdio.h>
struct student{
int num;
char name[20];
int c1,c2,c3;
};
int main(void)
{
    /*
    0.5定义一个结构包括如下字段，学生学号：整数；姓名：字符串(20个字符)；
    三门课(c1，c2，c3)的成绩：整数。
    定义一个学生数组，含有10个同学，从键盘读入所有同学的信息并输出，同时输出单门课的最高分。
    */
   student all[10];
   int max1,max2,max3;
   for(int i=0;i<10;i++)
   {
       scanf("%d %s %d %d %d",&all[i].num,&all[i].name,&all[i].c1,&all[i].c2,&all[i].c3);
       printf("第%d号同学的姓名是%s  三门课的成绩分别为：%d %d %d\n",all[i].num,all[i].name,all[i].c1,all[i].c2,all[i].c3);
       if(all[i].c1>max1)max1=all[i].c1;
       if(all[i].c2>max2)max2=all[i].c2;
       if(all[i].c3>max3)max3=all[i].c3;
   }
   printf("科目一最高分为%d 科目一最高分为%d  科目一最高分为%d ",max1,max2,max3);
    return 0;

}

```