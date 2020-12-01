package org.hdxy.dao2;

import org.apache.ibatis.annotations.Select;
import org.hdxy.pojo.Guest;

import java.util.List;

public interface GuestDao2 {
    @Select("select * from guest2")
    List<Guest> getAll();
}


//public interface GuestDao extends BaseMapper<Guest> {
//
//}