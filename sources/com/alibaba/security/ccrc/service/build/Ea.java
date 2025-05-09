package com.alibaba.security.ccrc.service.build;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class Ea implements AbstractC1176l {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ List f2550a;
    public final /* synthetic */ Ja b;

    public Ea(Ja ja, List list) {
        this.b = ja;
        this.f2550a = list;
    }

    @Override // com.alibaba.security.ccrc.service.build.AbstractC1176l
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        return this.b.a(this.f2550a);
    }
}
