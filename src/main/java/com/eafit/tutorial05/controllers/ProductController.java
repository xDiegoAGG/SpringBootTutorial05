package com.eafit.tutorial05.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ProductController {

    private static final List<Map<String, String>> products = List.of(
        Map.of("id", "1", "name", "TV", "description", "Best TV", "price", "100"),
        Map.of("id", "2", "name", "iPhone", "description", "Best iPhone", "price", "200"),
        Map.of("id", "3", "name", "Chromecast", "description", "Best Chromecast", "price", "50"),
        Map.of("id", "4", "name", "Glasses", "description", "Best Glasses", "price", "20")
    );

    @GetMapping("/products")
    public String index(Model model) {
        model.addAttribute("title", "Products - Online Store");
        model.addAttribute("subtitle", "List of products");
        model.addAttribute("products", products);
        return "product/index";
    }

    @GetMapping("/products/{id}")
    public String show(@PathVariable String id, Model model) {
        int productId = Integer.parseInt(id) - 1;

        if (productId < 0 || productId >= products.size()) {
            return "redirect:/";
        }

        Map<String, String> product = products.get(productId);
        double productPrice = Double.parseDouble(product.get("price"));

        model.addAttribute("title", product.get("name") + " - Online Store");
        model.addAttribute("subtitle", product.get("name") + " - Product Information");
        model.addAttribute("product", product);
        model.addAttribute("productPrice", productPrice);
        return "product/show";
    }
}