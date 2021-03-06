package www.kjfl.com.pingtai.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import www.kjfl.com.pingtai.bean.JingLi;
import www.kjfl.com.pingtai.bean.JingLiExample;

@Mapper
public interface JingLiMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jingli
     *
     * @mbg.generated Mon Dec 31 14:29:51 CST 2018
     */
    long countByExample(JingLiExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jingli
     *
     * @mbg.generated Mon Dec 31 14:29:51 CST 2018
     */
    int deleteByExample(JingLiExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jingli
     *
     * @mbg.generated Mon Dec 31 14:29:51 CST 2018
     */
    int deleteByPrimaryKey(Integer fid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jingli
     *
     * @mbg.generated Mon Dec 31 14:29:51 CST 2018
     */
    int insert(JingLi record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jingli
     *
     * @mbg.generated Mon Dec 31 14:29:51 CST 2018
     */
    int insertSelective(JingLi record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jingli
     *
     * @mbg.generated Mon Dec 31 14:29:51 CST 2018
     */
    List<JingLi> selectByExample(JingLiExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jingli
     *
     * @mbg.generated Mon Dec 31 14:29:51 CST 2018
     */
    JingLi selectByPrimaryKey(Integer fid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jingli
     *
     * @mbg.generated Mon Dec 31 14:29:51 CST 2018
     */
    int updateByExampleSelective(@Param("record") JingLi record, @Param("example") JingLiExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jingli
     *
     * @mbg.generated Mon Dec 31 14:29:51 CST 2018
     */
    int updateByExample(@Param("record") JingLi record, @Param("example") JingLiExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jingli
     *
     * @mbg.generated Mon Dec 31 14:29:51 CST 2018
     */
    int updateByPrimaryKeySelective(JingLi record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jingli
     *
     * @mbg.generated Mon Dec 31 14:29:51 CST 2018
     */
    int updateByPrimaryKey(JingLi record);
}