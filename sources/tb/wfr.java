package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliLogInterface;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class wfr {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final wfr INSTANCE = new wfr();

    static {
        t2o.a(803209262);
    }

    public final void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87e6879b", new Object[]{this, str, str2});
            return;
        }
        ckf.g(str, "tag");
        ckf.g(str2, "message");
        "tbiContext_".concat(str);
        AliLogInterface c = jq0.c();
        if (c != null) {
            c.loge("tbiContext_".concat(str), str2);
        }
    }

    public final void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1486b29c", new Object[]{this, str, str2});
            return;
        }
        ckf.g(str, "tag");
        ckf.g(str2, "message");
        Log.e("tbiContext_".concat(str), str2);
        AliLogInterface c = jq0.c();
        if (c != null) {
            c.loge("tbiContext_".concat(str), str2);
        }
    }

    public final void c(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24f23ad9", new Object[]{this, str, str2, th});
            return;
        }
        ckf.g(str, "tag");
        ckf.g(str2, "message");
        ckf.g(th, "tr");
        Log.e("tbiContext_".concat(str), str2, th);
        AliLogInterface c = jq0.c();
        if (c != null) {
            c.loge("tbiContext_".concat(str), str2, th);
        }
    }

    public final void d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47075ea0", new Object[]{this, str, str2});
            return;
        }
        ckf.g(str, "tag");
        ckf.g(str2, "message");
        "tbiContext_".concat(str);
        AliLogInterface c = jq0.c();
        if (c != null) {
            c.loge("tbiContext_".concat(str), str2);
        }
    }
}
