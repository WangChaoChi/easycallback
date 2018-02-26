package com.pojo;

/**这就是小李啦
 * @author wcc
 *
 */
public class Li {
	
	public void exeuteMessage(CallBack collBack,String question){
		System.out.println("小王的问题---->"+question);
		
		//模拟小李办自己的事情要很长时间
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//小李办完事情想到答案是2
		String result = "答案是2";
		
		/*
		 * 于是就打电话告诉小王，调用小王中的方法
		 * 这就相当于 B类放过来调用A的方法D
		 */
		collBack.solve(result);
	}

}
