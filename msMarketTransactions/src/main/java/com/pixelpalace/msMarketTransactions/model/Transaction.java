package com.pixelpalace.msMarketTransactions.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Transactions")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "status")
    private String status;

    @Column(name = "code")
    private String code;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "transaction_id")
    private PixelUser iduser;

    @ManyToMany(mappedBy = "transactions", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Product> products = new ArrayList<>();

    @ManyToMany(mappedBy = "transactions", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Platform> platform = new ArrayList<>();

    @Column(name = "date")
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private String date;

    @Column(name = "price")
    private Double price;
}
