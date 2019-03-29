package www.kjfl.com.pingtai.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import www.kjfl.com.pingtai.bean.Useres;
import www.kjfl.com.pingtai.bean.UseresExample;
import www.kjfl.com.pingtai.dao.UseresMapper;
import www.kjfl.com.pingtai.service.UseresServie;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 郭成建
 * @create 2018-12-30  20:29
 */
@Service
public class UseresServieImpl implements UseresServie {

    @Resource
    private UseresMapper useresMapper;


    @Override
    public void insetUser(Useres useres) {
        useresMapper.insert(useres);
    }

    @Override
    public Useres selectUseresById(String id) {
        return useresMapper.selectByPrimaryKey(id);
    }


    @Override
    public PageInfo<Useres> selectWeiShenHe(Integer page, Integer rows, UseresExample useresExample) {
        //第几页 及 每页显示条数
        PageHelper.startPage(page,rows);
        //已被审核的条件
        useresExample.createCriteria().andShenheEqualTo(2);
        //条件查询
        List<Useres> useres = useresMapper.selectByExample(useresExample);
        //分页
        PageInfo<Useres> pageInfo = new PageInfo<>(useres);
        //有返回相关的数据
        return pageInfo;
    }

    @Override
    public void updateUseres(Useres useres) {
        useresMapper.updateByPrimaryKey(useres);
    }

    @Override
    public PageInfo<Useres> selectYiShenHe(Integer page, Integer rows, UseresExample useresExample) {
        //第几页 及 每页显示条数
        PageHelper.startPage(page,rows);
        //已被审核的条件
        useresExample.createCriteria().andShenheEqualTo(1);
        //条件查询
        List<Useres> useres = useresMapper.selectByExample(useresExample);
        //分页
        PageInfo<Useres> pageInfo = new PageInfo<>(useres);
        //有返回相关的数据
        return pageInfo;
    }

    @Override
    public List<Useres> selectUseresALL(UseresExample useresExample) {
        return useresMapper.selectByExample(useresExample);
    }
}
