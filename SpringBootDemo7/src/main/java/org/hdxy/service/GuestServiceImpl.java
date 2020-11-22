package org.hdxy.service;

import org.hdxy.dao.GuestDao;
import org.hdxy.pojo.Guest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GuestServiceImpl implements GuestService {
    @Autowired
    private GuestDao guestDao;
    @Override
    public List<Guest> getAll() {
        return guestDao.getAll();
    }
}
