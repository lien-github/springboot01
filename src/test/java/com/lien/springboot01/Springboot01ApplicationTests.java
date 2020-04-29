package com.lien.springboot01;

import com.lien.springboot01.entity.Userinfo;
import com.lien.springboot01.mapper.UserinfoMapper;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Springboot01Application.class , webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)


public class Springboot01ApplicationTests {
    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate testRestTemplate;

    private  URL url;

    @Autowired
    private UserinfoMapper userinfoMapper;


    /**
     * 测试插入数据
     */
    @Test
    public void testInsert() {
        Userinfo userinfo = new Userinfo();
        userinfo.setAge(33);
        userinfo.setUsername("xiaoming");

        tbUser.insert(userinfo);
    }
    @Test
    public void testSelect(){
        List<Userinfo> userinfos = tbUser.selectAll();
        for (int i = 0; i < userinfos.size(); i++) {
            System.out.println(userinfos.get(i).getAge());
            System.out.println(userinfos.get(i).getUsername());
        }
    }

    @Test
    public void contextLoads() {
//        这里执行单元测试的方法，会自动的装载springboot应用
        ResponseEntity<String> forEntity = testRestTemplate.getForEntity(url.toString(), String.class);
        Assert.assertThat(forEntity.getBody() , CoreMatchers.equalTo("hello"));
    }

    @Before
    public void setup() throws MalformedURLException {
         url = new URL("http://localhost:" + port + "/hi");

    }


}
