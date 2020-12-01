package org.hdxy.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.hdxy.pojo.Guest;

import java.util.List;


public interface GuestService {

    List<Guest> getAll();
}
