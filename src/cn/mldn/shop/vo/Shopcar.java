package cn.mldn.shop.vo;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Shopcar implements Serializable{
	private Goods goods;
	private Member member;
	private Integer amount;
	public Goods getGoods() {
		return goods;
	}
	public void setGoods(Goods goods) {
		this.goods = goods;
	}
	public Member getMember() {
		return member;
	}
	public void setMember(Member member) {
		this.member = member;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	
}
