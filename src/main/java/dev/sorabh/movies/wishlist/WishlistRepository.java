package dev.sorabh.movies.wishlist;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface WishlistRepository extends MongoRepository<Wishlist, ObjectId> {
        List<Wishlist>findAllByuserEmail(String userEmail);
}
