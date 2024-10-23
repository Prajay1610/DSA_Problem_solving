#include<bits/stdc++.h>
using namespace std;
// int findGCD(int n1,int n2){
//     for(int i=min(n1,n2);i>0;i--){
//         if(n1%i==0 && n2%i==0){
//             return i;
//         }
//     }

//     /*as 1 is always divisor on any number */
//     return 1;
// }

//using eucledian algorithm
int findGcd(int n1,int n2){
    if(n2==0) return n1;

    return findGcd(n2,n1%n2);
}
int main()
{   int n1=10,n2=6;
    int gcd=findGcd(n1,n2);
    cout<<"GCD of "<<n1<<" and "<<n2<<" is: "<<gcd;
    return 0;
}