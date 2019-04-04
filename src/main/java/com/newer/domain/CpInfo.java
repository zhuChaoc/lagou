package com.newer.domain;

import java.io.Serializable;

/**
 * 公司背景类
 */
public class CpInfo implements Serializable {
    private Integer id;//公司背景id
    private String cpTig;//公司标签
    private String cpLongInfo;//公司介绍

    public CpInfo() {
    }

    public CpInfo(Integer id, String cpTig, String cpLongInfo) {
        this.id = id;
        this.cpTig = cpTig;
        this.cpLongInfo = cpLongInfo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCpTig() {
        return cpTig;
    }

    public void setCpTig(String cpTig) {
        this.cpTig = cpTig;
    }

    public String getCpLongInfo() {
        return cpLongInfo;
    }

    public void setCpLongInfo(String cpLongInfo) {
        this.cpLongInfo = cpLongInfo;
    }
}
