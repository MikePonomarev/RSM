package ru.pmsoftware.rsm.model;

import java.util.Date;
import java.util.Set;

public class User extends NamedEntity {
    protected String email;

    protected String password;

    protected boolean enabled = true;

    protected Date registered = new Date();

    protected Set<Role> roles;

    private final String passportData;

    private int mobileNumber;

    public User(Integer id, String name, String passportData, int mobileNumber) {
        super(id, name);
        this.passportData = passportData;
        this.mobileNumber = mobileNumber;
    }

    public User(String email, String password, boolean enabled, Date registered, Set<Role> roles, String passportData, int mobileNumber) {
        this.email = email;
        this.password = password;
        this.enabled = enabled;
        this.registered = registered;
        this.roles = roles;
        this.passportData = passportData;
        this.mobileNumber = mobileNumber;
    }

    public String getPassportData() {
        return passportData;
    }

    public int getMobileNumber() {
        return mobileNumber;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    public void setMobileNumber(int mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getRegistered() {
        return registered;
    }

    public void setRegistered(Date registered) {
        this.registered = registered;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", enabled=" + enabled +
                ", registered=" + registered +
                ", roles=" + roles +
                ", passportData='" + passportData + '\'' +
                ", mobileNumber=" + mobileNumber +
                '}';
    }
}
