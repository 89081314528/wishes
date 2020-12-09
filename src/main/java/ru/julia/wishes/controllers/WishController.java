package ru.julia.wishes.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.julia.wishes.dto.WishDto;
import ru.julia.wishes.service.WishService;
import ru.julia.wishes.service.WishServiceImpl;

import java.util.List;

@RestController
public class WishController {
    @RequestMapping("/")
    public String welcome() {
        return "hi";
    }

    private final WishService wishService;

    public WishController(WishService wishService) {
        this.wishService = wishService;
    }
    @RequestMapping("/showAll")
    public List<WishDto> showAll() {
        return wishService.findAllWish();
    }

    @RequestMapping("/findByNumber/{number}")
    public WishDto findByNumber(@PathVariable String number) {
        return wishService.findByNumber(number);
    }
}
