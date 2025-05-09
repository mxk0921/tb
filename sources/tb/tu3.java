package tb;

import android.content.SharedPreferences;
import android.os.Build;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.Globals;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class tu3 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String GROUP_NAME = "client_wswitch_12278902";
    public static final String TAG = "ClientSwitchConfig";
    public static final tu3 b = new tu3();

    /* renamed from: a  reason: collision with root package name */
    public y8l f28959a = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class a implements y8l {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.y8l
        public void onConfigUpdate(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0b193b", new Object[]{this, str});
                return;
            }
            tu3.a(tu3.this);
            tu3.b(tu3.this);
            tu3.c(tu3.this);
            tu3.d(tu3.this);
        }
    }

    static {
        t2o.a(775946251);
    }

    public static /* synthetic */ void a(tu3 tu3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("467a71dd", new Object[]{tu3Var});
        } else {
            tu3Var.k();
        }
    }

    public static /* synthetic */ void b(tu3 tu3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c7e3d3c", new Object[]{tu3Var});
        } else {
            tu3Var.j();
        }
    }

    public static /* synthetic */ void c(tu3 tu3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5282089b", new Object[]{tu3Var});
        } else {
            tu3Var.h();
        }
    }

    public static /* synthetic */ void d(tu3 tu3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5885d3fa", new Object[]{tu3Var});
        } else {
            tu3Var.i();
        }
    }

    public static tu3 f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tu3) ipChange.ipc$dispatch("172af1b6", new Object[0]);
        }
        return b;
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        this.f28959a = new a();
        OrangeConfig.getInstance().registerListener(new String[]{"client_wswitch_12278902"}, this.f28959a);
    }

    public final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("448a593a", new Object[]{this});
            return;
        }
        try {
            String config = OrangeConfig.getInstance().getConfig("client_wswitch_12278902", "fpsmonitor", "true");
            SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(Globals.getApplication()).edit();
            edit.putString("fpsmonitor", config);
            edit.apply();
        } catch (Exception unused) {
        }
    }

    public final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("520f08de", new Object[]{this});
            return;
        }
        try {
            String config = OrangeConfig.getInstance().getConfig("client_wswitch_12278902", "memory_trigger_rate", "8");
            String config2 = OrangeConfig.getInstance().getConfig("client_wswitch_12278902", "memory_trigger_max", "8");
            String config3 = OrangeConfig.getInstance().getConfig("client_wswitch_12278902", "memory_trigger_enable", "true");
            SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(Globals.getApplication()).edit();
            edit.putString("memory_trigger_rate", config);
            edit.putString("memory_trigger_max", config2);
            edit.putString("memory_trigger_enable", config3);
            edit.apply();
        } catch (Exception unused) {
        }
    }

    public final void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d257cd4", new Object[]{this});
            return;
        }
        try {
            String config = OrangeConfig.getInstance().getConfig("client_wswitch_12278902", "sellerTalk", "false");
            if (!TextUtils.isEmpty(config)) {
                "true".equals(config);
            }
        } catch (Exception unused) {
        }
    }

    public final boolean e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3358035", new Object[]{this, str})).booleanValue();
        }
        String config = OrangeConfig.getInstance().getConfig("client_wswitch_12278902", str, "");
        if (TextUtils.isEmpty(config)) {
            return false;
        }
        return config.contains(Build.BRAND + ":" + Build.MODEL);
    }

    public final void k() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b4d7b67", new Object[]{this});
            return;
        }
        String config = OrangeConfig.getInstance().getConfig("client_wswitch_12278902", "video_close", "false");
        if (!TextUtils.isEmpty(config)) {
            z = "true".equals(config);
        }
        if (!z) {
            e("video_close_phone");
        }
    }
}
