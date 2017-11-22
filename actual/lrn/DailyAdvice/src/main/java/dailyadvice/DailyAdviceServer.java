package dailyadvice;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import org.apache.log4j.Logger;

public class DailyAdviceServer {
    private static final Logger log = Logger.getLogger(DailyAdviceServer.class);


    String[] adviceList = {"Ешьте меньшими порциями", "Купите облегающие джинсы. Нет, они не делают вас полнее", "Два слова: не годится",
    "Будьте честны хотябы сегодня, скажите своему боссу все, что вы о нем думаете", "Возможно, вам стоит подобрать другую прическу"};

    public void go() {
        log.info("Это информационное сообщение!");
        try {
            ServerSocket serverSocket = new ServerSocket(8080);
            log.info("Создан serverSocket!");
            while (true) {
                log.info("Ждем подключение");
                Socket socket = serverSocket.accept();
                log.info("Клиент подключился! " + socket.getInetAddress() + " port: " + socket.getPort());
                PrintWriter writer = new PrintWriter(socket.getOutputStream());
                String advice = getAdvice();
                writer.println(advice);
                writer.close();
                log.info(advice);
                System.out.println(advice);
            }
        } catch (IOException ex) {
            log.error(ex.getMessage());
        }
    }

    private String getAdvice() {
        int random = (int) (Math.random() * adviceList.length);
        return adviceList[random];

    }

    public static void main(String[] args) {
        new DailyAdviceServer().go();
    }
}
