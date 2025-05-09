package tb;

import android.text.TextUtils;
import anet.channel.strategy.IConnStrategy;
import anet.channel.strategy.IStrategyFilter;
import anet.channel.strategy.StrategyCenter;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class f0q {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final Comparator<e0q> d;
    public final IStrategyFilter e;
    public String c = "";
    public int f = 0;
    public boolean g = false;

    /* renamed from: a  reason: collision with root package name */
    public final List<e0q> f18926a = new ArrayList();
    public final Set<String> b = new HashSet();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements Comparator<e0q> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(f0q f0qVar) {
        }

        /* renamed from: a */
        public int compare(e0q e0qVar, e0q e0qVar2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("36d1dc41", new Object[]{this, e0qVar, e0qVar2})).intValue();
            }
            return e0qVar.b() - e0qVar2.b();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class b implements IStrategyFilter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(f0q f0qVar) {
        }

        @Override // anet.channel.strategy.IStrategyFilter
        public boolean accept(IConnStrategy iConnStrategy) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5d8721cb", new Object[]{this, iConnStrategy})).booleanValue();
            }
            if (iConnStrategy.getIpType() == 0 && iConnStrategy.getIpSource() == 0 && iConnStrategy.getPort() == 443) {
                return true;
            }
            return false;
        }
    }

    static {
        t2o.a(962592924);
    }

    public f0q() {
        this.d = null;
        this.e = null;
        this.d = new a(this);
        this.e = new b(this);
    }

    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("60ed2b1c", new Object[]{this})).intValue();
        }
        if (this.g) {
            return 0;
        }
        List<IConnStrategy> c = c();
        e(c);
        if (c != null) {
            return c.size();
        }
        return 0;
    }

    public final List<IConnStrategy> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("93f6b38b", new Object[]{this});
        }
        return StrategyCenter.getInstance().getConnStrategyListByHost(pzt.d().b().a(), this.e);
    }

    public ozt d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ozt) ipChange.ipc$dispatch("f80b62d6", new Object[]{this});
        }
        if (this.f >= rqo.e().c()) {
            this.g = true;
            this.c = "";
            return null;
        }
        try {
            a();
        } catch (Throwable th) {
            nhh.h("SipStrategyList", th, new Object[0]);
        }
        List<e0q> list = this.f18926a;
        if (list == null || ((ArrayList) list).isEmpty()) {
            this.c = "";
            return null;
        }
        e0q e0qVar = (e0q) ((ArrayList) this.f18926a).get(0);
        if (e0qVar == null) {
            this.c = "";
            return null;
        } else if (e0qVar.b() >= rqo.e().b()) {
            this.c = "";
            return null;
        } else {
            ozt oztVar = new ozt();
            oztVar.e(e0qVar.c());
            oztVar.h(2);
            oztVar.g(2);
            this.c = e0qVar.c();
            return oztVar;
        }
    }

    public void g(boolean z) {
        List<e0q> list;
        e0q e0qVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("611c2b8c", new Object[]{this, new Boolean(z)});
        } else if (!TextUtils.isEmpty(this.c) && (list = this.f18926a) != null && !((ArrayList) list).isEmpty() && (e0qVar = (e0q) ((ArrayList) this.f18926a).get(0)) != null && this.c.equalsIgnoreCase(e0qVar.c())) {
            if (z) {
                e0qVar.d(0);
                this.f = 0;
            } else {
                e0qVar.a();
                this.f++;
                Collections.sort(this.f18926a, this.d);
            }
            f();
        }
    }

    public final boolean h(List<IConnStrategy> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1184dae2", new Object[]{this, list})).booleanValue();
        }
        if (((ArrayList) this.f18926a).size() != list.size()) {
            return true;
        }
        for (IConnStrategy iConnStrategy : list) {
            if (!((HashSet) this.b).contains(iConnStrategy.getIp())) {
                return true;
            }
        }
        return false;
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e00f774d", new Object[]{this});
            return;
        }
        List<IConnStrategy> c = c();
        e(c);
        if (c == null || c.size() == 0) {
            ((ArrayList) this.f18926a).clear();
            ((HashSet) this.b).clear();
            uzt.b().i(0);
            return;
        }
        boolean h = h(c);
        nhh.f("SipStrategyList", "shouldRefreshList", Boolean.valueOf(h));
        if (h) {
            ((ArrayList) this.f18926a).clear();
            ((HashSet) this.b).clear();
            uzt.b().i(c.size());
            for (IConnStrategy iConnStrategy : c) {
                String ip = iConnStrategy.getIp();
                ((ArrayList) this.f18926a).add(new e0q(ip, iConnStrategy.getPort()));
                ((HashSet) this.b).add(ip);
            }
        }
    }

    public final void e(List<IConnStrategy> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4ba4f42", new Object[]{this, list});
        } else if (nhh.n()) {
            if (list == null || list.size() == 0) {
                nhh.f("SipStrategyList", "connStrategyList is Empty");
                return;
            }
            for (IConnStrategy iConnStrategy : list) {
                nhh.f("SipStrategyList", pod.IP, iConnStrategy.getIp(), "port", Integer.valueOf(iConnStrategy.getPort()), "IpType", Integer.valueOf(iConnStrategy.getIpType()), "IpSource", Integer.valueOf(iConnStrategy.getIpSource()));
            }
        }
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a32891", new Object[]{this});
        } else if (nhh.n()) {
            List<e0q> list = this.f18926a;
            if (list == null || ((ArrayList) list).size() == 0) {
                nhh.f("", "sipConnStrategyList is Empty");
                return;
            }
            Iterator it = ((ArrayList) this.f18926a).iterator();
            while (it.hasNext()) {
                e0q e0qVar = (e0q) it.next();
                nhh.f("SipStrategyList", pod.IP, e0qVar.c(), "failCount", Integer.valueOf(e0qVar.b()));
            }
            nhh.f("SipStrategyList", "amdcSipFailCountAll", Integer.valueOf(this.f), "AmdcSipFailCountAll config", Integer.valueOf(rqo.e().c()));
        }
    }
}
