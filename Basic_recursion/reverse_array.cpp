#include<bits/stdc++.h>
using namespace std;
//reverse array using recursion
void reversearray(int arr[],int start,int end){
    if(start<end){
        swap(arr[start],arr[end]);
        reversearray(arr,start+1,end-1);
    }
}

void printarray(int arr[],int n){
    cout<<"Reverse is: ";
    for(int i=0;i<n;i++){
        cout<<arr[i]<<" ";
    }
    cout<<endl;
}
int main()
{   int arr[]={12,22,33,44};
    int n = sizeof(arr)/sizeof(arr[0]);
    reversearray(arr,0,n-1);
    printarray(arr,n);
    return 0;
}