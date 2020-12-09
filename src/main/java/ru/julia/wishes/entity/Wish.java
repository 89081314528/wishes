package ru.julia.wishes.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "wishes")
public class Wish {
    @Column(name = "wish")
    String wish;
    @Column(name = "cost")
    Long cost;
    @Column(name = "key")
    @Id
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

    public Wish(String wish, Long cost, String key) {
        this.wish = wish;
        this.cost = cost;
        this.key = key;
    }
    public Wish() {
    }
}
