#include<iostream>
using namespace std;
int main()
{
  int rownum,colnum,treenum,i,j;
  std::cin>>rownum>>colnum>>treenum;
  
  if ((treenum>0)&&(treenum<colnum))
      {
        std::cout<<"Yes";
    return 0;
      }
        
  for (i=1;i<(colnum);i++)
        {
          if ((treenum==(i*colnum)+1)||(treenum==(i*colnum)))
          {
        std::cout<<"Yes";
            return 0;
          }
        }
          std::cout<<"No";
}