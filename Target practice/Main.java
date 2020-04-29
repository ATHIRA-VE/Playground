#include<iostream>
using namespace std;
int main()
{
 int target,c,score,sum;
  std::cin>>target;
  c=0;
  sum=0;
  do
  { 
    std::cin>>score;
    c=c+1;
    sum=sum+score;
  }while(sum<target);
  std::cout<<"The number of turns is "<<c;
}