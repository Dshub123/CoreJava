package com.demo.bytebuffer;

import java.nio.ByteBuffer;

public class TestByteBuffer {

	public static void main(String[] args) {
		
		
		ByteBuffer directBuffer = ByteBuffer.allocateDirect(16);
		System.out.println(directBuffer.isDirect());
		
		//Basic Usage - Creating a ByteBuer
		byte[] reqBuffer = new byte[BUFFER_SIZE];
		int readBytes = socketInputStream.read(reqBuffer);
		final ByteBuffer reqBufferWrapper = ByteBuffer.wrap(reqBuffer);

	}

}
