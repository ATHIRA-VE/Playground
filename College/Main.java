#include<iostream>
#include<string>
#include<cstring>
using namespace std;
 struct Student { 
   char name[100];
   char department[100];
   int yearOfStudy;
   float cgpa; };
int main()
{
  int n, i,j;
  struct Student t;
  cout<<"Enter the number of colleges\n";
  cin>>n;
  struct Student s[n];
  for(i=0;i<n;i++)
  {
  cout<<"Enter the details of college "<<i+1;
   cout<<"\nEnter name\nEnter city\nEnter year of establishment\nEnter pass percentage\n";
  
    cin>>s[i].name;
  cin>>s[i].department;
    cin>>s[i].yearOfStudy;
    cin>>s[i].cgpa;
    s[i].cgpa=s[i].cgpa*1.0;
  }
  cout<<"Details of colleges\n";
   for(i=0;i<n;i++)
  {
    for(j=i+1;j<n;j++)
    {
      if(strcmp(s[i].name,s[j].name)>0)
      {
        t=s[i];
        s[i]=s[j];
        s[j]=t;
      }
    }
  }   
   for(i=0;i<n;i++)
  { 
      cout<<"College:"<<i+1<<"\n";
    cout<<"Name:"<<s[i].name;
  cout<<"\nCity:"<<s[i].department;
    cout<<"\nYear of establishment:"<<s[i].yearOfStudy;
    cout<<"\nPass percentage:"<<s[i].cgpa<<"\n";
  }
}