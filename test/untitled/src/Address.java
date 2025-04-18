import java.util.Arrays;
import java.util.Objects;

public class Address {
    public String city;
    public String street;
    public int houseNumber;
    public String extraInfo;
    public String[] residents;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Address address = (Address) object;
        return houseNumber == address.houseNumber &&
                Objects.equals(city, address.city) &&
                Objects.equals(street, address.street) &&
                Objects.equals(extraInfo, address.extraInfo) &&
                Arrays.equals(residents, address.residents);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(city, street, houseNumber, extraInfo);
        result = 31 * result + Arrays.hashCode(residents);
        return result;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", houseNumber=" + houseNumber +
                ", extraInfo='" + extraInfo + '\'' +
                ", residents=" + Arrays.toString(residents) +
                '}';
    }
}
