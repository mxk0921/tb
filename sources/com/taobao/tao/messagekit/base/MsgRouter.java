package com.taobao.tao.messagekit.base;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.messagekit.base.monitor.MonitorManager;
import com.taobao.tao.messagekit.core.model.AccsConnInfo;
import com.taobao.tao.messagekit.core.model.Ack;
import com.taobao.tao.messagekit.core.utils.MsgLog;
import com.taobao.tao.messagekit.core.utils.MsgMonitor;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.a34;
import tb.ew2;
import tb.f4y;
import tb.gay;
import tb.h3m;
import tb.ikl;
import tb.moq;
import tb.stj;
import tb.t2o;
import tb.tvq;
import tb.x9o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class MsgRouter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final MsgRouter m = new MsgRouter();

    /* renamed from: a  reason: collision with root package name */
    public final h3m<ikl> f12527a = new h3m<>();
    public final h3m<ikl> b = new h3m<>();
    public final h3m<ikl> c = new h3m<>();
    public final x9o d = new x9o();
    public final ew2 e = new ew2();
    public final MonitorManager f = new MonitorManager();
    public final stj g = new stj();
    public final a34 h = new a34();
    public final tvq i = new tvq();
    public final AtomicBoolean j = new AtomicBoolean(false);
    public c k;
    public b l;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements f4y<ikl> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(MsgRouter msgRouter) {
        }

        /* renamed from: a */
        public boolean test(ikl iklVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a95860dc", new Object[]{this, iklVar})).booleanValue();
            }
            M m = iklVar.f21366a;
            if ((m instanceof Ack) || (m instanceof AccsConnInfo)) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface b {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface c {
    }

    static {
        t2o.a(628097057);
    }

    public static MsgRouter e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MsgRouter) ipChange.ipc$dispatch("696ffa47", new Object[0]);
        }
        return m;
    }

    public ew2 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ew2) ipChange.ipc$dispatch("c8c2dd42", new Object[]{this});
        }
        return this.e;
    }

    public a34 b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a34) ipChange.ipc$dispatch("b90df8f0", new Object[]{this});
        }
        return this.h;
    }

    public h3m<ikl> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h3m) ipChange.ipc$dispatch("dde679fb", new Object[]{this});
        }
        return this.c;
    }

    public h3m<ikl> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h3m) ipChange.ipc$dispatch("dd91ff6c", new Object[]{this});
        }
        return this.b;
    }

    public MonitorManager f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MonitorManager) ipChange.ipc$dispatch("e09b521b", new Object[]{this});
        }
        return this.f;
    }

    public stj g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (stj) ipChange.ipc$dispatch("2d5fed6f", new Object[]{this});
        }
        return this.g;
    }

    public x9o h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x9o) ipChange.ipc$dispatch("bb42d63a", new Object[]{this});
        }
        return this.d;
    }

    public tvq i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tvq) ipChange.ipc$dispatch("1ac81f50", new Object[]{this});
        }
        return this.i;
    }

    public h3m<ikl> j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h3m) ipChange.ipc$dispatch("3bd2f465", new Object[]{this});
        }
        return this.f12527a;
    }

    public void l(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d715f567", new Object[]{this, bVar});
        } else if (bVar != null) {
            this.l = bVar;
        }
    }

    public void m(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb034207", new Object[]{this, cVar});
        } else if (cVar != null) {
            this.k = cVar;
        }
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94f2f17c", new Object[]{this});
        } else if (!this.j.compareAndSet(false, true)) {
            MsgLog.g("MsgRouter", "already initialized >>>");
        } else {
            h3m<ikl> h3mVar = this.b;
            if (h3mVar != null) {
                h3mVar.b(h3m.DOWN_STREAM);
            }
            h3m<ikl> h3mVar2 = this.f12527a;
            if (h3mVar2 != null) {
                h3mVar2.b(h3m.UP_STREAM);
            }
            h3m<ikl> h3mVar3 = this.c;
            if (h3mVar3 != null) {
                h3mVar3.b(h3m.CONTROL_STREAM);
            }
            MsgLog.i("MsgRouter", "onInitialized >>>");
            ((moq) this.k).g(this.f12527a.a().g(gay.a())).b(g());
            ((moq) this.l).f(this.c.a().g(gay.a()).f(new a(this))).b(a());
            MsgMonitor.g("MKT", "MKT_MSG_DURATION", new ArrayList<String>() { // from class: com.taobao.tao.messagekit.base.MsgRouter.2
                {
                    add("MKT_DIMENS_BIZ");
                    add("MKT_DIMENS_DUP");
                    add("MKT_DIMENS_MQTT");
                    add("MKT_DIMENS_TYPE");
                    add("MKT_DIMENS_SUBTYPE");
                    add("MKT_DIMENS_TOPIC");
                }
            }, new ArrayList<String>() { // from class: com.taobao.tao.messagekit.base.MsgRouter.3
                {
                    add("MKT_MEASURE_FLOW");
                    add("MKT_MEASURE_NET");
                    add("MKT_MEASURE_PACK");
                }
            });
            this.f.n();
        }
    }
}
