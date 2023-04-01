package ServerSocet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;

public class SmallClientSocket {
    public static void main(String[] args) {
        Socket socket = null;
        BufferedReader br = null;
        try { // получение строки клиентом
            InetAddress currentIP = InetAddress.getLocalHost();
            socket = new Socket(currentIP.getHostAddress(), 8030);
/* здесь "ИМЯ_СЕРВЕРА" компьютер,
на котором стоит сервер-сокет"*/
            br = new BufferedReader(new InputStreamReader(
                    socket.getInputStream()));
            String message = br.readLine();
            System.out.println(message);
        } catch (IOException e) {
            System.err.println("ошибка: " + e);
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if (socket != null) {
                try { // разрыв соединения
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}