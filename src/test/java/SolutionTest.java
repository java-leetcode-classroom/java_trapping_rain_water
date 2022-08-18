import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  final private Solution sol = new Solution();
  @Test
  void trapExample1() {
    assertEquals(6, sol.trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
  }
  @Test
  void trapExample2() {
    assertEquals(9, sol.trap(new int[]{4,2,0,3,2,5}));
  }
}