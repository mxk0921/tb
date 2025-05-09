package com.taobao.browser.jsbridge;

import android.net.Uri;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.webview.IWVWebView;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.statistic.TBS;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import tb.h1p;
import tb.kpw;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class TBUserTrackHelper extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String mCarrier_Id;
    public String mSellerId;
    public String mYyzActParam;
    public String mYyzListParam;
    public String mYyzLocate;
    public String mYyzUrl;

    static {
        t2o.a(619708518);
    }

    public static /* synthetic */ Object ipc$super(TBUserTrackHelper tBUserTrackHelper, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/browser/jsbridge/TBUserTrackHelper");
    }

    public final void doEffectUsertrack(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ce68bd2", new Object[]{this, wVCallBackContext, str});
            return;
        }
        IWVWebView iWVWebView = this.mWebView;
        if (iWVWebView != null) {
            String url = iWVWebView.getUrl();
            if (!TextUtils.isEmpty(url)) {
                parseUrl(url);
            }
            String str2 = null;
            try {
                Map map = (Map) JSON.parseObject(str, Map.class);
                if (map != null) {
                    str2 = (String) map.get("listparam");
                }
            } catch (Exception unused) {
            }
            if (!TextUtils.isEmpty(str2)) {
                updatePageProperties(str2);
                wVCallBackContext.success();
                return;
            }
            wVCallBackContext.error();
        }
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (!"doEffectUsertrack".equals(str)) {
            return false;
        }
        doEffectUsertrack(wVCallBackContext, str2);
        return true;
    }

    public void setLogStat(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b02609b", new Object[]{this, str, str2, str3});
            return;
        }
        this.mYyzLocate = str;
        this.mYyzUrl = str2;
        this.mYyzActParam = str3;
    }

    private void parseUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea91574d", new Object[]{this, str});
            return;
        }
        this.mYyzUrl = str;
        for (String str2 : str.split("#")) {
            Uri parse = Uri.parse(str2);
            if (parse != null && parse.isHierarchical()) {
                String queryParameter = parse.getQueryParameter("locate");
                if (!TextUtils.isEmpty(queryParameter)) {
                    this.mYyzLocate = queryParameter;
                }
                String queryParameter2 = parse.getQueryParameter("actparam");
                if (!TextUtils.isEmpty(queryParameter2)) {
                    this.mYyzActParam = queryParameter2;
                }
                String queryParameter3 = parse.getQueryParameter(h1p.LIST_PARAM_KEY);
                if (!TextUtils.isEmpty(queryParameter3)) {
                    this.mYyzListParam = queryParameter3;
                }
                String queryParameter4 = parse.getQueryParameter("carrier_id");
                if (!TextUtils.isEmpty(queryParameter4)) {
                    this.mCarrier_Id = queryParameter4;
                }
            }
        }
    }

    public void updatePageProperties(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7fb369c", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            String[] split = str.split(",");
            if (split.length < 2 || TextUtils.isEmpty(split[split.length - 2])) {
                TrackBuried.list_Type = TrackBuried.list_TypeArr[0];
            } else {
                TrackBuried.list_Type = split[split.length - 2];
            }
            TrackBuried.list_Param = split[split.length - 1];
            Properties properties = new Properties();
            if (!TextUtils.isEmpty(this.mYyzLocate)) {
                TrackBuried.list_Param += "_" + this.mYyzLocate;
            }
            if (!TextUtils.isEmpty(this.mYyzUrl)) {
                properties.put("url", this.mYyzUrl);
            }
            if (!TextUtils.isEmpty(this.mSellerId)) {
                properties.put("seller_id", this.mSellerId);
            }
            if (!TextUtils.isEmpty(this.mCarrier_Id)) {
                properties.put("carrier_id", this.mCarrier_Id);
            }
            TBS.Page.updatePageProperties("com.taobao.browser.BrowserActivity", properties);
            HashMap hashMap = new HashMap();
            hashMap.put("action", "kpv");
            TrackBuried.effectupdatePageProperties("com.taobao.browser.BrowserActivity", hashMap);
        } else if (!TextUtils.isEmpty(this.mYyzActParam)) {
            TrackBuried.list_Type = TrackBuried.list_TypeArr[0];
            TrackBuried.list_Param = this.mYyzActParam;
            Properties properties2 = new Properties();
            if (!TextUtils.isEmpty(this.mYyzLocate)) {
                TrackBuried.list_Param += "_" + this.mYyzLocate;
            }
            if (!TextUtils.isEmpty(this.mYyzUrl)) {
                properties2.put("url", this.mYyzUrl);
            }
            if (!TextUtils.isEmpty(this.mCarrier_Id)) {
                properties2.put("carrier_id", this.mCarrier_Id);
                TrackBuried.carrier = this.mCarrier_Id;
            }
            TBS.Page.updatePageProperties("com.taobao.browser.BrowserActivity", properties2);
            HashMap hashMap2 = new HashMap();
            hashMap2.put("action", "kpv");
            TrackBuried.effectupdatePageProperties("com.taobao.browser.BrowserActivity", hashMap2);
        } else if (!TextUtils.isEmpty(this.mYyzListParam)) {
            TrackBuried.list_Type = TrackBuried.list_TypeArr[0];
            TrackBuried.list_Param = this.mYyzListParam;
            Properties properties3 = new Properties();
            if (!TextUtils.isEmpty(this.mYyzUrl)) {
                properties3.put("url", this.mYyzUrl);
            }
            if (!TextUtils.isEmpty(this.mCarrier_Id)) {
                properties3.put("carrier_id", this.mCarrier_Id);
                TrackBuried.carrier = this.mCarrier_Id;
            }
            TBS.Page.updatePageProperties("com.taobao.browser.BrowserActivity", properties3);
            HashMap hashMap3 = new HashMap();
            hashMap3.put("action", "kpv");
            TrackBuried.effectupdatePageProperties("com.taobao.browser.BrowserActivity", hashMap3);
        }
    }
}
