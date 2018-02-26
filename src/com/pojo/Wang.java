package com.pojo;

/**这个是小王
 * @author wcc
 *实现一个回掉接口CallBack，相当于----->背景一
 **/
public class Wang implements CallBack{
	
	/**
	 * 小李对象的引用，相当于----->背景二
	 */
	private Li li;
	
	/**小王的构造方法，持有小李的引用
	 * @param li
	 */
	public Wang(Li li) {
		this.li = li;
	}
	
	public void askQuestion(final String question){
		//这里用一个线程就是异步
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				
				/*小王调用小李中的方法，在这个方法中注册回掉接口
				 * 这就相当于 A类调用B的方法c
				 */
				li.exeuteMessage(Wang.this, question);
			}
		}).start();
		
		//小王问完问题挂掉电话就去逛街了。
		play();
	}

	public void play(){
		System.out.println("我要去逛街了");
	}

	/*
	 * 小李知道答案后调用此方法告诉小王，
	 * 就是所谓的小王的回掉方法
	 */
	@Override
	public void solve(String result) {
		//TODO 此处是回掉方法要做的事
		//FIXME 此处是回掉方法要做的事
		//XXX 此处是回掉方法要做的事
		System.out.println("小李告诉小王的答案是------>"+result);
	}

}
