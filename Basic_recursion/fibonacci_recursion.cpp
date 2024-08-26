#include<bits/stdc++.h>
using namespace std;
int printfibonnaci(int n){
    if(n<=1&&n>=0){
        return n;
    }
    else if(n<0){
        return 1;
    }
    
    //as nth term = sum of (n-1)th term and (n-2)th term
    return printfibonnaci(n-1)+printfibonnaci(n-2);
    
}
int main()
{   int n=-2;
    cout<<printfibonnaci(n);
    return 0;
}