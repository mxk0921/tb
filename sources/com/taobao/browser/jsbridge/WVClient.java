package com.taobao.browser.jsbridge;

import android.net.Uri;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import org.json.JSONException;
import org.json.JSONObject;
import tb.jm2;
import tb.kpw;
import tb.nsw;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class WVClient extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(619708525);
    }

    public static /* synthetic */ Object ipc$super(WVClient wVClient, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/browser/jsbridge/WVClient");
    }

    public final void open(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3a52d18", new Object[]{this, str, wVCallBackContext});
            return;
        }
        nsw nswVar = new nsw();
        try {
            String optString = new JSONObject(str).optString("url", "");
            jm2.b().e();
            if (jm2.b().c(optString)) {
                nswVar.b("msg", "This is intercepted!!!");
                wVCallBackContext.error(nswVar);
            } else if (Nav.from(this.mContext).allowEscape().toUri(Uri.parse(optString))) {
                wVCallBackContext.success();
            } else {
                nswVar.b("msg", "Nav error");
                wVCallBackContext.error(nswVar);
            }
        } catch (JSONException unused) {
            nswVar.b("msg", "JSON parse error");
            wVCallBackContext.error();
        }
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (!"open".equals(str)) {
            return false;
        }
        open(str2, wVCallBackContext);
        return true;
    }
}
