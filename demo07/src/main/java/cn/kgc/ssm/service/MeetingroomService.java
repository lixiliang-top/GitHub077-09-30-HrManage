package cn.kgc.ssm.service;

import cn.kgc.ssm.pojo.Meetingroom;

import java.util.List;

/**
 * @author 李锡良
 * @create 2020-10-03 11:27
 */
public interface MeetingroomService {

    List<Meetingroom> mList();

    int ins(Meetingroom meetingroom);

}
