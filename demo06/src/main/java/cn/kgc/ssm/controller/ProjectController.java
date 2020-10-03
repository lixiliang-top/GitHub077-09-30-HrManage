package cn.kgc.ssm.controller;

import cn.kgc.ssm.pojo.Projectinfo;
import cn.kgc.ssm.service.ProjectService;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 李锡良
 * @create 2020-10-03 10:17
 */
@Controller
public class ProjectController {

    @Resource
    ProjectService projectService;

    @RequestMapping("/")
    public String toIndex(){
        return "/jsp/index";
    }

    @RequestMapping("/doIndex")
    @ResponseBody
    public Map<String,Object> doIndex(Integer pageIndex, Integer pageSize,Integer status){
        Map<String,Object> map = new HashMap<>();
        PageInfo<Projectinfo> pageInfo = projectService.pList(pageIndex, pageSize, status);
        map.put("data",pageInfo);
        return map;
    }

    @RequestMapping("/chuan")
    public String toIndex2(Integer id, Model model){
        Projectinfo projectinfo = projectService.selId(id);
        model.addAttribute("projectinfo",projectinfo);
        return "/jsp/index2";
    }

    @RequestMapping("/doIndex2")
    public String doIndex2(Projectinfo projectinfo,Model model){
        int upd = projectService.upd(projectinfo);
        if (upd>0){
            model.addAttribute("error","修改成功");
            return "/jsp/index";
        }else{
            model.addAttribute("error","修改失败");
            return "redirect:/";
        }
    }
}
