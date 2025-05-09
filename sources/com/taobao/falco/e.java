package com.taobao.falco;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.falco.f;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class e implements f.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f10462a = "";
    public String b = "";
    public String c = "";
    public String d = "";

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "deviceType=" + this.f10462a + ", deviceLevel=" + this.b + ", deviceModel=" + this.c + ", deviceBrand=" + this.d;
    }

    @Override // com.taobao.falco.f.a
    public int type() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d79de6b4", new Object[]{this})).intValue();
        }
        return 9;
    }
}
