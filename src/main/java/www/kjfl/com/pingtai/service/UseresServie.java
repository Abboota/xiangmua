package www.kjfl.com.pingtai.service;

import com.github.pagehelper.PageInfo;
import www.kjfl.com.pingtai.bean.Useres;
import www.kjfl.com.pingtai.bean.UseresExample;

import java.util.List;

/**
 * @author 郭成建
 * @create 2018-12-30  20:20
 */
public interface UseresServie {
    /**
     * 注册
     * @param useres
     */
    void insetUser(Useres useres);

    /**
     * 主键查询
     * @param id
     * @return
     */
    Useres selectUseresById(String id);
    /**
     * 返回所有未被审核的名单
     * @return
     */
    PageInfo<Useres> selectWeiShenHe(Integer page, Integer rows, UseresExample useresExample);

    /**
     * 修改
     * @param useres
     */
    void updateUseres(Useres useres);
    /**
     * 返回所有审核通过的学生信息
     * @return
     */
    PageInfo<Useres> selectYiShenHe(Integer page, Integer rows, UseresExample useresExample);

    /**
     * 所有的用户
     * @param useresExample
     * @return
     */
    List<Useres> selectUseresALL(UseresExample useresExample);
}
