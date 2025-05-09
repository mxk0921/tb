package com.taobao.mytaobao.basement.weex;

import android.app.Activity;
import android.view.View;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.alibaba.fastjson.JSONObject;
import com.alipay.sdk.sys.BizContext;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexErrorType;
import com.taobao.android.weex.WeexInstance;
import com.taobao.android.weex.WeexInstanceMode;
import com.taobao.android.weex.WeexRenderType;
import com.taobao.android.weex.config.WeexInstanceConfig;
import com.taobao.android.weex.config.WeexUnicornConfig;
import com.taobao.tao.Globals;
import com.taobao.tao.log.TLog;
import com.taobao.tao.util.DensityUtil;
import com.taobao.tao.util.SystemBarDecorator;
import com.taobao.taobao.R;
import kotlin.Metadata;
import kotlin.TypeCastException;
import tb.b6x;
import tb.ckf;
import tb.h9x;
import tb.j6x;
import tb.l3j;
import tb.o32;
import tb.t2o;
import tb.t5x;
import tb.uuu;
import tb.uv6;
import tb.wsq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class WeexInstanceLoadHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public b6x.a f11193a;
    public WeexInstance b;
    public int c;
    public o32<WeexInstance> d;
    public t5x.a e;
    public boolean f;
    public long g;
    public boolean h;
    public String i;
    public boolean j;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a implements j6x {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
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
            WeexInstanceLoadHelper weexInstanceLoadHelper = WeexInstanceLoadHelper.this;
            if (str == null) {
                str = "weex报错";
            }
            WeexInstanceLoadHelper.i(weexInstanceLoadHelper, str);
        }

        @Override // tb.j6x
        public void I1(WeexInstance weexInstance) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("68c948df", new Object[]{this, weexInstance});
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
            } else {
                WeexInstanceLoadHelper.g(WeexInstanceLoadHelper.this, true);
            }
        }

        @Override // tb.j6x
        public void d2(WeexInstance weexInstance, WeexErrorType weexErrorType, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7a7821b2", new Object[]{this, weexInstance, weexErrorType, str});
            }
        }

        @Override // tb.j6x
        public void e2(WeexInstance weexInstance, WeexErrorType weexErrorType, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("52b846bb", new Object[]{this, weexInstance, weexErrorType, str});
            }
        }

        @Override // tb.j6x
        public void l2(WeexInstance weexInstance, WeexErrorType weexErrorType, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("55726f6d", new Object[]{this, weexInstance, weexErrorType, str});
            }
        }

        @Override // tb.j6x
        public void z1(WeexInstance weexInstance, boolean z, WeexErrorType weexErrorType, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8bee002", new Object[]{this, weexInstance, new Boolean(z), weexErrorType, str});
            }
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String b;
        public final /* synthetic */ Activity c;

        public c(String str, Activity activity) {
            this.b = str;
            this.c = activity;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                WeexInstanceLoadHelper.this.k(this.b, this.c);
            }
        }
    }

    static {
        t2o.a(745537653);
    }

    public static final /* synthetic */ void a(WeexInstanceLoadHelper weexInstanceLoadHelper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a09a323b", new Object[]{weexInstanceLoadHelper});
        } else {
            weexInstanceLoadHelper.n();
        }
    }

    public static final /* synthetic */ WeexInstance b(WeexInstanceLoadHelper weexInstanceLoadHelper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexInstance) ipChange.ipc$dispatch("36d2eb71", new Object[]{weexInstanceLoadHelper});
        }
        return weexInstanceLoadHelper.b;
    }

    public static final /* synthetic */ o32 c(WeexInstanceLoadHelper weexInstanceLoadHelper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o32) ipChange.ipc$dispatch("db2bbb66", new Object[]{weexInstanceLoadHelper});
        }
        return weexInstanceLoadHelper.d;
    }

    public static final /* synthetic */ b6x.a d(WeexInstanceLoadHelper weexInstanceLoadHelper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b6x.a) ipChange.ipc$dispatch("311615d", new Object[]{weexInstanceLoadHelper});
        }
        return weexInstanceLoadHelper.f11193a;
    }

    public static final /* synthetic */ void e(WeexInstanceLoadHelper weexInstanceLoadHelper, WeexInstance weexInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("273914cd", new Object[]{weexInstanceLoadHelper, weexInstance});
        } else {
            weexInstanceLoadHelper.b = weexInstance;
        }
    }

    public static final /* synthetic */ void f(WeexInstanceLoadHelper weexInstanceLoadHelper, o32 o32Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc24b482", new Object[]{weexInstanceLoadHelper, o32Var});
        } else {
            weexInstanceLoadHelper.d = o32Var;
        }
    }

    public static final /* synthetic */ void g(WeexInstanceLoadHelper weexInstanceLoadHelper, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fc0cb7", new Object[]{weexInstanceLoadHelper, new Boolean(z)});
        } else {
            weexInstanceLoadHelper.h = z;
        }
    }

    public static final /* synthetic */ void h(WeexInstanceLoadHelper weexInstanceLoadHelper, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d08a5972", new Object[]{weexInstanceLoadHelper, new Integer(i)});
        } else {
            weexInstanceLoadHelper.c = i;
        }
    }

    public static final /* synthetic */ void i(WeexInstanceLoadHelper weexInstanceLoadHelper, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12631ac3", new Object[]{weexInstanceLoadHelper, str});
        } else {
            weexInstanceLoadHelper.i = str;
        }
    }

    public static final /* synthetic */ void j(WeexInstanceLoadHelper weexInstanceLoadHelper, b6x.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("224d57cb", new Object[]{weexInstanceLoadHelper, aVar});
        } else {
            weexInstanceLoadHelper.f11193a = aVar;
        }
    }

    public final boolean l(Activity activity) {
        String o;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bfefd2d", new Object[]{this, activity})).booleanValue();
        }
        ckf.h(activity, "aty");
        StringBuilder sb = new StringBuilder("isSnapshotWeex=");
        l3j l3jVar = l3j.INSTANCE;
        sb.append(l3jVar.p());
        sb.append(" weexUrl=");
        sb.append(l3jVar.o());
        uv6.i("dsw", sb.toString());
        if (!l3jVar.p() || (o = l3jVar.o()) == null) {
            return false;
        }
        uuu.a(new c(o, activity));
        return true;
    }

    public final void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        TLog.loge("mtbMainLink", "WeexInstanceLoadHelper destroy");
        n();
    }

    public final void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226c8326", new Object[]{this});
            return;
        }
        TLog.loge("mtbMainLink", "WeexInstanceLoadHelper dispose");
        try {
            b6x.a aVar = this.f11193a;
            if (aVar != null) {
                aVar.destroy();
            }
            WeexInstance weexInstance = this.b;
            if (weexInstance != null) {
                weexInstance.destroy();
            }
        } catch (Throwable th) {
            TLog.loge("mtbMainLink", "destroy weex result error " + th);
        }
        this.f11193a = null;
        this.b = null;
        this.e = null;
    }

    public final boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("973d96ab", new Object[]{this})).booleanValue();
        }
        return this.j;
    }

    public final boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4d0e6894", new Object[]{this})).booleanValue();
        }
        return this.h;
    }

    public final String q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ffa3b714", new Object[]{this});
        }
        return this.i;
    }

    public final long r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8070b927", new Object[]{this})).longValue();
        }
        return this.g;
    }

    public final void t(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82b98d19", new Object[]{this, new Boolean(z)});
        } else {
            this.j = z;
        }
    }

    public final void u(Activity activity) {
        Lifecycle lifecycle;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68478944", new Object[]{this, activity});
            return;
        }
        GenericLifecycleObserver weexInstanceLoadHelper$subscribeAutoDisposeTask$observer$1 = new GenericLifecycleObserver() { // from class: com.taobao.mytaobao.basement.weex.WeexInstanceLoadHelper$subscribeAutoDisposeTask$observer$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // androidx.lifecycle.LifecycleEventObserver
            public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                Lifecycle lifecycle2;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("fa8a81fe", new Object[]{this, lifecycleOwner, event});
                } else if (event == Lifecycle.Event.ON_DESTROY) {
                    WeexInstanceLoadHelper.this.m();
                    if (lifecycleOwner != null && (lifecycle2 = lifecycleOwner.getLifecycle()) != null) {
                        lifecycle2.removeObserver(this);
                    }
                }
            }
        };
        if (!(activity instanceof LifecycleOwner)) {
            activity = null;
        }
        LifecycleOwner lifecycleOwner = (LifecycleOwner) activity;
        if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.addObserver(weexInstanceLoadHelper$subscribeAutoDisposeTask$observer$1);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class b implements b6x {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Activity b;

        public b(Activity activity) {
            this.b = activity;
        }

        @Override // tb.b6x
        public void a(b6x.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("17d54df9", new Object[]{this, aVar});
            } else if (this.b.isDestroyed() || this.b.isFinishing()) {
                if (aVar != null) {
                    try {
                        aVar.destroy();
                    } catch (Throwable th) {
                        TLog.loge("mtbMainLink", "destroy weex in callback error " + th);
                    }
                }
                WeexInstanceLoadHelper.a(WeexInstanceLoadHelper.this);
            } else {
                b6x.a d = WeexInstanceLoadHelper.d(WeexInstanceLoadHelper.this);
                if (d != null) {
                    d.destroy();
                }
                WeexInstance b = WeexInstanceLoadHelper.b(WeexInstanceLoadHelper.this);
                if (b != null) {
                    b.destroy();
                }
                WeexInstanceLoadHelper.j(WeexInstanceLoadHelper.this, aVar);
                if (WeexInstanceLoadHelper.this.o()) {
                    WeexInstanceLoadHelper.e(WeexInstanceLoadHelper.this, aVar != null ? aVar.b(this.b) : null);
                }
                WeexInstanceLoadHelper.h(WeexInstanceLoadHelper.this, 2);
                if (WeexInstanceLoadHelper.c(WeexInstanceLoadHelper.this) != null) {
                    WeexInstance b2 = WeexInstanceLoadHelper.b(WeexInstanceLoadHelper.this);
                    if (b2 == null) {
                        b2 = aVar != null ? aVar.b(this.b) : null;
                    }
                    o32 c = WeexInstanceLoadHelper.c(WeexInstanceLoadHelper.this);
                    if (c != null) {
                        c.a(true, null, b2);
                    }
                    WeexInstanceLoadHelper.f(WeexInstanceLoadHelper.this, null);
                    WeexInstanceLoadHelper.e(WeexInstanceLoadHelper.this, null);
                }
                uv6.c("asyncCreateWxInstance", 0);
                uv6.i("dsw", "onInstanceCreatedInMain:=============" + (System.currentTimeMillis() - WeexInstanceLoadHelper.this.r()));
            }
        }
    }

    public final void s(Activity activity, o32<WeexInstance> o32Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4f3a2d8", new Object[]{this, activity, o32Var});
            return;
        }
        ckf.h(activity, "aty");
        ckf.h(o32Var, "callback");
        t5x.a aVar = this.e;
        if (aVar == null) {
            uv6.i("dsw", "getWeexInstance null =================");
            o32Var.a(false, "ticket is null", null);
            return;
        }
        aVar.a();
        int i = this.c;
        if (i == 0) {
            uv6.i("dsw", "getWeexInstance null1 =================");
            o32Var.a(false, "loadState=0不符合预期", null);
        } else if (i == 1) {
            uv6.i("dsw", "getWeexInstance wait =================");
            this.d = o32Var;
        } else {
            uv6.i("dsw", "getWeexInstance yes =================");
            WeexInstance weexInstance = this.b;
            if (weexInstance == null) {
                b6x.a aVar2 = this.f11193a;
                weexInstance = aVar2 != null ? aVar2.b(activity) : null;
            }
            o32Var.a(true, null, weexInstance);
            this.b = null;
        }
        this.e = null;
    }

    public final void k(String str, Activity activity) {
        JSONObject jSONObject;
        int i;
        View findViewById;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a5d9971", new Object[]{this, str, activity});
            return;
        }
        ckf.h(str, "weexUrl");
        ckf.h(activity, "aty");
        if (!activity.isFinishing() && !activity.isDestroyed()) {
            u(activity);
            if (!this.f) {
                this.f = true;
                TLog.loge("mtbMainLink", "asyncCreateWxInstance");
                this.c = 1;
                uv6.b("asyncCreateWxInstance", 0);
                this.g = System.currentTimeMillis();
                WeexInstanceConfig weexInstanceConfig = new WeexInstanceConfig();
                WeexUnicornConfig weexUnicornConfig = new WeexUnicornConfig();
                weexUnicornConfig.i(WeexUnicornConfig.RenderMode.texture);
                weexInstanceConfig.s(weexUnicornConfig);
                if (wsq.O(str, "wotao-basement", false, 2, null)) {
                    JSONObject jSONObject2 = new JSONObject();
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject2.put(BizContext.KEY_SETTING_FILTER, (Object) jSONObject3);
                    jSONObject3.put("enable-async-shell-setup", (Object) Boolean.FALSE);
                    jSONObject = jSONObject2;
                } else {
                    jSONObject = null;
                }
                String a2 = h9x.a(true, str);
                ckf.c(a2, "WeexUtils.processUrl(true, weexUrl)");
                t5x b2 = com.taobao.android.weex.b.b(activity, a2, WeexInstanceMode.DOM, WeexRenderType.UNICORN, jSONObject, weexInstanceConfig);
                try {
                    findViewById = activity.findViewById(R.id.tbTabFragment);
                } catch (Throwable unused) {
                    i = 0;
                }
                if (findViewById != null) {
                    i = findViewById.getWidth();
                    try {
                        i2 = (findViewById.getHeight() - SystemBarDecorator.getStatusBarHeight(Globals.getApplication())) - DensityUtil.dip2px(Globals.getApplication(), 48.0f);
                    } catch (Throwable unused2) {
                    }
                    uv6.i("dsw", "dstWidth=" + i + " dstHeight=" + i2);
                    if (i > 0 && i2 > 0) {
                        b2.c(i, i2);
                    }
                    b2.initWithURL(a2);
                    b2.addInstanceListener(new a());
                    b2.render(null);
                    this.e = b2.b(new b(activity));
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.view.View");
            }
        }
    }
}
