package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.trade.event.Event;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class gwl {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final List<gwl> e = new ArrayList();

    /* renamed from: a  reason: collision with root package name */
    public Event f20271a;
    public iwq b;
    public kj8 c;
    public gwl d;

    static {
        t2o.a(723517463);
    }

    public gwl(Event event, iwq iwqVar, kj8 kj8Var) {
        this.f20271a = event;
        this.b = iwqVar;
        this.c = kj8Var;
    }

    public static gwl a(iwq iwqVar, Event event, kj8 kj8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gwl) ipChange.ipc$dispatch("3be2f7be", new Object[]{iwqVar, event, kj8Var});
        }
        List<gwl> list = e;
        synchronized (list) {
            try {
                int size = ((ArrayList) list).size();
                if (size <= 0) {
                    return new gwl(event, iwqVar, kj8Var);
                }
                gwl gwlVar = (gwl) ((ArrayList) list).remove(size - 1);
                gwlVar.f20271a = event;
                gwlVar.b = iwqVar;
                gwlVar.c = kj8Var;
                gwlVar.d = null;
                return gwlVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void b(gwl gwlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a193162", new Object[]{gwlVar});
            return;
        }
        gwlVar.f20271a = null;
        gwlVar.b = null;
        gwlVar.c = null;
        gwlVar.d = null;
        List<gwl> list = e;
        synchronized (list) {
            if (((ArrayList) list).size() < 10000) {
                ((ArrayList) list).add(gwlVar);
            }
        }
    }
}
