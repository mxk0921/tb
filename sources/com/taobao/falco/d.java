package com.taobao.falco;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.falco.f;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class d implements f.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f10461a = -1;
    public float b = -1.0f;
    public float c = -1.0f;

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "cpuCores=" + this.f10461a + ", deviceCpuUsage=" + this.b + ", appCpuUsage=" + this.c;
    }

    @Override // com.taobao.falco.f.a
    public int type() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d79de6b4", new Object[]{this})).intValue();
        }
        return 7;
    }
}
