// Definition for arrays:
//
// typedef struct arr_##name {
//    int size;
//    type *arr;
//  } arr_##name;
//
//  arr_##name alloc_arr_##name(int len) {
//    arr_##name a = {len, len > 0 ? malloc(sizeof(type) * len) : NULL};
//  return a; }

// Given an array of integers, find the pair of adjacent elements that
// has the largest product and return that product.

int adjacentElementsProduct(arr_integer inputArray) {
    int i = 0;

    int currentMax = -999999999;
    for (i = 0; i < (inputArray.size - 1); i++){
      int currentProduct = inputArray.arr[i] * inputArray.arr[i+1];
      if (currentProduct > currentMax)
        currentMax = currentProduct;
    }
    return currentMax;
}
