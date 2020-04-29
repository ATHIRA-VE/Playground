#include<iostream>
int main()
{
  int n,i,j,k,c,m,v,u;
  m=1;
  c=0;
 
  std::cin>>n;
  v=(n*n)+1;
  for (k=n;k>0;k--)
  {
     for (j=n;j>k;j--)
    {
      std::cout<<"--";
       
    }
    for (i=1;i<=k;i++)
    {
     std::cout<<m<<"*";
     m=m+1;
     
    }
     for (i=1;i<=k;i++)
    {
      std::cout<<v;
       if (i<k)
         std::cout<<"*";
       v=v+1;
       
    }
    v=v-(k-1)*2-1;
    std::cout<<"\n";  
  }
}