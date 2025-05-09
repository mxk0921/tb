package com.taobao.android.order.bundle.dinamicX.module;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class CatapultComponent implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String businessGroup;
    public JSONObject data;
    public JSONObject extraData;
    private String md5;
    private int pageHeight;
    private String scm;
    private String url;

    static {
        t2o.a(713031776);
    }

    public String getBusinessGroup() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a936fb0", new Object[]{this});
        }
        return this.businessGroup;
    }

    public JSONObject getData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b8351bc7", new Object[]{this});
        }
        return this.data;
    }

    public JSONObject getExtraData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("fcd272cb", new Object[]{this});
        }
        return this.extraData;
    }

    public String getMd5() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("91115b1", new Object[]{this});
        }
        return this.md5;
    }

    public int getPageHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c58e8f06", new Object[]{this})).intValue();
        }
        return this.pageHeight;
    }

    public String getScm() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1429a872", new Object[]{this});
        }
        return this.scm;
    }

    public String getUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this});
        }
        return this.url;
    }

    public void setBusinessGroup(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c7a682e", new Object[]{this, str});
        } else {
            this.businessGroup = str;
        }
    }

    public void setData(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d09acf9d", new Object[]{this, jSONObject});
        } else {
            this.data = jSONObject;
        }
    }

    public void setExtraData(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f706a0b1", new Object[]{this, jSONObject});
        } else {
            this.extraData = jSONObject;
        }
    }

    public void setMd5(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79e834d", new Object[]{this, str});
        } else {
            this.md5 = str;
        }
    }

    public void setPageHeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("231a5fc4", new Object[]{this, new Integer(i)});
        } else {
            this.pageHeight = i;
        }
    }

    public void setScm(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f9848ac", new Object[]{this, str});
        } else {
            this.scm = str;
        }
    }

    public void setUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1dea87e", new Object[]{this, str});
        } else {
            this.url = str;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "CatapultComponent{businessGroup=" + this.businessGroup + ", scm=" + this.scm + ", pageHeight=" + this.pageHeight + ", url='" + this.url + "', md5='" + this.md5 + ", extraData='" + this.extraData + "', data='" + this.data + '}';
    }
}
