#include<iostream> 
#include<cstdlib>
using namespace std; 
int main() 
{  int *arr;
   int even_count = 0;              
   int odd_count = 0;
   int n,i;
  std::cin>>n; 
  arr = (int *)malloc(n * sizeof(int));   
for(i=0;i<n;i++)
{std::cin>>arr[i];
}
    for(int i = 0 ; i < n ; i++)  
    {  if (arr[i] & 1 == 1)
            odd_count ++ ;          
     else                    
            even_count ++ ;    
    } 
    std::cout << odd_count <<"\n"<< even_count ;
  return 0;
}
 