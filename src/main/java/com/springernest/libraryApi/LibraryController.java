package com.springernest.libraryApi;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
    @RestController
    @RequestMapping("library/book")

    public class LibraryController{
        private final LibraryService libraryService;

        @GetMapping("get/{id}")
        public Book getById(@PathVariable int id ){
            return this.libraryService.getById(id);
        }

        @PostMapping("add")
        public Book add(@RequestBody Book book){
            return this.libraryService.add(book);
        }
    }
