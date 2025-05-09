package tb;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.walle.bridge.CppApiBridge;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ral {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CONFIG_THREAD_POOL_COUNT = "thread_count";
    public static final String DAI_ORANGE_SWITCH = "daiOrangeSwitch";
    public static final int THREAD_COUNT_MAX = 5;
    public static final int THREAD_COUNT_MIN = 1;
    public static volatile ral i;

    /* renamed from: a  reason: collision with root package name */
    public boolean f27229a;
    public boolean b;
    public boolean d;
    public boolean c = false;
    public boolean e = true;
    public int f = 2;
    public volatile boolean g = false;
    public boolean h = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements y8l {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f27230a;

        public a(Context context) {
            this.f27230a = context;
        }

        @Override // tb.y8l
        public void onConfigUpdate(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0b193b", new Object[]{this, str});
            } else {
                ral.a(ral.this, this.f27230a);
            }
        }
    }

    static {
        t2o.a(1034944635);
    }

    public static /* synthetic */ void a(ral ralVar, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("962c7e96", new Object[]{ralVar, context});
        } else {
            ralVar.o(context);
        }
    }

    public static ral e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ral) ipChange.ipc$dispatch("68b79e0b", new Object[0]);
        }
        if (i == null) {
            synchronized (ral.class) {
                try {
                    if (i == null) {
                        i = new ral();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return i;
    }

    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a0cddffe", new Object[]{this})).intValue();
        }
        int i2 = this.f;
        if (i2 < 1) {
            return 1;
        }
        if (i2 > 5) {
            return 5;
        }
        return i2;
    }

    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ce1f8f8c", new Object[]{this})).intValue();
        }
        if (n()) {
            return 0;
        }
        try {
            return Integer.parseInt(OrangeConfig.getInstance().getConfig("EdgeComputingIsEnabled", "highCount", "2"));
        } catch (Throwable unused) {
            return 1;
        }
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9144b901", new Object[]{this})).booleanValue();
        }
        return this.e;
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7a3b75c0", new Object[]{this})).booleanValue();
        }
        return this.d;
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56f023c2", new Object[]{this})).booleanValue();
        }
        return this.b;
    }

    public boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("648cf0e1", new Object[]{this})).booleanValue();
        }
        return this.f27229a;
    }

    public boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("66811457", new Object[]{this})).booleanValue();
        }
        if (!k() || !this.c) {
            return false;
        }
        return true;
    }

    public boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4cb0870f", new Object[]{this})).booleanValue();
        }
        return this.h;
    }

    public void p(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1f361e8", new Object[]{this, context});
        } else if (!this.g) {
            try {
                OrangeConfig.getInstance().registerListener(new String[]{"EdgeComputingIsEnabled"}, new a(context));
                f(context);
                this.g = true;
            } catch (Throwable unused) {
            }
        }
    }

    public final void o(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20f0cdb0", new Object[]{this, context});
            return;
        }
        this.b = Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("EdgeComputingIsEnabled", "isEnabled", "true"));
        this.c = Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("EdgeComputingIsEnabled", "lowDeviceDowngradeAll", "false"));
        this.e = Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("EdgeComputingIsEnabled", "initRefactorRollback", "true"));
        this.f = Integer.parseInt(OrangeConfig.getInstance().getConfig("EdgeComputingIsEnabled", CONFIG_THREAD_POOL_COUNT, "2"));
        this.f27229a = Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("EdgeComputingIsEnabled", "enableRuntime32", "true"));
        this.h = Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("EdgeComputingIsEnabled", "isStreamProcessingEnabled", "false"));
        this.d = Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("EdgeComputingIsEnabled", "configManagerDegrade", "false"));
        SharedPreferences.Editor edit = context.getSharedPreferences(DAI_ORANGE_SWITCH, 0).edit();
        edit.putBoolean("isEnabled", this.b);
        edit.putBoolean("lowDeviceDowngradeAll", this.c);
        edit.putBoolean("initRefactorRollback", this.e);
        edit.putInt(CONFIG_THREAD_POOL_COUNT, this.f);
        edit.putBoolean("enableRuntime32", this.f27229a);
        edit.putBoolean("isStreamProcessingEnabled", this.h);
        edit.putBoolean("configManagerDegrade", this.h);
        edit.apply();
        if (this.d) {
            CppApiBridge.b().a("onConfigDegrade", null);
        }
    }

    public int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cc7d015e", new Object[]{this})).intValue();
        }
        if (n()) {
            return 0;
        }
        try {
            return Integer.parseInt(OrangeConfig.getInstance().getConfig("EdgeComputingIsEnabled", "lowCount", "1"));
        } catch (Throwable unused) {
            return 1;
        }
    }

    public final boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("522b454b", new Object[]{this})).booleanValue();
        }
        String a2 = pi7.a();
        return !TextUtils.isEmpty(a2) && "low".equalsIgnoreCase(a2);
    }

    public final boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("80651661", new Object[]{this})).booleanValue();
        }
        if (!k()) {
            return false;
        }
        String config = OrangeConfig.getInstance().getConfig("EdgeComputingIsEnabled", "lowDeviceClosed", "true");
        if (TextUtils.isEmpty(config)) {
            return false;
        }
        try {
            if (!Boolean.valueOf(config).booleanValue()) {
                if (!l()) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            kgh.d("OrangeSwitchManager", "parse lowDeviceClosed config failed", th);
            return false;
        }
    }

    public final void f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d54f85f0", new Object[]{this, context});
            return;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences(DAI_ORANGE_SWITCH, 0);
        this.b = sharedPreferences.getBoolean("isEnabled", true);
        this.c = sharedPreferences.getBoolean("lowDeviceDowngradeAll", false);
        this.e = sharedPreferences.getBoolean("initRefactorRollback", true);
        this.f = sharedPreferences.getInt(CONFIG_THREAD_POOL_COUNT, 2);
        this.f27229a = sharedPreferences.getBoolean("enableRuntime32", true);
    }
}
