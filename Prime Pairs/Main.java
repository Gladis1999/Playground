#include <iostream>
using namespace std;

int main() 
{
   // Try out your code here
    int l,h,i,j,flag=1,count=0;
  	cin>>l;
  	cin>>h;
  	int s[h-l+1];
  	int k=0;
  	for(i=l;i<=h;i++)
    {
   
        for(j=2;j<=i/2;j++)
        {
          if((i%j)==0)
          {	flag=0;	
            break;
          }
        }
      	if(flag==1)
        {
          s[k]=i;
          k++;
        }
      	flag=1;
    }
  	for(i=0;i<k;i++)
    {
      for(j=i+1;j<k;j++)
      {
        if((s[j]-s[i])==6)
          	count++;
      }
    }
  	if(count>0)
  		cout<<count;
  	else
      	cout<<"No Prime Pairs"<<endl;
    return 0;
}