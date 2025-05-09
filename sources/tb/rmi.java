package tb;

import com.alipay.android.msp.framework.dynfun.TplMsg;
import com.android.alibaba.ip.runtime.IpChange;
import com.loc.at;
import com.taobao.kmp.nexus.arch.openArch.service.message.context.a;
import com.taobao.kmp.nexus.arch.openArch.service.message.context.b;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J7\u0010\u0019\u001a\u00020\u00182\b\u0010\u0014\u001a\u0004\u0018\u00010\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001b\u001a\u00020\u00182\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001f\u0010\u001eJ\u000f\u0010 \u001a\u00020\u0018H\u0016¢\u0006\u0004\b \u0010\u001eJ\u000f\u0010!\u001a\u00020\u0018H\u0016¢\u0006\u0004\b!\u0010\u001eR\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b#\u0010$R$\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b#\u0010%\u001a\u0004\b&\u0010\n\"\u0004\b'\u0010\u001cR\"\u0010-\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020*0(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006."}, d2 = {"Ltb/rmi;", "Ltb/kic;", "", "Lcom/taobao/kmp/nexus/arch/openArch/service/message/context/a;", "context", "", "entityIdentifier", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "a", "()Ljava/lang/String;", "Ltb/h3d;", "messageListener", "", at.k, "(Ltb/h3d;)Z", at.j, "()Ljava/lang/Boolean;", "l", "()Z", "topic", "from", "ext", l2o.COL_BTAG, "Ltb/xhv;", "m", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "unsubscribe", "(Ljava/lang/String;)V", "h", "()V", at.f, "n", "f", "Ljava/util/List;", TplMsg.VALUE_T_NATIVE_RETURN, "()Ljava/util/List;", "Ljava/lang/String;", "e", "p", "", "Lcom/taobao/kmp/nexus/arch/openArch/service/message/context/b;", "Ltb/smi;", "c", "Ljava/util/Map;", "instancesList", "nexus_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class rmi implements kic {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final List<a> f27466a;
    private String b;
    private Map<b, smi> c;

    static {
        t2o.a(1004536603);
        t2o.a(1004536599);
    }

    public rmi() {
        this(null, null, 3, null);
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3c75cfd6", new Object[]{this});
        }
        String e = e();
        if (e == null) {
            return e5v.a();
        }
        return e;
    }

    public final List<a> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("dc3e10c7", new Object[]{this});
        }
        return this.f27466a;
    }

    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6b658bd7", new Object[]{this});
        }
        return this.b;
    }

    @Override // tb.jic
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78a483ed", new Object[]{this});
            return;
        }
        for (smi smiVar : this.c.values()) {
            smiVar.f();
        }
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        for (smi smiVar : this.c.values()) {
            smiVar.A();
        }
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deb96e34", new Object[]{this});
            return;
        }
        for (smi smiVar : this.c.values()) {
            smiVar.B();
        }
    }

    public Boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("4123b101", new Object[]{this});
        }
        for (smi smiVar : this.c.values()) {
            smiVar.C();
        }
        return Boolean.TRUE;
    }

    public final boolean k(h3d h3dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("82f061e6", new Object[]{this, h3dVar})).booleanValue();
        }
        for (smi smiVar : this.c.values()) {
            smiVar.D(h3dVar);
        }
        return true;
    }

    public boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1b466fe1", new Object[]{this})).booleanValue();
        }
        for (smi smiVar : this.c.values()) {
            smiVar.E();
        }
        return true;
    }

    public void m(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7b9b3f9", new Object[]{this, str, str2, str3, str4});
            return;
        }
        for (smi smiVar : this.c.values()) {
            smiVar.F(str, str2, str3, str4);
        }
    }

    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d746f200", new Object[]{this});
            return;
        }
        for (smi smiVar : this.c.values()) {
            smiVar.L();
        }
    }

    public void p(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d8e7d7f", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    @Override // tb.kic
    public void unsubscribe(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("844202a2", new Object[]{this, str});
            return;
        }
        for (smi smiVar : this.c.values()) {
            smiVar.unsubscribe(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public rmi(List<? extends a> list, String str) {
        this.f27466a = list;
        this.b = str;
        this.c = new LinkedHashMap();
    }

    public /* synthetic */ rmi(List list, String str, int i, a07 a07Var) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : str);
    }
}
