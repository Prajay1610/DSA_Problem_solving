#include<bits/stdc++.h>
using namespace std;
bool isPrime(int num){
    if(num<2){ //corner condition or edge case
            return false;
        }
    for(int i=2;i<sqrt(num);i++){
        if(num%i==0){
            return false;
        }
    }
    return true;
}
int main()
{   int n=21;
    isPrime(n)?cout<<"Prime":cout<<"Non Prime";
    return 0;
}