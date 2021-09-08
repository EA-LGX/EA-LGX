#include<iostream>
#include <time.h>
using namespace std;

int main(){
	clock_t start, finish;
	long long int S,n;
	cin>>n;

	start = clock();
	S=n*(1+n)/2;
	finish = clock();

	cout<<S<<endl;
	cout<<(double)(finish - start)<<"ms";
	return 0;
}

/////等差数列求和公式