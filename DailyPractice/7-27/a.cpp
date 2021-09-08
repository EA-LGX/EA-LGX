#include<cstdio>
#include<cstring>
#include<iostream>
#include<algorithm>
#include<math.h>
using namespace std;

int get(int a,int b)
{
    int aa,bb,temp;
    aa=max(a,b);
    bb=min(a,b);
    while(bb)
    {
        temp=aa%bb;
        aa=bb;
        bb=temp;
    }
    return aa;
}

int main()
{
    int a,b,c;
    while(~scanf("%d%d%d",&a,&b,&c))
    {
        int n;
        n=a*b/get(a,b);
        int m;
        m=n*c/get(n,c);
        printf("%d\n",m);

    }


    return 0;
}