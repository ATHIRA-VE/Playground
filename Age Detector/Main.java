#include<iostream>
using namespace std;
int main()
{
  int b,c,age;
std::cin>>b;
std::cin>>c;
if(b>c)
{
if(b==00)
  {
    age=100-b;
  std::cout<<age;
  }
  else
   {
    age=(100-b)+c;
    std::cout<<age;
    }
}
else if (b==c)
{
age=0;
  std::cout<<age;
}
else
{
age=c-b;
  std::cout<<age;
}
}