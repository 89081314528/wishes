package ru.julia.wishes.service;

import org.springframework.stereotype.Service;
import ru.julia.wishes.dto.WishDto;
import ru.julia.wishes.entity.Wish;
import ru.julia.wishes.repositories.WishRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class WishServiceImpl implements WishService {
    private final WishRepository wishRepository;

    public WishServiceImpl(WishRepository wishRepository) {
        this.wishRepository = wishRepository;
    }

    @Override
    public WishDto findByNumber(String key) {
        Wish wish = wishRepository.findById(key).orElse(null);
        WishDto wishDto = new WishDto(wish.getWish(), wish.getCost(), wish.getKey());
        return wishDto;
    }

    @Override
    public List<WishDto> findAllWish() {
        List<WishDto> wishDtoList = new ArrayList<>();
        List<Wish> wishList = wishRepository.findAll();
        for (int i = 0; i < wishList.size(); i++) {
            Wish wish = wishList.get(i);
            wishDtoList.add(new WishDto(wish.getWish(),wish.getCost(),wish.getKey()));
        }
        return wishDtoList;
    }
}
