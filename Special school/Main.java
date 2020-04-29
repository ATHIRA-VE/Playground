#include<iostream>
#include<string.h>
using namespace std;
int main ()
{
    char str[50], str2[50], temp;
    int i, j;
    gets(str);
  gets(str2);
    j = strlen(str) - 1;
    for (i = 0; i < j; i++,j--)
    {
        temp = str[i];
        str[i] = str[j];
        str[j] = temp;
    }
  int x=strcmp(str,str2);
    if(x==0)
    {
      cout<<"It is correct";}
  else{
    cout <<"It is wrong";}
    return 0;
}