package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.adapter.ICrashCatchAdapter;
import com.taobao.themis.kernel.utils.TMSInstanceExtKt;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Result;
import kotlin.b;
import tb.ngb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class ybx implements ngb {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    public static final ConcurrentHashMap<String, Object> e = new ConcurrentHashMap<>();
    public static int f;

    /* renamed from: a  reason: collision with root package name */
    public final bbs f31972a;
    public long b = -1;
    public JSONObject c = new JSONObject();
    public int d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        static {
            t2o.a(852492379);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(852492378);
        t2o.a(839909551);
    }

    public ybx(bbs bbsVar) {
        ckf.g(bbsVar, "instance");
        this.f31972a = bbsVar;
    }

    @Override // tb.t4c
    public void N(bbs bbsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dc73485", new Object[]{this, bbsVar});
            return;
        }
        ckf.g(bbsVar, "instance");
        ngb.a.a(this, bbsVar);
        this.b = System.currentTimeMillis();
        int i = f;
        f = 1 + i;
        this.d = i;
        this.c = b();
        e.put(String.valueOf(this.d), this.c);
        y();
    }

    public final JSONObject b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("1a85524e", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "appId", t().L());
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put((JSONObject) "sceneId", TMSInstanceExtKt.l(t()));
        jSONObject2.put((JSONObject) "sellerId", TMSInstanceExtKt.p(t()));
        xhv xhvVar = xhv.INSTANCE;
        jSONObject.put((JSONObject) "widgetSceneParams", (String) jSONObject2);
        return jSONObject;
    }

    @Override // tb.t4c
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("896696a2", new Object[]{this});
        } else {
            ngb.a.b(this);
        }
    }

    @Override // tb.ngb
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        ddx.INSTANCE.b(this.f31972a, this.b);
        e.remove(String.valueOf(this.d));
        y();
    }

    @Override // tb.ngb
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        this.b = System.currentTimeMillis();
        e.put(String.valueOf(this.d), this.c);
        y();
    }

    @Override // tb.ngb
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
        }
    }

    @Override // tb.ngb
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
        }
    }

    public final bbs t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bbs) ipChange.ipc$dispatch("57ded820", new Object[]{this});
        }
        return this.f31972a;
    }

    public final void y() {
        xhv xhvVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e36f0228", new Object[]{this});
            return;
        }
        try {
            ICrashCatchAdapter iCrashCatchAdapter = (ICrashCatchAdapter) p8s.b(ICrashCatchAdapter.class);
            if (iCrashCatchAdapter == null) {
                xhvVar = null;
            } else {
                String jSONString = new JSONObject(e).toJSONString();
                ckf.f(jSONString, "JSONObject(widgetCrashInfos).toJSONString()");
                iCrashCatchAdapter.addHeaderInfo("widgetCommonDatas", jSONString);
                xhvVar = xhv.INSTANCE;
            }
            Result.m1108constructorimpl(xhvVar);
        } catch (Throwable th) {
            Result.m1108constructorimpl(b.a(th));
        }
    }
}
