#include <iostream>
using namespace std;

int main()
{
    int i, n;
    std::cin >> n;
    int arr[n];
    for(i = 0; i < n; ++i)
    {
       std::cin >> arr[i];
    }
    for(i = 1;i < n; ++i)
    {
       if(arr[0] < arr[i])
           arr[0] = arr[i];
    }
    std::cout << arr[0];
    return 0;
}