package com.company.mianshi.staticOrder;

import java.sql.Date;
/**
 * 静态代码块的优点：简化代码
 * @author Dell
 *
 */
public class BPerson {

	private Date birthDate;
	private static Date startDate, endDate;

	static {
		startDate = Date.valueOf("1946");
		endDate = Date.valueOf("1964");
	}

	public BPerson(Date birthDate) {
	        this.birthDate = birthDate;
	    }

	/**
	 *  * isBornBoomer是用来这个人是否是1946-1964年出生的，
	 *  而每次isBornBoomer被调用的时候，都会生成startDate和birthDate两个对象，造成了空间浪费，如果改成这样效率会更好：
	 * @return
	 */
	boolean isBornBoomer() {
		return birthDate.compareTo(startDate) >= 0 && birthDate.compareTo(endDate) < 0;
	}
}
