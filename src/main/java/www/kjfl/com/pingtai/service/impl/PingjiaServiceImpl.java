package www.kjfl.com.pingtai.service.impl;

import org.springframework.stereotype.Service;
import www.kjfl.com.pingtai.bean.PingJia;
import www.kjfl.com.pingtai.dao.PingJiaMapper;
import www.kjfl.com.pingtai.service.PingjiaService;

import javax.annotation.Resource;

/**
 * @author 郭成建
 * @create 2019-01-03  18:56
 */
@Service
public class PingjiaServiceImpl implements PingjiaService {

    @Resource
    private PingJiaMapper pingJiaMapper;

    @Override
    public void insertPingJia(PingJia pingJia) {
        pingJiaMapper.insert(pingJia);
    }
}
