package com.lisi.test;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.junit.Test;

import com.lisi.utils.IOUtil;

public class IoTest {
	
	@Test
	public void test1() throws IOException {
		
		File srcFile =new File("C:\\pic\\abc.txt");
		File destFile =new File("E:\\pic\\abc.txt");
	//	IOUtil.copyFileByByte(srcFile, destFile);
		//IOUtil.readAndWriteFile(srcFile, destFile);
		Set<String> set = IOUtil.readFile(srcFile);
		System.out.println(set);
	}

}
