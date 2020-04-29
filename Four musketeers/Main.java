#include<iostream>
using namespace std;
int main()
{
  int x1,y1,x2,y2,x3,y3;
float x,y,r,s;
std::cin>>x1;
std::cin>>y1;
std::cin>>x2;
std::cin>>y2;
std::cin>>x3;
std::cin>>y3;
r=int(x1+x2+x3);
s=int(y1+y2+y3);
x=r/3;
y=s/3;
std::cout<<x<<"\n";
std::cout<<y;
}