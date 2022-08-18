public class Solution {
  public int trap(int[] height) {
    int leftMax = 0, rightMax = 0, result = 0;
    int lp = 0, rp = height.length - 1;
    while (lp < rp) {
      if (height[rp] > height[lp]) {
        // check lp
        if (height[lp] > leftMax) {
          leftMax = height[lp];
        } else {
          result += leftMax - height[lp];
        }
        lp++;
      } else {
        if (height[rp] > rightMax) {
          rightMax = height[rp];
        } else {
          result += rightMax - height[rp];
        }
        rp--;
      }
    }
    return result;
  }
}
