package cn.mldn.exception;

@SuppressWarnings("serial")
public class UnEnoughAmountException extends Exception {
	public UnEnoughAmountException(String msg) {
		super(msg);
	}
}
