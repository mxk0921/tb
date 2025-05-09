package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mrt.MRT;
import com.taobao.orange.OrangeConfig;
import com.tmall.android.dai.DAI;
import com.tmall.android.dai.internal.config.Config;
import com.tmall.android.dai.internal.init.WalleInitBridgeJava;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class d42 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "BasicConfigManager";
    public static volatile d42 d;

    /* renamed from: a  reason: collision with root package name */
    public volatile boolean f17562a = false;
    public volatile boolean b = false;
    public String c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
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
            String config = OrangeConfig.getInstance().getConfig("ODCP_walle_config", "walle_config", "");
            if (!TextUtils.equals(config, d42.b(d42.this))) {
                d42.c(d42.this, config);
                Config config2 = (Config) zwf.a(config, Config.class);
                if (config2 != null) {
                    kzo.c().y(config2.utEventIds);
                    kzo.c().w(config2.utDbBlacklist);
                    kzo.c().x(config2.ut2201WhiteArg1s, config2.utArgsWhiteKeys);
                    if (d42.d(d42.this)) {
                        return;
                    }
                    if (MRT.i()) {
                        d42.e(d42.this, true);
                        if (ral.e().g()) {
                            DAI.onBasicConfigUpdate();
                        } else {
                            WalleInitBridgeJava.a().r();
                        }
                    } else {
                        d42.f(d42.this, true);
                    }
                }
            }
        }
    }

    static {
        t2o.a(1034944619);
    }

    public static /* synthetic */ String b(d42 d42Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("66f3a5aa", new Object[]{d42Var});
        }
        return d42Var.c;
    }

    public static /* synthetic */ String c(d42 d42Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("677e32de", new Object[]{d42Var, str});
        }
        d42Var.c = str;
        return str;
    }

    public static /* synthetic */ boolean d(d42 d42Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a2a4a9bb", new Object[]{d42Var})).booleanValue();
        }
        return d42Var.f17562a;
    }

    public static /* synthetic */ boolean e(d42 d42Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aeb347bf", new Object[]{d42Var, new Boolean(z)})).booleanValue();
        }
        d42Var.f17562a = z;
        return z;
    }

    public static /* synthetic */ boolean f(d42 d42Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("18e2cfde", new Object[]{d42Var, new Boolean(z)})).booleanValue();
        }
        d42Var.b = z;
        return z;
    }

    public static d42 h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d42) ipChange.ipc$dispatch("dadd5943", new Object[0]);
        }
        if (d == null) {
            synchronized (d42.class) {
                try {
                    if (d == null) {
                        d = new d42();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return d;
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ad133d4b", new Object[]{this})).booleanValue();
        }
        return this.b;
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("812a2874", new Object[]{this});
        } else if (this.b) {
            if (ral.e().g()) {
                DAI.onBasicConfigUpdate();
            } else {
                WalleInitBridgeJava.a().r();
            }
            this.b = false;
        }
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb97d561", new Object[]{this});
        } else {
            t45.c().d().execute(new a());
        }
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cce3884", new Object[]{this});
        } else {
            i();
        }
    }
}
