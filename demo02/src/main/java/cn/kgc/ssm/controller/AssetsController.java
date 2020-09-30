package cn.kgc.ssm.controller;

import cn.kgc.ssm.pojo.Assets;
import cn.kgc.ssm.service.AssetsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 李锡良
 * @create 2020-09-30 15:16
 */
@Controller
public class AssetsController {

    @Resource
    AssetsService assetsService;

    @RequestMapping("/")
    public String toIndex(){
        return "/jsp/index";
    }

    @RequestMapping("/doIndex")
    @ResponseBody
    public Map<String,Object> doIndex(String assetsid,String assetstype){
        Map<String,Object> map = new HashMap<>();
        List<Assets> assets = assetsService.aList(assetsid, assetstype);
        map.put("data",assets);
        return map;
    }

    @RequestMapping("/toIndex2")
    public String toIndex2(){
        return "/jsp/index2";
    }

    @RequestMapping("/doIndex2")
    public String doIndex2(Assets assets, Model model){
        assets.setIntodate(new Date());
        int ins = assetsService.ins(assets);
        if (ins>0){
            model.addAttribute("error","添加成功");
            return "/jsp/index";
        }else{
            model.addAttribute("error","添加失败");
            return "redirect:/toIndex2";
        }
    }

}
