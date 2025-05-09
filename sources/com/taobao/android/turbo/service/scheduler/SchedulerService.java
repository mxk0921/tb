package com.taobao.android.turbo.service.scheduler;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.android.turbo.model.RedpointModel;
import com.taobao.android.turbo.monitor.Monitor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref$BooleanRef;
import tb.a07;
import tb.bid;
import tb.ckf;
import tb.did;
import tb.g1a;
import tb.g7e;
import tb.gi8;
import tb.jpu;
import tb.m7e;
import tb.nuo;
import tb.p3h;
import tb.plk;
import tb.prv;
import tb.qpu;
import tb.t2o;
import tb.tpu;
import tb.umd;
import tb.vmd;
import tb.zrt;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class SchedulerService implements vmd, bid, g7e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final String TAG = "SchedulerService";

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<nuo> f9788a = new ArrayList<>();
    public final plk<umd> b = new plk<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        static {
            t2o.a(916455657);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ nuo b;

        public b(nuo nuoVar) {
            this.b = nuoVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (SchedulerService.L(SchedulerService.this).remove(this.b)) {
                tpu.a aVar = tpu.Companion;
                tpu.a.b(aVar, SchedulerService.TAG, "remove timeout msg, " + this.b, null, 4, null);
            }
        }
    }

    static {
        t2o.a(916455656);
        t2o.a(919601331);
        t2o.a(916455457);
        t2o.a(919601343);
    }

    public static final /* synthetic */ ArrayList L(SchedulerService schedulerService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("d94fb6d3", new Object[]{schedulerService});
        }
        return schedulerService.f9788a;
    }

    @Override // tb.wmd
    public void B(umd umdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f88b827", new Object[]{this, umdVar});
            return;
        }
        ckf.g(umdVar, DataReceiveMonitor.CB_LISTENER);
        this.b.c(umdVar);
    }

    @Override // tb.vmd
    public boolean F1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e8ae56e8", new Object[]{this, str})).booleanValue();
        }
        ckf.g(str, "name");
        return c0(new SchedulerService$containMessage$1(str));
    }

    @Override // tb.vmd
    public nuo J0(g1a<? super nuo, Boolean> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nuo) ipChange.ipc$dispatch("59811586", new Object[]{this, g1aVar});
        }
        ckf.g(g1aVar, "filter");
        Iterator<nuo> it = this.f9788a.iterator();
        ckf.f(it, "msgList.iterator()");
        while (it.hasNext()) {
            nuo next = it.next();
            ckf.f(next, "iterator.next()");
            nuo nuoVar = next;
            if (g1aVar.invoke(nuoVar).booleanValue()) {
                tpu.a aVar = tpu.Companion;
                tpu.a.b(aVar, TAG, "peekSchedulerMessage " + nuoVar, null, 4, null);
                return nuoVar;
            }
        }
        return null;
    }

    public void M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60016207", new Object[]{this});
            return;
        }
        this.f9788a.clear();
        tpu.a.b(tpu.Companion, TAG, "clear All SchedulerMessages", null, 4, null);
    }

    @Override // tb.vmd
    public nuo X0(g1a<? super nuo, Boolean> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nuo) ipChange.ipc$dispatch("bb6c0f01", new Object[]{this, g1aVar});
        }
        ckf.g(g1aVar, "filter");
        Iterator<nuo> it = this.f9788a.iterator();
        ckf.f(it, "msgList.iterator()");
        while (it.hasNext()) {
            nuo next = it.next();
            ckf.f(next, "iterator.next()");
            nuo nuoVar = next;
            if (g1aVar.invoke(nuoVar).booleanValue()) {
                tpu.a aVar = tpu.Companion;
                tpu.a.b(aVar, TAG, "getSchedulerMessage " + nuoVar, null, 4, null);
                it.remove();
                return nuoVar;
            }
        }
        return null;
    }

    @Override // tb.vmd
    public void Z(nuo nuoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd222f08", new Object[]{this, nuoVar});
            return;
        }
        ckf.g(nuoVar, "message");
        U0(nuoVar.c());
        if (T0(nuoVar)) {
            tpu.a aVar = tpu.Companion;
            tpu.a.b(aVar, TAG, "msg is filtered, " + nuoVar, null, 4, null);
        } else if (m0(nuoVar)) {
            tpu.a aVar2 = tpu.Companion;
            tpu.a.b(aVar2, TAG, "msg consumed, " + nuoVar, null, 4, null);
        } else {
            this.f9788a.add(nuoVar);
            tpu.a aVar3 = tpu.Companion;
            tpu.a.b(aVar3, TAG, "putSchedulerMessage " + nuoVar, null, 4, null);
            if (nuoVar.e() <= 0 || nuoVar.e() >= Integer.MAX_VALUE) {
                zrt.Companion.d(new c(nuoVar), 10000L);
            } else {
                zrt.Companion.d(new b(nuoVar), nuoVar.e());
            }
        }
    }

    public boolean c0(g1a<? super nuo, Boolean> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("54a50564", new Object[]{this, g1aVar})).booleanValue();
        }
        ckf.g(g1aVar, "filter");
        if (J0(g1aVar) != null) {
            return true;
        }
        return false;
    }

    @Override // tb.vmd
    public nuo d1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nuo) ipChange.ipc$dispatch("566f797d", new Object[]{this, str});
        }
        ckf.g(str, "name");
        return X0(new SchedulerService$getMessage$1(str));
    }

    @Override // tb.vmd
    public nuo h0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nuo) ipChange.ipc$dispatch("b13a1cc2", new Object[]{this, str});
        }
        ckf.g(str, "name");
        return J0(new SchedulerService$peekMessage$1(str));
    }

    public final boolean m0(nuo nuoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e20441fa", new Object[]{this, nuoVar})).booleanValue();
        }
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        ref$BooleanRef.element = false;
        this.b.d(new SchedulerService$dispatchSchedulerMessage$1(nuoVar, ref$BooleanRef));
        return ref$BooleanRef.element;
    }

    @Override // tb.sod
    public void onCreateService(qpu qpuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9b2eb95", new Object[]{this, qpuVar});
            return;
        }
        ckf.g(qpuVar, "context");
        ((did) qpuVar.getService(did.class)).T0(this);
        ((m7e) qpuVar.getService(m7e.class)).r(this);
    }

    @Override // tb.sod
    public void onDestroyService(qpu qpuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("673e3e35", new Object[]{this, qpuVar});
            return;
        }
        ckf.g(qpuVar, "context");
        ((did) qpuVar.getService(did.class)).U0(this);
        ((m7e) qpuVar.getService(m7e.class)).x(this);
    }

    @Override // tb.wmd
    public void r(umd umdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c43ae96a", new Object[]{this, umdVar});
            return;
        }
        ckf.g(umdVar, DataReceiveMonitor.CB_LISTENER);
        this.b.a(umdVar);
    }

    @Override // tb.g7e
    public void z0(prv prvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8f9dc49", new Object[]{this, prvVar});
            return;
        }
        ckf.g(prvVar, "user");
        tpu.a.b(tpu.Companion, TAG, "onUserChange", null, 4, null);
        M();
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ nuo b;

        public c(nuo nuoVar) {
            this.b = nuoVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (SchedulerService.L(SchedulerService.this).contains(this.b)) {
                gi8.b(gi8.INSTANCE, "msg not consumed", kotlin.collections.a.j(jpu.a("name", this.b.c()), jpu.a("page", this.b.d()), jpu.a("args", this.b.a())), Monitor.Type.SCHEDULER, Monitor.Code.TIME_OUT, false, null, 48, null);
            }
        }
    }

    public final boolean U0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c9af5a05", new Object[]{this, str})).booleanValue();
        }
        Iterator<nuo> it = this.f9788a.iterator();
        ckf.f(it, "msgList.iterator()");
        while (it.hasNext()) {
            nuo next = it.next();
            ckf.f(next, "iterator.next()");
            nuo nuoVar = next;
            if (ckf.b(nuoVar.c(), str)) {
                it.remove();
                tpu.a aVar = tpu.Companion;
                tpu.a.b(aVar, TAG, "remove SchedulerMessage " + nuoVar, null, 4, null);
                return true;
            }
        }
        return false;
    }

    @Override // tb.bid
    public void x(RedpointModel redpointModel) {
        String iconStreams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d4c1a0c", new Object[]{this, redpointModel});
        } else if (redpointModel == null || (iconStreams = redpointModel.getIconStreams()) == null || iconStreams.length() <= 0) {
            U0(nuo.MSG_ICON_CHANGE);
        } else if (ckf.b("tabbar", redpointModel.getClientReceiverPit())) {
            tpu.a.b(tpu.Companion, TAG, "ignore tabbar pit", null, 4, null);
        } else {
            HashMap hashMap = new HashMap();
            if (redpointModel.getIconStreams() != null) {
                String iconStreams2 = redpointModel.getIconStreams();
                ckf.d(iconStreams2);
                hashMap.put("iconStreams", iconStreams2);
            }
            if (redpointModel.getCard() != null) {
                Map<String, String> card = redpointModel.getCard();
                ckf.d(card);
                hashMap.put("item", card);
            }
            if (redpointModel.getSubTabInfo() != null) {
                Map<String, String> subTabInfo = redpointModel.getSubTabInfo();
                ckf.d(subTabInfo);
                hashMap.put("subTabInfo", subTabInfo);
            }
            if (redpointModel.getClientReceiverData() != null) {
                Map<String, String> clientReceiverData = redpointModel.getClientReceiverData();
                ckf.d(clientReceiverData);
                hashMap.put("clientReceiverData", clientReceiverData);
            }
            if (redpointModel.getPageUtParams() != null) {
                JSONObject pageUtParams = redpointModel.getPageUtParams();
                ckf.d(pageUtParams);
                hashMap.put(p3h.KEY_PAGE_UT_PARAMS, pageUtParams);
            }
            if (redpointModel.getGlobalUtParams() != null) {
                JSONObject globalUtParams = redpointModel.getGlobalUtParams();
                ckf.d(globalUtParams);
                hashMap.put("globalUtParams", globalUtParams);
            }
            if (redpointModel.getPassLongParam() != null) {
                Map<String, String> passLongParam = redpointModel.getPassLongParam();
                ckf.d(passLongParam);
                hashMap.put("passLongParam", passLongParam);
            }
            Z(new nuo(nuo.MSG_ICON_CHANGE, redpointModel.getClientReceiverPage(), hashMap, redpointModel.getLightDuration(), null, 16, null));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00de, code lost:
        if (r1.isEmpty() != false) goto L_0x00e0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean T0(tb.nuo r26) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            r2 = 1
            r3 = 0
            com.android.alibaba.ip.runtime.IpChange r4 = com.taobao.android.turbo.service.scheduler.SchedulerService.$ipChange
            boolean r5 = r4 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r5 == 0) goto L_0x0020
            java.lang.String r5 = "4e355631"
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r6[r3] = r0
            r6[r2] = r1
            java.lang.Object r1 = r4.ipc$dispatch(r5, r6)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            return r1
        L_0x0020:
            java.lang.String r4 = r26.c()
            java.lang.String r5 = "urlRefresh"
            boolean r4 = tb.ckf.b(r4, r5)
            if (r4 == 0) goto L_0x00ee
            java.lang.String r4 = r26.d()
            if (r4 != 0) goto L_0x004c
            tb.mqu$a r4 = tb.mqu.Companion
            java.util.Map r5 = r26.a()
            r6 = 0
            if (r5 == 0) goto L_0x0044
            java.lang.String r7 = "tabid"
            java.lang.Object r5 = r5.get(r7)
            goto L_0x0045
        L_0x0044:
            r5 = r6
        L_0x0045:
            java.lang.String r4 = r4.i(r5, r6)
            r1.h(r4)
        L_0x004c:
            java.lang.String r4 = r26.d()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x006b
            java.lang.String r4 = "iconChange"
            boolean r4 = r0.U0(r4)
            if (r4 == 0) goto L_0x006b
            tb.tpu$a r5 = tb.tpu.Companion
            r9 = 4
            r10 = 0
            java.lang.String r6 = "SchedulerService"
            java.lang.String r7 = "onBeforePutSchedulerMessage, remove icon change message, url refresh message > iconChange message"
            r8 = 0
            tb.tpu.a.b(r5, r6, r7, r8, r9, r10)
        L_0x006b:
            tb.tpu$a r4 = tb.tpu.Companion
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "onBeforePutSchedulerMessage, put close drawer message, "
            r5.<init>(r6)
            java.lang.String r6 = r26.d()
            r5.append(r6)
            java.lang.String r13 = r5.toString()
            r15 = 4
            r16 = 0
            java.lang.String r12 = "SchedulerService"
            r14 = 0
            r11 = r4
            tb.tpu.a.b(r11, r12, r13, r14, r15, r16)
            tb.nuo r5 = new tb.nuo
            java.lang.String r19 = r26.d()
            r23 = 24
            r24 = 0
            java.lang.String r18 = "closeDrawer"
            r20 = 0
            r21 = 0
            r22 = 0
            r17 = r5
            r17.<init>(r18, r19, r20, r21, r22, r23, r24)
            r0.Z(r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "onBeforePutSchedulerMessage, put select tab message, "
            r5.<init>(r6)
            java.lang.String r6 = r26.d()
            r5.append(r6)
            java.lang.String r13 = r5.toString()
            java.lang.String r12 = "SchedulerService"
            tb.tpu.a.b(r11, r12, r13, r14, r15, r16)
            tb.nuo r5 = new tb.nuo
            java.lang.String r19 = r26.d()
            java.lang.String r18 = "selectTab"
            r17 = r5
            r17.<init>(r18, r19, r20, r21, r22, r23, r24)
            r0.Z(r5)
            java.util.Map r5 = r26.a()
            if (r5 == 0) goto L_0x00e0
            java.util.Map r1 = r26.a()
            tb.ckf.d(r1)
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x00ee
        L_0x00e0:
            r15 = 4
            r16 = 0
            java.lang.String r12 = "SchedulerService"
            java.lang.String r13 = "没有extParams参数, 不需要承接"
            r14 = 0
            r11 = r4
            tb.tpu.a.b(r11, r12, r13, r14, r15, r16)
            return r2
        L_0x00ee:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.turbo.service.scheduler.SchedulerService.T0(tb.nuo):boolean");
    }
}
