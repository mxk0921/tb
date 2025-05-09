package com.alipay.android.msp.model;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class TaobaoModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f3699a = "";
    public String b = "";
    public String c = "";
    public String d = "";

    public String getPayOrderId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f9ca022", new Object[]{this});
        }
        return this.c;
    }

    public String getReturnUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("78c16730", new Object[]{this});
        }
        return this.f3699a;
    }

    public String getShowUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("30af737d", new Object[]{this});
        }
        return this.b;
    }

    public String getTradeNo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("59e3704a", new Object[]{this});
        }
        return this.d;
    }

    public void setPayOrderId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cae0eb94", new Object[]{this, str});
        } else {
            this.c = str;
        }
    }

    public void setReturnUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21a93aae", new Object[]{this, str});
        } else {
            this.f3699a = str;
        }
    }

    public void setShowUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec428501", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    public void setTradeNo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e98e21d4", new Object[]{this, str});
        } else {
            this.d = str;
        }
    }
}
