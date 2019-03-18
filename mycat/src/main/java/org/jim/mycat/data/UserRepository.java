package org.jim.mycat.data;

import org.jim.mycat.dal.dao.TUserMapper;
import org.jim.mycat.dal.dataobject.TUser;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component
public class UserRepository {

    @Resource
    private TUserMapper userMapper;

    public TUser getById(int id) {
        return userMapper.selectByPrimaryKey(id);
    }

    public List<TUser> listAll() {
        return userMapper.selectByExample(null);
    }

}
