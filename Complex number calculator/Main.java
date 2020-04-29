#include<iostream>
#include<math.h>
struct complex
{
float rel;
float img;
}s1,s2;
int main()
{
  int choice;
  std::cin>>choice;
  if(choice>3)
  {
    std::cout<<"Invalid choice";
  }
float a,b;
std::cin>>s1.rel>>s1.img;
std::cin>>s2.rel>>s2.img;
  switch(choice)
  {
    case 1:
//Addition
a=(s1.rel)+(s2.rel);
b=(s1.img)+(s2.img);
std::cout<<a<<"+"<<b<<"i";
      break;
    case 2:
//Subtraction
a=(s1.rel)-(s2.rel);
b=(s1.img)-(s2.img);
std::cout<<a<<"+"<<b<<"i";
      break;
    case 3:
//Multiplication
if((s1.img <0 && s2.img <0) || (s1.img >0 && s2.img >0))
{
a=((s1.rel)*(s2.rel))-((s1.img)*(s2.img));
b=((s1.rel)*(s2.img))+((s2.rel)*(s1.img));
  std::cout<<a<<b<<"i";
}
      else
      {
        a=((s1.rel)*(s2.rel))-((s1.img)*(s2.img));
        b=((s1.rel)*(s2.img))+((s2.rel)*(s1.img));
        std::cout<<a<<b<<"i";
      }
      break;
}
  return 0;
}