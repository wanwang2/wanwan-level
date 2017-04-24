/**
 *Author: Jiangtao He; Email: ross.jiangtao.he@gmail.com
 *File Name: T_Home.java
 *Date: 2011-12-30
 *Copyright: All right reserved by author - Jiangtao He
 *Description: 
 */
package org.wanwanframework.level.simplesql;

/**
 * Author: Jiangtao He
 * Since: MyJavaExpert v1.0
 */
public class T_HomeBean
{
    private String id;
    private String name;
    private String phone;
    private String email;
    private String address;

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getPhone()
    {
        return phone;
    }

    public void setPhone(String phone)
    {
        this.phone = phone;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }
}
