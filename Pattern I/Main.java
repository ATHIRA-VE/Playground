#include<iostream>
int main()
{
int n,i,j;
std::cin>>n;
for(i=n; i<n+4; i++)
{
for(j=n; j<=i; j++)
{
std::cout<<i;
}
std::cout<<"\n";
}
for(i=n+3; i>=n; i--)
{
for(j=n; j<=i; j++)
{
std::cout<<i;
}
std::cout<<"\n";
}
}
