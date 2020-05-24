package com.eyabc.springboot.facade;

import com.eyabc.springboot.adapter.response.Movie;
import com.eyabc.springboot.adapter.response.Shop;
import com.eyabc.springboot.service.NaverMovieService;
import com.eyabc.springboot.service.NaverShopService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class NaverFacade {

    @NonNull private final NaverMovieService naverMovieService;
    @NonNull private final NaverShopService naverShopService;

    public Shop getShopList (String query) {
        return naverShopService.callShop(query);
    }

    public Movie getMovieList (String query) {
        return  naverMovieService.callMovie(query);
    }

    public Movie getMovieListSortByUserRating (String query) {
        Movie movie = naverMovieService.callMovie(query);
        movie.getItems().sort((a, b) -> b.getUserRating() > a.getUserRating() ? 1 : -1);
        return movie;
    }

}
