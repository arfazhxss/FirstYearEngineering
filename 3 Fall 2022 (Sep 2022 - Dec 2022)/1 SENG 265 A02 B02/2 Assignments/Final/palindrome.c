#include <stdio.h>
#include <string.h>
#include <ctype.h>

int isPalHelper (char *str, int l, int r)
{
    if (NULL == str || l < 0 || r < 0)  {return 0;}
    if (l >= r)                         {return 1;}
    if (!isalpha(str[l]))               {return isPalHelper (str, ++l, r);}
    if (!isalpha(str[r]))               {return isPalHelper (str, l, --r);}
    if (str[l]==str[r])               {return isPalHelper (str, ++l, --r);}
    return 0;
}

int isPalindrome (char* s) {
    return isPalHelper (s, 0, strlen(s));
}

int main()
{
    char* s = "yo banana boy";
    if (isPalindrome(s))    {printf("\"%s\" is palindrome", s);}
    else                    {printf("\"%s\" is not palindrome", s);}
}