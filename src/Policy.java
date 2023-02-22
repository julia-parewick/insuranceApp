import java.time.LocalDate;
/**
 * @Author Julia Parewick
 * @Date 2023-02-22
 * Abstract class for a customer's insurance policy
 */
abstract class Policy {
    /**
     * Policy holder
     */
    private Customer customer;
    /**
     * start date of policy
     */
    private LocalDate startDate;
    /**
     * end date of policy
     */
    private LocalDate endDate;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    /**
     * constructor
     * @param customer
     * @param startDate
     * @param endDate
     */
    public Policy(Customer customer, LocalDate startDate, LocalDate endDate){
        this.customer=customer;
        this.startDate=startDate;
        this.endDate=endDate;
    }

    /**
     * Checks if policy has expired
     * @return
     */
    public boolean isActive(){
        LocalDate today = LocalDate.now();
        if(today.isBefore(endDate)){
            return true;
        }
        return false;
    }
}
