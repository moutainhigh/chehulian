package com.car.app.carscraporder.util;

import com.car.app.carscraporder.bo.CarScrapOrderPageBO;
import com.car.app.carscraporder.vo.CarScrapOrderKeywordVO;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.context.MessageSource;

import com.car.app.carscraporder.exception.CheckException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CheckUtil {
	private static MessageSource resources;


	public static void setResources(MessageSource resources) {
		CheckUtil.resources = resources;
	}

	public static void check(boolean condition, String msgKey, Object... args) {
		if (!condition) {
			fail(msgKey, args);
		}
	}

	public static void notEmpty(String str, String msgKey, Object... args) {
		if (str == null || str.isEmpty()) {
			fail(msgKey, args);
		}
	}

	public static void notNull(Object obj, String msgKey, Object... args) {
		if (obj == null) {
			fail(msgKey, args);
		}
	}

	private static void fail(String msgKey, Object... args) {
		String message = resources.getMessage(msgKey, args, UserUtil.getLocale());
		throw new CheckException(message);
	}
}
