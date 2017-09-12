// Find the area of the polygon below for a given n.

int shapeArea(int n)
{
  int area = 1;
  for (int i = 0; i < n; i++) {
    area += 4 * i;
  }
  return area;
}
