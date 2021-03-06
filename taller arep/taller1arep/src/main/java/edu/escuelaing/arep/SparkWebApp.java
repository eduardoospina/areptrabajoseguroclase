package edu.escuelaing.arep;
import org.omg.CosNaming.IstringHelper;

import static spark.Spark.*;

public class SparkWebApp {

    public static void main(String[] args) {
        secure(getKeystore(), "123456",null, null);

        port(getPort());
        get("/hello", (req, res) -> "Hello world");
    }

    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 5000; //returns default port if heroku-port isn't set(i.e. on localhost)
    }

    static String getKeystore() {
        if (System.getenv("KEYSTORE") != null) {
            return System.getenv("Keystore");
        }
        return "Keystores/ecikeystore.p12"; //returns default port if heroku-port isn't set(i.e. on localhost)
    }


}