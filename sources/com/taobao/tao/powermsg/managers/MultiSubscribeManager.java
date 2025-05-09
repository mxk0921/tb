package com.taobao.tao.powermsg.managers;

import android.text.TextUtils;
import androidx.collection.ArrayMap;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ACCSClient;
import com.taobao.accs.AccsClientConfig;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.data.AccsStreamConfig;
import com.taobao.accs.init.Launcher_InitAccs;
import com.taobao.tao.messagekit.base.MsgRouter;
import com.taobao.tao.messagekit.base.monitor.MonitorManager;
import com.taobao.tao.messagekit.core.model.BaseMessage;
import com.taobao.tao.messagekit.core.utils.MsgLog;
import com.taobao.tao.messagekit.core.utils.MsgMonitor;
import com.taobao.tao.powermsg.managers.a;
import com.taobao.tao.powermsg.model.SubscribeMessage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import tb.dh2;
import tb.gay;
import tb.hyv;
import tb.ikl;
import tb.iyv;
import tb.l2o;
import tb.l5y;
import tb.lkd;
import tb.n8l;
import tb.sjl;
import tb.sxx;
import tb.t2o;
import tb.vxx;
import tb.x4u;
import tb.y1r;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class MultiSubscribeManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int STATUS_SUBSCRIBE = 2;
    public static final int STATUS_SUBSCRIBE_PENDING = 3;
    public static final int STATUS_UNSUBSCRIBE = 0;
    public static final int STATUS_UNSUBSCRIBE_PENDING = 1;

    /* renamed from: a  reason: collision with root package name */
    public final Object f12574a = new Object();
    public final HashMap<String, Long> b = new HashMap<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements lkd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f12575a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;
        public final /* synthetic */ String e;
        public final /* synthetic */ String f;
        public final /* synthetic */ int g;
        public final /* synthetic */ int h;
        public final /* synthetic */ sjl i;
        public final /* synthetic */ lkd j;

        public a(int i, String str, String str2, String str3, String str4, String str5, int i2, int i3, sjl sjlVar, lkd lkdVar) {
            this.f12575a = i;
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
            this.f = str5;
            this.g = i2;
            this.h = i3;
            this.i = sjlVar;
            this.j = lkdVar;
        }

        @Override // tb.lkd
        public void onResult(int i, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("170ed185", new Object[]{this, new Integer(i), map});
            } else {
                MultiSubscribeManager.this.f(this.f12575a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements lkd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f12578a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;
        public final /* synthetic */ String e;
        public final /* synthetic */ String f;
        public final /* synthetic */ int g;
        public final /* synthetic */ int h;
        public final /* synthetic */ sjl i;
        public final /* synthetic */ lkd j;

        public c(int i, String str, String str2, String str3, String str4, String str5, int i2, int i3, sjl sjlVar, lkd lkdVar) {
            this.f12578a = i;
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
            this.f = str5;
            this.g = i2;
            this.h = i3;
            this.i = sjlVar;
            this.j = lkdVar;
        }

        @Override // tb.lkd
        public void onResult(int i, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("170ed185", new Object[]{this, new Integer(i), map});
            } else {
                MultiSubscribeManager.this.g(this.f12578a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class e implements vxx<sxx> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ikl f12581a;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class a implements lkd {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a(e eVar) {
            }

            @Override // tb.lkd
            public void onResult(int i, Map<String, Object> map) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("170ed185", new Object[]{this, new Integer(i), map});
                } else {
                    MsgLog.g("MultiSubscribeManager", "innerUnSubscribe resp:", Integer.valueOf(i));
                }
            }
        }

        public e(MultiSubscribeManager multiSubscribeManager, ikl iklVar) {
            this.f12581a = iklVar;
        }

        /* renamed from: a */
        public void accept(sxx sxxVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2712411b", new Object[]{this, sxxVar});
            } else {
                MsgRouter.e().a().c(((BaseMessage) this.f12581a.f21366a).header.f, new a(this));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class f {

        /* renamed from: a  reason: collision with root package name */
        public String f12582a;
        public lkd b;

        static {
            t2o.a(628097276);
        }
    }

    static {
        t2o.a(628097265);
    }

    public static /* synthetic */ Object a(MultiSubscribeManager multiSubscribeManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("54113eb2", new Object[]{multiSubscribeManager});
        }
        return multiSubscribeManager.f12574a;
    }

    public static /* synthetic */ void b(MultiSubscribeManager multiSubscribeManager, sjl sjlVar, x4u x4uVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("168aff73", new Object[]{multiSubscribeManager, sjlVar, x4uVar});
        } else {
            multiSubscribeManager.e(sjlVar, x4uVar);
        }
    }

    public static boolean d(int i, Map<String, Object> map, ArrayList<f> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e2aeb72d", new Object[]{new Integer(i), map, arrayList})).booleanValue();
        }
        if (arrayList != null) {
            try {
                Iterator<f> it = arrayList.iterator();
                while (it.hasNext()) {
                    f next = it.next();
                    hyv.b(i, map, next.b);
                    MsgLog.i("MultiSubscribeManager", next.f12582a, "invoke callback", Integer.valueOf(i));
                }
                return true;
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r19v6 */
    /* JADX WARN: Type inference failed for: r19v7 */
    /* JADX WARN: Type inference failed for: r19v8 */
    /* JADX WARN: Type inference failed for: r19v9 */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int f(int r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, int r32, int r33, tb.sjl r34, tb.lkd r35) {
        /*
            Method dump skipped, instructions count: 776
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.powermsg.managers.MultiSubscribeManager.f(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, tb.sjl, tb.lkd):int");
    }

    public int g(int i, String str, String str2, String str3, String str4, String str5, int i2, int i3, sjl sjlVar, lkd lkdVar) {
        int i4;
        String str6;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("74d2e601", new Object[]{this, new Integer(i), str, str2, str3, str4, str5, new Integer(i2), new Integer(i3), sjlVar, lkdVar})).intValue();
        }
        String str7 = TextUtils.isEmpty(str2) ? "_default" : str2;
        String j = iyv.j(str4);
        synchronized (this.f12574a) {
            try {
                try {
                    a.C0718a k = com.taobao.tao.powermsg.managers.a.k(str, j, str4, str2, str3, str5);
                    k.j.remove(a.C0718a.b(i, str7));
                    if (k.f12584a != 1 && k.j.size() > 0) {
                        MsgLog.g("MultiSubscribeManager", Integer.valueOf(i), "unSubscribe:", str, "biztag:", j, str7, "although has bind :", Integer.valueOf(k.j.size()));
                        hyv.b(1000, null, lkdVar);
                        return 0;
                    } else if (3 == k.f12584a) {
                        f fVar = new f();
                        fVar.f12582a = str7;
                        fVar.b = new c(i, str, str7, str3, str4, str5, i2, i3, sjlVar, lkdVar);
                        k.k.add(fVar);
                        MsgLog.g("MultiSubscribeManager", Integer.valueOf(i), "unSubscribe:", str, "biztag:", j, str7, "wait unSubscribe " + k.k.size());
                        return 1;
                    } else {
                        f fVar2 = new f();
                        fVar2.f12582a = str7;
                        fVar2.b = lkdVar;
                        k.l.add(fVar2);
                        if (k.f12584a != 1) {
                            k.f12584a = 1;
                            i4 = 1;
                            Long put = this.b.put("" + i + str, 0L);
                            if (put != null && put.longValue() > 0) {
                                MsgMonitor.e("POWERMSG", "POWERMSG_SUBSCRIBE_DURATION", new ArrayMap<String, String>(this, i) { // from class: com.taobao.tao.powermsg.managers.MultiSubscribeManager.4
                                    {
                                        put("POWERMSG_DIMENS_BIZ", "" + i);
                                    }
                                }, new ArrayMap<String, Double>(this, put) { // from class: com.taobao.tao.powermsg.managers.MultiSubscribeManager.5
                                    {
                                        put("POWERMSG_MEASURE_DURATION", Double.valueOf(System.currentTimeMillis() - put.longValue()));
                                    }
                                });
                            }
                            boolean z = (!n8l.d(GlobalClientInfo.getContext()) || sjlVar == null || sjlVar.a() == 1) ? false : true;
                            SubscribeMessage create = SubscribeMessage.create();
                            create.msgType = 10;
                            if (z) {
                                create.sysCode = 5;
                            }
                            create.header.f18091a = str;
                            create.bizCode = i;
                            if (TextUtils.isEmpty(str5)) {
                                str6 = "" + put;
                            } else {
                                str6 = str5;
                            }
                            create.ext = str6;
                            create.setFrom(str3);
                            dh2 dh2Var = create.body;
                            dh2Var.b = i2;
                            dh2Var.d = i3;
                            create.setBizTag(str4);
                            ikl iklVar = new ikl(create);
                            if (z) {
                                try {
                                    iklVar.m = true;
                                    if (!TextUtils.isEmpty(Launcher_InitAccs.mUserId)) {
                                        create.header.n = new HashMap(2);
                                        create.header.n.put("userId", Launcher_InitAccs.mUserId);
                                    }
                                } catch (Throwable unused) {
                                }
                            }
                            MsgLog.g("MultiSubscribeManager", Integer.valueOf(i), "start unSubscribe", str, "msgid:", create.header.f);
                            l5y.m(iklVar).A(gay.a()).F(new d(iklVar, str, j, i, str7, str4, i2, create, sjlVar)).a(MsgRouter.e().j());
                        } else {
                            i4 = 1;
                        }
                        return i4;
                    }
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public final void e(sjl sjlVar, x4u x4uVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25c5c918", new Object[]{this, sjlVar, x4uVar});
            return;
        }
        try {
            boolean z = sjlVar.a() == 2;
            if (z) {
                str = "powermsg3";
            } else {
                str = "powermsg";
            }
            AccsStreamConfig accsStreamConfig = new AccsStreamConfig(str);
            if (n8l.d(GlobalClientInfo.getContext())) {
                accsStreamConfig.setUserId(Launcher_InitAccs.mUserId);
            }
            accsStreamConfig.setStreamId(x4uVar.b());
            accsStreamConfig.setSyncTimeoutInMill(sjlVar.g());
            accsStreamConfig.setStartSeq(sjlVar.e());
            accsStreamConfig.setSeqSnapshotInterval(sjlVar.d());
            accsStreamConfig.setSaveDB(sjlVar.h());
            ACCSClient.getAccsClient(z ? AccsClientConfig.V2_EXCLUSIVE_CONFIGTAG : null).subscribeStream(accsStreamConfig);
            MsgLog.g("MultiSubscribeManager", "registerAccsStream succ");
        } catch (Exception e2) {
            MsgLog.f("MultiSubscribeManager", e2, "registerStream err");
        }
    }

    public void c(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8767db7", new Object[]{this, str, new Integer(i)});
        } else if (com.taobao.tao.powermsg.managers.a.j(str)) {
            MsgLog.e("MultiSubscribeManager", "innerUnSubscribe topic exists");
        } else {
            MsgLog.g("MultiSubscribeManager", "innerUnSubscribe start", str, Integer.valueOf(i));
            SubscribeMessage create = SubscribeMessage.create();
            create.msgType = 10;
            create.header.f18091a = str;
            create.bizCode = i;
            ikl iklVar = new ikl(create);
            try {
                if (com.taobao.tao.powermsg.managers.a.f(i, str) != null) {
                    iklVar.m = true;
                    create.sysCode = 5;
                    if (!TextUtils.isEmpty(Launcher_InitAccs.mUserId)) {
                        create.header.n = new HashMap(2);
                        create.header.n.put("userId", Launcher_InitAccs.mUserId);
                    }
                }
            } catch (Throwable unused) {
            }
            l5y.m(iklVar).A(gay.a()).F(new e(this, iklVar)).a(MsgRouter.e().j());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class d implements vxx<sxx> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ikl f12579a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ int d;
        public final /* synthetic */ String e;
        public final /* synthetic */ String f;
        public final /* synthetic */ int g;
        public final /* synthetic */ SubscribeMessage h;
        public final /* synthetic */ sjl i;

        public d(ikl iklVar, String str, String str2, int i, String str3, String str4, int i2, SubscribeMessage subscribeMessage, sjl sjlVar) {
            this.f12579a = iklVar;
            this.b = str;
            this.c = str2;
            this.d = i;
            this.e = str3;
            this.f = str4;
            this.g = i2;
            this.h = subscribeMessage;
            this.i = sjlVar;
        }

        /* renamed from: a */
        public void accept(sxx sxxVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2712411b", new Object[]{this, sxxVar});
            } else {
                MsgRouter.e().a().c(((BaseMessage) this.f12579a.f21366a).header.f, new a());
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class a implements lkd {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // tb.lkd
            public void onResult(int i, Map<String, Object> map) {
                String str;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("170ed185", new Object[]{this, new Integer(i), map});
                    return;
                }
                ArrayList arrayList = new ArrayList(3);
                synchronized (MultiSubscribeManager.a(MultiSubscribeManager.this)) {
                    try {
                        d dVar = d.this;
                        a.C0718a e = com.taobao.tao.powermsg.managers.a.e(dVar.b, dVar.c);
                        if (e != null) {
                            Iterator<f> it = e.l.iterator();
                            while (it.hasNext()) {
                                arrayList.add(it.next());
                            }
                            e.l.clear();
                            d dVar2 = d.this;
                            com.taobao.tao.powermsg.managers.a.m(dVar2.b, dVar2.c);
                        }
                        Integer valueOf = Integer.valueOf(d.this.d);
                        d dVar3 = d.this;
                        MsgLog.g("MultiSubscribeManager", valueOf, "unSubscribe resp", dVar3.b, "biztag:", dVar3.c, "channel:", dVar3.e, "response: ", Integer.valueOf(i), Boolean.valueOf(e != null));
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                String a2 = MonitorManager.a(null, null);
                d dVar4 = d.this;
                l2o l2oVar = new l2o(a2, 4, dVar4.d, dVar4.b, dVar4.f, i, dVar4.g);
                l2oVar.l = d.this.h.createTime;
                MonitorManager.l(l2oVar, iyv.d(), false);
                if (i == 1000) {
                    MsgMonitor.f("POWERMSG", "POWERMSG_UNSUBSCRIBE_RATE");
                } else {
                    MsgMonitor.c("POWERMSG", "POWERMSG_UNSUBSCRIBE_RATE", "" + i, null);
                }
                try {
                    d dVar5 = d.this;
                    x4u p = com.taobao.tao.powermsg.managers.a.p(dVar5.d, dVar5.b);
                    MsgLog.g("MultiSubscribeManager", Integer.valueOf(d.this.d), "unSubscribe > clear topic info", Boolean.valueOf(p == null));
                    if (p != null) {
                        sjl sjlVar = d.this.i;
                        boolean z = sjlVar != null && sjlVar.a() == 2;
                        if (z) {
                            str = "powermsg3";
                        } else {
                            str = "powermsg";
                        }
                        ACCSClient.getAccsClient(z ? AccsClientConfig.V2_EXCLUSIVE_CONFIGTAG : null).unSubscribeStream(new AccsStreamConfig(str));
                    }
                } catch (Throwable th2) {
                    MsgLog.f("MultiSubscribeManager", th2, "unSubscribe unRegisterStream err");
                }
                MultiSubscribeManager.d(i, map, arrayList);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements vxx<sxx> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ikl f12576a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ boolean d;
        public final /* synthetic */ sjl e;
        public final /* synthetic */ int f;
        public final /* synthetic */ int g;
        public final /* synthetic */ String h;
        public final /* synthetic */ String i;
        public final /* synthetic */ SubscribeMessage j;

        public b(ikl iklVar, String str, String str2, boolean z, sjl sjlVar, int i, int i2, String str3, String str4, SubscribeMessage subscribeMessage) {
            this.f12576a = iklVar;
            this.b = str;
            this.c = str2;
            this.d = z;
            this.e = sjlVar;
            this.f = i;
            this.g = i2;
            this.h = str3;
            this.i = str4;
            this.j = subscribeMessage;
        }

        /* renamed from: a */
        public void accept(sxx sxxVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2712411b", new Object[]{this, sxxVar});
            } else {
                MsgRouter.e().a().c(((BaseMessage) this.f12576a.f21366a).header.f, new a());
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class a implements lkd {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // tb.lkd
            public void onResult(int i, Map<String, Object> map) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("170ed185", new Object[]{this, new Integer(i), map});
                    return;
                }
                ArrayList arrayList = new ArrayList(3);
                synchronized (MultiSubscribeManager.a(MultiSubscribeManager.this)) {
                    try {
                        b bVar = b.this;
                        a.C0718a e = com.taobao.tao.powermsg.managers.a.e(bVar.b, bVar.c);
                        if (e != null) {
                            if (i == 1000) {
                                e.f12584a = 2;
                                if (map != null) {
                                    if (!b.this.d || !map.containsKey("systemExt")) {
                                        sjl sjlVar = b.this.e;
                                        if (sjlVar != null && sjlVar.a() == 1) {
                                            x4u x4uVar = new x4u();
                                            x4uVar.g(map.get(y1r.COL_STREAM) + "");
                                            x4uVar.f(b.this.e);
                                            b bVar2 = b.this;
                                            com.taobao.tao.powermsg.managers.a.l(bVar2.f, bVar2.b, x4uVar);
                                            b bVar3 = b.this;
                                            MultiSubscribeManager.b(MultiSubscribeManager.this, bVar3.e, x4uVar);
                                            map.put("latestSequenceNrs", map.get("stream_seq") + "");
                                        }
                                    } else {
                                        Map map2 = (Map) map.get("systemExt");
                                        x4u x4uVar2 = new x4u();
                                        x4uVar2.i((String) map2.get("routeMode"));
                                        x4uVar2.j((String) map2.get("routeValue"));
                                        x4uVar2.g((String) map2.get("fullStreamIds"));
                                        x4uVar2.h(b.this.e.c());
                                        b bVar4 = b.this;
                                        com.taobao.tao.powermsg.managers.a.l(bVar4.f, bVar4.b, x4uVar2);
                                        MsgLog.g("MultiSubscribeManager", "registerTopicInfo", x4uVar2);
                                        b bVar5 = b.this;
                                        MultiSubscribeManager.b(MultiSubscribeManager.this, bVar5.e, x4uVar2);
                                        map.put("latestSequenceNrs", map2.get("latestSequenceNrs"));
                                    }
                                }
                            } else {
                                e.f12584a = 0;
                                b bVar6 = b.this;
                                if (1 == bVar6.g) {
                                    com.taobao.tao.powermsg.managers.a.m(bVar6.b, bVar6.c);
                                    Integer valueOf = Integer.valueOf(b.this.f);
                                    b bVar7 = b.this;
                                    MsgLog.g("MultiSubscribeManager", valueOf, "subscribe removeSubItem", bVar7.b, "biztag:", bVar7.c);
                                }
                            }
                            Iterator<f> it = e.k.iterator();
                            while (it.hasNext()) {
                                arrayList.add(it.next());
                            }
                            e.k.clear();
                        }
                        Integer valueOf2 = Integer.valueOf(b.this.f);
                        b bVar8 = b.this;
                        MsgLog.g("MultiSubscribeManager", valueOf2, "subscribe resp", bVar8.b, "biztag:", bVar8.c, "channel:", bVar8.h, "response: ", Integer.valueOf(i));
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                String a2 = MonitorManager.a(null, null);
                b bVar9 = b.this;
                l2o l2oVar = new l2o(a2, 3, bVar9.f, bVar9.b, bVar9.i, i, bVar9.g);
                l2oVar.l = b.this.j.createTime;
                MonitorManager.l(l2oVar, iyv.d(), false);
                if (i == 1000) {
                    MsgMonitor.f("POWERMSG", "POWERMSG_SUBSCRIBE_RATE");
                } else {
                    MsgMonitor.c("POWERMSG", "POWERMSG_SUBSCRIBE_RATE", "" + i, null);
                }
                MultiSubscribeManager.d(i, map, arrayList);
            }
        }
    }
}
