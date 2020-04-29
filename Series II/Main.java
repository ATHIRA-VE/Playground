#include <iostream>
#include <math.h>
using namespace std;
int main()
{
    int i, n, curr_term, curr;
  curr_term=7;
    std::cin >> n;
     {  
        for(i=0;i<n;i++)
        {
        curr_term=curr_term+4;
          curr=1* pow(curr_term,2);
        std::cout<<curr<<" ";         
       }
}
}