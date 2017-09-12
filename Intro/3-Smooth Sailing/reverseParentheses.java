// Your task is to reverse the strings contained in each pair of matching
// parentheses, starting from the innermost pair. The results string should not
// contain any parentheses.

String reverseParentheses(String s) {
  int lastCharInBracket = s.lastIndexOf('(');

  while(lastCharInBracket != -1){
      String temp = s.substring(0, lastCharInBracket);
      int firstCharInBracket = s.indexOf(')', lastCharInBracket);
      temp += new StringBuffer(s.substring(lastCharInBracket +1, firstCharInBracket)).reverse().toString();
      temp += s.substring(firstCharInBracket +1);
      s = temp;
      lastCharInBracket = s.lastIndexOf('(');
  }
  return s;
}
