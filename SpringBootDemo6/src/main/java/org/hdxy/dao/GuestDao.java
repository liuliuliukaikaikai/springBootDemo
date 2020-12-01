package org.hdxy.dao;

import org.hdxy.pojo.Guest;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class GuestDao {
   static List<Guest> guestList = new ArrayList<>();
    static {
        guestList.add(new Guest("黄晓明","店长"));
        guestList.add(new Guest("秦海璐","财务"));
        guestList.add(new Guest("林大厨","大厨"));
        guestList.add(new Guest("王俊凯","经理"));
        guestList.add(new Guest("杨紫","前台"));
    }
    public List list(){
        return guestList;
    }
    public void add(Guest guest){
        guestList.add(guest);
    }
    public Guest get(String name){
        for (Guest guest : guestList){
            if (guest.getName().equals(name)){
                return guest;
            }
        }
        return new Guest("","");
    }
    public void update(Guest guest) {
        Guest older = this.get(guest.getName());
        older.setName(guest.getName());
        older.setRole(guest.getRole());
    }
    public void  delete(String name){
        Guest guest = this.get(name);
        guestList.remove(guest);
    }

}
