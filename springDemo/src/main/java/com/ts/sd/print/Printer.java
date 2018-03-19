package com.ts.sd.print;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component("printer")
public class Printer {
	private Logger log = LoggerFactory.getLogger(Printer.class);
	/*@Autowired
	@Qualifier("paper2")*/
	@Resource(name="paper2")
	private Paper paper;
	private Ink ink;
	public void setPaper(Paper paper) {
		this.paper = paper;
	}
	@Autowired
	public void setInk(@Qualifier("ink2")Ink ink) {
		this.ink = ink;
	}
	
	public void info() {
		log.info("使用了{}大小的纸，用的是{}墨盒！",paper.getSize(),ink.getColor());
	}
}
