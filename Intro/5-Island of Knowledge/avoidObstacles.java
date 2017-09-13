// You are given an array of integers representing coordinates of obstacles situated
// on a straight line.

// Assume that you are jumping from the point with coordinate 0 to the right.
// You are allowed only to make jumps of the same length represented by some integer.

// Find the minimal length of the jump enough to avoid all the obstacles.

int avoidObstacles(int[] inputArray) {
    for (int i = 1;; i++) {
        for (int j = 0; j < inputArray.length; j++) {
            if (inputArray[j] % i == 0) {
                break;
            }
            if (j == inputArray.length - 1) {
                return i;
            }
        }
    }
}
