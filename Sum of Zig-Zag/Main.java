#include<iostream>
using namespace std;
int main()
{
 int r,c,j,n,m,i,a[5][5],b,k,l,x,y;
 cin>>r>>c;
  for(i=0;i<r;i++){
    for(j=0;j<c;j++){
    cin>>a[i][j];}
  }
  k=0;
   l=r-1; 
    for(j=0;j<c;j++){
      k=a[0][j]+k;
     }
   for(j=0;j<c;j++){
      k=a[l][j]+k;
     }for(j=1;j<l;j++)
   k=a[j][j]+k;
 		cout<<"Sum of Zig-Zag pattern is "<<k<<"\n";
}