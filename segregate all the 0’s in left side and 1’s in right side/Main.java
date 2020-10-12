#include <iostream>
using namespace std;

int main() 
{
   // Try out your code here
  	int n,i,j,k;
  	cin>>n;
  	int s[n];
  	int b[n];
  	j=n-1;
  	k=0;
    for(i=0;i<n;i++)
    {
      	cin>>s[i];
    }
  	for(i=0;i<n;i++)
    {
      	if(s[i]==0)
        {
          b[k]=0;
          k++;
        }
      	else
        {
          b[j]=1;
          j--;
        }
    }
  	for(i=0;i<n;i++)
    {
      cout<<b[i];
    }
  
    return 0;
}