package tb;

import com.alibaba.android.aura.AURAInputData;
import com.alibaba.android.aura.datamodel.nextrpc.AURANextRPCEndpoint;
import com.alibaba.android.aura.datamodel.nextrpc.AURANextRPCIO;
import com.alibaba.android.aura.datamodel.parse.AURAParseIO;
import com.alibaba.android.aura.service.nextrpc.extension.IAURANextRPCPrefetchExtension;
import com.alibaba.android.aura.util.AURATraceUtil;
import com.alibaba.android.umf.datamodel.protocol.ultron.ProtocolType;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.ck;
import tb.ubb;
import tb.zi;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class sk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public ubb f28097a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a implements ubb.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final IAURANextRPCPrefetchExtension f28098a;

        static {
            t2o.a(80740452);
            t2o.a(80740473);
        }

        public a(yi yiVar) {
            this.f28098a = (IAURANextRPCPrefetchExtension) yiVar.e(IAURANextRPCPrefetchExtension.class);
        }

        @Override // tb.ubb.b
        public nk a(AURANextRPCEndpoint aURANextRPCEndpoint, AURANextRPCEndpoint aURANextRPCEndpoint2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (nk) ipChange.ipc$dispatch("e68346d3", new Object[]{this, aURANextRPCEndpoint, aURANextRPCEndpoint2});
            }
            IAURANextRPCPrefetchExtension iAURANextRPCPrefetchExtension = this.f28098a;
            if (iAURANextRPCPrefetchExtension == null) {
                return new nk();
            }
            return iAURANextRPCPrefetchExtension.K(aURANextRPCEndpoint, aURANextRPCEndpoint2);
        }

        @Override // tb.ubb.b
        public void c(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9fa8699e", new Object[]{this, str, map});
                return;
            }
            IAURANextRPCPrefetchExtension iAURANextRPCPrefetchExtension = this.f28098a;
            if (iAURANextRPCPrefetchExtension != null) {
                iAURANextRPCPrefetchExtension.c(str, map);
            }
        }
    }

    static {
        t2o.a(80740451);
    }

    public final void a(AURANextRPCEndpoint aURANextRPCEndpoint, List<vbb> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12cb65ec", new Object[]{this, aURANextRPCEndpoint, list});
            return;
        }
        for (vbb vbbVar : list) {
            aURANextRPCEndpoint.appendHeaders(vbbVar.getHeaders());
            aURANextRPCEndpoint.appendParams(vbbVar.y0());
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        ubb ubbVar = this.f28097a;
        if (ubbVar != null) {
            ubbVar.release();
        }
    }

    public void c(yi yiVar, lo loVar, AURAInputData<AURANextRPCIO> aURAInputData, pt<AURAParseIO> ptVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8be249", new Object[]{this, yiVar, loVar, aURAInputData, ptVar});
            return;
        }
        AURANextRPCIO data = aURAInputData.getData();
        nbb c = loVar.c();
        List<vbb> f = yiVar.f(vbb.class);
        AURANextRPCEndpoint aURANextRPCEndpoint = data.nextRPCEndpoint;
        if (aURANextRPCEndpoint == null) {
            ptVar.b(new mi(0, "AURANextRPCServiceDomain", "-1000_INVALID_ENDPOINT", "NextRPC服务输入数据的NextRPCEndpoint为空"));
            return;
        }
        if (!bh.a(f)) {
            a(aURANextRPCEndpoint, f);
            e(aURANextRPCEndpoint, f);
        }
        Boolean bool = Boolean.TRUE;
        Boolean bool2 = Boolean.FALSE;
        this.f28097a = mk.g(loVar.f(), data.serviceName, aURANextRPCEndpoint.getStreamModel(), bool.equals(loVar.h("enableStreamJson", Boolean.class, bool2)), bool.equals(loVar.h("enableForceMainThread", Boolean.class, bool2)));
        b bVar = new b(c, aURAInputData, ptVar, yiVar);
        if (bool.equals(loVar.h("enableCombineRender", Boolean.class, bool2)) || aURANextRPCEndpoint.getStreamModel()) {
            bVar.k();
        }
        bVar.E(bool.equals(loVar.h("enableSchedulePerf", Boolean.class, bool2)));
        this.f28097a.b(aURANextRPCEndpoint, bVar, new a(yiVar));
        if (!bh.a(f)) {
            d(aURANextRPCEndpoint, f);
        }
    }

    public final void d(AURANextRPCEndpoint aURANextRPCEndpoint, List<vbb> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ca1fc8f", new Object[]{this, aURANextRPCEndpoint, list});
            return;
        }
        for (vbb vbbVar : list) {
            vbbVar.Q(aURANextRPCEndpoint);
        }
    }

    public final void e(AURANextRPCEndpoint aURANextRPCEndpoint, List<vbb> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36f0c6c", new Object[]{this, aURANextRPCEndpoint, list});
            return;
        }
        for (vbb vbbVar : list) {
            vbbVar.j0(aURANextRPCEndpoint);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class b implements ubb.a, Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final nbb f28099a;
        private final AURAInputData<AURANextRPCIO> b;
        public pt<AURAParseIO> c;
        private final List<vbb> d;
        private final List<wbb> e;
        private final List<qt> f;
        private boolean h = false;
        private boolean i = false;
        private volatile boolean j = false;
        private final List<rl> k = new CopyOnWriteArrayList();
        private final jk g = new jk();

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ kk f28100a;

            public a(kk kkVar) {
                this.f28100a = kkVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                kk kkVar = this.f28100a;
                if (kkVar instanceof mn) {
                    b.e(b.this, (mn) kkVar);
                    return;
                }
                b.f(b.this, kkVar);
                jk h = b.h(b.this);
                b bVar = b.this;
                h.d(bVar.c, (AURANextRPCIO) b.g(bVar).getData(), this.f28100a);
            }
        }

        /* compiled from: Taobao */
        /* renamed from: tb.sk$b$b  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class RunnableC1053b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ kk f28101a;

            public RunnableC1053b(kk kkVar) {
                this.f28101a = kkVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                b.f(b.this, this.f28101a);
                jk h = b.h(b.this);
                b bVar = b.this;
                h.d(bVar.c, (AURANextRPCIO) b.g(bVar).getData(), this.f28101a);
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class c implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ mn f28102a;
            public final /* synthetic */ long b;
            public final /* synthetic */ List c;

            public c(mn mnVar, long j, List list) {
                this.f28102a = mnVar;
                this.b = j;
                this.c = list;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                long currentTimeMillis = System.currentTimeMillis();
                ok g = this.f28102a.g();
                uk.a(g, 0, g.g(), currentTimeMillis);
                uk.a(g, 2, this.b, currentTimeMillis);
                AURATraceUtil.g(2, "aura-request-thread-switch-end[" + this.b + "]");
                b.i(b.this, this.f28102a, this.c, true);
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class d implements zi.b<vbb> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ kk f28103a;

            public d(b bVar, kk kkVar) {
                this.f28103a = kkVar;
            }

            /* renamed from: c */
            public void a(vbb vbbVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8b4d827a", new Object[]{this, vbbVar});
                    return;
                }
                AURATraceUtil.a(3, vbbVar.getClass().getSimpleName().concat(" 扩展点执行"));
                vbbVar.S(this.f28103a);
                AURATraceUtil.b(3);
            }

            /* renamed from: d */
            public boolean b(vbb vbbVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("aba67bbd", new Object[]{this, vbbVar})).booleanValue();
                }
                if (vbbVar instanceof et) {
                    return ((et) vbbVar).b();
                }
                return true;
            }
        }

        static {
            t2o.a(80740453);
            t2o.a(80740472);
        }

        public b(nbb nbbVar, AURAInputData<AURANextRPCIO> aURAInputData, pt<AURAParseIO> ptVar, yi yiVar) {
            this.b = aURAInputData;
            this.c = ptVar;
            this.f28099a = nbbVar;
            this.d = yiVar.f(vbb.class);
            this.e = yiVar.f(wbb.class);
            this.f = yiVar.f(qt.class);
        }

        private void A(mn mnVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6f986302", new Object[]{this, mnVar});
                return;
            }
            JSONObject jSONObject = mnVar.b().getJSONObject("data");
            rl rlVar = new rl(jSONObject);
            rlVar.d(ProtocolType.STREAM);
            if (th.c()) {
                rbb g = ck.g();
                g.e("接收到流式数据：" + jSONObject.toString(), ck.b.b().i("AURA/core").a());
            }
            if (this.h) {
                this.k.add(rlVar);
                B();
            } else if (w(jSONObject)) {
                m(rlVar);
            } else {
                o(rlVar);
            }
        }

        private synchronized void B() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a261a9a1", new Object[]{this});
            } else if (this.k.isEmpty()) {
                ck.g().e("Pending列表为空", ck.b.b().i("AURA/performance").a());
            } else if (!this.j) {
                ck.g().e("主数据还没有返回，异步数据先hold", ck.b.b().i("AURA/performance").a());
            } else {
                dn.a().postDelayed(this, 150L);
            }
        }

        private void D(kk kkVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9b29e48", new Object[]{this, kkVar});
            } else if (kkVar != null) {
                this.b.getGlobalData().update("aura_data_response", kkVar);
            }
        }

        public static /* synthetic */ void e(b bVar, mn mnVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a44a5161", new Object[]{bVar, mnVar});
            } else {
                bVar.y(mnVar);
            }
        }

        public static /* synthetic */ void f(b bVar, kk kkVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("adb3de60", new Object[]{bVar, kkVar});
            } else {
                bVar.u(kkVar);
            }
        }

        public static /* synthetic */ AURAInputData g(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AURAInputData) ipChange.ipc$dispatch("8ee5527b", new Object[]{bVar});
            }
            return bVar.b;
        }

        public static /* synthetic */ jk h(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (jk) ipChange.ipc$dispatch("cde8e68a", new Object[]{bVar});
            }
            return bVar.g;
        }

        public static /* synthetic */ void i(b bVar, mn mnVar, List list, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ce8b0ac6", new Object[]{bVar, mnVar, list, new Boolean(z)});
            } else {
                bVar.n(mnVar, list, z);
            }
        }

        private void j(AURAParseIO aURAParseIO) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("919ab40a", new Object[]{this, aURAParseIO});
                return;
            }
            nbb nbbVar = this.f28099a;
            if (nbbVar != null) {
                nbbVar.c("aura.workflow.update", aURAParseIO, null);
            }
        }

        private void m(rl rlVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("eef5b2a7", new Object[]{this, rlVar});
                return;
            }
            ArrayList arrayList = new ArrayList();
            if (rlVar != null) {
                arrayList.add(rlVar);
            }
            j(new AURAParseIO(arrayList));
        }

        private void n(mn mnVar, List<kk> list, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d8f99e44", new Object[]{this, mnVar, list, new Boolean(z)});
            } else if (z) {
                x(mnVar, list);
            } else {
                A(mnVar);
            }
        }

        private void o(rl rlVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e6f37219", new Object[]{this, rlVar});
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(rlVar);
            this.f28099a.c("aura.workflow.parse", new AURAParseIO(arrayList), null);
        }

        private List<rl> p(List<kk> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("1701e36b", new Object[]{this, list});
            }
            ArrayList arrayList = new ArrayList();
            if (list == null) {
                return arrayList;
            }
            for (kk kkVar : list) {
                JSONObject b = kkVar.b();
                if (b != null) {
                    if (th.c()) {
                        rbb g = ck.g();
                        g.e("接收到异步数据：" + b.toString(), ck.b.b().i("AURA/core").a());
                    }
                    rl rlVar = new rl(b);
                    rlVar.d("DELTA");
                    arrayList.add(rlVar);
                }
            }
            return arrayList;
        }

        private boolean q(AURAParseIO aURAParseIO) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7be990ad", new Object[]{this, aURAParseIO})).booleanValue();
            }
            List<wbb> list = this.e;
            if (list == null) {
                return false;
            }
            for (wbb wbbVar : list) {
                if (wbbVar.R(aURAParseIO, null)) {
                    return true;
                }
            }
            return false;
        }

        private boolean r(mn mnVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ad5b4df", new Object[]{this, mnVar})).booleanValue();
            }
            List<qt> list = this.f;
            if (list == null) {
                return false;
            }
            for (qt qtVar : list) {
                if (qtVar.m0(mnVar)) {
                    return true;
                }
            }
            return false;
        }

        private void t(List<rl> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b6a0fa4b", new Object[]{this, list});
                return;
            }
            rl rlVar = list.get(0);
            if (list.size() != 1 || !ProtocolType.STREAM.equals(rlVar.c())) {
                ArrayList arrayList = new ArrayList();
                for (rl rlVar2 : list) {
                    if (!q(new AURAParseIO(Collections.singletonList(rlVar2)))) {
                        arrayList.add(rlVar2);
                    }
                }
                list.clear();
                if (!arrayList.isEmpty()) {
                    j(new AURAParseIO(arrayList));
                }
            } else if (w(rlVar.b())) {
                m(rlVar);
            } else {
                o(rlVar);
            }
        }

        private void u(kk kkVar) {
            List<vbb> list;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a0b965e4", new Object[]{this, kkVar});
            } else if (kkVar != null && (list = this.d) != null) {
                if (this.i) {
                    zi.a(list, new d(this, kkVar));
                    return;
                }
                for (vbb vbbVar : list) {
                    vbbVar.S(kkVar);
                }
            }
        }

        private boolean w(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6967424e", new Object[]{this, jSONObject})).booleanValue();
            }
            if (jSONObject == null) {
                return false;
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("hierarchy");
            JSONObject jSONObject3 = jSONObject.getJSONObject("data");
            if (jSONObject2 != null && !jSONObject2.isEmpty()) {
                return true;
            }
            if (jSONObject3 == null || jSONObject3.isEmpty()) {
                return false;
            }
            return true;
        }

        private void y(mn mnVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c97c01d1", new Object[]{this, mnVar});
            } else if (!r(mnVar)) {
                this.g.d(this.c, this.b.getData(), mnVar);
            }
        }

        public void E(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f1be6325", new Object[]{this, new Boolean(z)});
            } else {
                this.i = z;
            }
        }

        @Override // tb.ubb.a
        public void a(List<kk> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8f0800fd", new Object[]{this, list});
            } else if (this.f28099a == null || list == null) {
                ck.g().e("attachedResponses is null!");
            } else {
                List<rl> p = p(list);
                AURAParseIO aURAParseIO = new AURAParseIO(p);
                if (q(aURAParseIO)) {
                    return;
                }
                if (this.h) {
                    this.k.addAll(p);
                    B();
                    return;
                }
                j(aURAParseIO);
            }
        }

        @Override // tb.ubb.a
        public <T extends kk> void b(T t) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d2dcb890", new Object[]{this, t});
            } else {
                dn.f(new a(t), 0L);
            }
        }

        @Override // tb.ubb.a
        public void d(kk kkVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9055cbde", new Object[]{this, kkVar});
                return;
            }
            u(kkVar);
            if (this.c != null && kkVar != null && kkVar.b() != null) {
                this.c.c(yk.a(new AURAParseIO(Arrays.asList(new rl(kkVar.b().getJSONObject("data")))), this.b));
            }
        }

        public void k() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("18a11279", new Object[]{this});
            } else {
                this.h = true;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (this.k.isEmpty()) {
                ck.g().e("Pending列表为空", ck.b.b().i("AURA/other").a());
            } else {
                ck.g().e("差量和异步数据合并渲染", ck.b.b().c("size", this.k.size()).i("AURA/performance").a());
                t(this.k);
            }
        }

        public void v(kk kkVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c34c6a1", new Object[]{this, kkVar});
            } else {
                dn.f(new RunnableC1053b(kkVar), 0L);
            }
        }

        public void z(mn mnVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("aa30c267", new Object[]{this, mnVar});
            }
        }

        private void l(mn mnVar, List<kk> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("abbfa179", new Object[]{this, mnVar, list});
            } else if (ao.a()) {
                n(mnVar, list, true);
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                AURATraceUtil.g(2, "aura-request-thread-switch-start[" + currentTimeMillis + "]");
                ck.g().e("流式首包切换到主线程", ck.b.b().i("stream").a());
                dn.f(new c(mnVar, currentTimeMillis, list), 0L);
            }
        }

        private boolean s(mn mnVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3242e5fc", new Object[]{this, mnVar})).booleanValue();
            }
            if (this.f == null) {
                return false;
            }
            rbb g = ck.g();
            g.e("执行" + mnVar.y() + "段包流式扩展点", ck.b.b().h("uiThread", ao.a()).i("stream").a());
            for (qt qtVar : this.f) {
                if (qtVar.L(mnVar)) {
                    return true;
                }
            }
            return false;
        }

        private void x(kk kkVar, List<kk> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("28d90d8c", new Object[]{this, kkVar, list});
                return;
            }
            AURATraceUtil.a(3, "开始处理onMainResponse");
            uk.c("收到首段包数据", kkVar.g());
            D(kkVar);
            AURATraceUtil.a(3, "invokeDidReceiveResponseExtension 扩展点执行");
            u(kkVar);
            AURATraceUtil.b(3);
            AURATraceUtil.a(3, "处理主数据");
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject = kkVar.b().getJSONObject("data");
            rl rlVar = new rl(jSONObject);
            rlVar.d(ProtocolType.COMPLETE);
            arrayList.add(rlVar);
            if (th.c()) {
                rbb g = ck.g();
                g.e("接收到主数据：" + jSONObject.toString(), ck.b.b().i("AURA/core").a());
            }
            AURATraceUtil.b(3);
            AURATraceUtil.a(3, "处理副数据");
            if (list != null) {
                arrayList.addAll(p(list));
            }
            AURAParseIO aURAParseIO = new AURAParseIO(arrayList);
            ck.g().e("执行主数据渲染流程", ck.b.b().i("AURA/core").a());
            AURATraceUtil.b(3);
            AURATraceUtil.b(3);
            this.c.c(yk.a(aURAParseIO, this.b));
            AURATraceUtil.a(3, "开始处理异步数据");
            if (list != null && !list.isEmpty()) {
                q(aURAParseIO);
            }
            this.j = true;
            B();
            AURATraceUtil.b(3);
        }

        @Override // tb.ubb.a
        public <T extends kk> void c(T t, List<kk> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ef42949a", new Object[]{this, t, list});
            } else if (t != null && t.b() != null) {
                AURATraceUtil.g(3, "开始处理数据");
                if (t instanceof mn) {
                    mn mnVar = (mn) t;
                    if (!mnVar.z()) {
                        AURATraceUtil.a(3, "handleStreamResponseExtension 扩展点执行");
                        s(mnVar);
                        AURATraceUtil.b(3);
                        if (mnVar.y() == 1) {
                            l(mnVar, list);
                            return;
                        } else {
                            n(mnVar, list, false);
                            return;
                        }
                    }
                }
                x(t, list);
            }
        }
    }
}
