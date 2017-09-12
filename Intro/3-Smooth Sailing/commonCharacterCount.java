// Given two strings, find the number of common characters between them.

int commonCharacterCount(String s1, String s2) {
  char ch1[]=s1.toCharArray();
  char ch2[]=s2.toCharArray();
  int count = 0;

  for(int i = 0; i < ch1.length; i++){
    for(int j = 0; j < ch2.length; j++){
      if (ch1[i] == ch2[j]){
        count++;
        ch2[j] = '*';
        break;
      }
    }
  }
  return count;
}
