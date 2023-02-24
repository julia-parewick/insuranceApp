/**
 * @Author Dan Lewis
 * @Date 2023-02-24
 * Descriptive class for a Customer
 */
public class Customer {
    /**
     * Customer's Home Policy
     */
    private HomePolicy homePolicy;
    /**
     * Customer's Auto Policy
     */
    private AutoPolicy autoPolicy;

    /**
     * Instantiates a new Customer class
     * @param homePolicy
     * @param autoPolicy
     */
    public Customer(HomePolicy homePolicy, AutoPolicy autoPolicy){
        this.homePolicy = homePolicy;
        this.autoPolicy = autoPolicy;
    }

    /**
     * getter
     * @return HomePolicy
     */
    public HomePolicy getHomePolicy() {
        return homePolicy;
    }

    /**
     * setter
     * @param homePolicy
     */
    public void setHomePolicy(HomePolicy homePolicy) {
        this.homePolicy = homePolicy;
    }

    /**
     * getter
     * @return AutoPolicy
     */
    public AutoPolicy getAutoPolicy() {
        return autoPolicy;
    }

    /**
     * setter
     * @param autoPolicy
     */
    public void setAutoPolicy(AutoPolicy autoPolicy) {
        this.autoPolicy = autoPolicy;
    }

}
