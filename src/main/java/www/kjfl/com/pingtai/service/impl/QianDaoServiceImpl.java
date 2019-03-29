package www.kjfl.com.pingtai.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import www.kjfl.com.pingtai.bean.QianDao;
import www.kjfl.com.pingtai.bean.QianDaoExample;
import www.kjfl.com.pingtai.dao.QianDaoMapper;
import www.kjfl.com.pingtai.service.QianDaoService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 郭成建
 * @create 2019-01-03  20:22
 */
@Service
public class QianDaoServiceImpl implements QianDaoService {

    @Resource
    private QianDaoMapper qianDaoMapper;

    @Override
    public QianDao selectQianDao(String qid) {
        return qianDaoMapper.selectByPrimaryKey(qid);
    }

    @Override
    public void insetQianDao(QianDao qianDao) {
        qianDaoMapper.insert(qianDao);
    }

    @Override
    public void xiugaiQianDao(QianDao qianDao) {
        qianDaoMapper.updateByPrimaryKey(qianDao);
    }

    @Override
    public PageInfo<QianDao> selectQianDaoAll(Integer page, Integer rows, QianDaoExample qianDaoExample) {
        //第几页 及 每页显示条数
        PageHelper.startPage(page,rows);
        //条件查询
        List<QianDao> qiandao = qianDaoMapper.selectByExample(qianDaoExample);
        //分页
        PageInfo<QianDao> pageInfo = new PageInfo<>(qiandao);
        //有返回相关的数据
        return pageInfo;
    }
}
