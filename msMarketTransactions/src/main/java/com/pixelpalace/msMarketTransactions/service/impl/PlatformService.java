package com.pixelpalace.msMarketTransactions.service.impl;

import com.pixelpalace.msMarketTransactions.repository.IPlatformRepository;
import com.pixelpalace.msMarketTransactions.service.IPlatformService;
import org.springframework.stereotype.Service;

@Service
public class PlatformService implements IPlatformService {

    private final IPlatformRepository platformRepository;

    public PlatformService(IPlatformRepository platformRepository) {
        this.platformRepository = platformRepository;
    }
}
