#include<bits/stdc++.h>
using namespace std;
int main()
{   int n=5;
    for(int i =0;i<n;i++){
        //space
        for(int j=0;j<(n-i);j++){
            cout<<" ";
        }
        //star
        for(int k=0;k<(2*i+1);k++){
            cout<<"*";
        }
        //space
        for(int l=0;l<(n-i);l++){
            cout<<" ";
        }
        cout<<endl;
    }
    
    return 0;
}