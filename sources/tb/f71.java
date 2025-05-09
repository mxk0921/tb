package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.nanocompose.megability.annotation.MegabilityExtParams;
import java.util.Map;

/* compiled from: Taobao */
@MegabilityExtParams
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class f71 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f19062a;
    public String b;
    public Map<String, ? extends Object> c;

    static {
        t2o.a(1022361616);
    }

    public final Map<String, Object> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("46c4490f", new Object[]{this});
        }
        return this.c;
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f72feefa", new Object[]{this});
        }
        return this.f19062a;
    }

    public final String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fedd06c4", new Object[]{this});
        }
        return this.b;
    }

    public final g1a<bi8, xhv> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g1a) ipChange.ipc$dispatch("aa60c0e2", new Object[]{this});
        }
        return null;
    }

    public final void e(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fb6655f", new Object[]{this, map});
        } else {
            this.c = map;
        }
    }

    public final void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("710bac24", new Object[]{this, str});
        } else {
            this.f19062a = str;
        }
    }

    public final void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d624632", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }
}
