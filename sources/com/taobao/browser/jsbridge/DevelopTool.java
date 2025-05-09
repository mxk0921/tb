package com.taobao.browser.jsbridge;

import android.content.Context;
import android.taobao.windvane.extra.WVSchemeProcessor;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.api.WVDevelopTool;
import android.taobao.windvane.webview.IWVWebView;
import android.text.TextUtils;
import anetwork.channel.config.NetworkConfigCenter;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.spdu.httpdns.HttpDns;
import com.spdu.httpdns.HttpDnsOrigin;
import com.taobao.browser.nav.BrowserActivityProcessor;
import com.taobao.orange.ConfigCenter;
import org.json.JSONException;
import tb.arw;
import tb.nsw;
import tb.pod;
import tb.psw;
import tb.t2o;
import tb.v7t;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class DevelopTool extends WVDevelopTool {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static boolean isHttpsOn = true;
    private String TAG = "DevelopTool";

    static {
        t2o.a(619708507);
    }

    private void demoteACCS(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48c96534", new Object[]{this, wVCallBackContext, str});
            return;
        }
        String str2 = this.TAG;
        v7t.d(str2, "demoteACCS can't use" + str);
        nsw nswVar = new nsw();
        nswVar.b("msg", "can't use demoteACCS now");
        wVCallBackContext.error(nswVar);
    }

    public static /* synthetic */ Object ipc$super(DevelopTool developTool, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1811143243) {
            super.initialize((Context) objArr[0], (IWVWebView) objArr[1]);
            return null;
        } else if (hashCode == -1126948911) {
            return new Boolean(super.execute((String) objArr[0], (String) objArr[1], (WVCallBackContext) objArr[2]));
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/browser/jsbridge/DevelopTool");
        }
    }

    private void isDemoteACCS(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77371d7e", new Object[]{this, wVCallBackContext, str});
            return;
        }
        nsw nswVar = new nsw();
        nswVar.b("msg", "can't use isDemoteACCS know");
        wVCallBackContext.error(nswVar);
    }

    private void isDemoteSPDY(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbf7751e", new Object[]{this, wVCallBackContext, str});
            return;
        }
        nsw nswVar = new nsw();
        nswVar.b("demote", String.valueOf(!NetworkConfigCenter.isSpdyEnabled()));
        wVCallBackContext.success(nswVar);
    }

    private void setTMSWhiteList(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84f8967d", new Object[]{this, str, wVCallBackContext});
            return;
        }
        try {
            JSONObject parseObject = JSON.parseObject(str);
            if (parseObject != null) {
                String string = parseObject.getString("urlList");
                if (!TextUtils.isEmpty(string)) {
                    BrowserActivityProcessor.TMS_WHITE_LIST = string;
                    wVCallBackContext.success();
                    return;
                }
            }
        } catch (Exception unused) {
        }
        wVCallBackContext.error();
    }

    public final void configCenterData(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0b7e88f", new Object[]{this, str, wVCallBackContext});
            return;
        }
        nsw nswVar = new nsw();
        nswVar.h(ConfigCenter.getInstance().getIndexAndConfigs());
        wVCallBackContext.success(nswVar);
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

    public final void isHTTPSEnabled(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("350496e", new Object[]{this, str, wVCallBackContext});
            return;
        }
        nsw nswVar = new nsw();
        if (!isHttpsOn) {
            nswVar.b("enabled", "false");
        } else {
            nswVar.b("enabled", "true");
        }
        wVCallBackContext.success(nswVar);
    }

    public final void setHTTPSEnabled(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96e87ea6", new Object[]{this, str, wVCallBackContext});
            return;
        }
        try {
            boolean optBoolean = new org.json.JSONObject(str).optBoolean("enable", true);
            isHttpsOn = optBoolean;
            if (!optBoolean) {
                NetworkConfigCenter.setSSLEnabled(false);
                psw.b(new arw());
            } else {
                NetworkConfigCenter.setSSLEnabled(true);
                psw.b(new WVSchemeProcessor());
            }
            wVCallBackContext.success();
        } catch (Exception unused) {
            wVCallBackContext.error();
        }
    }

    private void setHostIP(WVCallBackContext wVCallBackContext, String str) {
        org.json.JSONObject jSONObject;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5badd99f", new Object[]{this, wVCallBackContext, str});
            return;
        }
        String str2 = null;
        try {
            jSONObject = new org.json.JSONObject(str);
            str2 = jSONObject.getString("host");
        } catch (Exception unused) {
            str2 = null;
        }
        try {
            str2 = jSONObject.getString(pod.IP);
            i = jSONObject.getInt("port");
        } catch (Exception unused2) {
            str2 = str2;
            wVCallBackContext.error("HY_PARAM_ERR");
            HttpDns.getInstance().setTestOrigin(str2, new HttpDnsOrigin(str2, i, (System.currentTimeMillis() / 1000) + 86400));
            wVCallBackContext.success();
        }
        HttpDns.getInstance().setTestOrigin(str2, new HttpDnsOrigin(str2, i, (System.currentTimeMillis() / 1000) + 86400));
        wVCallBackContext.success();
    }

    @Override // android.taobao.windvane.jsbridge.api.WVDevelopTool, tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if ("isSPDYDemote".equals(str)) {
            isDemoteSPDY(wVCallBackContext, str2);
        } else if ("setSPDYDemote".equals(str)) {
            demoteSPDY(wVCallBackContext, str2);
        }
        if ("isACCSEnabled".equals(str)) {
            isDemoteACCS(wVCallBackContext, str2);
        } else if ("setACCSEnabled".equals(str)) {
            demoteACCS(wVCallBackContext, str2);
        } else if ("setHostIP".equals(str)) {
            setHostIP(wVCallBackContext, str2);
        } else if ("isHTTPSEnabled".equals(str)) {
            isHTTPSEnabled(str2, wVCallBackContext);
        } else if ("setHTTPSEnabled".equals(str)) {
            setHTTPSEnabled(str2, wVCallBackContext);
        } else if ("configCenterData".equals(str)) {
            configCenterData(str2, wVCallBackContext);
        } else if (!"setTMSWhiteList".equals(str)) {
            return super.execute(str, str2, wVCallBackContext);
        } else {
            setTMSWhiteList(str2, wVCallBackContext);
        }
        return true;
    }

    private void demoteSPDY(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d89bcd4", new Object[]{this, wVCallBackContext, str});
            return;
        }
        try {
            String string = new org.json.JSONObject(str).getString("demote");
            if ("true".equals(string)) {
                NetworkConfigCenter.setSpdyEnabled(false);
            } else if ("false".equals(string)) {
                NetworkConfigCenter.setSpdyEnabled(true);
            }
            wVCallBackContext.success();
        } catch (JSONException unused) {
            String str2 = this.TAG;
            v7t.d(str2, "demoteSPDY: param parse to JSON error, param=" + str);
            wVCallBackContext.error();
        }
    }
}
