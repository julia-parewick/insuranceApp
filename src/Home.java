/**
 * @Author Julia Parewick
 * @Date 2023-02-16
 * Descriptive class for a Home object
 */
public class Home {
    /**
     * Age of dwelling
     */
    private Integer age;
    /**
     * Enum object representing the type of dwelling
     */
    private DwellingType dwellingType;
    /**
     * Enum Object representing the type of heating in a dwelling
     */
    private HeatingType heatingType;
    /**
     * Location of the dwelling
     */
    private String location;
    /**
     * The monetary value of dwelling
     */
    private double value;

    /**
     * getter
     * @return Integer
     */
    public Integer getAge() {
        return age;
    }

    /**
     * setter
     * @param age
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * getter
     * @return String
     */
    public DwellingType getDwellingType() {
        return dwellingType;
    }

    /**
     * setter
     * @param dwellingType
     */
    public void setDwellingType(DwellingType dwellingType) {
        this.dwellingType = dwellingType;
    }

    /**
     * getter
     * @return HeatingType
     */
    public HeatingType getHeatingType() {
        return heatingType;
    }

    /**
     * setter
     * @param heatingType
     */
    public void setHeatingType(HeatingType heatingType) {
        this.heatingType = heatingType;
    }

    /**
     * getter
     * @return String
     */
    public String getLocation() {
        return location;
    }

    /**
     * setter
     * @param location
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * getter
     * @return double
     */
    public double getValue() {
        return value;
    }

    /**
     * setter
     * @param value
     */
    public void setValue(double value) {
        this.value = value;
    }
}
