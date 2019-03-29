package www.kjfl.com.pingtai.controller;

import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import www.kjfl.com.pingtai.bean.JingLi;
import www.kjfl.com.pingtai.bean.Useres;
import www.kjfl.com.pingtai.bean.UseresExample;
import www.kjfl.com.pingtai.bean.XueYuan;
import www.kjfl.com.pingtai.service.JingLiService;
import www.kjfl.com.pingtai.service.UseresServie;
import www.kjfl.com.pingtai.service.XueYuanService;
import www.kjfl.com.pingtai.util.Result;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.regex.Pattern;

/**
 * @author 郭成建
 * @create 2018-12-30  20:18
 */
@Controller
@RequestMapping("/kjfl")
public class KJFLcontroller {

    @Resource
    private UseresServie useresServie;
    @Resource
    private JingLiService jingLiService;
    @Resource
    private XueYuanService xueYuanService;

    /**
     * 登入成功时带有参数的返回主页面
     * @return
     */
    @RequestMapping("/login2")
    public String Logins2(HttpServletRequest request,String uid){
        Useres useres = useresServie.selectUseresById(uid);
        //存入request存储域中
        request.setAttribute("useres",useres);
        return "login";
    }

    /**
     * 前往注册页面
     * @param request
     * @return
     */
    @RequestMapping("/zhuce")
    public String ZhuCe(HttpServletRequest request){
        //所有负责教师
        List<JingLi> jingLis = jingLiService.selectJingLi();
        //所有学院
        List<XueYuan> xueYuans = xueYuanService.selectXueYuan();
        //存入request存储域中
        request.setAttribute("jingli",jingLis);
        request.setAttribute("xueYuans",xueYuans);
        //前往注册页面
        return "zhuce";
    }
    /**
     * 前往批量注册页面
     * @param request
     * @return
     */
    @RequestMapping("/piliangzhuce")
    public String PiLiangZhuCe(HttpServletRequest request){
        //所有负责教师
        List<JingLi> jingLis = jingLiService.selectJingLi();
        //所有学院
        List<XueYuan> xueYuans = xueYuanService.selectXueYuan();
        //存入request存储域中
        request.setAttribute("jingli",jingLis);
        request.setAttribute("xueYuans",xueYuans);
        //前往批量注册页面
        return "piliangzhuce";
    }

    /**
     * 注册
     * @param useres
     * @return
     */
    @RequestMapping("/zhuce2")
    @ResponseBody
    public Result ZhuCe2(Useres useres) {
        Result result = new Result();
        //判断是否写的真是姓名
        if (useres.getUname().length()==0){
            result.setSuccess(false);
            result.setMessage(useres.getUid()+" 真实姓名不能为空，所以不能注册");
            return result;
        }

            /**
             * 判断 是不是手机号
             */
        Pattern p = Pattern.compile("^[1](([3][0-9])|([4][5,7,9])|([5][4,6,9])|([6][6])|([7][3,5,6,7,8])|([8][0-9])|([9][8,9]))[0-9]{8}$");
        //System.out.println(useres.getUid());
        //System.out.println(p.matcher(useres.getUid()).matches());
        //返回Boolean
        if (!p.matcher(useres.getUid()).matches()) {
            result.setSuccess(false);
            result.setMessage(useres.getUid()+" 这不是手机号，所以无法注册，请从新输入");
            return result;
        }
        //数据库查询 这个手机号是否已经被注册
        Useres useres1 = useresServie.selectUseresById(useres.getUid());
        //System.out.println(useres1);
        if (useres1!=null){
            result.setSuccess(false);
            result.setMessage(useres.getUid()+" 这个手机号已经注册过了，请换个手机号从新注册");
            return result;
        }
        //判断密码是否是空
        if (useres.getUmima().length()==0){
            result.setSuccess(false);
            result.setMessage(useres.getUid()+" 密码为空,默认识别为123456,如需更改请待审核成功后,前往个人信息页面手动修改");
            useres.setUmima("123456");
        }
        //判断密码是否是6位
        if (useres.getUmima().length()<6||useres.getUmima().length()>12){
            result.setSuccess(false);
            result.setMessage(useres.getUid()+" 密码不够6位，或密码超出12位，所以不能注册");
            return result;
        }
            //快捷键 ctrl+alt+t
            try {
                //学生标示 2
                useres.setUbiaoshi(2);
                //学生无积分  积分0
                useres.setJf(0);
                //审核标示  默认未审核 2
                useres.setShenhe(2);
                //注册
                useresServie.insetUser(useres);
                //返回
                result.setSuccess(true);
                if (result.getMessage()!=null&&!result.getMessage().equals("")){
                    result.setMessage(result.getMessage()+"       注册成功,等待审核");
                    return result;
                }
                result.setMessage(useres.getUid()+" 注册成功,等待审核");
                return result;
            } catch (Exception e) {
                e.printStackTrace();
                //返回
                result.setSuccess(false);
                result.setMessage(useres.getUid()+" 系统内部异常，导致注册失败");
                return result;
            }

    }

    /**
     * 前往登入页面
     * @return
     */
    @RequestMapping("/dengru")
    public String Dengru (HttpServletRequest request,String uid) {
            request.setAttribute("uxjid",uid);
            //前往注册页面
            return "dengru";
    }
    /**
     * 前往登入页面
     * @return
     */
    @RequestMapping("/zhaomima")
    public String ZhaoMiMa (HttpServletRequest request,String uid) {
            request.setAttribute("zid",uid);
            //前往注册页面
            return "zhaomima";
    }

    /**
     * 登入
     * @return
     */
    @RequestMapping("/dengru2")
    @ResponseBody
    public Result Dnegru2(Useres useres) {
        Result result = new Result();
        /**
         * 判断 是不是手机号
         */
        Pattern p = Pattern.compile("^[1](([3][0-9])|([4][5,7,9])|([5][4,6,9])|([6][6])|([7][3,5,6,7,8])|([8][0-9])|([9][8,9]))[0-9]{8}$");
        //System.out.println(useres.getUid());
        //System.out.println(p.matcher(useres.getUid()).matches());
        //返回Boolean
        if (!p.matcher(useres.getUid()).matches()) {
            result.setSuccess(false);
            result.setMessage("这不是手机号，请从新输入");
            return result;
        }

        try {
            //数据库查询 这个手机号是否存在
            Useres useres1 = useresServie.selectUseresById(useres.getUid());
            //System.out.println(useres1);
            if (useres1==null){
                result.setSuccess(false);
                result.setMessage("这个手机号还未注册，请先注册后在登入");
                return result;
            }
            //判断密码是否正确
            /*System.out.println(useres.getUmima());
            System.out.println(useres1.getUmima());
            System.out.println(useres1.getUmima().equals(useres.getUmima()));*/
             if (!useres1.getUmima().equals(useres.getUmima())){
                result.setSuccess(false);
                result.setMessage("手机号密码错误");
                return result;
            } else {
                 //学生是否被审核  1是审核成功  其他都没审核通过或成功
                 if (useres1.getShenhe()==2){
                     result.setSuccess(true);
                     result.setMessage("登入失败，手机号还未被未审核");
                     return result;
                 }
                 if (useres1.getShenhe()==3){
                     result.setSuccess(true);
                     result.setMessage("登入失败，手机号审核失败,您也被拉入黑名单，具体原因，请私下联系带您的项目经理处理此事");
                     return result;
                 }else {
                    //返回
                     result.setSuccess(true);
                     result.setMessage("登入成功");
                     result.setUseres(useres1);
                     return result;
                 }
            }
        } catch (Exception e) {
            e.printStackTrace();
            //返回
            result.setSuccess(false);
            result.setMessage("系统内部异常，导致登入失败");
            return result;
        }
    }

    /**
     * 前往审核页面
     * @return
     */
    @RequestMapping("/shenhe")
    public String ShenHe(HttpServletRequest request, @RequestParam(defaultValue = "1")Integer page,
                         @RequestParam(defaultValue = "3")Integer rows,String mohu,
                         String ujid){//教师手机号
        //创建条件
        UseresExample useresExample = new UseresExample();
        if (mohu!=null&&mohu.length()>0){
            //名字模糊查询
            useresExample.createCriteria().andUnameLike("%"+mohu+"%");
        }
        //返回所有未被审核的学生信息
        PageInfo<Useres> pageInfo = useresServie.selectWeiShenHe(page, rows, useresExample);
        //存入request存储域中
        request.setAttribute("pageInfo",pageInfo);
        request.setAttribute("mohu",mohu);
        request.setAttribute("ujid",ujid);
        return "shenhe";
    }

    /**
     * 审核
     * @param shenhe
     * @param uid
     * @return
     */
    @RequestMapping("/shenhe2")
    @ResponseBody
    public Result Shenhe2(Integer shenhe,String[] uid) {
        Result result = new Result();
        try {
           for (String s:uid){
               //根据主键id查询出此条数据
               Useres useres1 = useresServie.selectUseresById(s);
               useres1.setShenhe(shenhe);
               //进行修改
               useresServie.updateUseres(useres1);
           }
            //返回
            result.setSuccess(true);
            result.setMessage("审核成功");
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            //返回
            result.setSuccess(false);
            result.setMessage("系统内部异常，导致审核失败");
            return result;
        }
    }
    /**
     * 前往个人信息页面
     * @return
     */
    @RequestMapping("/gerenxinxi")
    public String GeRenXinXi(HttpServletRequest request,String uid){
        //此人的个人信息
        Useres useres = useresServie.selectUseresById(uid);
        //存入request存储域中
        request.setAttribute("useres",useres);
        return "gerenxinxi";
    }

    /**
     * 个人信息修改
     * @param useres
     * @return
     */
    @RequestMapping("/gerenxinxi2")
    @ResponseBody
    public Result Shenhe2(Useres useres) {
        Result result = new Result();

        //判断密码是否是6位
        if (useres.getUmima().length()<6){
            result.setSuccess(false);
            result.setMessage("密码不够6位，所以不能修改");
            return result;
        }
        //判断密码是否是6位
        if (useres.getUmima().length()>12){
            result.setSuccess(false);
            result.setMessage("密码最多12位，您输入的已经超出范围，所以不能修改");
            return result;
        }

        try {
            //此人的个人信息
            Useres useres1 = useresServie.selectUseresById(useres.getUid());
            useres1.setUmima(useres.getUmima());
            //进行修改
            useresServie.updateUseres(useres1);
            //返回
            result.setSuccess(true);
            result.setMessage("修改成功，请重新登入");
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            //返回
            result.setSuccess(false);
            result.setMessage("系统内部异常，导致修改失败");
            return result;
        }
    }

    /**
     * 前往教师修改学生个人信息页面
     * @return
     */
    @RequestMapping("/jiaoshixiugaixuesheng")
    public String JiaoShiXiuGaiXueSheng(HttpServletRequest request, @RequestParam(defaultValue = "1")Integer page,
                                        @RequestParam(defaultValue = "3")Integer rows,String mohu,
                                        String ujid){//教师手机号
        //创建条件
        UseresExample useresExample = new UseresExample();
        if (mohu!=null&&mohu.length()>0){
            //名字模糊查询
            useresExample.createCriteria().andUnameLike("%"+mohu+"%");
        }
        PageInfo<Useres> pageInfo = useresServie.selectYiShenHe(page, rows, useresExample);
        //存入request存储域中
        request.setAttribute("pageInfo",pageInfo);
        request.setAttribute("mohu",mohu);
        request.setAttribute("ujid",ujid);
        return "jiaoshixiugaixuesheng";
    }


    /**
     * 学生个人所有信息显示
     * @param request
     * @param uid
     * @return
     */
    @RequestMapping("/jiaoshixiugaixuesheng2")
    public String JiaoShiXiuGaiXueSheng2(HttpServletRequest request,String uid,String ujid){
        //此人的个人信息
        Useres useres = useresServie.selectUseresById(uid);
        //所有负责教师
        List<JingLi> jingLis = jingLiService.selectJingLi();
        //所有学院
        List<XueYuan> xueYuans = xueYuanService.selectXueYuan();
        //存入request存储域中
        request.setAttribute("useres",useres);
        request.setAttribute("jingli",jingLis);
        request.setAttribute("xueYuans",xueYuans);
        request.setAttribute("ujid",ujid);
        return "jiaoshixiugaixuesheng2";
    }
    /**
     * 教师修改学生个人信息
     * @param useres
     * @return
     */
    @RequestMapping("/jiaoshixiugaixuesheng3")
    @ResponseBody
    public Result JiaoShiXiuGaiXueSheng3(Useres useres) {
        Result result = new Result();

        //判断名字是否不为空
        if (useres.getUname()==null&&useres.getUname().equals("")){
            result.setSuccess(false);
            result.setMessage("名字不能为空，所以不能修改");
            return result;
        }

        try {
            //此人的个人信息
            Useres useres1 = useresServie.selectUseresById(useres.getUid());
            //真是姓名
            useres1.setUname(useres.getUname());
            //负责经理
            useres1.setFid(useres.getFid());
            //学院
            useres1.setYid(useres.getYid());
            //进行修改
            useresServie.updateUseres(useres1);
            //返回
            result.setSuccess(true);
            result.setMessage("修改成功");
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            //返回
            result.setSuccess(false);
            result.setMessage("系统内部异常，导致修改失败");
            return result;
        }
    }
}
