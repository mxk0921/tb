package tb;

import android.app.Activity;
import android.net.Uri;
import android.view.View;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexErrorType;
import com.taobao.android.weex.WeexInstance;
import com.taobao.android.weex.WeexInstanceMode;
import com.taobao.android.weex.WeexRenderType;
import com.taobao.android.weex.WeexValue;
import com.taobao.android.weex.WeexValueImpl;
import com.taobao.android.weex.config.WeexInstanceConfig;
import com.taobao.android.weex.config.WeexUnicornConfig;
import com.taobao.themis.external.embed.StartParams;
import com.taobao.themis.external.embed.WidgetStartParams;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.widget.group.WeexRootView;
import com.taobao.themis.widget.group.WidgetBridgeModule;
import com.taobao.themis.widget.kernal.TMSWidgetEngine;
import java.util.HashMap;
import kotlin.Result;
import tb.mqb;
import tb.r6x;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class yes implements j6x {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Activity f32025a;
    public final String b;
    public final a c;
    public final WeexInstance d;
    public final TMSWidgetEngine e;
    public boolean f;
    public final WeexRootView g;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface a {
        void a();

        void b(String str, String str2);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b implements r6x.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public static final class a implements a {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ yes f32027a;
            public final /* synthetic */ int b;

            public a(yes yesVar, int i) {
                this.f32027a = yesVar;
                this.b = i;
            }

            @Override // tb.yes.a
            public void a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("edfb8375", new Object[]{this});
                }
            }

            @Override // tb.yes.a
            public void b(String str, String str2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("313409ce", new Object[]{this, str, str2});
                    return;
                }
                ckf.g(str, "errorCode");
                ckf.g(str2, "errorMsg");
                JSONObject jSONObject = new JSONObject();
                jSONObject.put((JSONObject) "errorCode", str);
                jSONObject.put((JSONObject) "errorMsg", str2);
                yes.c(this.f32027a).dispatchNodeEvent(this.b, "rendererror", WeexValueImpl.ofJSON(jSONObject));
                yes.c(this.f32027a).dispatchNodeEvent(this.b, "onRenderError", WeexValueImpl.ofJSON(jSONObject));
            }
        }

        public b() {
        }

        @Override // tb.r6x.a
        public void createWidgetComponent(int i, HashMap<String, String> hashMap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("900c0454", new Object[]{this, new Integer(i), hashMap});
            } else if (!yes.a(yes.this)) {
                yes yesVar = yes.this;
                yesVar.d(yesVar.f(), i, hashMap, new a(yes.this, i));
            }
        }

        @Override // tb.r6x.a
        public void destroyWidgetComponent(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1c7beafd", new Object[]{this, new Integer(i)});
            } else {
                yes.b(yes.this).I(i);
            }
        }
    }

    static {
        t2o.a(852492334);
        t2o.a(982515791);
    }

    public yes(Activity activity, String str, a aVar) {
        ckf.g(activity, "activity");
        ckf.g(str, "url");
        ckf.g(aVar, "renderListener");
        this.f32025a = activity;
        this.b = str;
        this.c = aVar;
        TMSWidgetEngine tMSWidgetEngine = new TMSWidgetEngine(activity, aVar);
        this.e = tMSWidgetEngine;
        this.g = new WeexRootView(activity);
        boolean b2 = ckf.b(ies.c(str, "wx_use_layoutng"), "true");
        qgr.a(activity.getApplicationContext());
        WeexInstanceConfig weexInstanceConfig = new WeexInstanceConfig();
        WeexUnicornConfig weexUnicornConfig = new WeexUnicornConfig();
        weexUnicornConfig.i(WeexUnicornConfig.RenderMode.texture);
        HashMap<String, String> b3 = weexUnicornConfig.b();
        ckf.f(b3, "this.engineParams");
        b3.put("wx_use_layoutng", String.valueOf(b2));
        weexInstanceConfig.s(weexUnicornConfig);
        WeexInstance a2 = com.taobao.android.weex.b.a(activity, str, WeexInstanceMode.DOM, WeexRenderType.UNICORN, null, weexInstanceConfig);
        ckf.f(a2, "createInstance(\n        … instanceConfig\n        )");
        this.d = a2;
        TMSWidgetEngine.A(tMSWidgetEngine, b2, null, ies.c(str, "jsfm"), ies.c(str, "apifm"), null, null, 50, null);
    }

    public static final /* synthetic */ boolean a(yes yesVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7ac673e1", new Object[]{yesVar})).booleanValue();
        }
        return yesVar.f;
    }

    public static final /* synthetic */ TMSWidgetEngine b(yes yesVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TMSWidgetEngine) ipChange.ipc$dispatch("fca47c52", new Object[]{yesVar});
        }
        return yesVar.e;
    }

    public static final /* synthetic */ WeexInstance c(yes yesVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexInstance) ipChange.ipc$dispatch("6cd27d26", new Object[]{yesVar});
        }
        return yesVar.d;
    }

    @Override // tb.j6x
    public void E1(WeexInstance weexInstance, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f794a71b", new Object[]{this, weexInstance, new Boolean(z)});
        }
    }

    @Override // tb.j6x
    public void H0(WeexInstance weexInstance, boolean z, WeexErrorType weexErrorType, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99cc9148", new Object[]{this, weexInstance, new Boolean(z), weexErrorType, str});
            return;
        }
        a aVar = this.c;
        if (str == null) {
            str = "";
        }
        aVar.b("TMS_ERR_MAIN_BUNDLE_FAIL", str);
    }

    @Override // tb.j6x
    public void I1(WeexInstance weexInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68c948df", new Object[]{this, weexInstance});
        } else {
            this.f = true;
        }
    }

    @Override // tb.j6x
    public void K0(WeexInstance weexInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad8178b2", new Object[]{this, weexInstance});
        }
    }

    @Override // tb.j6x
    public void K1(WeexInstance weexInstance, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a414e261", new Object[]{this, weexInstance, new Boolean(z)});
        }
    }

    @Override // tb.j6x
    public void d2(WeexInstance weexInstance, WeexErrorType weexErrorType, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a7821b2", new Object[]{this, weexInstance, weexErrorType, str});
        }
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        this.d.destroy();
        this.e.q();
    }

    @Override // tb.j6x
    public void e2(WeexInstance weexInstance, WeexErrorType weexErrorType, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52b846bb", new Object[]{this, weexInstance, weexErrorType, str});
        }
    }

    public final Activity f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("81223f9c", new Object[]{this});
        }
        return this.f32025a;
    }

    public final String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this});
        }
        return this.b;
    }

    public final View h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        return this.g;
    }

    public final WeexInstance i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexInstance) ipChange.ipc$dispatch("e85302a1", new Object[]{this});
        }
        return this.d;
    }

    public final void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64e6b90f", new Object[]{this});
            return;
        }
        this.d.onActivityPause();
        this.e.E();
    }

    public final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c4fa6e2", new Object[]{this});
            return;
        }
        this.d.onActivityResume();
        this.e.F();
    }

    public final void l(WeexValue weexValue) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21c13e4f", new Object[]{this, weexValue});
            return;
        }
        try {
            this.d.setTag("tmsWidget", Boolean.TRUE);
            this.d.setTag("tmsEmbedManager", this.e);
            this.d.registerModule("widget-event", WidgetBridgeModule.class);
            this.d.initWithURL(g());
            this.g.addView(this.d.getRootView());
            ((q6x) this.d.getExtend(q6x.class)).setGestureEventListener(this.g.getGestureListener());
            ((q6x) this.d.getExtend(q6x.class)).setWeexScrollListener(this.g.getScrollListener());
            Object extend = this.d.getExtend(r6x.class);
            ckf.f(extend, "mPIInstance.getExtend(We…nceWidgetExt::class.java)");
            ((r6x) extend).setCreateWidgetComponentListener(new b());
            this.d.render(weexValue);
            this.d.addInstanceListener(this);
            obj = Result.m1108constructorimpl(xhv.INSTANCE);
        } catch (Throwable th) {
            obj = Result.m1108constructorimpl(kotlin.b.a(th));
        }
        Throwable th2 = Result.m1111exceptionOrNullimpl(obj);
        if (th2 != null) {
            TMSLogger.c("", "", th2);
        }
    }

    @Override // tb.j6x
    public void l2(WeexInstance weexInstance, WeexErrorType weexErrorType, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55726f6d", new Object[]{this, weexInstance, weexErrorType, str});
        }
    }

    public final void m(dde ddeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18b628d8", new Object[]{this, ddeVar});
            return;
        }
        ckf.g(ddeVar, "scrollListener");
        this.g.setCustomScrollListener(ddeVar);
    }

    @Override // tb.j6x
    public void z1(WeexInstance weexInstance, boolean z, WeexErrorType weexErrorType, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bee002", new Object[]{this, weexInstance, new Boolean(z), weexErrorType, str});
        }
    }

    public final void d(Activity activity, int i, HashMap<String, String> hashMap, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ebcec36", new Object[]{this, activity, new Integer(i), hashMap, aVar});
            return;
        }
        ckf.g(activity, "activity");
        ckf.g(aVar, "renderListener");
        JSONObject jSONObject = new JSONObject();
        jSONObject.putAll(hashMap == null ? kotlin.collections.a.h() : hashMap);
        try {
            WidgetStartParams build = ((WidgetStartParams) JSON.parseObject(jSONObject.toJSONString(), WidgetStartParams.class)).build();
            z9s z9sVar = new z9s(activity, null, null, 6, null);
            Uri build2 = Uri.parse(build.getWidgetUrl()).buildUpon().appendQueryParameter("isClusterCanal", "true").build();
            JSONObject jSONObject2 = new JSONObject();
            String sceneParamValue = build.getSceneParamValue("sceneId");
            if (sceneParamValue != null) {
                jSONObject2.put((JSONObject) "sceneId", sceneParamValue);
            }
            String sceneParamValue2 = build.getSceneParamValue("sellerId");
            if (sceneParamValue2 != null) {
                jSONObject2.put((JSONObject) "sellerId", sceneParamValue2);
            }
            String uri = build2.toString();
            ckf.f(uri, "uri.toString()");
            z9sVar.b(uri, jSONObject2);
            mqb.a.b(z9sVar, null, null, 3, null);
            z9sVar.A();
            bbs i2 = z9sVar.i();
            ckf.d(i2);
            i2.v0(build.getSpmOri());
            i2.k(StartParams.class, build);
            i2.k0(new wx3(i2));
            i2.k0(new ybx(i2));
            i2.k(a.class, aVar);
            i2.k(TMSWidgetEngine.WidgetRenderInstance.class, this.e.p(activity, this.d, i, build, i2, aVar));
        } catch (Throwable th) {
            TMSLogger.d("TMSWidgetGroupInstance", th);
            aVar.b("TMS_ERR_PARAM_INVALID", "WidgetStartParams parse fail!");
        }
    }
}
