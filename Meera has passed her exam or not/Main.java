#include<iostream>
int main()
{
  int m,i,n,b,c;
    std::cin>>n;
  int a[n];
  for(i=0;i<n;i++)
  {
    std::cin>>a[i];    
  }
   std::cin>>m;
  for(i=0;i<n;i++)
  {
     if(a[i] == m)
     { b=1;
    break;
  }
  }
  {
  if(b==1)
    std::cout<<"She passed her exam";
    else
    std::cout<<"She failed";
    
  
 
    
  }
}