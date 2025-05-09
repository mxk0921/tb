package tb;

import android.app.Activity;
import android.text.TextUtils;
import com.alibaba.ability.hub.AbilityHubAdapter;
import com.alibaba.ability.impl.stdpop.StdPopAbility;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class d2m implements hdb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ABILITY_TYPE = "photoSearch";
    public static final String API_CLOSE_IRP = "closeIrp";
    public static final String API_SHOW_IRP = "showIrp";
    public static final String CIRCLE_SEARCH_PANEL_POP_ID = "circle_search_panel";
    public static final a Companion = new a(null);
    public static final String IRP_POP_ID = "photoSearch_irp";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* renamed from: tb.d2m$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public static final class C0900a implements s2d {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.s2d
            public void onCallback(ExecuteResult executeResult) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("f183ed74", new Object[]{this, executeResult});
                } else {
                    ckf.g(executeResult, "result");
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public static final class b implements s2d {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.s2d
            public void onCallback(ExecuteResult executeResult) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("f183ed74", new Object[]{this, executeResult});
                } else {
                    ckf.g(executeResult, "result");
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public static final class c implements s2d {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.s2d
            public void onCallback(ExecuteResult executeResult) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("f183ed74", new Object[]{this, executeResult});
                } else {
                    ckf.g(executeResult, "result");
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public static final class d implements s2d {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.s2d
            public void onCallback(ExecuteResult executeResult) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("f183ed74", new Object[]{this, executeResult});
                } else {
                    ckf.g(executeResult, "result");
                }
            }
        }

        static {
            t2o.a(481297313);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        @JvmStatic
        public final void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("72a77bc4", new Object[]{this});
                return;
            }
            kdb xqVar = new xq(new zq("photoSearch", "photoSearch"));
            ldb a2 = xqVar.a();
            AbilityHubAdapter adapter = a2 == null ? null : a2.getAdapter();
            if (adapter != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put((JSONObject) "popId", d2m.CIRCLE_SEARCH_PANEL_POP_ID);
                adapter.z("photoSearch", d2m.API_CLOSE_IRP, xqVar, jSONObject, new C0900a());
            }
        }

        @JvmStatic
        public final void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("caf25e1f", new Object[]{this});
                return;
            }
            kdb xqVar = new xq(new zq("photoSearch", "photoSearch"));
            ldb a2 = xqVar.a();
            AbilityHubAdapter adapter = a2 == null ? null : a2.getAdapter();
            if (adapter != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put((JSONObject) "popId", d2m.IRP_POP_ID);
                adapter.z("photoSearch", d2m.API_CLOSE_IRP, xqVar, jSONObject, new b());
            }
        }

        @JvmStatic
        public final void c(Activity activity, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c8fa031", new Object[]{this, activity, jSONObject});
                return;
            }
            ckf.g(activity, "context");
            ckf.g(jSONObject, "params");
            zq zqVar = new zq("photoSearch", "photoSearch");
            zqVar.a(activity);
            AbilityHubAdapter abilityHubAdapter = new AbilityHubAdapter(zqVar);
            zqVar.c(abilityHubAdapter);
            abilityHubAdapter.z("photoSearch", d2m.API_SHOW_IRP, new xq(zqVar), jSONObject, new c());
        }

        @JvmStatic
        public final void d(Activity activity, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4a8f156c", new Object[]{this, activity, jSONObject});
                return;
            }
            ckf.g(activity, "context");
            ckf.g(jSONObject, "params");
            jSONObject.put((JSONObject) "pageType", d2m.CIRCLE_SEARCH_PANEL_POP_ID);
            zq zqVar = new zq("photoSearch", "photoSearch");
            zqVar.a(activity);
            AbilityHubAdapter abilityHubAdapter = new AbilityHubAdapter(zqVar);
            zqVar.c(abilityHubAdapter);
            abilityHubAdapter.z("photoSearch", d2m.API_SHOW_IRP, new xq(zqVar), jSONObject, new d());
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b implements s2d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ vq f17523a;

        public b(vq vqVar) {
            this.f17523a = vqVar;
        }

        @Override // tb.s2d
        public void onCallback(ExecuteResult executeResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f183ed74", new Object[]{this, executeResult});
                return;
            }
            ckf.g(executeResult, "result");
            this.f17523a.a(executeResult);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class c implements s2d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ vq f17524a;

        public c(vq vqVar) {
            this.f17524a = vqVar;
        }

        @Override // tb.s2d
        public void onCallback(ExecuteResult executeResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f183ed74", new Object[]{this, executeResult});
                return;
            }
            ckf.g(executeResult, "result");
            this.f17524a.a(executeResult);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class d implements s2d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ vq f17525a;

        public d(vq vqVar) {
            this.f17525a = vqVar;
        }

        @Override // tb.s2d
        public void onCallback(ExecuteResult executeResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f183ed74", new Object[]{this, executeResult});
                return;
            }
            ckf.g(executeResult, "result");
            this.f17525a.a(executeResult);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class e implements s2d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ vq f17526a;

        public e(vq vqVar) {
            this.f17526a = vqVar;
        }

        @Override // tb.s2d
        public void onCallback(ExecuteResult executeResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f183ed74", new Object[]{this, executeResult});
                return;
            }
            ckf.g(executeResult, "result");
            this.f17526a.a(executeResult);
        }
    }

    static {
        t2o.a(481297312);
        t2o.a(144703491);
    }

    public final ExecuteResult a(kdb kdbVar, Map<String, ? extends Object> map, vq vqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("5cfeef6", new Object[]{this, kdbVar, map, vqVar});
        }
        ldb a2 = kdbVar.a();
        AbilityHubAdapter adapter = a2 == null ? null : a2.getAdapter();
        if (adapter == null) {
            return new ErrorResult("EnvError", "hubAdapter is Null", (Map) null, 4, (a07) null);
        }
        return adapter.z("stdPop", "close", kdbVar, map, new b(vqVar));
    }

    public final ExecuteResult b(kdb kdbVar, Map<String, ? extends Object> map, vq vqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("23932fb", new Object[]{this, kdbVar, map, vqVar});
        }
        ldb a2 = kdbVar.a();
        AbilityHubAdapter adapter = a2 == null ? null : a2.getAdapter();
        if (adapter == null) {
            return new ErrorResult("EnvError", "hubAdapter is Null", (Map) null, 4, (a07) null);
        }
        return adapter.z("stdPop", "close", kdbVar, map, new c(vqVar));
    }

    @Override // tb.hdb
    public ExecuteResult execute(String str, kdb kdbVar, Map<String, ? extends Object> map, vq vqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("b2cd7d0b", new Object[]{this, str, kdbVar, map, vqVar});
        }
        ckf.g(str, "api");
        ckf.g(kdbVar, "context");
        ckf.g(map, "params");
        ckf.g(vqVar, "callback");
        if (TextUtils.isEmpty(str)) {
            return ErrorResult.a.Companion.a("api empty");
        }
        Object obj = map.get("pageType");
        if (ckf.b(API_SHOW_IRP, str)) {
            if (!(obj instanceof String) || !ckf.b(obj, CIRCLE_SEARCH_PANEL_POP_ID)) {
                return d(kdbVar, map, vqVar);
            }
            return c(kdbVar, map, vqVar);
        } else if (!ckf.b(API_CLOSE_IRP, str)) {
            return ErrorResult.a.Companion.a("function invalid");
        } else {
            if (!(obj instanceof String) || !ckf.b(obj, CIRCLE_SEARCH_PANEL_POP_ID)) {
                return b(kdbVar, map, vqVar);
            }
            return a(kdbVar, map, vqVar);
        }
    }

    public final ExecuteResult c(kdb kdbVar, Map<String, ? extends Object> map, vq vqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("cd7f3d7b", new Object[]{this, kdbVar, map, vqVar});
        }
        ldb a2 = kdbVar.a();
        AbilityHubAdapter adapter = a2 == null ? null : a2.getAdapter();
        if (adapter == null) {
            return new ErrorResult("EnvError", "hubAdapter is Null", (Map) null, 4, (a07) null);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "popId", CIRCLE_SEARCH_PANEL_POP_ID);
        jSONObject.put((JSONObject) "bizId", "tbsearch");
        jSONObject.put((JSONObject) "url", "taobao://h5.m.taobao.com/tusou/circle_search/index.html");
        JSONObject jSONObject2 = new JSONObject();
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            jSONObject2.put((JSONObject) entry.getKey(), (String) entry.getValue());
        }
        jSONObject2.put((JSONObject) "showPopup", "true");
        jSONObject.put((JSONObject) "queryParams", (String) jSONObject2);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put((JSONObject) "maxHeight", (String) 1);
        jSONObject3.put((JSONObject) "originHeight", (String) 1);
        jSONObject3.put((JSONObject) "animation", "fadeInOut");
        jSONObject3.put((JSONObject) "attachMode", "activity");
        jSONObject3.put((JSONObject) "backgroundStyle", "#00000000");
        jSONObject3.put((JSONObject) "backgroundMode", "color");
        jSONObject3.put((JSONObject) hij.KEY_CORNER_RADIUS, (String) 0);
        jSONObject.put((JSONObject) h9.KEY_POP_CONFIG, (String) jSONObject3);
        return adapter.z("stdPop", StdPopAbility.API_NATIVE, kdbVar, jSONObject, new d(vqVar));
    }

    public final ExecuteResult d(kdb kdbVar, Map<String, ? extends Object> map, vq vqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("32bc1e40", new Object[]{this, kdbVar, map, vqVar});
        }
        ldb a2 = kdbVar.a();
        AbilityHubAdapter adapter = a2 == null ? null : a2.getAdapter();
        if (adapter == null) {
            return new ErrorResult("EnvError", "hubAdapter is Null", (Map) null, 4, (a07) null);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "popId", IRP_POP_ID);
        jSONObject.put((JSONObject) "bizId", "tbsearch");
        jSONObject.put((JSONObject) "url", h1p.PAILITAO_EDITOR_URL);
        JSONObject jSONObject2 = new JSONObject();
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            jSONObject2.put((JSONObject) entry.getKey(), (String) entry.getValue());
        }
        jSONObject2.put((JSONObject) "showPopup", "true");
        jSONObject.put((JSONObject) "queryParams", (String) jSONObject2);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put((JSONObject) "maxHeight", (String) 1);
        jSONObject3.put((JSONObject) "originHeight", (String) 1);
        jSONObject3.put((JSONObject) "animation", "fadeInOut");
        jSONObject3.put((JSONObject) "attachMode", "activity");
        jSONObject3.put((JSONObject) "backgroundStyle", "#00000000");
        jSONObject3.put((JSONObject) "backgroundMode", "color");
        jSONObject3.put((JSONObject) hij.KEY_CORNER_RADIUS, (String) 0);
        jSONObject.put((JSONObject) h9.KEY_POP_CONFIG, (String) jSONObject3);
        return adapter.z("stdPop", StdPopAbility.API_NATIVE, kdbVar, jSONObject, new e(vqVar));
    }
}
