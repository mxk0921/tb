package com.taobao.android.detail2.core.framework.base.weex;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.base.weex.b;
import com.taobao.android.weex.WeexInstance;
import com.taobao.android.weex.WeexInstanceImpl;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.MUSInstanceConfig;
import java.util.HashMap;
import java.util.Map;
import tb.b6x;
import tb.cxj;
import tb.gxj;
import tb.i0d;
import tb.kpc;
import tb.kq2;
import tb.mqj;
import tb.npc;
import tb.oj7;
import tb.pce;
import tb.q0j;
import tb.qtk;
import tb.qyj;
import tb.r19;
import tb.syj;
import tb.t2o;
import tb.tvh;
import tb.txj;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final int n = 1;
    public static final int o = 2;
    public static final int p = 3;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f7104a;
    public com.taobao.android.weex_framework.a b;
    public final qtk c;
    public boolean d;
    public int e;
    public Runnable f;
    public boolean g;
    public boolean h;
    public final boolean i;
    public int j;
    public int k;
    public boolean l;
    public pce m;
    public final cxj q;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.android.detail2.core.framework.base.weex.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class RunnableC0389a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f7105a;
        public final /* synthetic */ kpc b;
        public final /* synthetic */ b.a c;
        public final /* synthetic */ String d;
        public final /* synthetic */ JSONObject e;

        public RunnableC0389a(Context context, kpc kpcVar, b.a aVar, String str, JSONObject jSONObject) {
            this.f7105a = context;
            this.b = kpcVar;
            this.c = aVar;
            this.d = str;
            this.e = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                a.a(a.this, this.f7105a, this.b, this.c, this.d, this.e);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f7106a;
        public final /* synthetic */ kpc b;
        public final /* synthetic */ b.a c;
        public final /* synthetic */ String d;
        public final /* synthetic */ JSONObject e;

        public b(Context context, kpc kpcVar, b.a aVar, String str, JSONObject jSONObject) {
            this.f7106a = context;
            this.b = kpcVar;
            this.c = aVar;
            this.d = str;
            this.e = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                a.b(a.this, this.f7106a, this.b, this.c, this.d, this.e);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c implements b6x {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ i0d f7107a;
        public final /* synthetic */ Context b;
        public final /* synthetic */ Context c;
        public final /* synthetic */ kpc d;
        public final /* synthetic */ b.a e;
        public final /* synthetic */ String f;

        public c(i0d i0dVar, Context context, Context context2, kpc kpcVar, b.a aVar, String str) {
            this.f7107a = i0dVar;
            this.b = context;
            this.c = context2;
            this.d = kpcVar;
            this.e = aVar;
            this.f = str;
        }

        @Override // tb.b6x
        public void a(b6x.a aVar) {
            tvh tvhVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("17d54df9", new Object[]{this, aVar});
                return;
            }
            i0d i0dVar = this.f7107a;
            if (i0dVar != null && i0dVar.O1()) {
                aVar.destroy();
            } else if (a.g(a.this)) {
                aVar.destroy();
            } else {
                WeexInstance b = aVar.b(this.b);
                if (b != null) {
                    tvhVar = ((WeexInstanceImpl) b).getAdapterMUSInstance();
                } else {
                    tvhVar = null;
                }
                if (tvhVar != null) {
                    a.h(a.this, this.c, this.d, this.e, tvhVar, this.f);
                    a.j(a.this, tvhVar);
                    if (a.k(a.this) != null) {
                        txj.e(txj.TAG_RENDER, "onInstanceCreatedInMain时机设置mGestureListener成功");
                        a.i(a.this).setGestureEventListener(a.k(a.this));
                    }
                    a.l(a.this, true);
                    Runnable m = a.m(a.this);
                    a.n(a.this, null);
                    if (m != null) {
                        m.run();
                    }
                } else if (gxj.b()) {
                    throw new RuntimeException("mus 为空，无法获取到有效的 weex 实例。");
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class d implements kpc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ kpc f7108a;

        public d(kpc kpcVar) {
            this.f7108a = kpcVar;
        }

        @Override // tb.kpc
        public void a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1414cfeb", new Object[]{this, view});
                return;
            }
            kpc kpcVar = this.f7108a;
            if (kpcVar != null) {
                kpcVar.a(view);
            }
            if (a.o(a.this) != null) {
                a.o(a.this).d(a.this, view);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class e implements npc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
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
            } else if (a.o(a.this) != null) {
                a.o(a.this).a(a.this, String.valueOf(i), str);
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
            }
        }

        @Override // tb.npc
        public void onRefreshSuccess(com.taobao.android.weex_framework.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("963c382f", new Object[]{this, aVar});
            } else if (a.o(a.this) != null) {
                a.o(a.this).b(a.this, 0, 0);
            }
        }

        @Override // tb.npc
        public void onRenderFailed(com.taobao.android.weex_framework.a aVar, int i, String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cc0cbe2b", new Object[]{this, aVar, new Integer(i), str, new Boolean(z)});
                return;
            }
            a.p(a.this, a.d());
            if (a.o(a.this) != null) {
                a.o(a.this).e(a.this, String.valueOf(i), str);
            }
        }

        @Override // tb.npc
        public void onRenderSuccess(com.taobao.android.weex_framework.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2b2aeb48", new Object[]{this, aVar});
                return;
            }
            a.p(a.this, a.c());
            if (a.o(a.this) != null) {
                a.o(a.this).c(a.this, 0, 0);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class f implements kpc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ kpc f7110a;

        public f(kpc kpcVar) {
            this.f7110a = kpcVar;
        }

        @Override // tb.kpc
        public void a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1414cfeb", new Object[]{this, view});
                return;
            }
            kpc kpcVar = this.f7110a;
            if (kpcVar != null) {
                kpcVar.a(view);
            }
            if (a.o(a.this) != null) {
                a.o(a.this).d(a.this, view);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class g implements npc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g() {
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
            } else if (a.o(a.this) != null) {
                a.o(a.this).a(a.this, String.valueOf(i), str);
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
            }
        }

        @Override // tb.npc
        public void onRefreshSuccess(com.taobao.android.weex_framework.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("963c382f", new Object[]{this, aVar});
            } else if (a.o(a.this) != null) {
                a.o(a.this).b(a.this, 0, 0);
            }
        }

        @Override // tb.npc
        public void onRenderFailed(com.taobao.android.weex_framework.a aVar, int i, String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cc0cbe2b", new Object[]{this, aVar, new Integer(i), str, new Boolean(z)});
                return;
            }
            a.p(a.this, a.d());
            if (a.o(a.this) != null) {
                a.o(a.this).e(a.this, String.valueOf(i), str);
            }
        }

        @Override // tb.npc
        public void onRenderSuccess(com.taobao.android.weex_framework.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2b2aeb48", new Object[]{this, aVar});
                return;
            }
            a.p(a.this, a.c());
            if (a.o(a.this) != null) {
                a.o(a.this).c(a.this, 0, 0);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class h implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f7112a;
        public final /* synthetic */ JSONObject b;
        public final /* synthetic */ Map c;

        public h(String str, JSONObject jSONObject, Map map) {
            this.f7112a = str;
            this.b = jSONObject;
            this.c = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!a.e(a.this)) {
                qyj.a("renderByUrl_is_weex_v1", this.f7112a);
            } else if (a.i(a.this) != null) {
                a.i(a.this).initWithURL(Uri.parse(this.f7112a));
                a.i(a.this).render(this.b, this.c);
                a.p(a.this, a.f());
            }
        }
    }

    static {
        t2o.a(352321723);
    }

    public a(cxj cxjVar, boolean z, kpc kpcVar, b.a aVar, qtk qtkVar) {
        this(cxjVar, z, kpcVar, aVar, qtkVar, null, false, null);
    }

    public static /* synthetic */ void a(a aVar, Context context, kpc kpcVar, b.a aVar2, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8950618a", new Object[]{aVar, context, kpcVar, aVar2, str, jSONObject});
        } else {
            aVar.R(context, kpcVar, aVar2, str, jSONObject);
        }
    }

    public static /* synthetic */ void b(a aVar, Context context, kpc kpcVar, b.a aVar2, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d22fd10b", new Object[]{aVar, context, kpcVar, aVar2, str, jSONObject});
        } else {
            aVar.u(context, kpcVar, aVar2, str, jSONObject);
        }
    }

    public static /* synthetic */ int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("45eaf499", new Object[0])).intValue();
        }
        return 0;
    }

    public static /* synthetic */ int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7ad12fda", new Object[0])).intValue();
        }
        return n;
    }

    public static /* synthetic */ boolean e(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e3ca4f28", new Object[]{aVar})).booleanValue();
        }
        return aVar.f7104a;
    }

    public static /* synthetic */ int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e49da65c", new Object[0])).intValue();
        }
        return p;
    }

    public static /* synthetic */ boolean g(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ea1c07b7", new Object[]{aVar})).booleanValue();
        }
        return aVar.h;
    }

    public static /* synthetic */ void h(a aVar, Context context, kpc kpcVar, b.a aVar2, MUSDKInstance mUSDKInstance, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffd2b5e7", new Object[]{aVar, context, kpcVar, aVar2, mUSDKInstance, str});
        } else {
            aVar.q(context, kpcVar, aVar2, mUSDKInstance, str);
        }
    }

    public static /* synthetic */ com.taobao.android.weex_framework.a i(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.weex_framework.a) ipChange.ipc$dispatch("41778a3e", new Object[]{aVar});
        }
        return aVar.b;
    }

    public static /* synthetic */ com.taobao.android.weex_framework.a j(a aVar, com.taobao.android.weex_framework.a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.weex_framework.a) ipChange.ipc$dispatch("3088675b", new Object[]{aVar, aVar2});
        }
        aVar.b = aVar2;
        return aVar2;
    }

    public static /* synthetic */ pce k(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pce) ipChange.ipc$dispatch("998cdf7e", new Object[]{aVar});
        }
        return aVar.m;
    }

    public static /* synthetic */ boolean l(a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b847b48b", new Object[]{aVar, new Boolean(z)})).booleanValue();
        }
        aVar.g = z;
        return z;
    }

    public static /* synthetic */ Runnable m(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("53049c86", new Object[]{aVar});
        }
        return aVar.f;
    }

    public static /* synthetic */ Runnable n(a aVar, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("5705a2ca", new Object[]{aVar, runnable});
        }
        aVar.f = runnable;
        return runnable;
    }

    public static /* synthetic */ qtk o(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qtk) ipChange.ipc$dispatch("85dde6df", new Object[]{aVar});
        }
        return aVar.c;
    }

    public static /* synthetic */ int p(a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("aebb01ec", new Object[]{aVar, new Integer(i)})).intValue();
        }
        aVar.e = i;
        return i;
    }

    public boolean A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63f1bb1f", new Object[]{this})).booleanValue();
        }
        return this.l;
    }

    public boolean B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("80ee6980", new Object[]{this})).booleanValue();
        }
        if (!this.f7104a || this.e != n) {
            return false;
        }
        return true;
    }

    public boolean C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7875bfc1", new Object[]{this})).booleanValue();
        }
        return this.d;
    }

    public boolean D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ebe7b932", new Object[]{this})).booleanValue();
        }
        return this.f7104a;
    }

    public void E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fef57493", new Object[]{this});
        } else if (this.f7104a && this.b != null) {
            txj.e(txj.TAG_RENDER, "AliDetailWeexInstance onActivityDestroy: " + this.b);
            this.b.destroy();
        }
    }

    public void F() {
        com.taobao.android.weex_framework.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64e6b90f", new Object[]{this});
        } else if (this.f7104a && (aVar = this.b) != null) {
            aVar.onActivityPause();
        }
    }

    public void G() {
        com.taobao.android.weex_framework.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c4fa6e2", new Object[]{this});
        } else if (this.f7104a && (aVar = this.b) != null) {
            aVar.onActivityResume();
        }
    }

    public void H() {
        com.taobao.android.weex_framework.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b48c417b", new Object[]{this});
        } else if (this.f7104a && (aVar = this.b) != null) {
            aVar.onActivityStart();
        }
    }

    public void I() {
        com.taobao.android.weex_framework.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3ac47b7", new Object[]{this});
        } else if (this.f7104a && (aVar = this.b) != null) {
            aVar.onActivityStop();
        }
    }

    public void J(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c84e6a8", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.j = i;
        this.k = i2;
    }

    public void K(String str, String str2, Map<String, Object> map, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19e177c8", new Object[]{this, str, str2, map, jSONObject});
        } else if (this.f7104a) {
            com.taobao.android.weex_framework.a aVar = this.b;
            if (aVar != null) {
                aVar.initWithURL(Uri.parse(str2));
                this.b.render(jSONObject, map);
                this.e = p;
            }
        } else {
            qyj.a("renderByUrl_is_weex_v1", str2);
        }
    }

    public void L(String str, String str2, Map<String, Object> map, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9500a420", new Object[]{this, str, str2, map, jSONObject});
        } else if (!this.g) {
            this.f = new h(str2, jSONObject, map);
        } else if (this.f7104a) {
            com.taobao.android.weex_framework.a aVar = this.b;
            if (aVar != null) {
                aVar.initWithURL(Uri.parse(str2));
                this.b.render(jSONObject, map);
                this.e = p;
            }
        } else {
            qyj.a("renderByUrl_is_weex_v1", str2);
        }
    }

    public void O(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea6c0c1c", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (this.f7104a && this.b != null) {
            ((MUSDKInstance) this.b).setConstrainedSize(new kq2(i, i2));
        }
    }

    public void P(pce pceVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c815e890", new Object[]{this, pceVar});
            return;
        }
        this.m = pceVar;
        if (this.f7104a && this.b != null) {
            txj.e(txj.TAG_RENDER, "调用AliDetailWeexInstance setGestureEventListener成功");
            this.b.setGestureEventListener(pceVar);
        }
    }

    public void Q(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f49fca54", new Object[]{this, new Boolean(z)});
        } else {
            this.d = z;
        }
    }

    public final void R(Context context, kpc kpcVar, b.a aVar, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ec1f8c4", new Object[]{this, context, kpcVar, aVar, str, jSONObject});
        } else if (TextUtils.isEmpty(str)) {
            q0j.s("new_detail异常", q0j.SCENE_WEEX_CONTAINER, q0j.ERROR_CODE_INSTANCE_NO_MAIN_NULL, "WeexInstance阶段预异步创建Weex时无有效WeexUrl", this.q.j().T());
        } else {
            mqj.k(new b(context, kpcVar, aVar, str, jSONObject));
        }
    }

    public final void q(Context context, kpc kpcVar, b.a aVar, MUSDKInstance mUSDKInstance, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26645a0", new Object[]{this, context, kpcVar, aVar, mUSDKInstance, str});
            return;
        }
        MUSInstanceConfig mUSInstanceConfig = new MUSInstanceConfig();
        if (oj7.i()) {
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put(oj7.KEY_MEMORY_OPT_LEVEL, "1");
            mUSInstanceConfig.s(hashMap);
        }
        mUSInstanceConfig.B(true);
        mUSInstanceConfig.t(MUSInstanceConfig.MUSRenderType.MUSRenderTypeUnicorn);
        mUSInstanceConfig.v(false);
        mUSInstanceConfig.y(MUSInstanceConfig.RenderMode.texture);
        d dVar = new d(kpcVar);
        this.b = mUSDKInstance;
        if (str == null) {
            str = "new_detail";
        }
        mUSInstanceConfig.p(str);
        mUSDKInstance.registerRenderListener(new e());
        dVar.a(mUSDKInstance.getRenderRoot());
    }

    public final void r(Context context, kpc kpcVar, b.a aVar) {
        MUSDKInstance mUSDKInstance;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e67b39c", new Object[]{this, context, kpcVar, aVar});
        } else if (aVar == null || (mUSDKInstance = aVar.f7113a) == null) {
            MUSInstanceConfig mUSInstanceConfig = new MUSInstanceConfig();
            if (oj7.i()) {
                HashMap<String, String> hashMap = new HashMap<>();
                hashMap.put(oj7.KEY_MEMORY_OPT_LEVEL, "1");
                mUSInstanceConfig.s(hashMap);
            }
            mUSInstanceConfig.B(true);
            mUSInstanceConfig.t(MUSInstanceConfig.MUSRenderType.MUSRenderTypeUnicorn);
            mUSInstanceConfig.v(false);
            mUSInstanceConfig.y(MUSInstanceConfig.RenderMode.texture);
            mUSInstanceConfig.u(new f(kpcVar));
            mUSInstanceConfig.p("new_detail");
            this.b = com.taobao.android.weex_framework.b.f().c(context, mUSInstanceConfig);
            if (this.m != null) {
                txj.e(txj.TAG_RENDER, "createWeexV2Instance时机设置mGestureListener成功");
                this.b.setGestureEventListener(this.m);
            }
            this.b.registerRenderListener(new g());
        } else {
            this.e = 0;
            this.b = mUSDKInstance;
            if (this.m != null) {
                txj.e(txj.TAG_RENDER, "fill instance createWeexV2Instance时机设置mGestureListener成功");
                this.b.setGestureEventListener(this.m);
            }
            if (kpcVar != null) {
                kpcVar.a(this.b.getRenderRoot());
            }
            qtk qtkVar = this.c;
            if (qtkVar != null) {
                qtkVar.d(this, this.b.getRenderRoot());
            }
        }
    }

    public final void s(Context context, kpc kpcVar, b.a aVar, String str, JSONObject jSONObject) {
        MUSDKInstance mUSDKInstance;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96430697", new Object[]{this, context, kpcVar, aVar, str, jSONObject});
        } else if (aVar != null && (mUSDKInstance = aVar.f7113a) != null) {
            this.e = 0;
            this.b = mUSDKInstance;
            if (this.m != null) {
                txj.e(txj.TAG_RENDER, "fill instance createWeexV2InstanceForAsync时机设置mGestureListener成功");
                this.b.setGestureEventListener(this.m);
            }
            if (kpcVar != null) {
                kpcVar.a(this.b.getRenderRoot());
            }
            qtk qtkVar = this.c;
            if (qtkVar != null) {
                qtkVar.d(this, this.b.getRenderRoot());
            }
        } else if (this.i) {
            r19.d0().postDelayed(new RunnableC0389a(context, kpcVar, aVar, str, jSONObject), r19.h0());
        } else {
            R(context, kpcVar, aVar, str, jSONObject);
        }
    }

    public void t() {
        com.taobao.android.weex_framework.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        this.h = true;
        if (this.f7104a && (aVar = this.b) != null) {
            aVar.destroy();
        }
    }

    public final void u(Context context, kpc kpcVar, b.a aVar, String str, JSONObject jSONObject) {
        i0d i0dVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fc8fa39", new Object[]{this, context, kpcVar, aVar, str, jSONObject});
            return;
        }
        if (context instanceof i0d) {
            i0dVar = (i0d) context;
        } else {
            i0dVar = null;
        }
        if (i0dVar == null || !i0dVar.O1()) {
            syj.m(context, str, new c(i0dVar, context, context, kpcVar, aVar, str), jSONObject, this.j, this.k);
            this.l = true;
        }
    }

    public void v() {
        com.taobao.android.weex_framework.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6556496", new Object[]{this});
        } else if (this.f7104a && (aVar = this.b) != null) {
            ((MUSDKInstance) aVar).forceBeginFrame();
        }
    }

    public String w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dee20482", new Object[]{this});
        }
        if (this.f7104a) {
            com.taobao.android.weex_framework.a aVar = this.b;
            if (aVar instanceof MUSDKInstance) {
                return ((MUSDKInstance) aVar).getInstanceEnv("bundleUrl");
            }
        }
        return "";
    }

    public String x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5c00da33", new Object[]{this});
        }
        if (this.f7104a) {
            com.taobao.android.weex_framework.a aVar = this.b;
            if (aVar == null) {
                return "-1";
            }
            return String.valueOf(aVar.getInstanceId());
        }
        qyj.a("getInstanceId_is_weex_v1", null);
        return "-1";
    }

    public com.taobao.android.weex_framework.a y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.weex_framework.a) ipChange.ipc$dispatch("6514221e", new Object[]{this});
        }
        return this.b;
    }

    public HashMap<String, String> z() {
        com.taobao.android.weex_framework.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("2afa2f2", new Object[]{this});
        }
        if (!this.f7104a || (aVar = this.b) == null) {
            return null;
        }
        return ((MUSDKInstance) aVar).getPerformanceInfo();
    }

    public a(cxj cxjVar, boolean z, kpc kpcVar, b.a aVar, qtk qtkVar, String str, boolean z2, JSONObject jSONObject) {
        this.d = true;
        this.e = o;
        this.f = null;
        this.g = false;
        this.h = false;
        this.q = cxjVar;
        this.i = z2;
        this.c = qtkVar;
        this.f7104a = z;
        if (!z) {
            qyj.a("Instance_Constructor_is_weex_v1", null);
        } else if (r19.R0()) {
            s(cxjVar.i(), kpcVar, aVar, str, jSONObject);
        } else {
            qyj.a("weex_sync_delete_code", "hitIndependentV2AsyncAll-createWeexV2Instance sjs:" + r19.Y());
            r(cxjVar.i(), kpcVar, aVar);
        }
    }

    public void M(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd36bb21", new Object[]{this, jSONObject});
        } else if (!this.f7104a) {
            qyj.a("sendBatchEvent_is_weex_v1", null);
        } else if (this.b != null) {
            txj.e(txj.TAG_RENDER, this.b + "sendBatchEvent");
            this.b.fireEvent(2, "newdetailcallback", jSONObject);
        }
    }

    public void N(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f530a64d", new Object[]{this, str, jSONObject});
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(str, (Object) jSONObject);
        if (!this.f7104a) {
            qyj.a("sendEvent_is_weex_v1", null);
        } else if (this.b != null) {
            txj.e(txj.TAG_RENDER, this.b + "sendEvent: " + str);
            this.b.fireEvent(2, "newdetailcallback", jSONObject2);
        }
    }

    public boolean S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f714dca4", new Object[]{this})).booleanValue();
        }
        try {
            return ((tvh) this.b).j().isBackground();
        } catch (Exception e2) {
            txj.f(txj.TAG_TIP, "weex isBackground 判断失败", e2);
            return false;
        }
    }
}
