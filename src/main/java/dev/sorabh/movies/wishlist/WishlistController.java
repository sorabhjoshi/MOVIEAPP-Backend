package dev.sorabh.movies.wishlist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/watchlist")
public class WishlistController {
    @Autowired
    private WishlistService service;

    @GetMapping("/{email}")
    public List<Wishlist> getAllWishlist(@PathVariable String email){

        return service.getAllWishlist(email);
    }

    @PostMapping()
    public void addWishlist(@RequestBody  Map<String,String> requestBody ) {
        String userEmail = requestBody.get("email");
        String movieName = requestBody.get("movie");
        String poster = requestBody.get("poster");
        service.addWishlist( userEmail,movieName,poster );
    }
}