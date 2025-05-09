package tb;

import android.taobao.windvane.config.WVConfigManager;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class btw implements ipb {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile btw c = null;

    /* renamed from: a  reason: collision with root package name */
    public String f16627a = "";
    public final AtomicBoolean b = new AtomicBoolean(false);

    static {
        t2o.a(989855795);
        t2o.a(989855775);
    }

    public static btw c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (btw) ipChange.ipc$dispatch("2743226a", new Object[0]);
        }
        if (c == null) {
            synchronized (btw.class) {
                try {
                    if (c == null) {
                        c = new btw();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return c;
    }

    @Override // tb.ipb
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5d449d5", new Object[]{this, str});
            return;
        }
        f(str);
        vpw.b();
        if (vpw.commonConfig.A0) {
            xg4.n(WVConfigManager.SPNAME_CONFIG, "WindVane_URL_configwv-data", str);
        } else {
            xg4.m(WVConfigManager.SPNAME_CONFIG, "WindVane_URL_configwv-data", str);
        }
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("763f78ed", new Object[]{this});
        }
        return this.f16627a;
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("563df8f4", new Object[]{this})).booleanValue();
        }
        return this.b.get();
    }

    public void e() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else if (this.b.compareAndSet(false, true)) {
            vpw.b();
            if (vpw.commonConfig.A0) {
                str = xg4.j(WVConfigManager.SPNAME_CONFIG, "WindVane_URL_configwv-data");
            } else {
                str = xg4.i(WVConfigManager.SPNAME_CONFIG, "WindVane_URL_configwv-data");
            }
            f(str);
        }
    }

    public final boolean f(String str) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f758f4aa", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            jSONObject = new JSONObject(str);
        } catch (JSONException e) {
            v7t.d("WVURLConfig", x74.i(e));
            jSONObject = null;
        }
        if (jSONObject == null) {
            return false;
        }
        String optString = jSONObject.optString("url_patterns", "");
        String optString2 = jSONObject.optString("url_rules", "");
        String optString3 = jSONObject.optString("api_group", "");
        this.f16627a = jSONObject.optString("forbiddenDomainRedirectURL", "https://h5.m.taobao.com/forbidden_error.html");
        ftw.f().w(optString, optString2, optString3, false);
        if (!TextUtils.isEmpty(this.f16627a) && ftw.f().m(this.f16627a)) {
            this.f16627a = "";
        }
        return true;
    }
}
