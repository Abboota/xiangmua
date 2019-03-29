package www.kjfl.com.pingtai.service;

import com.github.pagehelper.PageInfo;
import www.kjfl.com.pingtai.bean.QianDao;
import www.kjfl.com.pingtai.bean.QianDaoExample;

/**
 * @author 郭成建
 * @create 2019-01-03  20:07
 */
public interface QianDaoService {

    /**
     * 手机号查询
     * @param qid
     * @return
     */
    QianDao selectQianDao(String qid);

    /**
     * 添加
     * @param qianDao
     */
    void insetQianDao(QianDao qianDao);
    /**
     * 修改
     * @param qianDao
     */
    void xiugaiQianDao(QianDao qianDao);

    /**
     * 分页
     * @param qianDaoExample
     * @return
     */
    PageInfo<QianDao> selectQianDaoAll(Integer page, Integer rows, QianDaoExample qianDaoExample);

}
