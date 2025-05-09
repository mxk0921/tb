package com.alipay.android.phone.iifaa.did.model;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class DocumentSignData {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String document;
    public String sign;
    public String signVmId;

    public String getDocument() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2679508", new Object[]{this});
        }
        return this.document;
    }

    public String getSign() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ee91d6a6", new Object[]{this});
        }
        return this.sign;
    }

    public String getSignVmId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7fb18514", new Object[]{this});
        }
        return this.signVmId;
    }

    public void setDocument(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d568666e", new Object[]{this, str});
        } else {
            this.document = str;
        }
    }

    public void setSign(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78283e90", new Object[]{this, str});
        } else {
            this.sign = str;
        }
    }

    public void setSignVmId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15c77e2", new Object[]{this, str});
        } else {
            this.signVmId = str;
        }
    }
}
