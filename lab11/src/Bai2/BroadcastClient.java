/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.util.Date;

/**
 *
 * @author Quang Toan
 */
public class BroadcastClient {

    public static final int PORT = 1200;

    public static void main(String args[]) throws Exception {
        MulticastSocket socket;
        DatagramPacket packet;
        InetAddress address;
        address = InetAddress.getByName("225.4.5.6");
        socket = new MulticastSocket(BroadcastServer.PORT);
//join a Multicast group and send the group salutations
        socket.joinGroup(address);
        byte[] data = new byte[256];
        packet = new DatagramPacket(data, data.length);
        for (;;) {
// receive the packets 
            socket.receive(packet);
            String str = new String(packet.getData());
            System.out.println(" Time signal recieved from"
                    + packet.getAddress() + " Time is : " + str);
        } // for 
    } // main 

}
