package com.taobao.android.weex_ability.page;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_ability.page.a;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.module.MUSModule;
import com.taobao.android.weex_framework.ui.MUSMethod;
import com.taobao.uikit.actionbar.ITBPublicMenu;
import com.taobao.uikit.actionbar.TBPublicMenu;
import java.util.Map;
import tb.dwh;
import tb.e5x;
import tb.lq0;
import tb.pvh;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class AliMSNavigationBarModule extends MUSModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String KEY_INDEX = "index";
    private static final String KEY_TRANSPARENT = "transparent";
    public static final String NAME = "navigationBar";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements a.AbstractC0517a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ pvh f9945a;

        public a(AliMSNavigationBarModule aliMSNavigationBarModule, pvh pvhVar) {
            this.f9945a = pvhVar;
        }

        @Override // com.taobao.android.weex_ability.page.a.AbstractC0517a
        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("95f94e13", new Object[]{this, new Integer(i)});
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("index", (Object) Integer.valueOf(i));
            this.f9945a.a(jSONObject);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements ITBPublicMenu {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(AliMSNavigationBarModule aliMSNavigationBarModule) {
        }

        @Override // com.taobao.uikit.actionbar.ITBPublicMenu
        public TBPublicMenu getPublicMenu() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TBPublicMenu) ipChange.ipc$dispatch("1f3d234e", new Object[]{this});
            }
            return null;
        }

        @Override // com.taobao.uikit.actionbar.ITBPublicMenu
        public Bundle pageUserInfo() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Bundle) ipChange.ipc$dispatch("65615653", new Object[]{this});
            }
            return null;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements a.AbstractC0517a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ e f9946a;

        public c(AliMSNavigationBarModule aliMSNavigationBarModule, e eVar) {
            this.f9946a = eVar;
        }

        @Override // com.taobao.android.weex_ability.page.a.AbstractC0517a
        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("95f94e13", new Object[]{this, new Integer(i)});
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("index", (Object) Integer.valueOf(i));
            this.f9946a.b.a(jSONObject);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class d implements a.AbstractC0517a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ e f9947a;

        public d(AliMSNavigationBarModule aliMSNavigationBarModule, e eVar) {
            this.f9947a = eVar;
        }

        @Override // com.taobao.android.weex_ability.page.a.AbstractC0517a
        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("95f94e13", new Object[]{this, new Integer(i)});
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("index", (Object) Integer.valueOf(i));
            this.f9947a.b.a(jSONObject);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public final JSONObject f9948a;
        public final pvh b;
        public final pvh c;

        static {
            t2o.a(980418652);
        }

        public e(JSONObject jSONObject, pvh pvhVar, pvh pvhVar2) {
            this.f9948a = jSONObject;
            this.b = pvhVar;
            this.c = pvhVar2;
        }
    }

    static {
        t2o.a(980418647);
    }

    public AliMSNavigationBarModule(String str, MUSDKInstance mUSDKInstance) {
        super(str, mUSDKInstance);
    }

    private static void addSystemUiFlag(Window window, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("633d3bb3", new Object[]{window, new Integer(i)});
            return;
        }
        View decorView = window.getDecorView();
        if (decorView != null) {
            decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
        }
    }

    private static JSONObject getResultData(lq0 lq0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("34b27cfd", new Object[]{lq0Var});
        }
        JSONObject jSONObject = new JSONObject();
        if (lq0Var == null) {
            return jSONObject;
        }
        jSONObject.put("message", (Object) lq0Var.b());
        jSONObject.put("result", (Object) lq0Var.c());
        if (lq0Var.a() != null) {
            for (Map.Entry<String, Object> entry : lq0Var.a().entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
        }
        return jSONObject;
    }

    public static /* synthetic */ Object ipc$super(AliMSNavigationBarModule aliMSNavigationBarModule, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_ability/page/AliMSNavigationBarModule");
    }

    private static void removeSystemUiFlag(Window window, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("634ab956", new Object[]{window, new Integer(i)});
            return;
        }
        View decorView = window.getDecorView();
        if (decorView != null) {
            int systemUiVisibility = decorView.getSystemUiVisibility();
            if ((systemUiVisibility & i) > 0) {
                decorView.setSystemUiVisibility(i ^ systemUiVisibility);
            }
        }
    }

    private void setMenuItem(e eVar, boolean z) {
        lq0 lq0Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c8e01cf", new Object[]{this, eVar, new Boolean(z)});
            return;
        }
        com.taobao.android.weex_ability.page.a adapter = getAdapter(getInstance(), eVar.c);
        if (adapter != null) {
            if (z) {
                lq0Var = adapter.g(getInstance(), eVar.f9948a, new c(this, eVar));
            } else {
                lq0Var = adapter.i(getInstance(), eVar.f9948a, new d(this, eVar));
            }
            JSONObject resultData = getResultData(lq0Var);
            if (lq0Var == null) {
                eVar.b.a(resultData);
            } else {
                eVar.c.b(resultData);
            }
        }
    }

    private int toDp(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("646347ab", new Object[]{this, str})).intValue();
        }
        try {
            return (int) ((Integer.parseInt(str) / getInstance().getUIContext().getResources().getDisplayMetrics().density) + 0.5f);
        } catch (Exception unused) {
            return 0;
        }
    }

    @MUSMethod(uiThread = true)
    public void appendMenu(JSONObject jSONObject, pvh pvhVar, pvh pvhVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("699d7962", new Object[]{this, jSONObject, pvhVar, pvhVar2});
            return;
        }
        com.taobao.android.weex_ability.page.a adapter = getAdapter(getInstance(), pvhVar2);
        if (adapter != null) {
            lq0 h = adapter.h(getInstance(), jSONObject, new a(this, pvhVar));
            JSONObject resultData = getResultData(h);
            if (h == null) {
                pvhVar.a(resultData);
            } else {
                pvhVar2.b(resultData);
            }
        }
    }

    @MUSMethod(uiThread = false)
    public int getHeight() {
        lq0 a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4703e217", new Object[]{this})).intValue();
        }
        com.taobao.android.weex_ability.page.a adapter = getAdapter(getInstance(), null);
        if (adapter == null || (a2 = adapter.a(getInstance())) == null) {
            return 0;
        }
        return toDp(a2.c());
    }

    @MUSMethod(uiThread = false)
    public boolean getIsStatusBarFullScreen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c1fffcc7", new Object[]{this})).booleanValue();
        }
        if (getInstance() == null || getInstance().getContext() == null || !(getInstance().getContext().a() instanceof Activity)) {
            return false;
        }
        Activity activity = (Activity) getInstance().getContext().a();
        if (activity.getWindow() == null || activity.getWindow().getDecorView() == null || activity.getWindow().getDecorView().getSystemUiVisibility() != 1024) {
            return false;
        }
        return true;
    }

    @MUSMethod(uiThread = false)
    public int getStatusBarHeight(pvh pvhVar) {
        lq0 b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c5c17b35", new Object[]{this, pvhVar})).intValue();
        }
        com.taobao.android.weex_ability.page.a adapter = getAdapter(getInstance(), null);
        if (adapter == null || (b2 = adapter.b(getInstance())) == null) {
            return 0;
        }
        return toDp(b2.c());
    }

    @MUSMethod(uiThread = true)
    public void hide(JSONObject jSONObject, pvh pvhVar, pvh pvhVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0daced9", new Object[]{this, jSONObject, pvhVar, pvhVar2});
            return;
        }
        com.taobao.android.weex_ability.page.a adapter = getAdapter(getInstance(), pvhVar2);
        if (adapter != null) {
            lq0 d2 = adapter.d(getInstance(), jSONObject);
            if (d2 != null) {
                pvhVar = pvhVar2;
            }
            if (pvhVar != null) {
                pvhVar.b(getResultData(d2));
            }
        }
    }

    @MUSMethod(uiThread = true)
    public void setBadgeStyle(JSONObject jSONObject, pvh pvhVar, pvh pvhVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4e9940b", new Object[]{this, jSONObject, pvhVar, pvhVar2});
            return;
        }
        com.taobao.android.weex_ability.page.a adapter = getAdapter(getInstance(), pvhVar2);
        if (adapter != null) {
            lq0 f = adapter.f(getInstance(), jSONObject);
            if (f != null) {
                pvhVar = pvhVar2;
            }
            pvhVar.b(getResultData(f));
        }
    }

    @MUSMethod(uiThread = true)
    public void setLeftItem(JSONObject jSONObject, pvh pvhVar, pvh pvhVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5383cd1f", new Object[]{this, jSONObject, pvhVar, pvhVar2});
        } else {
            setMenuItem(new e(jSONObject, pvhVar, pvhVar2), true);
        }
    }

    @MUSMethod(uiThread = true)
    public void setRightItem(JSONObject jSONObject, pvh pvhVar, pvh pvhVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b517166e", new Object[]{this, jSONObject, pvhVar, pvhVar2});
        } else {
            setMenuItem(new e(jSONObject, pvhVar, pvhVar2), false);
        }
    }

    @MUSMethod(uiThread = true)
    public void setStyle(JSONObject jSONObject, pvh pvhVar, pvh pvhVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c817d4c", new Object[]{this, jSONObject, pvhVar, pvhVar2});
            return;
        }
        com.taobao.android.weex_ability.page.a adapter = getAdapter(getInstance(), pvhVar2);
        if (adapter != null) {
            lq0 j = adapter.j(getInstance(), jSONObject);
            if (j != null) {
                pvhVar = pvhVar2;
            }
            pvhVar.b(getResultData(j));
        }
    }

    @MUSMethod(uiThread = true)
    public void setTitle(JSONObject jSONObject, pvh pvhVar, pvh pvhVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69eeeb85", new Object[]{this, jSONObject, pvhVar, pvhVar2});
            return;
        }
        com.taobao.android.weex_ability.page.a adapter = getAdapter(getInstance(), pvhVar2);
        if (adapter != null) {
            lq0 k = adapter.k(getInstance(), jSONObject);
            if (k != null) {
                pvhVar = pvhVar2;
            }
            if (pvhVar != null) {
                pvhVar.b(getResultData(k));
            }
        }
    }

    @MUSMethod(uiThread = true)
    public void show(JSONObject jSONObject, pvh pvhVar, pvh pvhVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a804e7e", new Object[]{this, jSONObject, pvhVar, pvhVar2});
            return;
        }
        com.taobao.android.weex_ability.page.a adapter = getAdapter(getInstance(), pvhVar2);
        if (adapter != null) {
            lq0 m = adapter.m(getInstance(), jSONObject);
            if (m != null) {
                pvhVar = pvhVar2;
            }
            pvhVar.b(getResultData(m));
        }
    }

    @MUSMethod(uiThread = true)
    public void showMenu(JSONObject jSONObject, pvh pvhVar, pvh pvhVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2948f95f", new Object[]{this, jSONObject, pvhVar, pvhVar2});
            return;
        }
        com.taobao.android.weex_ability.page.a adapter = getAdapter(getInstance(), pvhVar2);
        if (adapter != null) {
            lq0 n = adapter.n(getInstance(), jSONObject);
            if (n != null) {
                pvhVar = pvhVar2;
            }
            pvhVar.b(getResultData(n));
        } else if (getInstance() != null && getInstance().getContext() != null && (getInstance().getContext().a() instanceof Activity)) {
            TBPublicMenu tBPublicMenu = new TBPublicMenu((Activity) getInstance().getContext().a());
            tBPublicMenu.setReportArguments(new b(this));
            tBPublicMenu.show();
        }
    }

    private static com.taobao.android.weex_ability.page.a getAdapter(com.taobao.android.weex_framework.a aVar, pvh pvhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.weex_ability.page.a) ipChange.ipc$dispatch("9ca048b6", new Object[]{aVar, pvhVar});
        }
        com.taobao.android.weex_ability.page.a aVar2 = (com.taobao.android.weex_ability.page.a) aVar.getTag("ali_ms_navigation");
        if (aVar2 == null) {
            aVar2 = e5x.b().c();
        }
        if (aVar2 != null) {
            return aVar2;
        }
        lq0 lq0Var = new lq0("MUS_FAILED", lq0.ERROR_NAVIGATION_ADAPTER);
        if (pvhVar != null) {
            pvhVar.b(getResultData(lq0Var));
        }
        return null;
    }

    private void notSupported(pvh pvhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e41ba40b", new Object[]{this, pvhVar});
        } else if (pvhVar == null) {
            dwh.f(NAME, "notSupported -> failure callback is null");
        } else {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("result", (Object) "MS_NOT_SUPPORTED");
            pvhVar.b(jSONObject);
        }
    }

    @MUSMethod(uiThread = true)
    public void hasMenu(Boolean bool, pvh pvhVar, pvh pvhVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f97ac2bf", new Object[]{this, bool, pvhVar, pvhVar2});
            return;
        }
        com.taobao.android.weex_ability.page.a adapter = getAdapter(getInstance(), pvhVar2);
        if (adapter != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("show", (Object) bool);
                lq0 c2 = adapter.c(getInstance(), jSONObject);
                if (c2 != null) {
                    pvhVar = pvhVar2;
                }
                if (pvhVar != null) {
                    pvhVar.b(getResultData(c2));
                }
            } catch (Throwable unused) {
                if (pvhVar2 != null) {
                    notSupported(pvhVar2);
                }
            }
        }
    }

    @MUSMethod(uiThread = true)
    public void setStatusBarStyle(JSONObject jSONObject, pvh pvhVar, pvh pvhVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d85655a9", new Object[]{this, jSONObject, pvhVar, pvhVar2});
        } else if (Build.VERSION.SDK_INT >= 23 && (getInstance().getUIContext() instanceof Activity)) {
            Window window = ((Activity) getInstance().getUIContext()).getWindow();
            if (!"lightContent".equals(jSONObject.getString("style"))) {
                addSystemUiFlag(window, 8192);
            } else {
                removeSystemUiFlag(window, 8192);
            }
            if (pvhVar != null) {
                pvhVar.b(new Object[0]);
            }
        } else if (pvhVar2 != null) {
            pvhVar2.b(getResultData(new lq0("WX_FAILED", "not support device")));
        }
    }

    @MUSMethod(uiThread = true)
    public void setTransparent(boolean z, pvh pvhVar, pvh pvhVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9730102f", new Object[]{this, new Boolean(z), pvhVar, pvhVar2});
            return;
        }
        com.taobao.android.weex_ability.page.a adapter = getAdapter(getInstance(), pvhVar2);
        if (adapter != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("transparent", (Object) Boolean.valueOf(z));
                lq0 l = adapter.l(getInstance(), jSONObject);
                if (l != null) {
                    pvhVar = pvhVar2;
                }
                if (pvhVar != null) {
                    pvhVar.b(getResultData(l));
                }
            } catch (Throwable unused) {
                if (pvhVar2 != null) {
                    notSupported(pvhVar2);
                }
            }
        }
    }
}
