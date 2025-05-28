package API;
import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class APICrypto {
    public static void main(String[] args) {

        String apiUrl = "https://api.coingecko.com/api/v3/simple/price?ids=bitcoin,ethereum&vs_currencies=usd,eur";

        try {
            URL url = new URL(apiUrl);
            HttpURLConnection conection = (HttpURLConnection) url.openConnection();
            conection.setRequestMethod("GET");

            BufferedReader in = new BufferedReader(new InputStreamReader(conection.getInputStream()));
            StringBuilder json = new StringBuilder();
            String line;

            while ((line = in.readLine()) != null) {
                json.append(line);
            }

            in.close();
            Gson gson = new Gson();
            Cripto cripto = gson.fromJson(json.toString(), Cripto.class);

            System.out.println("Precio criptomonedas:");
            System.out.println("Precio BTC:");
            System.out.println("    " + cripto.bitcoin.eur + " EUR");
            System.out.println("    " + cripto.bitcoin.usd + " USD");

            System.out.println("PRECIO ETH:");
            System.out.println("    " + cripto.ethereum.eur + " EUR");
            System.out.println("    " + cripto.ethereum.usd + " USD");


        } catch (Exception e) {
            System.out.println("Algo ha ido mal");
            e.printStackTrace();
        }

    }
}