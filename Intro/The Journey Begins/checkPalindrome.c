// Given the string, check if it is a palindrome.

bool checkPalindrome(char * inputString)
{
    int i;
    int len;
    int flag = 0;

    len = strlen(inputString);

    for(i = 0; i < len; i++) {
        if(inputString[i] != inputString[len -i -1]) {
            flag = 1;
            break;
        }
    }
    if (flag != 0)
        return false;
    else
        return true;
}
