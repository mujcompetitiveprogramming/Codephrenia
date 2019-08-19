
//generating a random array of pairs 
#include <bits/stdc++.h>
using namespace std;

int rand(int a, int b)
{
	return a +rand()%(b-a+1);
}

int main(int argc, char* argv[])
{
	
	srand(atoi(argv[1]));	//atoi(s) converts an array of chars to int
	int n=rand(1,50);	//number of pairs
				
	printf("%d\n",n);
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<2;j++)
		{
			printf("%d ",rand(1,1000));
		}
		printf("\n");
	}
} 