#include<bits/stdc++.h>
using namespace std;
int factoriall(int n){ //as eg: 5! = 5 * (5-1)!
    
    if(n==0)return 1;//base condition
    int fact = n*factoriall(n-1);
    return fact;
}
int main()
{   
    int n=-1;
    cout<<factoriall(n);
    return 0;
}