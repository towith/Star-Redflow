package my.dao.mybatis.mi;

import my.dao.mybatis.Mapper;
import my.model.b_example.DislikeExample;
import my.model.persist.board.Dislike;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DislikeMapper extends Mapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dislike
     *
     * @mbggenerated
     */
    int countByExample(DislikeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dislike
     *
     * @mbggenerated
     */
    int deleteByExample(DislikeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dislike
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dislike
     *
     * @mbggenerated
     */
    int insert(Dislike record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dislike
     *
     * @mbggenerated
     */
    int insertSelective(Dislike record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dislike
     *
     * @mbggenerated
     */
    List<Dislike> selectByExampleWithBLOBs(DislikeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dislike
     *
     * @mbggenerated
     */
    List<Dislike> selectByExample(DislikeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dislike
     *
     * @mbggenerated
     */
    Dislike selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dislike
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Dislike record, @Param("example") DislikeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dislike
     *
     * @mbggenerated
     */
    int updateByExampleWithBLOBs(@Param("record") Dislike record, @Param("example") DislikeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dislike
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Dislike record, @Param("example") DislikeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dislike
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Dislike record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dislike
     *
     * @mbggenerated
     */
    int updateByPrimaryKeyWithBLOBs(Dislike record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dislike
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Dislike record);
}
