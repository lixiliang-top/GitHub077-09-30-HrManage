package cn.kgc.ssm.controller;

import cn.kgc.ssm.pojo.Studentinfo;
import cn.kgc.ssm.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 李锡良
 * @create 2020-10-03 9:05
 */
@Controller
public class StudentController {

    @Resource
    StudentService studentService;

    @RequestMapping("/")
    public String toIndex(){
        return "/jsp/index";
    }

    @RequestMapping("/doIndex")
    @ResponseBody
    public Map<String,Object> doIndex(){
        Map<String,Object> map = new HashMap<>();
        List<Studentinfo> studentinfos = studentService.sList();
        map.put("data",studentinfos);
        return map;
    }

    @RequestMapping("/toupdate")
    public String toupdate(Integer sid, Model model) {
        Studentinfo studentinfo = studentService.selId(sid);
        model.addAttribute("studentinfo", studentinfo);
        return "/jsp/index2";
    }

    @RequestMapping("/doUpdate")
    public String doUpdate(Studentinfo studentinfo,Model model){
        int upd = studentService.upd(studentinfo);
        if (upd>0){
            model.addAttribute("error","修改成功");
            return "/jsp/index";
        }else{
            model.addAttribute("error","修改失败");
            return "redirect:/";
        }
    }



}
