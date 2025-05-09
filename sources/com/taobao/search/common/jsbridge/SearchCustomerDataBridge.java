package com.taobao.search.common.jsbridge;

import android.app.Activity;
import android.os.Bundle;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.WindVaneInterface;
import android.util.Log;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.uc.webview.export.extension.UCCore;
import org.json.JSONObject;
import tb.h1p;
import tb.kpw;
import tb.slo;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class SearchCustomerDataBridge extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String API_NAME = "customerDataJSBridge";

    static {
        t2o.a(815792178);
    }

    public static /* synthetic */ Object ipc$super(SearchCustomerDataBridge searchCustomerDataBridge, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/common/jsbridge/SearchCustomerDataBridge");
    }

    @WindVaneInterface
    public final void searchAgain(String str) {
        Bundle bundle;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1fcdf29", new Object[]{this, str});
            return;
        }
        try {
            String optString = new JSONObject(str).optString("isChanged");
            ((Activity) this.mContext).finish();
            if (slo.VALUE_YES.equals(optString)) {
                bundle = new Bundle();
                bundle.putString(h1p.KEY_IS_REFRESH, "true");
            } else {
                bundle = null;
            }
            Nav.from(this.mContext).withFlags(UCCore.VERIFY_POLICY_PAK_QUICK).withExtras(bundle).toUri(h1p.SEARCHLIST_H5);
        } catch (Exception unused) {
            Log.e("SearchCustomBridge", "search again error");
        }
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if ("finishEdit".equals(str)) {
            searchAgain(str2);
            return true;
        } else if (!"searchAgain".equals(str)) {
            return false;
        } else {
            searchAgain(str2);
            return true;
        }
    }
}
