模板题hdu1711

```cpp#include<cstdio>
#include<bits/stdc++.h>
using namespace std;
const int maxn1=1e4+10;
const int maxn2=1e6+10;
int aa[maxn1],bb[maxn2];
int f[maxn1],n,m;
void mk_pmt()
{
    f[0]=f[1]=0;
    for(int i=1;i<n;++i)
    {
        int j=f[i];
        while(j&&aa[i]!=aa[j])j=f[j];

        f[i+1]= aa[j]==aa[i]?j+1:0;

    }
}
int solve()
{
    int j=0;
    for(int i=0;i<m;++i)
    {
        while(j&&bb[i]!=aa[j])j=f[j];
        j=  bb[i]==aa[j]?j+1:0;
        if(j==n)return i-n+2;
    }
    return -1;
}
int main(void)
{
    int cas;
    scanf("%d",&cas);

    while(cas--)
    {
        scanf("%d %d",&m,&n);
       for(int i=0;i<m;++i)scanf("%d",&bb[i]);
       for(int i=0;i<n;++i)scanf("%d",&aa[i]);
      mk_pmt();
      int get=solve();
      printf("%d\n",get);
    }
    return 0;

}


```

练习题：
E - Compress Words CodeForces - 1200E