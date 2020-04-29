#include<iostream>
using namespace std;
int main()
{
  int n,m,i,a[i],sum=0,b;
  std::cin>>n;
  std::cin>>m;
  for(i=0;i<n;i++)
  {
  std::cin>>a[i];  
  }
  
  for(i=0;i<n;i++)
  {
    sum=sum+a[i];
  }
  sum=sum-a[0];
  //std::cout<<sum;
  if(sum%m ==0)
  {
    b=(sum/m)+1;
    std::cout<<b;
  }
  else
  {
   b=(sum/m)+2; 
    std::cout<<b;
  }
}