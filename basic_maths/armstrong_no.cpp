#include<bits/stdc++.h>
#include<cmath>
using namespace std;
bool check_armstrong(int n){
    int num =n;
    int k = log10(n)+1;//calculates the no of digits in the num
    cout<<k<<endl;
    int sum = 0;
  
    while(num>0){
        int rem = num %10;
        sum +=(pow(rem,k));
        num=num/10;
    }
   return n==sum;
    


}
int main()
{   
    int n=153;
    cout<<check_armstrong(n);
    return 0;
}