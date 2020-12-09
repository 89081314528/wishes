package ru.julia.wishes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.julia.wishes.entity.Wish;

public interface WishRepository extends JpaRepository<Wish, String> {
}
