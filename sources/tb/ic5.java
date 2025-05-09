package tb;

import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.f;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.ugc.h5.WVMicorPublishPlugin;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ic5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final int f21228a;
    public static kub b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class c extends l46 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f21231a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ Map d;

        public c(String str, String str2, String str3, Map map) {
            this.f21231a = str;
            this.b = str2;
            this.c = str3;
            this.d = map;
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/monitor/DXAppMonitor$3");
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (ic5.g(null) && !DinamicXEngine.j0()) {
                ic5.b(this.f21231a, this.b, this.c, null, this.d);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class d extends l46 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ f f21232a;
        public final /* synthetic */ boolean b;

        public d(f fVar, boolean z) {
            this.f21232a = fVar;
            this.b = z;
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/monitor/DXAppMonitor$4");
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            f fVar = this.f21232a;
            String str = fVar.f7311a;
            ArrayList arrayList = (ArrayList) fVar.c;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                f.a aVar = (f.a) arrayList.get(i);
                if (aVar != null && !TextUtils.isEmpty(aVar.b)) {
                    if (aVar.f == null) {
                        aVar.f = new HashMap();
                    }
                    aVar.f.put("eventId", this.f21232a.a());
                    aVar.f.put("isButter", String.valueOf(this.f21232a.d));
                    if (this.b) {
                        aVar.c = "SimplePipeline" + aVar.c;
                    }
                    ic5.d(str, this.f21232a.b, aVar.c, aVar.b, aVar.f, aVar.d, aVar.e, aVar.f7312a, aVar.g);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final int f21233a = R.id.apm_view_token;

        static {
            t2o.a(444596894);
        }

        public static /* synthetic */ int a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("bcd6076a", new Object[0])).intValue();
            }
            return f21233a;
        }
    }

    static {
        t2o.a(444596888);
        f21228a = -1;
        if (!eb5.E()) {
            f21228a = R.id.apm_view_token;
        }
    }

    public static /* synthetic */ kub a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kub) ipChange.ipc$dispatch("a838089b", new Object[0]);
        }
        return b;
    }

    public static /* synthetic */ JSONObject b(String str, String str2, String str3, DXTemplateItem dXTemplateItem, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("32579625", new Object[]{str, str2, str3, dXTemplateItem, map});
        }
        return f(str, str2, str3, dXTemplateItem, map);
    }

    public static /* synthetic */ String c(String str, String str2, DXTemplateItem dXTemplateItem, Map map, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7eef9f28", new Object[]{str, str2, dXTemplateItem, map, str3});
        }
        return e(str, str2, dXTemplateItem, map, str3);
    }

    public static /* synthetic */ void d(String str, DXTemplateItem dXTemplateItem, String str2, String str3, Map map, int i, String str4, long j, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e144487a", new Object[]{str, dXTemplateItem, str2, str3, map, new Integer(i), str4, new Long(j), new Boolean(z)});
        } else {
            t(str, dXTemplateItem, str2, str3, map, i, str4, j, z);
        }
    }

    public static String e(String str, String str2, DXTemplateItem dXTemplateItem, Map<String, String> map, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2c13eefe", new Object[]{str, str2, dXTemplateItem, map, str3});
        }
        StringBuilder sb = new StringBuilder("[");
        sb.append(str);
        sb.append("]:");
        sb.append(str2);
        sb.append("|");
        JSONObject jSONObject = new JSONObject();
        if (dXTemplateItem != null) {
            jSONObject.put("template", (Object) dXTemplateItem.f7343a);
            jSONObject.put("version", (Object) Long.valueOf(dXTemplateItem.b));
        }
        if (map != null && map.size() > 0) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                jSONObject.put(entry.getKey(), (Object) entry.getValue());
            }
        }
        if (str3 != null) {
            jSONObject.put("error", (Object) str3);
        }
        sb.append(jSONObject.toJSONString());
        return sb.toString();
    }

    public static JSONObject f(String str, String str2, String str3, DXTemplateItem dXTemplateItem, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f76cc7dd", new Object[]{str, str2, str3, dXTemplateItem, map});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("bizName", (Object) h36.TAG);
        if (!TextUtils.isEmpty(str)) {
            jSONObject.put("sceneName", (Object) str);
        }
        if (!TextUtils.isEmpty(str3)) {
            jSONObject.put("serviceId", (Object) str3);
        } else {
            jSONObject.put("serviceId", (Object) "DX_Default_Service_Id");
        }
        if (!TextUtils.isEmpty(str2)) {
            jSONObject.put("featureType", (Object) str2);
        }
        jSONObject.put("version", (Object) h());
        jSONObject.put("samplingRate", (Object) "1.0");
        if (dXTemplateItem != null) {
            if (!TextUtils.isEmpty(dXTemplateItem.f7343a)) {
                jSONObject.put(yh6.CONFIG_KEY_TEMPLATE_NAME, (Object) dXTemplateItem.f7343a);
            }
            jSONObject.put("templateVersion", (Object) (dXTemplateItem.b + ""));
            if (!TextUtils.isEmpty(dXTemplateItem.c)) {
                jSONObject.put(WVMicorPublishPlugin.TEMPLATE_URL, (Object) dXTemplateItem.c);
            }
            jSONObject.put("templateType", (Object) Integer.valueOf(dXTemplateItem.g()));
        }
        if (map != null && map.size() > 0) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (!(entry == null || entry.getKey() == null || entry.getValue() == null)) {
                    jSONObject.put(entry.getKey(), (Object) entry.getValue());
                }
            }
        }
        return jSONObject;
    }

    public static boolean g(DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c0abe74f", new Object[]{dXTemplateItem})).booleanValue();
        }
        double doubleValue = zg5.R2().doubleValue();
        if (dXTemplateItem != null && zg5.W4(dXTemplateItem.f7343a)) {
            doubleValue = zg5.d3().doubleValue();
        }
        if (doubleValue > Math.random()) {
            return true;
        }
        return false;
    }

    public static String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2a8fef97", new Object[0]);
        }
        return k75.VIDEOCONFIG_API_VERSION_3;
    }

    public static void i(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8601895", new Object[]{view});
        } else {
            j(view, dgw.APM_VIEW_INVALID);
        }
    }

    public static void j(View view, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5d75b6e", new Object[]{view, obj});
        } else if (view != null) {
            if (eb5.E()) {
                view.setTag(e.a(), obj);
            } else {
                view.setTag(f21228a, obj);
            }
        }
    }

    public static void k(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88297130", new Object[]{view});
        } else {
            j(view, dgw.APM_VIEW_VALID);
        }
    }

    public static void l(kub kubVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eef31e3d", new Object[]{kubVar});
        } else {
            b = kubVar;
        }
    }

    public static void m(f fVar, boolean z) {
        List<f.a> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0650b92", new Object[]{fVar, new Boolean(z)});
            return;
        }
        try {
            if (!(eb5.p() || b == null || fVar == null || fVar.f7311a == null || (list = fVar.c) == null || list.size() <= 0)) {
                jb6.i(new d(fVar, z));
            }
        } catch (Throwable th) {
            xv5.b(th);
        }
    }

    public static void n(int i, String str, String str2, String str3, DXTemplateItem dXTemplateItem, Map<String, String> map, double d2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de93dd68", new Object[]{new Integer(i), str, str2, str3, dXTemplateItem, map, new Double(d2), new Boolean(z)});
        } else if (i == 0 || 2 == i) {
            try {
                jb6.i(new b(str3, dXTemplateItem, map, str2, str, d2, z));
            } catch (Throwable th) {
                xv5.b(th);
            }
        }
    }

    public static void o(int i, String str, String str2, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7c96465", new Object[]{new Integer(i), str, str2, str3, map});
        } else if (i == 0) {
            try {
                jb6.i(new c(str, str2, str3, map));
            } catch (Throwable th) {
                xv5.b(th);
            }
        }
    }

    public static void p(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2914c129", new Object[]{fVar});
        } else if (!eb5.p()) {
            q(fVar, false);
        }
    }

    public static void q(f fVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f98416cb", new Object[]{fVar, new Boolean(z)});
        } else if (!eb5.p()) {
            m(fVar, z);
            if (!eb5.k()) {
                y(fVar, z);
            }
            hjo.c().a(fVar, z);
        }
    }

    public static void r(DXRuntimeContext dXRuntimeContext, String str, String str2, int i, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d176611", new Object[]{dXRuntimeContext, str, str2, new Integer(i), str3});
            return;
        }
        try {
            if (!eb5.p()) {
                f fVar = new f(dXRuntimeContext.c());
                if (dXRuntimeContext.m() != null) {
                    fVar.b(dXRuntimeContext.m().a());
                }
                fVar.b = dXRuntimeContext.p();
                f.a aVar = new f.a(str, str2, i);
                aVar.e = str3;
                fVar.c.add(aVar);
                p(fVar);
            }
        } catch (Throwable th) {
            xv5.b(th);
        }
    }

    public static void s(String str, DXTemplateItem dXTemplateItem, String str2, String str3, int i, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6747cd0f", new Object[]{str, dXTemplateItem, str2, str3, new Integer(i), str4});
            return;
        }
        try {
            if (!eb5.p()) {
                f fVar = new f(str);
                fVar.b = dXTemplateItem;
                f.a aVar = new f.a(str2, str3, i);
                aVar.e = str4;
                fVar.c.add(aVar);
                p(fVar);
            }
        } catch (Throwable th) {
            xv5.b(th);
        }
    }

    public static void t(String str, DXTemplateItem dXTemplateItem, String str2, String str3, Map<String, String> map, int i, String str4, long j, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bad1a36", new Object[]{str, dXTemplateItem, str2, str3, map, new Integer(i), str4, new Long(j), new Boolean(z)});
        } else if (!eb5.p()) {
            JSONObject f = f(str, str2, str3, dXTemplateItem, map);
            if (f != null) {
                f.put("timeStamp", (Object) Long.valueOf(j));
                if (str4 != null) {
                    f.put("errorMsg", (Object) str4);
                }
            }
            if (!DinamicXEngine.j0()) {
                kub kubVar = b;
                String jSONString = f.toJSONString();
                kubVar.a("Page_Umbrella_Govern", h36.TAG, jSONString, i + "", str4);
            }
            String e2 = e(str, str3, dXTemplateItem, map, "errorCode:" + i + "_errorMsg:" + str4);
            if (z) {
                la6.d(h36.TAG, h36.TAG, e2);
            }
        }
    }

    public static void u(int i, String str, String str2, String str3, DXTemplateItem dXTemplateItem, Map<String, String> map, double d2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fce9261", new Object[]{new Integer(i), str, str2, str3, dXTemplateItem, map, new Double(d2), new Boolean(z)});
        } else if (!eb5.p()) {
            n(i, str, str2, str3, dXTemplateItem, map, d2, z);
            if (!eb5.k()) {
                x(i, str, str2, str3, dXTemplateItem, map, d2);
            }
            hjo.c().b(i, str, str2, str3, dXTemplateItem, d2);
        }
    }

    public static void v(int i, String str, String str2, String str3, DXTemplateItem dXTemplateItem, hyp hypVar, double d2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c6c2fcb", new Object[]{new Integer(i), str, str2, str3, dXTemplateItem, hypVar, new Double(d2), new Boolean(z)});
        } else if (!eb5.p()) {
            try {
            } catch (Throwable th) {
                xv5.b(th);
            }
            if (!eb5.p()) {
                if (i == 0 || 2 == i) {
                    jb6.i(new a(str3, dXTemplateItem, str2, str, d2, hypVar, z));
                    if (!eb5.k()) {
                        if (!eb5.p()) {
                            al6.l(i, str, str2, str3, dXTemplateItem, hypVar);
                        } else {
                            return;
                        }
                    }
                    hjo.c().b(i, str, str2, str3, dXTemplateItem, d2);
                }
            }
        }
    }

    public static void w(int i, String str, String str2, String str3, DXTemplateItem dXTemplateItem, Map<String, String> map, double d2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62f92957", new Object[]{new Integer(i), str, str2, str3, dXTemplateItem, map, new Double(d2), new Boolean(z)});
        } else if (!eb5.o()) {
            n(i, str, str2, str3, dXTemplateItem, map, d2, z);
            if (!eb5.k()) {
                x(i, str, str2, str3, dXTemplateItem, map, d2);
            }
            hjo.c().b(i, str, str2, str3, dXTemplateItem, d2);
        }
    }

    public static void x(int i, String str, String str2, String str3, DXTemplateItem dXTemplateItem, Map<String, String> map, double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdfe0529", new Object[]{new Integer(i), str, str2, str3, dXTemplateItem, map, new Double(d2)});
        } else if (!eb5.p()) {
            al6.k(i, str, str2, str3, dXTemplateItem, map, d2);
        }
    }

    public static void y(f fVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a4d8e7", new Object[]{fVar, new Boolean(z)});
        } else {
            al6.i(fVar, z);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a extends l46 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f21229a;
        public final /* synthetic */ DXTemplateItem b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;
        public final /* synthetic */ double e;
        public final /* synthetic */ hyp f;
        public final /* synthetic */ boolean g;

        public a(String str, DXTemplateItem dXTemplateItem, String str2, String str3, double d, hyp hypVar, boolean z) {
            this.f21229a = str;
            this.b = dXTemplateItem;
            this.c = str2;
            this.d = str3;
            this.e = d;
            this.f = hypVar;
            this.g = z;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/monitor/DXAppMonitor$1");
        }

        @Override // java.lang.Runnable
        public void run() {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (this.f21229a != null) {
                if (this.b == null) {
                    str = "";
                } else {
                    str = this.b.f7343a + "_:" + this.b.b;
                }
                h36.s(this.c, "[" + this.d + "]：" + this.c + "性能埋点: " + this.f21229a + ": " + (this.e / 1000000.0d) + "ms templateinfo: " + str);
                if (ic5.a() != null) {
                    HashMap hashMap = new HashMap();
                    for (Map.Entry<String, Object> entry : this.f.d().entrySet()) {
                        hashMap.put(entry.getKey(), String.valueOf(entry.getValue()));
                    }
                    for (Map.Entry<String, Long> entry2 : this.f.c().entrySet()) {
                        hashMap.put(entry2.getKey(), String.valueOf(((float) entry2.getValue().longValue()) / 1000000.0f));
                    }
                    if (ic5.g(this.b) && !DinamicXEngine.j0()) {
                        JSONObject b = ic5.b(this.d, this.c, this.f21229a, this.b, hashMap);
                        b.put("ConsumingTime", (Object) String.valueOf(this.e / 1000000.0d));
                        ic5.a().c("Page_Umbrella_Govern", h36.TAG, b.toString());
                        if (this.e > vu3.b.GEO_NOT_SUPPORT) {
                            ic5.a().b("Page_Umbrella_Govern", h36.TAG, b.toString(), this.e / 1000000.0d);
                        }
                    }
                    if (this.g) {
                        la6.f(h36.TAG, h36.TAG, ic5.c(this.d, this.f21229a, this.b, hashMap, ""));
                    }
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b extends l46 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f21230a;
        public final /* synthetic */ DXTemplateItem b;
        public final /* synthetic */ Map c;
        public final /* synthetic */ String d;
        public final /* synthetic */ String e;
        public final /* synthetic */ double f;
        public final /* synthetic */ boolean g;

        public b(String str, DXTemplateItem dXTemplateItem, Map map, String str2, String str3, double d, boolean z) {
            this.f21230a = str;
            this.b = dXTemplateItem;
            this.c = map;
            this.d = str2;
            this.e = str3;
            this.f = d;
            this.g = z;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/monitor/DXAppMonitor$2");
        }

        @Override // java.lang.Runnable
        public void run() {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (this.f21230a != null) {
                if (this.b == null) {
                    str = "";
                } else {
                    str = this.b.f7343a + "_:" + this.b.b;
                }
                if ("Detail_RenderWidget_CreateView_Once".equals(this.f21230a) || "Detail_RenderWidget_RenderView_Once".equals(this.f21230a)) {
                    Map map = this.c;
                    if (map != null && map.containsKey("ViewSimpleName")) {
                        h36.s(this.d, "[" + this.e + "]：" + this.d + "性能埋点: " + this.f21230a + ": [" + ((String) this.c.get("ViewSimpleName")) + "]:" + (this.f / 1000000.0d) + "ms templateinfo: " + str);
                    }
                } else {
                    h36.s(this.d, "[" + this.e + "]：" + this.d + "性能埋点: " + this.f21230a + ": " + (this.f / 1000000.0d) + "ms templateinfo: " + str);
                }
                if (ic5.a() != null) {
                    if (ic5.g(this.b) && !DinamicXEngine.j0()) {
                        JSONObject b = ic5.b(this.e, this.d, this.f21230a, this.b, this.c);
                        b.put("ConsumingTime", (Object) String.valueOf(this.f / 1000000.0d));
                        ic5.a().c("Page_Umbrella_Govern", h36.TAG, b.toString());
                        if (this.f > vu3.b.GEO_NOT_SUPPORT) {
                            ic5.a().b("Page_Umbrella_Govern", h36.TAG, b.toString(), this.f / 1000000.0d);
                        }
                    }
                    if (this.g) {
                        la6.f(h36.TAG, h36.TAG, ic5.c(this.e, this.f21230a, this.b, this.c, ""));
                    }
                }
            }
        }
    }
}
