// Given a rectangular matrix of characters, add a border of asterisks(*) to it.

String[] addBorder(String[] picture) {
    String[] Arr = new String[picture.length + 2];
    int len = picture[0].length();
    String toFill = "";
    for(int i = 0; i < len +2; ++i) {
        toFill += "*";
        Arr[0] = toFill;
        Arr[Arr.length - 1] = toFill;
    }
    for (int i = 0; i < picture.length; ++i) {
        picture[i] = "*" + picture[i] + "*";
        Arr[i +1] = picture[i];
    }
    return Arr;
}
