package com.fladro.tai.lab13.post;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class PostController {

    private PostService postService;

    @Autowired
    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/posts")
    public List<Post> getAllPosts(){
        return postService.getAll();
    }

    @GetMapping("/posts/{id}")
    public Post get(@PathVariable int id){
        return postService.get(id);
    }
}
