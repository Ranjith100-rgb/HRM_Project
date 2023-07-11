package com.genricUtility;

import java.util.Random;

public class JavaUtility {
	
	Random random=new Random();
	
	public int getRandom()
	{	
		 int ran=random.nextInt(3000);
		 return ran;
	}
}
