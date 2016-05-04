package my.dao.mybatis.mi;

import my.dao.mybatis.Mapper;
import my.model.b_example.PunishmentExample;
import my.model.persist.project.Punishment;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PunishmentMapper extends Mapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table punishment
     *
     * @mbggenerated
     */
    int countByExample(PunishmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table punishment
     *
     * @mbggenerated
     */
    int deleteByExample(PunishmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table punishment
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table punishment
     *
     * @mbggenerated
     */
    int insert(Punishment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table punishment
     *
     * @mbggenerated
     */
    int insertSelective(Punishment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table punishment
     *
     * @mbggenerated
     */
    List<Punishment> selectByExampleWithBLOBs(PunishmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table punishment
     *
     * @mbggenerated
     */
    List<Punishment> selectByExample(PunishmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table punishment
     *
     * @mbggenerated
     */
    Punishment selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table punishment
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Punishment record, @Param("example") PunishmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table punishment
     *
     * @mbggenerated
     */
    int updateByExampleWithBLOBs(@Param("record") Punishment record, @Param("example") PunishmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table punishment
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Punishment record, @Param("example") PunishmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table punishment
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Punishment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table punishment
     *
     * @mbggenerated
     */
    int updateByPrimaryKeyWithBLOBs(Punishment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table punishment
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Punishment record);
}
