package com.tanx.exposer.achieve;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public enum AdMonitorType {
    CLICK("点击"),
    EXPOSE("曝光"),
    INTERACT("互动");
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String description;

    AdMonitorType(String str) {
        this.description = str;
    }

    public static boolean inSystemTypes(AdMonitorType adMonitorType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e07ce797", new Object[]{adMonitorType})).booleanValue();
        }
        if (adMonitorType == null) {
            return false;
        }
        if (adMonitorType == CLICK || adMonitorType == EXPOSE || adMonitorType == INTERACT) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ Object ipc$super(AdMonitorType adMonitorType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/tanx/exposer/achieve/AdMonitorType");
    }

    public static AdMonitorType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AdMonitorType) ipChange.ipc$dispatch("4972b064", new Object[]{str});
        }
        return (AdMonitorType) Enum.valueOf(AdMonitorType.class, str);
    }
}
