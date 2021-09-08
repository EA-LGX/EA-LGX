#include<iostream>
#include<string>
using namespace std;

int main(){
    char s[1000];
    int sLength;
    for(sLength=0;sLength<1000;sLength++){\
        s[sLength]=getchar();
        if(s[sLength]=='\n'){
            s[sLength]='\0';
            break;
        }
    }






    
}