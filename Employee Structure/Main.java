#include<iostream>
using namespace std;
 struct Student { 
   char name[30];
   int age;
   int Id;
    char design[20];
   int salary; };
int main()
{
  int n, i;
  struct Student s[10]; 
   cout<<"Enter name:\nEnter ID:\nEnter age:\nEnter designation:\nEnter Salary:";
  cout<<"\nEmployee Details\n";
    cin>>s[1].name;
    cin>>s[1].age;
    cin>>s[1].Id;
  cin>>s[1].design;
    cin>>s[1].salary;   
    cout<<"Name of the Employee : "<<s[1].name;
  cout<<"\nID of the Employee : "<<s[1].age;
    cout<<"\nAge of the Employee : "<<s[1].Id;
    cout<<"\nDesignation of the Employee : "<<s[1].design;
   cout<<"\nSalary of the Employee : "<<s[1].salary;
}