package cn.mldn.shop.factory;

import java.sql.Connection;

import cn.mldn.shop.dao.IAdminDAO;
import cn.mldn.shop.dao.IDetailsDAO;
import cn.mldn.shop.dao.IGoodsDAO;
import cn.mldn.shop.dao.IItemDAO;
import cn.mldn.shop.dao.IMemberDAO;
import cn.mldn.shop.dao.IOrdersDAO;
import cn.mldn.shop.dao.IShopcarDAO;
import cn.mldn.shop.dao.impl.AdminDAOImpl;
import cn.mldn.shop.dao.impl.DetailsDAOImpl;
import cn.mldn.shop.dao.impl.GoodsDAOImpl;
import cn.mldn.shop.dao.impl.ItemDAOImpl;
import cn.mldn.shop.dao.impl.MemberDAOImpl;
import cn.mldn.shop.dao.impl.OrdersDAOImpl;
import cn.mldn.shop.dao.impl.ShopcarDAOImpl;

public class DAOFactory {
	public static IMemberDAO getIMemberDAOInstance(Connection conn) {
		return new MemberDAOImpl(conn);
	}
	public static IAdminDAO getIAdminDAOInstance(Connection conn) {
		return new AdminDAOImpl(conn);
	}
	public static IItemDAO getIItemDAOInstance(Connection conn) {
		return new ItemDAOImpl(conn);
	}
	public static IGoodsDAO getIGoodsDAOInstance(Connection conn) {
		return new GoodsDAOImpl(conn);
	}
	public static IShopcarDAO getIShopcarDAOInstance(Connection conn) {
		return new ShopcarDAOImpl(conn);
	}
	public static IOrdersDAO getIOrdersDAOInstance(Connection conn) {
		return new OrdersDAOImpl(conn);
	}
	public static IDetailsDAO getIDetailsDAOInstance(Connection conn) {
		return new DetailsDAOImpl(conn);
	}
}
