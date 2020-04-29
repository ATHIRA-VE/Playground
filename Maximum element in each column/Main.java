#include<iostream>
using namespace std;
int main()
{
 int r,c,j,n,m[5][5],i,a[5][5],b,k,l;
 cin>>r>>c;
  for(i=0;i<r;i++){
    for(j=0;j<c;j++){
    cin>>a[i][j];}
  }
  b=0;
  for(i=0;i<c;i++){
    for(j=0;j<r;j++){
    if(a[j][i]>b)
    {
      b=a[j][i];
    }
    }cout<<b<<"\n";b=0;
  }
}