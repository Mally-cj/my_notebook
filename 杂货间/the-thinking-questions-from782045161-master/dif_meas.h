#ifndef DIF_MEAS_H_INCLUDED
#define DIF_MEAS_H_INCLUDED
void solve1(int a,int p,int t_p,int *ans,int a_i_p[])//从小到大
{
    //printf("kkkk  a=%d p=%d\n",a,p);
    int cur_index=t_p-p+1;
    if(p==1)
    {
        a_i_p[cur_index]=a;
        if(a_i_p[cur_index]<a_i_p[cur_index-1])return;
        //for(int j=1;j<=t_p;j++)printf("%d",a_i_p[j]);printf("\n");
        ++*ans;
        return;
    }
    for(int k=0;k<=a;k++)
    {
        a_i_p[cur_index]=k;
       //printf("%d  %d  cur=%d \n",a_i_p[cur_index],a_i_p[cur_index-1],cur_index);
        if(a_i_p[cur_index]<a_i_p[cur_index-1])continue;
      solve1(a-k,p-1,t_p,ans,a_i_p);
    }
}
void solve2(int a,int b,int last,int *c,int arr[])
{
   if(b==1)
   {
      if(a<=last&&a>=0) ++*c;
       return;
   }
   if(a==0){++*c;return;}

   int minn=last;
   if(a<minn)minn=a;
   for(int i=minn;i>0;i--)solve2(a-i,b-1,i,c,arr);
}

void solve3(int a,int b,int d,int *c,int arr[])
{
    if(a==0||b==1){++*c;return ;}
    if(a<b) solve3(a,b-1,d,c,arr);
    else { solve3(a,b-1,d,c,arr);solve3(a-b,b,d,c,arr);}
}
void solve4(int a,int b,int d,int *c,int arr[])
{
    int all[400][400];
    for(int i=0;i<=a;i++)
    for(int j=0;j<=b;j++)
    {
     if(i==0||j==1){all[i][j]=1;continue;}
        if(i>=j)all[i][j]=all[i-j][j]+all[i][j-1];
    else all[i][j]=all[i][j-1];
    }
    *c=all[a][b];
}








#endif // DIF_MEAS_H_INCLUDED
