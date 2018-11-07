package yycg.base.pojo.po;

public class Rolemodule {
    private String roleid;

    private String moduleid;

    private String vchar1;

    private String vchar2;

    public String getRoleid() {
        return roleid;
    }

    public void setRoleid(String roleid) {
        this.roleid = roleid == null ? null : roleid.trim();
    }

    public String getModuleid() {
        return moduleid;
    }

    public void setModuleid(String moduleid) {
        this.moduleid = moduleid == null ? null : moduleid.trim();
    }

    public String getVchar1() {
        return vchar1;
    }

    public void setVchar1(String vchar1) {
        this.vchar1 = vchar1 == null ? null : vchar1.trim();
    }

    public String getVchar2() {
        return vchar2;
    }

    public void setVchar2(String vchar2) {
        this.vchar2 = vchar2 == null ? null : vchar2.trim();
    }
}