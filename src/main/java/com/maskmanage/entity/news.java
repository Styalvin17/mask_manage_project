package com.maskmanage.entity;

import java.util.Date;

public class news {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column news.newsId
     *
     * @mbggenerated Sat May 30 09:44:25 CST 2020
     */
    private Integer newsid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column news.newsTitle
     *
     * @mbggenerated Sat May 30 09:44:25 CST 2020
     */
    private String newstitle;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column news.newsAdminId
     *
     * @mbggenerated Sat May 30 09:44:25 CST 2020
     */
    private Integer newsadminid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column news.newsContent
     *
     * @mbggenerated Sat May 30 09:44:25 CST 2020
     */
    private String newscontent;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column news.authorName
     *
     * @mbggenerated Sat May 30 09:44:25 CST 2020
     */
    private String authorname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column news.newsPubTime
     *
     * @mbggenerated Sat May 30 09:44:25 CST 2020
     */
    private Date newspubtime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column news.newsId
     *
     * @return the value of news.newsId
     *
     * @mbggenerated Sat May 30 09:44:25 CST 2020
     */
    public Integer getNewsid() {
        return newsid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column news.newsId
     *
     * @param newsid the value for news.newsId
     *
     * @mbggenerated Sat May 30 09:44:25 CST 2020
     */
    public void setNewsid(Integer newsid) {
        this.newsid = newsid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column news.newsTitle
     *
     * @return the value of news.newsTitle
     *
     * @mbggenerated Sat May 30 09:44:25 CST 2020
     */
    public String getNewstitle() {
        return newstitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column news.newsTitle
     *
     * @param newstitle the value for news.newsTitle
     *
     * @mbggenerated Sat May 30 09:44:25 CST 2020
     */
    public void setNewstitle(String newstitle) {
        this.newstitle = newstitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column news.newsAdminId
     *
     * @return the value of news.newsAdminId
     *
     * @mbggenerated Sat May 30 09:44:25 CST 2020
     */
    public Integer getNewsadminid() {
        return newsadminid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column news.newsAdminId
     *
     * @param newsadminid the value for news.newsAdminId
     *
     * @mbggenerated Sat May 30 09:44:25 CST 2020
     */
    public void setNewsadminid(Integer newsadminid) {
        this.newsadminid = newsadminid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column news.newsContent
     *
     * @return the value of news.newsContent
     *
     * @mbggenerated Sat May 30 09:44:25 CST 2020
     */
    public String getNewscontent() {
        return newscontent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column news.newsContent
     *
     * @param newscontent the value for news.newsContent
     *
     * @mbggenerated Sat May 30 09:44:25 CST 2020
     */
    public void setNewscontent(String newscontent) {
        this.newscontent = newscontent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column news.authorName
     *
     * @return the value of news.authorName
     *
     * @mbggenerated Sat May 30 09:44:25 CST 2020
     */
    public String getAuthorname() {
        return authorname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column news.authorName
     *
     * @param authorname the value for news.authorName
     *
     * @mbggenerated Sat May 30 09:44:25 CST 2020
     */
    public void setAuthorname(String authorname) {
        this.authorname = authorname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column news.newsPubTime
     *
     * @return the value of news.newsPubTime
     *
     * @mbggenerated Sat May 30 09:44:25 CST 2020
     */
    public Date getNewspubtime() {
        return newspubtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column news.newsPubTime
     *
     * @param newspubtime the value for news.newsPubTime
     *
     * @mbggenerated Sat May 30 09:44:25 CST 2020
     */
    public void setNewspubtime(Date newspubtime) {
        this.newspubtime = newspubtime;
    }
}