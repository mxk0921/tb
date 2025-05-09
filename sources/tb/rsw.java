package tb;

import android.taobao.windvane.webview.IWVWebView;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class rsw extends ktw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(989856187);
    }

    public static /* synthetic */ Object ipc$super(rsw rswVar, String str, Object... objArr) {
        if (str.hashCode() == 373705958) {
            return super.d((IWVWebView) objArr[0], (String) objArr[1]);
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in android/taobao/windvane/filter/WVSecurityFilter");
    }

    @Override // tb.ktw
    public ltw d(IWVWebView iWVWebView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ltw) ipChange.ipc$dispatch("16464ce6", new Object[]{this, iWVWebView, str});
        }
        if (v7t.h()) {
            v7t.a("WVSecurityFilter", "WVSecurityFilter shouldInterceptRequest url =" + str);
        }
        if (TextUtils.isEmpty(str) || str.length() <= 6 || !str.substring(0, 7).toLowerCase().startsWith("file://")) {
            return super.d(iWVWebView, str);
        }
        return new ltw("", "utf-8", null, null);
    }
}
