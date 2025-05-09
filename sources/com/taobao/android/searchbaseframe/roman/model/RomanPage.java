package com.taobao.android.searchbaseframe.roman.model;

import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.Objects;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class RomanPage implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = "u")
    private String pageUrl;
    @JSONField(name = "p")
    private boolean preload;
    @JSONField(name = "s")
    private double sversion;
    @JSONField(name = "v")
    private int version;

    static {
        t2o.a(993001942);
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RomanPage romanPage = (RomanPage) obj;
        if (Double.compare(romanPage.sversion, this.sversion) == 0 && this.version == romanPage.version && this.preload == romanPage.preload && this.pageUrl.equals(romanPage.pageUrl)) {
            return true;
        }
        return false;
    }

    public String getPageUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("72d4e50f", new Object[]{this});
        }
        return this.pageUrl;
    }

    public double getSversion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fec05170", new Object[]{this})).doubleValue();
        }
        return this.sversion;
    }

    public int getVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2d6bc1c", new Object[]{this})).intValue();
        }
        return this.version;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        return Objects.hash(Double.valueOf(this.sversion), Integer.valueOf(this.version), this.pageUrl, Boolean.valueOf(this.preload));
    }

    public boolean isPreload() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("85a6628a", new Object[]{this})).booleanValue();
        }
        return this.preload;
    }

    public void setPageUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eecb45af", new Object[]{this, str});
        } else {
            this.pageUrl = str;
        }
    }

    public void setPreload(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3c33c46", new Object[]{this, new Boolean(z)});
        } else {
            this.preload = z;
        }
    }

    public void setSversion(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c20a570", new Object[]{this, new Double(d)});
        } else {
            this.sversion = d;
        }
    }

    public void setVersion(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e4a3706", new Object[]{this, new Integer(i)});
        } else {
            this.version = i;
        }
    }
}
