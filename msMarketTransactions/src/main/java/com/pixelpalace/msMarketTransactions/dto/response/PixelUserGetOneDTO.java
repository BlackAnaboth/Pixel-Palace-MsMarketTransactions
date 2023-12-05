package com.pixelpalace.msMarketTransactions.dto.response;

import com.pixelpalace.msMarketTransactions.dto.TransactionDTO;
import com.pixelpalace.msMarketTransactions.util.Rol;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PixelUserGetOneDTO {

    private Long id;
    private String name;
    private String lastname;
    private String username;
    private String password;
    private String email;
    private Rol rol;
    private String birthday;
    private List<TransactionDTO> transactions;
}