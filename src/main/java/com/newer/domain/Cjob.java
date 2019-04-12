package com.newer.domain;

import java.io.Serializable;

public class Cjob implements Serializable {
    private Integer id;
    private Integer jsid;
    private Integer jid;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getJsid() {
        return jsid;
    }

    public void setJsid(Integer jsid) {
        this.jsid = jsid;
    }

    public Integer getJid() {
        return jid;
    }

    public void setJid(Integer jid) {
        this.jid = jid;
    }
}
