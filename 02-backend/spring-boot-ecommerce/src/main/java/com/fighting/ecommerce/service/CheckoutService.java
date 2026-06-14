package com.fighting.ecommerce.service;

import com.fighting.ecommerce.dto.Purchase;
import com.fighting.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
