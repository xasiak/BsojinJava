package com.kh.day11.iostream.writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

//day11에 마우스 대고 f5누르면 writing파일 생성됨
public class Exam_Write {
	public static void main(String[] args) {
		Writer writer = null;
		
		try {
			//Unhandled exception type IOException
			writer = new FileWriter("src/com/kh/day11/iostream/writing.txt");
			char [] data = "Java/Oracle/JDBC".toCharArray(); 
			for(int i = 0; i < data.length; i++) {
				writer.write(data[i]);
			}
			writer.flush();  // 스트림에 있는 버퍼를 비워줘야 파일에 뜸
			System.out.println("파일 쓰기 완료!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
