#include<iostream>
#include <bits/stdc++.h>
using namespace std;
int printCollatz(int n) 
{ int c=0;
    // We simply follow steps 
    // while we do not reach 1 
    while (n != 1) 
    { 
        std::cout << n << "\n"; 
  
        // If n is odd 
        if (n & 1) 
        {c++;
            n = 3*n + 1; 
        }
  
        // If even 
        else
        {
            n = n/2; 
          c++;
        }
    } 
  
    // Print 1 at the end 
    std::cout << n; 
  std::cout<<"\n"<<c;
} 
  
// Driver code 
int main() 
{ int n;
 std::cin>>n;
    printCollatz(n);
    return 0; 
}