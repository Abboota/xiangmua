package www.kjfl.com.pingtai.service.impl;

import org.springframework.stereotype.Service;
import www.kjfl.com.pingtai.bean.XueYuan;
import www.kjfl.com.pingtai.dao.XueYuanMapper;
import www.kjfl.com.pingtai.service.XueYuanService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 郭成建
 * @create 2018-12-31  14:09
 */
@Service
public class XueYuanServiceImpl implements XueYuanService {

    @Resource
    private XueYuanMapper xueYuanMapper;

    @Override
    public List<XueYuan> selectXueYuan() {
        return xueYuanMapper.selectByExample(null);
    }
}
