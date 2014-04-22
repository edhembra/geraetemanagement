package com.tutorial;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import org.primefaces.model.chart.PieChartModel;

@ManagedBean
@RequestScoped
public class ChartBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8613233236655800386L;
	private PieChartModel pieModel;

	public ChartBean() {
	//	createPieModel();
	}

	public PieChartModel getPieModel() {
		return pieModel;
	}

	@PostConstruct
	private void createPieModel() {
		pieModel = new PieChartModel();

		pieModel.set("Brand 1", 540);
		pieModel.set("Brand 2", 325);
		pieModel.set("Brand 3", 702);
		pieModel.set("Brand 4", 421);
	}
}