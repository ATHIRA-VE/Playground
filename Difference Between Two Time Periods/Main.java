#include<iostream>
using namespace std;
struct time{
  int x,y,z;
}s,t,r;

int main()
{
  
  cin>>s.x;
  cin>>s.y;
  cin>>s.z;

  cin>>t.x;
  cin>>t.y;
  cin>>t.z;
  
  r.x=s.x-t.x;
  r.y=s.y-t.y;
  r.z=s.z-t.z;
  if(r.z<0)
  {
    r.z=60+r.z;
    r.y--;
  }
  if(r.y<0){
     r.y=60+r.y;
    r.x--;}
  cout<<r.x<<":"<<r.y<<":"<<r.z;
  
}