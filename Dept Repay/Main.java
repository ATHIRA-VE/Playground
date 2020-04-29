#include<iostream>
using namespace std;
int main()
{
 int p,n,r;
float i,a,d,f;
std::cin>>p;
std::cin>>n;
std::cin>>r;
i=(p*n*r)/100;
a=p+i;
d=(i*2)/100;
f=a-d;
std::cout<<i;
std::cout<<"\n"<<a;
std::cout<<"\n"<<d;
std::cout<<"\n"<<f;
}