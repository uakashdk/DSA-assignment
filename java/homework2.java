public int removeElement(int[] numbers, int value) {
    int o = 0;
    for (int i = 0; i < numbers.length; i++) {
        if (numbers[i] != value) {
            numbers[o++] = numbers[i];
        }
    }
    return o;
}