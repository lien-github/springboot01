package com.lien.springboot01.mapperFath;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface MyMapper<T> extends Mapper<T> , MySqlMapper<T> {
}
