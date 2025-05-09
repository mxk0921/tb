package tb;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alibaba.ability.MegaUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.framework.statisticsv2.model.StEvent;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.api.FailedBinderCallBack;
import com.taobao.android.abilitykit.ability.pop.presenter.AKBasePopPresenter;
import com.taobao.android.abilitykit.ability.pop.presenter.AKPopWindowPresenter;
import com.taobao.android.abilitykit.ability.pop.render.IAKPopRender;
import com.taobao.android.nav.Nav;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.HashMap;
import java.util.Map;
import tb.hab;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ye2 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_ARG1 = "arg1";
    public static final String KEY_ARG2 = "arg2";
    public static final String KEY_ARG3 = "arg3";
    public static final String KEY_ARGS = "args";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ n8 f32011a;
        public final /* synthetic */ String b;

        public a(n8 n8Var, String str) {
            this.f32011a = n8Var;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("inputJson", (Object) this.f32011a.d().toJSONString());
            jSONObject.put("mode", (Object) this.b);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("arg1", (Object) "WindowAttachMode");
            jSONObject2.put("args", (Object) jSONObject);
            ye2.f(2201, "Page_StdSemiPop", jSONObject2);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f32012a;
        public final /* synthetic */ h9 b;
        public final /* synthetic */ long c;

        public b(String str, h9 h9Var, long j) {
            this.f32012a = str;
            this.b = h9Var;
            this.c = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("args", (Object) jSONObject);
            jSONObject.put("fromPageName", (Object) this.f32012a);
            jSONObject.put("bizId", (Object) this.b.f);
            jSONObject.put("popId", (Object) this.b.d);
            jSONObject.put("url", (Object) this.b.a());
            jSONObject.put(FailedBinderCallBack.CALLER_ID, (Object) (this.b.d + "_" + this.c));
            jSONObject2.put("arg1", (Object) "StdSemiPop_CallStdPop");
            ye2.f(2201, "Page_StdSemiPop", jSONObject2);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class c implements hab.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ u8 f32013a;
        public final /* synthetic */ h9 b;
        public final /* synthetic */ long c;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("args", (Object) jSONObject);
                jSONObject.put(FailedBinderCallBack.CALLER_ID, (Object) (c.this.b.d + "_" + c.this.c));
                jSONObject.put(StEvent.SHOW_TIME, (Object) Long.valueOf(SystemClock.elapsedRealtime() - c.this.c));
                jSONObject2.put("arg1", (Object) "StdSemiPop_ShowStdPop");
                ye2.f(2201, "Page_StdSemiPop", jSONObject2);
            }
        }

        public c(u8 u8Var, h9 h9Var, long j) {
            this.f32013a = u8Var;
            this.b = h9Var;
            this.c = j;
        }

        @Override // tb.hab.a
        public void a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e9f05795", new Object[]{this, jSONObject});
                return;
            }
            u8 u8Var = this.f32013a;
            if (u8Var != null) {
                u8Var.callback("onBlockBackDismissed", new f8(jSONObject));
            }
        }

        @Override // tb.hab.a
        public void b(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("30c32fff", new Object[]{this, jSONObject});
                return;
            }
            u8 u8Var = this.f32013a;
            if (u8Var != null) {
                u8Var.callback("onClose", new f8(jSONObject));
            }
            MegaUtils.C(new a());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class d implements qlq {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ hab f32015a;
        public final /* synthetic */ h9 b;
        public final /* synthetic */ n9 c;
        public final /* synthetic */ u8 d;

        public d(hab habVar, h9 h9Var, n9 n9Var, u8 u8Var) {
            this.f32015a = habVar;
            this.b = h9Var;
            this.c = n9Var;
            this.d = u8Var;
        }

        @Override // tb.qlq
        public void a(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("64c41f64", new Object[]{this, activity});
                return;
            }
            this.c.i(activity);
            if (this.f32015a.d(this.c, this.b, null, 0)) {
                ye2.a(this.b, this.d);
            }
        }

        @Override // tb.qlq
        public hab<PARAMS, CONTEXT> b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (hab) ipChange.ipc$dispatch("e756bb35", new Object[]{this});
            }
            return this.f32015a;
        }

        @Override // tb.qlq
        public h9 c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (h9) ipChange.ipc$dispatch("813516e5", new Object[]{this});
            }
            return this.b;
        }
    }

    static {
        t2o.a(786432139);
    }

    public static /* synthetic */ void a(h9 h9Var, u8 u8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb558205", new Object[]{h9Var, u8Var});
        } else {
            b(h9Var, u8Var);
        }
    }

    public static void b(h9 h9Var, u8 u8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7d37d33", new Object[]{h9Var, u8Var});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("popId", (Object) h9Var.d);
        if (u8Var != null) {
            u8Var.callback("onPopAppear", new d8(jSONObject));
        }
    }

    public static JSONObject c(String str, int i, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("cfb051ca", new Object[]{str, new Integer(i), str2});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", (Object) str);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("code", (Object) Integer.valueOf(i));
        jSONObject2.put("domain", (Object) "ability-kit");
        jSONObject2.put("description", (Object) str2);
        jSONObject.put("data", (Object) jSONObject2);
        return jSONObject;
    }

    public static JSONObject d(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("51b83078", new Object[]{str, obj});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", (Object) str);
        jSONObject.put("data", obj);
        return jSONObject;
    }

    public static Intent e(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("a4e03e67", new Object[]{context, str});
        }
        Intent intentForUri = Nav.from(context).intentForUri(Uri.parse(str));
        if (intentForUri != null) {
            intentForUri.putExtra(Nav.NAV_TO_URL_START_UPTIME, SystemClock.uptimeMillis());
            intentForUri.putExtra("NAV_TO_URL_START_TIME", System.currentTimeMillis());
        }
        return intentForUri;
    }

    public static <PARAMS extends h9, CONTEXT extends n9> c8 g(PARAMS params, IAKPopRender<PARAMS, CONTEXT> iAKPopRender, n8 n8Var, CONTEXT context, u8 u8Var) {
        AKBasePopPresenter aKBasePopPresenter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c8) ipChange.ipc$dispatch("78823709", new Object[]{params, iAKPopRender, n8Var, context, u8Var});
        }
        String u = params.f20479a.u();
        if ("view".equals(u) || "activity".equals(u)) {
            aKBasePopPresenter = new k9();
        } else {
            if (u != null) {
                MegaUtils.C(new a(n8Var, u));
            }
            if (abl.s()) {
                aKBasePopPresenter = new k9();
            } else {
                aKBasePopPresenter = new AKPopWindowPresenter();
            }
        }
        aKBasePopPresenter.v(iAKPopRender);
        return h(aKBasePopPresenter, params, n8Var, context, u8Var);
    }

    public static <PARAMS extends h9, CONTEXT extends n9> c8 h(hab<PARAMS, CONTEXT> habVar, PARAMS params, n8 n8Var, CONTEXT context, u8 u8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c8) ipChange.ipc$dispatch("ac0838a7", new Object[]{habVar, params, n8Var, context, u8Var});
        }
        Context d2 = context.d();
        if (d2 == null) {
            a8 a8Var = new a8(90001, "AppCtxNull");
            z71.e(n8Var, a8Var);
            return new b8(a8Var, true);
        }
        params.c(d2);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        String currentPageName = c2v.getInstance().getCurrentPageName();
        if (TextUtils.isEmpty(currentPageName)) {
            currentPageName = d2.getClass().getName();
        }
        MegaUtils.C(new b(currentPageName, params, elapsedRealtime));
        habVar.b(new c(u8Var, params, elapsedRealtime));
        if (params.d()) {
            za0.c(context, new d(habVar, params, context, u8Var), params.k);
        } else if (habVar.d(context, params, null, 0)) {
            b(params, u8Var);
        }
        return new d8();
    }

    public static c8 f(int i, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c8) ipChange.ipc$dispatch("bccd0852", new Object[]{new Integer(i), str, jSONObject});
        }
        if (TextUtils.isEmpty(str)) {
            return new b8(new a8(10004, "ut异常error send pageName 不为空"), false);
        }
        String string = jSONObject.getString("arg1");
        String string2 = jSONObject.getString("arg2");
        String string3 = jSONObject.getString("arg3");
        String str2 = TextUtils.isEmpty(string2) ? "" : string2;
        String str3 = TextUtils.isEmpty(string3) ? "" : string3;
        JSONObject jSONObject2 = jSONObject.getJSONObject("args");
        HashMap hashMap = new HashMap();
        if (jSONObject2 != null) {
            for (Map.Entry<String, Object> entry : jSONObject2.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (!TextUtils.isEmpty(key) && value != null) {
                    hashMap.put(key, String.valueOf(value));
                }
            }
        }
        try {
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(str, i, string, str2, str3, hashMap).build());
            return new f8();
        } catch (Throwable unused) {
            return new b8(new a8(10004, "ut异常error send"), false);
        }
    }
}
