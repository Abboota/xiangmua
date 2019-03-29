package www.kjfl.com.pingtai.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import www.kjfl.com.pingtai.bean.XueYuan;
import www.kjfl.com.pingtai.bean.XueYuanExample;

@Mapper
public interface XueYuanMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xueyuan
     *
     * @mbg.generated Mon Dec 31 14:29:51 CST 2018
     */
    long countByExample(XueYuanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xueyuan
     *
     * @mbg.generated Mon Dec 31 14:29:51 CST 2018
     */
    int deleteByExample(XueYuanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xueyuan
     *
     * @mbg.generated Mon Dec 31 14:29:51 CST 2018
     */
    int deleteByPrimaryKey(Integer yid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xueyuan
     *
     * @mbg.generated Mon Dec 31 14:29:51 CST 2018
     */
    int insert(XueYuan record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xueyuan
     *
     * @mbg.generated Mon Dec 31 14:29:51 CST 2018
     */
    int insertSelective(XueYuan record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xueyuan
     *
     * @mbg.generated Mon Dec 31 14:29:51 CST 2018
     */
    List<XueYuan> selectByExample(XueYuanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xueyuan
     *
     * @mbg.generated Mon Dec 31 14:29:51 CST 2018
     */
    XueYuan selectByPrimaryKey(Integer yid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xueyuan
     *
     * @mbg.generated Mon Dec 31 14:29:51 CST 2018
     */
    int updateByExampleSelective(@Param("record") XueYuan record, @Param("example") XueYuanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xueyuan
     *
     * @mbg.generated Mon Dec 31 14:29:51 CST 2018
     */
    int updateByExample(@Param("record") XueYuan record, @Param("example") XueYuanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xueyuan
     *
     * @mbg.generated Mon Dec 31 14:29:51 CST 2018
     */
    int updateByPrimaryKeySelective(XueYuan record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xueyuan
     *
     * @mbg.generated Mon Dec 31 14:29:51 CST 2018
     */
    int updateByPrimaryKey(XueYuan record);
}