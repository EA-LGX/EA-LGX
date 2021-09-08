#include<iostream>
#include<time.h>
using namespace std;

int main(){
    clock_t start = clock(); //开始
    
    clock_t end = clock();  //结束
    cout<<"time="<<(double)(end - start)<<"ms";
    return 0;
}