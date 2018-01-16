package com.wangli.dao;

import com.wangli.entity.Mail;

import java.util.List;

/**
 * @author wangli
 */
public interface MailDao {
    public long insertMail(Mail mail);

    public int deleteMail(long id);

    public int updateMail(Mail mail);

    public List<Mail> selectMailList();

    public Mail selectMailById(long id);
}
