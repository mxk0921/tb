package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class fe3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public IDMComponent f19227a;
    public lcu b;
    public boolean c;
    public String d;
    public Map<String, String> e;

    static {
        t2o.a(479199486);
    }

    public final Map<String, String> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("9b4ea2ef", new Object[]{this});
        }
        return this.e;
    }

    public final lcu b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lcu) ipChange.ipc$dispatch("c15f4540", new Object[]{this});
        }
        return this.b;
    }

    public final String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("60675578", new Object[]{this});
        }
        return this.d;
    }

    public final Object d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("340f8235", new Object[]{this});
        }
        return null;
    }

    public final boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57f53654", new Object[]{this})).booleanValue();
        }
        return this.c;
    }

    public final IDMComponent f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("6d202ba6", new Object[]{this});
        }
        return this.f19227a;
    }

    public final void g(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98705f17", new Object[]{this, map});
        } else {
            this.e = map;
        }
    }

    public final void h(lcu lcuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("840da894", new Object[]{this, lcuVar});
        } else {
            this.b = lcuVar;
        }
    }

    public final void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd4f7afe", new Object[]{this, str});
        } else {
            this.d = str;
        }
    }

    public final void j(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4aaedb90", new Object[]{this, new Boolean(z)});
        } else {
            this.c = z;
        }
    }

    public final void k(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4cd62866", new Object[]{this, iDMComponent});
        } else {
            this.f19227a = iDMComponent;
        }
    }
}
