package com.cms;

public class Menu_Driven_CMS {

	public static void main(String[] args) {
		while (true) {
			try {
				CMS_Loader.register();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
