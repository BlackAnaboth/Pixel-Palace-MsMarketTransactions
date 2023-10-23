package com.pixelpalace.msMarketTransactions.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @ManyToMany(mappedBy = "products")
    private List<Category> categories;

    @ManyToMany(mappedBy = "products")
    private List<Platform> platforms;

    @Column(name = "price")
    private Double price;

    @OneToMany(mappedBy = "product")
    private List<Transaction> transactions;
}
