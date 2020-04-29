#include<iostream>
using namespace std;
int main()
{
  int n, se = 0, sd = 0, r;
    std::cin>>n;
    while ( n> 0)
    {
        r = n % 10;
        if (r % 2 == 0)
        {
          se = se + r;
        }
      else
      {
          sd = sd + r;
      }
        n = n/ 10;
    }  
if(se==sd)
{
std::cout<<"Yes";
}
else
{
std::cout<<"No";
}
 return 0;
}