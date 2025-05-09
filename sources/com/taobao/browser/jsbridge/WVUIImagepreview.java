package com.taobao.browser.jsbridge;

import android.os.Bundle;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.WindVaneInterface;
import android.taobao.windvane.webview.IWVWebView;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.browser.utils.BrowserUtil;
import tb.kpw;
import tb.nsw;
import tb.t2o;
import tb.v7t;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class WVUIImagepreview extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "WVUIImagepreview";

    static {
        t2o.a(619708533);
    }

    public static /* synthetic */ Object ipc$super(WVUIImagepreview wVUIImagepreview, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/browser/jsbridge/WVUIImagepreview");
    }

    private boolean isEmpty(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a300898", new Object[]{this, str})).booleanValue();
        }
        if (str == null || "".equals(str)) {
            return true;
        }
        return false;
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        IWVWebView iWVWebView = this.mWebView;
        BrowserUtil.b(TAG, "preview", str, iWVWebView != null ? iWVWebView.getUrl() : null, null);
        if ("showImagepreview".equals(str)) {
            showImagepreview(wVCallBackContext, str2);
        } else if (!"showVerticalImagepreview".equals(str)) {
            return false;
        } else {
            showVerticalImagepreview(wVCallBackContext, str2);
        }
        return true;
    }

    @WindVaneInterface
    public void showImagepreview(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c391f438", new Object[]{this, wVCallBackContext, str});
        } else if (!isEmpty(str)) {
            try {
                JSONObject parseObject = JSON.parseObject(str);
                JSONArray jSONArray = parseObject.getJSONArray("images");
                String string = parseObject.getString("index");
                String[] strArr = new String[jSONArray.size()];
                for (int i = 0; i < jSONArray.size(); i++) {
                    strArr[i] = jSONArray.getString(i);
                }
                Bundle bundle = new Bundle();
                bundle.putStringArray("image_list_urls", strArr);
                bundle.putString("image_position", string);
                bundle.putString("fragmentClassName", "com.taobao.browser.fragment.HorizontalImageListFragment");
                Nav.from(this.mContext).withExtras(bundle).withFlags(268435456).toUri("taobao://go/FragmentContainerActivity");
            } catch (JSONException unused) {
                v7t.d(TAG, "WVUIDialog: param parse to JSON error, param=" + str);
                nsw nswVar = new nsw();
                nswVar.j("HY_PARAM_ERR");
                wVCallBackContext.error(nswVar);
            }
        }
    }

    @WindVaneInterface
    public void showVerticalImagepreview(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5720e4e", new Object[]{this, wVCallBackContext, str});
        } else if (!isEmpty(str)) {
            try {
                JSONArray jSONArray = JSON.parseObject(str).getJSONArray("images");
                String[] strArr = new String[jSONArray.size()];
                for (int i = 0; i < jSONArray.size(); i++) {
                    strArr[i] = jSONArray.getString(i);
                }
                Bundle bundle = new Bundle();
                bundle.putStringArray("image_list_urls", strArr);
                bundle.putString("fragmentClassName", "com.taobao.browser.fragment.ImageListFragment");
                Nav.from(this.mContext).withFlags(268435456).withExtras(bundle).toUri("taobao://go/FragmentContainerActivity");
            } catch (JSONException unused) {
                v7t.d(TAG, "WVUIDialog: param parse to JSON error, param=" + str);
                nsw nswVar = new nsw();
                nswVar.j("HY_PARAM_ERR");
                wVCallBackContext.error(nswVar);
            }
        }
    }
}
