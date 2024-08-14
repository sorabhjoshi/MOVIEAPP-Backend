package dev.sorabh.movies.wishlist;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "wishlist")
@Data
public class Wishlist {
    @Id
    private ObjectId id;
    private String userEmail;
    private String movieName;
    private String poster;

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public String getuserEmail() {
        return userEmail;
    }

    public void setuserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public Wishlist(ObjectId id,String userEmail, String movieName, String poster) {
        this.userEmail = userEmail;
        this.movieName = movieName;
        this.poster = poster;
        this.id = id;
    }
}