#include <iostream>

using namespace std;

int main(){
    int sA = 0; //存放 s 串的ASCII值的和
    int tA = 0; //存放 t 串的ASCII值的和
    char temp;

    for (int i = 0; i < 1000; i++){
        temp = getchar();
        if (temp == ' ' || temp == '\n') break; //遇到空格或回车停止输入
        else sA = sA + temp;
    }

    for (int i = 0; i < 1000; i++){
        temp = getchar();
        if (temp == ' ' || temp == '\n') break;
        else tA = tA + temp;
    }

    cout << (char)(tA - sA);

    return 0;
}