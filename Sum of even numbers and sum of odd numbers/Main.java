#include<iostream>
using namespace std;
int main()
{
  int n,arr[n];
  std::cin>>n;
  int i,oddSum=0,evenSum=0;
  for(i=0;i<n;i++)
  {
  std::cin>>arr[i];
  }
    for(i=0; i<n; i++){
        if(arr[i]%2==0){
        evenSum=evenSum+arr[i];
        }
    else{
             oddSum=oddSum+arr[i];
        }
    }
   std::cout<<"The sum of the even numbers in the array is "<<evenSum; 
   std::cout<<"\nThe sum of the odd numbers in the array is "<<oddSum;
    return 0;
}