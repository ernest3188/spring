package com.springernest.libraryApi;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("library/book")
@Slf4j
public class LibraryController {
    private final LibraryService libraryService;

    @ExceptionHandler(IllegalArgumentException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public void handleException(HttpServletRequest request, IllegalArgumentException e){
        log.error(request.getRequestURL() + " with error: " + e.getMessage());
    }

    @ExceptionHandler(HttpClientErrorException.BadRequest.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public void InvalidBookException(HttpServletRequest request, IllegalArgumentException e){
        log.error(request.getRequestURL() + " with error: " + e.getMessage());
    }

    @GetMapping("get/{id}")
    public Book getById(@PathVariable int id) {
        return this.libraryService.getById(id);
    }

    @PostMapping("add")
    public Book add(@RequestBody Book book) {
        return this.libraryService.add(book);
    }

    @PutMapping("update")
    public Book modify(@RequestBody Book book) {
        this.libraryService.modifyBook(book);
        return this.libraryService.modifyBook(book);
    }

    @GetMapping("get")
    public List<Book> getByTitle(@RequestParam String title) {

        return this.libraryService.getByTitle(title);
    }

    @DeleteMapping("{id}")
    public String deleteById(@PathVariable int id) {

        this.libraryService.deleteById(id);

        System.out.println("Book with id " + id + " deleted");
        return "Book with id " + id + " deleted";
    }
}

