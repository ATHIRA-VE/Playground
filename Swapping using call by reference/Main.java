#include <iostream>
using namespace std;
void swap(int&, int&);
int main()
{
    int a,b;
  std::cin>>a;
   std::cin>>b;
    std::cout << "Before swapping";
    std::cout << " a= " << a;
    std::cout << " and b=" << b<<"\n";
    swap(a, b);
    std::cout << "After swapping";
    std::cout << " a= " << a ;
    std::cout << " and b=" << b <<"\n";
    return 0;
}
void swap(int& n1, int& n2) {
    int temp;
    temp = n1;
    n1 = n2;
    n2 = temp;
}