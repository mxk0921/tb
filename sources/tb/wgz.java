package tb;

import android.content.Context;
import com.alibaba.ability.hub.AbilityHubAdapter;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.common.Constants;
import java.util.Map;
import tb.hhz;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class wgz implements n9z {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final jhz f30687a;

    static {
        t2o.a(598737321);
        t2o.a(598737318);
    }

    public wgz(jhz jhzVar) {
        ckf.g(jhzVar, "funcContext");
        this.f30687a = jhzVar;
    }

    @Override // tb.n9z
    public Map<?, ?> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8093f2fc", new Object[]{this});
        }
        return null;
    }

    @Override // tb.n9z
    public o9z b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o9z) ipChange.ipc$dispatch("f846a4b7", new Object[]{this});
        }
        return g().j();
    }

    @Override // tb.n9z
    public String c(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e4adcb34", new Object[]{this, new Integer(i)}) : g().b(i);
    }

    @Override // tb.n9z
    public void d(int i, hhz hhzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24f1f219", new Object[]{this, new Integer(i), hhzVar});
            return;
        }
        ckf.g(hhzVar, "value");
        g().p(i, hhzVar);
    }

    @Override // tb.n9z
    public dhz e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dhz) ipChange.ipc$dispatch("1360b6a5", new Object[]{this});
        }
        return g().i();
    }

    @Override // tb.n9z
    public hhz f(n7z n7zVar, hhz[] hhzVarArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hhz) ipChange.ipc$dispatch("4b70fa15", new Object[]{this, n7zVar, hhzVarArr});
        }
        ckf.g(n7zVar, "funcInfo");
        return g().n(n7zVar, hhzVarArr);
    }

    @Override // tb.n9z
    public jhz g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jhz) ipChange.ipc$dispatch("40a286b", new Object[]{this}) : this.f30687a;
    }

    @Override // tb.n9z
    public Map<String, Object> getData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("516a2e9c", new Object[]{this});
        }
        return g().c();
    }

    @Override // tb.n9z
    public Context getUIContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("6bf62ae4", new Object[]{this});
        }
        return g().a();
    }

    @Override // tb.n9z
    public AbilityHubAdapter h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AbilityHubAdapter) ipChange.ipc$dispatch("afa6abe", new Object[]{this});
        }
        return g().h();
    }

    @Override // tb.n9z
    public hhz i(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hhz) ipChange.ipc$dispatch("f081775e", new Object[]{this, new Integer(i)});
        }
        hhz o = g().o(i);
        o.b();
        return o;
    }

    @Override // tb.n9z
    public n7z j(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n7z) ipChange.ipc$dispatch("938cbb7c", new Object[]{this, new Integer(i)});
        }
        return g().g(i);
    }

    @Override // tb.n9z
    public d0z a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d0z) ipChange.ipc$dispatch("b72507a0", new Object[]{this, new Integer(i)}) : g().e(i);
    }

    @Override // tb.n9z
    public hhz c(hhz.e eVar, bhz bhzVar, hhz[] hhzVarArr) {
        xgz M;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hhz) ipChange.ipc$dispatch("8759c180", new Object[]{this, eVar, bhzVar, hhzVarArr});
        }
        ckf.g(bhzVar, Constants.Name.SCOPE);
        ckf.g(hhzVarArr, "params");
        hhz hhzVar = null;
        if (!(eVar == null || (M = eVar.M()) == null)) {
            hhzVar = M.a(bhzVar, hhzVarArr);
        }
        return hhzVar == null ? hhz.Companion.m() : hhzVar;
    }

    @Override // tb.n9z
    public xgz g(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (xgz) ipChange.ipc$dispatch("5110b116", new Object[]{this, new Integer(i)}) : g().d(i);
    }
}
