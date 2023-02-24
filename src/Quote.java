import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * The Quote class stores information on a quote.
 * @Date 2023-02-24
 * @author Mason Seward
 */
public class Quote
{
    private LocalDate startDate;
    private LocalDate endDate;
    private BigDecimal premiumBeforeTax;

    /**
     * Instantiates a new Quote.
     *
     * @param startDate        the start date
     * @param endDate          the end date
     * @param premiumBeforeTax the premium before tax
     */
    public Quote(LocalDate startDate, LocalDate endDate, BigDecimal premiumBeforeTax)
    {
        this.startDate = startDate;
        this.endDate = endDate;
        this.premiumBeforeTax = premiumBeforeTax;
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
    public BigDecimal getPremiumBeforeTax()
    {
        return premiumBeforeTax;
    }

    /**
     * Sets premium before tax.
     *
     * @param premiumBeforeTax the premium before tax
     */
    public void setPremiumBeforeTax(BigDecimal premiumBeforeTax)
    {
        this.premiumBeforeTax = premiumBeforeTax;
    }
}
