#include<iostream>
int main(){
  int i,n,factorial=1;
    std::cin>>n;
 for (i = 1; i <= n; ++i) {
        factorial *= i;   // factorial = factorial * i;
    }
    std::cout<<factorial;  
 return 0;
}