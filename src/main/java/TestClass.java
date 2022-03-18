import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestClass {

    public static Map<String, String> staticField =  Collections.unmodifiableMap(Stream.of(new TestClass[] { }).collect(Collectors.toMap(TestClass::nonStaticGetter, TestClass::nonStaticGetter)));

    public String nonStaticGetter() {
        return "non static getter";
    }
}
