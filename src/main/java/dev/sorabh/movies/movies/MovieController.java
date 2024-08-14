package dev.sorabh.movies.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/movies")
public class MovieController {
    @Autowired
    private MovieService movieService;
    @GetMapping
    public ResponseEntity<List<Movie>> GetAllMovies(){
    return new ResponseEntity<List<Movie>>(movieService.allmovies(),HttpStatus.OK);
 }

    @GetMapping("/{imdbid}")
    public ResponseEntity<Optional<Movie>> singlemovie(@PathVariable String imdbid){
        return new ResponseEntity<Optional<Movie>>(movieService.singlemovie(imdbid),HttpStatus.OK);
    }
}
