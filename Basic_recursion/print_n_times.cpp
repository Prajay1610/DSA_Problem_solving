#include<bits/stdc++.h>
using namespace std;
//print numbers till n using recursion
int cnt=0;
void print(int n){
    if(n<0)return;//base condition
    cout<<cnt<<endl;
    cnt++;
    print(--n);
}
int main()
{   int n=5;  
    print(n); 
    return 0;
}