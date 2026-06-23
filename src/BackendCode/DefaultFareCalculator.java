package BackendCode;

public class DefaultFareCalculator implements FareCalculator {

    @Override
    public int calculate(Car car, long rentTime, long returnTime) {
        long totalTime = returnTime - rentTime;
        totalTime = totalTime / (1000 * 60 * 60);

        int rentPerHour = car.getRentPerHour();
        if (totalTime != 0) {
            return (int) (rentPerHour * totalTime);
        } else {
            return rentPerHour;
        }
    }
}
