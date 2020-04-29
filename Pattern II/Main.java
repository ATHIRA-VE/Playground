#include<iostream>
int main()
{
  int num,k,n,i,j,m,v;
  std::cin>>num;
  n=1;
  for (k=1;k<=num;k++)
  {
    for (i=1;i<=(2*k-1);i++)
    {
      if (i%2==0)
      {
        std::cout<<"*";
      }
      else 
      { 
        if (k%2!=0)
        {
        std::cout<<n;
        n=n+1;
          m=n+k; 
          v=m;
        }
       else
       {
         std::cout<<m;
         m=m-1;
         n=v+1;
       }
      }
      }
     std::cout<<"\n"; 
  }
}