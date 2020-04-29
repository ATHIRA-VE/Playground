#include<iostream>
using namespace std;
int main() 
{ 
    int n,temp; 
    int sum = 0; 
  std::cin>>n;
  temp=n;
    while (n) { 
        int k = n % 10; 
        sum += k; 
        n /= 10; 
    } 
    if (temp % sum == 0) 
    {
        std::cout<<"Harshad Number"; 
    }
 else 
 {
        std::cout<<"Not Harshad Number"; 
 }
}
