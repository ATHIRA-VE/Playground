#include<iostream>
#include <cmath>
using namespace std;
bool isPerfectSquare(long double x) 
{   
  long double sr = sqrt(x); 
  return ((sr - floor(sr)) == 0); 
} 
  
int main()
{  
int n,d;
float x,y;
std::cin>>n;
y=sqrt(n);
   if (isPerfectSquare(n)){
    x=n+y+1; 
     d=ceil(x);
     std::cout<<d;
   }
  else
  {
x=n+y;
d=ceil(x);
    std::cout<<d;
  }
}


 