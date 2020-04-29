#include <iostream> 
using namespace std; 
string convertToString(int sum) 
{ 
    string str; 
  std::cin>>str;
    while (sum) { 
        str = str + (char)((sum % 10) + '0'); 
        sum = sum / 10; 
    } 
    return str; 
} 
string GetIndividulaDigitSum(string str, 
                             int len) 
{ 
    int sum = 0; 
    for (int i = 0; i < len; i++) { 
        sum = sum + str[i] - '0'; 
    } 
    return convertToString(sum); 
} 
int GetDigitalRoot(string str) 
{ 
    if (str.length() == 1) { 
        return str[0] - '0'; 
    } 
    str = GetIndividulaDigitSum( 
        str, 
        str.length()); 
    return GetDigitalRoot(str); 
} 
int main() 
{ 
    string str; 

    std::cout << GetDigitalRoot(str); 
} 