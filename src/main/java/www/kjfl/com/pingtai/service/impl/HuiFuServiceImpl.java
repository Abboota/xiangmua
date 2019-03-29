package www.kjfl.com.pingtai.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import www.kjfl.com.pingtai.bean.HuiFu;
import www.kjfl.com.pingtai.bean.HuiFuExample;
import www.kjfl.com.pingtai.dao.HuiFuMapper;
import www.kjfl.com.pingtai.service.HuiFuService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 郭成建
 * @create 2019-01-03  8:12
 */
@Service
public class HuiFuServiceImpl implements HuiFuService {

    @Resource
    private HuiFuMapper huiFuMapper;

    @Override
    public void insetHuiFu(HuiFu huiFu) {
        huiFuMapper.insert(huiFu);
    }

    @Override
    public PageInfo<HuiFu> selectHuIFui(Integer page, Integer rows, HuiFuExample huiFuExample) {
        //第几页 及 每页显示条数
        PageHelper.startPage(page,rows);
        //条件查询
        List<HuiFu> huiFu = huiFuMapper.selectByExample(huiFuExample);
        //分页
        PageInfo<HuiFu> pageInfo = new PageInfo<>(huiFu);
        //有返回相关的数据
        return pageInfo;
    }
}
