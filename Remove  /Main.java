#include<iostream>
using namespace std;
#include <string>
#include <algorithm>
#include <functional>
void eraseSubStr(std::string & mainStr, const std::string & toErase)
{
// Search for the substring in string
size_t pos = mainStr.find(toErase);
if (pos != std::string::npos)
{
// If found then erase it from string
mainStr.erase(pos, (toErase.length()-1));
}
}
void eraseAllSubStr(std::string & mainStr, const std::string & toErase)
{
size_t pos = std::string::npos;
// Search for the substring in string in a loop untill nothing is found
while ((pos  = mainStr.find(toErase) )!= std::string::npos)
{
// If found then erase it from string
mainStr.erase(pos, (toErase.length()+1));
}
}
void eraseSubStrings(std::string & mainStr, const std::vector<std::string> & strList)
{
std::for_each(strList.begin(), strList.end(), std::bind(eraseAllSubStr, std::ref(mainStr), std::placeholders::_1));
}
void eraseSubStringsPre(std::string & mainStr, const std::vector<std::string> & strList)
{
for (std::vector<std::string>::const_iterator it = strList.begin(); it != strList.end(); it++)
{
eraseAllSubStr(mainStr, *it);
}
}
int main()
{
std::string str;
 getline(std::cin, str); 
eraseSubStringsPre(str, { "the" });
std::cout << str;
return 0;
}