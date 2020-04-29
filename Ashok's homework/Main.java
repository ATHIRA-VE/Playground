#include<iostream>
int main()
{
    int r,c,i,j;
    std::cin>>r;
    std::cin>>c;
  int a[r][c],b[r][c],d[r][c];
  for(i=0;i<r;i++)
  {for(j=0;j<c;j++)
  {
  std::cin>>a[i][j];
  }
  }
  for(i=0;i<r;i++)
  {for(j=0;j<c;j++)
  {
  std::cin>>b[i][j];
  }
  }
  for(i=0;i<r;i++)
  {for(j=0;j<c;j++)
  {
    d[i][j]=a[i][j]+b[i][j];
  }}
  for(i=0;i<r;i++)
  {for(j=0;j<c;j++)
  {std::cout<<d[i][j]<<" ";
  }
   std::cout<<"\n";
  }  
}