import java.time.LocalDate;

/**
 * The Quote class stores information on a quote.
 *
 * @author Mason Seward
 * @Date 2023-02-24
 */
public abstract class Quote
{
    protected LocalDate startDate;
    protected LocalDate endDate;

    /**
     * Instantiates a new Quote.
     *
     * @param startDate the start date
     * @param endDate   the end date
     */
    public Quote(LocalDate startDate, LocalDate endDate)
    {
        this.startDate = startDate;
        this.endDate = endDate;
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
     * Gets quote end date.
     *
     * @return the end date
     */
    public LocalDate getEndDate()
    {
        return endDate;
    }

}
