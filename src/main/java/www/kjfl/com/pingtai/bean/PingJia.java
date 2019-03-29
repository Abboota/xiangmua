package www.kjfl.com.pingtai.bean;

import java.io.Serializable;
import java.util.Date;

public class PingJia implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pingjia.pid
     *
     * @mbg.generated Thu Jan 03 19:34:18 CST 2019
     */
    private Integer pid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pingjia.phid
     *
     * @mbg.generated Thu Jan 03 19:34:18 CST 2019
     */
    private Integer phid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pingjia.pxuid
     *
     * @mbg.generated Thu Jan 03 19:34:18 CST 2019
     */
    private String pxuid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pingjia.pjuid
     *
     * @mbg.generated Thu Jan 03 19:34:18 CST 2019
     */
    private String pjuid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pingjia.pneirong
     *
     * @mbg.generated Thu Jan 03 19:34:18 CST 2019
     */
    private String pneirong;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pingjia.ptime
     *
     * @mbg.generated Thu Jan 03 19:34:18 CST 2019
     */
    private Date ptime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table pingjia
     *
     * @mbg.generated Thu Jan 03 19:34:18 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pingjia.pid
     *
     * @return the value of pingjia.pid
     *
     * @mbg.generated Thu Jan 03 19:34:18 CST 2019
     */
    public Integer getPid() {
        return pid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pingjia.pid
     *
     * @param pid the value for pingjia.pid
     *
     * @mbg.generated Thu Jan 03 19:34:18 CST 2019
     */
    public void setPid(Integer pid) {
        this.pid = pid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pingjia.phid
     *
     * @return the value of pingjia.phid
     *
     * @mbg.generated Thu Jan 03 19:34:18 CST 2019
     */
    public Integer getPhid() {
        return phid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pingjia.phid
     *
     * @param phid the value for pingjia.phid
     *
     * @mbg.generated Thu Jan 03 19:34:18 CST 2019
     */
    public void setPhid(Integer phid) {
        this.phid = phid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pingjia.pxuid
     *
     * @return the value of pingjia.pxuid
     *
     * @mbg.generated Thu Jan 03 19:34:18 CST 2019
     */
    public String getPxuid() {
        return pxuid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pingjia.pxuid
     *
     * @param pxuid the value for pingjia.pxuid
     *
     * @mbg.generated Thu Jan 03 19:34:18 CST 2019
     */
    public void setPxuid(String pxuid) {
        this.pxuid = pxuid == null ? null : pxuid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pingjia.pjuid
     *
     * @return the value of pingjia.pjuid
     *
     * @mbg.generated Thu Jan 03 19:34:18 CST 2019
     */
    public String getPjuid() {
        return pjuid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pingjia.pjuid
     *
     * @param pjuid the value for pingjia.pjuid
     *
     * @mbg.generated Thu Jan 03 19:34:18 CST 2019
     */
    public void setPjuid(String pjuid) {
        this.pjuid = pjuid == null ? null : pjuid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pingjia.pneirong
     *
     * @return the value of pingjia.pneirong
     *
     * @mbg.generated Thu Jan 03 19:34:18 CST 2019
     */
    public String getPneirong() {
        return pneirong;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pingjia.pneirong
     *
     * @param pneirong the value for pingjia.pneirong
     *
     * @mbg.generated Thu Jan 03 19:34:18 CST 2019
     */
    public void setPneirong(String pneirong) {
        this.pneirong = pneirong == null ? null : pneirong.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pingjia.ptime
     *
     * @return the value of pingjia.ptime
     *
     * @mbg.generated Thu Jan 03 19:34:18 CST 2019
     */
    public Date getPtime() {
        return ptime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pingjia.ptime
     *
     * @param ptime the value for pingjia.ptime
     *
     * @mbg.generated Thu Jan 03 19:34:18 CST 2019
     */
    public void setPtime(Date ptime) {
        this.ptime = ptime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pingjia
     *
     * @mbg.generated Thu Jan 03 19:34:18 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", pid=").append(pid);
        sb.append(", phid=").append(phid);
        sb.append(", pxuid=").append(pxuid);
        sb.append(", pjuid=").append(pjuid);
        sb.append(", pneirong=").append(pneirong);
        sb.append(", ptime=").append(ptime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}