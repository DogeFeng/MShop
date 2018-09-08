package cn.mldn.exception;

@SuppressWarnings("serial")
public class EmptyShopcarException extends Exception {
	public EmptyShopcarException(String msg) {
		super(msg);
	}
}
