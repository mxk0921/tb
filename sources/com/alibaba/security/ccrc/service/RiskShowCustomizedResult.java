package com.alibaba.security.ccrc.service;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class RiskShowCustomizedResult implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String dataID;
    public String errorMsg;
    public boolean isRisk;
    public String sampleID;
    public boolean success;

    public RiskShowCustomizedResult(String str, String str2, boolean z, boolean z2, String str3) {
        this.sampleID = str;
        this.dataID = str2;
        this.isRisk = z;
        this.success = z2;
        this.errorMsg = str3;
    }

    public String getDataID() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9b05f89e", new Object[]{this});
        }
        return this.dataID;
    }

    public String getErrorMsg() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e1cc388a", new Object[]{this});
        }
        return this.errorMsg;
    }

    public String getSampleID() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("25281e", new Object[]{this});
        }
        return this.sampleID;
    }

    public boolean isRisk() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8fa29724", new Object[]{this})).booleanValue();
        }
        return this.isRisk;
    }

    public boolean isSuccess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6049a784", new Object[]{this})).booleanValue();
        }
        return this.success;
    }

    public RiskShowCustomizedResult(boolean z, boolean z2, String str) {
        this.isRisk = z;
        this.success = z2;
        this.errorMsg = str;
    }
}
