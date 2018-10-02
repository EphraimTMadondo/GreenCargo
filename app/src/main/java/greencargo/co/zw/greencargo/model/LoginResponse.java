package greencargo.co.zw.greencargo.model;

import java.util.List;

public class LoginResponse {
    private int id;
    private List<String> roles;
    private String username;
    private boolean accessAllowed;
    private int systemId;
    private String applicationUID;
    private String message;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean isAccessAllowed() {
        return accessAllowed;
    }

    public void setAccessAllowed(boolean accessAllowed) {
        this.accessAllowed = accessAllowed;
    }

    public int getSystemId() {
        return systemId;
    }

    public void setSystemId(int systemId) {
        this.systemId = systemId;
    }

    public String getApplicationUID() {
        return applicationUID;
    }

    public void setApplicationUID(String applicationUID) {
        this.applicationUID = applicationUID;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LoginResponse() {

    }

    public LoginResponse(int id, List<String> roles, String username, boolean accessAllowed, int systemId, String applicationUID, String message) {

        this.id = id;
        this.roles = roles;
        this.username = username;
        this.accessAllowed = accessAllowed;
        this.systemId = systemId;
        this.applicationUID = applicationUID;
        this.message = message;
    }
}
