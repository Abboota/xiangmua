package www.kjfl.com.pingtai.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import www.kjfl.com.pingtai.bean.TiWen;
import www.kjfl.com.pingtai.bean.TiWenExample;

@Mapper
public interface TiWenMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tiwen
     *
     * @mbg.generated Thu Jan 03 19:34:18 CST 2019
     */
    long countByExample(TiWenExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tiwen
     *
     * @mbg.generated Thu Jan 03 19:34:18 CST 2019
     */
    int deleteByExample(TiWenExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tiwen
     *
     * @mbg.generated Thu Jan 03 19:34:18 CST 2019
     */
    int deleteByPrimaryKey(Integer tid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tiwen
     *
     * @mbg.generated Thu Jan 03 19:34:18 CST 2019
     */
    int insert(TiWen record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tiwen
     *
     * @mbg.generated Thu Jan 03 19:34:18 CST 2019
     */
    int insertSelective(TiWen record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tiwen
     *
     * @mbg.generated Thu Jan 03 19:34:18 CST 2019
     */
    List<TiWen> selectByExample(TiWenExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tiwen
     *
     * @mbg.generated Thu Jan 03 19:34:18 CST 2019
     */
    TiWen selectByPrimaryKey(Integer tid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tiwen
     *
     * @mbg.generated Thu Jan 03 19:34:18 CST 2019
     */
    int updateByExampleSelective(@Param("record") TiWen record, @Param("example") TiWenExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tiwen
     *
     * @mbg.generated Thu Jan 03 19:34:18 CST 2019
     */
    int updateByExample(@Param("record") TiWen record, @Param("example") TiWenExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tiwen
     *
     * @mbg.generated Thu Jan 03 19:34:18 CST 2019
     */
    int updateByPrimaryKeySelective(TiWen record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tiwen
     *
     * @mbg.generated Thu Jan 03 19:34:18 CST 2019
     */
    int updateByPrimaryKey(TiWen record);
}