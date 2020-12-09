package ru.julia.wishes.service;

import ru.julia.wishes.dto.WishDto;

import java.util.List;

public interface WishService {
    public WishDto findByNumber(String key);
    public List<WishDto> findAllWish();
}
