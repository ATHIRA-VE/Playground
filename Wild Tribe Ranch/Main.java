#include<iostream>
int main()
{
int m,w;
std::cin>>m;
std::cin>>w;
if(m>w)
{
std::cout<<"Yes, you can enter.";
}
  else if(m<w)
{
std::cout<<"Sorry, you can't enter";
}
  else
  {
    std::cout<<"Yes, you can enter. Kindly use a rope.";
  }
}