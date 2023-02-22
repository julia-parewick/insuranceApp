/**
 * @Author Dan Lewis
 * @Date 2023-02-16
 * Descriptive class for a Driver object
 */
public class Driver
{
    /**
     * Name of Driver
     */
    private String driverName;
    /**
     * Age of Driver
     */
    private int age;
    /**
     * Number of Accidents Driver has been involved in
     */
    private int numberOfAccidents;

    /**
     * Driver's Home Address
     */
    private String address;

    /**
     * Instantiages a new Driver class
     * @param name Driver's name
     * @param driverAge Driver's Age
     * @param numberOfAccidents Number of accidents by driver
     * @param address home address
     */
    public Driver(String name, int driverAge, int numberOfAccidents, String address)
    {
        driverName = name;
        age = driverAge;
        this.numberOfAccidents = numberOfAccidents;
        this.address = address;
    }

    /**
     * getter
     * @return Integer
     */
    public int getAge() {
        return age;
    }

    /**
     * setter
     * @param age drivers age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * getter
     * @return Integer
     */
    public int getNumberAccidents() {
        return numberOfAccidents;
    }

    /**
     * setter
     * @param numberAccidents number of accidents by driver
     */
    public void setNumberAccidents(int numberAccidents) {
        numberOfAccidents = numberAccidents;
    }

    /**
     * getter
     * @return String
     */
    public String getAddress() {
        return address;
    }

    /**
     * setter
     * @param address drivers address
     */
    public void setAddress(String address) {
        this.address = address;
    }
}
