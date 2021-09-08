#include <iostream>

using namespace std;

int main(){
    int n, m;
    cin >> n >> m;
    for (int i = 0; i < n && i < 26; i++){
        for (int j = 0; j < m && j < 26; j++){
            if ('A' + i - j > 'A')
                cout << (char)('A' + i - j);
            else
                cout << (char)('A' + j - i);
        }
        cout << endl;
    }
    return 0;
}