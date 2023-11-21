package com.rbp.bookmymovie.models;
 
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;
 
@Document(value = "movie")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie {
    private ObjectId _id;
    private String movieName;
    private String theatreName;
    private Integer noOfTicketsAvailable;
    private Integer totalSeats;
    private String ticketsStatus;
    private String movieImage;
    private int likes;
    private String language;
 
    public Movie(String movieName, String theatreName, Integer totalSeats, Integer noOfTicketsAvailable, String ticketsStatus) {
        this.movieName = movieName;
        this.theatreName = theatreName;
        this.totalSeats = totalSeats;
        this.noOfTicketsAvailable = noOfTicketsAvailable;
        this.ticketsStatus = ticketsStatus;
    }
    public Movie(String movieName, String theatreName, Integer totalSeats, Integer noOfTicketsAvailable, String ticketsStatus, String movieImage) {
        this.movieName = movieName;
        this.theatreName = theatreName;
        this.totalSeats = totalSeats;
        this.noOfTicketsAvailable = noOfTicketsAvailable;
        this.ticketsStatus = ticketsStatus;
        this.movieImage = movieImage;
    }
    public Movie(String movieName, String theatreName, Integer totalSeats, Integer noOfTicketsAvailable, String ticketsStatus, String movieImage, int likes) {
        this.movieName = movieName;
        this.theatreName = theatreName;
        this.totalSeats = totalSeats;
        this.noOfTicketsAvailable = noOfTicketsAvailable;
        this.ticketsStatus = ticketsStatus;
        this.movieImage = movieImage;
        this.likes = likes;
    }
    
    public Movie(String movieName, String theatreName, Integer totalSeats, Integer noOfTicketsAvailable, String ticketsStatus, String movieImage, int likes, String language) {
        this.movieName = movieName;
        this.theatreName = theatreName;
        this.totalSeats = totalSeats;
        this.noOfTicketsAvailable = noOfTicketsAvailable;
        this.ticketsStatus = ticketsStatus;
        this.movieImage = movieImage;
        this.likes = likes;
        this.language = language;
    }
 
    public Movie(String movieName, String theatreName, Integer noOfTicketsAvailable) {
        this.movieName = movieName;
        this.theatreName = theatreName;
        this.noOfTicketsAvailable = noOfTicketsAvailable;
    }
 
    public Movie(ObjectId _id, String movieName, String theatreName, Integer noOfTicketsAvailable) {
        this._id = _id;
        this.movieName = movieName;
        this.theatreName = theatreName;
        this.noOfTicketsAvailable = noOfTicketsAvailable;
    }
}