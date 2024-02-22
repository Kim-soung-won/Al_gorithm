#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <string.h>
int main(void)
{
	char a[1000005];
	int count[26]={0}, max = 0, same,check;
	scanf("%s", a);
	int size = strlen(a);
	for (int i = 0; i < size; i++)
	{
		if (65 <= a[i] && 90 >= a[i])
		{
			count[a[i] - 65]++;
		}
		else if (97 <= a[i] && 122 >= a[i])
		{
			count[a[i] - 97]++;
		}
	}
	for (int i = 0; i < 26; i++)
	{
		if (max < count[i]) {
			max = count[i];
			same = 0;
			check = i;
		}
		else if (max == count[i])
			same = 1;
	}
	if (same != 1)
		printf("%c", check + 65);
	else
		printf("?");
}
