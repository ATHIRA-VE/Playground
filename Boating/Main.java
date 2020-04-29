#include<iostream>
using namespace std;
int main()
{
 int w,n,c,r;
std::cin>>w;
std::cin>>n;
std::cin>>c;
 r=(75*n)+(30*c);
if(r<=w)
{
std::cout<<"Boat is stable";
}
else
{
std::cout<<"Boat will drow";
}
}
