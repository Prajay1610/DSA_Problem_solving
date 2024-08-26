#include<bits/stdc++.h>
using namespace std;
int binarySearch(vector<int> v,int target){
    int s=0,e=v.size()-1;
    
    while(s<=e){
        int mid = (s+e)/2;
        if(v[mid]<target){
            s=mid+1;
        }
        else if(v[mid]>target){
            e=mid-1;
        }
        else{
            return mid;
        }
    }
    return -1;
    
}
int main()
{   vector<int> v={10,20,30,40,50};
    int target=10;
    int result = binarySearch(v,target);
    if(result<0){
        cout<<"Element not found"<<endl;
    }
    else{
        cout<<"Element found at index: "<<result<<endl;
    }
    return 0;
}