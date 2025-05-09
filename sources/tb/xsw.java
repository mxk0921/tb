package tb;

import android.taobao.windvane.config.WVConfigManager;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.uc.webview.export.extension.GlobalSettings;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class xsw implements ipb {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile xsw b = null;
    public static final ysw configData = new ysw();

    /* renamed from: a  reason: collision with root package name */
    public volatile boolean f31587a = false;

    static {
        t2o.a(989855793);
        t2o.a(989855775);
    }

    public static xsw b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xsw) ipChange.ipc$dispatch("2fcbbfac", new Object[0]);
        }
        if (b == null) {
            synchronized (xsw.class) {
                try {
                    if (b == null) {
                        b = new xsw();
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
        e(str);
        xg4.m(WVConfigManager.SPNAME_CONFIG, "uc_corewv-data", str);
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("563df8f4", new Object[]{this})).booleanValue();
        }
        return this.f31587a;
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else if (!this.f31587a) {
            synchronized (this) {
                try {
                    if (!this.f31587a) {
                        e(xg4.i(WVConfigManager.SPNAME_CONFIG, "uc_corewv-data"));
                        this.f31587a = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final boolean e(String str) {
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
        } catch (JSONException unused) {
            jSONObject = null;
        }
        if (jSONObject != null) {
            try {
                Iterator<String> keys = jSONObject.keys();
                ysw yswVar = configData;
                yswVar.f32336a = jSONObject.optInt("webMultiPolicy", yswVar.f32336a);
                yswVar.b = jSONObject.optInt("gpuMultiPolicy", yswVar.b);
                yswVar.c = jSONObject.optBoolean("openUCExperiment", yswVar.c);
                while (keys != null) {
                    if (!keys.hasNext()) {
                        break;
                    }
                    String next = keys.next();
                    String optString = jSONObject.optString(next);
                    v7t.d("WVUCCoreConfig", "WVUCCoreConfig key=" + next + " value=" + optString);
                    GlobalSettings.set(next, optString);
                }
                return true;
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return false;
    }
}
