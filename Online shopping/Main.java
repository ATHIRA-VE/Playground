#include<iostream>
using namespace std;
int main()
{
  int fp,fd,fs,fc,sp,sd,ss,sc,ap,ad,as,ac;
std::cin>>fp;
std::cin>>fd;
std::cin>>fs;
std::cin>>sp;
std::cin>>sd;
std::cin>>ss;
std::cin>>ap;
std::cin>>ad;
std::cin>>as;
fc=(fs)+(fp)-((fp*fd)/100);
sc=(ss)+(sp)-((sp*sd)/100);
ac=(as)+(ap)-((ap*ad)/100);
std::cout<<"In Flipkart Rs."<<fc;
std::cout<<"\nIn Snapdeal Rs."<<sc;
std::cout<<"\nIn Amazon Rs."<<ac;

if((fc<sc) && (fc<ac))
{
std::cout<<"\nHe will prefer Flipkart";
}
else if((sc<fc) && (sc<ac))
{
std::cout<<"\nHe will prefer Snapdeal";
}
else if((ac<fc) && (ac<sc))
{
std::cout<<"\nHe will prefer Amazon";
}
else if((fc==sc)||(fc==ac))
{
std::cout<<"\nHe will prefer Flipkart";
}
else if((sc!=fc) && (sc==ac))
{
std::cout<<"\nHe will prefer Snapdeal";
}
  else
  {
    return 0;
  }
}