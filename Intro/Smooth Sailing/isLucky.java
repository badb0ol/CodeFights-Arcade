// Ticket numbers usually consist of an even number of digits. A ticket number
// is considered lucky if the sum of the first half of the digits is equal to
// the sum of the second half.
// Given a ticket number n, determine if it's lucky or not.

boolean isLucky(int n) {
  ArrayList<Integer> dank = new ArrayList<>();
  int sum = 0;

  while (n > 0) {
    dank.add(n % 10);
    n /= 10;
  }

  for (int i = 0; i < dank.size(); i++) {
    if (i < dank.size() / 2)
      sum += dank.get(i);
    else
      sum -= dank.get(i);
  }

  if (sum != 0)
    return false;
  return true;
}
