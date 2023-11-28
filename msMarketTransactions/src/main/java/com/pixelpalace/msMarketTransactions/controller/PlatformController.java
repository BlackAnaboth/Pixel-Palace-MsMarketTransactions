package com.pixelpalace.msMarketTransactions.controller;

import com.pixelpalace.msMarketTransactions.dto.PlatformListDTO;
import com.pixelpalace.msMarketTransactions.service.IPlatformService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/platform")
public class PlatformController {

    private final IPlatformService platformService;

    public PlatformController(IPlatformService platformService) {
        this.platformService = platformService;
    }

    @GetMapping("/all")
    public ResponseEntity<PlatformListDTO> getPlatformList(){
        return ResponseEntity.status(HttpStatus.OK).body(platformService.getPlatforms());
    }
}
