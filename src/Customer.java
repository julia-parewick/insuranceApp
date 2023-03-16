import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author Dan Lewis
 * @Date 2023-02-24
 * Descriptive class for a Customer
 */
public class Customer
{
    /**
     * Customer's Policies in a list
     */
    private final List<Policy> policyList;
    /**
     * Customer's First Name
     */
    private String firstName;
    /**
     * Customer's Last Name
     */
    private String lastName;
    /**
     * Customer's DOB as YYYY-MM-DD
     */
    private LocalDate dob;

    /**
     * Instantiates a new Customer class
     *
     * @param firstName a customers first name.
     * @param lastName  a customers last name.
     * @param dob       a customers date of birth.
     */
    public Customer(String firstName, String lastName, LocalDate dob)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.policyList = new LinkedList<>();
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
     * @return LocalDate
     */
    public LocalDate getDob()
    {
        return dob;
    }

    /**
     * getter
     *
     * @return List<Policy>
     */
    public List<Policy> getPolicyList()
    {
        return policyList;
    }

    /**
     * Adds a policy to the Customer's policy list
     *
     * @param policy the policy.
     */
    public void addPolicy(Policy policy)
    {
        this.policyList.add(policy);
    }
}
