package com.pixelpalace.msMarketTransactions.service.impl;

import com.pixelpalace.msMarketTransactions.repository.IGenreRepository;
import com.pixelpalace.msMarketTransactions.service.IGenreService;
import org.springframework.stereotype.Service;

@Service
public class GenreService implements IGenreService {

    private final IGenreRepository genreRepository;

    public GenreService(IGenreRepository genreRepository) {
        this.genreRepository = genreRepository;
    }
}
