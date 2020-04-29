#include<iostream>
using namespace std;
int main()
{
  int n,s,i,a[i],sum=0;
  std::cin>>n;
  std::cin>>s;
  for(i=0;i<n;i++)
  {
  std::cin>>a[i];
    sum=sum+a[i];
  }
  if(sum<=n)
  {
   std::cout<<"YES"; 
  }
  else
  {
    std::cout<<"NO";
  }
}