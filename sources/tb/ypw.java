package tb;

import android.taobao.windvane.config.WVConfigManager;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ypw implements ipb {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile ypw c = null;

    /* renamed from: a  reason: collision with root package name */
    public volatile boolean f32272a = false;
    public String b = "";

    static {
        t2o.a(989855790);
        t2o.a(989855775);
    }

    public static ypw b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ypw) ipChange.ipc$dispatch("4cdec495", new Object[0]);
        }
        if (c == null) {
            synchronized (ypw.class) {
                try {
                    if (c == null) {
                        c = new ypw();
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
        v7t.i("WVCookieConfig", "receive cookie config = [" + str + "]");
        e(str);
        xg4.m(WVConfigManager.SPNAME_CONFIG, WVConfigManager.CONFIGNAME_COOKIE, str);
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("563df8f4", new Object[]{this})).booleanValue();
        }
        return this.f32272a;
    }

    public final void e(String str) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f758f4a6", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException unused) {
                jSONObject = null;
            }
            if (jSONObject != null) {
                this.b = jSONObject.optString("cookieBlackList", this.b);
            }
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else if (!this.f32272a) {
            synchronized (this) {
                try {
                    if (!this.f32272a) {
                        e(xg4.i(WVConfigManager.SPNAME_CONFIG, WVConfigManager.CONFIGNAME_COOKIE));
                        this.f32272a = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
