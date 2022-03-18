import java.util.function.Function;

public class FunctionTest {

    // compile 오류류
   static Function<Integer, Integer> func = FunctionTest::nonStaticFunc;

    public Integer nonStaticFunc(Integer i) {
        return i;
    }
}
