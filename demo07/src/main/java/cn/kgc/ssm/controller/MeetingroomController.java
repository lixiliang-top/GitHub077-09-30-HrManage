package cn.kgc.ssm.controller;

import cn.kgc.ssm.pojo.Meetingroom;
import cn.kgc.ssm.service.MeetingroomService;
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
 * @create 2020-10-03 11:29
 */
@Controller
public class MeetingroomController {

    @Resource
    MeetingroomService meetingroomService;

    @RequestMapping("/")
    public String toIndex(){
        return "/jsp/index";
    }

    @RequestMapping("/doIndex")
    @ResponseBody
    public Map<String,Object> doIndex(){
        Map<String,Object> map = new HashMap<>();
        List<Meetingroom> meetingrooms = meetingroomService.mList();
        map.put("data",meetingrooms);
        return map;
    }

    @RequestMapping("/toIndex2")
    public String toIndex2(){
        return "/jsp/index2";
    }

    @RequestMapping("/doIndex2")
    public String doIndex2(Meetingroom meetingroom, Model model){
        meetingroom.setMeetingOrder(new Date());
        int ins = meetingroomService.ins(meetingroom);
        if (ins>0){
            model.addAttribute("error","预定成功");
            return "/jsp/index";
        }else{
            model.addAttribute("error","预定失败");
            return "redirect:/toIndex2";
        }
    }
}
