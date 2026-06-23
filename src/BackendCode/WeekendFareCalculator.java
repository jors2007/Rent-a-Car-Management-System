package BackendCode;

/**
 * Ejemplo de calculador alternativo que aplica un multiplicador (p.ej. fin de semana).
 */
public class WeekendFareCalculator implements FareCalculator {

    private final double multiplier;

    public WeekendFareCalculator(double multiplier) {
        this.multiplier = multiplier;
    }

    @Override
    public int calculate(Car car, long rentTime, long returnTime) {
        // Reutiliza la lógica base y aplica un multiplicador.
        DefaultFareCalculator base = new DefaultFareCalculator();
        int baseFare = base.calculate(car, rentTime, returnTime);
        return (int) Math.round(baseFare * multiplier);
    }
}
