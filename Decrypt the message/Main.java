#include<iostream>
using namespace std;
int main ()
{  
    int i, num, div, sum=0, e, t;
    std::cin >> e;
    std::cin >> t;
  num = e + t;
    for (i=1; i < num; i++)
    {
        div = num % i;
        if (div == 0)
            sum = sum + i;
    }
    if (sum == num)
        std::cout <<"They can read the message";
    else
        std::cout <<"They can't read the message";
    return 0;
}