// Last night you had to study, but decided to party instead. Now there is a black
// and white photo of you that is about to go viral. You cannot let this ruin your
//
// reputation, so you want to apply box blur algorithm to the photo to hide its content.
//
// The algorithm works as follows: each pixel x in the resulting image has a value
// equal to the average value of the input image pixels' values from the 3 × 3 square
// with the center at x. All pixels at the edges are cropped.
//
// As pixel's value is an integer, all fractions should be rounded down.

int[][] boxBlur(int[][] image) {

    int[][] same = new int[image.length - 2][image[0].length - 2];
    for (int i = 1; i < image.length - 1; i++) {
        for (int j = 1; j < image[0].length - 1; j++) {
            int sum = 0;
            for (int ii = -1; ii <= 1; ii++) {
                for (int jj = -1; jj <= 1; jj++) {
                    sum += image[i + ii][j + jj];
                }
            }
            same[i - 1][j - 1] = sum / 9;
        }
    }
    return same;
}
