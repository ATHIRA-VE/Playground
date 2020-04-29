#include<iostream>
int main()
{
int a,b,n,q,r;
std::cout<<"Enter first number : ";
  std::cin>>a;
std::cout<<"Enter second number : ";
  std::cin>>b;
std::cout<<"Menu";
  std::cin>>n;
std::cout<<"\n1.Addition \n2.Subtraction \n3.Multiplication \n4.Division \n5.Remainder \n";
switch(n)
{
case 1:
r=a+b;
std::cout<<r;
break;
    
case 2:
r=a-b;
std::cout<<r;
break;
    
case 3:
r=a*b;
std::cout<<r;
break;

case 4:
r=a/b;
std::cout<<r;
break;

case 5:
r=a%b;
std::cout<<r;
break;
  default: 
  std::cout<<"Invalid operation";
}
}