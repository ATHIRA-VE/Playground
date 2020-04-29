#include <iostream>
#include <math.h>
using namespace std;
int main()
{
    int i, n;
    float curr_term;
    std::cin >> n;
    for (i = 0; i < n; i++) 
    {curr_term=0.5*pow(3,i);
   std::cout<<curr_term<<" ";
    }
}
