package com.alibaba.security.ccrc.service.build;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class D {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static final String f2548a = "PrepareWatcher";
    public final List<AbstractC1191t> b = new ArrayList();

    public synchronized void a(AbstractC1191t tVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42288050", new Object[]{this, tVar});
        } else {
            this.b.add(tVar);
        }
    }

    public void a(boolean z, String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2499ee8f", new Object[]{this, new Boolean(z), str, map});
        } else if (!this.b.isEmpty()) {
            for (AbstractC1191t tVar : this.b) {
                tVar.a(z, str, map);
            }
            this.b.clear();
        }
    }
}
