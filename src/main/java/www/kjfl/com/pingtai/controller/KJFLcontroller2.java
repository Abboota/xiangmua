package www.kjfl.com.pingtai.controller;

import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import www.kjfl.com.pingtai.bean.*;
import www.kjfl.com.pingtai.service.*;
import www.kjfl.com.pingtai.util.Result;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * @author 郭成建
 * @create 2019-01-01  20:08
 */
@Controller
@RequestMapping("kjfl")
public class KJFLcontroller2 {
    @Resource
    private TiWenService tiWenService;
    @Resource
    private UseresServie useresServie;
    @Resource
    private HuiFuService huiFuService;
    @Resource
    private PingjiaService pingjiaService;
    @Resource
    private QianDaoService QianDaoService;
    /**
     * 前往提问页面
     * @param request
     * @return
     */
    @RequestMapping("tiwenti")
    public String TiWenTi(HttpServletRequest request, String uid){
        request.setAttribute("uid",uid);
        return "tiwenti";
    }

    @RequestMapping("tiwenti2")
    @ResponseBody
    public Result tiwenti2(TiWen tiWen){
        Result result = new Result();
        //默认未解决 2
        tiWen.setTjiejue(2);
        try {
            if (tiWen.getTbiaoti()==null){
                //返回
                result.setSuccess(false);
                result.setMessage("提交失败，标题不能为空");
                return result;
            }
            if (tiWen.getTneirong().length()>40||tiWen.getTneirong().length()<6){
                //返回
                result.setSuccess(false);
                result.setMessage("提交失败，内容不能少于6个字及不能超过40字");
                return result;
            }
            if (tiWen.getTbiaoti().length()>15||tiWen.getTneirong().length()<2){
                //返回
                result.setSuccess(false);
                result.setMessage("提交失败，内容不能少于2个字及不能超过15字");
                return result;
            }
            //提问时间
            tiWen.setTtime(new Date());
            tiWenService.insetTiWen(tiWen);
            //返回
            result.setSuccess(true);
            result.setMessage("提交成功");
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            //返回
            result.setSuccess(false);
            result.setMessage("系统内部异常，导致提交失败");
            return result;
        }
    }

    /**
     * 历史问题页面
     * @param request
     * @param page
     * @param rows
     * @param mohu
     * @param uid
     * @param tjiejue
     * @param sort
     * @return
     */
    @RequestMapping("lishiwenti")
    public String LiShiWenTi(HttpServletRequest request, @RequestParam(defaultValue = "1")Integer page,
                             @RequestParam(defaultValue = "2")Integer rows,String mohu,String uid,
                             Integer tjiejue,Integer sort){

        //根据手机号查询  看是谁在访问历史页面
        Useres useres = useresServie.selectUseresById(uid);

        //创建条件查询对象
        TiWenExample tiWenExample = new TiWenExample();
        if (sort!=null&&sort!=0){
            System.out.println(sort);
            if (sort==1){
                tiWenExample.setOrderByClause("tdengji asc");
            }
            if (sort==2){
                tiWenExample.setOrderByClause("tdengji desc");
            }
        }
        TiWenExample.Criteria criteria = tiWenExample.createCriteria();
        if (tjiejue!=null){
            criteria.andTjiejueEqualTo(tjiejue);
        }
        if (mohu!=null&&mohu.length()>0){
            criteria.andTbiaotiLike("%"+mohu+"%").andTneirongLike("%"+mohu+"%");
        }
        //查询历史问题
        PageInfo<TiWen> pageInfo = tiWenService.selectTiWen(page,rows,tiWenExample);
        request.setAttribute("useres",useres);
        request.setAttribute("pageInfo",pageInfo);
        request.setAttribute("mohu",mohu);
        request.setAttribute("sort",sort);
        return "lishiwenti";
    }

    /**
     * 前往回复页面
     * @param request
     * @param uid
     * @param tid
     * @param uname
     * @return
     */
    @RequestMapping("huifu")
    public String HuiFu(HttpServletRequest request, String uid,Integer tid,String uname,Integer hbiaoshi){
        TiWen tiWen = tiWenService.selectTiWenById(tid);
        request.setAttribute("tiWen",tiWen);
        request.setAttribute("uid",uid);
        request.setAttribute("uname",uname);
        request.setAttribute("hbiaoshi",hbiaoshi);
        return "huifu";
    }

    /**
     * 回复操作
     * @param huiFu
     * @return
     */
    @RequestMapping("huifu2")
    @ResponseBody
    public Result HuiFu2(HuiFu huiFu){
        Result result = new Result();
        try {
            if (huiFu.getHneirong().length()>50||huiFu.getHneirong().length()<6){
                //返回
                result.setSuccess(false);
                result.setMessage("回复失败，内容不能少于6个字及不能超过50字");
                return result;
            }
            //回复时间
            huiFu.setHtime(new Date());
            huiFuService.insetHuiFu(huiFu);
            //返回
            result.setSuccess(true);
            result.setMessage("回复成功");
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            //返回
            result.setSuccess(false);
            result.setMessage("系统内部异常，导致回复失败");
            return result;
        }
    }

    /**
     * 前往所有回复页面
     * @param request
     * @param page
     * @param rows
     * @param uid
     * @param htid
     * @param hbiaoshi
     * @return
     */
    @RequestMapping("suoyouhuifu")
    public String SuoYouHuiFu(HttpServletRequest request,@RequestParam(defaultValue = "1")Integer page,
                              @RequestParam(defaultValue = "3")Integer rows,
                              String uid, Integer htid,Integer hbiaoshi){
        //创建条件
        HuiFuExample huiFuExample = new HuiFuExample();
        HuiFuExample.Criteria criteria = huiFuExample.createCriteria();
        if (htid!=null){
            criteria.andHtidEqualTo(htid);
        }
        if (hbiaoshi!=null){
            criteria.andHbiaoshiEqualTo(hbiaoshi);
        }

        PageInfo<HuiFu> pageInfo = huiFuService.selectHuIFui(page, rows, huiFuExample);

        request.setAttribute("pageInfo",pageInfo);
        request.setAttribute("uid",uid);
        request.setAttribute("htid",htid);
        request.setAttribute("hbiaoshi",hbiaoshi);
        return "suoyouhuifu";
    }

    /**
     * 学生自己的问题查询
     * @param request
     * @param page
     * @param rows
     * @param mohu
     * @param uid
     * @param tjiejue
     * @param sort
     * @return
     */
    @RequestMapping("zijiwenti")
    public String ZiJiWenTi(HttpServletRequest request, @RequestParam(defaultValue = "1")Integer page,
                             @RequestParam(defaultValue = "2")Integer rows,String mohu,String uid,
                             Integer tjiejue,Integer sort){

        //根据手机号查询  看是谁在访问历史页面
        Useres useres = useresServie.selectUseresById(uid);

        //创建条件查询对象
        TiWenExample tiWenExample = new TiWenExample();
        if (sort!=null&&sort!=0){
            System.out.println(sort);
            if (sort==1){
                tiWenExample.setOrderByClause("tdengji asc");
            }
            if (sort==2){
                tiWenExample.setOrderByClause("tdengji desc");
            }
        }
        TiWenExample.Criteria criteria = tiWenExample.createCriteria();
        if (tjiejue!=null){
            criteria.andTjiejueEqualTo(tjiejue);
        }
        if (mohu!=null&&mohu.length()>0){
            criteria.andTbiaotiLike("%"+mohu+"%").andTneirongLike("%"+mohu+"%");
        }
        if (uid!=null){
            criteria.andTuidEqualTo(uid);
        }
        //查询历史问题
        PageInfo<TiWen> pageInfo = tiWenService.selectTiWen(page,rows,tiWenExample);
        request.setAttribute("useres",useres);
        request.setAttribute("pageInfo",pageInfo);
        request.setAttribute("mohu",mohu);
        request.setAttribute("sort",sort);
        return "zijiwenti";
    }

    @RequestMapping("paihang")
    public String PaiHang(HttpServletRequest request, @RequestParam(defaultValue = "1")Integer page,
                          @RequestParam(defaultValue = "2")Integer rows,String mohu,String uid,Integer sort){
        //根据手机号查询  看是谁在访问排行榜页面
        Useres useres = useresServie.selectUseresById(uid);
        //查询所有教师的积分排行
        //创建条件
        UseresExample useresExample = new UseresExample();
        if (sort!=null&&sort!=0){
            System.out.println(sort);
            if (sort==1){
                useresExample.setOrderByClause("jf asc");
            }
            if (sort==2){
                useresExample.setOrderByClause("jf desc");
            }
        }else {
            useresExample.setOrderByClause("jf desc");
            sort=2;
        }
        UseresExample.Criteria criteria = useresExample.createCriteria();
        if (mohu!=null&&mohu.length()>0){
            criteria.andUnameLike("%"+mohu+"%");
        }
        criteria.andUbiaoshiEqualTo(1);
        PageInfo<Useres> pageInfo = useresServie.selectWeiShenHe(page, rows, useresExample);
        request.setAttribute("useres",useres);
        request.setAttribute("pageInfo",pageInfo);
        request.setAttribute("mohu",mohu);
        request.setAttribute("sort",sort);
        return "paihang";
    }

    /**
     * 确定解决操作
     * @param tid
     * @return
     */
    @RequestMapping("queding")
    @ResponseBody
        public Result QueDing(Integer tid){
        Result result = new Result();
        try {
            TiWen tiWen = tiWenService.selectTiWenById(tid);
            //修改 1  解决
            tiWen.setTjiejue(1);
            tiWenService.updateTiWen(tiWen);
            //返回
            result.setSuccess(true);
            result.setMessage("确定解决成功");
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            //返回
            result.setSuccess(false);
            result.setMessage("系统内部异常，导致确定解决失败");
            return result;
        }
    }

    /**
     * 前往评价页面
     * @param request
     * @return
     */
    @RequestMapping("pingjia")
    public String PingJia(HttpServletRequest request, Integer phid,String pxuid,String pjuid){
        request.setAttribute("phid",phid);
        request.setAttribute("pxuid",pxuid);
        request.setAttribute("pjuid",pjuid);
        return "pingjia";
    }

    /**
     * 学生给教师评价
     * @param pingJia
     * @param jf
     * @return
     */
    @RequestMapping("/pingjia2")
    @ResponseBody
    public Result PingJia2(PingJia pingJia,Integer jf) {
        Result result = new Result();

        //判断名字是否不为空
        if (pingJia.getPneirong().length()<0&&pingJia.getPneirong().length()>50){
            result.setSuccess(false);
            result.setMessage("内容至少6个字，最多50字");
            return result;
        }

        try {
            if (jf!=null){
                //根据手机号查询
                Useres useres = useresServie.selectUseresById(pingJia.getPjuid());
                useres.setJf(useres.getJf()+jf);
                //修改此教师的积分
                useresServie.updateUseres(useres);
            }
            //评价时间
            pingJia.setPtime(new Date());
            pingjiaService.insertPingJia(pingJia);
            //返回
            result.setSuccess(true);
            result.setMessage("评价成功");
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            //返回
            result.setSuccess(false);
            result.setMessage("系统内部异常，导致评价失败");
            return result;
        }
    }

    /**
     * 签到
     * @param qid
     * @return
     */
    @RequestMapping("qiandao")
    @ResponseBody
    public Result QianDao(String qid) {
        Result result = new Result();
        //根据手机号查询
        QianDao qianDao = QianDaoService.selectQianDao(qid);
        try {
            QianDao qianDao1 = new QianDao();
            if (qianDao==null){
                qianDao1.setQid(qid);
                qianDao1.setQtime(new Date());
                qianDao1.setQwcs(0);
                qianDao1.setQjintian(0);
                //签到表中没有他 添加进去
                QianDaoService.insetQianDao(qianDao1);
            }else {
                qianDao1.setQid(qid);
                qianDao1.setQtime(new Date());
                qianDao1.setQwcs(qianDao.getQwcs());
                qianDao1.setQjintian(0);
                //签到表中没有他 添加进去
                QianDaoService.xiugaiQianDao(qianDao1);
            }
            //返回
            result.setSuccess(true);
            result.setMessage("签到成功");
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            //返回
            result.setSuccess(false);
            result.setMessage("系统内部异常，导致签到失败");
            return result;
        }
    }

    /**
     * 前往签到异常页面
     * @param request
     * @return
     */
    @RequestMapping("qiandao2")
    public String QianDao2(HttpServletRequest request, String puid,@RequestParam(defaultValue = "1") Integer page,
                           @RequestParam(defaultValue = "5")Integer rows,String mohu){
        //创建查询 已经被审核 的对象
        QianDaoExample qianDaoExample = new QianDaoExample();
        QianDaoExample.Criteria criteria = qianDaoExample.createCriteria();
        //未被审核的对象不在其中
        criteria.andShenNotEqualTo(2);
        if (mohu!=null&&mohu.length()>0){
            criteria.andUnameLike("%"+mohu+"%");
        }


        PageInfo<QianDao> pageInfo = QianDaoService.selectQianDaoAll(page, rows, qianDaoExample);

        request.setAttribute("pageInfo",pageInfo);
        request.setAttribute("puid",puid);
        request.setAttribute("mohu",mohu);
        return "qiandao";
    }


    /**
     * 登记未签到人
     * @param uid
     * @return
     */
    @RequestMapping("weiqiandao")
    @ResponseBody
    public Result WeiQianDao(String uid) {
        Result result = new Result();
        try {
            //查看原来他有没有未曾签到的记录
            QianDao qianDao = QianDaoService.selectQianDao(uid);
            QianDao qianDao1 = new QianDao();
            if (qianDao==null){
                qianDao1.setQid(uid);
                qianDao1.setQtime(new Date());
                //以前的未签到次数加 1
                qianDao1.setQwcs(1);
                qianDao1.setQjintian(1);
                //签到表中没有他 添加进去
                QianDaoService.insetQianDao(qianDao1);
            }else {
                qianDao1.setQid(uid);
                qianDao1.setQtime(new Date());
                //以前的未签到次数加 1
                qianDao1.setQwcs(qianDao.getQwcs()+1);
                qianDao1.setQjintian(1);
                //签到表中没有他 添加进去
                QianDaoService.xiugaiQianDao(qianDao1);
            }

            //返回
            result.setSuccess(true);
            result.setMessage("登记此学生未签到成功");
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            //返回
            result.setSuccess(false);
            result.setMessage("系统内部异常，导致登记此学生未签到失败");
            return result;
        }
    }
}
