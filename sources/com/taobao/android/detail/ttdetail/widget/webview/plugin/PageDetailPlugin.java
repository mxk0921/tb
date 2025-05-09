package com.taobao.android.detail.ttdetail.widget.webview.plugin;

import android.content.Context;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.webview.IWVWebView;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.widget.webview.DetailHybridWebView;
import tb.b5m;
import tb.kpw;
import tb.nf7;
import tb.t2o;
import tb.t4i;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class PageDetailPlugin extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PLUGIN_NAME = "Page_Detail";
    private nf7 mDetailExecutor;

    static {
        t2o.a(912263162);
    }

    public static float getScreenDensity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1f8f989d", new Object[0])).floatValue();
        }
        return b5m.z().a().getResources().getDisplayMetrics().density;
    }

    public static int getSize(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1a33e938", new Object[]{new Integer(i)})).intValue();
        }
        return (int) (i * getScreenDensity());
    }

    public static /* synthetic */ Object ipc$super(PageDetailPlugin pageDetailPlugin, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1811143243) {
            super.initialize((Context) objArr[0], (IWVWebView) objArr[1]);
            return null;
        } else if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/detail/ttdetail/widget/webview/plugin/PageDetailPlugin");
        }
    }

    @Override // tb.kpw
    public void initialize(Context context, IWVWebView iWVWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("940c25b5", new Object[]{this, context, iWVWebView});
            return;
        }
        super.initialize(context, iWVWebView);
        this.mDetailExecutor = new nf7();
    }

    @Override // tb.kpw, com.uc.webview.export.extension.IEmbedViewContainer.OnStateChangedListener
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else {
            super.onDestroy();
        }
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        nf7 nf7Var = this.mDetailExecutor;
        if (nf7Var != null && nf7Var.a(str, str2, wVCallBackContext)) {
            return true;
        }
        if ("addAppmonitor".equals(str)) {
            JSONObject parseObject = JSON.parseObject(str2);
            if (parseObject == null) {
                return false;
            }
            try {
                if (parseObject.containsKey("h5error") && "0".equals(parseObject.getString("h5error")) && parseObject.containsKey("errMsg")) {
                    parseObject.getString("errMsg");
                }
                return true;
            } catch (Exception unused) {
                return false;
            }
        } else {
            if ("setHeight".equals(str)) {
                JSONObject parseObject2 = JSON.parseObject(str2);
                if (parseObject2 != null && parseObject2.containsKey("height")) {
                    try {
                        int size = getSize(parseObject2.getIntValue("height"));
                        IWVWebView iWVWebView = this.mWebView;
                        if (iWVWebView instanceof DetailHybridWebView) {
                            ((DetailHybridWebView) iWVWebView).resizeHeight(size);
                            return true;
                        }
                    } catch (Throwable unused2) {
                    }
                }
                return false;
            }
            return t4i.a(str, str2, wVCallBackContext);
        }
    }
}
