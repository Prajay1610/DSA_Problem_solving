#include<bits/stdc++.h>
using namespace std;
int main()
{   int n=5;
    //symmetric pattern type
    for(int i=0;i<n;i++){
        for(int j=0;j<=i;j++){
            cout<<"*"<<" ";
        }
        cout<<endl;
    }
    //inverted
    for(int i=0;i<n;i++){
        for(int j=0;j<(n-i)-1;j++){
            cout<<"*"<<" ";
        }
        cout<<endl;
    }
    return 0;
}