package com.example.product_management.service;

import com.example.product_management.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    private List<Product> products = new ArrayList<>();

    public ProductService() {
        products.add(new Product(1L, "Bàn làm việc bằng gỗ", 1500000.0));
        products.add(new Product(2L, "Ghế xoay văn phòng", 850000.0));
        products.add(new Product(3L, "Tủ đựng tài liệu", 2200000.0));
    }

    // Hàm trả về danh sách sản phẩm
    public List<Product> getAllProducts() {
        return products;
    }
}