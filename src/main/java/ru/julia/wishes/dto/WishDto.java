package ru.julia.wishes.dto;

import javax.persistence.Column;
import javax.persistence.Id;

public class WishDto {
    String wish;
    Long cost;
    String key;

    public void setWish(String wish) {
        this.wish = wish;
    }

    public void setCost(Long cost) {
        this.cost = cost;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getWish() {
        return wish;
    }

    public Long getCost() {
        return cost;
    }

    public String getKey() {
        return key;
    }

    public WishDto(String wish, Long cost, String key) {
        this.wish = wish;
        this.cost = cost;
        this.key = key;
    }
}
