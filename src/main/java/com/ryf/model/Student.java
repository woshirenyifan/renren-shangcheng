package com.ryf.model;

import java.util.Date;

public class Student {
    private String sno;

    private String sname;

    private String ssex;

    private Date sbirthday;

    private String clazz;

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno == null ? null : sno.trim();
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname == null ? null : sname.trim();
    }

    public String getSsex() {
        return ssex;
    }

    public void setSsex(String ssex) {
        this.ssex = ssex == null ? null : ssex.trim();
    }

    public Date getSbirthday() {
        return sbirthday;
    }

    public void setSbirthday(Date sbirthday) {
        this.sbirthday = sbirthday;
    }

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz == null ? null : clazz.trim();
    }

	@Override
	public String toString() {
		return "Student [sno=" + sno + ", sname=" + sname + ", ssex=" + ssex + ", sbirthday=" + sbirthday + ", clazz="
				+ clazz + "]";
	}
    
}