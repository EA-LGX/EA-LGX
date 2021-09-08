#include<iostream>
using namespace std;
int main(){
    int n,arr[1000],a;
    cin>>n;
    for(int i=0;i<n;i++)
        cin>>arr[i];
    cin>>a;
    for(int i=0;i<n;i++)
        if(a==arr[i]){
            cout<<i+1;
            break;
        }
    return 0;
}