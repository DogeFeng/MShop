package cn.mldn.shop.factory;

import cn.mldn.shop.service.back.IAdminServiceBack;
import cn.mldn.shop.service.back.IGoodsServiceBack;
import cn.mldn.shop.service.back.IItemServiceBack;
import cn.mldn.shop.service.back.IMemberServiceBack;
import cn.mldn.shop.service.back.IOrdersServiceBack;
import cn.mldn.shop.service.back.impl.AdminServiceBackImpl;
import cn.mldn.shop.service.back.impl.GoodsServiceBackImpl;
import cn.mldn.shop.service.back.impl.ItemServiceBackImpl;
import cn.mldn.shop.service.back.impl.MemberServiceBackImpl;
import cn.mldn.shop.service.back.impl.OrdersServiceBackImpl;

public class ServiceBackFactory {
	public static IAdminServiceBack getIAdminServiceBack() {
		return new AdminServiceBackImpl();
	}
	public static IMemberServiceBack getIMemberServiceBackInstance() {
		return new MemberServiceBackImpl();
	}
	public static IItemServiceBack getIItemServiceBackInstance() {
		return new ItemServiceBackImpl();
	}
	public static IGoodsServiceBack getIGoodsServiceBackInstance() {
		return new GoodsServiceBackImpl();
	}
	public static IOrdersServiceBack getIOrdersServiceBackInstance() {
		return new OrdersServiceBackImpl();
	}
}
