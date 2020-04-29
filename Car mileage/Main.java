#include<iostream>
using namespace std;
int main()
{
  float m;
int l,d,p;
std::cin>>m;
std::cin>>l;
std::cin>>d;
p=int(m*l);
if(d<=p)
{
std::cout<<"Can reach";
}
else
{
std::cout<<"Cannot reach";
}
}