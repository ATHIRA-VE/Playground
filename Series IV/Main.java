#include<iostream>
using namespace std;
int main()
{
  int n, i, d=2, next=0;
std::cin>>n;
  std::cout<<next<<" ";
for(i=1; i<n; i++)
{
  if((i+3)%4 == 0)
   {  
     next=next+d;
   std::cout<<next<<" ";
    if(i<(n-1))
    {
    i=++i;
     d=d+4;  
     next=next+d;
   std::cout<<next<<" ";
    }
  }
else 
{
next=next+d;
std::cout<<next<<" ";
d=d+4;
  if(i<(n-1))
  {
i=++i;
next=next+d;
std::cout<<next<<" ";
}
}
}
}