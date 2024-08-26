#include<bits/stdc++.h>
using namespace std;
void printArr(vector<int> arr){
    for(int i=0;i<arr.size();i++){
        cout<<arr[i]<<" ";
    }
}
void merge(vector<int> &arr,int low,int mid,int high){
    vector<int> temp;
    int left = low;
    int right = mid+1;
    //ensuring the two partitions remain in their range of index
    // [low...mid] [mid+1...high]
    while(left<=mid && right<=high){
        if(arr[left]<=arr[right]){
            temp.push_back(arr[left]);
            left++;
        }
        else{
            temp.push_back(arr[right]);
            right++;
        }
    }

    //if left part remains then push the whole left part as it is into the temp
    while(left<=mid){
        temp.push_back(arr[left]);
        left++;
    }
     //if right part remains then push the whole right part as it is into the temp
    while(right<=high){
        temp.push_back(arr[right]);
        right++;
    }

    //put contents of temp into arr
    for(int i=low;i<=high;i++){
        arr[i]=temp[i-low];
    }

}
void mergeSort(vector<int> &arr,int low,int high){
    if(low>=high) return;//Base condition
    int mid = (low+high)/2;
    mergeSort(arr,low,mid);//left part
    mergeSort(arr,mid+1,high);//right part
    merge(arr,low,mid,high);
}
int main()
{   vector<int> arr = {9, 4, 7,4,2,3 ,6, 3, 1, 5};
    int low = 0;
    int high = 9;
    mergeSort(arr,low,high);
    printArr(arr);
    return 0;
}