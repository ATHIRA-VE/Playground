#include <iostream>
using namespace std;
int calculatePower(int, int);
int main()
{
    int base, powerRaised, result;
    std::cout << "Enter the value of a\n";
    std::cin >> base;
    std::cout << "Enter the value of n\n";
    std::cin >> powerRaised;
    result = calculatePower(base, powerRaised);
    std::cout <<"The value of "<< base<<" power "<< powerRaised<<" is "<< result;
    return 0;
}

int calculatePower(int base, int powerRaised)
{
    if (powerRaised != 0)
        return (base*calculatePower(base, powerRaised-1));
    else
        return 1;
}