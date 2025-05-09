package com.taobao.themis.kernel.utils;

import android.app.Activity;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.net.Uri;
import android.os.Bundle;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.external.embed.SinglePageStartParams;
import com.taobao.themis.external.embed.StartParams;
import com.taobao.themis.kernel.TMSContainerType;
import com.taobao.themis.kernel.adapter.IAccountAdapter;
import com.taobao.themis.kernel.adapter.INavigatorAdapter;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.container.Window;
import com.taobao.themis.kernel.metaInfo.TMSMetaInfoWrapper;
import com.taobao.themis.kernel.metaInfo.manifest.TabBar;
import com.taobao.themis.kernel.metaInfo.manifest.TabBarItem;
import com.taobao.themis.kernel.solution.TMSSolutionType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.bbs;
import tb.cbs;
import tb.ckf;
import tb.ges;
import tb.h8x;
import tb.i04;
import tb.ies;
import tb.jpu;
import tb.mm4;
import tb.nd9;
import tb.p8s;
import tb.pl4;
import tb.q9s;
import tb.qu3;
import tb.t2o;
import tb.unl;
import tb.wsq;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TMSInstanceExtKt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            t2o.a(839909970);
            int[] iArr = new int[TMSSolutionType.values().length];
            iArr[TMSSolutionType.UNIAPP.ordinal()] = 1;
            iArr[TMSSolutionType.MINIGAME.ordinal()] = 2;
            iArr[TMSSolutionType.CLUSTER_WIDGET.ordinal()] = 3;
            iArr[TMSSolutionType.WIDGET.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        t2o.a(839909969);
    }

    public static final void a(bbs bbsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("686e678b", new Object[]{bbsVar});
            return;
        }
        ckf.g(bbsVar, "<this>");
        if (ckf.b(ies.c(bbsVar.e0(), "tms_auto_reload"), "true")) {
            TMSLogger.b("TMSInstanceExt", "has auto-reloaded once, skip");
        } else {
            CommonExtKt.o(new TMSInstanceExtKt$autoReload$1(bbsVar));
        }
    }

    public static final boolean b(bbs bbsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b8e0f8ff", new Object[]{bbsVar})).booleanValue();
        }
        ckf.g(bbsVar, "<this>");
        return true;
    }

    public static final boolean d(bbs bbsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("35ed91db", new Object[]{bbsVar})).booleanValue();
        }
        ckf.g(bbsVar, "<this>");
        StartParams startParams = (StartParams) bbsVar.g(StartParams.class);
        if (startParams == null || !(startParams instanceof SinglePageStartParams)) {
            startParams = null;
        }
        SinglePageStartParams singlePageStartParams = (SinglePageStartParams) startParams;
        if (singlePageStartParams == null) {
            return false;
        }
        return ckf.b(singlePageStartParams.getBgTransparent(), Boolean.TRUE);
    }

    public static final boolean e(bbs bbsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7601ddf6", new Object[]{bbsVar})).booleanValue();
        }
        ckf.g(bbsVar, "<this>");
        return ckf.b(bbsVar.c0().getExtraData().getString("is_tms_launcher_ng"), "true");
    }

    public static final String f(bbs bbsVar) {
        String str;
        String L;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("50057ec5", new Object[]{bbsVar});
        }
        ckf.g(bbsVar, "<this>");
        IAccountAdapter iAccountAdapter = (IAccountAdapter) p8s.b(IAccountAdapter.class);
        if (iAccountAdapter == null) {
            str = null;
        } else {
            str = iAccountAdapter.getUserId(bbsVar);
        }
        if (str == null || str.length() == 0 || (L = bbsVar.L()) == null || L.length() == 0) {
            TMSLogger.b("TMSInstanceExt", "generateBizId:userId or appId is null");
            return "";
        }
        String a2 = nd9.a(ckf.p(bbsVar.L(), str));
        if (a2 != null && a2.length() != 0) {
            return a2;
        }
        TMSLogger.b("TMSInstanceExt", "generateBizId:bizId is empty");
        return "";
    }

    public static final String h(bbs bbsVar) {
        String l;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bbef632d", new Object[]{bbsVar});
        }
        ckf.g(bbsVar, "<this>");
        TMSMetaInfoWrapper P = bbsVar.P();
        if (P != null && (l = P.l()) != null) {
            return l;
        }
        String f = bbsVar.S().f("frameworkVersion");
        if (f == null) {
            return null;
        }
        return f;
    }

    public static final bbs i(Context context) {
        cbs cbsVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bbs) ipChange.ipc$dispatch("b52524bc", new Object[]{context});
        }
        ckf.g(context, "<this>");
        if (context instanceof MutableContextWrapper) {
            try {
                Context baseContext = ((MutableContextWrapper) context).getBaseContext();
                if (baseContext != null) {
                    cbsVar = (cbs) baseContext;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.taobao.themis.kernel.TMSInstanceBinder");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            if (context instanceof cbs) {
                cbsVar = (cbs) context;
            }
            cbsVar = null;
        }
        if (cbsVar == null) {
            return null;
        }
        return cbsVar.m1();
    }

    public static final String j(bbs bbsVar) {
        JSONObject e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3c1735ea", new Object[]{bbsVar});
        }
        ckf.g(bbsVar, "<this>");
        TMSMetaInfoWrapper U = bbsVar.U();
        if (U == null || (e = U.e()) == null) {
            return null;
        }
        return e.getString("nativePlugins");
    }

    public static final unl k(bbs bbsVar, String str) {
        Object obj;
        Object obj2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (unl) ipChange.ipc$dispatch("9e2f4392", new Object[]{bbsVar, str});
        }
        ckf.g(bbsVar, "<this>");
        ckf.g(str, pl4.KEY_PAGE_ID);
        mm4 N = bbsVar.N();
        Object obj3 = null;
        if (N != null) {
            List<unl> c = N.c();
            if (c == null) {
                obj = null;
            } else {
                Iterator<T> it = c.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    if (ckf.b(((unl) obj2).g(), str)) {
                        break;
                    }
                }
                obj = (unl) obj2;
            }
            if (obj == null) {
                Iterator<T> it2 = N.a().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    if (ckf.b(((unl) next).g(), str)) {
                        obj3 = next;
                        break;
                    }
                }
            } else {
                obj3 = obj;
            }
        }
        return (unl) obj3;
    }

    public static final String l(bbs bbsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("86f1806c", new Object[]{bbsVar});
        }
        ckf.g(bbsVar, "<this>");
        return bbsVar.c0().getExtraData().getString("sceneId");
    }

    public static final TabBarItem m(bbs bbsVar, String str) {
        TabBar e;
        List<TabBarItem> items;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TabBarItem) ipChange.ipc$dispatch("b243a3c7", new Object[]{bbsVar, str});
        }
        ckf.g(bbsVar, "<this>");
        ckf.g(str, pl4.KEY_PAGE_ID);
        mm4 N = bbsVar.N();
        Object obj = null;
        if (N == null || (e = N.e()) == null || (items = e.getItems()) == null) {
            return null;
        }
        Iterator<T> it = items.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (ckf.b(((TabBarItem) next).getPageId(), str)) {
                obj = next;
                break;
            }
        }
        return (TabBarItem) obj;
    }

    public static final Window n(bbs bbsVar, String str, Window window) {
        unl unlVar;
        Window window2;
        Object obj;
        Object obj2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Window) ipChange.ipc$dispatch("649c426b", new Object[]{bbsVar, str, window});
        }
        ckf.g(bbsVar, "<this>");
        mm4 N = bbsVar.N();
        Window window3 = null;
        if (N == null) {
            return null;
        }
        if (str == null) {
            unlVar = null;
        } else {
            List<unl> c = N.c();
            if (c == null) {
                unlVar = null;
            } else {
                Iterator<T> it = c.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    if (ckf.b(((unl) obj2).g(), str)) {
                        break;
                    }
                }
                unlVar = (unl) obj2;
            }
            if (unlVar == null) {
                Iterator<T> it2 = N.a().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it2.next();
                    if (ckf.b(((unl) obj).g(), str)) {
                        break;
                    }
                }
                unlVar = (unl) obj;
            }
        }
        Window.b bVar = Window.Companion;
        Window f = N.f();
        if (f == null) {
            f = new Window(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131071, null);
        }
        if (unlVar != null) {
            window3 = unlVar.m();
        }
        if (window3 == null) {
            window3 = new Window(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131071, null);
        }
        Window a2 = bVar.a(f, window3);
        if (window == null) {
            window2 = new Window(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131071, null);
        } else {
            window2 = window;
        }
        return bVar.a(a2, window2);
    }

    public static final String o(bbs bbsVar) {
        String str;
        String customUserAgent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ee8764bf", new Object[]{bbsVar});
        }
        ckf.g(bbsVar, "<this>");
        boolean r = r(bbsVar);
        ArrayList arrayList = new ArrayList();
        if (r) {
            arrayList.add("TinyApp");
        }
        if (!arrayList.isEmpty()) {
            str = "Themis/1.7.185 (" + i04.j0(arrayList, ";", null, null, 0, null, null, 62, null) + ')';
        } else {
            str = "Themis/1.7.185";
        }
        StartParams startParams = (StartParams) bbsVar.g(StartParams.class);
        if (startParams == null) {
            startParams = null;
        }
        if (startParams == null || (customUserAgent = startParams.getCustomUserAgent()) == null) {
            return str;
        }
        return str + ' ' + customUserAgent;
    }

    public static final String p(bbs bbsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c4ecb8c9", new Object[]{bbsVar});
        }
        ckf.g(bbsVar, "<this>");
        return bbsVar.c0().getExtraData().getString("sellerId");
    }

    public static final boolean q(bbs bbsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6f61a5da", new Object[]{bbsVar})).booleanValue();
        }
        ckf.g(bbsVar, "<this>");
        if (bbsVar.a0() == TMSSolutionType.MINIGAME) {
            return true;
        }
        return false;
    }

    public static final boolean r(bbs bbsVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("19441f1e", new Object[]{bbsVar})).booleanValue();
        }
        ckf.g(bbsVar, "<this>");
        TMSMetaInfoWrapper U = bbsVar.U();
        if (U == null) {
            str = null;
        } else {
            str = U.o();
        }
        return ckf.b(str, "TinyApp");
    }

    public static final boolean u(bbs bbsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7c8767f5", new Object[]{bbsVar})).booleanValue();
        }
        ckf.g(bbsVar, "<this>");
        return ckf.b(ies.c(bbsVar.e0(), "isCanal"), "true");
    }

    public static final boolean v(bbs bbsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fbac5b2d", new Object[]{bbsVar})).booleanValue();
        }
        ckf.g(bbsVar, "<this>");
        if (u(bbsVar)) {
            return false;
        }
        return true;
    }

    public static final boolean w(bbs bbsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("af9fb59d", new Object[]{bbsVar})).booleanValue();
        }
        ckf.g(bbsVar, "<this>");
        return ckf.b(bbsVar.c0().getExtraData().getString("is_tms_instance_prerender"), "true");
    }

    public static final String g(bbs bbsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b7c5de0c", new Object[]{bbsVar});
        }
        ckf.g(bbsVar, "<this>");
        TMSSolutionType a0 = bbsVar.a0();
        int i = a0 == null ? -1 : a.$EnumSwitchMapping$0[a0.ordinal()];
        if (i == 1) {
            return bbsVar.d0();
        }
        if (i == 2) {
            return ckf.p("canvas_", bbsVar.L());
        }
        if (i == 3 || i == 4) {
            return ckf.p("widget_", bbsVar.L());
        }
        return null;
    }

    public static final void c(bbs bbsVar) {
        String uri;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9047d5c9", new Object[]{bbsVar});
            return;
        }
        ckf.g(bbsVar, "<this>");
        if (q9s.O() && bbsVar.O() == TMSContainerType.GENERIC) {
            ges gesVar = ges.INSTANCE;
            String e0 = bbsVar.e0();
            ckf.f(e0, "this.url");
            String k = gesVar.k(e0);
            Uri.Builder buildUpon = ies.g(bbsVar.e0()).buildUpon();
            if (ckf.b(k, "weex")) {
                uri = buildUpon.appendQueryParameter("weex_force_tms", "true").appendQueryParameter("tms_force_weex", "true").appendQueryParameter("wh_weex", "true").appendQueryParameter(h8x.KEY_WEEX_MODE, "dom").build().toString();
            } else {
                uri = buildUpon.appendQueryParameter("tms_force_h5", "true").build().toString();
            }
            ckf.f(uri, "when (renderer) {\n      …    .toString()\n        }");
            INavigatorAdapter iNavigatorAdapter = (INavigatorAdapter) p8s.b(INavigatorAdapter.class);
            if (iNavigatorAdapter != null) {
                Activity I = bbsVar.I();
                ckf.f(I, "this.activity");
                Bundle extras = bbsVar.I().getIntent().getExtras();
                if (extras != null) {
                    extras.remove("oriUrl");
                }
                xhv xhvVar = xhv.INSTANCE;
                Boolean bool = Boolean.TRUE;
                iNavigatorAdapter.openURL(I, uri, extras, null, kotlin.collections.a.j(jpu.a("skipAllProcessor", bool), jpu.a("className", bbsVar.I().getClass().getName()), jpu.a("disableTransition", bool)));
            }
            bbsVar.I().finish();
        }
    }

    public static final boolean s(bbs bbsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1fa28b17", new Object[]{bbsVar})).booleanValue();
        }
        ckf.g(bbsVar, "<this>");
        String j = j(bbsVar);
        return j != null && wsq.O(j, qu3.MNN, false, 2, null);
    }

    public static final boolean t(bbs bbsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("84a52468", new Object[]{bbsVar})).booleanValue();
        }
        ckf.g(bbsVar, "<this>");
        String j = j(bbsVar);
        return j != null && wsq.O(j, "wasm", false, 2, null);
    }
}
