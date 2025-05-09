package com.alibaba.security.realidentity;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.alibaba.security.realidentity.RPConfig;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class RPVerify {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String dailyUrl = "https://market.waptest.taobao.com/app/msd/m-rpverify-internal/start.html";
    public static boolean isInit = false;
    public static final String onlineUrl = "https://market.m.taobao.com/app/msd/m-rpverify-internal/start.html";
    public static final String preUrl = "https://market.wapa.taobao.com/app/msd/m-rpverify-internal/start.html";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f2643a;
        public final /* synthetic */ String b;
        public final /* synthetic */ RPConfig c;
        public final /* synthetic */ RPEventListener d;

        public a(Context context, String str, RPConfig rPConfig, RPEventListener rPEventListener) {
            this.f2643a = context;
            this.b = str;
            this.c = rPConfig;
            this.d = rPEventListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                g1.f().a(this.f2643a, this.b, "h5", RPVerify.a(this.c), this.d);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f2644a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ RPConfig d;
        public final /* synthetic */ RPEventListener e;

        public b(Context context, String str, String str2, RPConfig rPConfig, RPEventListener rPEventListener) {
            this.f2644a = context;
            this.b = str;
            this.c = str2;
            this.d = rPConfig;
            this.e = rPEventListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                g1.f().a(this.f2644a, this.b, this.c, RPVerify.a(this.d), this.e);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f2645a;
        public final /* synthetic */ String b;
        public final /* synthetic */ RPConfig c;
        public final /* synthetic */ RPEventListener d;

        public c(Context context, String str, RPConfig rPConfig, RPEventListener rPEventListener) {
            this.f2645a = context;
            this.b = str;
            this.c = rPConfig;
            this.d = rPEventListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                g1.f().a(this.f2645a, this.b, RPVerify.a(this.c), this.d);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Activity f2646a;
        public final /* synthetic */ String b;
        public final /* synthetic */ RPConfig c;
        public final /* synthetic */ RPEventListener d;

        public d(Activity activity, String str, RPConfig rPConfig, RPEventListener rPEventListener) {
            this.f2646a = activity;
            this.b = str;
            this.c = rPConfig;
            this.d = rPEventListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                g1.f().a(this.f2646a, this.b, this.c, this.d);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static /* synthetic */ class e {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f2647a;

        static {
            int[] iArr = new int[RPEnv.values().length];
            f2647a = iArr;
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                int[] iArr2 = f2647a;
                RPEnv rPEnv = RPEnv.ONLINE;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static /* synthetic */ RPConfig a(RPConfig rPConfig) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RPConfig) ipChange.ipc$dispatch("b054a96e", new Object[]{rPConfig}) : b(rPConfig);
    }

    public static RPConfig b(RPConfig rPConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RPConfig) ipChange.ipc$dispatch("af7b38cd", new Object[]{rPConfig});
        }
        if (rPConfig == null) {
            return new RPConfig.Builder().build();
        }
        return rPConfig;
    }

    public static String getClientInfo(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bbcb026e", new Object[]{context});
        }
        return g1.f().a(context);
    }

    public static String getDeviceInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("10d90f1f", new Object[0]);
        }
        return g1.f().c();
    }

    public static void init(Context context, RPEnv rPEnv) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6baabc6", new Object[]{context, rPEnv});
        } else {
            init(context, rPEnv, null);
        }
    }

    public static void start(Context context, String str, RPEventListener rPEventListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("842110ed", new Object[]{context, str, rPEventListener});
        } else {
            start(context, str, null, rPEventListener);
        }
    }

    public static void startByCtidWithVerifyToken(Activity activity, String str, RPConfig rPConfig, RPEventListener rPEventListener) {
        RPConfig rPConfig2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5a05694", new Object[]{activity, str, rPConfig, rPEventListener});
            return;
        }
        if (rPConfig != null) {
            rPConfig2 = new RPConfig.Builder(rPConfig).setNeedFailResultPage(true).build();
        } else {
            rPConfig2 = new RPConfig.Builder().setNeedFailResultPage(true).build();
        }
        a(activity, str, rPConfig2, rPEventListener, new d(activity, str, rPConfig2, rPEventListener));
    }

    public static void startByNative(Context context, String str, RPEventListener rPEventListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("765f12db", new Object[]{context, str, rPEventListener});
            return;
        }
        RPConfig.Builder builder = new RPConfig.Builder();
        builder.setNeedWaitingForFinish(true);
        startByNative(context, str, builder.build(), rPEventListener);
    }

    @Deprecated
    public static void startWithUrl(Context context, String str, RPEventListener rPEventListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("406f9b52", new Object[]{context, str, rPEventListener});
        } else {
            startWithUrl(context, str, null, rPEventListener);
        }
    }

    public static String version() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("deb50921", new Object[0]);
        }
        return g1.f().k();
    }

    public static String a(RPEnv rPEnv) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b1603d31", new Object[]{rPEnv});
        }
        if (rPEnv == null) {
            return onlineUrl;
        }
        int ordinal = rPEnv.ordinal();
        return ordinal != 1 ? ordinal != 2 ? onlineUrl : dailyUrl : preUrl;
    }

    public static void init(Context context, RPEnv rPEnv, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e012b010", new Object[]{context, rPEnv, str});
            return;
        }
        g1.f().b(context, rPEnv, a(rPEnv), str);
        isInit = true;
    }

    public static void start(Context context, String str, RPConfig rPConfig, RPEventListener rPEventListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("205ab63", new Object[]{context, str, rPConfig, rPEventListener});
        } else {
            a(context, str, rPConfig, rPEventListener, new a(context, str, rPConfig, rPEventListener));
        }
    }

    @Deprecated
    public static void startWithUrl(Context context, String str, RPConfig rPConfig, RPEventListener rPEventListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab99f248", new Object[]{context, str, rPConfig, rPEventListener});
        } else if (rPEventListener != null) {
            if (TextUtils.isEmpty(str)) {
                rPEventListener.onFinish(RPResult.AUDIT_NOT, new RPDetail(e2.a(e2.p), String.valueOf((int) e2.p), "url is empty", null));
                return;
            }
            if (!isInit) {
                init(context, RPEnv.ONLINE);
            }
            if (!isInit) {
                rPEventListener.onFinish(RPResult.AUDIT_NOT, new RPDetail(e2.a(e2.n), String.valueOf((int) e2.n), "sdk init fail", null));
            } else {
                g1.f().b(context, str, b(rPConfig), rPEventListener);
            }
        }
    }

    public static void a(Context context, String str, RPConfig rPConfig, RPEventListener rPEventListener, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99a292a0", new Object[]{context, str, rPConfig, rPEventListener, runnable});
        } else if (rPEventListener == null) {
            throw new NullPointerException("RPVerify#start rpEventListener is null");
        } else if (TextUtils.isEmpty(str)) {
            rPEventListener.onFinish(RPResult.AUDIT_NOT, new RPDetail(e2.a(e2.o), String.valueOf((int) e2.o), "verifyToken is null", null));
        } else {
            if (!isInit) {
                init(context, RPEnv.ONLINE);
            }
            if (!isInit) {
                rPEventListener.onFinish(RPResult.AUDIT_NOT, new RPDetail(e2.a(e2.n), String.valueOf((int) e2.n), "sdk init fail", null));
            } else {
                runnable.run();
            }
        }
    }

    public static void start(Context context, String str, RPConfig rPConfig, String str2, RPEventListener rPEventListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c3d3819", new Object[]{context, str, rPConfig, str2, rPEventListener});
        } else {
            a(context, str, rPConfig, rPEventListener, new b(context, str, str2, rPConfig, rPEventListener));
        }
    }

    public static void startByNative(Context context, String str, RPConfig rPConfig, RPEventListener rPEventListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("717b0051", new Object[]{context, str, rPConfig, rPEventListener});
        } else {
            a(context, str, rPConfig, rPEventListener, new c(context, str, rPConfig, rPEventListener));
        }
    }
}
