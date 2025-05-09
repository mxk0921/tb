package com.taobao.browser.jsbridge;

import android.content.Context;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.webview.IWVWebView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.location.client.TBLocationClient;
import com.taobao.location.common.TBLocationDTO;
import tb.kpw;
import tb.nsw;
import tb.r4p;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class WVTBLocation extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(619708531);
    }

    public static /* synthetic */ Object ipc$super(WVTBLocation wVTBLocation, String str, Object... objArr) {
        if (str.hashCode() == -1811143243) {
            super.initialize((Context) objArr[0], (IWVWebView) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/browser/jsbridge/WVTBLocation");
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if ("getCachedCity".equals(str)) {
            getCachedCity(str2, wVCallBackContext);
        } else if (!"getCachedLocation".equals(str)) {
            return false;
        } else {
            getCachedLocation(str2, wVCallBackContext);
        }
        return true;
    }

    public void getCachedCity(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac5fc931", new Object[]{this, str, wVCallBackContext});
            return;
        }
        TBLocationDTO d = TBLocationClient.d();
        if (d != null) {
            nsw nswVar = new nsw();
            nswVar.b(r4p.KEY_CITY_CODE, d.getCityCode());
            nswVar.b(r4p.KEY_CITY_NAME, d.getCityName());
            wVCallBackContext.success(nswVar);
            return;
        }
        wVCallBackContext.error();
    }

    public void getCachedLocation(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa0bcefb", new Object[]{this, str, wVCallBackContext});
            return;
        }
        TBLocationDTO d = TBLocationClient.d();
        if (d != null) {
            nsw nswVar = new nsw();
            nswVar.b("latitude", d.getLatitude());
            nswVar.b("longitude", d.getLongitude());
            wVCallBackContext.success(nswVar);
            return;
        }
        wVCallBackContext.error();
    }

    @Override // tb.kpw
    public void initialize(Context context, IWVWebView iWVWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("940c25b5", new Object[]{this, context, iWVWebView});
        } else {
            super.initialize(context, iWVWebView);
        }
    }
}
