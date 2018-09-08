package cn.mldn.shop.dao;

import java.sql.SQLException;
import java.util.List;

import cn.mldn.shop.vo.Orders;

public interface IOrdersDAO extends IDAO<Integer, Orders> {
	/**
	 * 调用last_insert_id()函数取得当前增长后的订单编号，为订单详情准备
	 * @return 返回最后的自动增长编号
	 * @throws SQLException
	 */
	public Integer findLastInsertId() throws SQLException;
	public boolean doCreateOrders(Orders vo) throws SQLException;
	/**
	 * 根据用户编号列出所有的订单信息
	 * @param mid
	 * @param currentPage
	 * @param LineSize
	 * @return
	 * @throws Exception
	 */
	public List<Orders> findAllByMember(String mid,Integer currentPage,Integer lineSize) throws Exception;
	public Integer getAllCountByMember(String mid) throws Exception;
	/**
	 * 查询一个用户的一个订单信息
	 * @param mid
	 * @param oid
	 * @return
	 * @throws Exception
	 */
	public Orders findAllByIdAndMember(String mid,Integer oid) throws Exception;
}
