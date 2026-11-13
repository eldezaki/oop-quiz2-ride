package id.ac.polinema.quiz2;

/**
 * TAHAP 2: perjalanan ojek motor. Tidak menawarkan asuransi perjalanan.
 */
public class BikeRide extends Ride {

    private static final double RATE_PER_KM = 2500;

    public BikeRide(String rideId, Passenger passenger, double distanceKm) {
        super(rideId, passenger, distanceKm);
    }

    @Override
    public double calculateFare() {
        return getDistanceKm() * RATE_PER_KM;
    }
}
