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
@Table(name = "Platforms")
public class Platform {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @ManyToMany
    @JoinTable(
            name = "ProductPlatforms",
            joinColumns = @JoinColumn(name = "platform_id"),
            inverseJoinColumns = @JoinColumn(name = "product_id" ))
    private List<Product> products;

    @OneToMany(mappedBy = "platform")
    private List<Transaction> transactions;
}
