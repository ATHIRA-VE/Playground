#include<iostream>
using namespace std;
int main()
{
  int c,b,r,s,t,u;
std::cin>>c;
 r=(int)(0.5*c);
 s=(int)(0.65*c)+100;
 t=(int)(0.8*c)+200;
 u=(int)(1.25*c)+425;
if(c<=200)
{
std::cout<<"Rs."<<r;
}
else if(c<=400)
{
std::cout<<"Rs."<<s;
}
else if(c<=600)
{
std::cout<<"Rs."<<t;
}
else
{
std::cout<<"Rs."<<u;
}
}