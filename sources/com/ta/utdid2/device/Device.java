package com.ta.utdid2.device;

import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class Device {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String imei = "";
    private String imsi = "";
    private String deviceId = "";
    private String utdid = "";
    private long mCreateTimestamp = 0;
    private long mCheckSum = 0;

    static {
        t2o.a(966787126);
    }

    public long getCheckSum() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ee7e3194", new Object[]{this})).longValue();
        }
        return this.mCheckSum;
    }

    public long getCreateTimestamp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("32b817bf", new Object[]{this})).longValue();
        }
        return this.mCreateTimestamp;
    }

    public String getDeviceId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("79a7d1d2", new Object[]{this});
        }
        return this.deviceId;
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

    public String getUtdid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3fdfad6f", new Object[]{this});
        }
        return this.utdid;
    }

    public void setCheckSum(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("741edf98", new Object[]{this, new Long(j)});
        } else {
            this.mCheckSum = j;
        }
    }

    public void setCreateTimestamp(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e9e8765", new Object[]{this, new Long(j)});
        } else {
            this.mCreateTimestamp = j;
        }
    }

    public void setDeviceId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("462fc2e4", new Object[]{this, str});
        } else {
            this.deviceId = str;
        }
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

    public void setUtdid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68ee964f", new Object[]{this, str});
        } else {
            this.utdid = str;
        }
    }
}
