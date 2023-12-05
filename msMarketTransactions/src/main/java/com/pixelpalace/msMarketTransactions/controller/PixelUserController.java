package com.pixelpalace.msMarketTransactions.controller;

import com.pixelpalace.msMarketTransactions.dto.LoginDto;
import com.pixelpalace.msMarketTransactions.dto.PixelUserDto;
import com.pixelpalace.msMarketTransactions.dto.response.LoginResponse;
import com.pixelpalace.msMarketTransactions.dto.response.PixelUserGetOneDTO;
import com.pixelpalace.msMarketTransactions.model.PixelUser;
import com.pixelpalace.msMarketTransactions.service.PixelUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class PixelUserController {
    @Autowired
    PixelUserService pixelUserService;

    @GetMapping("{id}")
    public ResponseEntity<PixelUserGetOneDTO> findUserById(@PathVariable Long id) {
        PixelUserGetOneDTO user = pixelUserService.findById(id);
        if (user != null) {
            return ResponseEntity.ok(user);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/list")
    public List<PixelUserGetOneDTO> getAllUsers() {
        return pixelUserService.getUser();
    }

    @GetMapping("by_username/{username}")
    public ResponseEntity<PixelUserGetOneDTO>findbyUsername(@PathVariable String username){
        PixelUserGetOneDTO user = pixelUserService.findByUsername(username);
        if (user != null){
            return ResponseEntity.ok(user);
        }else{
            return ResponseEntity.notFound().build();
        }
    }
    @GetMapping("by_email/{email}")
    public ResponseEntity<PixelUserGetOneDTO>findbyEmail(@PathVariable String email){
        PixelUserGetOneDTO user = pixelUserService.findByEmail(email);
        if (user != null){
            return ResponseEntity.ok(user);
        }else{
            return ResponseEntity.notFound().build();
        }
    }
    @PostMapping(path = "/save")
    public ResponseEntity<String> saveUser(@RequestBody PixelUserDto pixelUserDto){
        String id = pixelUserService.postUser(pixelUserDto);
        return ResponseEntity.status(HttpStatus.CREATED).body("Usuario creado con ID: " + id);
    }


    @PostMapping(path = "/login")
    public ResponseEntity<?>LoginUsername(@RequestBody LoginDto loginDto){
        LoginResponse loginResponse = pixelUserService.Login_user(loginDto);
        return  ResponseEntity.ok(loginResponse);
    }

    /*
    @PostMapping
    public ResponseEntity<?> addUser(@RequestBody PixelUser pixelUser) throws Exception {
        pixelUserService.postUser(pixelUser);
        return ResponseEntity.status(HttpStatus.CREATED).body("Usuario creado exitosamente");
    }
*/

    @DeleteMapping(path = "{id}")
    public ResponseEntity<Object> deleteUser(@PathVariable("id") long id){
        try {
            pixelUserService.deleteUser(id);
            return ResponseEntity.status(HttpStatus.OK).body("Usuario eliminado exitosamente");
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("No se pudo eliminar al usuario");
        }
    }

    @PutMapping("/{id}")
    public PixelUserGetOneDTO update(@PathVariable Long id, @RequestBody PixelUser user) throws ChangeSetPersister.NotFoundException {
        return pixelUserService.update(id, user);
    }


}

