package com.alibaba.security.ccrc.service.model;

import com.alibaba.security.ccrc.service.enums.WukongResultCode;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class WukongActivateRiskResult extends AbsWukongRiskResult {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public WukongResultCode resultCode;

    public static WukongActivateRiskResult create(WukongResultCode wukongResultCode, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WukongActivateRiskResult) ipChange.ipc$dispatch("3e01f977", new Object[]{wukongResultCode, str, str2, str3});
        }
        WukongActivateRiskResult wukongActivateRiskResult = new WukongActivateRiskResult();
        wukongActivateRiskResult.resultCode = wukongResultCode;
        wukongActivateRiskResult.errorMsg = str;
        wukongActivateRiskResult.ccrcCode = str2;
        wukongActivateRiskResult.pid = str3;
        return wukongActivateRiskResult;
    }

    public static /* synthetic */ Object ipc$super(WukongActivateRiskResult wukongActivateRiskResult, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/security/ccrc/service/model/WukongActivateRiskResult");
    }

    public boolean isSuccess() {
        boolean z;
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6049a784", new Object[]{this})).booleanValue();
        }
        WukongResultCode wukongResultCode = this.resultCode;
        if (wukongResultCode == null) {
            return false;
        }
        if (wukongResultCode == WukongResultCode.ACTIVATED) {
            z = true;
        } else {
            z = false;
        }
        if (wukongResultCode == WukongResultCode.ACTIVATE_SUCCESS) {
            z2 = true;
        }
        return z2 | z;
    }
}
