package org.hdxy.service;

import org.apache.ibatis.annotations.Mapper;
import org.hdxy.pojo.Guest;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@Mapper
public interface GuestService {

    List<Guest> getAll();
}
