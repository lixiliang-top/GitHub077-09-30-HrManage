package cn.kgc.ssm.pojo;

import java.util.Date;

public class Assets {
    private Integer id;

    private String assetsid;

    private String assetsname;

    private String assetstype;

    private Date intodate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAssetsid() {
        return assetsid;
    }

    public void setAssetsid(String assetsid) {
        this.assetsid = assetsid == null ? null : assetsid.trim();
    }

    public String getAssetsname() {
        return assetsname;
    }

    public void setAssetsname(String assetsname) {
        this.assetsname = assetsname == null ? null : assetsname.trim();
    }

    public String getAssetstype() {
        return assetstype;
    }

    public void setAssetstype(String assetstype) {
        this.assetstype = assetstype == null ? null : assetstype.trim();
    }

    public Date getIntodate() {
        return intodate;
    }

    public void setIntodate(Date intodate) {
        this.intodate = intodate;
    }
}