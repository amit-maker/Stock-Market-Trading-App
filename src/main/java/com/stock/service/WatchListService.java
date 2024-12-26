package com.stock.service;

import java.util.Set;

import com.stock.dao.WatchListDAO;
import com.stock.model.*;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WatchListService {
    @Autowired
    private WatchListDAO watchListDAO;

    public User getProfileAttributes(String email) {
        return this.watchListDAO.getProfileAttributes(email);
    }

    public boolean addStockToWatchList(User user, String stockSymbol) {
        return this.watchListDAO.addStockToWatchList(user, stockSymbol);
    }

    public Set<Stock> retrieveWatchList(User user)
    {
        return this.watchListDAO.retrieveWatchList(user);
    }
  


}