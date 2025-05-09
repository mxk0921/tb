package com.alibaba.security.ccrc.action;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public enum WukongActionCode {
    RISK_REPORT_ALGO_RESULT("CCRCReportAlgoResult"),
    RISK_BLOCKING_PAGE("ccrcRiskBlockingPage");
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String name;

    WukongActionCode(String str) {
        this.name = str;
    }

    public static /* synthetic */ Object ipc$super(WukongActionCode wukongActionCode, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/security/ccrc/action/WukongActionCode");
    }

    public static WukongActionCode valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WukongActionCode) ipChange.ipc$dispatch("6c3db023", new Object[]{str});
        }
        return (WukongActionCode) Enum.valueOf(WukongActionCode.class, str);
    }

    public String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return this.name;
    }
}
