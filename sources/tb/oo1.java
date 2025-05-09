package tb;

import android.app.Application;
import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class oo1 implements w24 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ORANGE_NAMESPACE = "BadTokenOrangeCommand";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements obk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Application f25522a;
        public final Map<String, String> b = new HashMap();

        public a(Application application) {
            this.f25522a = application;
        }

        public final void a(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6c644b96", new Object[]{this, map});
            } else if (map != null && map.size() > 0) {
                b(map);
            }
        }

        public final void b(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fc0e9d1", new Object[]{this, map});
                return;
            }
            try {
                SharedPreferences.Editor edit = this.f25522a.getSharedPreferences(oo1.ORANGE_NAMESPACE, 0).edit();
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    edit.putString(entry.getKey(), entry.getValue());
                }
                edit.apply();
            } catch (Throwable th) {
                xhh.c(th);
            }
        }

        @Override // tb.obk
        public void onConfigUpdate(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
                return;
            }
            Map<String, String> configs = OrangeConfig.getInstance().getConfigs(oo1.ORANGE_NAMESPACE);
            if (configs != null && configs.size() > 0) {
                ((HashMap) this.b).putAll(configs);
                a(this.b);
            }
        }
    }

    @Override // tb.w24
    public void a(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8140e3", new Object[]{this, application});
            return;
        }
        OrangeConfig.getInstance().getConfigs(ORANGE_NAMESPACE);
        OrangeConfig.getInstance().registerListener(new String[]{ORANGE_NAMESPACE}, new a(application), true);
    }
}
