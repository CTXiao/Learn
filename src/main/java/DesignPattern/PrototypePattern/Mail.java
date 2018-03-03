package DesignPattern.PrototypePattern;

public class Mail implements Cloneable{

	public String receiver;// 接收者
	public String tail;// 结尾备注
	private String context; // 内容
	private String sub; // 标题

	public Mail(MailTemp mTemp) {
		this.context = mTemp.getMainContentString();
		this.sub = mTemp.getSubString();
	}

	public String getReceiver() {
		return receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	public String getTail() {
		return tail;
	}

	public void setTail(String tail) {
		this.tail = tail;
	}

	public String getContext() {
		return context;
	}

	public void setContext(String context) {
		this.context = context;
	}

	public String getSub() {
		return sub;
	}

	public void setSub(String sub) {
		this.sub = sub;
	}

	@Override
	protected Mail clone() throws CloneNotSupportedException {
		Mail mail = (Mail)super.clone();
		return mail;
	}

}
