#include<iostream>
using namespace std;
int main()
{
  string a,front;
  int rail;
  std::cin>>a>>rail;
  if (a=="front")
  {
    if (rail==1)
    {
      std::cout<<"Left Handed";
    }
    else
      {
      std::cout<<"Right Handed";
     
     }
  }
  else 
  {
    if (rail==1)
    {
      std::cout<<"Right Handed";
    }
    else
      {
      std::cout<<"Left Handed";
     }
  }
}