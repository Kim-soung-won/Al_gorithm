#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <string.h>

int main()
{
	char answer[80];
	int arr_size,sum,total;
	scanf("%d", &arr_size);
	for (int i = 0; i < arr_size; i++)
	{
		sum = 0;
		total = 0;
		scanf("%s", answer);
		for (int j = 0; j < strlen(answer); j++)
		{
			if (answer[j] == 'O') {
				sum++;
				total = total + sum;
			}
			if(answer[j]=='X')
				sum = 0;
		}
		printf("%d\n", total);
	}
}