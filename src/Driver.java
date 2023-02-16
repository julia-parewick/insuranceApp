/**
 * @Author Dan Lewis
 * @Date 2023-02-16
 * Descriptive class for a Driver object
 */
public class Driver {
    /**
     * Age of Driver
     */
    private int Age;
    /**
     * Number of Accidents Driver has been involved in
     */
    private int NumberAccidents;

    /**
     * Driver's Home Address
     */
    private String Address;

    /**
     * getter
     * @return Integer
     */
    public int getAge() {
        return Age;
    }

    /**
     * setter
     * @param age
     */
    public void setAge(int age) {
        Age = age;
    }

    /**
     * getter
     * @return Integer
     */
    public int getNumberAccidents() {
        return NumberAccidents;
    }

    /**
     * setter
     * @param numberAccidents
     */
    public void setNumberAccidents(int numberAccidents) {
        NumberAccidents = numberAccidents;
    }

    /**
     * getter
     * @return String
     */
    public String getAddress() {
        return Address;
    }

    /**
     * setter
     * @param address
     */
    public void setAddress(String address) {
        Address = address;
    }
}
