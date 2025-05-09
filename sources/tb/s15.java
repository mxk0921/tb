package tb;

import android.app.Application;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.messagekit.core.utils.MsgLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class s15 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile s15 c;

    /* renamed from: a  reason: collision with root package name */
    public SharedPreferences f27738a;
    public boolean b = false;

    static {
        t2o.a(628097071);
    }

    public static /* synthetic */ SharedPreferences a(s15 s15Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("3ab613e5", new Object[]{s15Var});
        }
        return s15Var.f27738a;
    }

    public static s15 d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (s15) ipChange.ipc$dispatch("e658cfaa", new Object[0]);
        }
        if (c == null) {
            synchronized (s15.class) {
                try {
                    if (c == null) {
                        c = new s15();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return c;
    }

    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7a67345b", new Object[]{this})).intValue();
        }
        return 128;
    }

    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a9caee42", new Object[]{this})).intValue();
        }
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        if (this.b) {
            return Math.min(availableProcessors, 4);
        }
        return availableProcessors;
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("df832eb", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e97feb8d", new Object[]{this})).booleanValue();
        }
        return this.b;
    }

    public int h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cb4f518d", new Object[]{this})).intValue();
        }
        return 1;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements z8l {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.z8l
        public void onConfigUpdate(String str, boolean z) {
            SharedPreferences.Editor remove;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9458c0f9", new Object[]{this, str, new Boolean(z)});
                return;
            }
            try {
                String config = OrangeConfig.getInstance().getConfig("powermsg", "pm_thread_opt_switch", null);
                if (!TextUtils.isEmpty(config)) {
                    remove = s15.a(s15.this).edit().putBoolean("pm_thread_opt_switch", Boolean.parseBoolean(config));
                } else {
                    remove = s15.a(s15.this).edit().remove("pm_thread_opt_switch");
                }
                remove.apply();
            } catch (Exception e) {
                MsgLog.g("CustomRxJavaConfig", "config from orange error: " + e);
            }
        }
    }

    public void e(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3847dd28", new Object[]{this, application});
            return;
        }
        SharedPreferences sharedPreferences = application.getSharedPreferences("powermsg_config", 0);
        this.f27738a = sharedPreferences;
        this.b = sharedPreferences.getBoolean("pm_thread_opt_switch", false);
        OrangeConfig.getInstance().registerListener(new String[]{"powermsg"}, new a());
        MsgLog.g("CustomRxJavaConfig", "thread opt switch is: " + this.b);
    }
}
