package com.winnerlook.framework.common.threadlocal;

import com.winnerlook.kuailq.pojo.User;


public class UserThreadLocal {

	private static final ThreadLocal<User> LOCAL = new ThreadLocal<User>();

	 /**
     * 从本地线程中设置User对象
     * 
     * @param user
     */
    public static void set(User user) {
        LOCAL.set(user);
    }

    /**
     * 从本地线程中获取User对象
     * @return
     */
    public static User get() {
        return LOCAL.get();
    }
}
