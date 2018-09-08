package cn.mldn.shop.service.front;

import java.util.Map;
import java.util.Set;

import cn.mldn.shop.vo.Shopcar;

public interface IShopcarServiceFront {
	/**
	 * 主要实现购物车数据的增加具备如下的操作逻辑：<br>
	 * <li>首先要查询的购物车数据是否已经存在，如果存在则进行保存量自增</li>
	 * <li>如果要保存的信息不存在，则保存一个新的内容，并且数量是1</li>
	 * @param vo
	 * @return
	 * @throws Excepton
	 */
	public boolean addCar(Shopcar vo) throws Exception;
	/**
	 * 通过当前的用户id，查询出所有的购买的商品，包含如下功能：<br>
	 * <li>根据用户id查询出所有购物车中的购买记录</li>
	 * <li>购物记录包含有全部商品编号，就可以查询出全部的商品完整信息</li>
	 * <li>由于要考虑到数据回显问题，所有应该再让其显示出所有的购买记录</li>
	 * @param mid 用户id
	 * @return 包含有如下内容：<br>
	 * <li>key=allShopcars,value=IShopcarDAO.findAllByMember(),Map<Integer,Integer></li>
	 * <li>key=allGoods,value=IGoodsDAO.findByGid(),List<Goods></li>
	 * <li></li>
	 * @throws Exception
	 */
	public Map<String,Object> listCar(String mid) throws Exception;
	/**
	 * 调用IShopcarDAO.doRemoveByMemberAndGoods()方法，删除掉指定一个用户和商品的信息
	 * @param mid
	 * @param gid
	 * @return
	 * @throws Exception
	 */
	public boolean deleteCar(String mid,Set<Integer> gid) throws Exception;
	/**
	 *更新购买的所有商品信息，更新之前需要先删除掉已有的购买信息，而后保存新的购买信息
	 * @param mid
	 * @param vos
	 * @return
	 * @throws Exception
	 */
	public boolean update(String mid ,Set<Shopcar> vos) throws Exception;
}
