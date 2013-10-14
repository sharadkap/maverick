package com.otv.managed.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.primefaces.component.menuitem.MenuItem;
import org.primefaces.model.MenuModel;


public class BreadcrumsManagedBean {

		 public BreadcrumsManagedBean () {
		     MenuItem item = new MenuItem();
		        item.setValue("Home");
		        item.setUrl("/home.jsf");
		        item.setId("home");
		 this.breadcrumbmodel.addMenuItem(item);   
		 }

		 private MenuModel breadcrumbmodel;
		

		 public MenuModel getBreadcrumbmodel() {
			return breadcrumbmodel;
		}


		public void setBreadcrumbmodel(MenuModel breadcrumbmodel) {
			this.breadcrumbmodel = breadcrumbmodel;
		}


		public void AddItem(String value, String url, String id){
		  MenuItem item = new MenuItem();
		        item.setValue(value);
		        item.setUrl(url);
		        item.setId(id);
		  this.breadcrumbmodel.addMenuItem(item);
		  }
		
	
}
