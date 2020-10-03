package cn.kgc.ssm.service.impl;

import cn.kgc.ssm.mapper.ProjectinfoMapper;
import cn.kgc.ssm.pojo.Projectinfo;
import cn.kgc.ssm.pojo.ProjectinfoExample;
import cn.kgc.ssm.service.ProjectService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 李锡良
 * @create 2020-10-03 10:12
 */
@Transactional
@Service("projectService")
public class ProjectServiceImpl implements ProjectService {

    @Resource
    ProjectinfoMapper projectinfoMapper;

    @Override
    public PageInfo<Projectinfo> pList(Integer pageIndex, Integer pageSize, Integer status) {
        ProjectinfoExample example = new ProjectinfoExample();
        ProjectinfoExample.Criteria criteria = example.createCriteria();
        if (status!=01){
            criteria.andStatusEqualTo(status);
        }
        PageHelper.startPage(pageIndex,pageSize);
        PageHelper.orderBy("id desc");
        List<Projectinfo> projectinfos = projectinfoMapper.selectByExample(example);
        PageInfo<Projectinfo> pageInfo = new PageInfo<>(projectinfos);
        return pageInfo;
    }

    @Override
    public Projectinfo selId(Integer id) {
        Projectinfo projectinfo = projectinfoMapper.selectByPrimaryKey(id);
        return projectinfo;
    }

    @Override
    public int upd(Projectinfo projectinfo) {
        int i = projectinfoMapper.updateByPrimaryKeySelective(projectinfo);
        return i;
    }
}
