#include <iostream> 
using namespace std;  
int main() 
{ 
    int n, arr[n]; 
    int i, x, pos; 
  std::cout<<"Enter the number of elements in the array";
  std::cin>>n;
  std::cout<<"\nEnter the elements in the array";  
    for (i = 0; i < n; i++) 
    {
      std::cin>>arr[i];
      arr[i] = i + 1; 
    }
  std::cout<<"\nEnter the location where you wish to insert an element";
  std::cin>>pos;
if(pos > n)
  {
    std::cout<<"\nInvalid Input";
  }
  else
  {
    // element to be inserted 
    std::cout<<"\nEnter the value to insert";
  std::cin>>x;
  std::cout<<"\nArray after insertion is\n"; 
    // Insert x at pos 
    int i; 
    // increase the size by 1 
    n++; 
    // shift elements forward 
    for (i = n; i >= pos; i--) 
        arr[i] = arr[i - 1]; 
    // insert x at pos 
    arr[pos - 1] = x;   
    // print the updated array 
    for (i = 0; i < n; i++) 
        std::cout << arr[i] << "\n"; 
    return 0; 
}
}
    
