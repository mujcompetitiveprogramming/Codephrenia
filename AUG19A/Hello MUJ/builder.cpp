#include <bits/stdc++.h>
using namespace std;

int randomer(){
    random_device rd; // obtain a random number from hardware
    mt19937 eng(rd()); // seed the generator
    uniform_int_distribution<> distr(1, 1000000); // define the range
    return(distr(eng));
}

int main() {
    int tt = 1000;
    int totaltt = 0;
    while(tt--){
        if(tt%3){
        
        for (int i = 0; i < 3; i++)
            cout << randomer() << " ";
            cout <<"\n";
        totaltt++;
        }else {

        for (int i = 0; i < 2; i++)
            cout << randomer() << " ";

            cout << randomer() + randomer() << "\n";
            totaltt++;
        }        
    }
    cout <<"\n"<< totaltt;
}