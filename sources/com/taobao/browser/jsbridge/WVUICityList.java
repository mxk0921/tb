package com.taobao.browser.jsbridge;

import android.app.Activity;
import android.content.Intent;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.webview.IWVWebView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.browser.jsbridge.ui.CityList;
import com.taobao.browser.jsbridge.ui.CityModel;
import com.taobao.browser.utils.BrowserUtil;
import tb.kpw;
import tb.nsw;
import tb.r4p;
import tb.t2o;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class WVUICityList extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final int CHOOSE_CITY = 4999;
    private WVCallBackContext mCallback = null;

    static {
        t2o.a(619708532);
    }

    public static /* synthetic */ Object ipc$super(WVUICityList wVUICityList, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/browser/jsbridge/WVUICityList");
    }

    @Override // tb.kpw
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        WVCallBackContext wVCallBackContext = this.mCallback;
        if (wVCallBackContext == null || i != 4999) {
            return;
        }
        if (i2 == -1) {
            CityModel cityModel = (CityModel) intent.getExtras().get(CityList.CITY_INFO);
            if (cityModel != null) {
                nsw nswVar = new nsw();
                nswVar.b(r4p.KEY_CITY_CODE, cityModel.getCityId());
                nswVar.b(r4p.KEY_CITY_NAME, cityModel.getCityName());
                if (!cityModel.getLongitude().equals("{}")) {
                    nswVar.b("longitude", cityModel.getLongitude());
                    nswVar.b("latitude", cityModel.getLatitude());
                }
                this.mCallback.success(nswVar);
                return;
            }
            return;
        }
        wVCallBackContext.error();
    }

    public final void showCityList(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66c4be94", new Object[]{this, str, wVCallBackContext});
            return;
        }
        this.mCallback = wVCallBackContext;
        Intent intent = new Intent();
        intent.setClass(this.mContext, CityList.class);
        ((Activity) this.mContext).startActivityForResult(intent, 4999);
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (!"showCityList".equals(str)) {
            return false;
        }
        String str3 = BrowserUtil.f10259a;
        IWVWebView iWVWebView = this.mWebView;
        BrowserUtil.b("WVUICityList", str3, str, iWVWebView != null ? iWVWebView.getUrl() : null, null);
        showCityList(str2, wVCallBackContext);
        return true;
    }
}
