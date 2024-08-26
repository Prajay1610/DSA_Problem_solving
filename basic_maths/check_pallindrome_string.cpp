#include<bits/stdc++.h>
using namespace std;
int main()
{   
    string str;
    int flag=1;
    cout<<"Enter the string:"<<endl;
    cin>>str;
    int s,e;
    s=0;
    e=str.length()-1;
    while(s<=e){
        if(str[s]!=str[e]){
            flag=0;
            break;
        }
        s++;
        e--;
    }

    flag?cout<<"Pallindrome":cout<<"Not a Pallindrome";

    return 0;
}