package reactor;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;

public class nio {
	public void Start_demo1() throws IOException {
		RandomAccessFile aFile = new RandomAccessFile("d:" + File.separator + "nio.txt", "rw");
		FileChannel inChannel = aFile.getChannel();
		ByteBuffer buf = ByteBuffer.allocate(45);
		int bytesRead = inChannel.read(buf);
		while (bytesRead != -1) {
			System.out.println("Read " + bytesRead);
			buf.flip();
			while (buf.hasRemaining()) {
				System.out.println("get " + buf.get());
			}
			bytesRead = inChannel.read(buf);
		}
		aFile.close();
	}

	public void Start_demo2() throws IOException {

		RandomAccessFile aFile = new RandomAccessFile("d:" + File.separator + "nio.txt", "rw");
		FileChannel inChannel = aFile.getChannel();
		ByteBuffer header = ByteBuffer.allocate(128);
		ByteBuffer body = ByteBuffer.allocate(1024);
		ByteBuffer[] bufferArray = { header, body };
		inChannel.read(bufferArray);
		// inChannel.write(bufferArray);

		FileChannel toChannel = aFile.getChannel();
		long position = 0;
		long count = inChannel.size();
		toChannel.transferFrom(inChannel, position, count);
		// 在SoketChannel的实现中，SocketChannel只会传输此刻准备好的数据（可能不足count字节）

		FileChannel to2Channel = aFile.getChannel();
		long position2 = 0;
		long count2 = inChannel.size();
		inChannel.transferTo(position2, count2, to2Channel);
		// SocketChannel会一直传输数据直到目标buffer被填满
		aFile.close();
	}

	public void Start_Selector() throws IOException {

		
		SocketChannel channel = SocketChannel.open();
		channel.connect(new InetSocketAddress("http://jenkov.com", 80));
		Selector selector = Selector.open();
		channel.configureBlocking(true);
		SelectionKey key = channel.register(selector, SelectionKey.OP_READ);

		int interestSet = key.interestOps();
		boolean isInterestedInAccept  = (interestSet & SelectionKey.OP_ACCEPT) == SelectionKey.OP_ACCEPT;
		boolean isInterestedInConnect = (interestSet & SelectionKey.OP_CONNECT) == SelectionKey.OP_ACCEPT;
		boolean isInterestedInRead    = (interestSet & SelectionKey.OP_READ) == SelectionKey.OP_ACCEPT;
		boolean isInterestedInWrite   = (interestSet & SelectionKey.OP_WRITE) == SelectionKey.OP_ACCEPT;
		System.out.println(isInterestedInAccept);
		System.out.println(isInterestedInConnect);
		System.out.println(isInterestedInRead);
		System.out.println(isInterestedInWrite);
	}

}
