package AOP.AOP;

public class Singer {
	public String sing(String SongName) {
		System.out.println();
		System.out.println("我唱的是：人民公安向前进");
		System.out.println();
		System.out.println(
				"伟大的祖国赋予我使命\r\n" + 
				"复兴的民族给予我力量\r\n" + 
				"忠诚的道路浴血荣光\r\n" + 
				"英雄的足迹越走越长\r\n" + 
				"听党指挥 坚定信仰\r\n" + 
				"公平正义 法律至上\r\n" + 
				"惩恶扬善 剑出锋芒\r\n" + 
				"平安中国 无悔担当\r\n" + 
				"人民公安为人民\r\n" + 
				"我们的名字在警徽中闪光\r\n" + 
				"人民公安向前进\r\n" + 
				"......");
		System.out.println("谢谢！");
		System.out.println();
		return SongName;
	}
}
