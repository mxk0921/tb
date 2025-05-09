package com.taobao.flowcustoms.afc;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.flowcustoms.afc.model.SmallHandleData;
import com.taobao.flowcustoms.afc.utils.AfcUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;
import org.json.JSONObject;
import tb.ah0;
import tb.bh0;
import tb.cmp;
import tb.dad;
import tb.dwc;
import tb.gad;
import tb.i4j;
import tb.i6j;
import tb.k81;
import tb.pg0;
import tb.qg0;
import tb.rg0;
import tb.rxb;
import tb.t2o;
import tb.vg0;
import tb.vp9;
import tb.wg0;
import tb.xg0;
import tb.yg0;
import tb.zsa;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class AfcCustomSdk {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String LOG_TAG = "linkx";
    public static final String LOG_TAG_UT = "afcPoint";
    public static final String LOG_TIME = "link_time";
    public static final String SDK_VERSION = "5.0";
    public static boolean g = false;
    public static boolean h = false;
    public static final AtomicBoolean i = new AtomicBoolean(false);

    /* renamed from: a  reason: collision with root package name */
    public Application f10563a;
    public String b;
    public String c;
    public String d;
    public String e;
    public qg0 f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public enum Environment {
        ONLINE,
        PRE;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(Environment environment, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/flowcustoms/afc/AfcCustomSdk$Environment");
        }

        public static Environment valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Environment) ipChange.ipc$dispatch("90c48591", new Object[]{str});
            }
            return (Environment) Enum.valueOf(Environment.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements gad {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long f10564a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ boolean c;

        /* compiled from: Taobao */
        /* renamed from: com.taobao.flowcustoms.afc.AfcCustomSdk$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public class C0557a implements rxb {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ long f10565a;

            /* compiled from: Taobao */
            /* renamed from: com.taobao.flowcustoms.afc.AfcCustomSdk$a$a$a  reason: collision with other inner class name */
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
            public class C0558a implements gad {
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ long f10566a;
                public final /* synthetic */ Map b;

                public C0558a(long j, Map map) {
                    this.f10566a = j;
                    this.b = map;
                }

                @Override // tb.gad
                public void a(String str) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("24e8dab", new Object[]{this, str});
                        return;
                    }
                    long g = AfcUtils.g();
                    vp9.b(AfcCustomSdk.LOG_TIME, "海关分流后节点耗时：" + (g - this.f10566a) + "");
                    ah0.d(ah0.AFC_AFTER_LINK_ROUTER_TIME, (g - this.f10566a) + "", "", null);
                    StringBuilder sb = new StringBuilder("AfcCustomSdk === handleUrl === 分流后插件执行完毕");
                    sb.append(str);
                    vp9.b("linkx", sb.toString());
                    pg0.i().s(AfcCustomSdk.this.f, ah0.AFC_LINK_END, new HashMap<>());
                    if (TextUtils.isEmpty(AfcCustomSdk.this.f.x)) {
                        yg0.i().d(AfcCustomSdk.this.f);
                    }
                    AfcCustomSdk afcCustomSdk = AfcCustomSdk.this;
                    AfcCustomSdk.a(afcCustomSdk, afcCustomSdk.f, str, this.b);
                }
            }

            public C0557a(long j) {
                this.f10565a = j;
            }

            public void a(boolean z, int i) {
                String str;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("72457c26", new Object[]{this, new Boolean(z), new Integer(i)});
                    return;
                }
                long g = AfcUtils.g();
                vp9.b(AfcCustomSdk.LOG_TIME, "海关分流节点耗时：" + (g - this.f10565a) + "");
                ah0.d(ah0.AFC_LINK_ROUTER_TIME, (g - this.f10565a) + "", "", null);
                String str2 = AfcCustomSdk.this.f.w;
                vp9.b("linkx", "AfcCustomSdk === handleUrl === 分流逻辑返回的URL：" + str2);
                if (TextUtils.isEmpty(str2)) {
                    str2 = AfcCustomSdk.this.f.f;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("isRequestSuccess", Boolean.valueOf(z));
                hashMap.put("cold_startup_h5", Boolean.valueOf(a.this.b));
                hashMap.put("hot_startup_h5", Boolean.valueOf(a.this.c));
                HashMap hashMap2 = new HashMap();
                hashMap2.put(rg0.LINK_MANAGER_SDK_VERSION, AfcCustomSdk.SDK_VERSION);
                if (TextUtils.isEmpty(AfcCustomSdk.this.f.t)) {
                    str = "unknown";
                } else {
                    str = AfcCustomSdk.this.f.t;
                }
                hashMap2.put("userId", str);
                hashMap2.put("url", str2);
                String string = AfcCustomSdk.this.f.B.getString("asyncReqBucketId");
                if (TextUtils.isEmpty(string)) {
                    string = "";
                }
                hashMap2.put("asyncReqBucketId", string);
                hashMap2.put("routerStrategy", yg0.i().h(i));
                ah0.d(ah0.AFC_FLOW_ROUTER_AFTER, "", "", hashMap2);
                ArrayList arrayList = new ArrayList(Arrays.asList(new wg0[((CopyOnWriteArrayList) xg0.a().b).size()]));
                Collections.copy(arrayList, xg0.a().b);
                long g2 = AfcUtils.g();
                AfcCustomSdk afcCustomSdk = AfcCustomSdk.this;
                AfcCustomSdk.b(afcCustomSdk, afcCustomSdk.f, arrayList, str2, new C0558a(g2, hashMap));
            }
        }

        public a(long j, boolean z, boolean z2) {
            this.f10564a = j;
            this.b = z;
            this.c = z2;
        }

        @Override // tb.gad
        public void a(String str) {
            String str2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("24e8dab", new Object[]{this, str});
                return;
            }
            vp9.a("linkx", "AfcCustomSdk === handleUrl === 分流前插件执行完毕" + str);
            HashMap hashMap = new HashMap();
            hashMap.put(rg0.LINK_MANAGER_SDK_VERSION, AfcCustomSdk.SDK_VERSION);
            if (TextUtils.isEmpty(AfcCustomSdk.this.f.t)) {
                str2 = "unknown";
            } else {
                str2 = AfcCustomSdk.this.f.t;
            }
            hashMap.put("userId", str2);
            ah0.d(ah0.AFC_FLOW_ROUTER_BEFORE, "", "", hashMap);
            long g = AfcUtils.g();
            vp9.b(AfcCustomSdk.LOG_TIME, "海关分流前节点耗时：" + (g - this.f10564a) + "");
            ah0.d(ah0.AFC_BEFORE_LINK_ROUTER_TIME, (g - this.f10564a) + "", "", null);
            long g2 = AfcUtils.g();
            AfcCustomSdk afcCustomSdk = AfcCustomSdk.this;
            AfcCustomSdk.c(afcCustomSdk, afcCustomSdk.f, new C0557a(g2));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements dwc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ qg0 f10567a;

        public b(qg0 qg0Var) {
            this.f10567a = qg0Var;
        }

        @Override // tb.dwc
        public void a(boolean z, int i, String str, String str2, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1aa514c3", new Object[]{this, new Boolean(z), new Integer(i), str, str2, map});
                return;
            }
            vp9.a("linkx", "AfcCustomSdk === onMTOPDataBack === 走本地分流");
            Object obj = map.get("afcBackUrl");
            if (obj instanceof String) {
                String str3 = (String) obj;
                if (!TextUtils.isEmpty(str3)) {
                    this.f10567a.x = str3;
                    pg0.i().B(str3);
                }
            }
            AfcCustomSdk.d(AfcCustomSdk.this, str, str2, map);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c implements dwc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ qg0 f10568a;
        public final /* synthetic */ rxb b;

        public c(qg0 qg0Var, rxb rxbVar) {
            this.f10568a = qg0Var;
            this.b = rxbVar;
        }

        @Override // tb.dwc
        public void a(boolean z, int i, String str, String str2, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1aa514c3", new Object[]{this, new Boolean(z), new Integer(i), str, str2, map});
                return;
            }
            Object obj = map.get("afcBackUrl");
            if (obj instanceof String) {
                this.f10568a.x = (String) obj;
            }
            Object obj2 = map.get(rg0.JUMP_URL);
            if (obj2 instanceof String) {
                String str3 = (String) obj2;
                if (!TextUtils.isEmpty(str3)) {
                    this.f10568a.w = str3;
                }
            }
            rxb rxbVar = this.b;
            if (rxbVar != null) {
                ((a.C0557a) rxbVar).a(z, 2);
            }
            AfcCustomSdk.d(AfcCustomSdk.this, str, str2, map);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class d implements i6j {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d(AfcCustomSdk afcCustomSdk) {
        }

        @Override // tb.i6j
        public void a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bdd26f3", new Object[]{this, jSONObject});
                return;
            }
            vp9.a("linkx", "LocalRouteReportRequest === onSuccess: " + jSONObject);
        }

        @Override // tb.i6j
        public void b(JSONObject jSONObject, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("29c4da98", new Object[]{this, jSONObject, str});
                return;
            }
            vp9.a("linkx", "LocalRouteReportRequest === onError === 请求失败:" + jSONObject + " 错误码：" + str);
        }

        @Override // tb.i6j
        public void c(MtopResponse mtopResponse, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b7369b0e", new Object[]{this, mtopResponse, jSONObject});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class e implements dwc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // tb.dwc
        public void a(boolean z, int i, String str, String str2, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1aa514c3", new Object[]{this, new Boolean(z), new Integer(i), str, str2, map});
            } else {
                AfcCustomSdk.d(AfcCustomSdk.this, str, str2, map);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class f implements dad {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ qg0 f10570a;
        public final /* synthetic */ List b;
        public final /* synthetic */ gad c;

        public f(qg0 qg0Var, List list, gad gadVar) {
            this.f10570a = qg0Var;
            this.b = list;
            this.c = gadVar;
        }

        @Override // tb.dad
        public void a(boolean z, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2a18ee48", new Object[]{this, new Boolean(z), str});
            } else {
                AfcCustomSdk.b(AfcCustomSdk.this, this.f10570a, this.b, str, this.c);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class g implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ wg0 f10571a;
        public final /* synthetic */ qg0 b;
        public final /* synthetic */ String c;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public class a implements dad {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a(g gVar) {
            }

            @Override // tb.dad
            public void a(boolean z, String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("2a18ee48", new Object[]{this, new Boolean(z), str});
                }
            }
        }

        public g(wg0 wg0Var, qg0 qg0Var, String str) {
            this.f10571a = wg0Var;
            this.b = qg0Var;
            this.c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f10571a.a(this.b, this.c, new a(this));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final AfcCustomSdk f10572a = new AfcCustomSdk(null);

        static {
            t2o.a(467664912);
        }

        public static /* synthetic */ AfcCustomSdk a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AfcCustomSdk) ipChange.ipc$dispatch("cf55783e", new Object[0]);
            }
            return f10572a;
        }
    }

    static {
        t2o.a(467664900);
    }

    public /* synthetic */ AfcCustomSdk(a aVar) {
        this();
    }

    public static /* synthetic */ void a(AfcCustomSdk afcCustomSdk, qg0 qg0Var, String str, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85e4f128", new Object[]{afcCustomSdk, qg0Var, str, map});
        } else {
            afcCustomSdk.i(qg0Var, str, map);
        }
    }

    public static /* synthetic */ void b(AfcCustomSdk afcCustomSdk, qg0 qg0Var, List list, String str, gad gadVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("407bce41", new Object[]{afcCustomSdk, qg0Var, list, str, gadVar});
        } else {
            afcCustomSdk.e(qg0Var, list, str, gadVar);
        }
    }

    public static /* synthetic */ void c(AfcCustomSdk afcCustomSdk, qg0 qg0Var, rxb rxbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("431f4fd0", new Object[]{afcCustomSdk, qg0Var, rxbVar});
        } else {
            afcCustomSdk.l(qg0Var, rxbVar);
        }
    }

    public static /* synthetic */ void d(AfcCustomSdk afcCustomSdk, String str, String str2, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19111d76", new Object[]{afcCustomSdk, str, str2, map});
        } else {
            afcCustomSdk.o(str, str2, map);
        }
    }

    public static AfcCustomSdk h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AfcCustomSdk) ipChange.ipc$dispatch("eeb06e63", new Object[0]);
        }
        return h.a();
    }

    public void f(Context context, Intent intent) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b918e17", new Object[]{this, context, intent});
            return;
        }
        long g2 = AfcUtils.g();
        if (AfcUtils.s(context)) {
            AfcUtils.w(context);
        }
        boolean b2 = qg0.b(intent);
        boolean d2 = qg0.d(intent);
        this.f = new qg0(intent, context);
        vp9.a("linkx", "AFCRouter === router：执行外链唤端逻辑");
        try {
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put(ah0.AFC_ID, this.e);
            if (intent.getData() == null) {
                str = "";
            } else {
                str = intent.getData().toString();
            }
            hashMap.put("url", str);
            hashMap.put("sourceApplication", AfcUtils.c(k81.c().a()));
            pg0.i().s(this.f, ah0.AFC_LINK_START, hashMap);
        } catch (Exception e2) {
            vp9.b("linkx", "AfcCustomSdk === handleUrl === afc_link_start埋点异常：" + e2);
        }
        rg0.e(rg0.c(intent), this.f);
        ArrayList arrayList = new ArrayList(Arrays.asList(new wg0[((CopyOnWriteArrayList) xg0.a().f31368a).size()]));
        Collections.copy(arrayList, xg0.a().f31368a);
        qg0 qg0Var = this.f;
        e(qg0Var, arrayList, qg0Var.f, new a(g2, b2, d2));
    }

    public final void i(qg0 qg0Var, String str, Map<String, Object> map) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("563d194f", new Object[]{this, qg0Var, str, map});
            return;
        }
        try {
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put(ah0.AFC_ID, this.e);
            hashMap.put("h5Url", qg0Var.f);
            hashMap.put(rg0.JUMP_URL, str);
            pg0.i().s(qg0Var, ah0.AFC_LINK_NAV_START, hashMap);
        } catch (Exception e2) {
            vp9.b("linkx", "AfcCustomSdk === nav2Page === afc_link_nav_start埋点异常：" + e2);
        }
        try {
            HashMap hashMap2 = new HashMap();
            hashMap2.put(rg0.LINK_MANAGER_SDK_VERSION, SDK_VERSION);
            if (TextUtils.isEmpty(qg0Var.t)) {
                str2 = "unknown";
            } else {
                str2 = qg0Var.t;
            }
            hashMap2.put("userId", str2);
            hashMap2.put("url", str);
            hashMap2.put("afcBackUrl", qg0Var.x);
            ah0.d(ah0.AFC_NAV_URL, "", "", hashMap2);
            vp9.b("linkx", "AfcCustomSdk === nav2Page === 开始导航：" + str);
        } catch (Exception e3) {
            vp9.b("linkx", "AfcCustomSdk === nav2Page === 开始导航埋点异常：" + e3);
        }
        pg0.i().q(str, map);
        bh0.a(qg0Var);
    }

    public final SmallHandleData.BackAppInfos j(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SmallHandleData.BackAppInfos) ipChange.ipc$dispatch("c5a68124", new Object[]{this, map});
        }
        SmallHandleData smallHandleData = (SmallHandleData) JSON.parseObject(JSON.toJSONString(map), SmallHandleData.class);
        SmallHandleData.BackAppInfos backAppInfos = null;
        if (!(smallHandleData == null || smallHandleData.getBackAppInfos() == null || smallHandleData.getBackAppInfos().size() <= 0)) {
            for (SmallHandleData.BackAppInfos backAppInfos2 : smallHandleData.getBackAppInfos()) {
                if (backAppInfos2.getAppKey().equals(this.f.f26733a)) {
                    backAppInfos = backAppInfos2;
                }
                cmp b2 = cmp.b(h().f10563a);
                b2.d("local_appKeys" + backAppInfos2.getAppKey(), backAppInfos2);
            }
            cmp.b(h().f10563a).d("timestamp", Long.valueOf(System.currentTimeMillis()));
        }
        return backAppInfos;
    }

    public final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be549c7d", new Object[]{this});
        } else if (yg0.i().s(this.f)) {
            HashMap hashMap = new HashMap();
            hashMap.put("afcId", this.e);
            hashMap.put("openAppUrl", this.f.n);
            i4j.b().d(i4j.LOCAL_ROUTE_REPORT_API, "1.0", hashMap, false, new d(this), new Handler(zsa.b.f32989a.getLooper()), 10000);
        }
    }

    public void m(Environment environment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ca03950", new Object[]{this, environment});
        }
    }

    public void n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("198994d6", new Object[]{this, str});
        } else {
            this.d = str;
        }
    }

    public final void o(String str, String str2, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3852495e", new Object[]{this, str, str2, map});
            return;
        }
        try {
            if (!i4j.LINK_INFO_API_NEW.equals(str) || !"2.0".equals(str2)) {
                bh0.c(this.f, map);
            } else {
                bh0.b(this.f, j(map));
            }
        } catch (Exception e2) {
            vp9.a("linkx", "AfcCustomSdk === routerUrl === 小把手解析错误：" + e2.getMessage());
            ah0.d(ah0.AFC_LINK_CRASH_MESSAGE, ah0.AFC_LINK_CRASH_SMALL_HANDLE, e2.getMessage(), null);
        }
    }

    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc27dd7e", new Object[]{this});
        } else {
            vp9.c(true);
        }
    }

    public AfcCustomSdk() {
        IpChange ipChange = Environment.$ipChange;
        this.e = "";
        this.f = new qg0();
    }

    public void g(Application application, String str, String str2, Environment environment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de5161ec", new Object[]{this, application, str, str2, environment});
        } else if (!g) {
            g = true;
            if (application == null) {
                vp9.a("linkx", "AfcCustomSdk === init === 初始化失败，application为空");
                return;
            }
            this.f10563a = application;
            this.b = str;
            this.c = str2;
            cmp.b(application);
            n(Mtop.Id.INNER);
            m(environment);
            k81.c().d(application);
            vg0.c();
            pg0.i().s(null, ah0.AFC_SDK_INIT, new HashMap<>());
            rg0.d(application, str, SDK_VERSION);
            com.taobao.flowcustoms.afc.utils.a.a(application);
        }
    }

    public final void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2cfb0736", new Object[]{this});
        } else if (yg0.i().q(this.f) || yg0.i().s(this.f)) {
            String str = (String) cmp.b(h().f10563a).a("applink_xbs_config", "");
            long longValue = ((Long) cmp.b(h().f10563a).a("timestamp", 0L)).longValue();
            cmp b2 = cmp.b(h().f10563a);
            String str2 = (String) b2.a("local_appKeys" + this.f.f26733a, "");
            StringBuilder sb = new StringBuilder();
            if (!TextUtils.isEmpty(str2)) {
                bh0.b(this.f, (SmallHandleData.BackAppInfos) JSON.parseObject(str2, SmallHandleData.BackAppInfos.class));
            } else if (!TextUtils.isEmpty(this.f.f26733a)) {
                sb.append(this.f.f26733a);
            }
            if (!TextUtils.isEmpty(str)) {
                com.alibaba.fastjson.JSONObject parseObject = JSON.parseObject(str);
                if (!parseObject.isEmpty()) {
                    for (String str3 : parseObject.keySet()) {
                        if (Long.parseLong(str3) > longValue) {
                            if (sb.length() != 0) {
                                sb.append(",");
                            }
                            sb.append(parseObject.get(str3));
                        }
                    }
                }
            }
            if (sb.length() != 0) {
                this.f.A = String.valueOf(sb);
                yg0.i().e(this.f, 0, new e());
            }
        }
    }

    public final void e(qg0 qg0Var, List<wg0> list, String str, gad gadVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("784a39f3", new Object[]{this, qg0Var, list, str, gadVar});
        } else if (list.size() == 0) {
            gadVar.a(str);
            vp9.a("linkx", "AfcCustomSdk === executePlugin === 没有可执行的插件，返回=" + str);
        } else {
            wg0 wg0Var = list.get(0);
            list.remove(0);
            if (1 == wg0Var.b(qg0Var)) {
                wg0Var.a(qg0Var, str, new f(qg0Var, list, gadVar));
                return;
            }
            zsa.b.a(new g(wg0Var, qg0Var, str));
            e(qg0Var, list, str, gadVar);
        }
    }

    public final void l(qg0 qg0Var, rxb rxbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("870f8ec1", new Object[]{this, qg0Var, rxbVar});
            return;
        }
        int g2 = yg0.i().g(qg0Var);
        try {
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put(ah0.AFC_ID, this.e);
            hashMap.put("url", this.f.f);
            hashMap.put("isNativeRouter", String.valueOf(g2 == 0));
            hashMap.put("routerStrategy", yg0.i().h(g2));
            pg0.i().s(qg0Var, ah0.AFC_LINK_ROUTER, hashMap);
        } catch (Exception e2) {
            vp9.b("linkx", "AfcCustomSdk === routerUrl === afc_link_router埋点异常：" + e2);
        }
        qg0Var.B.put("routerStrategy", (Object) yg0.i().h(g2));
        String str = "unknown";
        if (g2 == 0) {
            vp9.a("linkx", "AfcCustomSdk === routerUrl === 走客户端分流");
            HashMap hashMap2 = new HashMap();
            hashMap2.put(rg0.LINK_MANAGER_SDK_VERSION, SDK_VERSION);
            hashMap2.put("url", this.f.f);
            if (!TextUtils.isEmpty(this.f.t)) {
                str = this.f.t;
            }
            hashMap2.put("userId", str);
            ah0.d(ah0.AFC_FLOW_LOCAL_ROUTER, "", "", hashMap2);
            try {
                Uri parse = Uri.parse(this.f.f);
                if (parse != null && TextUtils.isEmpty(parse.getQueryParameter("isNeedHome"))) {
                    Uri.Builder buildUpon = parse.buildUpon();
                    buildUpon.appendQueryParameter("isNeedHome", "0");
                    this.f.w = buildUpon.build().toString();
                }
            } catch (Exception e3) {
                vp9.b("linkx", "AfcCustomSdk === routerUrl === " + e3);
            }
            k();
            ((a.C0557a) rxbVar).a(true, 0);
            try {
                q();
            } catch (Exception e4) {
                vp9.a("linkx", "AfcCustomSdk === routerUrl === 客户端分流逻辑异常：" + e4.getMessage());
                ah0.d(ah0.AFC_LINK_CRASH_MESSAGE, ah0.AFC_LINK_CRASH_ROUTER_URL, e4.getMessage(), null);
            }
        } else if (g2 == 1) {
            vp9.a("linkx", "AfcCustomSdk === routerUrl === 走本地分流");
            HashMap hashMap3 = new HashMap();
            hashMap3.put(rg0.LINK_MANAGER_SDK_VERSION, SDK_VERSION);
            if (!TextUtils.isEmpty(this.f.t)) {
                str = this.f.t;
            }
            hashMap3.put("userId", str);
            String string = qg0Var.B.getString("asyncReqBucketId");
            if (TextUtils.isEmpty(string)) {
                string = "";
            }
            hashMap3.put("asyncReqBucketId", string);
            hashMap3.put("routerStrategy", "asyncRemote");
            ah0.d(ah0.AFC_FLOW_REMOTE_ROUTER, "", "", hashMap3);
            pg0.i().B("");
            yg0.i().e(qg0Var, g2, new b(qg0Var));
            ((a.C0557a) rxbVar).a(true, 1);
        } else {
            vp9.a("linkx", "AfcCustomSdk === routerUrl === 走服务端分流");
            HashMap hashMap4 = new HashMap();
            hashMap4.put(rg0.LINK_MANAGER_SDK_VERSION, SDK_VERSION);
            if (!TextUtils.isEmpty(this.f.t)) {
                str = this.f.t;
            }
            hashMap4.put("userId", str);
            String string2 = qg0Var.B.getString("asyncReqBucketId");
            if (TextUtils.isEmpty(string2)) {
                string2 = "";
            }
            hashMap4.put("asyncReqBucketId", string2);
            hashMap4.put("routerStrategy", "syncRemote");
            ah0.d(ah0.AFC_FLOW_REMOTE_ROUTER, "", "", hashMap4);
            if (Boolean.parseBoolean(pg0.i().c("useDefaultLinkBack", "true"))) {
                pg0.i().B("");
            }
            yg0.i().e(qg0Var, g2, new c(qg0Var, rxbVar));
        }
    }
}
