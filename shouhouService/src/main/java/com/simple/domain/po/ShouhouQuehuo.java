package com.simple.domain.po;

import com.simple.common.crud.BaseModel;
import javax.persistence.*;
import java.util.*;
import java.math.*;
import javax.persistence.Transient;
import com.simple.annotation.HoldBegin;
import com.simple.annotation.HoldEnd;

@Table(name = "shouhou_quehuo")
public class ShouhouQuehuo extends BaseModel {
	private static final long serialVersionUID = 1L;
	/*产品名称[LIKE]**/
	@io.swagger.annotations.ApiModelProperty(value="产品名称[LIKE]",name="productName")
	private String productName;
	@Transient
	private String productNameLike;
	/*创建时间[GTE][LTE]**/
	@io.swagger.annotations.ApiModelProperty(value="创建时间[GTE][LTE]",name="createTime")
	private Date createTime;
	@Transient
	private Date createTimeGte;
	@Transient
	private Date createTimeLte;
	/*创建人**/
	@io.swagger.annotations.ApiModelProperty(value="创建人",name="createBy")
	private String createBy;
	/*更新时间**/
	@io.swagger.annotations.ApiModelProperty(value="更新时间",name="updateTime")
	private Date updateTime;
	/*更新人**/
	@io.swagger.annotations.ApiModelProperty(value="更新人",name="updateBy")
	private String updateBy;
	/*备注**/
	@io.swagger.annotations.ApiModelProperty(value="备注",name="remark")
	private String remark;
	public String  getProductName() {
		return productName;
	}
	public void setProductName(String _productName) {
		productName = _productName;
	}
	public String  getProductNameLike() {
		return productNameLike;
	}
	public void setProductNameLike( String _productNameLike) {
		productNameLike = _productNameLike;
	}
	public Date  getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date _createTime) {
		createTime = _createTime;
	}
	public Date getCreateTimeGte() {
		return createTimeGte;
	}
	public void setCreateTimeGte( Date _createTimeGte) {
		createTimeGte = _createTimeGte;
	}
	public Date getCreateTimeLte() {
		return createTimeLte;
	}
	public void setCreateTimeLte( Date _createTimeLte) {
		createTimeLte = _createTimeLte;
	}
	public String  getCreateBy() {
		return createBy;
	}
	public void setCreateBy(String _createBy) {
		createBy = _createBy;
	}
	public Date  getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date _updateTime) {
		updateTime = _updateTime;
	}
	public String  getUpdateBy() {
		return updateBy;
	}
	public void setUpdateBy(String _updateBy) {
		updateBy = _updateBy;
	}
	public String  getRemark() {
		return remark;
	}
	public void setRemark(String _remark) {
		remark = _remark;
	}



	public static enum Field
	{
		Id_ASC("`id` ASC"),Id_DESC("`id` DESC")
			,ProductName_ASC("`product_name` ASC"),ProductName_DESC("`product_name` DESC")
			,CreateTime_ASC("`create_time` ASC"),CreateTime_DESC("`create_time` DESC")
			,CreateBy_ASC("`create_by` ASC"),CreateBy_DESC("`create_by` DESC")
			,UpdateTime_ASC("`update_time` ASC"),UpdateTime_DESC("`update_time` DESC")
			,UpdateBy_ASC("`update_by` ASC"),UpdateBy_DESC("`update_by` DESC")
			,Remark_ASC("`remark` ASC"),Remark_DESC("`remark` DESC")
	;
		private String value;
		Field(String value){
			this.value = value;
		}
		public String getValue() {
			return value;
		}
		public void setCol(String value) {
			this.value = value;
		}
		@Override
		public String toString() {
			return this.getValue();
		}
	}
	
	public void setSortColumns(ShouhouQuehuo.Field... fields)
	{
		if (fields == null || fields.length == 0) {
			return;
		}
		for (int k = 0; k < fields.length; k++) {
			if (fields[k] == null) {
				return;
			}
		}
		StringBuilder sb = new StringBuilder(fields[0].toString());
		for (int k = 1; k < fields.length; k++) {
			sb.append(",");
			sb.append(fields[k].toString());
		}
		super.setSortColumns(sb.toString());
	}
	
	@Override
	public void setSortColumns(String sortColumns)
	{
		if (sortColumns == null || "".equals(sortColumns.trim())) {
			return;
		}
		if (sortColumns.contains(",")) {
			String[] cols = sortColumns.split(",");
			java.util.List<Field> fList = new java.util.ArrayList();
			for (int k = 0; k < cols.length; k++) {
				fList.add(Field.valueOf(cols[k]));
			}
			this.setSortColumns(fList.toArray(new Field[fList.size()]));
		} else {
			this.setSortColumns(Field.valueOf(sortColumns));
		}
	}
}
