#include<iostream>
#include<math.h>
int main()
{int n,curr_term,i,a=0,b=0;
 std::cin>>n;
curr_term=6;
for(i=1;i<=n;i++)
{ 
curr_term=curr_term+b;
b=(a+5)*i;
std::cout<<curr_term<<" ";
}
}