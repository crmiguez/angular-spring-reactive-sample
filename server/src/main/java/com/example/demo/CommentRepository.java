package com.example.demo;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.data.mongodb.repository.Tailable;
import reactor.core.publisher.Flux;

interface CommentRepository extends ReactiveMongoRepository<Comment, String> {

    @Tailable
    Flux<Comment> findByPost(PostId id);

}
