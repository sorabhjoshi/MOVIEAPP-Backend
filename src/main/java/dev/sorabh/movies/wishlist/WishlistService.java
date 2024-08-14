package dev.sorabh.movies.wishlist;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.util.List;
import java.util.Optional;

@Service
public class WishlistService {
    @Autowired
    private WishlistRepository repository;

    public void addWishlist(String email, String movieName, String poster) {
        repository.insert(new Wishlist(new ObjectId(), email, movieName,poster));
    }

    public List<Wishlist> getAllWishlist(String userEmail) {

        return repository.findAllByuserEmail(userEmail);
    }
}