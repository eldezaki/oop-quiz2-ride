package id.ac.polinema.quiz2;

/**
 * TAHAP 2: perjalanan mobil. Menawarkan asuransi perjalanan.
 */
public class CarRide extends Ride implements Insurable {

    private static final double RATE_PER_KM = 4000;
    private static final double INSURANCE_FEE = 3000;

    public CarRide(String rideId, Passenger passenger, double distanceKm) {
        super(rideId, passenger, distanceKm);
    }

    @Override
    public double calculateFare() {
        return getDistanceKm() * RATE_PER_KM;
    }

    @Override
    public double insuranceFee() {
        return INSURANCE_FEE;
    }
}
