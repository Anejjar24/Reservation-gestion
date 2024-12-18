package ma.ensaj.gestionreservation.ws;
import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;

import ma.ensaj.gestionreservation.config.SoapConfig;

public class SoapClient {
    // Méthode pour consulter une réservation par ID
    public static void consulterReservation(Long reservationId) {
        try {
            String METHOD_NAME = "consulterReservation";
            SoapObject request = new SoapObject(SoapConfig.NAMESPACE, METHOD_NAME);
            request.addProperty("id", reservationId);

            SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
            envelope.dotNet = false;
            envelope.setOutputSoapObject(request);

            HttpTransportSE httpTransport = new HttpTransportSE(SoapConfig.URL);
            httpTransport.call(SoapConfig.SOAP_ACTION, envelope);

            Object response = envelope.getResponse();
            System.out.println("Réservation consultée : " + response.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Méthode pour modifier une réservation
    public static void modifierReservation(Long reservationId, String dateDebut, String dateFin, String preferences) {
        try {
            String METHOD_NAME = "modifierReservation";
            SoapObject request = new SoapObject(SoapConfig.NAMESPACE, METHOD_NAME);
            request.addProperty("id", reservationId);
            request.addProperty("dateDebut", dateDebut);
            request.addProperty("dateFin", dateFin);
            request.addProperty("preferences", preferences);

            SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
            envelope.dotNet = false;
            envelope.setOutputSoapObject(request);

            HttpTransportSE httpTransport = new HttpTransportSE(SoapConfig.URL);
            httpTransport.call(SoapConfig.SOAP_ACTION, envelope);

            Object response = envelope.getResponse();
            System.out.println("Réservation modifiée : " + response.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Méthode pour supprimer une réservation
    public static void supprimerReservation(Long reservationId) {
        try {
            String METHOD_NAME = "supprimerReservation";
            SoapObject request = new SoapObject(SoapConfig.NAMESPACE, METHOD_NAME);
            request.addProperty("id", reservationId);

            SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
            envelope.dotNet = false;
            envelope.setOutputSoapObject(request);

            HttpTransportSE httpTransport = new HttpTransportSE(SoapConfig.URL);
            httpTransport.call(SoapConfig.SOAP_ACTION, envelope);

            Object response = envelope.getResponse();
            System.out.println("Réservation supprimée : " + response.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Méthode pour lister les réservations d'un client
    public static void listerReservationsClient(Long clientId) {
        try {
            String METHOD_NAME = "listerReservationsClient";
            SoapObject request = new SoapObject(SoapConfig.NAMESPACE, METHOD_NAME);
            request.addProperty("clientId", clientId);

            SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
            envelope.dotNet = false;
            envelope.setOutputSoapObject(request);

            HttpTransportSE httpTransport = new HttpTransportSE(SoapConfig.URL);
            httpTransport.call(SoapConfig.SOAP_ACTION, envelope);

            Object response = envelope.getResponse();
            System.out.println("Liste des réservations du client : " + response.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void creerReservation(Long clientId, Long chambreId, String dateDebut, String dateFin, String preferences) {
        try {
            // Nom de la méthode
            String METHOD_NAME = "creerReservation";

            // Créer une requête SOAP
            SoapObject request = new SoapObject(SoapConfig.NAMESPACE, METHOD_NAME);

            // Ajouter les paramètres requis
            PropertyInfo clientIdProp = new PropertyInfo();
            clientIdProp.setName("clientId");
            clientIdProp.setValue(clientId);
            clientIdProp.setType(Long.class);
            request.addProperty(clientIdProp);

            PropertyInfo chambreIdProp = new PropertyInfo();
            chambreIdProp.setName("chambreId");
            chambreIdProp.setValue(chambreId);
            chambreIdProp.setType(Long.class);
            request.addProperty(chambreIdProp);

            request.addProperty("dateDebut", dateDebut);
            request.addProperty("dateFin", dateFin);
            request.addProperty("preferences", preferences);

            // Créer l'enveloppe SOAP
            SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
            envelope.dotNet = false; // false car ce n'est pas un service .NET
            envelope.setOutputSoapObject(request);

            // Transporter la requête
            HttpTransportSE httpTransport = new HttpTransportSE(SoapConfig.URL);
            httpTransport.call(SoapConfig.SOAP_ACTION, envelope);

            // Obtenir la réponse
            Object response = envelope.getResponse();
            System.out.println("Réponse : " + response.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
