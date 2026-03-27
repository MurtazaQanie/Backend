package exercise3;

import java.util.Objects;

public class LicensePlate {

    // final variables cannot be changes after object creation
    private final String code;
    private final String landCode;

    public LicensePlate(String landCode, String code) {
        this.code = code;
        this.landCode = landCode;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        LicensePlate that = (LicensePlate) o;
        return Objects.equals(code, that.code) && Objects.equals(landCode, that.landCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, landCode);
    }

    @Override
    public String toString() {
        return landCode + " " + code;
    }
}
