#include <iostream>

using namespace std;

int main(){
    char s[1000],t[1001];
    int sA=0,tA=0;

    for(int i=0;i<1000;i++){
        s[i]=getchar();
        if(s[i]=='\n'||s[i]==' '){
            s[i]='\0';
            break;
        }
        else sA=sA+s[i];
    }

    for(int i=0;i<1000;i++){
        t[i]=getchar();
        if(t[i]=='\n'||t[i]==' '){
            t[i]='\0';
            break;
        }
        else tA=tA+t[i];
    }
    
    cout<<(char)(tA-sA);

    return 0;
}