package com.lien.springboot01.controller;

import com.lien.springboot01.bean.PersonBean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@Controller
public class IndexController {
    @GetMapping(value = "/index")
    public String index(Model model){
        PersonBean personBean = new PersonBean();
        personBean.setAge(33);
        personBean.setName("小明");

        ArrayList<PersonBean> list = new ArrayList<>();
        PersonBean bean1 = new PersonBean();
        bean1.setName("小花");
        bean1.setAge(32);

        PersonBean bean2 = new PersonBean();
        bean2.setAge(21);
        bean2.setName("小李");

        list.add(bean1);
        list.add(bean2);

        model.addAttribute("persion" , personBean);
        model.addAttribute("persionList" , list);

        return "index";
    }

}
