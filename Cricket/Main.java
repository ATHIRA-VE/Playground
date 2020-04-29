#include<iostream>
#include<bits/stdc++.h>
using namespace std;
int main()
{
  int balls,runs,srun,bball,r,re,c;
float tover,fover,crrate,trrate;
std::cin>>balls;
std::cin>>runs;
std::cin>>srun;
std::cin>>bball;

if((balls%6)==0)
{
tover=(balls/6);
std::cout<<tover;
}
else
{
r=balls%6;
tover=float((balls/6)+(r/10));
std::cout<< fixed << setprecision(1)<<tover;
}

c=int(bball/6);
re=bball%6;
fover=float(c+(0.1*re));
std::cout<<"\n"<< fixed << setprecision(1)<<fover;

crrate=float(srun/fover);
trrate=float(runs/tover);
std::cout<<"\n"<< fixed << setprecision(1)<<crrate;
std::cout<<"\n"<< fixed << setprecision(1)<<trrate;

if(crrate>=trrate)
{
std::cout<<"\nEligible to Win";
}
else
{
std::cout<<"\nNot Eligible to Win";
}
}