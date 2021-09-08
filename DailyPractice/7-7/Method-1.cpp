#include <iostream>
#include <time.h>
using namespace std;

int main(){
	clock_t start, finish; 
	long long int S=0,n;
	cin>>n;

	start = clock();
	for(;n>0;n--)
	  S+=n;
	finish = clock();
	
	cout<<S<<endl;
	cout<<(double)(finish - start)<<"ms";
	return 0;
}
/////累加法