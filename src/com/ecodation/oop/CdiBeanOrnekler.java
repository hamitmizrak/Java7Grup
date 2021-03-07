package com.ecodation.oop;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named
@SessionScoped
public class CdiBeanOrnekler implements Serializable {
	private static final long serialVersionUID = 7402395822834228967L;

	private long cdiID;
	private String adi;

}
