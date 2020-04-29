#include<iostream>
using namespace std;
int main()
{
 int r,c,j,n,m[5][5],i,a[5][5],b,k,l,sum = 0;
 cin>>r>>c;
  for(i=0;i<r;i++){
    for(j=0;j<c;j++){
    cin>>a[i][j];}
  }
   for (i = 0; i < r; ++i) {
      for (j = 0; j < c; ++j) {
         sum = sum + a[i][j];
      }
      cout<< sum << endl;
      sum = 0;
}
}