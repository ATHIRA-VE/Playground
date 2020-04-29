#include <iostream>
#include <cstring>
using namespace std;
int main()
{
  char str1[100];
  gets(str1);
  int len;
  len = strlen(str1);
if( len<=70)
         std::cout<<"Caption eligible for the contest";
else
         std::cout<<"Caption not eligible for the contest";  
}