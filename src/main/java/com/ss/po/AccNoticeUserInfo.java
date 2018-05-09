package com.ss.po;

/**
 * 通知人员表
 *
 * @author jintao
 * @date 2018/02/02
 */
public class AccNoticeUserInfo {

    /**
     * id 主键ID.
     */
    private Long id;
    /**
     * email 邮箱.
     */
    private String email;
    /**
     * mobile 手机号.
     */
    private String mobile;
    /**
     * userName 姓名.
     */
    private String userName;
    /**
     * status 状态,0-失效,1-有效.
     */
    private String status;

    public static AccNoticeUserInfo create(String userName, String email, String mobile, String status) {

        AccNoticeUserInfo accNoticeUserInfo = new AccNoticeUserInfo();
        accNoticeUserInfo.setUserName(userName);
        accNoticeUserInfo.setEmail(email);
        accNoticeUserInfo.setMobile(mobile);
        accNoticeUserInfo.setStatus(status);

        return accNoticeUserInfo;
    }

    /**
     * Set id 主键ID.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Get id 主键ID.
     *
     * @return the string
     */
    public Long getId() {
        return id;
    }

    /**
     * Set email 邮箱.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Get email 邮箱.
     *
     * @return the string
     */
    public String getEmail() {
        return email;
    }

    /**
     * Set mobile 手机号.
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * Get mobile 手机号.
     *
     * @return the string
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * Set userName 姓名.
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * Get userName 姓名.
     *
     * @return the string
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Set status 状态,0-失效,1-有效.
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Get status 状态,0-失效,1-有效.
     *
     * @return the string
     */
    public String getStatus() {
        return status;
    }


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("AccNoticeUserInfo{");
        sb.append("id=").append(id);
        sb.append(", email='").append(email).append('\'');
        sb.append(", mobile='").append(mobile).append('\'');
        sb.append(", userName='").append(userName).append('\'');
        sb.append(", status='").append(status).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
