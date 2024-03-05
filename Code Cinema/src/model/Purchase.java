/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author tatan
 */
public class Purchase {

    private int id;
    private int clientId;
    private int movieId;
    private int quantityTickets;
    private double totalPurchase;
    private String purchaseDate;

    public Purchase() {
        this.id = 0;
        this.clientId = 0;
        this.movieId = 0;
        this.quantityTickets = 0;
        this.totalPurchase = 0.0;
        this.purchaseDate = "";
    }

    public Purchase(int id, int clientId, int movieId, int quantityTickets, double totalPurchase, String purchaseDate) {
        this.id = id;
        this.clientId = clientId;
        this.movieId = movieId;
        this.quantityTickets = quantityTickets;
        this.totalPurchase = totalPurchase;
        this.purchaseDate = purchaseDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public int getQuantityTickets() {
        return quantityTickets;
    }

    public void setQuantityTickets(int quantityTickets) {
        this.quantityTickets = quantityTickets;
    }

    public double getTotalPurchase() {
        return totalPurchase;
    }

    public void setTotalPurchase(double totalPurchase) {
        this.totalPurchase = totalPurchase;
    }

    public String getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(String purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    @Override
    public String toString() {
        return "Purchase{"
                + "id=" + id
                + ", clientId=" + clientId
                + ", movieId=" + movieId
                + ", quantityTickets=" + quantityTickets
                + ", totalPurchase=" + totalPurchase
                + ", purchaseDate='" + purchaseDate + '\''
                + '}';
    }
}
