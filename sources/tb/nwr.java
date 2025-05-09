package tb;

import android.app.Activity;
import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexErrorType;
import com.taobao.android.weex.WeexInstance;
import com.taobao.android.weex.WeexInstanceMode;
import com.taobao.android.weex.WeexRenderType;
import com.taobao.android.weex.config.WeexInstanceConfig;
import com.taobao.android.weex.config.WeexUnicornConfig;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.adapter.biz.weex.module.ShareGiftWeexModule2;
import com.taobao.tao.adapter.biz.weex.module.TaopasswordLayerModule2;
import com.ut.share.utils.RumManager;
import java.lang.ref.WeakReference;
import java.util.Map;
import tb.upd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class nwr implements upd, upd.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static boolean f = false;

    /* renamed from: a  reason: collision with root package name */
    public WeexInstance f25003a;
    public upd.a b;
    public Context c;
    public WeakReference<Context> d;
    public final boolean e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements j6x {
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
            new StringBuilder("onRenderFailed:").append(str);
            if (nwr.g(nwr.this) != null) {
                upd.a g = nwr.g(nwr.this);
                g.weexError(str + "，" + z);
            }
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
            } else if (nwr.g(nwr.this) != null) {
                nwr.g(nwr.this).viewReady();
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
            } else if (nwr.g(nwr.this) != null) {
                upd.a g = nwr.g(nwr.this);
                g.weexError(str + "，" + z);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements u11 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    if (nwr.i(nwr.this) != null) {
                        nwr.i(nwr.this).onActivityPause();
                    }
                } catch (Throwable unused) {
                }
            }
        }

        /* compiled from: Taobao */
        /* renamed from: tb.nwr$b$b  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class RunnableC1012b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public RunnableC1012b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    if (nwr.i(nwr.this) != null) {
                        nwr.i(nwr.this).onActivityResume();
                    }
                } catch (Throwable unused) {
                }
            }
        }

        public b() {
        }

        @Override // tb.u11, com.taobao.application.common.IApmEventListener
        public void onEvent(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fef3fc41", new Object[]{this, new Integer(i)});
                return;
            }
            new StringBuilder("initLifecycleObserver type:").append(i);
            if (i == 50 || i == 1) {
                Context h = nwr.h(nwr.this);
                if (h instanceof Activity) {
                    ((Activity) h).runOnUiThread(new a());
                }
            } else if (i == 2) {
                Context h2 = nwr.h(nwr.this);
                if (h2 instanceof Activity) {
                    ((Activity) h2).runOnUiThread(new RunnableC1012b());
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final nwr f25008a = new nwr(null);

        static {
            t2o.a(793772137);
        }

        public static /* synthetic */ nwr a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (nwr) ipChange.ipc$dispatch("cf2588bb", new Object[0]);
            }
            return f25008a;
        }
    }

    static {
        t2o.a(793772132);
        t2o.a(665845811);
        t2o.a(665845813);
    }

    public /* synthetic */ nwr(a aVar) {
        this();
    }

    public static /* synthetic */ upd.a g(nwr nwrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (upd.a) ipChange.ipc$dispatch("cbf11506", new Object[]{nwrVar});
        }
        return nwrVar.b;
    }

    public static /* synthetic */ Context h(nwr nwrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("4b6bfd0f", new Object[]{nwrVar});
        }
        return nwrVar.k();
    }

    public static /* synthetic */ WeexInstance i(nwr nwrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexInstance) ipChange.ipc$dispatch("bec9c1dc", new Object[]{nwrVar});
        }
        return nwrVar.f25003a;
    }

    public static nwr l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nwr) ipChange.ipc$dispatch("3dacfca1", new Object[0]);
        }
        return c.a();
    }

    @Override // tb.upd.b
    public void a(String str, String str2, Map<String, Object> map, String str3, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("614303d2", new Object[]{this, str, str2, map, str3, new Integer(i), new Integer(i2)});
            return;
        }
        fwr.d("TBShareWeex2 renderByUrl");
        WeexInstance j = j(str2);
        this.f25003a = j;
        if (j != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                if (map != null) {
                    for (String str4 : map.keySet()) {
                        jSONObject.put(str4, map.get(str4));
                    }
                }
                this.f25003a.initWithURL(str2);
                this.f25003a.render(com.taobao.android.weex.b.e().b(jSONObject));
                this.f25003a.onActivityStart();
            } catch (Throwable unused) {
            }
        }
    }

    @Override // tb.upd
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fb6d833", new Object[]{this});
            return;
        }
        try {
            com.taobao.android.weex.b.d().registerModule("ShareGiftWeexModule", ShareGiftWeexModule2.class);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // tb.upd
    public upd.b c(Context context, upd.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (upd.b) ipChange.ipc$dispatch("e8de5779", new Object[]{this, context, aVar});
        }
        nwr l = l();
        this.b = aVar;
        if (this.e) {
            this.d = new WeakReference<>(context);
        } else {
            this.c = context;
        }
        return l;
    }

    @Override // tb.upd
    public WeexInstance d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexInstance) ipChange.ipc$dispatch("236f20fd", new Object[]{this});
        }
        return this.f25003a;
    }

    @Override // tb.upd.b
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        WeexInstance weexInstance = this.f25003a;
        if (weexInstance != null) {
            weexInstance.onActivityStop();
            this.f25003a.destroy();
            this.f25003a = null;
        }
        if (this.b != null) {
            this.b = null;
        }
        if ("true".equals(OrangeConfig.getInstance().getConfig("android_share_bizconfig", "fixTBShareWeex2ContextLeak", "true"))) {
            fwr.d("TBShareWeex2销毁");
            this.c = null;
        }
    }

    @Override // tb.upd
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adadae57", new Object[]{this});
        }
    }

    @Override // tb.upd
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56aec057", new Object[]{this});
        } else if (!f) {
            try {
                com.taobao.android.weex.b.d().registerModule("TaopasswordLayerModule", TaopasswordLayerModule2.class);
            } catch (Throwable th) {
                th.printStackTrace();
            }
            f = true;
        }
    }

    public final WeexInstance j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexInstance) ipChange.ipc$dispatch("bbb81ed8", new Object[]{this, str});
        }
        WeexInstance weexInstance = this.f25003a;
        if (weexInstance != null) {
            weexInstance.destroy();
            this.f25003a = null;
        }
        Context k = k();
        if (k == null) {
            fwr.d("[异常]generateWeexInstance,mContext=null return");
            return null;
        }
        WeexInstanceConfig weexInstanceConfig = new WeexInstanceConfig();
        RumManager.configEnableEmbedPresentMode(weexInstanceConfig);
        WeexUnicornConfig weexUnicornConfig = new WeexUnicornConfig();
        weexInstanceConfig.s(weexUnicornConfig);
        weexUnicornConfig.j(null);
        weexUnicornConfig.k(true);
        weexUnicornConfig.i(WeexUnicornConfig.RenderMode.texture);
        WeexInstance a2 = com.taobao.android.weex.b.a(k, str, WeexInstanceMode.DOM, WeexRenderType.UNICORN, null, weexInstanceConfig);
        this.f25003a = a2;
        try {
            a2.getRootView().setFitsSystemWindows(false);
            this.b.viewCreated(this.f25003a.getRootView());
        } catch (Throwable unused) {
        }
        this.f25003a.addInstanceListener(new a());
        return this.f25003a;
    }

    public final Context k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        if (!this.e) {
            return this.c;
        }
        WeakReference<Context> weakReference = this.d;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public final void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dc9db7", new Object[]{this});
        } else {
            c21.c(new b());
        }
    }

    public nwr() {
        this.e = "true".equals(OrangeConfig.getInstance().getConfig("mpm_data_switch", "fixShareWx2CtxLeak", "true"));
        m();
    }
}
