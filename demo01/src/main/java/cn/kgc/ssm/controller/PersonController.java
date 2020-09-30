package cn.kgc.ssm.controller;

import cn.kgc.ssm.pojo.Person;
import cn.kgc.ssm.service.PersonService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 李锡良
 * @create 2020-09-30 14:23
 */
@Controller
public class PersonController {

    @Resource
    PersonService personService;

    @RequestMapping("/")
    public String toIndex(){
        return "/jsp/index";
    }

    @RequestMapping("/doIndex")
    @ResponseBody
    public Map<String,Object> doIndex(){
        Map<String,Object> map = new HashMap<>();
        List<Person> people = personService.pList();
        map.put("data",people);
        return map;
    }

    @RequestMapping("/toIndex2")
    public String toIndex2(){
        return "/jsp/index2";
    }

    @RequestMapping("/doIndex2")
    public String doIndex2(Person person, Model model){
        int ins = personService.ins(person);
        if (ins>0){
            model.addAttribute("error","添加成功");
            return "/jsp/index";
        }else{
            model.addAttribute("error","添加失败");
            return "/jsp/index2";
        }
    }

    @RequestMapping("/doDel")
    @ResponseBody
    public Map<String,Object> doDel(Integer id){
        Map<String,Object> map = new HashMap<>();
        int del = personService.del(id);
        map.put("data",del);
        return map;
    }

}
