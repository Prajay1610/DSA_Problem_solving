#include<bits/stdc++.h>
using namespace std;
int recbinsearch(vector<int> v,int target,int s,int e){
   
        int mid =(s+e)/2;
        if(v[mid]<target){
            return recbinsearch(v,target,s=mid+1,e);
        }
        else if(v[mid]>target){
             return recbinsearch(v,target,s,e=mid-1);
        }
        else{
           return mid; //base conditionif(v[mid]==target)
        }
        
    
}
int main()
{   vector<int> v={10,20,30,40,50};
    int target=20;
    int s=0,e=v.size()-1;
    int result = recbinsearch(v,target,s,e);
    if(result<0){
        cout<<"Element not found"<<endl;
    }
    else{
        cout<<"Element found at index: "<<result<<endl;
    }
    
    return 0;
}