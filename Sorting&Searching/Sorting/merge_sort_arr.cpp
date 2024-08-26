#include<bits/stdc++.h>
using namespace std;
void printArr(int *arr,int n){
    for(int i=0;i<n;i++){
        cout<<arr[i]<<" ";
    }
}
void merge(int *arr,int low,int mid,int high){
	int temp[high-low+1];
	int left = low;
	int right = mid+1;
	int k=0;
	while(left<=mid && right<=high){
		if(arr[left]<=arr[right]){
			temp[k]=arr[left];
			k++;
			left++;
		}
		else{
			temp[k]=arr[right];
			k++;	
			right++;
		}
	
	}
	
	while(left<=mid){
		temp[k]=arr[left];
		k++;
		left++;
	}

	while(right<=high){
		temp[k]=arr[right];
		k++;	
		right++;
	}

	for(int i=low;i<=high;i++){
	
		arr[i] = temp[i-low];
	}

}

void mergeSort(int *arr,int low,int high){
	if(low>=high) return;
	int mid = (low+high)/2;
	mergeSort(arr,low,mid);
	mergeSort(arr,mid+1,high);
	merge(arr,low,mid,high);
} 

int main(){
    int arr[] = {9, 4, 7,4,2,3 ,6, 3, 1, 5};
    int low = 0;
    int high = 9;
    int n = 10;
    mergeSort(arr,low,high);
    printArr(arr,n);
    return 0;
}