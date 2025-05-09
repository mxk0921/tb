package com.taobao.falco;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.falco.f;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class l implements f.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f10471a = "";
    public long b = -1;
    public long c = -1;
    public String d = "";
    public int e = -1;
    public int f = -1;
    public int g = -1;
    public long h = -1;

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "launchType=" + this.f10471a + ", launchStart=" + this.b + ", launchLeave=" + this.c + ", installType=" + this.d + ", isFirstLaunch=" + this.e + ", launchStatus=" + this.f + ", systemRecovery=" + this.g + ", lastColdStart=" + this.h;
    }

    @Override // com.taobao.falco.f.a
    public int type() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d79de6b4", new Object[]{this})).intValue();
        }
        return 3;
    }
}
