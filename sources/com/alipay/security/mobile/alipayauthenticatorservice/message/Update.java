package com.alipay.security.mobile.alipayauthenticatorservice.message;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class Update {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String downloadurl;
    public String sec_downloadurl;
    public String ta_md5;
    public String ta_version;
    public int version;

    public String getDownloadUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c9b30508", new Object[]{this});
        }
        return this.downloadurl;
    }

    public String getTa_downloadurl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fcbe25ce", new Object[]{this});
        }
        return this.sec_downloadurl;
    }

    public String getTa_md5() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1998a097", new Object[]{this});
        }
        return this.ta_md5;
    }

    public String getTa_version() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("44eb977d", new Object[]{this});
        }
        return this.ta_version;
    }

    public int getVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2d6bc1c", new Object[]{this})).intValue();
        }
        return this.version;
    }

    public void setDownloadurl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6e6af6", new Object[]{this, str});
        } else {
            this.downloadurl = str;
        }
    }

    public void setTa_downloadurl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abd2b568", new Object[]{this, str});
        } else {
            this.sec_downloadurl = str;
        }
    }

    public void setTa_md5(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9255fbf", new Object[]{this, str});
        } else {
            this.ta_md5 = str;
        }
    }

    public void setTa_version(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf70df99", new Object[]{this, str});
        } else {
            this.ta_version = str;
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
