#include<bits/stdc++.h>
using namespace std;
vector<int> primenos(int L,int R){
    //prime numbers from 1 to n
    vector<int> prime_nos;
    int flag;
    for(int i=L;i<=R;i++){
       if(i==1||i==0){
            continue;
       }
        flag=1;
        for(int j=2;j<=sqrt(i);j++){
            if(i%j==0){
                flag=0;
                break;
            }
        }

        if(flag==1){
           prime_nos.push_back(i); 
        }
       
    }

    return prime_nos;
    
}
int main()
{   int L=1,R=50;
    vector<int> x=primenos(L,R);
    for(auto elem:x){
        cout<<elem<<" ";
    }
    return 0;
}