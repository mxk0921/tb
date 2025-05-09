package tb;

import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class cr3 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int API_CODE_INVALID = -1;
    public static final int API_CODE_NO_CHECK = 0;
    public static final int API_CODE_SYSTEM = 1;
    public static final String SP_API_CODE_KEY = "checkStatusApiCode";
    public static final String SP_NAME = "aliprivacy_sp";

    /* renamed from: a  reason: collision with root package name */
    public int f17255a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class b {
        public static final cr3 INSTANCE = new cr3();
    }

    public static cr3 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cr3) ipChange.ipc$dispatch("cdb1302f", new Object[0]);
        }
        return b.INSTANCE;
    }

    public static void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0b193b", new Object[]{str});
        } else {
            a().e(str);
        }
    }

    public m8d b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m8d) ipChange.ipc$dispatch("3aa564e2", new Object[]{this});
        }
        if (this.f17255a == -1) {
            f();
        }
        g01.a("CheckerFactory", "obtainChecker:" + this.f17255a);
        if (Build.VERSION.SDK_INT < 23 || this.f17255a == 0) {
            return new x3k();
        }
        return new znh();
    }

    public final synchronized void d() {
        int i = 1;
        synchronized (this) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("aecba319", new Object[]{this});
                return;
            }
            try {
                if (vg8.a() != null) {
                    SharedPreferences.Editor edit = vg8.a().getSharedPreferences(SP_NAME, 0).edit();
                    int i2 = this.f17255a;
                    if (i2 != -1) {
                        i = i2;
                    }
                    edit.putInt(SP_API_CODE_KEY, i).apply();
                }
            } catch (Throwable unused) {
            }
        }
    }

    public final synchronized void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33c4a657", new Object[]{this});
            return;
        }
        try {
            if (vg8.a() != null) {
                this.f17255a = vg8.a().getSharedPreferences(SP_NAME, 0).getInt(SP_API_CODE_KEY, 1);
            }
        } catch (Throwable unused) {
        }
    }

    public cr3() {
        this.f17255a = -1;
    }

    public final void e(String str) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ca5b5bc", new Object[]{this, str});
            return;
        }
        g01.a("CheckerFactory", str);
        try {
            try {
                optJSONObject = new JSONObject(str).optJSONObject(xbk.a().f31270a);
            } finally {
                d();
            }
        } catch (Throwable unused) {
            g01.c("CheckerFactory", "update config failed");
            this.f17255a = 1;
        }
        if (optJSONObject == null) {
            this.f17255a = 1;
            return;
        }
        String optString = optJSONObject.optString("versionProp");
        if (TextUtils.isEmpty(optString) || (optJSONObject2 = optJSONObject.optJSONObject(xbk.a().a(optString))) == null) {
            JSONObject optJSONObject3 = optJSONObject.optJSONObject("default");
            if (optJSONObject3 != null) {
                this.f17255a = optJSONObject3.optInt(SP_API_CODE_KEY);
            }
            return;
        }
        this.f17255a = optJSONObject2.optInt(SP_API_CODE_KEY);
    }
}
