#include<bits/stdc++.h>
using namespace std;
void checkpallindrome(int n){
    int origno = n;
    int rev =0;
    while(n>0){
        int rem = n%10;
        rev=rem+(rev*10);
        n=n/10;
    }
    (rev==origno)?cout<<"Pallindrome":cout<<"Not a pallindrome"<<endl;
}
int main()
{   int n1;
    cout<<"Enter the number:";
    cin>>n1;
    checkpallindrome(n1);
    return 0;
}