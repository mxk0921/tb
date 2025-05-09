package com.alibaba.security.ccrc.service.build;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* renamed from: com.alibaba.security.ccrc.service.build.ga  reason: case insensitive filesystem */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class C1162ga {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, Object> f2592a = new HashMap();
    public static final Map<String, C1162ga> b = new HashMap();
    public final Map<String, Object> c = new HashMap();

    public C1162ga(String str) {
        b.put(str, this);
    }

    public void a(String str, Object obj, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb14d106", new Object[]{this, str, obj, new Boolean(z)});
        } else if (z) {
            f2592a.put(str, obj);
        } else {
            this.c.put(str, obj);
        }
    }

    public Map<String, Object> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("a014a89d", new Object[]{this}) : this.c;
    }

    public static Map<String, Object> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("bf3e1ee7", new Object[]{str});
        }
        C1162ga gaVar = b.get(str);
        if (gaVar == null) {
            return f2592a;
        }
        Map<String, Object> a2 = gaVar.a();
        a2.putAll(f2592a);
        return a2;
    }
}
