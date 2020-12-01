package org.hdxy.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.hdxy.dao2.GuestDao2;
import org.hdxy.pojo.Guest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GuestServiceImpl implements GuestService {
    @Autowired
    private GuestDao2 guestDao2;
//    private TkGuestMapper tkGuestMapper;
    @Override
    public List<Guest> getAll() {
        return guestDao2.getAll();
    }
}
//@Service
//public class GuestServiceImpl extends ServiceImpl<GuestDao,Guest> implements GuestService {
////    @Autowired
////    private GuestDao guestDao;
//////    private TkGuestMapper tkGuestMapper;
////    @Override
////    public List<Guest> getAll() {
////        return guestDao.selectList(null);
////    }
//}
