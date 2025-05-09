package com.etao.feimagesearch.capture.scan;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public enum ScanMode {
    ACCURATE_MODE("accurate"),
    TOUGH_MODE("tough");
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String mode;

    ScanMode(String str) {
        this.mode = str;
    }

    public static /* synthetic */ Object ipc$super(ScanMode scanMode, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/capture/scan/ScanMode");
    }

    public static ScanMode valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScanMode) ipChange.ipc$dispatch("ea615452", new Object[]{str});
        }
        return (ScanMode) Enum.valueOf(ScanMode.class, str);
    }

    public String getScanMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2ef64183", new Object[]{this});
        }
        return this.mode;
    }
}
