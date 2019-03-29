package www.kjfl.com.pingtai.service.impl;

import org.springframework.stereotype.Service;
import www.kjfl.com.pingtai.bean.JingLi;
import www.kjfl.com.pingtai.dao.JingLiMapper;
import www.kjfl.com.pingtai.service.JingLiService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 郭成建
 * @create 2018-12-30  20:48
 */
@Service
public class JingLiServiceImpl implements JingLiService {
    @Resource
    private JingLiMapper jingLiMapper;
    @Override
    public List<JingLi> selectJingLi() {
        return jingLiMapper.selectByExample(null);
    }
}
