#include <iostream>
using namespace std;
struct student
{
    char name[50];
    int roll;
    float marks;
};
int main() 
{ 
 struct student; 
  char name[50];
  int roll;
  float marks;
  std::cout<<"\n";
  std::cout<<"Student Details\n";
  //std::cin>>name;
  cin.getline(name,50);
  std::cout<<"Name: "<<name<<"\n";
  std::cin>>roll;
  std::cout<<"Roll: "<<roll<<"\n";
  std::cin>>marks;
  std::cout<<"Marks: "<<marks<<"\n";
}