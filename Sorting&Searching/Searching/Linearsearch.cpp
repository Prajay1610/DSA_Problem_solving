#include<bits/stdc++.h>
using namespace std;
int linearsearch(vector<int> arr,int target){
    for(int i=0;i<arr.size();i++){
        if(arr[i]==target){
            return i;
        }
    }
    return -1;
}
int main()
{   vector<int> v={10,20,30,40,50};
    int target=40;
    int result = linearsearch(v,target);
    if(result<0){
        cout<<"Element not found"<<endl;
    }
    else{
        cout<<"Element found at index: "<<result<<endl;
    }
    return 0;
}