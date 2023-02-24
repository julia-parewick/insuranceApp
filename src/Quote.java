import java.time.LocalDate;

/**
 * The Quote class stores information on a quote.
 * @Date 2023-02-24
 * @author Mason Seward
 */
public class Quote
{
    protected LocalDate startDate;
    protected LocalDate endDate;
    protected static Double premiumBeforeTax;

    /**
     * Instantiates a new Quote.
     *
     * @param startDate                 the start date
     * @param endDate                   the end date
     * @param insurancePremiumBeforeTax the premium before tax
     */
    public Quote(LocalDate startDate, LocalDate endDate, Double insurancePremiumBeforeTax)
    {
        this.startDate = startDate;
        this.endDate = endDate;
        premiumBeforeTax = insurancePremiumBeforeTax;
    }

    /**
     * Gets quote start date.
     *
     * @return the start date
     */
    public LocalDate getStartDate()
    {
        return startDate;
    }

    /**
     * Sets quote start date.
     *
     * @param startDate the start date
     */
    public void setStartDate(LocalDate startDate)
    {
        this.startDate = startDate;
    }

    /**
     * Gets quote end date.
     *
     * @return the end date
     */
    public LocalDate getEndDate()
    {
        return endDate;
    }

    /**
     * Sets quote end date.
     *
     * @param endDate the end date
     */
    public void setEndDate(LocalDate endDate)
    {
        this.endDate = endDate;
    }

    /**
     * Gets premium before tax.
     *
     * @return the premium before tax
     */
    public static Double getPremiumBeforeTax()
    {
        return premiumBeforeTax;
    }

    /**
     * Sets premium before tax.
     *
     * @param newPremiumBeforeTax the premium before tax
     */
    public void setPremiumBeforeTax(Double newPremiumBeforeTax)
    {
        premiumBeforeTax = newPremiumBeforeTax;
    }
}
