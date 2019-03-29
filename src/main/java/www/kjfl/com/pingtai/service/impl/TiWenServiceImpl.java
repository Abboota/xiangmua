package www.kjfl.com.pingtai.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import www.kjfl.com.pingtai.bean.TiWen;
import www.kjfl.com.pingtai.bean.TiWenExample;
import www.kjfl.com.pingtai.dao.TiWenMapper;
import www.kjfl.com.pingtai.service.TiWenService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 郭成建
 * @create 2019-01-02  11:16
 */
@Service
public class TiWenServiceImpl implements TiWenService {
    @Resource
    private TiWenMapper tiWenMapper;

    @Override
    public void insetTiWen(TiWen tiWen) {
        tiWenMapper.insert(tiWen);
    }

    @Override
    public PageInfo<TiWen> selectTiWen(Integer page, Integer rows, TiWenExample tiWenExample) {
        //第几页 及 每页显示条数
        PageHelper.startPage(page,rows);
        //条件查询
        List<TiWen> tiWens = tiWenMapper.selectByExample(tiWenExample);
        //分页
        PageInfo<TiWen> pageInfo = new PageInfo<>(tiWens);
        //有返回相关的数据
        return pageInfo;
    }

    @Override
    public TiWen selectTiWenById(Integer tid) {
        return tiWenMapper.selectByPrimaryKey(tid);
    }

    @Override
    public void updateTiWen(TiWen tiWen) {
        tiWenMapper.updateByPrimaryKey(tiWen);
    }
}
