package tb;

import android.app.Application;
import androidx.core.util.Pair;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.log.RSoLog;
import com.taobao.orange.OrangeConfig;
import java.util.Arrays;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class bh4 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SP_KEY_INDEX_UPDATED_APP_VER = "index_updated_app_ver";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements obk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Application f16383a;

        public a(Application application) {
            this.f16383a = application;
        }

        @Override // tb.obk
        public void onConfigUpdate(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
            } else if (map == null || Boolean.parseBoolean(map.get("fromCache"))) {
                RSoLog.d("config ->  ignore this update, orange update from cache, this is useless. " + str);
            } else {
                try {
                    String a2 = bh4.a();
                    RSoLog.d("config ->  update enter " + str + a2);
                    if ("SwallowsRemoteSoSwitch".equals(str)) {
                        bh4.b(this.f16383a);
                    } else if ("SwallowsRemoteSoIndex".equals(str)) {
                        bh4.c(this.f16383a, a2);
                    }
                } catch (Throwable th) {
                    rbn.g("config ->  updateLocalConfigs", th);
                }
            }
        }
    }

    public static /* synthetic */ String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7022ea09", new Object[0]);
        }
        return d();
    }

    public static /* synthetic */ void b(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efbc5327", new Object[]{application});
        } else {
            i(application);
        }
    }

    public static /* synthetic */ void c(Application application, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffd14750", new Object[]{application, str});
        } else {
            h(application, str);
        }
    }

    public static String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f0882642", new Object[0]);
        }
        return qts.a("_");
    }

    public static String e(Application application, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d65fd1ba", new Object[]{application, str});
        }
        try {
            String e = pno.e(application, "SwallowsRemoteSoIndex", SP_KEY_INDEX_UPDATED_APP_VER, "");
            String d = d();
            if (!d.equalsIgnoreCase(e)) {
                RSoLog.d("config -> skip load index data, appVersion not matchappVerWithConfig=" + e + ",  currentAppVer=" + d);
                return str;
            }
            String e2 = pno.e(application, "SwallowsRemoteSoIndex", "key_remote_so_index_string", null);
            if (!trq.c(e2) && !"empty".equalsIgnoreCase(e2)) {
                RSoLog.d("config ->  readCustomContent from orange, success.,  appVerWithConfig=" + e + ",  currentAppVer=" + d);
                return e2;
            }
            RSoLog.d("config ->  skip load index data, it is empty");
            return str;
        } catch (Throwable th) {
            rbn.g("config -> load index data from remote", th);
            return str;
        }
    }

    public static void f(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb566fd3", new Object[]{application});
            return;
        }
        OrangeConfig.getInstance().registerListener(new String[]{"SwallowsRemoteSoSwitch", "SwallowsRemoteSoIndex"}, new a(application), true);
        Map<String, String> a2 = gck.a("SwallowsRemoteSoSwitch");
        String b = gck.b("SwallowsRemoteSoIndex", "");
        RSoLog.d("config ->  default config =" + a2 + "  ->  " + b);
    }

    public static void h(Application application, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f434371", new Object[]{application, str});
            return;
        }
        String b = gck.b("SwallowsRemoteSoIndex", null);
        try {
            if (trq.d("empty", b)) {
                boolean g = g(application, "", "");
                RSoLog.d("config ->  updated done. index, reset custom & ver, succ=" + g);
                return;
            }
            String string = JSON.parseObject(b).getString("appVersion");
            if (!trq.d(str, string)) {
                rbn.e("config->index,version conflict", "currentAppVer=" + str + ", appVersion=" + string + ", custom=" + b);
                g(application, "", "");
                return;
            }
            boolean g2 = g(application, b, str);
            RSoLog.d("config ->  updated done. index, set appVersion=" + string + ", succ=" + g2);
        } catch (Throwable unused) {
            rbn.e("config->index,error", "currentAppVer=" + str + ", appVersion=unknown, custom=" + b);
            g(application, "", "");
        }
    }

    public static void i(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad4988e3", new Object[]{application});
            return;
        }
        Map<String, String> a2 = gck.a("SwallowsRemoteSoSwitch");
        pno.f(application, "SwallowsRemoteSoSwitch", a2);
        RSoLog.d("config -> updated done. orange allKVs=" + a2);
    }

    public static boolean g(Application application, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a8b013ac", new Object[]{application, str, str2})).booleanValue();
        }
        return pno.h(application, "SwallowsRemoteSoIndex", Arrays.asList(Pair.create("key_remote_so_index_string", str), Pair.create(SP_KEY_INDEX_UPDATED_APP_VER, str2)));
    }
}
