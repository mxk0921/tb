package com.taobao.tao.flexbox.layoutmanager.core;

import android.content.Context;
import android.os.AsyncTask;
import android.text.TextUtils;
import anet.channel.session.dns.DnsNavConfigTask;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.pop.utils.PopConst;
import com.taobao.tao.flexbox.layoutmanager.ac.d;
import com.taobao.tao.flexbox.layoutmanager.core.n;
import com.taobao.tao.flexbox.layoutmanager.module.TrackerModule;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.akt;
import tb.h2e;
import tb.hqq;
import tb.ig8;
import tb.nwv;
import tb.od0;
import tb.t2o;
import tb.tfs;
import tb.zk9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class l {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int RENDER_FAILD = 2;
    public static final int RENDER_SUCCESS = 3;
    public static final String TAG = "PerformanceTracker";

    /* renamed from: a  reason: collision with root package name */
    public static j f12223a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a implements zk9.i {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f12224a;
        public final /* synthetic */ int b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;
        public final /* synthetic */ String e;
        public final /* synthetic */ String f;
        public final /* synthetic */ String g;
        public final /* synthetic */ String h;
        public final /* synthetic */ String i;
        public final /* synthetic */ String j;

        public a(boolean z, int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
            this.f12224a = z;
            this.b = i;
            this.c = str;
            this.d = str2;
            this.e = str3;
            this.f = str4;
            this.g = str5;
            this.h = str6;
            this.i = str7;
            this.j = str8;
        }

        @Override // tb.zk9.i
        public void onClassLoaded(Class<?> cls) {
            try {
                j jVar = (j) cls.newInstance();
                l.f12223a = jVar;
                jVar.sendITraceLog(this.f12224a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
            } catch (Throwable th) {
                th.printStackTrace();
                tfs.e(l.TAG, "FlexaClass load error:Throwable: " + th.toString());
                l.g(true, "type", "EfsTracker", "error", th.toString());
            }
        }

        @Override // tb.zk9.i
        public void onClassNotFound() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ad9dd2ef", new Object[]{this});
                return;
            }
            tfs.e(l.TAG, "FlexaClass load error:onClassNotFound");
            l.g(true, "type", "EfsTracker", "error", "ClassNotFound");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ o f12225a;
        public final /* synthetic */ Map b;

        public b(o oVar, Map map) {
            this.f12225a = oVar;
            this.b = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                List<n> c0 = this.f12225a.c0();
                hqq.b a2 = hqq.a();
                for (n nVar : c0) {
                    a2.b("url:");
                    a2.b(nVar.c0().d);
                    a2.b(" md5:");
                    a2.b(q.k(nVar));
                    a2.b("\n");
                }
                l.a(this.f12225a, this.b, a2.toString());
            } catch (Throwable th) {
                tfs.e("trackError", th.getMessage());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ o f12227a;
        public final /* synthetic */ int b;
        public final /* synthetic */ long c;
        public final /* synthetic */ n d;
        public final /* synthetic */ HashMap e;
        public final /* synthetic */ String f;

        public d(o oVar, int i, long j, n nVar, HashMap hashMap, String str) {
            this.f12227a = oVar;
            this.b = i;
            this.c = j;
            this.d = nVar;
            this.e = hashMap;
            this.f = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            n g0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (this.f12227a != null) {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("pageName", (Object) "TNode");
                jSONObject2.put(PopConst.POP_EVENT_ID_KEY, (Object) 19999);
                int i = this.b;
                if (i == 2) {
                    jSONObject2.put("arg1", (Object) "renderfailed");
                } else if (i == 3) {
                    jSONObject2.put("arg1", (Object) "render");
                }
                jSONObject.put("time", (Object) Long.valueOf(this.c / 1000000));
                n nVar = this.d;
                if (!(nVar == null || (g0 = nVar.g0()) == null || g0.X() == null)) {
                    jSONObject.put("url", (Object) g0.X().f12242a);
                    Object V = g0.V("pageName");
                    if (V != null) {
                        jSONObject.put("pageName", V);
                    }
                    Object V2 = g0.V("pageURL");
                    if (V2 != null) {
                        jSONObject.put("pageURL", (Object) ((String) V2));
                    }
                }
                HashMap hashMap = this.e;
                if (hashMap != null) {
                    jSONObject.putAll(hashMap);
                }
                if (TextUtils.isEmpty(jSONObject.getString("url")) && !TextUtils.isEmpty(this.f)) {
                    jSONObject.put("url", (Object) this.f);
                }
                jSONObject2.put("args", (Object) jSONObject);
                TrackerModule.commit(new d.j(this.f12227a, jSONObject2, null), false);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ k f12228a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ o c;

        public e(k kVar, boolean z, o oVar) {
            this.f12228a = kVar;
            this.b = z;
            this.c = oVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            Context context;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (this.f12228a != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("pageName", (Object) "TNode");
                jSONObject.put(PopConst.POP_EVENT_ID_KEY, (Object) 19997);
                jSONObject.put("arg1", (Object) "tnodemtop");
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("time", (Object) Long.valueOf(this.f12228a.b / 1000000));
                jSONObject2.put("success", (Object) Boolean.valueOf(this.f12228a.c));
                jSONObject2.put("mtop", (Object) this.f12228a.f12233a);
                jSONObject2.put("v", (Object) this.f12228a.d);
                Object obj = this.f12228a.e;
                if (obj == null) {
                    obj = "";
                }
                jSONObject2.put("query", obj);
                jSONObject2.put("isPrefetch", (Object) Boolean.valueOf(this.b));
                jSONObject2.put("traceId", (Object) this.f12228a.f);
                jSONObject2.put("eagleEyeTraceId", (Object) this.f12228a.g);
                if (!(ig8.c() == null || ig8.c().get("engine") == null)) {
                    jSONObject2.put("version", (Object) ig8.c().getJSONObject("engine").getString("version"));
                }
                o oVar = this.c;
                if (!(oVar == null || (context = oVar.p) == null)) {
                    jSONObject2.put("target", (Object) context.getClass().getSimpleName());
                }
                jSONObject.put("args", (Object) jSONObject2);
                TrackerModule.commit(new d.j(this.c, jSONObject, null), false);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f12229a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ Map c;
        public final /* synthetic */ o d;

        public f(String str, boolean z, Map map, o oVar) {
            this.f12229a = str;
            this.b = z;
            this.c = map;
            this.d = oVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("pageName", (Object) "TNode");
            jSONObject.put(PopConst.POP_EVENT_ID_KEY, (Object) 19997);
            jSONObject.put("arg1", (Object) "tnodemtopstart");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("mtop", (Object) this.f12229a);
            jSONObject2.put("isPrefetch", (Object) Boolean.valueOf(this.b));
            Map map = this.c;
            if (map != null) {
                jSONObject2.put("query", (Object) map);
            }
            jSONObject.put("args", (Object) jSONObject2);
            TrackerModule.commit(new d.j(this.d, jSONObject, null), false);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class g implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f12230a;
        public final /* synthetic */ String b;
        public final /* synthetic */ Map c;
        public final /* synthetic */ o d;

        public g(String str, String str2, Map map, o oVar) {
            this.f12230a = str;
            this.b = str2;
            this.c = map;
            this.d = oVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("pageName", (Object) "TNode");
            jSONObject.put(PopConst.POP_EVENT_ID_KEY, (Object) 19997);
            jSONObject.put("arg1", (Object) "mtopPrefetchMatch");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(DnsNavConfigTask.MatchType, (Object) this.f12230a);
            jSONObject2.put("mtop", (Object) this.b);
            Map map = this.c;
            if (map != null) {
                jSONObject2.put("query", (Object) map);
            }
            jSONObject.put("args", (Object) jSONObject2);
            TrackerModule.commit(new d.j(this.d, jSONObject, null), false);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class h implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ o f12231a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;

        public h(o oVar, boolean z, String str, String str2) {
            this.f12231a = oVar;
            this.b = z;
            this.c = str;
            this.d = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (this.f12231a != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("pageName", (Object) "TNode");
                jSONObject.put(PopConst.POP_EVENT_ID_KEY, (Object) 19997);
                jSONObject.put("arg1", (Object) "cache");
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("cache_hit", (Object) String.valueOf(this.b));
                jSONObject2.put("cache_type", (Object) this.c);
                jSONObject2.put("url", (Object) this.d);
                jSONObject.put("args", (Object) jSONObject2);
                TrackerModule.commit(new d.j(this.f12231a, jSONObject, null), false);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class i implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ o f12232a;
        public final /* synthetic */ String b;
        public final /* synthetic */ Map c;

        public i(o oVar, String str, Map map) {
            this.f12232a = oVar;
            this.b = str;
            this.c = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (this.f12232a != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("pageName", (Object) "TNode");
                jSONObject.put(PopConst.POP_EVENT_ID_KEY, (Object) 19997);
                jSONObject.put("arg1", (Object) this.b);
                jSONObject.put("args", (Object) this.c);
                TrackerModule.commit(new d.j(this.f12232a, jSONObject, null), false);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface j {
        void sendITraceLog(boolean z, int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class k {

        /* renamed from: a  reason: collision with root package name */
        public final String f12233a;
        public final long b;
        public final boolean c;
        public final String d;
        public final Map e;
        public final String f;
        public final String g;

        static {
            t2o.a(503317110);
        }

        public k(String str, long j, boolean z, String str2, Map map, String str3, String str4) {
            this.f12233a = str;
            this.b = j;
            this.c = z;
            this.d = str2;
            this.e = map;
            this.f = str3;
            this.g = str4;
        }
    }

    static {
        t2o.a(503317099);
    }

    public static /* synthetic */ void a(o oVar, Map map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("134f4856", new Object[]{oVar, map, str});
        } else {
            f(oVar, map, str);
        }
    }

    public static void b(o oVar, String str, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b082d253", new Object[]{oVar, str, map});
        } else {
            AsyncTask.execute(new i(oVar, str, map));
        }
    }

    public static void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a09a9e13", new Object[]{str, str2});
        } else {
            d(false, 100, str, null, str2, null, null, null, null, null);
        }
    }

    public static void e(o oVar, Map map, n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9905fe99", new Object[]{oVar, map, nVar});
        } else if (oVar != null) {
            nwv.z0(new b(oVar, map), true);
        }
    }

    public static void f(o oVar, Map map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d7a7fc0", new Object[]{oVar, map, str});
        } else {
            AsyncTask.execute(new c(oVar, map, str));
        }
    }

    public static void g(boolean z, String... strArr) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc97e483", new Object[]{new Boolean(z), strArr});
            return;
        }
        h2e d2 = od0.D().d();
        if (z) {
            str = "failed";
        } else {
            str = "load";
        }
        d2.a("TNode", 19997, "gg_class_load", str, "", strArr);
    }

    public static void h(o oVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4f906f2", new Object[]{oVar, map});
        } else if (akt.P0()) {
            b(oVar, "imageloader", map);
        } else {
            p(oVar, "imageloader", map);
        }
    }

    public static void i(o oVar, n nVar, long j2, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55e67086", new Object[]{oVar, nVar, new Long(j2), str, new Boolean(z)});
        }
    }

    public static void j(o oVar, k kVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("baa4448d", new Object[]{oVar, kVar, new Boolean(z)});
        } else if (akt.X1("tnode_tracker_enable_mtop_performance")) {
            AsyncTask.execute(new e(kVar, z, oVar));
        }
    }

    public static void k(o oVar, String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f978b63", new Object[]{oVar, str, str2, map});
        } else if (akt.X1("tnode_tracker_enable_mtop_match")) {
            AsyncTask.execute(new g(str, str2, map, oVar));
        }
    }

    public static void l(o oVar, String str, Map map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2114d33", new Object[]{oVar, str, map, new Boolean(z)});
        } else if (akt.X1("tnode_tracker_enable_mtop_start")) {
            AsyncTask.execute(new f(str, z, map, oVar));
        }
    }

    public static void m(o oVar, n nVar, long j2, int i2, HashMap hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a769ae8d", new Object[]{oVar, nVar, new Long(j2), new Integer(i2), hashMap});
        } else {
            n(oVar, nVar, null, j2, i2, hashMap);
        }
    }

    public static void o(o oVar, boolean z, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("968ac2e7", new Object[]{oVar, new Boolean(z), str, str2});
        } else if (akt.X1("tnode_tracker_enable_pagecache")) {
            AsyncTask.execute(new h(oVar, z, str2, str));
        }
    }

    public static void p(o oVar, String str, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6cf4aa1", new Object[]{oVar, str, map});
            return;
        }
        if (akt.X1("tnode_tracker_enable_" + str)) {
            b(oVar, str, map);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ o f12226a;
        public final /* synthetic */ Map b;
        public final /* synthetic */ String c;

        public c(o oVar, Map map, String str) {
            this.f12226a = oVar;
            this.b = map;
            this.c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str;
            String str2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (this.f12226a != null) {
                String I = nwv.I(this.b.get("name"), null);
                Map z = nwv.z(this.b.get("params"), new HashMap());
                String jSONString = z != null ? JSON.toJSONString(z) : null;
                String I2 = nwv.I(this.b.get("action"), null);
                boolean equals = I.equals("js_error");
                int t = nwv.t(z.get("category"), 0);
                n d0 = this.f12226a.d0();
                String str3 = "unknown dsl url";
                String str4 = "unknown page url";
                if (d0 != null) {
                    n.d X = d0.X();
                    if (!TextUtils.isEmpty(X.f12242a)) {
                        str3 = X.f12242a;
                    }
                    if (!TextUtils.isEmpty(X.b)) {
                        str4 = X.b;
                    }
                    String str5 = X.c;
                    str2 = d0.P().N();
                    str = str5;
                } else {
                    str = null;
                    str2 = null;
                }
                if (equals) {
                    this.f12226a.h0().appendJSLog(6, jSONString, true);
                }
                if (equals || t > 0) {
                    l.d(equals, t, I, I2, jSONString, str3, str4, str, str2, this.c);
                }
            }
        }
    }

    public static void d(boolean z, int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74b77a66", new Object[]{new Boolean(z), new Integer(i2), str, str2, str3, str4, str5, str6, str7, str8});
            return;
        }
        j jVar = f12223a;
        if (jVar == null) {
            g(false, "type", "EfsTracker");
            zk9.b("com.efs.sdk.base.EfsTracker", new a(z, i2, str, str2, str3, str4, str5, str6, str7, str8));
            return;
        }
        jVar.sendITraceLog(z, i2, str, str2, str3, str4, str5, str6, str7, str8);
    }

    public static void n(o oVar, n nVar, String str, long j2, int i2, HashMap hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e324bac3", new Object[]{oVar, nVar, str, new Long(j2), new Integer(i2), hashMap});
            return;
        }
        if (akt.p2("trackNormalPerformance" + i2, true)) {
            AsyncTask.execute(new d(oVar, i2, j2, nVar, hashMap, str));
        }
    }
}
