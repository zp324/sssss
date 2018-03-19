package com.ts.sd.print.impl;

import org.springframework.stereotype.Component;

import com.ts.sd.print.Ink;
@Component("ink2")
public class Ink_bw implements Ink {

	@Override
	public String getColor() {
		return "ºÚ°×";
	}

}
