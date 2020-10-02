package cn.kgc.ssm.controller;

import cn.kgc.ssm.pojo.Bill_Type;
import cn.kgc.ssm.pojo.Bills;
import cn.kgc.ssm.service.Bill_TypeService;
import cn.kgc.ssm.service.BillsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 李锡良
 * @create 2020-10-02 10:01
 */
@Controller
public class BillsController {

    @Resource
    BillsService billsService;

    @Resource
    Bill_TypeService bill_typeService;

    @RequestMapping("/")
    public String toIndex(){
        return "/jsp/index";
    }

    @RequestMapping("/doIndexXia")
    @ResponseBody
    public Map<String,Object> doIndexXia(){
        Map<String,Object> map = new HashMap<>();
        List<Bill_Type> bill_types = bill_typeService.bList();
        System.out.println(bill_types);
        map.put("data",bill_types);
        return map;
    }

    @RequestMapping("/doIndex")
    @ResponseBody
    public Map<String,Object> doIndex(Integer type_id){
        Map<String,Object> map = new HashMap<>();
        List<Bills> bills = billsService.bList(type_id);
        System.out.println(bills);
        map.put("data",bills);
        return map;
    }

    @RequestMapping("/toIndex2")
    public String toIndex2(){
        return "/jsp/index2";
    }

    @RequestMapping("/doIndex2")
    public String doIndex2(Bills bills, Model model, HttpSession session){
        bills.setBillTime(new Date());
        int ins = billsService.ins(bills);
        if (ins>0){
            model.addAttribute("error","添加成功");
            return "/jsp/index";
        }else{
            model.addAttribute("error","添加失败");
            return "redirect:/toIndex2";
        }
    }

}
