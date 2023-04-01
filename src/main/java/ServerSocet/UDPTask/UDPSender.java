package ServerSocet.UDPTask;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
public class UDPSender {
    public static void main(String[] args) {
        String fileName = "audio/toxic.mp3";
        try (FileInputStream fr = new FileInputStream(new File(fileName))) {
            byte[] data = new byte[1024];
            DatagramSocket dSocket = new DatagramSocket();
            InetAddress address = InetAddress.getLocalHost();
            DatagramPacket packet;
            while (fr.read(data) != -1) {
                // создание пакета данных
                packet = new DatagramPacket(data, data.length, address, 8033);
                dSocket.send(packet);// передача пакета
            }
            System.out.println("Файл успешно отправлен");
        } catch (UnknownHostException e) {
            // неверный адрес получателя
            e.printStackTrace();
        } catch (SocketException e) {
            // возникли ошибки при передаче данных
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}