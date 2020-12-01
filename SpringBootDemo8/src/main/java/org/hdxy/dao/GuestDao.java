package org.hdxy.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;
import org.hdxy.pojo.Guest;

import java.util.List;

public interface GuestDao {
    @Select("select * from guest")
    List<Guest> getAll();
}




//public interface GuestDao extends BaseMapper<Guest> {
//
//}