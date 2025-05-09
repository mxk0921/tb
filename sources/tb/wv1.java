package tb;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXSDKManager;
import com.taobao.weex.adapter.IWXInitTaskAdapter;
import com.taobao.weex.utils.Switch;
import com.taobao.weex.utils.WXLogUtils;
import com.taobao.weex.utils.WXTLogImpl;
import tb.fbe;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class wv1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f30946a = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f30947a;
        public final /* synthetic */ Context b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ boolean d;
        public final /* synthetic */ IWXInitTaskAdapter.Callback e;

        /* compiled from: Taobao */
        /* renamed from: tb.wv1$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public class C1092a implements fbe.a {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* compiled from: Taobao */
            /* renamed from: tb.wv1$a$a$a  reason: collision with other inner class name */
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
            public class RunnableC1093a implements Runnable {
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public RunnableC1093a() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    try {
                        Class<?> cls = Class.forName("com.taobao.weex.TBWXSDKEngineImpl");
                        Class<?> cls2 = Boolean.TYPE;
                        cls.getMethod("initSDKEngine", cls2, cls2).invoke(null, Boolean.valueOf(a.this.c), Boolean.valueOf(a.this.d));
                        wv1.b(true);
                    } catch (Throwable th) {
                        WXLogUtils.e("BaseInitLauncher", th);
                    }
                    IWXInitTaskAdapter.Callback callback = a.this.e;
                    if (callback != null) {
                        callback.onRemoteInstalled();
                    }
                }
            }

            public C1092a() {
            }

            @Override // tb.fbe.a
            public void onError(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("ac367d3a", new Object[]{this, str});
                    return;
                }
                IWXInitTaskAdapter.Callback callback = a.this.e;
                if (callback != null) {
                    callback.onRemoteFailed(str, str);
                }
            }

            @Override // tb.fbe.a
            public void onSuccess() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("d0e393ab", new Object[]{this});
                } else if (!wv1.a()) {
                    qvw.a();
                    RunnableC1093a aVar = new RunnableC1093a();
                    if (a0s.a()) {
                        WXLogUtils.e("BaseInitLauncher", "post init in wx thread");
                        WXSDKManager.getInstance().getWXBridgeManager().post(aVar);
                        return;
                    }
                    WXLogUtils.e("BaseInitLauncher", "run init in main thread");
                    aVar.run();
                } else {
                    IWXInitTaskAdapter.Callback callback = a.this.e;
                    if (callback != null) {
                        callback.onRemoteInstalled();
                    }
                }
            }
        }

        public a(boolean z, Context context, boolean z2, boolean z3, IWXInitTaskAdapter.Callback callback) {
            this.f30947a = z;
            this.b = context;
            this.c = z2;
            this.d = z3;
            this.e = callback;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                WXTLogImpl.initWXLogWatcher();
            } catch (Throwable th) {
                th.printStackTrace();
            }
            if (this.f30947a) {
                str = "render";
            } else {
                str = "init";
            }
            czr.b(str, "", this.b, false, new C1092a());
        }
    }

    static {
        t2o.a(773849095);
    }

    public static /* synthetic */ boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd6077b", new Object[0])).booleanValue();
        }
        return f30946a;
    }

    public static /* synthetic */ boolean b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e1554b7f", new Object[]{new Boolean(z)})).booleanValue();
        }
        f30946a = z;
        return z;
    }

    public static void c(Context context, boolean z, boolean z2, boolean z3, IWXInitTaskAdapter.Callback callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17d71e15", new Object[]{context, new Boolean(z), new Boolean(z2), new Boolean(z3), callback});
            return;
        }
        a aVar = new a(z, context, z2, z3, callback);
        if (Switch.isSwitchOn("./delayWeexInit").booleanValue()) {
            new Handler(Looper.getMainLooper()).postDelayed(aVar, 10000L);
        } else {
            aVar.run();
        }
    }
}
