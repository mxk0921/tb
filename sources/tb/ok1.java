package tb;

import com.alipay.mobile.common.logging.api.LogContext;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ok1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f25438a;
    public final Set<Integer> b = new LinkedHashSet();
    public final Set<Integer> c = new LinkedHashSet();

    static {
        t2o.a(481297026);
    }

    public final Set<Integer> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("360626a8", new Object[]{this});
        }
        return this.b;
    }

    public final Set<Integer> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("623c38d7", new Object[]{this});
        }
        return this.c;
    }

    public final boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7068e830", new Object[]{this})).booleanValue();
        }
        String str = this.f25438a;
        if (str == null) {
            return false;
        }
        return wsq.O(str, "6", false, 2, null);
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        this.c.clear();
        this.b.clear();
        this.f25438a = null;
    }

    public final void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5513ff48", new Object[]{this, str});
        } else {
            this.f25438a = str;
        }
    }

    public final Map<String, String> a(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("cb1096ad", new Object[]{this, new Boolean(z), new Boolean(z2), new Boolean(z3), new Boolean(z4), new Boolean(z5)});
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!this.c.isEmpty()) {
            linkedHashMap.put("tipID", i04.j0(this.c, ",", null, null, 0, null, null, 62, null));
        }
        if (z) {
            this.b.add(2);
        }
        if (z3) {
            this.b.add(5);
        }
        if (!this.b.isEmpty()) {
            linkedHashMap.put(LogContext.LOCAL_STORAGE_ACTIONID, i04.j0(this.b, ",", null, null, 0, null, null, 62, null));
        }
        StringBuilder sb = new StringBuilder();
        if (z2) {
            sb.append("0,");
        }
        if (z4) {
            sb.append("1,");
        }
        linkedHashMap.put("stateID", sb.toString());
        if (d()) {
            linkedHashMap.put("TipID2", "6");
        }
        if (z5) {
            e();
        }
        return linkedHashMap;
    }
}
