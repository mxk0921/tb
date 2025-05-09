package com.alibaba.security.ccrc.service.build;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class Aa implements AbstractC1154db {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AbstractC1154db f2540a;
    public final /* synthetic */ Ba b;

    public Aa(Ba ba, AbstractC1154db dbVar) {
        this.b = ba;
        this.f2540a = dbVar;
    }

    @Override // com.alibaba.security.ccrc.service.build.AbstractC1154db
    public void a(boolean z, String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2499ee8f", new Object[]{this, new Boolean(z), str, map});
        } else {
            this.f2540a.a(z, str, map);
        }
    }
}
