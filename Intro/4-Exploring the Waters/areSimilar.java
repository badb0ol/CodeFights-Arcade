// Two arrays are called similar if one can be obtained from another by
// swapping at most one pair of elements in one of the arrays.

// Given two arrays a and b, check whether they are similar.

boolean areSimilar(int[] a, int[] b) {
  List<Integer> Arr = new ArrayList<Integer>();
  for (int i = 0; i < a.length; ++i) {
    if (a[i] != b[i])
      Arr.add(i);
  }
  int ArrCount = Arr.size();

  if (ArrCount == 0)
    return true;
  if (ArrCount == 2) {
    int Arr1 = Arr.get(0);
    int Arr2 = Arr.get(1);
    if (a[Arr1] == b[Arr2] && a[Arr2] == b[Arr1])
      return true;
  }
  return false;
}
