package com.lien.springboot01.mapper;

import com.lien.springboot01.entity.Userinfo;
import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;

public interface UserinfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userinfo
     *
     * @mbg.generated Sat Apr 25 21:52:07 CST 2020
     */
    @Insert({
        "insert into userinfo (username, age)",
        "values (#{username,jdbcType=VARCHAR}, #{age,jdbcType=INTEGER})"
    })
    int insert(Userinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userinfo
     *
     * @mbg.generated Sat Apr 25 21:52:07 CST 2020
     */
    @Select({
        "select",
        "username, age",
        "from userinfo",
        "order by age desc,username asc"
    })
    @Results({
        @Result(column="username", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="age", property="age", jdbcType=JdbcType.INTEGER)
    })
    List<Userinfo> selectAll();
}