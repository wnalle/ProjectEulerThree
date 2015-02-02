import java.util.ArrayList;
import java.util.List;

/**
 * Created by wgnalle on 2/1/2015.
 */
public class ProjectEulerThree {
  public static void main(String[] args) {
    Long num = 600851475142L;
    List<Long> factors = new ArrayList<>();

    Long divisor = 2L;

    while (num > 1) {
      while (num % divisor == 0) {
        factors.add(divisor);
        num /= divisor;
      }
      divisor += 1;
    }

    System.out.println(factors.toString());
  }
}
