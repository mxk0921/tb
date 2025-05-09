package tb;

import android.content.Context;
import android.content.Intent;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.jarviswe.jsbridge.LoadTaskPlugin;
import com.taobao.orange.OrangeConfig;
import com.tmall.android.dai.DAI;
import com.tmall.android.dai.DAICallback;
import com.tmall.android.dai.DAIError;
import com.tmall.android.dai.internal.util.LogUtil;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executor;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class gtf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_INITIALIZE_COMPLETE = "com.taobao.android.jarviswe.intent.action.INITIALIZE_COMPLETE";
    public static gtf b;

    /* renamed from: a  reason: collision with root package name */
    public volatile boolean f20208a = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f20209a;
        public final /* synthetic */ Context b;

        public a(String str, Context context) {
            this.f20209a = str;
            this.b = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                gtf.a(gtf.this, this.f20209a);
                if (!gtf.b(gtf.this)) {
                    gtf.d(gtf.this, this.b);
                    if (kj1.b()) {
                        try {
                            jj1.h().f(this.b);
                        } catch (Throwable unused) {
                        }
                    }
                    gtf.e(gtf.this);
                    gtf.c(gtf.this, true);
                    fsw.i(LoadTaskPlugin.API_NAME, LoadTaskPlugin.class, true);
                    gtf.f(gtf.this);
                }
            } catch (Exception e) {
                LogUtil.e("JarvisEngine", "launchByBroadCast engine failed " + e.getMessage());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements DAICallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ fo6 f20210a;
        public final /* synthetic */ String b;

        public b(gtf gtfVar, fo6 fo6Var, String str) {
            this.f20210a = fo6Var;
            this.b = str;
        }

        @Override // com.tmall.android.dai.DAICallback
        public void onError(DAIError dAIError) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("326e086b", new Object[]{this, dAIError});
            } else if (dAIError != null) {
                String dAIError2 = dAIError.toString();
                fo6 fo6Var = this.f20210a;
                if (fo6Var != null) {
                    fo6Var.errorReport(this.b, "Walle Model Run Error", dAIError2);
                }
            }
        }

        @Override // com.tmall.android.dai.DAICallback
        public void onSuccess(Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f85dc9a6", new Object[]{this, objArr});
                return;
            }
            String str = "TYPE_ERROR";
            if (objArr != null) {
                try {
                    if (objArr.length > 0) {
                        Object obj = objArr[0];
                        if (obj instanceof Map) {
                            Object obj2 = ((Map) obj).get("result");
                            if (!(obj2 instanceof String)) {
                                if (obj2 instanceof JSON) {
                                }
                            }
                            fo6 fo6Var = this.f20210a;
                            if (fo6Var != null) {
                                fo6Var.notify(this.b, obj2.toString());
                            }
                            str = null;
                        }
                    }
                } catch (Exception e) {
                    String message = e.getMessage();
                    fo6 fo6Var2 = this.f20210a;
                    if (fo6Var2 != null && message != null) {
                        fo6Var2.errorReport(this.b, "Jarvis Callback Error", message);
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    throw th;
                }
            }
            fo6 fo6Var3 = this.f20210a;
            if (fo6Var3 != null && str != null) {
                fo6Var3.errorReport(this.b, "Jarvis Callback Error", str);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c extends TimerTask {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    itf.i().l(null);
                }
            }
        }

        public c() {
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/jarviswe/JarvisEngine$3");
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                gtf.this.h().execute(new a());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class d implements z8l {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
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
                    qtf.a().d();
                    gtf.g(gtf.this);
                } catch (Exception e) {
                    LogUtil.e("JarvisEngine", "loadScenesV3 reCheckPkgInfo error", e);
                }
            }
        }

        public d() {
        }

        @Override // tb.z8l
        public void onConfigUpdate(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9458c0f9", new Object[]{this, str, new Boolean(z)});
            } else {
                gtf.this.h().execute(new a());
            }
        }
    }

    static {
        t2o.a(1034944518);
    }

    public static /* synthetic */ String a(gtf gtfVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ff1c4ebe", new Object[]{gtfVar, str});
        }
        gtfVar.getClass();
        return str;
    }

    public static /* synthetic */ boolean b(gtf gtfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aa7c77db", new Object[]{gtfVar})).booleanValue();
        }
        return gtfVar.f20208a;
    }

    public static /* synthetic */ boolean c(gtf gtfVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("18a8799f", new Object[]{gtfVar, new Boolean(z)})).booleanValue();
        }
        gtfVar.f20208a = z;
        return z;
    }

    public static /* synthetic */ Context d(gtf gtfVar, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("9f2fdba6", new Object[]{gtfVar, context});
        }
        gtfVar.getClass();
        return context;
    }

    public static /* synthetic */ void e(gtf gtfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a98fabd9", new Object[]{gtfVar});
        } else {
            gtfVar.m();
        }
    }

    public static /* synthetic */ void f(gtf gtfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a91945da", new Object[]{gtfVar});
        } else {
            gtfVar.n();
        }
    }

    public static /* synthetic */ void g(gtf gtfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8a2dfdb", new Object[]{gtfVar});
        } else {
            gtfVar.p();
        }
    }

    public static synchronized gtf i() {
        synchronized (gtf.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (gtf) ipChange.ipc$dispatch("f8ec0163", new Object[0]);
            }
            if (b == null) {
                b = new gtf();
            }
            return b;
        }
    }

    public Executor h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Executor) ipChange.ipc$dispatch("64056156", new Object[]{this});
        }
        return t45.c().d();
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        try {
            fsw.i(LoadTaskPlugin.API_NAME, LoadTaskPlugin.class, true);
        } catch (Throwable th) {
            LogUtil.e("JarvisEngine", "init engine failed " + th.getMessage());
        }
    }

    public boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ae907f84", new Object[]{this})).booleanValue();
        }
        return this.f20208a;
    }

    public synchronized void l(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("931eefea", new Object[]{this, context});
        } else {
            h().execute(new a(ewv.c(context), context));
        }
    }

    public final void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e37f8d1", new Object[]{this});
        } else {
            OrangeConfig.getInstance().registerListener(new String[]{"jarvis_scenes_v3"}, new d());
        }
    }

    public final void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58db56b1", new Object[]{this});
            return;
        }
        try {
            Intent intent = new Intent(ACTION_INITIALIZE_COMPLETE);
            intent.setPackage(kzo.c().b().getPackageName());
            kzo.c().b().sendBroadcast(intent);
        } catch (Throwable th) {
            LogUtil.e("JarvisEngine", th.getMessage(), th);
        }
    }

    public void o(String str, String str2, Map<String, Object> map, fo6 fo6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69a13946", new Object[]{this, str, str2, map, fo6Var});
            return;
        }
        System.currentTimeMillis();
        DAI.runComputeByAliasWithTriId(str + "#" + str2, map, new b(this, fo6Var, str2), null);
    }

    public final void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38d6b559", new Object[]{this});
            return;
        }
        v24.e().b();
        new Timer().schedule(new c(), 1000L);
    }
}
