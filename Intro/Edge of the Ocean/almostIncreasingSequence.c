// Given a sequence of integers as an array, determine whether it is possible
// to obtain a strictly increasing sequence by removing no more than one element
// from the array.

bool almostIncreasingSequence(arr_integer sequence) {
  for (int i = sequence.size - 1; i >= 0; i--) {
    bool sequential = true;
    for (int j = 0; j < sequence.size - 1; j++) {
      int k = j + 1;
        if (j == i)
          continue;
        if (k == i)
          k++;
        if (k >= sequence.size)
          continue;
        if (sequence.arr[j] >= sequence.arr[k]) {
          sequential = false;
          false;
        }
      }
      if (sequential)
        return true;
    }
  return false;
}
