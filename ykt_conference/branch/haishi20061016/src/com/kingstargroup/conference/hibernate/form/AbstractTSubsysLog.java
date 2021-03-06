/*
 * WARNING: DO NOT EDIT THIS FILE. This is a generated file that is synchronized
 * by MyEclipse Hibernate tool integration.
 *
 * Created Tue May 16 09:29:11 CST 2006 by MyEclipse Hibernate Tool.
 */
package com.kingstargroup.conference.hibernate.form;

import java.io.Serializable;

/**
 * A class that represents a row in the T_SUBSYS_LOG table. 
 * You can customize the behavior of this class by editing the class, {@link TSubsysLog()}.
 * WARNING: DO NOT EDIT THIS FILE. This is a generated file that is synchronized
 * by MyEclipse Hibernate tool integration.
 */
public abstract class AbstractTSubsysLog 
    implements Serializable
{
    /** The cached hash code value for this instance.  Settting to 0 triggers re-calculation. */
    private int hashValue = 0;

    /** The composite primary key value. */
    private java.lang.Integer id;

    /** The value of the simple custId property. */
    private java.lang.Integer custId;

    /** The value of the simple loginName property. */
    private java.lang.String loginName;

    /** The value of the simple logDate property. */
    private java.lang.String logDate;

    /** The value of the simple logTime property. */
    private java.lang.String logTime;

    /** The value of the simple flag property. */
    private java.lang.Integer flag;

    /** The value of the simple sussysId property. */
    private java.lang.Integer sussysId;

    /** The value of the simple comments property. */
    private java.lang.String comments;

    /**
     * Simple constructor of AbstractTSubsysLog instances.
     */
    public AbstractTSubsysLog()
    {
    }

    /**
     * Constructor of AbstractTSubsysLog instances given a simple primary key.
     * @param id
     */
    public AbstractTSubsysLog(java.lang.Integer id)
    {
        this.setId(id);
    }

    /**
     * Return the simple primary key value that identifies this object.
     * @return java.lang.Integer
     */
    public java.lang.Integer getId()
    {
        return id;
    }

    /**
     * Set the simple primary key value that identifies this object.
     * @param id
     */
    public void setId(java.lang.Integer id)
    {
        this.hashValue = 0;
        this.id = id;
    }

    /**
     * Return the value of the CUST_ID column.
     * @return java.lang.Integer
     */
    public java.lang.Integer getCustId()
    {
        return this.custId;
    }

    /**
     * Set the value of the CUST_ID column.
     * @param custId
     */
    public void setCustId(java.lang.Integer custId)
    {
        this.custId = custId;
    }

    /**
     * Return the value of the LOGIN_NAME column.
     * @return java.lang.String
     */
    public java.lang.String getLoginName()
    {
        return this.loginName;
    }

    /**
     * Set the value of the LOGIN_NAME column.
     * @param loginName
     */
    public void setLoginName(java.lang.String loginName)
    {
        this.loginName = loginName;
    }

    /**
     * Return the value of the LOG_DATE column.
     * @return java.lang.String
     */
    public java.lang.String getLogDate()
    {
        return this.logDate;
    }

    /**
     * Set the value of the LOG_DATE column.
     * @param logDate
     */
    public void setLogDate(java.lang.String logDate)
    {
        this.logDate = logDate;
    }

    /**
     * Return the value of the LOG_TIME column.
     * @return java.lang.String
     */
    public java.lang.String getLogTime()
    {
        return this.logTime;
    }

    /**
     * Set the value of the LOG_TIME column.
     * @param logTime
     */
    public void setLogTime(java.lang.String logTime)
    {
        this.logTime = logTime;
    }

    /**
     * Return the value of the FLAG column.
     * @return java.lang.Integer
     */
    public java.lang.Integer getFlag()
    {
        return this.flag;
    }

    /**
     * Set the value of the FLAG column.
     * @param flag
     */
    public void setFlag(java.lang.Integer flag)
    {
        this.flag = flag;
    }

    /**
     * Return the value of the SUSSYS_ID column.
     * @return java.lang.Integer
     */
    public java.lang.Integer getSussysId()
    {
        return this.sussysId;
    }

    /**
     * Set the value of the SUSSYS_ID column.
     * @param sussysId
     */
    public void setSussysId(java.lang.Integer sussysId)
    {
        this.sussysId = sussysId;
    }

    /**
     * Return the value of the COMMENTS column.
     * @return java.lang.String
     */
    public java.lang.String getComments()
    {
        return this.comments;
    }

    /**
     * Set the value of the COMMENTS column.
     * @param comments
     */
    public void setComments(java.lang.String comments)
    {
        this.comments = comments;
    }

    /**
     * Implementation of the equals comparison on the basis of equality of the primary key values.
     * @param rhs
     * @return boolean
     */
    public boolean equals(Object rhs)
    {
        if (rhs == null)
            return false;
        if (! (rhs instanceof TSubsysLog))
            return false;
        TSubsysLog that = (TSubsysLog) rhs;
        if (this.getId() == null || that.getId() == null)
            return false;
        return (this.getId().equals(that.getId()));
    }

    /**
     * Implementation of the hashCode method conforming to the Bloch pattern with
     * the exception of array properties (these are very unlikely primary key types).
     * @return int
     */
    public int hashCode()
    {
        if (this.hashValue == 0)
        {
            int result = 17;
            int idValue = this.getId() == null ? 0 : this.getId().hashCode();
            result = result * 37 + idValue;
            this.hashValue = result;
        }
        return this.hashValue;
    }
}
