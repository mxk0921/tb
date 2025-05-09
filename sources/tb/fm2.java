package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.browser.config.BrowserConfigManager;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class fm2 implements ipb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ORANGE_GROUP_NAME = "group_common_browser";

    /* renamed from: a  reason: collision with root package name */
    public final AtomicBoolean f19403a = new AtomicBoolean(false);
    public static final gm2 commonConfig = new gm2();
    public static volatile fm2 b = null;

    static {
        t2o.a(619708481);
        t2o.a(989855775);
    }

    public static fm2 b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fm2) ipChange.ipc$dispatch("d31b38e1", new Object[0]);
        }
        if (b == null) {
            synchronized (fm2.class) {
                try {
                    if (b == null) {
                        b = new fm2();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b;
    }

    @Override // tb.ipb
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5d449d5", new Object[]{this, str});
            return;
        }
        d(str);
        xg4.m("browser_main_config", "common—wv-data", str);
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else if (this.f19403a.compareAndSet(false, true)) {
            d(xg4.i("browser_main_config", "common—wv-data"));
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f344cd24", new Object[]{this});
            return;
        }
        Map<String, String> b2 = j9l.b("group_common_browser");
        v7t.d("BrowserCommonConfig", "group_common_browser map=" + b2);
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, String> entry : b2.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
            jSONObject.put("appVersion", yaa.f().b());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        BrowserConfigManager.a().c("group_common_browser", jSONObject.toString());
        v7t.i("WVConfig", "receive name=[group_common_browser]; config=[" + jSONObject.toString() + "]");
    }

    public final int d(String str) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f758f499", new Object[]{this, str})).intValue();
        }
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            jSONObject = new JSONObject(str);
        } catch (JSONException unused) {
            jSONObject = null;
        }
        if (jSONObject == null) {
            return 0;
        }
        gm2 gm2Var = commonConfig;
        gm2Var.f20085a = jSONObject.optBoolean("fixAfcBug", gm2Var.f20085a);
        gm2Var.b = jSONObject.optBoolean("fixAfcBug2", gm2Var.b);
        gm2Var.c = jSONObject.optBoolean("fixAfcBugForAll", gm2Var.c);
        gm2Var.d = jSONObject.optBoolean("fixAfcBugForAll2", gm2Var.d);
        gm2Var.g = jSONObject.optString("browserFragmentRegex", gm2Var.g);
        gm2Var.h = jSONObject.optBoolean("enableOldNav", gm2Var.h);
        gm2Var.e = jSONObject.optBoolean("fixAfcBug3", gm2Var.e);
        gm2Var.f = jSONObject.optBoolean("fixAfcBug4", gm2Var.f);
        gm2Var.i = jSONObject.optBoolean("fixCheckToBrowser", gm2Var.i);
        gm2Var.j = jSONObject.optBoolean("fixMultiPictureChooser", gm2Var.j);
        gm2Var.k = jSONObject.optBoolean("newShopUrlFilter2", gm2Var.k);
        gm2Var.l = jSONObject.optBoolean("useACCSService", gm2Var.l);
        gm2Var.m = jSONObject.optBoolean("__enable_switch_check_mainactivity__", gm2Var.m);
        gm2Var.n = jSONObject.optBoolean("isFixWeakConnectionRefresh", gm2Var.n);
        gm2Var.o = jSONObject.optBoolean("enableFeatureMonitor", gm2Var.o);
        gm2Var.p = jSONObject.optBoolean("enableWebViewInitAsync", gm2Var.p);
        gm2Var.q = jSONObject.optBoolean("enableDevTools", gm2Var.q);
        boolean optBoolean = jSONObject.optBoolean("__disable_hardware_accelerated_browser__", gm2Var.r);
        gm2Var.r = optBoolean;
        gm2Var.s = jSONObject.optBoolean("__disable_fragment_restore__", optBoolean);
        gm2Var.t = jSONObject.optBoolean("enable_input_file_capture2", gm2Var.t);
        gm2Var.u = jSONObject.optBoolean("enableNavWithShopUrlFilter", gm2Var.u);
        gm2Var.v = jSONObject.optBoolean("enableUseSysWebView", gm2Var.v);
        gm2Var.w = jSONObject.optBoolean("enableFixLoadUrlTwice", gm2Var.w);
        gm2Var.x = jSONObject.optBoolean("enableAddBrowserCreateTime", gm2Var.x);
        gm2Var.y = jSONObject.optBoolean("enableSkipVideoFilter", gm2Var.y);
        gm2Var.z = jSONObject.optBoolean("enableDetachWebViewBeforeDestroy", gm2Var.z);
        gm2Var.A = jSONObject.optBoolean("enableSkipSplashFragment", gm2Var.A);
        gm2Var.B = jSONObject.optBoolean("enableReportRum", gm2Var.B);
        gm2Var.C = jSONObject.optBoolean("enableFixErrorPageTitle", gm2Var.C);
        return jSONObject.length();
    }
}
