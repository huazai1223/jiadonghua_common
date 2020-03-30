package com.jdh.common.utils;

import java.util.Calendar;
import java.util.Date;

public class PersonTest {

	public static void main(String[] args) {
		for (int i = 0; i < 10001; i++) {
			Person person = new Person();
			/* 姓名属性值调用StringUtil.generateChineseName()创建（4分） */
			person.setName(StringUtil.generateChineseName());
			/* 年龄属性值调用RandomUtil.random()创建，必须在1-120岁之间（4分） */
			person.setAge(RandomUtil.random(1,120));
			/* 介绍属性值调用StringUtil.randomChineseString()创建，字数为140个随机汉字（4分） */
			person.setAbout(StringUtil.randomChineseString(140));
			/* 注册日期属性值模拟2010年1月1日至今任意随机时间（4分）。 */
			Calendar calendar = Calendar.getInstance();
			calendar.set(2010, 0, 1);
			person.setCreated(DateUtil.randomDate(calendar.getTime(), new Date()));
			System.out.println("第"+i+"个人的信息是:"+person);
		}
	}
}
