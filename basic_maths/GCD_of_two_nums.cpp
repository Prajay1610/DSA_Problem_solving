#include<bits/stdc++.h>
using namespace std;
int findGCD(int n1,int n2){
    for(int i=min(n1,n2);i>0;i--){
        if(n1%i==0 && n2%i==0){
            return i;
        }
    }

    /*as 1 is always divisor on any number */
    return 1;
}
int main()
{   int n1=6,n2=12;
    int gcd=findGCD(n1,n2);
    cout<<"GCD of "<<n1<<" and "<<n2<<" is: "<<gcd;
    return 0;
}