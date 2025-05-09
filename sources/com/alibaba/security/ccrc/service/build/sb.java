package com.alibaba.security.ccrc.service.build;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.qp0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class sb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, sb> f2621a = new HashMap();
    public Boolean b = null;

    public static synchronized sb a(String str) {
        synchronized (sb.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (sb) ipChange.ipc$dispatch("69eba719", new Object[]{str});
            }
            Map<String, sb> map = f2621a;
            sb sbVar = map.get(str);
            if (sbVar == null) {
                sbVar = new sb();
                map.put(str, sbVar);
            }
            return sbVar;
        }
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        Boolean bool = this.b;
        if (bool != null) {
            return bool.booleanValue();
        }
        return vb.c().r();
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : qp0.b() == 2;
    }

    public void a(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba62f9e5", new Object[]{this, bool});
        } else {
            this.b = bool;
        }
    }
}
