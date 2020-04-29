#include <iostream>
int main()
{
int x,y,z,a;
int d,i;
std::cin>>x;
std::cin>>y;
std::cin>>z;
std::cin>>a;
d=1;
i=1;
while(i<=x&&i<=y&&i<=z){
if(x%i==0&&y%i==0&&x%i==0)
d=i;
i++;
}
  if(d==a)
  {std::cout<<"Answer is correct.";
  }
  else
  {std::cout<<"Answer is wrong.";
  }

}
