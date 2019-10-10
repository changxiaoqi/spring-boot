package com.cxq.springboot.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * POJO:City
 * 
 * @author duia_builder
 * @date 2018-3-8
 */
@Table(name = "city")
public class City {
	@Id
	private Long id;
	@Column(name = "parent_id")
	private Long	parentId;		 /* 上级城市ID */
	@Column(name = "name")
	private String	name;		 /* 省份／尘世名称 */
	@Column(name = "spelling")
	private String	spelling;		 /* 拼音 */
	@Column(name = "jianpin")
	private String	jianpin;		 /* 简拼 */
	@Column(name = "level")
	private Integer	level;		 /*等级 */
	@Column(name = "sort")
	private Integer	sort;		 /* 排序 */
	@Column(name = "create_time")
	private Date createTime;
	@Column(name = "status")
	private Integer	status;		 /* 启用状态 0 未启用 1 启用 */

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpelling() {
		return spelling;
	}

	public void setSpelling(String spelling) {
		this.spelling = spelling;
	}

	public String getJianpin() {
		return jianpin;
	}

	public void setJianpin(String jianpin) {
		this.jianpin = jianpin;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public Integer getSort() {
		return sort;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Override
	public String toString() {
		return "City{" +
				"id=" + id +
				", parentId=" + parentId +
				", name='" + name + '\'' +
				", spelling='" + spelling + '\'' +
				", jianpin='" + jianpin + '\'' +
				", level=" + level +
				", sort=" + sort +
				", createTime=" + createTime +
				", status=" + status +
				'}';
	}
}
