/**
 * @Author Dan Lewis
 * @Date 2023-02-16
 * Descriptive class for a Driver object
 */
public class Driver
{
    /**
     * First name of Driver
     */
    private String firstName;

    /**
     * Last name of Driver
     */
    private String lastName;

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
     * Instantiates a new Driver class
     *
     * @param driverAge         Driver's Age
     * @param numberOfAccidents Number of accidents by driver
     * @param address           home address
     */
    public Driver(String firstName, String lastName, int driverAge, int numberOfAccidents, String address)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = driverAge;
        this.numberOfAccidents = numberOfAccidents;
        this.address = address;
    }

    /**
     * getter
     *
     * @return String
     */
    public String getFirstName()
    {
        return firstName;
    }

    /**
     * getter
     *
     * @return String
     */
    public String getLastName()
    {
        return lastName;
    }

    /**
     * getter
     *
     * @return Integer
     */
    public int getAge()
    {
        return age;
    }

    /**
     * getter
     *
     * @return Integer
     */
    public int getNumberAccidents()
    {
        return numberOfAccidents;
    }

    /**
     * getter
     *
     * @return String
     */
    public String getAddress()
    {
        return address;
    }

}
