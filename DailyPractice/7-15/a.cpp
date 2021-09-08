#include<iostream>
#include<time.h>
using namespace std;

int main(){
    clock_t start = clock();
    for(int i = 0;i < 32; i++)
	{
		cout<<i % 32 / 16<<i % 16 / 8<<i % 8 / 4<<i % 4 / 2<<i % 2<<endl;
	}
    clock_t end = clock();
    cout<<(double)(end - start)<<"ms";
    return 0;
}