### [P5718 找最小值](https://www.luogu.com.cn/problem/P5718)

```
#include "stdio.h"
int data[1000];
int main()
{
    int n,min_num,a;
    scanf("%d",&n);
    for(int i=1;i<=n;++i)
    {
        scanf("%d",&a);
        if(i==1)min_num=a;
        else if(min_num>a)min_num=a;
    }
    printf("%d\n",min_num);
    return 0;
}
```





使用循环，计算1至5的和与积，并输出。