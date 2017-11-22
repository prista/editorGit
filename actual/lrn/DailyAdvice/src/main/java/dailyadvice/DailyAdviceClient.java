package dailyadvice;

import org.apache.log4j.Logger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.Scanner;

public class DailyAdviceClient {
    private static final Logger log = Logger.getLogger(DailyAdviceClient.class);

    public void go() {
        log.info("Start");
        try {
            Socket s = new Socket("127.0.0.1", 8080);
            log.info("Соединение установлено!");

            InputStreamReader streamReader = new InputStreamReader(s.getInputStream());
            BufferedReader reader = new BufferedReader(streamReader);

            String advice = reader.readLine();
            System.out.println("Сегодня ты должен: " + advice);
            reader.close();
        } catch (IOException e) {
            log.error("В соединении отказано: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new DailyAdviceClient().go();
    }
}
