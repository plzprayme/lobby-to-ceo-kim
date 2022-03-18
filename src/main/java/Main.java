import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        System.out.println(TestEnum.SUCCESS.getA());
        System.out.println(TestEnum.SUCCESS.getCode());

        TestEnum instance = TestEnum.of();
        System.out.println(instance.getCode());
    }
}
