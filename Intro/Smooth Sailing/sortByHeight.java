// Some people are standing in a row in a park. There are trees between them
// which cannot be moved. Your task is to rearrange the people by their heights
// in a non-descending order without moving the trees.

int[] sortByHeight(int[] a) {
  int temp;
  for (int i = 0; i < a.length; i++) {
    if (a[i] != -1) {
      for (int j = 0; j < a.length; j++) {
        if (a[j] != -1) {
          if (a[i] < a[j]) {
              temp = a[i];
              a[i] = a[j];
              a[j] = temp;
          }
        }
      }
    }
  }
  return a;
}
