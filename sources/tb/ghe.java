package tb;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.immerse.IrpManager;
import com.etao.feimagesearch.struct.ViewWidget;
import com.taobao.android.address.themis.ThemisConfig;
import com.taobao.android.weex.WeexEventTarget;
import com.taobao.android.weex.WeexInstance;
import com.taobao.android.weex.WeexInstanceMode;
import com.taobao.android.weex.WeexRenderType;
import com.taobao.android.weex.WeexValueImpl;
import com.taobao.android.weex.b;
import com.taobao.android.weex.config.WeexInstanceConfig;
import com.taobao.android.weex.config.WeexUnicornConfig;
import com.taobao.search.sf.util.tlog.TLogTracker;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ghe extends ViewWidget<FrameLayout, IrpManager, ghe> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    public static final float o = fxh.a(534.0f);
    public volatile WeexInstance l;
    public JSONObject m;
    public View n;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(481296951);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final float a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("c65f1174", new Object[]{this})).floatValue();
            }
            return ghe.i0();
        }

        public a() {
        }
    }

    static {
        t2o.a(481296950);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ghe(Activity activity, Object obj, IrpManager irpManager, xfw xfwVar) {
        super(activity, obj, irpManager, xfwVar, false, false, 48, null);
        ckf.g(activity, "activity");
        ckf.g(irpManager, ThemisConfig.SCENE_MANAGER);
        ckf.g(xfwVar, "setter");
    }

    public static final /* synthetic */ View h0(ghe gheVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("6044b99a", new Object[]{gheVar});
        }
        return gheVar.n;
    }

    public static final /* synthetic */ float i0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a6dfd4ab", new Object[0])).floatValue();
        }
        return o;
    }

    public static /* synthetic */ Object ipc$super(ghe gheVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1794064906:
                super.M();
                return null;
            case -1065474324:
                super.O();
                return null;
            case 731174045:
                super.L();
                return null;
            case 1083424568:
                super.K();
                return null;
            case 1209752480:
                super.N();
                return null;
            case 1250151579:
                super.G();
                return null;
            case 1585798659:
                super.q((String) objArr[0], objArr[1]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/immerse/IdentifyWidget");
        }
    }

    public static final /* synthetic */ JSONObject j0(ghe gheVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a601e919", new Object[]{gheVar});
        }
        return gheVar.m;
    }

    public static final /* synthetic */ void k0(ghe gheVar, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c701d4ee", new Object[]{gheVar, view});
        } else {
            gheVar.n = view;
        }
    }

    public static final /* synthetic */ void l0(ghe gheVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5e92c23", new Object[]{gheVar, jSONObject});
        } else {
            gheVar.m = jSONObject;
        }
    }

    public static final /* synthetic */ void m0(ghe gheVar, WeexInstance weexInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd5173ce", new Object[]{gheVar, weexInstance});
        } else {
            gheVar.l = weexInstance;
        }
    }

    public static final /* synthetic */ void n0(ghe gheVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("892fda7e", new Object[]{gheVar, jSONObject});
        } else {
            gheVar.s0(jSONObject);
        }
    }

    @Override // com.etao.feimagesearch.struct.ViewWidget, tb.vz
    public void G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a83cc9b", new Object[]{this});
            return;
        }
        super.G();
        p0();
        W().c().c(gnf.EVENT_IDENTIFY_PROBLEM_UPDATE, this);
        W().c().c(gnf.EVENT_IDENTIFY_REGION_SELECTED, this);
        W().c().c(gnf.EVENT_KEYBOARD_HEIGHT_CHANGE, this);
    }

    @Override // tb.vz
    public void K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4093bf38", new Object[]{this});
            return;
        }
        super.K();
        WeexInstance weexInstance = this.l;
        if (weexInstance != null) {
            weexInstance.destroy();
        }
    }

    @Override // tb.vz
    public void L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b94d49d", new Object[]{this});
            return;
        }
        super.L();
        WeexInstance weexInstance = this.l;
        if (weexInstance != null) {
            weexInstance.onActivityPause();
        }
    }

    @Override // tb.vz
    public void M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9510bdf6", new Object[]{this});
            return;
        }
        super.M();
        WeexInstance weexInstance = this.l;
        if (weexInstance != null) {
            weexInstance.onActivityResume();
        }
    }

    @Override // tb.vz
    public void N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("481b5ba0", new Object[]{this});
            return;
        }
        super.N();
        WeexInstance weexInstance = this.l;
        if (weexInstance != null) {
            weexInstance.onActivityStart();
        }
    }

    @Override // tb.vz
    public void O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c07e26ec", new Object[]{this});
            return;
        }
        super.O();
        WeexInstance weexInstance = this.l;
        if (weexInstance != null) {
            weexInstance.onActivityStop();
        }
    }

    public final void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81ce7241", new Object[]{this, new Boolean(z)});
        }
    }

    public final void o0(String str, Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78684150", new Object[]{this, str, map});
        } else if (this.l != null && str != null && !TextUtils.isEmpty(str)) {
            if (map == null) {
                WeexInstance weexInstance = this.l;
                if (weexInstance != null) {
                    weexInstance.dispatchEvent(WeexEventTarget.WINDOW_TARGET, str, null);
                }
            } else if (map instanceof JSONObject) {
                WeexInstance weexInstance2 = this.l;
                if (weexInstance2 != null) {
                    weexInstance2.dispatchEvent(WeexEventTarget.WINDOW_TARGET, str, WeexValueImpl.ofJSONObject((JSONObject) map));
                }
            } else {
                WeexInstance weexInstance3 = this.l;
                if (weexInstance3 != null) {
                    weexInstance3.dispatchEvent(WeexEventTarget.WINDOW_TARGET, str, WeexValueImpl.ofJSONObject(new JSONObject(map)));
                }
            }
        }
    }

    @Override // com.etao.feimagesearch.struct.ViewWidget, tb.v9e
    public void q(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e855e03", new Object[]{this, str, obj});
            return;
        }
        ckf.g(str, "action");
        super.q(str, obj);
        int hashCode = str.hashCode();
        if (hashCode != -87123972) {
            if (hashCode != 1580186707) {
                if (hashCode == 2052266864 && str.equals(gnf.EVENT_KEYBOARD_HEIGHT_CHANGE) && (obj instanceof Integer)) {
                    View view = this.n;
                    if (view != null) {
                        view.setTranslationY((caa.g(caa.c()) - o) - ((Number) obj).floatValue());
                    } else {
                        ckf.y("containerView");
                        throw null;
                    }
                }
            } else if (str.equals(gnf.EVENT_IDENTIFY_REGION_SELECTED) && (obj instanceof JSONObject)) {
                o0("notifyRegionChange", (Map) obj);
            }
        } else if (str.equals(gnf.EVENT_IDENTIFY_PROBLEM_UPDATE) && (obj instanceof JSONObject)) {
            s0((JSONObject) obj);
        }
    }

    /* renamed from: q0 */
    public FrameLayout b0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("6075f6f2", new Object[]{this});
        }
        FrameLayout frameLayout = new FrameLayout(E());
        frameLayout.setVisibility(8);
        return frameLayout;
    }

    public final void p0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7facea9c", new Object[]{this});
            return;
        }
        String s2 = lg4.s2();
        TLogTracker.f("IdentifyPageLoad", "LoadTemplate", ckf.p("templates:", s2));
        if (s2 == null || s2.length() == 0) {
            TLogTracker.i("IdentifyPageLoad", "-1", "模板链接为空");
            return;
        }
        Activity E = E();
        WeexInstanceMode weexInstanceMode = WeexInstanceMode.DOM;
        WeexRenderType weexRenderType = WeexRenderType.UNICORN;
        WeexInstanceConfig weexInstanceConfig = new WeexInstanceConfig();
        WeexUnicornConfig weexUnicornConfig = new WeexUnicornConfig();
        weexUnicornConfig.k(true);
        weexInstanceConfig.s(weexUnicornConfig);
        xhv xhvVar = xhv.INSTANCE;
        t5x b = b.b(E, "https://h5.m.taobao.com/tusou/identify/index.html", weexInstanceMode, weexRenderType, null, weexInstanceConfig);
        b.c(caa.h(caa.c()), caa.g(caa.c()));
        b.addInstanceListener(new hhe(this));
        if (!wsq.O(s2, "weex/home", false, 2, null)) {
            s2 = ckf.p(tsq.E(s2, "muise/main", "weex/home", false, 4, null), "?weex_mode=dom");
        }
        b.initWithURL(s2);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) wxi.KEY_PHOTO_FROM, W().b().B().getValue());
        jSONObject.put((JSONObject) "pssource", W().b().y());
        jSONObject.put((JSONObject) "ttid", caa.n());
        jSONObject.put((JSONObject) "utd_id", caa.o(E()));
        jSONObject.put((JSONObject) "rainbow", e0.b());
        jSONObject.put((JSONObject) "triggerElder", String.valueOf(W().b().Y()));
        jSONObject.put((JSONObject) "darkMode", String.valueOf(((oxb) E()).E1()));
        b.render(WeexValueImpl.ofJSONObject(jSONObject));
        e0(new ihe(this, b.a()));
    }

    public final void s0(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81a5e9c7", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            if (this.l == null) {
                this.m = jSONObject;
                return;
            }
            FrameLayout X = X();
            if (X != null) {
                FrameLayout X2 = X();
                X.setTranslationX(-(X2 == null ? 0.0f : X2.getWidth()));
            }
            FrameLayout X3 = X();
            if (X3 != null) {
                X3.setVisibility(0);
            }
            o0("updatePageData", jSONObject);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(X(), "translationX", 0.0f);
            ofFloat.setDuration(500L);
            ofFloat.start();
            o0("updatePageData", jSONObject);
            W().c().b(gnf.EVENT_UI_CONTAINER_LOADED, Boolean.TRUE);
        }
    }
}
