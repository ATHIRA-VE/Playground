#include<iostream>
#include<bits/stdc++.h>
using namespace std;
int main()
{ int n;
 int b1,b2; 
  std::cin >> n;
    int sqr_n = n * n;
    int ctr_digits = 0;
    while (sqr_n)
    {
        ctr_digits++;
        sqr_n /= 10;
    }
    sqr_n = n*n; 
    for (int r_digits=1; r_digits<ctr_digits; r_digits++)
    {
         int eq_parts = pow(10, r_digits);

         if (eq_parts == n)
            continue;
         int sum = sqr_n/eq_parts + sqr_n % eq_parts;
         if (sum == n)
         {
           b1 = 1;
           //std::cout <<"Kaprekar Number";
         }
    }
   b2 = 1;
        //std::cout<<"Not a Kaprekar Number";
    if (n == 1)
      b1 = 1;
 if(b1 == 1)
 {std::cout <<"Kaprekar Number";
 }
 else
 {std::cout<<"Not a Kaprekar Number";
 }
}