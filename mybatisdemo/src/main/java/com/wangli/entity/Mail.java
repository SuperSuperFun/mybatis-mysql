package com.wangli.entity;

import java.util.Date;

/**
 * @author wangli
 */
public class Mail {
    private Long id;

    private Date createTime;

    private Date modifyTime;

    //网站id, 1-新浪 2-QQ 3-网易
    private Integer webId;

    //邮箱
    private String mail;

    //用途
    private String useFor;

    public Mail() {

    }

    public Mail(int webId, String mail, String useFor) {
        this.webId = webId;
        this.mail = mail;
        this.useFor = useFor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Integer getWebId() {
        return webId;
    }

    public void setWebId(Integer webId) {
        this.webId = webId;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getUseFor() {
        return useFor;
    }

    public void setUseFor(String useFor) {
        this.useFor = useFor;
    }

    @Override
    public String toString() {
        return "Mail{" +
                "id=" + id +
                ", createTime=" + createTime +
                ", modifyTime=" + modifyTime +
                ", webId=" + webId +
                ", mail='" + mail + '\'' +
                ", useFor='" + useFor + '\'' +
                '}';
    }
}
