package cn.kgc.ssm.service.impl;

import cn.kgc.ssm.mapper.AssetsMapper;
import cn.kgc.ssm.pojo.Assets;
import cn.kgc.ssm.pojo.AssetsExample;
import cn.kgc.ssm.service.AssetsService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 李锡良
 * @create 2020-09-30 15:11
 */
@Transactional
@Service("assetsService")
public class AssetsServiceImpl implements AssetsService {

    @Resource
    AssetsMapper assetsMapper;

    @Override
    public List<Assets> aList(String assetsid, String assetstype) {
        AssetsExample example = new AssetsExample();
        AssetsExample.Criteria criteria = example.createCriteria();

        if (assetsid!=null&&assetsid.length()!=0){
            criteria.andAssetsidLike("%"+assetsid+"%");
        }
        if (!assetstype.equals("请选择类型")){
            criteria.andAssetstypeEqualTo(assetstype);
        }
        List<Assets> assets = assetsMapper.selectByExample(example);
        return assets;
    }

    @Override
    public int ins(Assets assets) {
        int i = assetsMapper.insertSelective(assets);
        return i;
    }
}
