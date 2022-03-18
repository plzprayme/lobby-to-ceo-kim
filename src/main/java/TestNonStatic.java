import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestNonStatic {

    private static final Map<String, String> CODE_MAP = Collections.unmodifiableMap(Stream.of(new TestNonStatic[] {}).collect(Collectors.toMap(TestNonStatic::getCode, TestNonStatic::getA)));

    public String getCode() {
        return "";
    }

    public String getA() {
        return "";
    }

}


//public enum TestEnum {
//    SUCCESS("200");
//
//    private static final Map<String, String> CODE_MAP = Collections.unmodifiableMap((Map) Stream.of(values()).collect(Collectors.toMap(TestEnum::getCode, TestEnum::getA)));
//    private final String code;
//    private final String a;
//
//    private TestEnum(String code) {
//        this.code = code;
//        this.a = "";
//    }
//
//    public String getCode() {
//        return this.code;
//    }
//
//    public String getA() {
//        return this.a;
//    }
//}

