#include<iostream>
using namespace std;
int main()
{
  int y;
    cin >> y;
    if (y % 4 == 0)
        std::cout << y << " is a leap year";
    else
        std::cout << y << " is not a leap year";
}