package com.taobao.android.detail2.core.framework.base.weex;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.base.weex.b;
import com.taobao.android.weex_framework.MUSEngine;
import com.taobao.taobao.R;
import com.taobao.weex.WXSDKInstance;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.byj;
import tb.cxj;
import tb.jxh;
import tb.k97;
import tb.kpc;
import tb.kr0;
import tb.nbq;
import tb.pce;
import tb.q0j;
import tb.qtk;
import tb.qyj;
import tb.r19;
import tb.t2o;
import tb.txj;
import tb.wwj;
import tb.x3w;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class DetailWeexContainer implements qtk {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "DetailWeexContainer";

    /* renamed from: a  reason: collision with root package name */
    public com.taobao.android.detail2.core.framework.base.weex.a f7092a;
    public cxj b;
    public String c;
    public boolean d;
    public Map<String, String> e;
    public JSONObject f;
    public final String i;
    public final String j;
    public final String k;
    public FrameLayout l;
    public BroadcastReceiver m;
    public boolean n;
    public boolean o;
    public pce t;
    public int u;
    public int v;
    public final List<k97> g = new ArrayList();
    public g h = new g();
    public int p = 0;
    public final boolean q = r19.O();
    public final List<f> r = new ArrayList();
    public final List<e> s = new ArrayList();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements View.OnLayoutChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f7094a = r19.c0("layout_max_count", 10);

        public a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("899df952", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
                return;
            }
            int i9 = this.f7094a;
            this.f7094a = i9 - 1;
            if (i9 <= 0) {
                txj.e(txj.TAG_TIP, "Weex 容器高度的监听超过限制次数。当前限制次数." + this.f7094a);
                DetailWeexContainer.j(DetailWeexContainer.this).removeOnLayoutChangeListener(this);
                return;
            }
            int width = DetailWeexContainer.j(DetailWeexContainer.this).getWidth();
            int height = DetailWeexContainer.j(DetailWeexContainer.this).getHeight();
            DetailWeexContainer.k(DetailWeexContainer.this, width);
            DetailWeexContainer.l(DetailWeexContainer.this, height);
            if (DetailWeexContainer.f(DetailWeexContainer.this) != null) {
                DetailWeexContainer.f(DetailWeexContainer.this).J(width, height);
                if (DetailWeexContainer.f(DetailWeexContainer.this).A()) {
                    txj.e(txj.TAG_TIP, "hasInitWeexInstanceData , Weex 容器高度的监听取消。onLayoutMaxCount:" + this.f7094a + " containerWidth:" + width + " containerHeight:" + height);
                    DetailWeexContainer.j(DetailWeexContainer.this).removeOnLayoutChangeListener(this);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements kpc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.kpc
        public void a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1414cfeb", new Object[]{this, view});
                return;
            }
            DetailWeexContainer.m(DetailWeexContainer.this, view);
            DetailWeexContainer.j(DetailWeexContainer.this).removeAllViews();
            if (view == null) {
                q0j.m(q0j.SCENE_WEEX_CONTAINER, q0j.ERROR_CODE_WEEX_VIEW_NULL, "实例复用的时候view返回的是空的", DetailWeexContainer.n(DetailWeexContainer.this).T());
            }
            DetailWeexContainer.j(DetailWeexContainer.this).addView(view);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c implements kpc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // tb.kpc
        public void a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1414cfeb", new Object[]{this, view});
                return;
            }
            DetailWeexContainer.m(DetailWeexContainer.this, view);
            if (!DetailWeexContainer.o(DetailWeexContainer.this) || !DetailWeexContainer.p(DetailWeexContainer.this)) {
                DetailWeexContainer.j(DetailWeexContainer.this).removeAllViews();
                DetailWeexContainer.j(DetailWeexContainer.this).addView(view);
                return;
            }
            DetailWeexContainer.h(DetailWeexContainer.this).add(new e(view));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class d implements kpc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // tb.kpc
        public void a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1414cfeb", new Object[]{this, view});
                return;
            }
            DetailWeexContainer.m(DetailWeexContainer.this, view);
            if (!DetailWeexContainer.o(DetailWeexContainer.this) || !DetailWeexContainer.p(DetailWeexContainer.this)) {
                DetailWeexContainer.j(DetailWeexContainer.this).removeAllViews();
                DetailWeexContainer.j(DetailWeexContainer.this).addView(view);
                return;
            }
            DetailWeexContainer.h(DetailWeexContainer.this).add(new e(view));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private View f7098a;

        static {
            t2o.a(352321740);
        }

        public e(View view) {
            this.f7098a = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            DetailWeexContainer.j(DetailWeexContainer.this).removeAllViews();
            DetailWeexContainer.j(DetailWeexContainer.this).addView(this.f7098a);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f7099a;
        private Map<String, String> b;
        private JSONObject c;
        private b.a d;

        static {
            t2o.a(352321741);
        }

        public f(String str, Map<String, String> map, JSONObject jSONObject, b.a aVar) {
            this.f7099a = str;
            this.b = map;
            this.c = jSONObject;
            this.d = aVar;
        }

        public static /* synthetic */ b.a a(f fVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b.a) ipChange.ipc$dispatch("3ce15130", new Object[]{fVar});
            }
            return fVar.d;
        }

        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("89c49781", new Object[]{this});
                return;
            }
            b.a aVar = this.d;
            if (aVar != null) {
                aVar.a();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                DetailWeexContainer.this.s(this.f7099a, this.b, this.c, this.d, false);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class g {

        /* renamed from: a  reason: collision with root package name */
        public String f7100a;
        public int b;
        public String c;

        static {
            t2o.a(352321742);
        }
    }

    static {
        t2o.a(352321734);
        t2o.a(352321752);
        try {
            MUSEngine.registerModule("newdetail_message", DetailWeexV2Module.class);
            MUSEngine.registerModule(VideoWeexModule.MODULE_NAME, VideoWeexModule.class);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public DetailWeexContainer(cxj cxjVar, String str, String str2, String str3) {
        G(cxjVar);
        this.i = str;
        this.j = str2;
        this.k = str3;
    }

    public static /* synthetic */ com.taobao.android.detail2.core.framework.base.weex.a f(DetailWeexContainer detailWeexContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.detail2.core.framework.base.weex.a) ipChange.ipc$dispatch("72a3b467", new Object[]{detailWeexContainer});
        }
        return detailWeexContainer.f7092a;
    }

    public static /* synthetic */ g g(DetailWeexContainer detailWeexContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("72f39938", new Object[]{detailWeexContainer});
        }
        return detailWeexContainer.h;
    }

    public static /* synthetic */ List h(DetailWeexContainer detailWeexContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("74ea9f2b", new Object[]{detailWeexContainer});
        }
        return detailWeexContainer.s;
    }

    public static /* synthetic */ cxj i(DetailWeexContainer detailWeexContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cxj) ipChange.ipc$dispatch("f61b3c5e", new Object[]{detailWeexContainer});
        }
        return detailWeexContainer.b;
    }

    public static /* synthetic */ FrameLayout j(DetailWeexContainer detailWeexContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("e3300a51", new Object[]{detailWeexContainer});
        }
        return detailWeexContainer.l;
    }

    public static /* synthetic */ int k(DetailWeexContainer detailWeexContainer, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cee674f1", new Object[]{detailWeexContainer, new Integer(i)})).intValue();
        }
        detailWeexContainer.u = i;
        return i;
    }

    public static /* synthetic */ int l(DetailWeexContainer detailWeexContainer, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("af5fcaf2", new Object[]{detailWeexContainer, new Integer(i)})).intValue();
        }
        detailWeexContainer.v = i;
        return i;
    }

    public static /* synthetic */ void m(DetailWeexContainer detailWeexContainer, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("399a598d", new Object[]{detailWeexContainer, view});
        } else {
            detailWeexContainer.P(view);
        }
    }

    public static /* synthetic */ com.taobao.android.detail2.core.framework.data.global.a n(DetailWeexContainer detailWeexContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.detail2.core.framework.data.global.a) ipChange.ipc$dispatch("e491f0f4", new Object[]{detailWeexContainer});
        }
        return detailWeexContainer.C();
    }

    public static /* synthetic */ boolean o(DetailWeexContainer detailWeexContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2b6f46e7", new Object[]{detailWeexContainer})).booleanValue();
        }
        return detailWeexContainer.n;
    }

    public static /* synthetic */ boolean p(DetailWeexContainer detailWeexContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("962acc6", new Object[]{detailWeexContainer})).booleanValue();
        }
        return detailWeexContainer.y();
    }

    public String B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dad2b94d", new Object[]{this});
        }
        return this.c;
    }

    public final com.taobao.android.detail2.core.framework.data.global.a C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.detail2.core.framework.data.global.a) ipChange.ipc$dispatch("4acc6a70", new Object[]{this});
        }
        return this.b.j();
    }

    public com.taobao.android.detail2.core.framework.base.weex.a D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.detail2.core.framework.base.weex.a) ipChange.ipc$dispatch("9b1b38ce", new Object[]{this});
        }
        return this.f7092a;
    }

    public final byj E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byj) ipChange.ipc$dispatch("75ad75a4", new Object[]{this});
        }
        return C().N();
    }

    public View F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("17b33166", new Object[]{this});
        }
        return this.l;
    }

    public final void G(cxj cxjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edbb5e8", new Object[]{this, cxjVar});
            return;
        }
        this.b = cxjVar;
        this.m = new BroadcastReceiver() { // from class: com.taobao.android.detail2.core.framework.base.weex.DetailWeexContainer.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/framework/base/weex/DetailWeexContainer$1");
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                } else if (intent != null && WXSDKInstance.l0.equals(intent.getAction())) {
                    String stringExtra = intent.getStringExtra("instanceId");
                    if (!TextUtils.isEmpty(stringExtra) && DetailWeexContainer.f(DetailWeexContainer.this) != null && stringExtra.equals(DetailWeexContainer.f(DetailWeexContainer.this).x())) {
                        q0j.m(q0j.SCENE_WEEX_CONTAINER, q0j.ERROR_CODE_WEEX_RELOAD_BROADCAST, "收到weexreload的广播，强制销毁重渲染，instanceId: " + stringExtra + ", itemID: " + DetailWeexContainer.g(DetailWeexContainer.this).f7100a + ", index: " + DetailWeexContainer.g(DetailWeexContainer.this).b + ", containerName: " + DetailWeexContainer.g(DetailWeexContainer.this).c, DetailWeexContainer.i(DetailWeexContainer.this).j().T());
                        DetailWeexContainer.this.A();
                    }
                }
            }
        };
        Activity i = this.b.i();
        if (i != null) {
            i.registerReceiver(this.m, new IntentFilter("INSTANCE_RELOAD"));
        }
    }

    public boolean H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ebe7b932", new Object[]{this})).booleanValue();
        }
        return this.d;
    }

    public final boolean I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("78a8bf79", new Object[]{this})).booleanValue();
        }
        com.taobao.android.detail2.core.framework.base.weex.a aVar = this.f7092a;
        if (aVar != null) {
            return aVar.B();
        }
        return true ^ this.o;
    }

    public void J(ViewStub viewStub) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3782edd", new Object[]{this, viewStub});
        } else if (viewStub != null) {
            if (C().M().c(C().R().x)) {
                ViewGroup viewGroup = (ViewGroup) viewStub.getParent();
                int indexOfChild = viewGroup.indexOfChild(viewStub);
                viewGroup.removeViewAt(indexOfChild);
                ViewGroup.LayoutParams layoutParams = viewStub.getLayoutParams();
                FrameLayout frameLayout = new FrameLayout(this.b.i());
                this.l = frameLayout;
                viewGroup.addView(frameLayout, indexOfChild, layoutParams);
            } else {
                viewStub.setLayoutResource(R.layout.newdetail_weex_container_layout);
                this.l = (FrameLayout) viewStub.inflate();
            }
            if (this.q) {
                R();
            }
        }
    }

    public void K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7caa014", new Object[]{this});
        } else {
            this.n = true;
        }
    }

    public final void L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc6d8894", new Object[]{this});
        } else {
            M(null);
        }
    }

    public final void M(b.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d27bf38", new Object[]{this, aVar});
            return;
        }
        com.taobao.android.detail2.core.framework.base.weex.a aVar2 = this.f7092a;
        if (aVar2 != null) {
            aVar2.t();
        }
        Iterator it = ((ArrayList) this.g).iterator();
        while (it.hasNext()) {
            k97 k97Var = (k97) it.next();
            if (k97Var != null) {
                k97Var.f();
            }
        }
        this.f7092a = new com.taobao.android.detail2.core.framework.base.weex.a(this.b, this.d, new d(), null, this);
        if (this.t != null) {
            txj.e(txj.TAG_RENDER, "reCreateViewContainer时机设置gestureListener成功,index: " + this.h.b + ", itemId: " + this.h.f7100a + ", containerName: " + this.h.c);
            this.f7092a.P(this.t);
        }
        h0();
    }

    public final void O(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f28d544", new Object[]{this, jSONObject});
        } else if (jSONObject != null && this.f7092a != null) {
            this.f = jSONObject;
            if (I()) {
                A();
                return;
            }
            Iterator it = ((ArrayList) this.g).iterator();
            while (it.hasNext()) {
                k97 k97Var = (k97) it.next();
                if (k97Var != null) {
                    k97Var.g(this.f7092a, jSONObject);
                }
            }
            W(this.k, jSONObject);
            txj.e(txj.TAG_RENDER, this.k + "刷新weex数据，当前卡片,index: " + this.h.b + ", itemId: " + this.h.f7100a + ", containerName: " + this.h.c + ", dataMode: " + jSONObject.getString(x3w.n0));
        }
    }

    public final void P(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4643b731", new Object[]{this, view});
        } else if (view != null) {
            view.setTag(1188984821, this.i);
            view.setTag(-1607140204, this.j);
            view.setTag(1882865001, this.b.h());
        }
    }

    public final void Q() {
        int i;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdcc418d", new Object[]{this});
        } else if (this.u > 0 || this.v > 0) {
            FrameLayout frameLayout = this.l;
            if (frameLayout == null) {
                i = 0;
            } else {
                i = frameLayout.getWidth();
            }
            FrameLayout frameLayout2 = this.l;
            if (frameLayout2 != null) {
                i2 = frameLayout2.getHeight();
            }
            com.taobao.android.detail2.core.framework.base.weex.a aVar = this.f7092a;
            if (aVar == null) {
                return;
            }
            if (i <= 0 || i2 <= 0) {
                aVar.J(this.u, this.v);
                txj.e(txj.TAG_TIP, "WeexUseContainerSize: refreshWeexContainerSize mContainerViewWidth:" + this.u + " mContainerViewHeight:" + this.v);
                return;
            }
            aVar.J(i, i2);
            txj.e(txj.TAG_TIP, "WeexUseContainerSize: refreshWeexContainerSize newWidth:" + i + " height:" + i2);
        }
    }

    public final void R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fa45ab", new Object[]{this});
        } else if (this.l != null) {
            a aVar = new a();
            this.u = this.l.getWidth();
            this.v = this.l.getHeight();
            this.l.addOnLayoutChangeListener(aVar);
        }
    }

    public final void S(Map<String, String> map, JSONObject jSONObject) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7808200b", new Object[]{this, map, jSONObject});
            return;
        }
        this.f = jSONObject;
        this.e = map;
        String str2 = this.c;
        if (map != null) {
            Uri.Builder buildUpon = Uri.parse(str2).buildUpon();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry != null) {
                    buildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
                }
            }
            str = buildUpon.toString();
        } else {
            str = str2;
        }
        txj.e(txj.TAG_RENDER, "beforeRenderUrl: " + str + ", currentTime: " + System.currentTimeMillis());
        Iterator it = ((ArrayList) this.g).iterator();
        while (it.hasNext()) {
            k97 k97Var = (k97) it.next();
            if (k97Var != null) {
                k97Var.h(this.f7092a, str, jSONObject);
            }
        }
        this.o = false;
        this.f7092a.K(str2, str, null, jSONObject);
    }

    public final void T(List<? extends Runnable> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("934693e6", new Object[]{this, list});
        } else if (list != null) {
            for (Runnable runnable : list) {
                if (runnable != null) {
                    runnable.run();
                }
            }
            list.clear();
        }
    }

    public void U(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd36bb21", new Object[]{this, jSONObject});
        } else if (this.f7092a != null) {
            txj.e(txj.TAG_RENDER, this.f7092a + "sendevent，向weex容器发送batch消息");
            this.f7092a.M(jSONObject);
        }
    }

    public final void V(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cacd0fb", new Object[]{this, jSONObject});
            return;
        }
        if (!r19.t0()) {
            View renderRoot = this.f7092a.y().getRenderRoot();
            if (renderRoot != null && renderRoot.getTag(-706917923) == null) {
                if (jSONObject != null) {
                    if ((C().B() + jSONObject.getString(x3w.n0)).equals(renderRoot.getTag(-706917923))) {
                        return;
                    }
                }
            } else {
                return;
            }
        } else if (!"true".equals(this.f7092a.y().getTag("hasSendDataWhenNav"))) {
            Object tag = this.f7092a.y().getTag("hasSendDeliverWhenNavNew");
            if (jSONObject != null) {
                if ((C().B() + jSONObject.getString(x3w.n0)).equals(tag)) {
                    txj.e(txj.TAG_RENDER, "sendDataToWeex, hasTagNew return, tag: " + tag);
                    return;
                }
            }
        } else {
            return;
        }
        O(jSONObject);
        this.f7092a.v();
    }

    public void W(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f530a64d", new Object[]{this, str, jSONObject});
        } else if (this.f7092a != null) {
            txj.e(txj.TAG_RENDER, this.f7092a + "sendevent，向weex容器发送消息：" + str);
            this.f7092a.N(str, jSONObject);
        }
    }

    public void X(pce pceVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c815e890", new Object[]{this, pceVar});
            return;
        }
        this.t = pceVar;
        if (this.f7092a != null) {
            txj.e(txj.TAG_RENDER, "调用DetailWeexContainer setGestureEventListener成功,index: " + this.h.b + ", itemId: " + this.h.f7100a + ", containerName: " + this.h.c);
            this.f7092a.P(pceVar);
        }
    }

    public void Y(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58844b21", new Object[]{this, new Integer(i)});
            return;
        }
        FrameLayout frameLayout = this.l;
        if (frameLayout != null) {
            frameLayout.setVisibility(i);
        }
    }

    public void Z(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49b343a2", new Object[]{this, gVar});
        } else if (gVar != null) {
            this.h = gVar;
        }
    }

    @Override // tb.qtk
    public void a(com.taobao.android.detail2.core.framework.base.weex.a aVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ab357c9", new Object[]{this, aVar, str, str2});
            return;
        }
        Iterator it = ((ArrayList) this.g).iterator();
        while (it.hasNext()) {
            k97 k97Var = (k97) it.next();
            if (k97Var != null) {
                k97Var.a(aVar, str, str2);
            }
        }
        d0(aVar, str, str2, q0j.ERROR_CODE_WEEX_RENDER_EXCEPTION);
    }

    public void a0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a5aa2c8", new Object[]{this, new Integer(i)});
            return;
        }
        FrameLayout frameLayout = this.l;
        if (frameLayout != null) {
            frameLayout.setVisibility(i);
        }
    }

    @Override // tb.qtk
    public void b(com.taobao.android.detail2.core.framework.base.weex.a aVar, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609ae9fe", new Object[]{this, aVar, new Integer(i), new Integer(i2)});
            return;
        }
        Iterator it = ((ArrayList) this.g).iterator();
        while (it.hasNext()) {
            k97 k97Var = (k97) it.next();
            if (k97Var != null) {
                k97Var.b(aVar, i, i2);
            }
        }
    }

    public void b0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
            return;
        }
        com.taobao.android.detail2.core.framework.base.weex.a aVar = this.f7092a;
        if (aVar != null) {
            aVar.H();
        }
    }

    public void c0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
            return;
        }
        com.taobao.android.detail2.core.framework.base.weex.a aVar = this.f7092a;
        if (aVar != null) {
            aVar.I();
        }
    }

    @Override // tb.qtk
    public void d(com.taobao.android.detail2.core.framework.base.weex.a aVar, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6430871", new Object[]{this, aVar, view});
            return;
        }
        Iterator it = ((ArrayList) this.g).iterator();
        while (it.hasNext()) {
            k97 k97Var = (k97) it.next();
            if (k97Var != null) {
                k97Var.d(aVar, view);
            }
        }
    }

    public final void d0(com.taobao.android.detail2.core.framework.base.weex.a aVar, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4850eea0", new Object[]{this, aVar, str, str2, str3});
            return;
        }
        JSONObject t = t(aVar);
        t.put("weexErrorCode", (Object) str);
        t.put("weexErrorMsg", (Object) str2);
        q0j.m(q0j.SCENE_WEEX_CONTAINER, str3, "weex渲染失败: " + t.toJSONString(), C().T());
    }

    @Override // tb.qtk
    public void e(com.taobao.android.detail2.core.framework.base.weex.a aVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f7accc7", new Object[]{this, aVar, str, str2});
            return;
        }
        Iterator it = ((ArrayList) this.g).iterator();
        while (it.hasNext()) {
            k97 k97Var = (k97) it.next();
            if (k97Var != null) {
                k97Var.e(aVar, str, str2);
            }
        }
        d0(aVar, str, str2, q0j.ERROR_CODE_WEEX_RENDER_FAILED);
    }

    public boolean g0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f714dca4", new Object[]{this})).booleanValue();
        }
        com.taobao.android.detail2.core.framework.base.weex.a aVar = this.f7092a;
        if (aVar != null) {
            return aVar.S();
        }
        return false;
    }

    public final void h0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b123a173", new Object[]{this});
            return;
        }
        HashMap hashMap = new HashMap();
        String w = this.f7092a.w();
        if (!TextUtils.isEmpty(w)) {
            hashMap.put("mPageName", w);
        }
        hashMap.put("isWeexV2", Boolean.valueOf(this.f7092a.D()));
        kr0.e().h("new_detail", hashMap);
    }

    public void q(k97 k97Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3032e4d4", new Object[]{this, k97Var});
        } else {
            ((ArrayList) this.g).add(k97Var);
        }
    }

    public void r(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6567a66", new Object[]{this, str});
        } else if (this.f7092a != null && "foreground".equals(str)) {
            this.f7092a.G();
        }
    }

    public void s(String str, Map<String, String> map, JSONObject jSONObject, b.a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ba8606b", new Object[]{this, str, map, jSONObject, aVar, new Boolean(z)});
        } else if (this.n && !jxh.d(str)) {
            txj.e(txj.TAG_RENDER, "DetailWeexContainer binddata mNeedPendingRender为true，延迟渲染任务,index: " + this.h.b + ", itemId: " + this.h.f7100a + ", containerName: " + this.h.c);
            qyj.a("bindData_is_weex_v1", str);
        } else if (TextUtils.isEmpty(str)) {
            if (aVar != null) {
                txj.e(txj.TAG_RENDER, "DetailWeexContainer binddata url 为空，销毁weexInstanceWrapper, itemid: " + this.h.f7100a + ", index: " + this.h.b + ", containerName: " + this.h.c);
                aVar.a();
            }
            q0j.m(q0j.SCENE_WEEX_CONTAINER, q0j.ERROR_CODE_WEEX_URL_EMPTY, "weex下发url为空, itemId: " + this.h.f7100a + ", index: " + this.h.b + ", containerName: " + this.h.c, C().T());
            Iterator it = ((ArrayList) this.g).iterator();
            while (it.hasNext()) {
                k97 k97Var = (k97) it.next();
                if (k97Var != null) {
                    k97Var.i(this.f7092a, ContainerError.WEEX_URL_EMPTY, "weex url为空");
                }
            }
        } else if (this.f7092a == null || TextUtils.isEmpty(this.c) || !this.c.equals(str)) {
            if (!str.equals(this.c) && !TextUtils.isEmpty(this.c)) {
                q0j.m(q0j.SCENE_WEEX_CONTAINER, q0j.ERROR_CODE_WEEX_URL_CHANGE, "weex下发url不一致, beforeUrl: " + this.c + ", afterUrl: " + str + ", itemid: " + this.h.f7100a + ", index: " + this.h.b + ", containerName: " + this.h.c, C().T());
                Iterator it2 = ((ArrayList) this.g).iterator();
                while (it2.hasNext()) {
                    k97 k97Var2 = (k97) it2.next();
                    if (k97Var2 != null) {
                        com.taobao.android.detail2.core.framework.base.weex.a aVar2 = this.f7092a;
                        ContainerError containerError = ContainerError.WEEX_URL_INCONSISTENT;
                        k97Var2.i(aVar2, containerError, "weex url不一致，beforeUrl: " + this.c + ", afterUrl: " + str);
                    }
                }
            }
            this.c = str;
            f0(str);
            if (r19.G0() && aVar != null && aVar.f7113a != null) {
                z(aVar);
                V(jSONObject);
            } else if (!u(this.d, aVar)) {
                if (aVar != null) {
                    txj.e(txj.TAG_RENDER, "DetailWeexContainer weex版本与缓存版本不一致，销毁weexInstanceWrapper, itemId: " + this.h.f7100a + ", index: " + this.h.b + ", containerName: " + this.h.c);
                    aVar.a();
                }
                if (r19.R0()) {
                    N(map, jSONObject, null, z);
                    return;
                }
                qyj.a("weex_sync_delete_code", "hitIndependentV2AsyncAll-reCreateViewContainer error, sjs:" + r19.Y());
                L();
                S(map, jSONObject);
            } else {
                z(aVar);
                V(jSONObject);
            }
        } else {
            if (aVar != null) {
                txj.e(txj.TAG_RENDER, "DetailWeexContainer weex版本与缓存不一致，销毁InstanceWrapper, itemId:" + this.h.f7100a + ", index: " + this.h.b + ", containerName: " + this.h.c);
                aVar.a();
            }
            O(jSONObject);
        }
    }

    public final JSONObject t(com.taobao.android.detail2.core.framework.base.weex.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("565071c2", new Object[]{this, aVar});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isWeexV2", (Object) Boolean.valueOf(aVar.D()));
        jSONObject.put("weexUrl", (Object) aVar.w());
        jSONObject.put("itemId", (Object) this.h.f7100a);
        jSONObject.put("containerName", (Object) this.h.c);
        jSONObject.put("index", (Object) Integer.valueOf(this.h.b));
        return jSONObject;
    }

    public final boolean u(boolean z, b.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ae0217c5", new Object[]{this, new Boolean(z), aVar})).booleanValue();
        }
        if (aVar == null || !z || aVar.f7113a == null) {
            return false;
        }
        return true;
    }

    public boolean v(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("deb54994", new Object[]{this, str})).booleanValue();
        }
        if (this.f7092a != null && !TextUtils.isEmpty(this.c) && this.c.equals(str)) {
            return true;
        }
        return false;
    }

    public void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        this.c = null;
        if (this.f7092a != null) {
            txj.e(txj.TAG_RENDER, "DetailWeexContainer destroy: " + this.f7092a);
            this.f7092a.E();
        }
        Activity i = this.b.i();
        try {
            BroadcastReceiver broadcastReceiver = this.m;
            if (!(broadcastReceiver == null || i == null)) {
                i.unregisterReceiver(broadcastReceiver);
            }
        } catch (Throwable th) {
            txj.e(txj.TAG_RENDER, th.toString());
        }
        Iterator it = ((ArrayList) this.r).iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            if (fVar != null) {
                txj.e(txj.TAG_RENDER, "PendingWeexRenderRunnable destroy: " + f.a(fVar));
                fVar.b();
            }
        }
        ((ArrayList) this.r).clear();
        ((ArrayList) this.g).clear();
    }

    public void x(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cd9d214", new Object[]{this, str});
        } else if (this.f7092a == null || !"background".equals(str)) {
        } else {
            if (E().w()) {
                txj.e(txj.TAG_RENDER, "onPause新的weex生命周期调用");
                this.f7092a.F();
                return;
            }
            this.f7092a.F();
            this.f7092a.I();
        }
    }

    public final boolean y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eb73e652", new Object[]{this})).booleanValue();
        }
        return this.d;
    }

    public final void z(b.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b100f2d", new Object[]{this, aVar});
            return;
        }
        this.o = true;
        com.taobao.android.detail2.core.framework.base.weex.a aVar2 = this.f7092a;
        if (aVar2 != null) {
            aVar2.t();
        }
        this.f7092a = new com.taobao.android.detail2.core.framework.base.weex.a(this.b, this.d, new b(), aVar, this);
        Q();
        if (this.t != null) {
            txj.e(txj.TAG_RENDER, "fillInstance时机设置gestureListener成功, itemId: " + this.h.f7100a + ", index: " + this.h.b + ", containerName: " + this.h.c);
            this.f7092a.P(this.t);
        }
        if (this.d) {
            nbq.d("newDetail", wwj.TINCT_LOAD_OPT, wwj.TINCT_LOAD_OPT_WEEX_V2_KEEP_LIVE, "default", true);
        } else {
            nbq.d("newDetail", wwj.TINCT_LOAD_OPT, wwj.TINCT_LOAD_OPT_WEEX_KEEP_LIVE, "default", true);
        }
    }

    public void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7528eeb", new Object[]{this});
        } else if (this.b.i() == null) {
            q0j.m("main", q0j.ERROR_CODE_COMMON_CONTEXT_NULL, "上下文为空，forceReload停止执行", C().T());
        } else if (this.p <= 3) {
            L();
            S(this.e, this.f);
            this.p++;
            if (this.h != null) {
                txj.e(txj.TAG_RENDER, "触发了重新渲染, itemId: " + this.h.f7100a + ", index: " + this.h.b);
                return;
            }
            txj.e(txj.TAG_RENDER, "触发了重新渲染");
        }
    }

    @Override // tb.qtk
    public void c(com.taobao.android.detail2.core.framework.base.weex.a aVar, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efc9eb57", new Object[]{this, aVar, new Integer(i), new Integer(i2)});
            return;
        }
        txj.e(txj.TAG_RENDER, "onWeexViewRenderSuccess" + aVar.w() + ", instanceID: " + aVar.x());
        this.o = true;
        Iterator it = ((ArrayList) this.g).iterator();
        while (it.hasNext()) {
            k97 k97Var = (k97) it.next();
            if (k97Var != null) {
                k97Var.c(aVar, i, i2);
            }
        }
    }

    public void e0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6b976f5", new Object[]{this});
        } else if (this.n) {
            this.n = false;
            if (y()) {
                T(this.s);
            } else {
                qyj.a("triggerRender_is_weex_v1", null);
            }
        }
    }

    public final void f0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bb8011a", new Object[]{this, str});
        } else if (jxh.d(str)) {
            this.d = true;
            nbq.d("newDetail", wwj.TINCT_LOAD_OPT, wwj.TINCT_LOAD_OPT_WEEX_V2, "default", true);
        } else {
            qyj.a("updateWeexV2Mode_is_weex_v1", str);
            this.d = false;
        }
    }

    public final void N(Map<String, String> map, JSONObject jSONObject, b.a aVar, boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76a872fc", new Object[]{this, map, jSONObject, aVar, new Boolean(z)});
            return;
        }
        String str2 = this.c;
        if (map != null) {
            Uri.Builder buildUpon = Uri.parse(str2).buildUpon();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry != null) {
                    buildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
                }
            }
            str = buildUpon.toString();
        } else {
            str = str2;
        }
        com.taobao.android.detail2.core.framework.base.weex.a aVar2 = this.f7092a;
        if (aVar2 != null) {
            aVar2.t();
        }
        Iterator it = ((ArrayList) this.g).iterator();
        while (it.hasNext()) {
            k97 k97Var = (k97) it.next();
            if (k97Var != null) {
                k97Var.f();
            }
        }
        this.f7092a = new com.taobao.android.detail2.core.framework.base.weex.a(this.b, this.d, new c(), aVar, this, str, z, jSONObject);
        Q();
        if (this.t != null) {
            txj.e(txj.TAG_RENDER, "reCreateViewContainerAndRenderUrlForAsync时机设置gestureListener成功,index: " + this.h.b + ", itemId: " + this.h.f7100a + ", containerName: " + this.h.c);
            this.f7092a.P(this.t);
        }
        h0();
        txj.e(txj.TAG_RENDER, "beforeRenderUrl: " + str + ", currentTime: " + System.currentTimeMillis());
        Iterator it2 = ((ArrayList) this.g).iterator();
        while (it2.hasNext()) {
            k97 k97Var2 = (k97) it2.next();
            if (k97Var2 != null) {
                k97Var2.h(this.f7092a, str, jSONObject);
            }
        }
        this.o = false;
        this.f7092a.L(str2, str, null, jSONObject);
    }
}
