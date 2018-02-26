package com.pojo;

/**这是一个回掉接口
 * @author wcc
 *
 */
public interface CallBack {
	/**
	 * 这个是小李知道答案时要调用的函数告诉小王，也就是回掉函数
	 * @param result 是答案
	 */
	public void solve(String result);

}
