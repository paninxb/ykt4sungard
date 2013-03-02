package org.king.checkinmanage.domain;

import java.sql.Clob;
import java.sql.Timestamp;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * AbstractNoticemodel generated by MyEclipse - Hibernate Tools
 */

public abstract class AbstractNoticemodel extends
		org.king.framework.domain.BaseObject implements java.io.Serializable {

	// Fields

	private String id;

	private String noticeNo;

	private Timestamp createTime;

	private String title;

	private String body;

	private Timestamp updateTime;

	private String ifDeleted;

	private String creatorId;

	private String updatorId;

	private Set yxUploadfiles = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractNoticemodel() {
	}

	/** minimal constructor */
	public AbstractNoticemodel(Timestamp createTime, String ifDeleted,
			String creatorId, String updatorId) {
		this.createTime = createTime;
		this.ifDeleted = ifDeleted;
		this.creatorId = creatorId;
		this.updatorId = updatorId;
	}

	/** full constructor */
	public AbstractNoticemodel(String noticeNo, Timestamp createTime, String title,
			String body, Timestamp updateTime, String ifDeleted, String creatorId,
			String updatorId, Set yxUploadfiles) {
		this.noticeNo = noticeNo;
		this.createTime = createTime;
		this.title = title;
		this.body = body;
		this.updateTime = updateTime;
		this.ifDeleted = ifDeleted;
		this.creatorId = creatorId;
		this.updatorId = updatorId;
		this.yxUploadfiles = yxUploadfiles;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNoticeNo() {
		return this.noticeNo;
	}

	public void setNoticeNo(String noticeNo) {
		this.noticeNo = noticeNo;
	}

	public Timestamp getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return this.body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public Timestamp getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Timestamp updateTime) {
		this.updateTime = updateTime;
	}

	public String getIfDeleted() {
		return this.ifDeleted;
	}

	public void setIfDeleted(String ifDeleted) {
		this.ifDeleted = ifDeleted;
	}

	public String getCreatorId() {
		return this.creatorId;
	}

	public void setCreatorId(String creatorId) {
		this.creatorId = creatorId;
	}

	public String getUpdatorId() {
		return this.updatorId;
	}

	public void setUpdatorId(String updatorId) {
		this.updatorId = updatorId;
	}

	public Set getYxUploadfiles() {
		return this.yxUploadfiles;
	}

	public void setYxUploadfiles(Set yxUploadfiles) {
		this.yxUploadfiles = yxUploadfiles;
	}

	/**
	 * @see java.lang.Object#equals(Object)
	 */
	public boolean equals(Object object) {
		if (!(object instanceof AbstractNoticemodel)) {
			return false;
		}
		AbstractNoticemodel rhs = (AbstractNoticemodel) object;
		return new EqualsBuilder()
				.append(this.yxUploadfiles, rhs.yxUploadfiles).append(
						this.creatorId, rhs.creatorId).append(this.updateTime,
						rhs.updateTime).append(this.title, rhs.title).append(
						this.createTime, rhs.createTime).append(this.updatorId,
						rhs.updatorId).append(this.noticeNo, rhs.noticeNo)
				.append(this.body, rhs.body).append(this.id, rhs.id).append(
						this.ifDeleted, rhs.ifDeleted).isEquals();
	}

	/**
	 * @see java.lang.Object#hashCode()
	 */
	public int hashCode() {
		return new HashCodeBuilder(-1670131827, 466462431).append(
				this.yxUploadfiles).append(this.creatorId).append(
				this.updateTime).append(this.title).append(this.createTime)
				.append(this.updatorId).append(this.noticeNo).append(this.body)
				.append(this.id).append(this.ifDeleted).toHashCode();
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return new ToStringBuilder(this).append("yxUploadfiles",
				this.yxUploadfiles).append("updateTime", this.updateTime)
				.append("noticeNo", this.noticeNo).append("id", this.id)
				.append("updatorId", this.updatorId).append("body", this.body)
				.append("title", this.title).append("createTime",
						this.createTime).append("creatorId", this.creatorId)
				.append("ifDeleted", this.ifDeleted).toString();
	}

}