package com.ts.sd.print.impl;

import org.springframework.stereotype.Component;

import com.ts.sd.print.Paper;
@Component("paper2")
public class Paper_a4 implements Paper {

	@Override
	public String getSize() {
		return "A4";
	}

}
