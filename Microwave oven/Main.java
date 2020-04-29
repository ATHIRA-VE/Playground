#include<iostream>
using namespace std;
int main()
{
  int n;
float s,f;
std::cin>>n;
std::cin>>s;

if(n==2)
{
f=s+((s*50)/100);
std::cout<<f;
}
else if(n==3)
{
f=2*s;
std::cout<<f;
}
else if(n>3)
{
std::cout<<"Number of items is more";
}
else
{
return 0;
}
}