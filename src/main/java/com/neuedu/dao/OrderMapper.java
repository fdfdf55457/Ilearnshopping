package com.neuedu.dao;

import com.neuedu.pojo.Order;
import java.util.List;

public interface OrderMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table newbee_order
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table newbee_order
     *
     * @mbg.generated
     */
    int insert(Order record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table newbee_order
     *
     * @mbg.generated
     */
    Order selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table newbee_order
     *
     * @mbg.generated
     */
    List<Order> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table newbee_order
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Order record);
}