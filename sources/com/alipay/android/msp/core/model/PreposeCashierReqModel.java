package com.alipay.android.msp.core.model;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class PreposeCashierReqModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f3555a;
    public int b;
    public String c;
    public String d;
    public String e;
    public String f;

    public String getExtinfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1e517680", new Object[]{this});
        }
        return this.f;
    }

    public int getHas_alipay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4f0f857f", new Object[]{this})).intValue();
        }
        return this.b;
    }

    public String getPa() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f5aa5972", new Object[]{this});
        }
        return this.f3555a;
    }

    public String getTid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("12a13f40", new Object[]{this});
        }
        return this.c;
    }

    public String getUa() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("68a257b7", new Object[]{this});
        }
        return this.d;
    }

    public String getUtdid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3fdfad6f", new Object[]{this});
        }
        return this.e;
    }

    public void setExtinfo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2e0e25e", new Object[]{this, str});
        } else {
            this.f = str;
        }
    }

    public void setHas_alipay(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9b8386b", new Object[]{this, new Integer(i)});
        } else {
            this.b = i;
        }
    }

    public void setPa(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("142e2844", new Object[]{this, str});
        } else {
            this.f3555a = str;
        }
    }

    public void setTid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30138b9e", new Object[]{this, str});
        } else {
            this.c = str;
        }
    }

    public void setUa(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35f29f", new Object[]{this, str});
        } else {
            this.d = str;
        }
    }

    public void setUtdid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68ee964f", new Object[]{this, str});
        } else {
            this.e = str;
        }
    }
}
