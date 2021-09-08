#include<iostream>
#include<math.h>
#include<time.h>
using namespace std;

int main(){
    int n,a=1,b=1,c;
    cin>>n;
    clock_t start = clock();
    c=(1/sqrt(5))*(pow((1+sqrt(5))/2,n)-pow((1-sqrt(5))/2,n));
	clock_t finish = clock();
    cout<<c%10007<<endl;
    cout<<finish-start<<"ms";
    return 0;
}