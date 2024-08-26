#include<bits/stdc++.h>
using namespace std;
void printalldivisors(int num){
    vector<int> divisors;
    for(int i=1;i<=num;i++){
        if(num%i==0){
            divisors.push_back(i);
        }
    }

    for(int i=0;i<divisors.size();i++){
        cout<<divisors[i]<<" ";
    }
}
int main()
{   int n=18;
    printalldivisors(n);
    return 0;
}