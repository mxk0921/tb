package tb;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.aliweex.bundle.WeexPageFragment;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.RenderContainer;
import com.taobao.weex.WXEnvironment;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.WXSDKManager;
import com.taobao.weex.common.WXRenderStrategy;
import com.taobao.weex.ui.component.NestedContainer;
import com.taobao.weex.utils.TBWXConfigManger;
import com.taobao.weex.utils.WXLogUtils;
import com.taobao.weex.utils.WXResourceUtils;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class u0o implements e2i {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ERROR_BUNDLE_URL = "http://taobao.com?_wx_tpl=http://h5.m.taobao.com/weex/render/error.js";
    public static final String ERROR_RENDER_URL = "http://h5.m.taobao.com/weex/render/error.js";
    public static final String r = "weex_sandbox";
    public static final String s = "wx_wait_init";

    /* renamed from: a  reason: collision with root package name */
    public final Activity f29062a;
    public WXSDKInstance b;
    public String c;
    public Map<String, Object> d;
    public String e;
    public String f;
    public String g;
    public String h;
    public final String i;
    public dbe j;
    public final f2i k;
    public final c2i l;
    public final n7x m;
    public final gbe n;
    public final g2i o;
    public final cvw p;
    public RenderContainer q = null;

    public u0o(Activity activity, String str, gbe gbeVar, f2i f2iVar, c2i c2iVar, n7x n7xVar, cvw cvwVar, g2i g2iVar, boolean z) {
        this.f29062a = activity;
        this.i = str;
        this.n = gbeVar;
        this.k = f2iVar;
        this.l = c2iVar;
        this.m = n7xVar;
        this.p = cvwVar;
        this.o = g2iVar;
    }

    public static /* synthetic */ void l(u0o u0oVar, WXSDKInstance wXSDKInstance, String str, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("591ec4dd", new Object[]{u0oVar, wXSDKInstance, str, map});
        } else {
            u0oVar.r(wXSDKInstance, str, map);
        }
    }

    public static /* synthetic */ Activity m(u0o u0oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("ab2154f7", new Object[]{u0oVar});
        }
        return u0oVar.f29062a;
    }

    public static /* synthetic */ g2i n(u0o u0oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g2i) ipChange.ipc$dispatch("928d1ca", new Object[]{u0oVar});
        }
        return u0oVar.o;
    }

    public static /* synthetic */ WXSDKInstance o(u0o u0oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WXSDKInstance) ipChange.ipc$dispatch("24010771", new Object[]{u0oVar});
        }
        return u0oVar.b;
    }

    @Override // tb.e2i
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d8788f87", new Object[]{this})).booleanValue();
        }
        WXSDKInstance wXSDKInstance = this.b;
        if (wXSDKInstance != null) {
            return wXSDKInstance.D0();
        }
        return false;
    }

    @Override // tb.e2i
    public void b(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78684150", new Object[]{this, str, map});
        } else {
            r(this.b, str, map);
        }
    }

    @Override // tb.e2i
    public void d(String str, String str2, Map<String, Object> map, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e25f1ccb", new Object[]{this, str, str2, map, str3});
        } else if (!TextUtils.isEmpty(str)) {
            n7x n7xVar = this.m;
            if (n7xVar != null) {
                n7xVar.b(true);
            }
            u(this.f29062a);
            this.d = map;
            this.e = str3;
            this.f = str;
            this.g = str2;
            WXSDKInstance wXSDKInstance = this.b;
            if (TextUtils.isEmpty(str2)) {
                str2 = "AliWeex";
            }
            wXSDKInstance.T0(str2, str, map, str3, t(this.d));
        }
    }

    @Override // tb.e2i
    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("992695c7", new Object[]{this});
        }
        c2i c2iVar = this.l;
        if (c2iVar != null) {
            return ((s58) c2iVar).a();
        }
        return this.h;
    }

    @Override // tb.e2i
    public WXSDKInstance f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WXSDKInstance) ipChange.ipc$dispatch("169676dd", new Object[]{this});
        }
        if (this.b == null) {
            u(this.f29062a);
        }
        return this.b;
    }

    @Override // tb.e2i
    public void g(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("244830cf", new Object[]{this, str, str2});
            return;
        }
        j();
        i(str, str2);
        f2i f2iVar = this.k;
        if (f2iVar != null) {
            ((j2v) f2iVar).g(getUrl());
        }
        c(this.d, this.e, str, str2);
    }

    @Override // tb.e2i
    public NestedContainer getNestedContainer(WXSDKInstance wXSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NestedContainer) ipChange.ipc$dispatch("984d011a", new Object[]{this, wXSDKInstance});
        }
        dbe dbeVar = this.j;
        if (dbeVar == null || wXSDKInstance == null) {
            return null;
        }
        return dbeVar.getNestedContainer(wXSDKInstance);
    }

    @Override // tb.e2i
    public String getOriginalUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cd9dbb51", new Object[]{this});
        }
        c2i c2iVar = this.l;
        if (c2iVar != null) {
            return ((s58) c2iVar).b();
        }
        return this.g;
    }

    @Override // tb.e2i
    public String getUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this});
        }
        c2i c2iVar = this.l;
        if (c2iVar != null) {
            return ((s58) c2iVar).d();
        }
        return this.g;
    }

    @Override // tb.e2i
    public void h(ViewGroup viewGroup, Map<String, Object> map, String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5a0fbc7", new Object[]{this, viewGroup, map, str, str2, str3, str4, str5});
            return;
        }
        if (this.q == null) {
            this.q = new RenderContainer(this.f29062a);
        }
        viewGroup.addView(this.q);
        u(this.f29062a);
        this.q.createInstanceRenderView(this.b.N());
        this.b.setRenderContainer(this.q);
        q(map, str, str2, str3, str4, str5);
    }

    @Override // tb.e2i
    public void i(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("902dfd7e", new Object[]{this, str, str2});
            return;
        }
        c2i c2iVar = this.l;
        if (c2iVar != null) {
            ((s58) c2iVar).g(str, str2);
            return;
        }
        this.g = str;
        this.h = str2;
    }

    @Override // tb.e2i
    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c33e309c", new Object[]{this});
            return;
        }
        WXSDKInstance wXSDKInstance = this.b;
        if (wXSDKInstance != null) {
            wXSDKInstance.Q0();
            this.b.destroy();
            this.b = null;
        }
    }

    @Override // tb.e2i
    public String k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fe311996", new Object[]{this});
        }
        c2i c2iVar = this.l;
        if (c2iVar != null) {
            return ((s58) c2iVar).c();
        }
        return this.h;
    }

    @Override // tb.e2i
    public void onActivityDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fef57493", new Object[]{this});
            return;
        }
        if (this.b != null) {
            f();
            this.b.Q0();
            this.b.onActivityDestroy();
        }
        dbe dbeVar = this.j;
        if (dbeVar != null) {
            dbeVar.destroy();
        }
    }

    @Override // tb.e2i
    public void onActivityPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64e6b90f", new Object[]{this});
            return;
        }
        WXSDKInstance wXSDKInstance = this.b;
        if (wXSDKInstance != null) {
            if (wXSDKInstance.getContainerView() != null && v()) {
                this.b.l1(s((ViewGroup) this.b.getContainerView()));
            }
            this.b.onActivityPause();
        }
        kr0.i("");
    }

    @Override // tb.e2i
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        WXSDKInstance wXSDKInstance = this.b;
        if (wXSDKInstance != null) {
            wXSDKInstance.onActivityResult(i, i2, intent);
        }
    }

    @Override // tb.e2i
    public void onActivityResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c4fa6e2", new Object[]{this});
            return;
        }
        WXSDKInstance wXSDKInstance = this.b;
        if (wXSDKInstance != null) {
            wXSDKInstance.onActivityResume();
        }
        y(getUrl());
    }

    @Override // tb.e2i
    public void onActivityStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b48c417b", new Object[]{this});
            return;
        }
        WXSDKInstance wXSDKInstance = this.b;
        if (wXSDKInstance != null) {
            wXSDKInstance.onActivityStart();
        }
    }

    @Override // tb.e2i
    public void onActivityStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3ac47b7", new Object[]{this});
            return;
        }
        WXSDKInstance wXSDKInstance = this.b;
        if (wXSDKInstance != null) {
            wXSDKInstance.onActivityStop();
        }
    }

    @Override // tb.e2i
    public boolean onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88afc67", new Object[]{this})).booleanValue();
        }
        WXSDKInstance wXSDKInstance = this.b;
        if (wXSDKInstance != null) {
            return wXSDKInstance.onBackPressed();
        }
        return false;
    }

    @Override // tb.e2i
    public void onCreateOptionsMenu(Menu menu) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e84f74f", new Object[]{this, menu});
            return;
        }
        WXSDKInstance wXSDKInstance = this.b;
        if (wXSDKInstance != null) {
            wXSDKInstance.onCreateOptionsMenu(menu);
        }
        dbe dbeVar = this.j;
        if (dbeVar != null) {
            dbeVar.onCreateOptionsMenu(menu);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.taobao.weex.WXSDKInstance p(android.content.Context r5) {
        /*
            r4 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.u0o.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0018
            java.lang.String r1 = "31f9692d"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r4
            r3 = 1
            r2[r3] = r5
            java.lang.Object r5 = r0.ipc$dispatch(r1, r2)
            com.taobao.weex.WXSDKInstance r5 = (com.taobao.weex.WXSDKInstance) r5
            return r5
        L_0x0018:
            java.lang.String r0 = r4.k()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r2 = "RenderPresenter"
            if (r1 != 0) goto L_0x003e
            tb.hvw r1 = tb.hvw.a()
            com.taobao.weex.WXSDKInstance r0 = r1.b(r0, r5)
            boolean r1 = r0 instanceof com.alibaba.aliweex.AliWXSDKInstance
            if (r1 == 0) goto L_0x003e
            com.alibaba.aliweex.AliWXSDKInstance r0 = (com.alibaba.aliweex.AliWXSDKInstance) r0
            java.lang.String r1 = r4.i
            r0.H1(r1)
            java.lang.String r1 = "preinit -> use preinitInstance "
            android.util.Log.e(r2, r1)
            goto L_0x003f
        L_0x003e:
            r0 = 0
        L_0x003f:
            if (r0 != 0) goto L_0x004e
            java.lang.String r0 = "preinit -> failed ,and  new AliWXSDKInstance "
            android.util.Log.e(r2, r0)
            com.alibaba.aliweex.AliWXSDKInstance r0 = new com.alibaba.aliweex.AliWXSDKInstance
            java.lang.String r1 = r4.i
            r0.<init>(r5, r1)
        L_0x004e:
            tb.cvw r5 = r4.p
            r0.I1(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.u0o.p(android.content.Context):com.taobao.weex.WXSDKInstance");
    }

    public final void q(Map<String, Object> map, String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c222e2f", new Object[]{this, map, str, str2, str3, str4, str5});
            return;
        }
        if (!TextUtils.isEmpty(str2)) {
            d(str2, str3, map, str);
        } else if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
            c(map, str, str3, str4);
        } else if (!TextUtils.isEmpty(str5)) {
            c(map, str, str5, str5);
        }
        this.b.onActivityCreate();
    }

    public final void r(WXSDKInstance wXSDKInstance, String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a50898d8", new Object[]{this, wXSDKInstance, str, map});
        } else if (wXSDKInstance != null && wXSDKInstance.getRootComponent() != null) {
            wXSDKInstance.y(wXSDKInstance.getRootComponent().getRef(), str, map);
        }
    }

    @Override // tb.e2i
    public void reload() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5a391a0", new Object[]{this});
            return;
        }
        f2i f2iVar = this.k;
        if (f2iVar != null) {
            ((j2v) f2iVar).g(getUrl());
        }
        if (!TextUtils.isEmpty(getOriginalUrl()) && !TextUtils.isEmpty(e())) {
            j();
            c(this.d, this.e, getOriginalUrl(), e());
        } else if (!TextUtils.isEmpty(this.f)) {
            j();
            d(this.f, this.g, this.d, this.e);
        }
    }

    public final int s(ViewGroup viewGroup) {
        int s2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ccd9674b", new Object[]{this, viewGroup})).intValue();
        }
        if (viewGroup == null) {
            return -1;
        }
        if (viewGroup.getChildCount() == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (childAt != null && (childAt instanceof ViewGroup) && (s2 = s((ViewGroup) childAt)) > i) {
                i = s2;
            }
        }
        return i + 1;
    }

    @Override // tb.e2i
    public void setRenderContainer(RenderContainer renderContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24db60e1", new Object[]{this, renderContainer});
        } else {
            this.q = renderContainer;
        }
    }

    public final WXRenderStrategy t(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WXRenderStrategy) ipChange.ipc$dispatch("f3246f1c", new Object[]{this, map});
        }
        WXRenderStrategy wXRenderStrategy = WXRenderStrategy.APPEND_ASYNC;
        if (map == null) {
            return wXRenderStrategy;
        }
        try {
            return map.containsKey(WeexPageFragment.WX_RENDER_STRATEGY) ? WXRenderStrategy.valueOf(map.get(WeexPageFragment.WX_RENDER_STRATEGY).toString()) : wXRenderStrategy;
        } catch (Exception e) {
            WXLogUtils.e("RenderPresenter", WXLogUtils.getStackTrace(e));
            return wXRenderStrategy;
        }
    }

    public final void w(Map<String, Object> map, String str, WXRenderStrategy wXRenderStrategy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac1e47dc", new Object[]{this, map, str, wXRenderStrategy});
            return;
        }
        String k = k();
        if (!bpv.d(k) && !WXEnvironment.isApkDebugable()) {
            k = ERROR_RENDER_URL;
        }
        if (!this.b.q0()) {
            this.b.X0(k, k, map, str, wXRenderStrategy);
        }
    }

    public final void x(WXSDKInstance wXSDKInstance, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abec6fed", new Object[]{this, wXSDKInstance, uri});
        } else if (wXSDKInstance != null && uri != null) {
            String queryParameter = uri.getQueryParameter("bgContainerColor");
            if (!TextUtils.isEmpty(queryParameter)) {
                if (wXSDKInstance.getContainerView() == null) {
                    wXSDKInstance.setRenderContainer(new RenderContainer(this.f29062a));
                }
                wXSDKInstance.getContainerView().setBackgroundColor(WXResourceUtils.getColor(queryParameter, -1));
            }
        }
    }

    public final void y(String str) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dab3ef7", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            if (!TextUtils.equals(this.c, str)) {
                if (TextUtils.isEmpty(this.c)) {
                    this.c = str;
                } else {
                    z = false;
                }
            }
            if (this.f29062a != null && z) {
                this.c = Uri.parse(str).buildUpon().appendQueryParameter("activity", this.f29062a.getClass().getName()).build().toString();
            }
            kr0.i(this.c);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements WXSDKManager.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.weex.WXSDKManager.a
        public void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c4e0fc68", new Object[]{this, str, str2});
            }
        }

        @Override // com.taobao.weex.WXSDKManager.a
        public void onInitSuccess() {
            u0o u0oVar = u0o.this;
            try {
                u0oVar.j = (dbe) Class.forName("com.alibaba.aliweex.bundle.WXNestedInstanceInterceptor").getConstructor(Context.class, Handler.class).newInstance(u0o.m(u0oVar), u0o.n(u0oVar).getHandler());
                u0o.o(u0oVar).p1(u0oVar.j);
            } catch (Throwable th) {
                WXLogUtils.e("weex1", th);
            }
        }
    }

    @Override // tb.e2i
    public void c(Map<String, Object> map, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73b8979c", new Object[]{this, map, str, str2, str3});
        } else if (!TextUtils.isEmpty(str3)) {
            g2i g2iVar = this.o;
            if (g2iVar != null) {
                g2iVar.b(str3);
            }
            Uri parse = Uri.parse(str3);
            boolean booleanQueryParameter = parse.getBooleanQueryParameter("wx_mute_loading_indicator", false);
            n7x n7xVar = this.m;
            if (n7xVar != null) {
                n7xVar.b(true ^ booleanQueryParameter);
            }
            u(this.f29062a);
            i(str2, str3);
            y(getUrl());
            x(this.b, parse);
            this.d = map;
            this.e = str;
            HashMap hashMap = new HashMap();
            if (TextUtils.isEmpty(str2)) {
                str2 = str3;
            }
            hashMap.put("bundleUrl", str2);
            if (map != null) {
                for (String str4 : map.keySet()) {
                    hashMap.put(str4, map.get(str4));
                }
            }
            f2i f2iVar = this.k;
            if (f2iVar != null) {
                ((j2v) f2iVar).j(getUrl());
            }
            w(hashMap, str, t(this.d));
        }
    }

    public final void u(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba6d79c2", new Object[]{this, context});
        } else if (this.b == null) {
            WXSDKInstance p = p(context);
            this.b = p;
            p.i1(new a());
            kr0.j(this.b.N());
            if (kr0.e().b() != null) {
                if ("false".equals(kr0.e().b().getConfig(r, "enableSanbox", "true"))) {
                    this.b.setUseSandBox(false);
                } else {
                    this.b.setUseSandBox(true);
                }
            }
            f2i f2iVar = this.k;
            if (f2iVar != null) {
                ((j2v) f2iVar).k(this.b);
            }
            this.b.registerRenderListener(this.n);
            this.b.onInstanceReady();
        }
    }

    public final synchronized boolean v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a2737a3f", new Object[]{this})).booleanValue();
        }
        npb b = kr0.e().b();
        if (b == null) {
            return false;
        }
        return Boolean.parseBoolean(b.getConfig(TBWXConfigManger.WX_NAMESPACE_EXT_CONFIG, TBWXConfigManger.WX_GET_DEEP_VIEW_LAYER, Boolean.toString(true)));
    }

    static {
        t2o.a(85983269);
        t2o.a(85983266);
    }
}
