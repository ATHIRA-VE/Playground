#include<iostream>
#include<math.h>
using namespace std;
int main()
{
int x,y,n,r;
std::cin>>x;
std::cin>>y;
r=((x-3)*(x-3))+((y-4)*(y-4));
n=sqrt(r);
std::cout<<n;
}