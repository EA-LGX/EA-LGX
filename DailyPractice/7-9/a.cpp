#include<iostream>
#include<time.h>
using namespace std;

int main(){
    int n,a=1,b=1,c;
    cin>>n;
    clock_t start = clock();
    for(int i=3;i<=n;i++,b=a,a=c){
        c=a+b;
    }
	clock_t finish = clock();
    cout<<c%10007<<endl;
    cout<<finish-start<<"ms";
    return 0;
}