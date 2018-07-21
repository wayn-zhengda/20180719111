package cn.mayn.com.mapper;

import cn.mayn.com.model.UserEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserMapper {

    List<UserEntity> findData();
}
