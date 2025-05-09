package tb;

import android.content.Context;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.DXRenderOptions;
import com.taobao.android.dinamicx.DXResult;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.f;
import com.taobao.taobao.R;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class e48 implements bee, ssc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final WeakHashMap<Context, DinamicXEngine> f18255a = new WeakHashMap<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a implements qde {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ j1c f18256a;

        public a(j1c j1cVar) {
            this.f18256a = j1cVar;
        }

        @Override // tb.qde
        public void a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1414cfeb", new Object[]{this, view});
                return;
            }
            ckf.g(view, "view");
            this.f18256a.a(view);
        }

        @Override // tb.qde
        public void onEvent(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9589844c", new Object[]{this, str});
            }
        }

        @Override // tb.qde
        public void onFailed(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("616e008d", new Object[]{this, str});
            } else {
                this.f18256a.onError(str);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class b implements k1c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c48 f18257a;
        public final /* synthetic */ Context b;
        public final /* synthetic */ JSONObject c;
        public final /* synthetic */ qde d;

        public b(c48 c48Var, Context context, JSONObject jSONObject, qde qdeVar) {
            this.f18257a = c48Var;
            this.b = context;
            this.c = jSONObject;
            this.d = qdeVar;
        }

        @Override // tb.k1c
        public void a(DXRootView dXRootView) {
            f a2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("be61b808", new Object[]{this, dXRootView});
                return;
            }
            ckf.g(dXRootView, "dxRootView");
            DXResult<DXRootView> i1 = this.f18257a.h().i1(this.b, dXRootView, dXRootView.getDxTemplateItem(), new JSONObject(this.c), -1, new DXRenderOptions.b().q());
            String str = null;
            if ((i1 != null ? i1.f7291a : null) == null || i1.d()) {
                this.d.onFailed("render template error");
                StringBuilder sb = new StringBuilder("renderError-");
                if (!(i1 == null || (a2 = i1.a()) == null)) {
                    str = a2.toString();
                }
                sb.append(str);
                AppMonitor.Counter.commit("AbilityKit", "dxCreateViewError", sb.toString(), 1.0d);
                return;
            }
            DXRootView dXRootView2 = i1.f7291a;
            ckf.d(dXRootView2);
            dXRootView2.setTag(R.id.mega_dx_widget_id, this.d);
            qde qdeVar = this.d;
            DXRootView dXRootView3 = i1.f7291a;
            ckf.d(dXRootView3);
            qdeVar.a(dXRootView3);
        }

        @Override // tb.k1c
        public void b(String str, f fVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ebb1f406", new Object[]{this, str, fVar});
                return;
            }
            ckf.g(str, "msg");
            this.d.onFailed(str);
            StringBuilder sb = new StringBuilder("dxError-");
            sb.append(fVar != null ? fVar.toString() : null);
            AppMonitor.Counter.commit("AbilityKit", "dxCreateViewError", sb.toString(), 1.0d);
        }
    }

    static {
        t2o.a(786432171);
        t2o.a(336592938);
    }

    @Override // tb.bee, tb.ssc
    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66d8e67a", new Object[]{this, context});
            return;
        }
        try {
            DinamicXEngine remove = this.f18255a.remove(context);
            if (remove != null) {
                remove.q0();
            }
        } catch (Throwable unused) {
        }
    }

    @Override // tb.ssc
    public void b(String str, JSONObject jSONObject, Context context, j1c j1cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede79a97", new Object[]{this, str, jSONObject, context, j1cVar});
            return;
        }
        ckf.g(str, "type");
        ckf.g(context, "ctx");
        ckf.g(j1cVar, "callback");
        d(str, jSONObject, context, new a(j1cVar));
    }

    @Override // tb.ssc
    public View c(Context context, DXRootView dXRootView, JSONObject jSONObject) {
        DXResult<DXRootView> j1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("1bb01680", new Object[]{this, context, dXRootView, jSONObject});
        }
        ckf.g(context, "ctx");
        ckf.g(dXRootView, "rootView");
        ckf.g(jSONObject, "jsonObject");
        DinamicXEngine dinamicXEngine = this.f18255a.get(context);
        if (dinamicXEngine == null || (j1 = dinamicXEngine.j1(dXRootView, jSONObject)) == null || j1.d()) {
            return null;
        }
        return j1.f7291a;
    }

    @Override // tb.bee
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        WeakHashMap<Context, DinamicXEngine> weakHashMap = this.f18255a;
        if (!(weakHashMap == null || weakHashMap.isEmpty())) {
            for (DinamicXEngine dinamicXEngine : this.f18255a.values()) {
                try {
                    dinamicXEngine.q0();
                } catch (Throwable unused) {
                }
            }
            this.f18255a.clear();
        }
    }

    public final void f(JSONObject jSONObject, Context context, qde qdeVar, JSONObject jSONObject2) {
        DinamicXEngine dinamicXEngine;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4df9120", new Object[]{this, jSONObject, context, qdeVar, jSONObject2});
            return;
        }
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put((JSONObject) x96.REFRESH_TYPE, "renderFirst");
        jSONObject3.put((JSONObject) "downgradeType", "useCache");
        jSONObject3.put((JSONObject) "template", (String) jSONObject2);
        if (this.f18255a.get(context) == null) {
            if (gxv.l(context)) {
                dinamicXEngine = new DinamicXEngine(new DXEngineConfig.b("megaability").H(true, true).F());
            } else {
                dinamicXEngine = new DinamicXEngine(new DXEngineConfig("megaability"));
            }
            dinamicXEngine.W0(kb5.DX_EVENT_ABILITYEVENTHANDLER, new kb5());
            this.f18255a.put(context, dinamicXEngine);
        }
        p18 p18Var = new p18(jSONObject3);
        DinamicXEngine dinamicXEngine2 = this.f18255a.get(context);
        ckf.d(dinamicXEngine2);
        c48 c48Var = new c48(context, p18Var, "megaability", mii.NAME_SPACE_MEGA_DESIGN, dinamicXEngine2, null);
        c48Var.g(new b(c48Var, context, jSONObject, qdeVar));
    }

    public final boolean e(String str, qde qdeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eeafa805", new Object[]{this, str, qdeVar})).booleanValue();
        }
        if (str != null && str.length() != 0 && wsq.O(str, ",", false, 2, null)) {
            return true;
        }
        if (qdeVar != null) {
            qdeVar.onFailed("template info empty");
        }
        return false;
    }

    @Override // tb.bee
    public void d(String str, JSONObject jSONObject, Context context, qde qdeVar) {
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65f08756", new Object[]{this, str, jSONObject, context, qdeVar});
            return;
        }
        ckf.g(str, "type");
        ckf.g(context, "ctx");
        ckf.g(qdeVar, "callback");
        List list = null;
        if (ckf.b(str, "toast")) {
            if (e(abl.y(), qdeVar)) {
                JSONObject jSONObject2 = new JSONObject();
                String y = abl.y();
                if (y != null) {
                    list = wsq.z0(y, new String[]{","}, false, 0, 6, null);
                }
                jSONObject2.put((JSONObject) "name", "toast_ability");
                if (list == null || list.size() < 2) {
                    i2 = 1;
                } else {
                    i2 = list.get(1);
                }
                jSONObject2.put((JSONObject) "version", (String) i2);
                if (list != null && !list.isEmpty()) {
                    y = (String) list.get(0);
                }
                jSONObject2.put((JSONObject) "url", y);
                xhv xhvVar = xhv.INSTANCE;
                f(jSONObject, context, qdeVar, jSONObject2);
            }
        } else if (ckf.b(str, "loading") && e(abl.x(), qdeVar)) {
            JSONObject jSONObject3 = new JSONObject();
            String x = abl.x();
            if (x != null) {
                list = wsq.z0(x, new String[]{","}, false, 0, 6, null);
            }
            jSONObject3.put((JSONObject) "name", "loading_ability_ui");
            if (list == null || list.size() < 2) {
                i = 1;
            } else {
                i = list.get(1);
            }
            jSONObject3.put((JSONObject) "version", (String) i);
            if (list != null && !list.isEmpty()) {
                x = (String) list.get(0);
            }
            jSONObject3.put((JSONObject) "url", x);
            xhv xhvVar2 = xhv.INSTANCE;
            f(jSONObject, context, qdeVar, jSONObject3);
        }
    }
}
