package tb;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.adapter.monitor.VirtualThreadMonitor;
import com.taobao.orange.OrangeConfig;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class siw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements obk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Application f28080a;
        public final Map<String, String> b = new HashMap();

        static {
            t2o.a(970981414);
            t2o.a(613416995);
        }

        public a(Application application) {
            this.f28080a = application;
        }

        public final boolean a(Map<String, String> map, Map<String, String> map2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("22cc19a1", new Object[]{this, map, map2})).booleanValue();
            }
            if (map.size() != map2.size()) {
                return false;
            }
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (!TextUtils.equals(entry.getValue(), map2.get(entry.getKey()))) {
                    return false;
                }
            }
            return true;
        }

        public final void b(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6c644b96", new Object[]{this, map});
            } else if (map != null && map.size() > 0) {
                c(map);
            }
        }

        public final void c(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fc0e9d1", new Object[]{this, map});
                return;
            }
            try {
                File file = new File(this.f28080a.getFilesDir(), "virtual_thread_config.txt");
                if (!a(nb9.a().b(file), map)) {
                    nb9.a().c(map, file);
                }
            } catch (Throwable th) {
                ghh.c(th);
            }
        }

        @Override // tb.obk
        public void onConfigUpdate(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
                return;
            }
            Map<String, String> configs = OrangeConfig.getInstance().getConfigs("VirtualThread");
            if (configs != null && configs.size() > 0) {
                ((HashMap) this.b).putAll(configs);
                b(this.b);
            }
        }
    }

    static {
        t2o.a(970981413);
    }

    public static yiw a(Context context, j1r j1rVar, HashMap hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yiw) ipChange.ipc$dispatch("e642c04c", new Object[]{context, j1rVar, hashMap});
        }
        if (hashMap == null) {
            hashMap = new HashMap();
        }
        String b = new j1r(hashMap).b("appVersion", "1.0.0");
        ghh.a("VirtualThread", b);
        if (b.split("\\.").length > 3) {
            return new pja(j1rVar);
        }
        return new yiw(j1rVar);
    }

    public static Map<String, String> c(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("97e93ba5", new Object[]{application});
        }
        try {
            Map<String, String> b = nb9.a().b(new File(ey1.SWITCH_FILE_DIR, "virtual_thread_config.txt"));
            return b.size() > 0 ? b : nb9.a().b(new File(application.getFilesDir(), "virtual_thread_config.txt"));
        } catch (Throwable th) {
            ghh.c(th);
            return new HashMap();
        }
    }

    public static void b(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{application, hashMap});
        } else if (qg8.d()) {
            j1r j1rVar = new j1r(c(application));
            yiw a2 = a(application, j1rVar, hashMap);
            ghh.a("VirtualThread", a2.getClass().getSimpleName());
            if (j1rVar.c("useMonitorVirtualThread", a2.a())) {
                VirtualThreadMonitor.doRegister();
            }
            OrangeConfig.getInstance().getConfigs("VirtualThread");
            OrangeConfig.getInstance().registerListener(new String[]{"VirtualThread"}, new a(application), true);
        }
    }
}
