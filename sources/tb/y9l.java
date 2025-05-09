package tb;

import android.app.Application;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class y9l {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Application f31924a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements obk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Application f31925a;
        public final Map<String, String> b = new HashMap();

        static {
            t2o.a(408944651);
            t2o.a(613416995);
        }

        public a(Application application) {
            this.f31925a = application;
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
                File file = new File(this.f31925a.getFilesDir(), "fastsp.db");
                if (!a(ob9.a().b(file), map)) {
                    ob9.a().c(map, file);
                }
            } catch (Throwable th) {
                uhh.d(th);
            }
        }

        @Override // tb.obk
        public void onConfigUpdate(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
                return;
            }
            Map<String, String> configs = OrangeConfig.getInstance().getConfigs("FastSp");
            if (configs != null && configs.size() > 0) {
                ((HashMap) this.b).putAll(configs);
                b(this.b);
            }
        }
    }

    static {
        t2o.a(408944650);
    }

    public y9l(Application application) {
        this.f31924a = application;
    }

    public static y9l a(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (y9l) ipChange.ipc$dispatch("94b8fc98", new Object[]{application});
        }
        return new y9l(application);
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("207f96ba", new Object[]{this});
            return;
        }
        OrangeConfig.getInstance().getConfigs("FastSp");
        OrangeConfig.getInstance().registerListener(new String[]{"FastSp"}, new a(this.f31924a), true);
    }
}
