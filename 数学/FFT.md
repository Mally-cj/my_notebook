# FFT

任何一个原始的周期函数都可以用多个正余弦波叠加来近似得到。

我们去菜市场买菜的时候，无论质量如何奇怪，都可以转变为“5个 1 斤的砝码，2个 1 两的砝码”来表示出来，那么上面的图我们也可以近似地想象成周期函数就是质量特别奇怪的物品，而正余弦波就是想像成成“我用了5个1号波、3个2号波”来表示这个周期函数。



[参考博客1](https://baijiahao.baidu.com/s?id=1636833728798493906&wfr=spider&for=pc)：https://baijiahao.baidu.com/s?id=1636833728798493906&wfr=spider&for=pc



递归版本，还不过样例子（只是先存者）

```
#include "cstdio"
#include "algorithm"
#include "bits/stdc++.h"
typedef  double db; //一是可以简化代码，二是需要调整精度的时候可以很方便地替换成其他变量类型，比如long double。
using namespace std;
const db Pi=acos(-1);
const int maxn=1e6+10;
struct  P{
    double x,y;
    P operator+(const P &it){return  P{x+it.x,y+it.y}; }
    P operator-(const P &it){return  P{x-it.x,y-it.y}; }
    P operator*(const P &it){return P{x*it.x-y*it.y,x*it.y+y*it.x};}
    P operator/(const db &it){ return P{x/it,y/it};  }
};
P wn[maxn][2];
void make_wn(int n) {
    for (int i = 1; i <= n; ++i) {
        wn[i][0].x = cos(2 * Pi / i), wn[i][0].y = sin(2 * Pi / i);
        wn[i][1].x =wn[i][0].x,           wn[i][1].y= wn[i][0].y*(-1.0);
    }
}
void FFT(P *a,int n,int type)
{
    if(n==1)return ;
    static P b[maxn];
    int mid=n/2;
    for(int i=0;i<n;i+=2) b[i/2]=a[i],b[i+mid]=a[i+1];
    for(int i=0;i<n;++i) a[i]=b[i];
    FFT(a,n/2,type),FFT(a+mid,n/2,type);
    P w{1,0};
    for(int i=0;i<mid;++i,w=w*wn[n][type])
    {
        P x=a[i],y=w*a[i+mid];
        a[i]=x+y,a[i+mid]=x-y;
    }
}
P a1[maxn],a2[maxn];
int main(void)
{
//    freopen("in.text","r",stdin);
    int n,m,length=1;
    scanf("%d %d",&n,&m);
    for(int i=0;i<=n;++i)scanf("%lf",&a1[i].x);
    for(int i=0;i<=m;++i)scanf("%lf",&a2[i].x);
    while (length<=n+m)length<<=1;
    make_wn(length);
    FFT(a1,length,0),FFT(a2,length,0);
    for(int i=0;i<=length;++i) a1[i]=a1[i]*a2[i];
    FFT(a1,length,1);
    for(int i=0;i<=n+m;++i)
        printf("%d ",(int)(a1[i].x/length+0.5) );
    return 0;
}
```

