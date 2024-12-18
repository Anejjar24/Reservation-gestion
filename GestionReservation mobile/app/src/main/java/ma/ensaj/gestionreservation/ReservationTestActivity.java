package ma.ensaj.gestionreservation;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import ma.ensaj.gestionreservation.ws.SoapClient;

public class ReservationTestActivity extends AppCompatActivity {
    private static final String TAG = "ReservationTest";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reservation);
/*
        new Thread(() -> {
            // Appel de la méthode creerReservation
            SoapClient.creerReservation(1L, 9L, "2024-06-10", "2024-06-15", "Vue mer");
        }).start();
    }
*/
        new Thread(() -> {
            // Tester la création d'une réservation
            System.out.println("=== Test: Créer une réservation ===");
            SoapClient.creerReservation(1L, 1L, "2024-06-10", "2024-06-15", "Vue mer");

            // Tester la consultation d'une réservation
            System.out.println("=== Test: Consulter une réservation ===");
            SoapClient.consulterReservation(36L);

            // Tester la modification d'une réservation
            System.out.println("=== Test: Modifier une réservation ===");
            SoapClient.modifierReservation(36L, "2024-06-12", "2024-06-18", "Vue montagne");
            System.out.println("=== Test: Aprés modification ===");
            SoapClient.consulterReservation(36L);
            // Tester la suppression d'une réservation
            System.out.println("=== Test: Supprimer une réservation ===");
            SoapClient.supprimerReservation(35L);

            // Tester le listing des réservations d'un client
            System.out.println("=== Test: Lister les réservations d'un client ===");
            SoapClient.listerReservationsClient(1L);

        }).start();
    }
}