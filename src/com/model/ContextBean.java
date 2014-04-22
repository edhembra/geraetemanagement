package com.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.UUID;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.model.SelectItem;

@ManagedBean
@RequestScoped
public class ContextBean {

	private int contextIndex;

	public ContextBean() {
		setContextIndex(0);
	}

	@PostConstruct
	public void createGeraetTableBean() {
		setContextIndex(0);

	}

	public int getContextIndex() {
		return contextIndex;
	}

	public String getNextUrl(int a) {
		setContextIndex(a);
		if (a == 0) {
			return "/faces/welcome.xhtml";
		} else {
			if (a == 1) {
				return "/faces/geraet.xhtml";
			} else {
				if (a == 2) {
					return "/faces/simKarte.xhtml";
				} else {
					if (a == 3) {
						return "/faces/sdKarte.xhtml";
					} else {

						if (a == 4) {
							return "/faces/servicestelle.xhtml";
						} else {

							if (a == 5) {
								return "/faces/bo.xhtml";
							} else {
								if (a == 6) {
									return "/faces/schadensmeldung.xhtml";
								} else {
									if (a == 7) {
										return "/faces/personalverwaltung.xhtml";
									} else {
										if (a == 8) {
											return "/faces/einstellungen.xhtml";

										}

									}

								}

							}

						}

					}

				}
			}
		}

		return "/faces/welcome.xhtml";
	}

	public void setContextIndex(int contextIndex) {
		this.contextIndex = contextIndex;
	}

}
