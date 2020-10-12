#include <iostream>
using namespace std;

int main() 
{
   // Try out your code here
  	int m,l,i,j,sum=0;
  	cin>>m>>l;
    sum=m;
  	for(i=1;i<l;i++)
    {
      j=sum-1;
      sum=sum+j;
      
    }
  	cout<<sum;
    return 0;
}