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
	public void testPhytonExecutor() throws IOException {
		PhytonExecutor phython =new PhytonExecutor();
		String res=phython.execute("print 1+1");
		assertEquals("2", res);
		
	}

	
	@Test
	public void testPhytonExecutorVariableInitialisation() throws IOException {
		PhytonExecutor phython =new PhytonExecutor();
		String res=phython.execute("a = 1");
		assertEquals("", res);
		
	}
	
	
	@Test
	public void testPhytonExecutorWirhVariable() throws IOException {
		PhytonExecutor phython =new PhytonExecutor();
		phython.setVariable("20");
		String res=phython.execute("print a+51");
		assertEquals("71", res);
		
	}
	
}
