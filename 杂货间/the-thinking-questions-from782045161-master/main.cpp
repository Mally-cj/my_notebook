#include<cstdio>
#include<ctime>
#include<iostream>
#include<cstring>
#include "dif_meas.h"
using namespace std;

int count_time(int a,int b,void(*solve)(int,int,int,int*,int[]),int xu)
{
    int ans=0,arr[10]={0};
    clock_t startTime=clock();
    if(xu==1)solve(a,b,b,&ans,arr);
    else solve(a,b,a,&ans,arr);
    clock_t endTime=clock();
    printf("solve%d: ans=%d  cost %llf s\n",xu,ans,double(endTime-startTime)/CLOCKS_PER_SEC);
}

int main(void)
{
    int a,b,ans;
    while(scanf("%d %d",&a,&b))
    {
        count_time(a,b,solve4,4);
        count_time(a,b,solve3,3);
        count_time(a,b,solve2,2);
        count_time(a,b,solve1,1);
        puts("\n");
    }
}
