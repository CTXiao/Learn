package Collection.HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
	public HashMapTest() {
		Map<String, String> map = new HashMap<String, String>();
		map.entrySet();
		System.out.println();
		System.out.println(CharToByteAscii('0'));
		System.out.println(CharToByteAscii('9'));
		System.out.println();
		System.out.println(ByteAsciiToChar(48));
		System.out.println(ByteAsciiToChar(57));
		System.out.println();
		System.out.println(ByteAsciiToChar(65));
		System.out.println(ByteAsciiToChar(90));
		System.out.println();
		System.out.println(ByteAsciiToChar(97));
		System.out.println(ByteAsciiToChar(122));
		System.out.println();
		System.out.println(SumStrAscii("a"));
		System.out.println(SumStrAscii("b"));
	}

	public static byte CharToByteAscii(char ch) {
		byte byteAscii = (byte) ch;
		return byteAscii;
	}

	public static char ByteAsciiToChar(int ascii) {
		char ch = (char) ascii;
		return ch;
	}

	public static int SumStrAscii(String str) {
		byte[] bytestr = str.getBytes();
		int sum = 0;
		for (int i = 0; i < bytestr.length; i++) {
			sum += bytestr[i];
		}
		return sum;
	}
}
