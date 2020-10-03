package cn.kgc.ssm.service;

import cn.kgc.ssm.pojo.Projectinfo;
import com.github.pagehelper.PageInfo;

/**
 * @author 李锡良
 * @create 2020-10-03 10:09
 */
public interface ProjectService {

    PageInfo<Projectinfo> pList(Integer pageIndex, Integer pageSize,Integer status);

    Projectinfo selId(Integer id);

    int upd(Projectinfo projectinfo);

}
