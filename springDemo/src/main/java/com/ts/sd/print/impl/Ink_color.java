package com.ts.sd.print.impl;

import org.springframework.stereotype.Component;

import com.ts.sd.print.Ink;
@Component("ink")
public class Ink_color implements Ink {

	@Override
	public String getColor() {
		return "²ÊÉ«";
	}

}
