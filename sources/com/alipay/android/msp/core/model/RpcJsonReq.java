package com.alipay.android.msp.core.model;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class RpcJsonReq {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String dN;
    private String dO;
    private String dP;
    private String external_info;
    private String extinfo;
    private String pa;
    private String tid;
    private String ua;
    private String utdid;

    public String getBp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c8c9e735", new Object[]{this});
        }
        return this.dN;
    }

    public String getExternal_info() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("11dc9d8d", new Object[]{this});
        }
        return this.external_info;
    }

    public String getExtinfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1e517680", new Object[]{this});
        }
        return this.extinfo;
    }

    public String getExtok() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5df64f52", new Object[]{this});
        }
        return this.dP;
    }

    public String getNew_client_key() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d1ea6219", new Object[]{this});
        }
        return this.dO;
    }

    public String getPa() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f5aa5972", new Object[]{this});
        }
        return this.pa;
    }

    public String getTid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("12a13f40", new Object[]{this});
        }
        return this.tid;
    }

    public String getUa() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("68a257b7", new Object[]{this});
        }
        return this.ua;
    }

    public String getUtdid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3fdfad6f", new Object[]{this});
        }
        return this.utdid;
    }

    public void setBp(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a50052e1", new Object[]{this, str});
        } else {
            this.dN = str;
        }
    }

    public void setExternal_info(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e56f5f1", new Object[]{this, str});
        } else {
            this.external_info = str;
        }
    }

    public void setExtinfo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2e0e25e", new Object[]{this, str});
        } else {
            this.extinfo = str;
        }
    }

    public void setExtok(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dac30cc", new Object[]{this, str});
        } else {
            this.dP = str;
        }
    }

    public void setNew_client_key(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c2e027d", new Object[]{this, str});
        } else {
            this.dO = str;
        }
    }

    public void setPa(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("142e2844", new Object[]{this, str});
        } else {
            this.pa = str;
        }
    }

    public void setTid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30138b9e", new Object[]{this, str});
        } else {
            this.tid = str;
        }
    }

    public void setUa(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35f29f", new Object[]{this, str});
        } else {
            this.ua = str;
        }
    }

    public void setUtdid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68ee964f", new Object[]{this, str});
        } else {
            this.utdid = str;
        }
    }
}
