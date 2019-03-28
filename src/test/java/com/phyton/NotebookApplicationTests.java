package com.phyton;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class NotebookApplicationTests {

	@Test
	public void contextLoads() {
	}
	
	@Test
	public void testPytonExecutor() throws IOException {
		PytonExecutor python =new PytonExecutor();
		String res=python.execute("print 1+1");
		assertEquals("2", res);
		
	}

	
	@Test
	public void testPytonExecutorVariableInitialisation() throws IOException {
		PytonExecutor python =new PytonExecutor();
		String res=python.execute("a = 1");
		assertEquals("", res);
		
	}
	
	
	@Test
	public void testPytonExecutorWirhVariable() throws IOException {
		PytonExecutor python =new PytonExecutor();
		python.setVariable("20");
		String res=python.execute("print a+51");
		assertEquals("71", res);
		
	}
	
}
