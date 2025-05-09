package com.taobao.android.sku.weex;

import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.sku.utils.SkuLogUtils;
import com.taobao.android.weex.config.WeexInstanceConfig;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.MUSInstanceConfig;
import com.taobao.weex.RenderContainer;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.adapter.IWXComputeScreenAdapter;
import com.taobao.weex.common.WXRenderStrategy;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;
import tb.all;
import tb.gbe;
import tb.kpc;
import tb.lce;
import tb.npc;
import tb.o2q;
import tb.o6x;
import tb.sxl;
import tb.t2o;
import tb.ttw;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class WeexWrapper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "WeexWrapper";
    public static final int WEEX_VERSION_V1 = 1;
    public static final int WEEX_VERSION_V2 = 2;
    public static boolean e;
    public static boolean f;

    /* renamed from: a  reason: collision with root package name */
    public final String f9475a;
    public final Context b;
    public final int c;
    public b d;

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public @interface SkuWeexVersion {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface a {
        void a(View view);

        void b(b bVar);

        void c(b bVar, String str, String str2);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface b {
        void a();

        void b(String str, Map<String, Object> map);

        void c();

        void d();

        void destroy();

        void e();

        boolean f();

        void g(String str, JSONObject jSONObject, boolean z);

        View getRootView();

        void h();

        void i(a aVar);

        boolean onBackPressed();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class c implements b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final WXSDKInstance f9476a;
        public a b;
        public final RenderContainer c;
        public final int d;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class a implements IWXComputeScreenAdapter {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Context f9477a;

            public a(c cVar, Context context) {
                this.f9477a = context;
            }

            @Override // com.taobao.weex.adapter.IWXComputeScreenAdapter
            public Rect computeCurrentScreenMetrics() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Rect) ipChange.ipc$dispatch("e162c6e5", new Object[]{this});
                }
                return all.INSTANCE.d(this.f9477a);
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class b implements gbe {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public b() {
            }

            public final String a(int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("913c1f0", new Object[]{this, new Integer(i)});
                }
                if (i == 3) {
                    return SkuLogUtils.LOG_TRACE_MODULE;
                }
                return SkuLogUtils.LOG_TRACE_MODULE_SKU_V3;
            }

            @Override // tb.gbe
            public void onException(WXSDKInstance wXSDKInstance, String str, String str2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("88f82eeb", new Object[]{this, wXSDKInstance, str, str2});
                    return;
                }
                String a2 = a(c.j(c.this));
                SkuLogUtils.r(a2, "renderError", "code: " + str, str2);
                ttw.a().e(wXSDKInstance, str, str2);
                if (c.k(c.this) != null) {
                    c.k(c.this).c(c.this, str, str2);
                }
            }

            @Override // tb.gbe
            public void onRefreshSuccess(WXSDKInstance wXSDKInstance, int i, int i2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("d57f8320", new Object[]{this, wXSDKInstance, new Integer(i), new Integer(i2)});
                    return;
                }
                SkuLogUtils.r(a(c.j(c.this)), "onRefreshSuccess", "code: 0", "SkuWXRenderListener：onRefreshSuccess");
                Log.e("Weex SKU", "SkuWXRenderListener：onRefreshSuccess");
            }

            @Override // tb.gbe
            public void onRenderSuccess(WXSDKInstance wXSDKInstance, int i, int i2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("c414a5f9", new Object[]{this, wXSDKInstance, new Integer(i), new Integer(i2)});
                    return;
                }
                SkuLogUtils.r(a(c.j(c.this)), sxl.RENDER_SUCCESS_TIME, "code: 1", "SkuWXRenderListener：onRenderSuccess");
                Log.e("Weex SKU", "SkuWXRenderListener：onRenderSuccess");
                ttw.a().j(wXSDKInstance);
                if (c.k(c.this) != null) {
                    c.k(c.this).b(c.this);
                }
            }

            @Override // tb.gbe
            public void onViewCreated(WXSDKInstance wXSDKInstance, View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("9eab5f0f", new Object[]{this, wXSDKInstance, view});
                } else {
                    ttw.a().k(wXSDKInstance, view);
                }
            }
        }

        static {
            t2o.a(442499359);
            t2o.a(442499358);
        }

        public c(Context context, int i) {
            this.d = i;
            WXSDKInstance wXSDKInstance = new WXSDKInstance(context);
            this.f9476a = wXSDKInstance;
            RenderContainer renderContainer = new RenderContainer(context);
            renderContainer.setBackgroundColor(0);
            wXSDKInstance.setRenderContainer(renderContainer);
            this.c = renderContainer;
            if (all.INSTANCE.f(context)) {
                wXSDKInstance.c1(new a(this, context));
            }
            wXSDKInstance.registerRenderListener(new b());
        }

        public static /* synthetic */ int j(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("e8ab358d", new Object[]{cVar})).intValue();
            }
            return cVar.d;
        }

        public static /* synthetic */ a k(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("725b327f", new Object[]{cVar});
            }
            return cVar.b;
        }

        @Override // com.taobao.android.sku.weex.WeexWrapper.b
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c4ac0136", new Object[]{this});
            }
        }

        @Override // com.taobao.android.sku.weex.WeexWrapper.b
        public void b(String str, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("78684150", new Object[]{this, str, map});
            } else {
                this.f9476a.B(str, map);
            }
        }

        @Override // com.taobao.android.sku.weex.WeexWrapper.b
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c52bc43b", new Object[]{this});
            }
        }

        @Override // com.taobao.android.sku.weex.WeexWrapper.b
        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("14d14ca7", new Object[]{this});
            }
        }

        @Override // com.taobao.android.sku.weex.WeexWrapper.b
        public void destroy() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("89c49781", new Object[]{this});
                return;
            }
            this.f9476a.registerRenderListener(null);
            this.f9476a.destroy();
        }

        @Override // com.taobao.android.sku.weex.WeexWrapper.b
        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d643270b", new Object[]{this});
            }
        }

        @Override // com.taobao.android.sku.weex.WeexWrapper.b
        public boolean f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("54bb5f4d", new Object[]{this})).booleanValue();
            }
            return false;
        }

        @Override // com.taobao.android.sku.weex.WeexWrapper.b
        public void g(String str, JSONObject jSONObject, boolean z) {
            String str2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9581892e", new Object[]{this, str, jSONObject, new Boolean(z)});
                return;
            }
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            if (!TextUtils.isEmpty(str)) {
                str2 = str;
            } else {
                str2 = SkuLogUtils.PAGE_NAME;
            }
            this.f9476a.X0(str2, str, null, jSONObject.toJSONString(), WXRenderStrategy.APPEND_ASYNC);
        }

        @Override // com.taobao.android.sku.weex.WeexWrapper.b
        public View getRootView() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("17b33166", new Object[]{this});
            }
            return this.f9476a.getContainerView();
        }

        @Override // com.taobao.android.sku.weex.WeexWrapper.b
        public void h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e0c1d784", new Object[]{this});
            } else if (this.d == 3) {
                SkuWeexModule.registerCurrentModule();
            } else {
                SkuV3WeexModule.registerCurrentModule();
            }
        }

        @Override // com.taobao.android.sku.weex.WeexWrapper.b
        public void i(a aVar) {
            boolean z = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("55c1d3e0", new Object[]{this, aVar});
                return;
            }
            if (this.b == aVar) {
                z = false;
            }
            this.b = aVar;
            if (z) {
                l();
            }
        }

        public final void l() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("935c0ead", new Object[]{this});
                return;
            }
            a aVar = this.b;
            if (aVar != null) {
                aVar.a(this.c);
            }
        }

        @Override // com.taobao.android.sku.weex.WeexWrapper.b
        public boolean onBackPressed() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("88afc67", new Object[]{this})).booleanValue();
            }
            return false;
        }
    }

    static {
        t2o.a(442499355);
    }

    public WeexWrapper(Context context, int i, String str) {
        this.b = context;
        this.c = i;
        this.f9475a = str;
    }

    public void a(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4eca9b14", new Object[]{this, new Integer(i), str});
            return;
        }
        b();
        ttw.a().b(this.b);
        ttw.a().c();
        ttw.a().h();
        ttw.a().g();
        if (i != 2) {
            this.d = new c(this.b, this.c);
        } else {
            this.d = new d(this.b, this.c, str, this.f9475a);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        b bVar = this.d;
        if (bVar != null) {
            bVar.destroy();
        }
        ttw.a().f();
        ttw.a().i();
        ttw.a().d();
    }

    public void c(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78684150", new Object[]{this, str, map});
            return;
        }
        b bVar = this.d;
        if (bVar != null) {
            bVar.b(str, map);
        }
    }

    public View d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("17b33166", new Object[]{this});
        }
        b bVar = this.d;
        if (bVar != null) {
            return bVar.getRootView();
        }
        return null;
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0c1d784", new Object[]{this});
            return;
        }
        b bVar = this.d;
        if (bVar != null) {
            bVar.h();
        }
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("54bb5f4d", new Object[]{this})).booleanValue();
        }
        b bVar = this.d;
        if (bVar == null || !bVar.f()) {
            return false;
        }
        return true;
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88afc67", new Object[]{this})).booleanValue();
        }
        b bVar = this.d;
        if (bVar == null || !bVar.onBackPressed()) {
            return false;
        }
        return true;
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c52bc43b", new Object[]{this});
            return;
        }
        b bVar = this.d;
        if (bVar != null) {
            bVar.c();
        }
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4ac0136", new Object[]{this});
            return;
        }
        b bVar = this.d;
        if (bVar != null) {
            bVar.a();
        }
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14d14ca7", new Object[]{this});
            return;
        }
        b bVar = this.d;
        if (bVar != null) {
            bVar.d();
        }
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d643270b", new Object[]{this});
            return;
        }
        b bVar = this.d;
        if (bVar != null) {
            bVar.e();
        }
    }

    public void l(String str, JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9581892e", new Object[]{this, str, jSONObject, new Boolean(z)});
            return;
        }
        b bVar = this.d;
        if (bVar != null) {
            bVar.g(str, jSONObject, z);
        }
    }

    public void m(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55c1d3e0", new Object[]{this, aVar});
            return;
        }
        b bVar = this.d;
        if (bVar != null) {
            bVar.i(aVar);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class d implements b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Context f9479a;
        public com.taobao.android.weex_framework.a b;
        public a c;
        public final int d;
        public final boolean e = o2q.c("is_weex2_intercept_back_press");
        public boolean f;
        public final npc g;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class a implements npc {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // tb.npc
            public void onDestroyed(MUSDKInstance mUSDKInstance) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("32f7f995", new Object[]{this, mUSDKInstance});
                } else {
                    SkuLogUtils.j(WeexWrapper.TAG, "onDestroyed");
                }
            }

            @Override // tb.npc
            public void onJSException(com.taobao.android.weex_framework.a aVar, int i, String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8c41b6de", new Object[]{this, aVar, new Integer(i), str});
                    return;
                }
                if (d.k(d.this) != null) {
                    a k = d.k(d.this);
                    d dVar = d.this;
                    k.c(dVar, i + "", str);
                }
                SkuLogUtils.j(WeexWrapper.TAG, "onJSException " + str);
            }

            @Override // tb.npc
            public void onPrepareSuccess(com.taobao.android.weex_framework.a aVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("27a2635b", new Object[]{this, aVar});
                    return;
                }
                SkuLogUtils.j(WeexWrapper.TAG, "onPrepareSuccess" + aVar);
            }

            @Override // tb.npc
            public void onRefreshFailed(com.taobao.android.weex_framework.a aVar, int i, String str, boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("cc0861e4", new Object[]{this, aVar, new Integer(i), str, new Boolean(z)});
                    return;
                }
                SkuLogUtils.j(WeexWrapper.TAG, "onRefreshFailed downgrade with errorCode: " + i + " errorMsg: " + str);
            }

            @Override // tb.npc
            public void onRefreshSuccess(com.taobao.android.weex_framework.a aVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("963c382f", new Object[]{this, aVar});
                    return;
                }
                SkuLogUtils.j(WeexWrapper.TAG, "onRefreshSuccess" + aVar);
            }

            @Override // tb.npc
            public void onRenderFailed(com.taobao.android.weex_framework.a aVar, int i, String str, boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("cc0cbe2b", new Object[]{this, aVar, new Integer(i), str, new Boolean(z)});
                    return;
                }
                if (d.k(d.this) != null) {
                    a k = d.k(d.this);
                    d dVar = d.this;
                    k.c(dVar, i + "", str);
                }
                SkuLogUtils.j(WeexWrapper.TAG, "onRenderFailed downgrade with errorCode: " + i + " errorMsg: " + str);
            }

            @Override // tb.npc
            public void onRenderSuccess(com.taobao.android.weex_framework.a aVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("2b2aeb48", new Object[]{this, aVar});
                    return;
                }
                d.j(d.this);
                SkuLogUtils.j(WeexWrapper.TAG, sxl.RENDER_SUCCESS_TIME + aVar);
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class b implements kpc {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public b() {
            }

            @Override // tb.kpc
            public void a(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("1414cfeb", new Object[]{this, view});
                } else {
                    d.l(d.this, view);
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class c implements lce {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public c() {
            }

            @Override // tb.lce
            public Rect computeCurrentScreenMetrics() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Rect) ipChange.ipc$dispatch("e162c6e5", new Object[]{this});
                }
                return all.INSTANCE.d(d.m(d.this));
            }
        }

        /* compiled from: Taobao */
        /* renamed from: com.taobao.android.sku.weex.WeexWrapper$d$d  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class C0488d implements npc {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public C0488d() {
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
                } else if (d.k(d.this) != null) {
                    a k = d.k(d.this);
                    d dVar = d.this;
                    k.c(dVar, i + "", str);
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
                SkuLogUtils.j("weexV2Mode", "onRefreshFailed downgrade with errorCode: " + i + " errorMsg: " + str);
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
                if (d.k(d.this) != null) {
                    a k = d.k(d.this);
                    d dVar = d.this;
                    k.c(dVar, i + "", str);
                }
                SkuLogUtils.j("weexV2Mode", "onRenderFailed downgrade with errorCode: " + i + " errorMsg: " + str);
            }

            @Override // tb.npc
            public void onRenderSuccess(com.taobao.android.weex_framework.a aVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("2b2aeb48", new Object[]{this, aVar});
                } else if (d.k(d.this) != null) {
                    d.k(d.this).b(d.this);
                }
            }
        }

        static {
            t2o.a(442499362);
            t2o.a(442499358);
        }

        public d(Context context, int i, String str, String str2) {
            this.f = false;
            a aVar = new a();
            this.f9479a = context;
            this.d = i;
            MUSDKInstance q = q(str, str2);
            if (q != null) {
                this.b = q;
                this.f = true;
                o(q.getRenderRoot());
                n();
                this.b.registerRenderListener(aVar);
                return;
            }
            p(str);
            if (o2q.c("enable_fix_double_weex") && this.b != null) {
                o6x.h(str, str2);
            }
        }

        public static /* synthetic */ void j(d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d77be37b", new Object[]{dVar});
            } else {
                dVar.n();
            }
        }

        public static /* synthetic */ a k(d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("280470e0", new Object[]{dVar});
            }
            return dVar.c;
        }

        public static /* synthetic */ void l(d dVar, View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("db9ec9b5", new Object[]{dVar, view});
            } else {
                dVar.o(view);
            }
        }

        public static /* synthetic */ Context m(d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Context) ipChange.ipc$dispatch("59997536", new Object[]{dVar});
            }
            return dVar.f9479a;
        }

        @Override // com.taobao.android.sku.weex.WeexWrapper.b
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c4ac0136", new Object[]{this});
            } else {
                this.b.onActivityResume();
            }
        }

        @Override // com.taobao.android.sku.weex.WeexWrapper.b
        public void b(String str, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("78684150", new Object[]{this, str, map});
            } else {
                this.b.fireEvent(0, str, new JSONObject(map));
            }
        }

        @Override // com.taobao.android.sku.weex.WeexWrapper.b
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c52bc43b", new Object[]{this});
            } else {
                this.b.onActivityPause();
            }
        }

        @Override // com.taobao.android.sku.weex.WeexWrapper.b
        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("14d14ca7", new Object[]{this});
            } else {
                this.b.onActivityStart();
            }
        }

        @Override // com.taobao.android.sku.weex.WeexWrapper.b
        public void destroy() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("89c49781", new Object[]{this});
                return;
            }
            this.f = false;
            this.b.registerRenderListener(null);
            this.b.destroy();
        }

        @Override // com.taobao.android.sku.weex.WeexWrapper.b
        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d643270b", new Object[]{this});
            } else {
                this.b.onActivityStop();
            }
        }

        @Override // com.taobao.android.sku.weex.WeexWrapper.b
        public boolean f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("54bb5f4d", new Object[]{this})).booleanValue();
            }
            return this.f;
        }

        @Override // com.taobao.android.sku.weex.WeexWrapper.b
        public void g(String str, JSONObject jSONObject, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9581892e", new Object[]{this, str, jSONObject, new Boolean(z)});
                return;
            }
            this.b.initWithURL(Uri.parse(str));
            if (z) {
                jSONObject = null;
            }
            this.b.render(jSONObject, null);
        }

        @Override // com.taobao.android.sku.weex.WeexWrapper.b
        public View getRootView() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("17b33166", new Object[]{this});
            }
            return this.b.getRenderRoot();
        }

        @Override // com.taobao.android.sku.weex.WeexWrapper.b
        public void h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e0c1d784", new Object[]{this});
            } else if (this.d == 3) {
                SkuWeexV2Module.registerCurrentModule();
                SkuLogUtils.j(WeexWrapper.TAG, "registerCurrentModule SKU_MODE_WEEX NewBuy_Detail");
            } else {
                SkuV3WeexV2Module.registerCurrentModule();
                SkuLogUtils.j(WeexWrapper.TAG, "registerCurrentModule SKU_MODE_WEEX_SKU_V3 Sku_V3_Detail");
            }
        }

        @Override // com.taobao.android.sku.weex.WeexWrapper.b
        public void i(a aVar) {
            boolean z = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("55c1d3e0", new Object[]{this, aVar});
                return;
            }
            if (this.c == aVar) {
                z = false;
            }
            this.c = aVar;
            if (z) {
                o(getRootView());
                n();
            }
        }

        public final void n() {
            a aVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9f51c4d6", new Object[]{this});
            } else if (f() && (aVar = this.c) != null) {
                aVar.b(this);
            }
        }

        public final void o(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e2f9c905", new Object[]{this, view});
                return;
            }
            a aVar = this.c;
            if (aVar != null) {
                aVar.a(view);
            }
        }

        @Override // com.taobao.android.sku.weex.WeexWrapper.b
        public boolean onBackPressed() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("88afc67", new Object[]{this})).booleanValue();
            }
            if (!this.e || !this.b.canGoBack()) {
                return false;
            }
            this.b.goBack();
            return true;
        }

        public final void p(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("68bdd3e3", new Object[]{this, str});
                return;
            }
            MUSInstanceConfig mUSInstanceConfig = new MUSInstanceConfig();
            mUSInstanceConfig.B(true);
            mUSInstanceConfig.t(MUSInstanceConfig.MUSRenderType.MUSRenderTypeUnicorn);
            mUSInstanceConfig.y(MUSInstanceConfig.RenderMode.texture);
            mUSInstanceConfig.v(false);
            mUSInstanceConfig.p(str);
            mUSInstanceConfig.u(new b());
            if (all.INSTANCE.f(this.f9479a)) {
                mUSInstanceConfig.q(new c());
            }
            mUSInstanceConfig.E(WeexInstanceConfig.WeexEmbedPresentMode.WeexEmbedPresentModePage);
            com.taobao.android.weex_framework.a c2 = com.taobao.android.weex_framework.b.f().c(this.f9479a, mUSInstanceConfig);
            this.b = c2;
            c2.registerRenderListener(new C0488d());
        }

        public final MUSDKInstance q(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MUSDKInstance) ipChange.ipc$dispatch("14642528", new Object[]{this, str, str2});
            }
            WeexWrapper.e = false;
            WeexWrapper.f = false;
            MUSDKInstance e = o6x.e(this.f9479a, str, str2);
            if (e == null) {
                WeexWrapper.e = true;
                return null;
            } else if (r(e, str, str2)) {
                o6x.m(str2);
                return e;
            } else {
                WeexWrapper.f = true;
                o6x.m(str2);
                return null;
            }
        }

        public final boolean r(MUSDKInstance mUSDKInstance, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a92cd397", new Object[]{this, mUSDKInstance, str, str2})).booleanValue();
            }
            if (mUSDKInstance == null) {
                SkuLogUtils.j(WeexWrapper.TAG, "getPreloadedInstance null");
                return false;
            } else if (mUSDKInstance.isInvalid()) {
                mUSDKInstance.destroy();
                SkuLogUtils.a(SkuLogUtils.DEFAULT_BIZ_NAME, SkuLogUtils.UM_WEEX_SKU_PRELOAD, "getPreloadedInstance is isInvalid");
                return false;
            } else if (mUSDKInstance.getRenderRoot() == null) {
                mUSDKInstance.destroy();
                SkuLogUtils.a(SkuLogUtils.DEFAULT_BIZ_NAME, SkuLogUtils.UM_WEEX_SKU_PRELOAD, "getPreloadedInstance getRenderRoot is null");
                return false;
            } else {
                String d = o6x.d(str, str2);
                if (!SkuPreloadModule.isInstanceReady(d)) {
                    mUSDKInstance.destroy();
                    SkuLogUtils.a(SkuLogUtils.DEFAULT_BIZ_NAME, SkuLogUtils.UM_WEEX_SKU_PRELOAD, "getPreloadedInstance is not ready");
                    return false;
                } else if (!mUSDKInstance.isUIReady()) {
                    mUSDKInstance.destroy();
                    SkuLogUtils.a(SkuLogUtils.DEFAULT_BIZ_NAME, SkuLogUtils.UM_WEEX_SKU_PRELOAD, "getPreloadedInstance isUIReady is false");
                    return false;
                } else {
                    SkuLogUtils.w(d, str);
                    SkuLogUtils.j(WeexWrapper.TAG, "WeexPreloadHit : " + d);
                    return true;
                }
            }
        }
    }
}
