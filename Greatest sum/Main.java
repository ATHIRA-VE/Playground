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
  k=0;l=k;
     cout<<"Sum of rows is ";
  for(i=0;i<r;i++){
    for(j=0;j<c;j++){
      k=a[i][j]+k;
    }
 		cout<<k<<" ";
    if(k>l)
    {
      l=k;
    x=i+1;  
    }
   k=0;
  }
    cout<<"\n";
  cout<<"Row "<<x<<" has maximum sum"<<"\n";
  b=0;m=0;
  cout<<"Sum of columns is ";
  for(i=0;i<c;i++){
    for(j=0;j<r;j++){
      b=a[j][i]+b;
    }
    cout<<b<<" ";
     if(b>m)
    {
       m=b;
     y=i+1;
    }
    b=0;
  }
     cout<<"\nColumn "<<y<<" has maximum sum";
}