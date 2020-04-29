#include<iostream>
int main()
{
  int n,i,k,j;
  std::cin>>n;
  for (k=-(n);k<=(n-1);k++)
  {
    if (k<0)
    {
    for (i=1;i<=(((n+k)*2)+1);i++)
    {
      if (i%2==0)
      std::cout<<"*";
      else
      std::cout<<(n+k+1);
    }
      std::cout<<"\n";
      
    }
     
    else if (k>=0)
    {
       
        for (i=2*(n-k)-1;i>=1;i--)
        {
          if (i%2==0)
          std::cout<<"*";
           else
           std::cout<<(n-k);
         }
          std::cout<<"\n";
      }
  }   
  return 0;
}