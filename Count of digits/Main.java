#include<iostream>
int main()
{
  long long n;
    int count = 0;   
  do {
        std::cin>>n;
        n /= 10;     // n = n/10
        ++count;     
    }
    while (n != 0); 
    std::cout<<count;
}