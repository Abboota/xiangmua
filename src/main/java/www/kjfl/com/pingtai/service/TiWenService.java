package www.kjfl.com.pingtai.service;

import com.github.pagehelper.PageInfo;
import www.kjfl.com.pingtai.bean.TiWen;
import www.kjfl.com.pingtai.bean.TiWenExample;

/**
 * @author 郭成建
 * @create 2019-01-02  11:14
 */
public interface TiWenService {
    /**
     * 新增问题
     */
    void insetTiWen(TiWen tiWen);

    /**
     * 分页条件查询
     * @param page
     * @param rows
     * @param tiWenExample
     * @return
     */
    PageInfo<TiWen> selectTiWen(Integer page, Integer rows, TiWenExample tiWenExample);

    /**
     * 主键查询
     * @param tid
     * @return
     */
    TiWen selectTiWenById(Integer tid);

    /**
     * 修改
     * @param tiWen
     */
    void updateTiWen(TiWen tiWen);
}
