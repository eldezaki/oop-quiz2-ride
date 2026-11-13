package id.ac.polinema.quiz2;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * TAHAP 4 dan 5 (collections dan SOLID): pengatur perjalanan yang menyimpan
 * dan memproses perjalanan.
 *
 * Lengkapi setiap method (ganti baris
 * {@code throw new UnsupportedOperationException(...)}).
 * Deklarasikan sendiri field-nya (semua private).
 *
 * Tahap 4: simpan perjalanan di {@code List} dan cari lewat kode
 * dengan {@code Map}. Jangan memakai array.
 * Tahap 5: metode pembayaran diberikan dari luar lewat constructor. Jangan
 * membuat CashPayment di dalam kelas ini.
 */
public class RideDispatcher {

    /**
     * Membuat pengatur perjalanan kosong dan menyimpan metode pembayaran yang diberikan.
     *
     * @param payment metode pembayaran yang dipakai saat checkout
     */

    private PaymentMethod payment;
    private List<Ride> orders;
    private Map<String, Ride> ordersById;


    public RideDispatcher(PaymentMethod payment) {
        this.payment = payment;
        this.orders = new ArrayList<>();
        this.ordersById = new HashMap<>();

        // throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Menyimpan perjalanan ke daftar dan ke Map (kuncinya kode perjalanan).
     *
     * @param order perjalanan yang ditambahkan
     */
    public void add(Ride order) {
        orders.add(order);
        ordersById.put(order.getRideId(), order);
        // throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Mencari perjalanan lewat kodenya.
     *
     * @param rideId kode yang dicari
     * @return perjalanan yang cocok, atau {@code null} bila tidak ada
     */
    public Ride findById(String rideId) {
        return ordersById.get(rideId);
        // throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * @return jumlah perjalanan yang tersimpan
     */
    public int count() {
        return orders.size();
        // throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * @return daftar perjalanan menurut urutan penambahan
     */
    public List<Ride> getOrders() {
        return orders;
        // throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Mencari perjalanan lewat kodenya, lalu meminta metode pembayaran
     * (yang diberikan lewat constructor) mencatat kode dan tarif-nya.
     * Kelas ini sendiri tidak mencetak apa pun ke layar.
     * Bila kodenya tidak ada, tidak melakukan apa-apa.
     *
     * @param rideId kode perjalanan yang di-checkout
     */
    public void checkout(String rideId) {
        Ride order = findById(rideId);
        if (order == null) {
            return;
        }
        payment.pay(order.getRideId(), order.calculateFare());
        // throw new UnsupportedOperationException("Not implemented yet");
    }
}
