package homework.city;

public class House {
    private String street;
    private Integer houseNumber;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        if (this.street == null) {
            this.street = street;
        }

    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        if (this.houseNumber == null) {
            this.houseNumber = houseNumber;
        }
    }

    @Override
    public String toString() {
        return "House (" + street + " street"
                + ", " + houseNumber + ")";
    }
}
