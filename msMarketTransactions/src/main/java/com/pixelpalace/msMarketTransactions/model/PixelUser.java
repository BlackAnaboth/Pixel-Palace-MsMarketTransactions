package com.pixelpalace.msMarketTransactions.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.pixelpalace.msMarketTransactions.util.Rol;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter @Getter
@Table(name = "pixeluser")
public class PixelUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "lastname")
    private String lastname;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "email")
    private String email;
    //private List<Productos>; //queda pendiente este atributo

    @Enumerated(EnumType.STRING)
    private Rol rol;

    @Column(name = "birthday")
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private String birthday;

    @JsonIgnore
    private String existingName;
    @JsonIgnore
    private String existingLastname;
    @JsonIgnore
    private String existingUsername;
    @JsonIgnore
    private String existingPassword;
    @JsonIgnore
    private String existingEmail;
    @JsonIgnore
    private String existingBirthday;


    @OneToMany(mappedBy = "iduser", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE}, fetch = FetchType.LAZY)
    private List<Transaction> transactions;

}
