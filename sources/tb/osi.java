package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.asi;
import tb.gy;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class osi<C extends asi> extends gy.c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public C l;
    public boolean m;
    public boolean n;
    public boolean o = true;
    public boolean p;
    public Map<String, String> q;

    static {
        t2o.a(993001491);
    }

    public osi(boolean z, Object obj, boolean z2, boolean z3) {
        super(new gy.c.a().k(z).j(z2).n(obj).r(z3));
    }

    public static /* synthetic */ Object ipc$super(osi osiVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/meta/data/MetaSearchConfig");
    }

    public final C m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (C) ((asi) ipChange.ipc$dispatch("d8503f8f", new Object[]{this}));
        }
        return this.l;
    }

    public final Map<String, String> n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a59805b8", new Object[]{this});
        }
        return this.q;
    }

    public final boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b2d48b2d", new Object[]{this})).booleanValue();
        }
        return this.o;
    }

    public final boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ea496018", new Object[]{this})).booleanValue();
        }
        return this.n;
    }

    public final boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cedb124e", new Object[]{this})).booleanValue();
        }
        return this.p;
    }

    public final boolean r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6fb52d9e", new Object[]{this})).booleanValue();
        }
        return this.m;
    }

    public final osi<C> s(C c) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (osi) ipChange.ipc$dispatch("3abce477", new Object[]{this, c});
        }
        this.l = c;
        if (c != null) {
            c.L(this);
        }
        return this;
    }

    public final osi<C> t(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (osi) ipChange.ipc$dispatch("a35f8f22", new Object[]{this, map});
        }
        this.q = map;
        return this;
    }

    public final osi<C> u(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (osi) ipChange.ipc$dispatch("f13bf487", new Object[]{this, new Boolean(z)});
        }
        this.o = z;
        return this;
    }

    public final void v(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf9478", new Object[]{this, new Boolean(z)});
        } else {
            this.n = z;
        }
    }

    public final osi<C> w(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (osi) ipChange.ipc$dispatch("40483eb6", new Object[]{this, new Boolean(z)});
        }
        this.p = z;
        return this;
    }

    public final osi<C> x(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (osi) ipChange.ipc$dispatch("8771a9f6", new Object[]{this, new Boolean(z)});
        }
        this.m = z;
        return this;
    }
}
