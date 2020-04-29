#include<iostream>
using namespace std;
int main()
{
 int rown,columnn,treenum;
  std::cin>>rown>>columnn>>treenum;
  
  if ((treenum>=columnn+1)&&(treenum<=columnn+columnn))
  {

    std::cout<<"It is a mango tree";
  }
  else if ((treenum>=(columnn*rown)-(2*columnn))&&(treenum<=(columnn*rown)-(columnn)))
  {
    std::cout<<"It is a mango tree";
  }
  else
  {
    std::cout<<"It is not a mango tree";
  }
}
