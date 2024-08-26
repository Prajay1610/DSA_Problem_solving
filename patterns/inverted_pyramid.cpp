#include<bits/stdc++.h>
using namespace std;
void printinvertedpyramid(int n){
    for(int i=0;i<n;i++){
     //space
     for(int j=0;j<i;j++){
        cout<<" ";
     }
    //star  
    for(int k=0;k<=(2*(n-i-1));k++){
        cout<<"*";
    } 
    //space 
    for(int l=0;l<i;l++){
        cout<<" ";
     }   
     cout<<endl; 
    }
   
}
int main()
{   int n=5;

    printinvertedpyramid(n);
    return 0;
}