package tb;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.business.weex.multiplelist.XslMUSComponent;
import com.taobao.android.searchbaseframe.business.weex.multiplelist.XslMUSLayout;
import com.taobao.android.searchbaseframe.uikit.screentype.ScreenType;
import com.taobao.android.ultron.datamodel.imp.DMComponent;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.MUSInstanceConfig;
import com.taobao.search.sf.util.tlog.TLogTracker;
import java.util.LinkedHashMap;
import java.util.Map;
import tb.dmf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class emf extends dmf {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public com.taobao.android.weex_framework.a c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a implements lox {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.lox
        public int consumePageScroll(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("19c2faf7", new Object[]{this, new Integer(i)})).intValue();
            }
            dmf.a d = emf.this.d();
            if (d == null) {
                return 0;
            }
            return d.u(i);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b implements znd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.znd
        public void a(y5p y5pVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("105ed04b", new Object[]{this, y5pVar});
                return;
            }
            ckf.g(y5pVar, "trackEvent");
            pmf.u0(y5pVar);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class c implements npc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // tb.npc
        public void onDestroyed(MUSDKInstance mUSDKInstance) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("32f7f995", new Object[]{this, mUSDKInstance});
            }
        }

        @Override // tb.npc
        public void onJSException(com.taobao.android.weex_framework.a aVar, int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8c41b6de", new Object[]{this, aVar, new Integer(i), str});
                return;
            }
            dmf.a d = emf.this.d();
            if (d != null) {
                d.n(false, Integer.valueOf(i), str);
            }
        }

        @Override // tb.npc
        public void onPrepareSuccess(com.taobao.android.weex_framework.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("27a2635b", new Object[]{this, aVar});
            }
        }

        @Override // tb.npc
        public void onRefreshFailed(com.taobao.android.weex_framework.a aVar, int i, String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cc0861e4", new Object[]{this, aVar, new Integer(i), str, new Boolean(z)});
                return;
            }
            dmf.a d = emf.this.d();
            if (d != null) {
                d.n(false, Integer.valueOf(i), str);
            }
        }

        @Override // tb.npc
        public void onRefreshSuccess(com.taobao.android.weex_framework.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("963c382f", new Object[]{this, aVar});
            }
        }

        @Override // tb.npc
        public void onRenderFailed(com.taobao.android.weex_framework.a aVar, int i, String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cc0cbe2b", new Object[]{this, aVar, new Integer(i), str, new Boolean(z)});
                return;
            }
            p7m.a("irpError", ckf.p("mus_render_fail ", Integer.valueOf(i)));
            dmf.a d = emf.this.d();
            if (d != null) {
                d.B(false, Integer.valueOf(i), str);
            }
        }

        @Override // tb.npc
        public void onRenderSuccess(com.taobao.android.weex_framework.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2b2aeb48", new Object[]{this, aVar});
                return;
            }
            emf.this.j(true);
            ckf.d(aVar);
            View renderRoot = aVar.getRenderRoot();
            dmf.a d = emf.this.d();
            if (d != null) {
                ckf.f(renderRoot, "renderRootView");
                d.j(false, renderRoot);
            }
            JSONObject r = emf.r(emf.this);
            if (r != null) {
                pmf.x0();
                aVar.refresh(r, null);
            }
        }
    }

    static {
        t2o.a(481297223);
    }

    public emf(dmf.a aVar) {
        super(aVar);
    }

    public static /* synthetic */ Object ipc$super(emf emfVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/newresult/widget/hybird/IrpHybridMuiseContainer");
    }

    public static final /* synthetic */ JSONObject r(emf emfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("68278bc9", new Object[]{emfVar});
        }
        emfVar.getClass();
        return null;
    }

    @Override // tb.dmf
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a592f586", new Object[]{this})).booleanValue();
        }
        com.taobao.android.weex_framework.a aVar = this.c;
        if (aVar == null) {
            return false;
        }
        ckf.d(aVar);
        XslMUSLayout xslMUSLayout = (XslMUSLayout) hgw.d(aVar.getRenderRoot(), XslMUSLayout.class);
        if (xslMUSLayout == null) {
            return false;
        }
        return xslMUSLayout.isReachTop();
    }

    @Override // tb.dmf
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        com.taobao.android.weex_framework.a aVar = this.c;
        if (aVar != null && !aVar.isDestroyed()) {
            aVar.destroy();
        }
        this.c = null;
    }

    @Override // tb.dmf
    public void c(String str, String str2, Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("163350b5", new Object[]{this, str, str2, map});
        } else if (this.c != null && str != null && !TextUtils.isEmpty(str) && str2 != null && !TextUtils.isEmpty(str2)) {
            if (map == null) {
                com.taobao.android.weex_framework.a aVar = this.c;
                if (aVar != null) {
                    aVar.sendInstanceMessage(str, str2, null);
                }
            } else if (map instanceof JSONObject) {
                com.taobao.android.weex_framework.a aVar2 = this.c;
                if (aVar2 != null) {
                    aVar2.sendInstanceMessage(str, str2, (JSONObject) map);
                }
            } else {
                com.taobao.android.weex_framework.a aVar3 = this.c;
                if (aVar3 != null) {
                    aVar3.sendInstanceMessage(str, str2, new JSONObject(map));
                }
            }
        }
    }

    @Override // tb.dmf
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11d36495", new Object[]{this});
            return;
        }
        try {
            com.taobao.android.weex_framework.a aVar = this.c;
            if (aVar != null) {
                aVar.onActivityPause();
            }
            com.taobao.android.weex_framework.a aVar2 = this.c;
            if (aVar2 != null) {
                aVar2.onActivityStop();
            }
        } catch (Exception unused) {
        }
    }

    @Override // tb.dmf
    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf86c1c", new Object[]{this});
            return;
        }
        try {
            com.taobao.android.weex_framework.a aVar = this.c;
            if (aVar != null) {
                aVar.onActivityStart();
            }
            com.taobao.android.weex_framework.a aVar2 = this.c;
            if (aVar2 != null) {
                aVar2.onActivityResume();
            }
        } catch (Exception unused) {
        }
    }

    @Override // tb.dmf
    public void i(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c4537c1", new Object[]{this, num});
            return;
        }
        com.taobao.android.weex_framework.a aVar = this.c;
        if (aVar != null) {
            aVar.addInstanceEnv(k7m.KEY_SCREEN_STYLE, ScreenType.h(num == null ? -1 : num.intValue()));
            aVar.refresh(null, null);
        }
    }

    @Override // tb.dmf
    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("334ee134", new Object[]{this});
        } else if (this.c != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put((JSONObject) "scene", "loadError");
            com.taobao.android.weex_framework.a aVar = this.c;
            ckf.d(aVar);
            aVar.refresh(jSONObject, null);
        }
    }

    @Override // tb.dmf
    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15df2128", new Object[]{this});
        } else if (this.c != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put((JSONObject) "scene", "loading");
            com.taobao.android.weex_framework.a aVar = this.c;
            ckf.d(aVar);
            aVar.refresh(jSONObject, null);
        }
    }

    @Override // tb.dmf
    public void m(boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24f555b1", new Object[]{this, new Boolean(z)});
        } else if (this.c != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put((JSONObject) "scene", "RecommendTag");
            if (z) {
                str = "open";
            } else {
                str = "close";
            }
            jSONObject.put((JSONObject) "action", str);
            com.taobao.android.weex_framework.a aVar = this.c;
            ckf.d(aVar);
            aVar.refresh(jSONObject, null);
        }
    }

    @Override // tb.dmf
    public void n(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55d1b959", new Object[]{this, jSONArray});
        } else if (this.c != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put((JSONObject) "scene", "searchTag");
            if (jSONArray == null || jSONArray.isEmpty()) {
                jSONObject.put((JSONObject) "action", DMComponent.RESET);
            } else {
                jSONObject.put((JSONObject) "action", "search");
                jSONObject.put((JSONObject) "data", (String) jSONArray);
            }
            com.taobao.android.weex_framework.a aVar = this.c;
            ckf.d(aVar);
            aVar.refresh(jSONObject, null);
        }
    }

    @Override // tb.dmf
    public void o(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b98fd4e", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // tb.dmf
    public void p(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81a5e9c7", new Object[]{this, jSONObject});
        } else if (this.c != null) {
            pmf.x0();
            if (jSONObject != null) {
                jSONObject.put((JSONObject) "scene", "initialItems");
            }
            com.taobao.android.weex_framework.a aVar = this.c;
            ckf.d(aVar);
            aVar.refresh(jSONObject, null);
        }
    }

    @Override // tb.dmf
    public void q(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26ec709", new Object[]{this, jSONObject});
        }
    }

    public final void s(Activity activity, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c635da7", new Object[]{this, activity, map});
            return;
        }
        com.taobao.android.weex_framework.b f = com.taobao.android.weex_framework.b.f();
        MUSInstanceConfig mUSInstanceConfig = new MUSInstanceConfig();
        String str = map == null ? null : map.get("pageUrl");
        if (str == null) {
            str = pov.a("https://h5.m.taobao.com/tusou/image_editor/index.html", map);
        }
        mUSInstanceConfig.p(str);
        xhv xhvVar = xhv.INSTANCE;
        com.taobao.android.weex_framework.a c2 = f.c(activity, mUSInstanceConfig);
        c2.setTag(XslMUSComponent.PAGE_SCROLL_LISTENER, new a());
        c2.setTag(XslMUSComponent.PAGE_PERF_STATICS_CALLBACK, new b());
        c2.setTag(XslMUSComponent.KEY_META_SEARCH, Boolean.valueOf(lg4.s4()));
        c2.registerRenderListener(new c());
        ScreenType g = ScreenType.g(activity);
        if (g != null) {
            c2.addInstanceEnv(k7m.KEY_SCREEN_STYLE, ScreenType.h(g.c()));
        }
        if ((activity instanceof oxb) && ((oxb) activity).E1()) {
            c2.addInstanceEnv("darkMode", "true");
        }
        this.c = c2;
    }

    public final void t(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ffa0d54", new Object[]{this, str, map});
        } else if (this.c != null) {
            if (map == null) {
                map = new LinkedHashMap<>();
            }
            map.put("_wx_tpl=", str);
            String a2 = pov.a("https://market.taobao.com/search?", map);
            ckf.f(a2, "appendQueryParameter(\"ht…om/search?\", innerParams)");
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (!TextUtils.isEmpty(entry.getKey()) && !TextUtils.isEmpty(entry.getValue())) {
                    jSONObject.put((JSONObject) entry.getKey(), entry.getValue());
                }
            }
            if (lg4.F4()) {
                String uri = Uri.parse(str).buildUpon().clearQuery().build().toString();
                ckf.f(uri, "parse.buildUpon().clearQuery().build().toString()");
                byte[] b2 = swh.a().b(uri);
                if (b2 != null) {
                    com.taobao.android.weex_framework.a aVar = this.c;
                    if (aVar != null) {
                        aVar.addInstanceEnv("bundleUrl", a2);
                        aVar.getMonitorInfo().q(a2);
                        aVar.getMonitorInfo().t(str);
                        aVar.prepare(b2, null);
                        aVar.render(jSONObject, null);
                        return;
                    }
                    return;
                }
            }
            zwh.Companion.a(this.c, str, a2, jSONObject, null);
        }
    }

    @Override // tb.dmf
    public void f(Activity activity, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61325cd7", new Object[]{this, activity, map});
            return;
        }
        ckf.g(activity, "activity");
        String v2 = lg4.v2();
        TLogTracker.f("MuisePageLoad", "LoadTemplate", ckf.p("templates:", v2));
        if (v2 == null || v2.length() == 0) {
            dmf.a d = d();
            if (d != null) {
                d.B(false, -1, "模板链接为空");
                return;
            }
            return;
        }
        s(activity, map);
        t(v2, map);
    }
}
