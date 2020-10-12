#include <iostream>
#include<math.h>
using namespace std;
int main() 
{
   // Try out your code here
    int t,count=0,i=0,j=0,sum=0;
  	double r;
  	cin>>t;
  	int n,d;
  	while(t>0)
  	{	 cin>>n;
     	 cin>>d;
     	 i=1;
     	 sum=0;
     	 while(n>0)
     	{	
     	 	r=n/pow(d,i);
          	sum=sum+(int)r;
          	if ((int)r>=1)
            		i++;
            else
              		break;
         }
     	cout<<sum;
     	cout<<"\t"<<endl;
     	t--;
    }
  	
    return 0;
}