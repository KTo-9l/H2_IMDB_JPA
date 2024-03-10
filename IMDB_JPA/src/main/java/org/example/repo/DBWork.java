package org.example.repo;

import org.example.entity.*;

import java.util.List;

public class DBWork {
    public static void printStylist(Stylists stylist) {
        System.out.println(stylist.getId() + " " + stylist.getName() + " " + stylist.isDeleted());
    }
    public static void printClient(Clients client) {
        System.out.println(client.getId() + " " + client.getName() + " " + client.getIdStylists().getName() + " " + client.isDeleted());
    }
    public static void printClientStylist(Clients client) {
        System.out.print(client.getId() + " " + client.getName() + " " + client.isDeleted() + " ");
        printStylist(client.getIdStylists());
    }
    public static void printStylists(List<Stylists> stylists) {
        for (Stylists stylist : stylists) {
            printStylist(stylist);
        }
    }
    public static void printClients(List<Clients> clients) {
        for (Clients client : clients) {
            printClient(client);
        }
    }
    public static void printClientsStylists(List<Clients> clients) {
        for (Clients client : clients) {
            printClientStylist(client);
        }
    }
}
