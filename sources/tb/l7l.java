package tb;

import android.text.TextUtils;
import androidx.appcompat.taobao.util.Globals;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.orange.OrangeConfig;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class l7l {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f23151a = false;
    public static boolean b = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f23152a;
        public final /* synthetic */ String b;

        public a(String str, String str2) {
            this.f23152a = str;
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!TextUtils.equals(l7l.a(this.f23152a), this.b)) {
                Globals.getApplication().getSharedPreferences("mpmDataSwitchSp", 0).edit().putString(this.f23152a, this.b).apply();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class b implements obk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f23153a;

        public b(String str) {
            this.f23153a = str;
        }

        @Override // tb.obk
        public void onConfigUpdate(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
            } else if (!l7l.b()) {
                l7l.c(true);
                l7l.d(this.f23153a, OrangeConfig.getInstance().getConfig("mpm_data_switch", this.f23153a, null));
            }
        }
    }

    static {
        t2o.a(664797186);
    }

    public static /* synthetic */ String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("28c0253f", new Object[]{str});
        }
        return g(str);
    }

    public static /* synthetic */ boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f1bc42bc", new Object[0])).booleanValue();
        }
        return b;
    }

    public static /* synthetic */ boolean c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4936785e", new Object[]{new Boolean(z)})).booleanValue();
        }
        b = z;
        return z;
    }

    public static /* synthetic */ void d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e87ea8d", new Object[]{str, str2});
        } else {
            e(str, str2);
        }
    }

    public static void e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ef301be", new Object[]{str, str2});
        } else {
            Coordinator.execute(new a(str, str2));
        }
    }

    public static String f(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1f86747b", new Object[]{str, str2});
        }
        String config = OrangeConfig.getInstance().getConfig("mpm_data_switch", str, null);
        if (config == null) {
            h(str);
            String g = g(str);
            if (g == null) {
                return str2;
            }
            return g;
        }
        e(str, config);
        return config;
    }

    public static String g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("40d2483c", new Object[]{str});
        }
        return Globals.getApplication().getSharedPreferences("mpmDataSwitchSp", 0).getString(str, null);
    }

    public static void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed23427d", new Object[]{str});
        } else if (!f23151a) {
            f23151a = true;
            OrangeConfig.getInstance().registerListener(new String[]{"mpm_data_switch"}, new b(str), true);
        }
    }
}
