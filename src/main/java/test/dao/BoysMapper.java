package test.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import test.model.Boys;
import test.model.BoysExample;

public interface BoysMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table boys
     *
     * @mbggenerated Thu Nov 26 19:33:30 CST 2015
     */
    int countByExample(BoysExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table boys
     *
     * @mbggenerated Thu Nov 26 19:33:30 CST 2015
     */
    int deleteByExample(BoysExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table boys
     *
     * @mbggenerated Thu Nov 26 19:33:30 CST 2015
     */
    int insert(Boys record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table boys
     *
     * @mbggenerated Thu Nov 26 19:33:30 CST 2015
     */
    int insertSelective(Boys record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table boys
     *
     * @mbggenerated Thu Nov 26 19:33:30 CST 2015
     */
    List<Boys> selectByExample(BoysExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table boys
     *
     * @mbggenerated Thu Nov 26 19:33:30 CST 2015
     */
    int updateByExampleSelective(@Param("record") Boys record, @Param("example") BoysExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table boys
     *
     * @mbggenerated Thu Nov 26 19:33:30 CST 2015
     */
    int updateByExample(@Param("record") Boys record, @Param("example") BoysExample example);
}