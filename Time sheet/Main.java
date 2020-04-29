#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int monhrs,tuehrs,wedhrs,thuhrs,frihrs,sathrs,sunhrs,extrasal,monsal,tuesal,wedsal,thusal,frisal,satsal,sunsal;
  std::cin>>sunhrs>>monhrs>>tuehrs>>wedhrs>>thuhrs>>frihrs>>sathrs;
     if (monhrs>8)
       {
          monsal=(15*(monhrs-8))+(100*monhrs);
       }
     else 
      {
         monsal=(100*monhrs);
      }
     if (tuehrs>8)
       {
          tuesal=(15*(tuehrs-8))+(100*tuehrs);
       }
     else 
      {
         tuesal=(100*tuehrs);
      }
     if (wedhrs>8)
       {
          wedsal=(15*(wedhrs-8))+(100*wedhrs);
       }
     else 
      {
         wedsal=(100*wedhrs);
      }
      if (thuhrs>8)
       {
          thusal=(15*(thuhrs-8))+(100*thuhrs);
       }
     else 
      {
         thusal=(100*thuhrs);
      }
      if (frihrs>8)
       {
          frisal=(15*(frihrs-8))+(100*frihrs);
       }
     else 
      {
         frisal=(100*frihrs);
      }
     
         satsal=(100*sathrs+((25*(100*sathrs))/100));
     
         sunsal=(sunhrs*100+((50*100*sunhrs)/100));
      
  if ((monhrs+tuehrs+wedhrs+thuhrs+frihrs)>40)
  {
    extrasal=25*((monhrs+tuehrs+wedhrs+thuhrs+frihrs)-40);
  }
  std::cout<<monsal+tuesal+wedsal+thusal+frisal+satsal+sunsal+extrasal;
}