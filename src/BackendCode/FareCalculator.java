Spackage BackendCode;

public interface FareCalculator {
    /**
     * Calcula la tarifa para un alquiler dado.
     * @param car vehículo alquilado
     * @param rentTime tiempo de inicio (ms)
     * @param returnTime tiempo de fin (ms)
     * @return importe en la misma unidad entera que antes
     */
    int calculate(Car car, long rentTime, long returnTime);
}
