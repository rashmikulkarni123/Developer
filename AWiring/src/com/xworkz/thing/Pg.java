package com.xworkz.thing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Pg {
	@Autowired
	private boolean clean;
	@Autowired
	@Qualifier("name5")
	private char name;
	@Autowired
	private byte workers;
	@Autowired
	private Short peoples;
	@Autowired
	private int floores;
	@Autowired
	private long pgno;
	@Autowired
	private double rent;
	@Autowired
	private String warden;

	@Override
	public String toString() {
		return "Pg [clean=" + clean + ", name=" + name + ", workers=" + workers + ", peoples=" + peoples + ", floores="
				+ floores + ", pgno=" + pgno + ", rent=" + rent + ", warden=" + warden + "]";
	}

}
