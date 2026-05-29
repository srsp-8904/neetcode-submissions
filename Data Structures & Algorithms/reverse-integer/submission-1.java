class Solution {
    public int reverse(int x) {
       final int min = Integer.MIN_VALUE;
    final int max = Integer.MAX_VALUE;
    int reversed = 0;

    while (x != 0) {
      int digit = x % 10;
      x /= 10;

      if (reversed > max / 10 || reversed < min / 10)
        return 0;
      reversed = (reversed * 10) + digit;
    }

    return reversed; 
    }
}
