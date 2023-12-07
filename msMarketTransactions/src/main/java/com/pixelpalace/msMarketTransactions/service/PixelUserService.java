package com.pixelpalace.msMarketTransactions.service;

import com.pixelpalace.msMarketTransactions.dto.LoginDto;
import com.pixelpalace.msMarketTransactions.dto.PixelUserDto;
import com.pixelpalace.msMarketTransactions.dto.response.LoginResponse;
import com.pixelpalace.msMarketTransactions.dto.response.PixelUserGetOneDTO;
import com.pixelpalace.msMarketTransactions.model.PixelUser;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface PixelUserService {
    String postUser(PixelUserDto pixelUserDto);

    Optional<PixelUserGetOneDTO> findOneByUsernameAndPassword(String username, String password);

//   ResponseEntity<Object> deleteUser(long id);

    List<PixelUserGetOneDTO> getUser();

    ResponseEntity<Object> deleteUser(long id);

    PixelUserGetOneDTO findById(long id);

    PixelUserGetOneDTO findByUsername(String username);
    PixelUserGetOneDTO findByEmail(String email);

    PixelUserGetOneDTO update(Long id, PixelUser user) throws ChangeSetPersister.NotFoundException;

    LoginResponse Login_user (LoginDto loginDto);
}
