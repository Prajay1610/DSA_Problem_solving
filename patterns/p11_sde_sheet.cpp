#include<bits/stdc++.h>
using namespace std;
int main()
{   int n=5;
    for(int i=1;i<=n;i++){
        //numbers
        for(int j=1;j<=i;j++){
            cout<<j;
        }
        //spaces
        for(int k=1;k<=(2*(n-i));k++){
            cout<<" ";
        }
        //numbers
        for(int j=i;j>=1;j--){
            cout<<j;
        }
        cout<<endl;
    }
    return 0;
}