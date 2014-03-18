package com.lifeng.db;

import java.util.Date;

/**
 * @author lifeng
 *         email: shandong-li@hotmail.com
 * @date 2013-6-26
 * @version 1.0.0
 */

public class Custom {

		private int id;
		private String name;
		private String nation;
		private String mail;
		private String photo;
		private String web;
		private String create_date;
		private String remark;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getNation() {
			return nation;
		}
		public void setNation(String nation) {
			this.nation = nation;
		}
		public String getMail() {
			return mail;
		}
		public void setMail(String mail) {
			this.mail = mail;
		}
		public String getPhoto() {
			return photo;
		}
		public void setPhoto(String photo) {
			this.photo = photo;
		}
		public String getWeb() {
			return web;
		}
		public void setWeb(String web) {
			this.web = web;
		}
		public String getCreate_date() {
			return create_date;
		}
		public void setCreate_date(String create_date) {
			this.create_date = create_date;
		}
		
		public String getRemark() {
			return remark;
		}
		public void setRemark(String remark) {
			this.remark = remark;
		}
		public Object elementAt(int column){
			switch(column)
			{
				case 0:
					return this.id;
				case 1:
					return this.name;
				case 2:
					return this.nation;
				case 3:
					return this.mail;
				case 4:
					return this.photo;
				case 5:
					return this.web;
				case 6:
					return this.create_date;
				case 7:
					return this.remark;
				default:
					return null;
					
			}
				
		}
}
