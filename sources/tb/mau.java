package tb;

import android.app.Activity;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.turbo.core.component.IComponentLifecycle$TriggerType;
import com.taobao.android.turbo.core.subpage.BaseSubPageComponent;
import com.taobao.android.turbo.model.DrawerModel;
import com.taobao.android.turbo.monitor.Monitor;
import com.taobao.statistic.TBS;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTTracker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import tb.f2e;
import tb.tpu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class mau implements f2e {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public qpu f23896a;
    public Activity b;
    public String c;
    public String d;
    public String e;
    public boolean f;
    public final List<b> g = new ArrayList();
    public final Map<String, Object> h = new LinkedHashMap();
    public final g2e i = qau.p();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        static {
            t2o.a(916455707);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f23897a;
        public final String b;
        public final String c;
        public final String d;
        public final Map<String, Object> e;
        public final String f;
        public final String g;
        public final int h;

        static {
            t2o.a(916455708);
        }

        public b(String str, String str2, String str3, String str4, Map<String, ? extends Object> map, String str5, String str6, int i) {
            ckf.g(str2, "arg1");
            this.f23897a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = map;
            this.f = str5;
            this.g = str6;
            this.h = i;
        }

        public final String a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("715cfa88", new Object[]{this});
            }
            return this.b;
        }

        public final String b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("f7e2b527", new Object[]{this});
            }
            return this.c;
        }

        public final String c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("7e686fc6", new Object[]{this});
            }
            return this.d;
        }

        public final Map<String, Object> d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("46c4490f", new Object[]{this});
            }
            return this.e;
        }

        public final int e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("ce275619", new Object[]{this})).intValue();
            }
            return this.h;
        }

        public final String f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("707fddc9", new Object[]{this});
            }
            return this.f23897a;
        }

        public final String g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("91f71dbe", new Object[]{this});
            }
            return this.f;
        }

        public final String h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("3365c57e", new Object[]{this});
            }
            return this.g;
        }
    }

    static {
        t2o.a(916455706);
        t2o.a(916455463);
    }

    public final Map<String, Object> B(Map<String, ? extends Object> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("7671dec0", new Object[]{this, map, str});
        }
        Map<String, Object> t = kotlin.collections.a.t(this.h);
        t.put("spm", str);
        if (map != null) {
            t.putAll(map);
        }
        g2e g2eVar = this.i;
        ckf.f(g2eVar, "trackTint");
        Map<String, String> e = g2eVar.e();
        ckf.f(e, "trackTint.allTrackInfo");
        t.putAll(e);
        return t;
    }

    @Override // tb.f2e
    public Map<String, String> C(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("17a75b01", new Object[]{this, str});
        }
        ckf.g(str, "subPageId");
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, "TrackService", "获取子页面所有属性，subPageId=".concat(str), null, 4, null);
        if (ckf.b(this.e, str)) {
            UTAnalytics instance = UTAnalytics.getInstance();
            ckf.f(instance, "UTAnalytics.getInstance()");
            UTTracker defaultTracker = instance.getDefaultTracker();
            Activity activity = this.b;
            if (activity != null) {
                return defaultTracker.getPageAllProperties(activity);
            }
            ckf.y("utActivity");
            throw null;
        }
        tpu.a.b(aVar, "TrackService", "获取子页面所有属性，resumedSubPageId与subPageId不相等", null, 4, null);
        return null;
    }

    @Override // tb.f2e
    public void D0(String str, Map<String, ? extends Object> map, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa4d50b7", new Object[]{this, str, map, str2});
            return;
        }
        ckf.g(str, "arg1");
        Y0(null, str, map, null, str2, true);
    }

    @Override // tb.f2e
    public Map<String, Object> M0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("880dd23b", new Object[]{this});
        }
        return this.h;
    }

    public final void T0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b45ab069", new Object[]{this});
            return;
        }
        Iterator it = ((ArrayList) this.g).iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            int e = bVar.e();
            if (e == 2101) {
                f2e.a.a(this, bVar.f(), bVar.a(), bVar.d(), bVar.g(), bVar.h(), false, 32, null);
            } else if (e != 2202) {
                f2e.a.b(this, bVar.f(), bVar.a(), bVar.b(), bVar.c(), bVar.d(), bVar.e(), false, 64, null);
            } else {
                f2e.a.c(this, bVar.f(), bVar.a(), bVar.d(), bVar.g(), bVar.h(), false, 32, null);
            }
        }
        ((ArrayList) this.g).clear();
    }

    @Override // tb.f2e
    public void a1(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2515eb1d", new Object[]{this, map});
            return;
        }
        ckf.g(map, "globalParams");
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, "TrackService", "合并全局埋点参数，globalParams=" + map, null, 4, null);
        this.h.putAll(map);
    }

    public final String c0(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e9317015", new Object[]{this, str, str2});
        }
        if (str == null) {
            return null;
        }
        if (str2 == null) {
            return str;
        }
        return str + '.' + str2;
    }

    public final String f(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3f1d78b", new Object[]{this, str, str2});
        }
        if (str != null) {
            return str;
        }
        return str2;
    }

    @Override // tb.sod
    public void onCreateService(qpu qpuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9b2eb95", new Object[]{this, qpuVar});
            return;
        }
        ckf.g(qpuVar, "context");
        this.f23896a = qpuVar;
        this.b = qpuVar.a().p();
    }

    @Override // tb.sod
    public void onDestroyService(qpu qpuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("673e3e35", new Object[]{this, qpuVar});
        } else {
            ckf.g(qpuVar, "context");
        }
    }

    @Override // tb.f2e
    public void p(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbc86072", new Object[]{this, str});
            return;
        }
        ckf.g(str, "spmURL");
        tpu.a.b(tpu.Companion, "TrackService", "设置spm-url，spmURL=".concat(str), null, 4, null);
        this.d = str;
    }

    @Override // tb.f2e
    public void q(String str, Map<String, ? extends Object> map, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd49cb16", new Object[]{this, str, map, str2});
            return;
        }
        ckf.g(str, "arg1");
        v0(null, str, map, null, str2, true);
    }

    @Override // tb.f2e
    public void q0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3c73b4d", new Object[]{this});
            return;
        }
        tpu.a.b(tpu.Companion, "TrackService", "子页面暂停的时机", null, 4, null);
        UTAnalytics instance = UTAnalytics.getInstance();
        ckf.f(instance, "UTAnalytics.getInstance()");
        UTTracker defaultTracker = instance.getDefaultTracker();
        Activity activity = this.b;
        if (activity != null) {
            defaultTracker.pageDisAppear(activity);
            this.e = null;
            return;
        }
        ckf.y("utActivity");
        throw null;
    }

    @Override // tb.f2e
    public void q1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f8004a", new Object[]{this, str});
            return;
        }
        ckf.g(str, "lastSubPageSpm");
        tpu.a.b(tpu.Companion, "TrackService", "设置上一个子页面的spm，lastSubPageSpm=".concat(str), null, 4, null);
        this.c = str;
    }

    public final BaseSubPageComponent.SubPageModel r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseSubPageComponent.SubPageModel) ipChange.ipc$dispatch("9646ff1b", new Object[]{this});
        }
        qpu qpuVar = this.f23896a;
        DrawerModel drawerModel = null;
        if (qpuVar != null) {
            c1c c1cVar = (c1c) qpuVar.getService(c1c.class);
            if (c1cVar.S0()) {
                qpu qpuVar2 = this.f23896a;
                if (qpuVar2 != null) {
                    xwc xwcVar = (xwc) qpuVar2.getService(xwc.class);
                    return xwcVar.d0(xwcVar.getCurrentIndex());
                }
                ckf.y("turboEngineContext");
                throw null;
            }
            DrawerModel.DrawerGravity w0 = c1cVar.w0();
            if (w0 != null) {
                drawerModel = c1cVar.y0(w0);
            }
            return drawerModel;
        }
        ckf.y("turboEngineContext");
        throw null;
    }

    @Override // tb.f2e
    public Map<String, String> w(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c8accbd2", new Object[]{this, str});
        }
        ckf.g(str, "subPageId");
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, "TrackService", "获取子页面属性，subPageId=".concat(str), null, 4, null);
        if (ckf.b(this.e, str)) {
            UTAnalytics instance = UTAnalytics.getInstance();
            ckf.f(instance, "UTAnalytics.getInstance()");
            UTTracker defaultTracker = instance.getDefaultTracker();
            Activity activity = this.b;
            if (activity != null) {
                return defaultTracker.getPageProperties(activity);
            }
            ckf.y("utActivity");
            throw null;
        }
        tpu.a.b(aVar, "TrackService", "获取子页面属性，resumedSubPageId与subPageId不相等", null, 4, null);
        return null;
    }

    public final String x(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("92ce48c0", new Object[]{this, str, str2, str3});
        }
        if (tsq.I(str, "Show-", false, 2, null) || tsq.I(str, "Button-", false, 2, null)) {
            return str2 + '_' + str;
        } else if (tsq.I(str, str2, false, 2, null)) {
            return str;
        } else {
            return str2 + '_' + str3 + str;
        }
    }

    public final String[] L(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("74d74e51", new Object[]{this, map});
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof String) {
                arrayList.add(key + '=' + value);
            } else {
                String jSONString = JSON.toJSONString(value);
                arrayList.add(key + '=' + jSONString);
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    @Override // tb.f2e
    public boolean D(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a4eb38b0", new Object[]{this, str, str2})).booleanValue();
        }
        ckf.g(str, "subPageId");
        ckf.g(str2, "pageName");
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, "TrackService", "更新子页面名称，subPageId=" + str + "，pageName=" + str2, null, 4, null);
        if (ckf.b(this.e, str)) {
            UTAnalytics instance = UTAnalytics.getInstance();
            ckf.f(instance, "UTAnalytics.getInstance()");
            UTTracker defaultTracker = instance.getDefaultTracker();
            Activity activity = this.b;
            if (activity != null) {
                defaultTracker.updatePageName(activity, str2);
                return true;
            }
            ckf.y("utActivity");
            throw null;
        }
        tpu.a.b(aVar, "TrackService", "更新子页面名称，resumedSubPageId与subPageId不相等", null, 4, null);
        return false;
    }

    @Override // tb.f2e
    public boolean J(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("25568abf", new Object[]{this, str, map})).booleanValue();
        }
        ckf.g(str, "subPageId");
        ckf.g(map, wua.KEY_PROPERTIES);
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, "TrackService", "更新子页面属性，subPageId=" + str + "，pageName=" + map.get("pageName") + "，spm=" + map.get("spm-cnt") + "，spmURL=" + map.get("spm-url"), null, 4, null);
        if (ckf.b(this.e, str)) {
            UTAnalytics instance = UTAnalytics.getInstance();
            ckf.f(instance, "UTAnalytics.getInstance()");
            UTTracker defaultTracker = instance.getDefaultTracker();
            Activity activity = this.b;
            if (activity != null) {
                defaultTracker.updatePageProperties(activity, map);
                return true;
            }
            ckf.y("utActivity");
            throw null;
        }
        tpu.a.b(aVar, "TrackService", "更新子页面属性，resumedSubPageId与subPageId不相等", null, 4, null);
        return false;
    }

    @Override // tb.f2e
    public boolean P(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4c52d539", new Object[]{this, str, str2, new Boolean(z)})).booleanValue();
        }
        ckf.g(str, "subPageId");
        ckf.g(str2, "pageName");
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, "TrackService", "子页面可见埋点，subPageId=" + str + "，isSkip=" + z, null, 4, null);
        if (!ckf.b(this.e, str)) {
            tpu.a.b(aVar, "TrackService", "子页面可见埋点，resumedSubPageId与subPageId不相等", null, 4, null);
            return false;
        } else if (z) {
            UTAnalytics instance = UTAnalytics.getInstance();
            ckf.f(instance, "UTAnalytics.getInstance()");
            UTTracker defaultTracker = instance.getDefaultTracker();
            Activity activity = this.b;
            if (activity != null) {
                defaultTracker.pageAppear(activity, str2);
                return true;
            }
            ckf.y("utActivity");
            throw null;
        } else {
            UTAnalytics instance2 = UTAnalytics.getInstance();
            ckf.f(instance2, "UTAnalytics.getInstance()");
            UTTracker defaultTracker2 = instance2.getDefaultTracker();
            Activity activity2 = this.b;
            if (activity2 != null) {
                defaultTracker2.pageAppearDonotSkip(activity2, str2);
                return true;
            }
            ckf.y("utActivity");
            throw null;
        }
    }

    @Override // tb.f2e
    public boolean S(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7806309", new Object[]{this, str})).booleanValue();
        }
        ckf.g(str, "subPageId");
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, "TrackService", "子页面不可见埋点，subPageId=".concat(str), null, 4, null);
        if (ckf.b(this.e, str)) {
            UTAnalytics instance = UTAnalytics.getInstance();
            ckf.f(instance, "UTAnalytics.getInstance()");
            UTTracker defaultTracker = instance.getDefaultTracker();
            Activity activity = this.b;
            if (activity != null) {
                defaultTracker.pageDisAppear(activity);
                return true;
            }
            ckf.y("utActivity");
            throw null;
        }
        tpu.a.b(aVar, "TrackService", "子页面不可见埋点，resumedSubPageId与subPageId不相等", null, 4, null);
        return false;
    }

    public final void m0(String str, int i, Exception exc) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e750d3bb", new Object[]{this, str, new Integer(i), exc});
        } else {
            gi8.INSTANCE.a("埋点异常", kotlin.collections.a.j(jpu.a("arg1", str), jpu.a("eventId", Integer.valueOf(i))), Monitor.Type.TRACK, Monitor.Code.EXCEPTION, true, exc);
        }
    }

    public final void z0(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9e457c9", new Object[]{this, str, new Integer(i)});
        } else {
            gi8.b(gi8.INSTANCE, "埋点页面名为空", kotlin.collections.a.j(jpu.a("arg1", str), jpu.a("eventId", Integer.valueOf(i))), Monitor.Type.TRACK, Monitor.Code.ARGUMENT_ERROR, false, null, 32, null);
        }
    }

    @Override // tb.f2e
    public void f1(Map<String, ? extends Object> map, IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccae073a", new Object[]{this, map, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        BaseSubPageComponent.SubPageModel r = r();
        if (r == null) {
            tpu.a.b(tpu.Companion, "TrackService", "子页面恢复的时机，subPageData为空", null, 4, null);
            return;
        }
        String pageName = r.getPageName();
        String c0 = c0(r.getSpm(), "0.0");
        if (iComponentLifecycle$TriggerType == IComponentLifecycle$TriggerType.TAB_SELECT && (str2 = this.c) != null) {
            p(str2);
        }
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, "TrackService", "子页面恢复的时机，properties=" + map + "，pageName=" + pageName + "，spm=" + c0 + "，spmURL=" + this.d + "，triggerType=" + iComponentLifecycle$TriggerType, null, 4, null);
        UTAnalytics instance = UTAnalytics.getInstance();
        ckf.f(instance, "UTAnalytics.getInstance()");
        UTTracker defaultTracker = instance.getDefaultTracker();
        Activity activity = this.b;
        if (activity != null) {
            defaultTracker.pageAppearDonotSkip(activity, pageName);
            UTAnalytics instance2 = UTAnalytics.getInstance();
            ckf.f(instance2, "UTAnalytics.getInstance()");
            UTTracker defaultTracker2 = instance2.getDefaultTracker();
            Activity activity2 = this.b;
            if (activity2 != null) {
                defaultTracker2.updatePageName(activity2, pageName);
                Map<String, String> k = kotlin.collections.a.k(jpu.a("pageName", pageName), jpu.a("spm-cnt", c0), jpu.a("spm-url", this.d), jpu.a("force-spm-cnt", c0), jpu.a("force-spm-url", this.d));
                if (map != null) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap(v3i.e(map.size()));
                    Iterator<T> it = map.entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        if (value instanceof String) {
                            str = (String) value;
                        } else {
                            str = JSON.toJSONString(value);
                        }
                        linkedHashMap.put(key, str);
                    }
                    k.putAll(linkedHashMap);
                }
                g2e g2eVar = this.i;
                ckf.f(g2eVar, "trackTint");
                Map<String, String> e = g2eVar.e();
                ckf.f(e, "trackTint.allTrackInfo");
                k.putAll(e);
                UTAnalytics instance3 = UTAnalytics.getInstance();
                ckf.f(instance3, "UTAnalytics.getInstance()");
                UTTracker defaultTracker3 = instance3.getDefaultTracker();
                Activity activity3 = this.b;
                if (activity3 != null) {
                    defaultTracker3.updatePageProperties(activity3, k);
                    this.e = r.getId();
                    this.f = true;
                    T0();
                    return;
                }
                ckf.y("utActivity");
                throw null;
            }
            ckf.y("utActivity");
            throw null;
        }
        ckf.y("utActivity");
        throw null;
    }

    @Override // tb.f2e
    public void v0(String str, String str2, Map<String, ? extends Object> map, String str3, String str4, boolean z) {
        String str5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8592e7fe", new Object[]{this, str, str2, map, str3, str4, new Boolean(z)});
            return;
        }
        ckf.g(str2, "arg1");
        tpu.a aVar = tpu.Companion;
        aVar.c("TrackService", "点击埋点，pageName=" + str + "，arg1=" + str2 + "，args=" + map + "，spmAB=" + str3 + "，spmCD=" + str4 + "，isPendingSubPageResume=" + z);
        if (z) {
            try {
                if (!this.f) {
                    ((ArrayList) this.g).add(new b(str, str2, null, null, map, str3, str4, 2101));
                    return;
                }
            } catch (Exception e) {
                m0(str2, 2101, e);
                return;
            }
        }
        BaseSubPageComponent.SubPageModel r = r();
        String f = f(str, r != null ? r.getPageName() : null);
        if (f == null) {
            z0(str2, 2101);
            return;
        }
        String x = x(str2, f, "Button-");
        if (str3 != null) {
            str5 = str3;
        } else {
            str5 = r != null ? r.getSpm() : null;
        }
        String[] L = L(B(map, c0(str5, str4)));
        TBS.Ext.commitEvent(f, 2101, x, null, null, (String[]) Arrays.copyOf(L, L.length));
    }

    @Override // tb.f2e
    public void Y0(String str, String str2, Map<String, ? extends Object> map, String str3, String str4, boolean z) {
        String str5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eec302fd", new Object[]{this, str, str2, map, str3, str4, new Boolean(z)});
            return;
        }
        ckf.g(str2, "arg1");
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, "TrackService", "曝光埋点，pageName=" + str + "，arg1=" + str2 + "，args=" + map + "，spmAB=" + str3 + "，spmCD=" + str4 + "，isPendingSubPageResume=" + z, null, 4, null);
        if (z) {
            try {
                if (!this.f) {
                    ((ArrayList) this.g).add(new b(str, str2, null, null, map, str3, str4, 2202));
                    return;
                }
            } catch (Exception e) {
                m0(str2, 2202, e);
                return;
            }
        }
        BaseSubPageComponent.SubPageModel r = r();
        String f = f(str, r != null ? r.getPageName() : null);
        if (f == null) {
            z0(str2, 2202);
            return;
        }
        String x = x(str2, f, "Show-");
        if (str3 != null) {
            str5 = str3;
        } else {
            str5 = r != null ? r.getSpm() : null;
        }
        String[] L = L(B(map, c0(str5, str4)));
        TBS.Ext.commitEvent(f, 2202, x, null, null, (String[]) Arrays.copyOf(L, L.length));
    }

    @Override // tb.f2e
    public void z1(String str, String str2, String str3, String str4, Map<String, ? extends Object> map, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29f73ad6", new Object[]{this, str, str2, str3, str4, map, new Integer(i), new Boolean(z)});
            return;
        }
        ckf.g(str2, "arg1");
        tpu.a aVar = tpu.Companion;
        aVar.c("TrackService", "自定义埋点，pageName=" + str + "，arg1=" + str2 + "，arg2=" + str3 + "，arg3=" + str4 + "，args=" + map + "，eventId=" + i + "，isPendingSubPageResume=" + z);
        if (z) {
            try {
                if (!this.f) {
                    ((ArrayList) this.g).add(new b(str, str2, str3, str4, map, null, null, i));
                    return;
                }
            } catch (Exception e) {
                m0(str2, i, e);
                return;
            }
        }
        BaseSubPageComponent.SubPageModel r = r();
        String f = f(str, r != null ? r.getPageName() : null);
        if (f == null) {
            z0(str2, i);
            return;
        }
        String[] L = L(B(map, null));
        TBS.Ext.commitEvent(f, i, str2, str3, str4, (String[]) Arrays.copyOf(L, L.length));
    }
}
