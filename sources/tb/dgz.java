package tb;

import com.alibaba.ability.hub.AbilityHubAdapter;
import com.android.alibaba.ip.runtime.IpChange;
import tb.m9z;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class dgz implements m9z {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final n9z f17807a;
    public final AbilityHubAdapter b;

    static {
        t2o.a(598737367);
        t2o.a(598737362);
    }

    public dgz(n9z n9zVar) {
        ckf.g(n9zVar, "exprContext");
        this.f17807a = n9zVar;
        this.b = n9zVar.h();
    }

    @Override // tb.m9z
    public n9z a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n9z) ipChange.ipc$dispatch("1b5068ce", new Object[]{this});
        }
        return m9z.a.a(this);
    }

    @Override // tb.m9z
    public kdb b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kdb) ipChange.ipc$dispatch("341709c5", new Object[]{this});
        }
        xq xqVar = new xq();
        xqVar.l().a(this.f17807a.getUIContext());
        return xqVar;
    }

    @Override // tb.m9z
    public AbilityHubAdapter e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AbilityHubAdapter) ipChange.ipc$dispatch("82bec76f", new Object[]{this});
        }
        return this.b;
    }
}
