package www.kjfl.com.pingtai.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import www.kjfl.com.pingtai.bean.HuiFu;
import www.kjfl.com.pingtai.bean.HuiFuExample;

@Mapper
public interface HuiFuMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table huifu
     *
     * @mbg.generated Thu Jan 03 19:34:18 CST 2019
     */
    long countByExample(HuiFuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table huifu
     *
     * @mbg.generated Thu Jan 03 19:34:18 CST 2019
     */
    int deleteByExample(HuiFuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table huifu
     *
     * @mbg.generated Thu Jan 03 19:34:18 CST 2019
     */
    int deleteByPrimaryKey(Integer hid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table huifu
     *
     * @mbg.generated Thu Jan 03 19:34:18 CST 2019
     */
    int insert(HuiFu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table huifu
     *
     * @mbg.generated Thu Jan 03 19:34:18 CST 2019
     */
    int insertSelective(HuiFu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table huifu
     *
     * @mbg.generated Thu Jan 03 19:34:18 CST 2019
     */
    List<HuiFu> selectByExample(HuiFuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table huifu
     *
     * @mbg.generated Thu Jan 03 19:34:18 CST 2019
     */
    HuiFu selectByPrimaryKey(Integer hid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table huifu
     *
     * @mbg.generated Thu Jan 03 19:34:18 CST 2019
     */
    int updateByExampleSelective(@Param("record") HuiFu record, @Param("example") HuiFuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table huifu
     *
     * @mbg.generated Thu Jan 03 19:34:18 CST 2019
     */
    int updateByExample(@Param("record") HuiFu record, @Param("example") HuiFuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table huifu
     *
     * @mbg.generated Thu Jan 03 19:34:18 CST 2019
     */
    int updateByPrimaryKeySelective(HuiFu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table huifu
     *
     * @mbg.generated Thu Jan 03 19:34:18 CST 2019
     */
    int updateByPrimaryKey(HuiFu record);
}