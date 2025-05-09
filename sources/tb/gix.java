package tb;

import android.content.Context;
import android.taobao.windvane.jsbridge.IJsApiFailedCallBack;
import android.taobao.windvane.jsbridge.WVJsBridge;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.business.publishinsert.helper.PublishInsertHelper;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class gix {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements IJsApiFailedCallBack {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f20033a;
        public final /* synthetic */ esw b;
        public final /* synthetic */ String c;

        public a(c cVar, esw eswVar, String str) {
            this.f20033a = cVar;
            this.b = eswVar;
            this.c = str;
        }

        @Override // android.taobao.windvane.jsbridge.IJsApiFailedCallBack
        public void fail(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("534fc72f", new Object[]{this, str});
            } else {
                gix.a(str, this.f20033a, this.b, this.c);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b implements r4c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f20034a;
        public final /* synthetic */ esw b;
        public final /* synthetic */ String c;

        public b(c cVar, esw eswVar, String str) {
            this.f20034a = cVar;
            this.b = eswVar;
            this.c = str;
        }

        @Override // tb.r4c
        public void b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("310f3b65", new Object[]{this, str});
            } else {
                gix.b(str, this.f20034a, true, this.b, this.c);
            }
        }

        @Override // android.taobao.windvane.jsbridge.IJsApiSucceedCallBack
        public void succeed(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e5b77b53", new Object[]{this, str});
            } else {
                gix.b(str, this.f20034a, false, this.b, this.c);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface c {
    }

    static {
        t2o.a(468713764);
    }

    public static /* synthetic */ void a(String str, c cVar, esw eswVar, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1686d302", new Object[]{str, cVar, eswVar, str2});
        } else {
            d(str, cVar, eswVar, str2);
        }
    }

    public static /* synthetic */ void b(String str, c cVar, boolean z, esw eswVar, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d8b72b3", new Object[]{str, cVar, new Boolean(z), eswVar, str2});
        } else {
            e(str, cVar, z, eswVar, str2);
        }
    }

    public static void c(Context context, String str, String str2, JSONObject jSONObject, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bda86eeb", new Object[]{context, str, str2, jSONObject, cVar});
            return;
        }
        spw spwVar = new spw();
        spwVar.d = str;
        spwVar.e = str2;
        esw eswVar = new esw(context, null);
        a aVar = new a(cVar, eswVar, str);
        b bVar = new b(cVar, eswVar, str);
        if (jSONObject != null) {
            try {
                spwVar.f = jSONObject.toJSONString();
            } catch (Throwable th) {
                d(th.getMessage(), cVar, eswVar, str);
                return;
            }
        }
        WVJsBridge.g().f(eswVar, spwVar, aVar, bVar);
    }

    public static void d(String str, c cVar, esw eswVar, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d4fc72f", new Object[]{str, cVar, eswVar, str2});
            return;
        }
        if (cVar != null) {
            ((PublishInsertHelper.a) cVar).a(str);
        }
        Object b2 = eswVar.b(str2);
        if (b2 instanceof kpw) {
            ((kpw) b2).onDestroy();
        }
    }

    public static void e(String str, c cVar, boolean z, esw eswVar, String str2) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3717c20", new Object[]{str, cVar, new Boolean(z), eswVar, str2});
            return;
        }
        try {
            obj = JSON.parseObject(str);
        } catch (Exception e) {
            ir9.b("WindvaneUtil", e.getMessage());
            obj = str;
        }
        if (cVar != null) {
            ((PublishInsertHelper.a) cVar).b(obj);
        }
        if (!z) {
            Object b2 = eswVar.b(str2);
            if (b2 instanceof kpw) {
                ((kpw) b2).onDestroy();
            }
        }
    }
}
