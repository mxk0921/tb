package com.zoloz.android.phone.zdoc.module;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class CollModule implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String icons;
    private int retryLimit = 3;
    private int scanTimeout = 30;
    private int uiType = -1;
    private int pageNo = 1;
    private String docType = "006200001";
    private int algoType = 1;

    static {
        t2o.a(245366957);
    }

    public int getAlgoType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8a6e949d", new Object[]{this})).intValue();
        }
        return this.algoType;
    }

    public String getDocType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ab09d81d", new Object[]{this});
        }
        return this.docType;
    }

    public String getIcons() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8b59bc15", new Object[]{this});
        }
        return this.icons;
    }

    public int getPageNo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("320a6920", new Object[]{this})).intValue();
        }
        return this.pageNo;
    }

    public int getRetryLimit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bd72c1e3", new Object[]{this})).intValue();
        }
        return this.retryLimit;
    }

    public int getScanTimeout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("30c8ec68", new Object[]{this})).intValue();
        }
        return this.scanTimeout;
    }

    public int getUiType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3f5b3d5e", new Object[]{this})).intValue();
        }
        return this.uiType;
    }

    public void setAlgoType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("563ada0d", new Object[]{this, new Integer(i)});
        } else {
            this.algoType = i;
        }
    }

    public void setDocType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd34b461", new Object[]{this, str});
        } else {
            this.docType = str;
        }
    }

    public void setIcons(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cb65c69", new Object[]{this, str});
        } else {
            this.icons = str;
        }
    }

    public void setPageNo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5a8a2ea", new Object[]{this, new Integer(i)});
        } else {
            this.pageNo = i;
        }
    }

    public void setRetryLimit(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27bc8887", new Object[]{this, new Integer(i)});
        } else {
            this.retryLimit = i;
        }
    }

    public void setScanTimeout(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c51aa3a", new Object[]{this, new Integer(i)});
        } else {
            this.scanTimeout = i;
        }
    }

    public void setUiType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4272566c", new Object[]{this, new Integer(i)});
        } else {
            this.uiType = i;
        }
    }
}
