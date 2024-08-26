#include<bits/stdc++.h>
using namespace std;
//selection sort --T.C O(n)^2
void selectionSort(int v[],int n){
    
    for(int i=0;i<=(n-2);i++){
        int mini = i;
        for(int j=i;j<=(n-1);j++){
            if(v[j] <v[mini]){
                mini = j;
            }
        }
        swap(v[mini],v[i]);
    }
}

//bubble sort---T.C O(n)
void bubbleSort(int v[],int n){
    for(int i=n-1;i>=1;i--){
        int didSwap=0;
        for(int j=0;j<=(i-1);j++){
            if(v[j]>v[j+1]){
                swap(v[j],v[j+1]);
                didSwap=1;
            }
        }
        if(didSwap==0){
            break;//coz array is already sorted if no swaps were performed
                  //in first iteration
        }

    }
}

//insertion sort
void insertionSort(int v[],int n){
    for(int i=0;i<=(n-1);i++){
        int j=i;
        while(j>0 && v[j-1]>v[j]){
            swap(v[j-1],v[j]);
            j--;
        }
    }
}
int main()
{   int v[]={23,4,12,5,1};
    int n=5;
    // selectionSort(v,n);
    // bubbleSort(v,n);
    insertionSort(v,n);
    for(auto elem:v){
       cout<<elem<<" ";
    }
    return 0;
}