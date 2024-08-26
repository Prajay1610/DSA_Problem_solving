#include<bits/stdc++.h>
using namespace std;
bool checkSorted(int *arr,int n){
    int s=0;
    int e = n-1;
    while(s<=e){
        if(arr[s]>arr[e]){
            return false; 
        }
        else if(s==e){
            if(arr[s]<arr[s-1]){
                return false;
            }
        }
        s++;
        e--;
    }
    return true;
}
int main()
{   int arr[]={10,1,3,2,50};
    int n = 5;
    cout<<checkSorted(arr,n);
    return 0;
}