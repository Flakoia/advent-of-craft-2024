package communication;

public class SantaCommunicator {
    private final int numberOfDaysToRest;
    private Configuration configuration;

    public SantaCommunicator(int numberOfDaysToRest) {
        this.numberOfDaysToRest = numberOfDaysToRest;
    }

    public SantaCommunicator(Configuration configuration) {
        this(configuration.numberOfDaysToRest());
        this.configuration = configuration;
    }

    public String composeMessage(Reindeer reindeer) {
        var daysBeforeReturn = daysBeforeReturn(reindeer.numbersOfDaysForComingBack());

        return "Dear " + reindeer.reindeerName() + ", please return from " + reindeer.currentLocation() +
                " in " + daysBeforeReturn + " day(s) to be ready and rest before Christmas.";
    }

    public boolean isOverdue(Reindeer reindeer, Logger logger) {
        if (daysBeforeReturn(reindeer.numbersOfDaysForComingBack()) <= 0) {
            logger.log("Overdue for " + reindeer.reindeerName() + " located " + reindeer.currentLocation() + ".");
            return true;
        }
        return false;
    }

    private int daysBeforeReturn(int numbersOfDaysForComingBack) {
        return configuration.numberOfDayBeforeChristmas() - numbersOfDaysForComingBack - numberOfDaysToRest;
    }
}