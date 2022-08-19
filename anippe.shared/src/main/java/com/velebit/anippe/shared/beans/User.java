package com.velebit.anippe.shared.beans;

public class User implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    private Integer id;
    private String firstName;
    private String lastName;
    private Integer organisationId;
    private String username;
    private String password;
    private boolean administrator;
    private boolean active;
    private String themeType;
    private boolean denseMode;
    private boolean superAdministrator;

    public boolean isSuperAdministrator() {
        return superAdministrator;
    }

    public void setSuperAdministrator(boolean superAdministrator) {
        this.superAdministrator = superAdministrator;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getOrganisationId() {
        return organisationId;
    }

    public void setOrganisationId(Integer organisationId) {
        this.organisationId = organisationId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isAdministrator() {
        return administrator;
    }

    public void setAdministrator(boolean administrator) {
        this.administrator = administrator;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getThemeType() {
        return themeType;
    }

    public void setThemeType(String themeType) {
        this.themeType = themeType;
    }

    public boolean isDenseMode() {
        return denseMode;
    }

    public void setDenseMode(boolean denseMode) {
        this.denseMode = denseMode;
    }
}
