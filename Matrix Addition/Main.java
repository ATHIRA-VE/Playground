#include<iostream>
using namespace std;
int main()
{
  int r,c,i,j;
  std::cin>>r;
  std::cin>>c;
  int a[r][c];
  int b[r][c];
  int d[r][c];
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      std::cin>>a[i][j];
    }
  }
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      std::cin>>b[i][j];
    }
  }
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      d[i][j]=a[i][j]+b[i][j];
    }
  }
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      std::cout<<d[i][j];
      std::cout<<" ";
    }
    std::cout<<"\n";
  }
}