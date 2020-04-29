#include<iostream>
using namespace std;
int main()
{
  int d1,c1,d2,c2,d,c,r,q;
std::cin>>d1;
std::cin>>c1;
std::cin>>d2;
std::cin>>c2;

q=(c1+c2)/100;
r=(c1+c2)%100;
d=d1+d2+q;
c=r;
std::cout<<d;
std::cout<<"\n"<<c;
}