#include<iostream>
using namespace std;
int main()
{
  int f,s,t;
std::cin>>f;
std::cin>>s;
std::cin>>t;

if((f>s) && (f>t))
{ if(s>t)
   { std::cout<<"The treasure is in box which has number "<<s;
     }
else
   { std::cout<<"The treasure is in box which has number "<<t;
     }
}
else if((s>f) && (s>t))
{ if(f>t)
   { std::cout<<"The treasure is in box which has number "<<f;
     }
else
   { std::cout<<"The treasure is in box which has number "<<t;
     }
}
else if((t>f) && (t>s))
{ if(f>s)
   { std::cout<<"The treasure is in box which has number "<<f;
     }
else
   { std::cout<<"The treasure is in box which has number "<<s;
     }
}

 if(((f%2)==0) && ((s%2)==0) && ((t%2)==0))
     {
	std::cout<<"\nThe code to open the box is 2";
 	}
else if(((f%3)==0) && ((s%3)==0) && ((t%3)==0))
     {
	std::cout<<"\nThe code to open the box is 3";
 	}
else if(((f%5)==0) && ((s%5)==0) && ((t%5)==0))
     {
	std::cout<<"\nThe code to open the box is 5";
 	}
else if(((f%7)==0) && ((s%7)==0) && ((t%7)==0))
     {
	std::cout<<"\nThe code to open the box is 7";
 	}
else
    {
	std::cout<<"\nThe code to open the box is 1";
 	} 
}