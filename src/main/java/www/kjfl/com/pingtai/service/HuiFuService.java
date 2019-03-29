package www.kjfl.com.pingtai.service;

import com.github.pagehelper.PageInfo;
import www.kjfl.com.pingtai.bean.HuiFu;
import www.kjfl.com.pingtai.bean.HuiFuExample;

/**
 * @author 郭成建
 * @create 2019-01-03  8:11
 */
public interface HuiFuService {
    /**
     * 添加回复
     * @param huiFu
     */
    void insetHuiFu(HuiFu huiFu);

    /**
     * 分页条件查询
     * @param huiFuExample
     * @return
     */
    PageInfo<HuiFu> selectHuIFui(Integer page, Integer rows, HuiFuExample huiFuExample);
}
