import java.time.LocalDate;

/**
 * @Author Julia Parewick
 * @Date 2023-02-22
 * Descriptive class for a Home object
 */
public class Home {
    /**
     *Types of heating in a home
     *
     */
    enum HeatingType {
        ELECTRIC,OIL,WOOD,GAS,OTHER
    }

    /**
     *Location categories
     */
    enum Location {
        URBAN,RURAL
    }

    /**
     * Age of dwelling
     */
    private int yearBuilt;
    /**
     * int representing the type of heating in a dwelling.
     */
    private HeatingType heatingType;
    /**
     * Location of the dwelling
     */
    private Location location;
    /**
     * The monetary value of dwelling
     */
    private int value;

    /**
     * Constructor
     * @param yearBuilt
     * @param value
     * @param heatingType
     * @param location
     */
    public Home(int yearBuilt, int value, HeatingType heatingType, Location location){
        this.yearBuilt=yearBuilt;
        this.value=value;
        this.heatingType=heatingType;
        this.location=location;
    }

    public HeatingType getHeatingType() {
        return heatingType;
    }

    public Location getLocation() {
        return location;
    }

    public int getValue() {
        return value;
    }

    public int calculateAge(){
        return LocalDate.now().getYear()-this.yearBuilt;
    }

    public boolean isUrban(){
        if(location==Location.URBAN){
            return true;
        }
        return false;
    }

}
