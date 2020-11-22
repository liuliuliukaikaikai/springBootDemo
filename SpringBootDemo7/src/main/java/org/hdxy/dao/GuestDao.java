package org.hdxy.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.hdxy.pojo.Guest;
import org.springframework.stereotype.Repository;

import java.util.List;



@Repository
public interface GuestDao {

    List<Guest> getAll();
}
