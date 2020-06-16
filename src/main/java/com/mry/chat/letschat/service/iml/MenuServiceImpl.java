package com.mry.chat.letschat.service.iml;

import com.google.common.collect.Lists;
import com.mry.chat.letschat.service.MenuService;
import com.mry.chat.letschat.system.pojo.Menu;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class MenuServiceImpl implements MenuService {


    @Override
    public List<Menu> findUserPermessionMenu(String userName) {
        Menu menu = new Menu();
        menu.setPerms("10001");
        List<Menu> list = Lists.newArrayList();
        list.add(menu);
        return list;
    }
}
