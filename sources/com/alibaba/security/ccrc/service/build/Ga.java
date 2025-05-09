package com.alibaba.security.ccrc.service.build;

import com.alibaba.security.ccrc.common.util.JsonUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class Ga implements AbstractC1151cb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ boolean[] f2555a;
    public final /* synthetic */ List b;
    public final /* synthetic */ AtomicInteger c;
    public final /* synthetic */ AbstractC1154db d;
    public final /* synthetic */ Ja e;

    public Ga(Ja ja, boolean[] zArr, List list, AtomicInteger atomicInteger, AbstractC1154db dbVar) {
        this.e = ja;
        this.f2555a = zArr;
        this.b = list;
        this.c = atomicInteger;
        this.d = dbVar;
    }

    @Override // com.alibaba.security.ccrc.service.build.AbstractC1151cb
    public void a(boolean z, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7197a36", new Object[]{this, new Boolean(z), str});
            return;
        }
        boolean[] zArr = this.f2555a;
        zArr[0] = zArr[0] & z;
        if (!z) {
            this.b.add(str);
        }
        if (this.c.decrementAndGet() == 0) {
            if (!this.f2555a[0]) {
                Ja ja = this.e;
                Ja.$ipChange.clear();
            }
            AbstractC1154db dbVar = this.d;
            boolean z2 = this.f2555a[0];
            if (z2) {
                str2 = null;
            } else {
                str2 = JsonUtils.toJSONString(this.b);
            }
            dbVar.a(z2, str2, null);
        }
    }
}
