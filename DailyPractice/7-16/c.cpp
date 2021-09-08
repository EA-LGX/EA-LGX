#include<iostream>

using namespace std;

int main() {
    string s, t;
    int haveSame;
    cin >> s >> t;
    for (int i = 0; i < t.length(); i++) {
        haveSame=0;
        for (int j = 0; j < s.length(); j++)
            if (t[i] == s[j]) {
                haveSame = 1;
                break;
            }
        if (!haveSame) {
            cout << t[i];
            break;
        }
    }
    return 0;
}