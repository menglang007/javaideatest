package com.offcn.controller;

import com.offcn.po.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.*;

@Controller
public class ThymeleafController {

    //模板引擎测试
    @RequestMapping("/goindex")
    public String indexPage(Model model){
        String msg ="Hello Thymeleaf!";
        model.addAttribute("msg",msg);

        User user = new User(1L, "张三", 18);
        model.addAttribute("user",user);

        Map<String,Object> map =new HashMap<>();
        map.put("img1","https://img1.360buyimg.com/pop/s590x470_jfs/t1/26587/26/9798/97535/5c7f6a96E2f5e5d07/464e6792954e8f88.jpg!q90!cc_590x470.webp");
        map.put("img2","https://img1.360buyimg.com/pop/s590x470_jfs/t1/38859/32/3414/55001/5cc50fd4E63bebbe0/4d7e0b7dbd2c7aec.jpg!q90!cc_590x470.webp");

        model.addAttribute("map",map);

        List<User> userList =new ArrayList<>();
        userList.add(new User(1L,"张三",18));
        userList.add(new User(2L,"李四",28));
        userList.add(new User(3L,"王五",38));
        userList.add(new User(4L,"赵六",48));

        model.addAttribute("userList",userList);

        model.addAttribute("username","小红鞠");
        model.addAttribute("href","http://www.ujiuye.com");

        model.addAttribute("flag","yes");
        model.addAttribute("menu","admin");
        model.addAttribute("manager","manager");

        Date date = new Date();
        model.addAttribute("date",date);

        //小数金额
        double price =368.9898D;
        model.addAttribute("price",price);

        //定义大文本
        String str ="中共中央政治局6月24日下午就“牢记初心使命，推进自我革命”举行第十五次集体学习。中共中央总书记习近平在主持学习时强调，我们党作为百年大党，如何永葆先进性和纯洁性、永葆青春活力，如何永远得到人民拥护和支持，如何实现长期执政，是我们必须回答好、解决好的一个根本性问题。我们党要求全党同志不忘初心、牢记使命，就是要提醒全党同志，党的初心和使命是党的性质宗旨、理想信念、奋斗目标的集中体现，越是长期执政，越不能忘记党的初心使命，越不能丧失自我革命精神，在新时代把党的自我革命推向深入，把党建设成为始终走在时代前列、人民衷心拥护、勇于自我革命、经得起各种风浪考验、朝气蓬勃的马克思主义执政党。\n" +
                "\n" +
                "中央党史和文献研究院研究员孙业礼同志就这个问题作了讲解，并谈了意见和建议。\n" +
                "\n" +
                "习近平在主持学习时发表了讲话。他首先表示，再过几天，就是我们党成立98周年了，我代表党中央，向全国广大党员致以节日的祝贺！\n" +
                "\n" +
                "习近平指出，安排这次中央政治局集体学习，目的是总结党的历史经验，结合新时代新要求，推动全党围绕守初心、担使命、找差距、抓落实切实搞好主题教育。这也是中央政治局带头开展主题教育的一项重要安排。中央政治局的同志要作好示范，在不忘初心、牢记使命上为全党作表率。";

        model.addAttribute("str",str);

        //定义字符串
        String str2 ="JAVA-0114";
        model.addAttribute("str2",str2);

        return "index";
    }


}
