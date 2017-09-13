// Given an array of integers, find the maximal absolute difference between any
// two of its adjacent elements.

int arrayMaximalAdjacentDifference(int[] inputArray) {
    int diff = 0;
    for (int i = 1; i < inputArray.length; i++) {
        if (Math.abs(inputArray[i] - inputArray[i - 1]) > diff) {
            diff = Math.abs(inputArray[i] - inputArray[i - 1]);
        }
    }
    return diff;
}
