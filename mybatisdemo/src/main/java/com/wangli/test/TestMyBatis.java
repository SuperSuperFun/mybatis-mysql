package com.wangli.test;

import com.wangli.dao.MailDao;
import com.wangli.dao.impl.MailDaoImpl;
import com.wangli.entity.Mail;
import org.junit.Test;

/**
 * @author wangli
 */
public class TestMyBatis {

    private static MailDao mailDao;

    static {
        mailDao = new MailDaoImpl();
    }

    @Test
    public void testInsert() {
        Mail mail1 = new Mail(3, "superior_555@126.com", "工作使用");
        Mail mail2 = new Mail(2, "2911675555@qq.com", "个人使用");
        Mail mail3 = new Mail(1, "helloworld@sina.com", "测试专用");
        System.out.println(mailDao.insertMail(mail1));
        System.out.println(mailDao.insertMail(mail2));
        System.out.println(mailDao.insertMail(mail3));
    }

    @Test
    public void testDelete() {
        System.out.println(mailDao.deleteMail(1));
    }

    @Test
    public void testUpdate() {
        Mail newMail = new Mail(2, "123456789@qq.com", "个人使用");
        newMail.setId(3L);
        System.out.println(mailDao.updateMail(newMail));
    }

    @Test
    public void testSelectList() {
        System.out.println(mailDao.selectMailList());
    }

    @Test
    public void testSelectOne() {
        System.out.println(mailDao.selectMailById(2));
    }

}
