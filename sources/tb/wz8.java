package tb;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Build;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.util.ALog;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.scene.SceneIdentifier;
import com.taobao.android.ab.api.ABGlobal;
import java.util.UUID;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class wz8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static String f;

    /* renamed from: a  reason: collision with root package name */
    public WifiManager.WifiLock f31031a;
    public boolean b;
    public Context c;
    public final SceneIdentifier.d d;
    public final NetworkStatusHelper.INetworkStatusChangeListener e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements SceneIdentifier.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.analysis.scene.SceneIdentifier.d
        public void background() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("550392b5", new Object[]{this});
            } else {
                wz8.b(wz8.this);
            }
        }

        @Override // com.taobao.analysis.scene.SceneIdentifier.d
        public void foreground() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ddb1944a", new Object[]{this});
            } else {
                wz8.a(wz8.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements NetworkStatusHelper.INetworkStatusChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // anet.channel.status.NetworkStatusHelper.INetworkStatusChangeListener
        public void onNetworkStatusChanged(NetworkStatusHelper.NetworkStatus networkStatus) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4275ba3b", new Object[]{this, networkStatus});
            } else if (networkStatus == NetworkStatusHelper.NetworkStatus.WIFI) {
                wz8.a(wz8.this);
            } else {
                wz8.b(wz8.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f31034a;

        public c(Context context) {
            this.f31034a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                wz8.c(wz8.this, this.f31034a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (NetworkStatusHelper.getStatus().isWifi() && !SceneIdentifier.isAppBackground()) {
                wz8.d(wz8.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                wz8.e(wz8.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class f {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final wz8 f31037a = new wz8(null);

        public static /* synthetic */ wz8 a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (wz8) ipChange.ipc$dispatch("2c16b3f4", new Object[0]);
            }
            return f31037a;
        }
    }

    public /* synthetic */ wz8(a aVar) {
        this();
    }

    public static /* synthetic */ void a(wz8 wz8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9263d04f", new Object[]{wz8Var});
        } else {
            wz8Var.k();
        }
    }

    public static /* synthetic */ void b(wz8 wz8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d0492d0", new Object[]{wz8Var});
        } else {
            wz8Var.l();
        }
    }

    public static /* synthetic */ void c(wz8 wz8Var, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ec6e4d5", new Object[]{wz8Var, context});
        } else {
            wz8Var.f(context);
        }
    }

    public static /* synthetic */ void d(wz8 wz8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97879cd4", new Object[]{wz8Var});
        } else {
            wz8Var.g();
        }
    }

    public static /* synthetic */ void e(wz8 wz8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32285f55", new Object[]{wz8Var});
        } else {
            wz8Var.h();
        }
    }

    public static wz8 i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wz8) ipChange.ipc$dispatch("7f129b1c", new Object[0]);
        }
        return f.a();
    }

    public final void f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("531942c6", new Object[]{this, context});
        } else if (uz8.d(context)) {
            if (!ABGlobal.isFeatureOpened(context, "falco_wifi_low_latency")) {
                ALog.e("falco.WiFiLowLatency", "[init] falco_wifi_low_latency is not open.", null, new Object[0]);
                return;
            }
            f = "LockManager@" + UUID.randomUUID().toString();
            this.c = context;
            k();
            SceneIdentifier.registerLifecycleListener(this.d);
            NetworkStatusHelper.addStatusChangeListener(this.e);
        }
    }

    public final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fca6ef8", new Object[]{this});
        } else if (this.b) {
            ALog.e("falco.WiFiLowLatency", "[stopWifiWakeLock] release lock.", null, new Object[0]);
            WifiManager.WifiLock wifiLock = this.f31031a;
            if (wifiLock != null && wifiLock.isHeld()) {
                this.f31031a.release();
                this.f31031a = null;
            }
            this.b = false;
        }
    }

    public void j(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
        } else {
            crt.i(new c(context));
        }
    }

    public final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e85de2d", new Object[]{this});
        } else {
            crt.i(new d());
        }
    }

    public final void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3175e1cd", new Object[]{this});
        } else {
            crt.i(new e());
        }
    }

    public wz8() {
        this.b = false;
        this.d = new a();
        this.e = new b();
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cac2f662", new Object[]{this});
        } else if (!this.b) {
            ALog.e("falco.WiFiLowLatency", "[startWifiWakeLock] wifi wake lock.", null, new Object[0]);
            WifiManager wifiManager = (WifiManager) this.c.getSystemService("wifi");
            if (Build.VERSION.SDK_INT >= 29) {
                this.f31031a = wifiManager.createWifiLock(4, f);
            } else {
                this.f31031a = wifiManager.createWifiLock(3, f);
            }
            this.f31031a.acquire();
            this.b = true;
        }
    }
}
