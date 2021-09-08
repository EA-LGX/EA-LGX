#include <iostream>
using namespace std;

int main(){
    int a[4];

    for (int i = 10000; i < 999999; i++){
        //1234
        a[0] = i / 1000;
        a[1] = (i / 100) % 10;
        a[2] = (i%100)/10;
        a[3] = i % 10;
        if (a[0] == a[3] && a[1] == a[2]){
            cout << i <<endl;
        }
    }

    return 0;
}