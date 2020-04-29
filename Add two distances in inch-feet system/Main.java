#include<iostream>
using namespace std;
struct time{
  int x;
  float y;
}s,t,r;

int main()
{  
  cin>>s.x;
  cin>>s.y;
  cin>>t.x;
  cin>>t.y; 
 r.x=s.x+t.x;
  r.y=s.y+t.y; 
 // r.y*=10;  
  if(r.y>12){
     r.y-=12;
    r.x++;}
  cout<<r.x<<"'-"<<r.y<<"\""; 
}
