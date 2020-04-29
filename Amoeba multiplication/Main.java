#include<iostream>
using namespace std;
int main () 
{ 
  int t1=0,t2=1,n,i,nextTerm;
   std::cin>>n;
     if(n == 1) {
         std::cout<<"0";
      }
     else if(n == 2) {
         std::cout<<"1";
      }
     else
      {
      for ( i = 3; i <= n; ++i) {
      nextTerm = t1 + t2 ;
      t1 = t2 ;
      t2 = nextTerm ;
         }
         std::cout<<nextTerm;
        }
  
} 