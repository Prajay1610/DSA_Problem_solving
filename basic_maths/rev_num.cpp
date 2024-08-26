#include<bits/stdc++.h>
using namespace std;
int main()
{   int no;
    cin>>no;
    int reverse=0;
    while(no>0){
        int remainder = no%10;
        reverse=remainder+(reverse*10);
        no/=10;
    }

    cout<<"Reverse is:"<<reverse<<endl;
    return 0;
}