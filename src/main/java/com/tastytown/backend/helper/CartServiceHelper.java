package com.tastytown.backend.helper;

import java.util.NoSuchElementException;

import org.springframework.stereotype.Component;

import com.tastytown.backend.entity.Cart;
import com.tastytown.backend.entity.User;
import com.tastytown.backend.repository.CartRepository;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class CartServiceHelper {
    private final CartRepository cartRepository;

    public Cart getCartByUser(User user) {
        return cartRepository.findByUser(user)
                .orElseThrow(() -> new NoSuchElementException("No Cart Found for the User"));
    }
}
