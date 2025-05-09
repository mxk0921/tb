package com.taobao.statistic.core;

import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class Device {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String udid = "";
    private String imei = "";
    private String imsi = "";

    static {
        t2o.a(962593131);
    }

    public String getImei() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7fb5387b", new Object[]{this});
        }
        return this.imei;
    }

    public String getImsi() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8e6b9a09", new Object[]{this});
        }
        return this.imsi;
    }

    public String getUdid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5e148e99", new Object[]{this});
        }
        return this.udid;
    }

    public void setImei(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b71175b", new Object[]{this, str});
        } else {
            this.imei = str;
        }
    }

    public void setImsi(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d386e78d", new Object[]{this, str});
        } else {
            this.imsi = str;
        }
    }

    public void setUdid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8fc84fd", new Object[]{this, str});
        } else {
            this.udid = str;
        }
    }
}
