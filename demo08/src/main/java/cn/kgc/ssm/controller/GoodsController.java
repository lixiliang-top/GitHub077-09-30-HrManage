package cn.kgc.ssm.controller;

import cn.kgc.ssm.pojo.Goods;
import cn.kgc.ssm.service.GoodsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 李锡良
 * @create 2020-10-03 16:12
 */
@Controller
public class GoodsController {

    @Resource
    GoodsService goodsService;

    @RequestMapping("/")
    public String toIndex(){
        return "/jsp/index";
    }

    @RequestMapping("/doIndex")
    public String doIndex(Integer goodsdistrict, Model model){
        List<Goods> goods = goodsService.gList(goodsdistrict);
        System.out.println(goods);
        model.addAttribute("goods",goods);
        return "/jsp/index2";
    }

    @RequestMapping("/chuan")
    public String chuan(Integer id,Model model){
        Goods sel = goodsService.sel(id);
        model.addAttribute("sel",sel);
        return "/jsp/index3";
    }

    @RequestMapping("/doIndex3")
    public String doIndex3(Goods goods,Model model){
        int upd = goodsService.upd(goods);
        if (upd>0){
            model.addAttribute("error","修改成功");
            return "redirect:/";
        }else{
            model.addAttribute("error","修改失败");
            return "redirect:/chuan";
        }
    }

}
