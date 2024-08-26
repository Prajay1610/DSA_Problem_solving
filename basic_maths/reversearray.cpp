#include<bits/stdc++.h>
using namespace std;
//reverse an array 
//using 2 pointer approach
//using recursion for swapping and moving start and end accordingly
//using in built reverse(start iterator,end iterator) fxn
//using an extra array
void reversearray(vector<int> &arr){
    int s,e;
    s=0;
    e=(arr.size())-1;
    while(s<=e){
        int temp =arr[s];
        arr[s]=arr[e];
        arr[e]=temp;

        s++;
        e--;
    }
    
}
void printarray(vector<int> &v){
    for(int i=0;i<v.size();i++){
        cout<<v[i]<<" ";
    }
    cout<<endl;
}
int main()
{   vector<int> arr={11,22,33,44,55};
    cout<<"Before"<<endl;
    printarray(arr);
    reversearray(arr);
    cout<<"After"<<endl;
    printarray(arr);

    return 0;
}