package com.ts.sd.print.impl;

import org.springframework.stereotype.Component;

import com.ts.sd.print.Paper;
@Component("paper")
public class Paper_b5 implements Paper {

	@Override
	public String getSize() {
		return "B5";
	}

}
