import lombok.Getter;

import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum TestEnum {
    SUCCESS("200");

    private static final Map<String, String> CODE_MAP = Collections.unmodifiableMap(
            Stream.of(values()).collect(Collectors.toMap(TestEnum::getCode, TestEnum::getA))
    );

    @Getter
    private final String code;

    @Getter
    private final String a;

    TestEnum(String code) {
        this.code = code;
        a = "";
    }

    public static TestEnum of() {
        return TestEnum.valueOf("200");
    }
}
