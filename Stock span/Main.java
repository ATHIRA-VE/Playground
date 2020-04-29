#include<iostream>
using namespace std;
void stockSpan(int a,int* b)
{
  int m=0;
  int c=0;
  int d=0;
  for (int i=0;i<a;i++)
  {
      if (b[i]>b[i-1])
      {
        if (m==0)
        { c=c+1;
          m=m+1;
          d=d+1;
        }
        else 
        { c=d*2;
         d=d+1;
        }
      }
        else
        c=1; 
     std::cout<<c<<"\n";
  }
}
int main()
{
  //Type your code here.
  int n,i;
  std::cin>>n;
  int a[n];
  for (i=0;i<n;i++)
  {
    std::cin>>a[i];
  }
  stockSpan(n,a);
}