package cn.kgc.ssm.service.impl;

import cn.kgc.ssm.mapper.MeetingroomMapper;
import cn.kgc.ssm.pojo.Meetingroom;
import cn.kgc.ssm.pojo.MeetingroomExample;
import cn.kgc.ssm.service.MeetingroomService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 李锡良
 * @create 2020-10-03 11:27
 */
@Transactional
@Service("meetingroomService")
public class MeetingroomServiceImpl implements MeetingroomService {

    @Resource
    MeetingroomMapper meetingroomMapper;

    @Override
    public List<Meetingroom> mList() {
        MeetingroomExample example = new MeetingroomExample();
        MeetingroomExample.Criteria criteria = example.createCriteria();
        List<Meetingroom> meetingrooms = meetingroomMapper.selectByExample(example);
        return meetingrooms;
    }

    @Override
    public int ins(Meetingroom meetingroom) {
        int i = meetingroomMapper.insertSelective(meetingroom);
        return i;
    }
}
