#include <iostream>
using namespace std;
int main() {
    // Type your code here
  int k,i,n;
  std::cin>>n;
  for (k=1;k<=n;k++)
  {
    if (k%2!=0)
      {
        for (i=1;i<n;i++)
        {
          std::cout<<k;
        }
      if (i==n)
        std::cout<<k+1;     
      std::cout<<"\n";
      i=1;
      }
    else
      {
      
      if (i==1)
        std::cout<<(k+1);
        for (i=2;i<=n;i++)
        {
          std::cout<<k;
        }
      std::cout<<"\n";
      }
    
  }
    return 0;
}