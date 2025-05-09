package android.taobao.windvane.extra.performance;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import tb.bka;
import tb.bsw;
import tb.sqw;
import tb.t2o;
import tb.v7t;
import tb.vpw;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class WVErrorManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "WVErrorManager";

    static {
        t2o.a(989855993);
    }

    public void reportJSError(String str, String str2, String str3, String str4, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37294e5a", new Object[]{this, str, str2, str3, str4, new Boolean(z)});
            return;
        }
        if (!TextUtils.isEmpty(str) && bka.c().b(str) != null) {
            v7t.a(TAG, "found grey page: " + str);
        }
        String b = bsw.b().a().b();
        if (b != null && Math.random() >= Double.parseDouble(b)) {
            return;
        }
        if (!vpw.commonConfig.h0) {
            sqw.b("WINDVANE_JS_ERROR", str, str3, str2, str4, str);
        } else if (!z) {
            sqw.b("WINDVANE_JS_ERROR", str, str3, str2, str4, str);
            v7t.d(TAG, "notUCWebview upload jserror errorMessage:" + str2);
        } else if (!TextUtils.isEmpty(str2) || !TextUtils.isEmpty(str3)) {
            sqw.b("WINDVANE_JS_ERROR", str, str3, str2, str4, str);
            v7t.d(TAG, "isUCWebview upload jserror message:" + str2 + " stack:" + str3);
        }
    }
}
