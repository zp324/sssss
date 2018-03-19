package com.ts.sd;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloSpring {
	//private Logger log = Logger.getLogger(HelloSpring.class);
	private Logger log = LoggerFactory.getLogger(HelloSpring.class);
	
	private String message;
	
	private List list;
	private Set set;
	private Map map;
	private Properties props;
	private String snull;
	private String kstr;

	public void setSnull(String snull) {
		this.snull = snull;
	}

	public void setKstr(String kstr) {
		this.kstr = kstr;
	}

	public void setList(List list) {
		this.list = list;
	}

	public void setSet(Set set) {
		this.set = set;
	}

	public void setMap(Map map) {
		this.map = map;
	}

	public void setProps(Properties props) {
		this.props = props;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public void hello() {
		//log.info("hello,"+message);
		log.info("hello,{}",message);
		//list
		for(Object obj:list) {
			log.info("list,{}",obj.toString());
		}
		//set
		for(Object obj:set) {
			log.info("set,{}",obj.toString());
		}
		//map
		Set<Object> es = map.entrySet();
		for(Iterator it = es.iterator();it.hasNext();) {
			Entry et = (Entry) it.next();
			log.info("map,{},{}",et.getKey(),et.getValue());
		}
		//props
		Set<Object> keySet = props.keySet();
		for(Object obj:keySet) {
			log.info("props,{},{}",obj,props.getProperty(obj.toString()));
		}
		//null
		log.info("null,{}",snull);
		//k
		log.info("kkkk,{}",kstr);
	}
}
