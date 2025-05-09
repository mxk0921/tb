package com.alibaba.aliweex.adapter.adapter;

import android.app.Application;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.alibaba.ha.bizerrorreporter.module.AggregationType;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.WXSDKManager;
import com.taobao.weex.adapter.IWXJSExceptionAdapter;
import com.taobao.weex.common.WXConfig;
import com.taobao.weex.common.WXErrorCode;
import com.taobao.weex.common.WXJSExceptionInfo;
import com.taobao.weex.utils.WXLogUtils;
import java.io.Serializable;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;
import tb.aka;
import tb.hac;
import tb.kr0;
import tb.kyn;
import tb.m7r;
import tb.npb;
import tb.pg1;
import tb.t2o;
import tb.ud2;
import tb.uyv;
import tb.v5c;
import tb.vd2;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class WXExceptionAdapter implements IWXJSExceptionAdapter, Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static String WX_AIR_TAG = aka.KEY_AIR_TAG;
    private final String INSTANCE_ID = "instanceId";
    private final String FRAMEWORK_VERSION = "frameWorkVersion";
    private final String ERROR_CODE = "errorCode";
    private final String ERROR_GROUP = "errorGroup";
    private final String ERROR_TYPE = "errorType";

    private static String dealUrl(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2eea6700", new Object[]{str, new Boolean(z)});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            Uri parse = Uri.parse(URLDecoder.decode(str, "utf-8"));
            String queryParameter = parse.getQueryParameter(uyv.WX_TPL);
            if (queryParameter == null) {
                queryParameter = parse.getQueryParameter(m7r.WEEX_REFERER_ORIGIN);
            }
            if (queryParameter != null) {
                parse = Uri.parse(queryParameter);
            }
            if (!z) {
                return parse.toString();
            }
            return parse.getHost() + parse.getPath();
        } catch (Exception e) {
            e.printStackTrace();
            return str;
        }
    }

    public static String getAppVersionName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("eafcf261", new Object[0]);
        }
        try {
            Application a2 = kr0.e().a();
            if (a2 == null) {
                return "";
            }
            return a2.getPackageManager().getPackageInfo(a2.getPackageName(), 0).versionName;
        } catch (Exception e) {
            WXLogUtils.e("WXExceptionAdapter getAppVersionName Exception: ", e);
            return "";
        }
    }

    public static String getRealNameFromNameOrUrl(String str, boolean z) {
        String str2;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c8ae6855", new Object[]{str, new Boolean(z)});
        }
        try {
            if (str.startsWith("http")) {
                str2 = dealUrl(str, z);
            } else {
                str2 = str;
            }
            if (str2 != null) {
                return str2;
            }
            if (str.startsWith(uyv.HTTPS_SCHEMA)) {
                i = 8;
            } else if (str.startsWith("http:")) {
                i = 7;
            }
            return str.substring(i);
        } catch (Exception e) {
            e.printStackTrace();
            return str;
        }
    }

    private boolean reportSwitch(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("597b261d", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        double d = 100.0d;
        double random = Math.random() * 100.0d;
        if ("weex_native_error".equals(str)) {
            String appVersionName = getAppVersionName();
            if (TextUtils.isEmpty(appVersionName) || appVersionName.split(".").length == 3) {
                d = 10.0d;
            }
        }
        npb b = kr0.e().b();
        if (b != null) {
            try {
                d = Double.valueOf(b.getConfig("wxapm", str, String.valueOf(d))).doubleValue();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return random < d;
    }

    @Override // com.taobao.weex.adapter.IWXJSExceptionAdapter
    public void onJSException(WXJSExceptionInfo wXJSExceptionInfo) {
        Map<String, Object> map;
        hac d;
        WXSDKInstance wXSDKInstance;
        Map<String, String> G;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6e00b53", new Object[]{this, wXJSExceptionInfo});
        } else if (wXJSExceptionInfo == null) {
            Log.e("WXJSExceptionAdapter", "null == exception");
        } else {
            try {
                if (wXJSExceptionInfo.getErrCode() == WXErrorCode.WX_USER_CANCEL_REMOTE_INSTALL) {
                    kyn.d("taobao_weex_adapter", wXJSExceptionInfo.getBundleUrl());
                }
                ud2 ud2Var = new ud2();
                ud2Var.b = AggregationType.CONTENT;
                WXErrorCode errCode = wXJSExceptionInfo.getErrCode();
                if (errCode.getErrorGroup() == WXErrorCode.ErrorGroup.NATIVE && errCode.getErrorType() == WXErrorCode.ErrorType.NATIVE_ERROR) {
                    ud2Var.f29301a = "weex_native_error";
                    ud2Var.d = errCode.getErrorCode();
                } else {
                    ud2Var.f29301a = "WEEX_ERROR";
                    String bundleUrl = wXJSExceptionInfo.getBundleUrl();
                    if (bundleUrl != null) {
                        String realNameFromNameOrUrl = getRealNameFromNameOrUrl(bundleUrl, true);
                        if (realNameFromNameOrUrl.length() > 1024) {
                            realNameFromNameOrUrl = realNameFromNameOrUrl.substring(0, 1024);
                        }
                        ud2Var.d = realNameFromNameOrUrl;
                    }
                }
                if (reportSwitch(ud2Var.f29301a)) {
                    ud2Var.j = wXJSExceptionInfo.getBundleUrl();
                    ud2Var.c = errCode.getErrorCode();
                    String weexVersion = wXJSExceptionInfo.getWeexVersion();
                    if (weexVersion != null) {
                        ud2Var.e = weexVersion;
                    }
                    String exception = wXJSExceptionInfo.getException();
                    if (exception != null) {
                        int indexOf = exception.indexOf("\n");
                        ud2Var.f = indexOf > 0 ? exception.substring(0, indexOf) : exception;
                        ud2Var.h = exception.concat("\nend_weex_stack\n");
                    }
                    String function = wXJSExceptionInfo.getFunction();
                    if (function != null) {
                        ud2Var.g = function;
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("errorCode", errCode.getErrorCode());
                    hashMap.put("errorGroup", errCode.getErrorGroup());
                    hashMap.put("errorType", errCode.getErrorType());
                    WXSDKInstance sDKInstance = WXSDKManager.getInstance().getSDKInstance(wXJSExceptionInfo.getInstanceId());
                    if (sDKInstance != null && errCode.getErrorGroup() == WXErrorCode.ErrorGroup.JS) {
                        String str2 = sDKInstance.c0().pageName;
                        hashMap.put("wxBundlePageName", str2 == null ? "unKnowPageNameCaseUnSet" : str2);
                        if (sDKInstance.getContext() instanceof v5c) {
                            v5c v5cVar = (v5c) sDKInstance.getContext();
                            HashMap hashMap2 = new HashMap();
                            hashMap2.put("useWeex", Boolean.TRUE);
                            hashMap2.put("infoType", ud2Var.f29301a);
                            if (exception != null) {
                                int i = 200;
                                if (exception.length() <= 200) {
                                    i = exception.length();
                                }
                                hashMap2.put("shortErrorMsg", exception.substring(0, i));
                            }
                            hashMap2.put("weexRealPageName", str2);
                            v5cVar.addFeedCallBackInfo(ud2Var.f29301a, JSON.toJSONString(hashMap2));
                        }
                    }
                    String instanceId = wXJSExceptionInfo.getInstanceId();
                    if (instanceId != null) {
                        hashMap.put("instanceId", instanceId);
                    } else {
                        hashMap.put("instanceId", "no instanceId");
                    }
                    String jsFrameworkVersion = wXJSExceptionInfo.getJsFrameworkVersion();
                    if (jsFrameworkVersion != null) {
                        hashMap.put("frameWorkVersion", jsFrameworkVersion);
                    } else {
                        hashMap.put("frameWorkVersion", "no framework version");
                    }
                    Map<String, String> extParams = wXJSExceptionInfo.getExtParams();
                    if (extParams != null && extParams.size() > 0) {
                        hashMap.putAll(extParams);
                        if (!TextUtils.isEmpty(extParams.get("wxGreyBundle"))) {
                            ud2Var.c = extParams.get("wxGreyBundle");
                        }
                    }
                    try {
                        if (!(TextUtils.isEmpty(instanceId) || (wXSDKInstance = WXSDKManager.getInstance().getAllInstanceMap().get(instanceId)) == null || (G = wXSDKInstance.G()) == null || !G.containsKey(WX_AIR_TAG) || (str = G.get(WX_AIR_TAG)) == null)) {
                            hashMap.put(WX_AIR_TAG, str);
                        }
                    } catch (Throwable unused) {
                    }
                    ud2Var.i = hashMap;
                    if (!(!reportSwitch("god_eye_stage_data") || errCode == WXErrorCode.WX_ERROR_WHITE_SCREEN || (d = kr0.e().d()) == null)) {
                        d.onException("exception_weex_check", ud2Var.f, hashMap);
                    }
                    ud2Var.l = Thread.currentThread();
                    vd2.a().c(kr0.e().a(), ud2Var);
                    if (errCode.getErrorGroup() == WXErrorCode.ErrorGroup.JS && sDKInstance != null) {
                        try {
                            map = JSON.parseObject(JSON.toJSONString(wXJSExceptionInfo));
                        } catch (Exception unused2) {
                            HashMap hashMap3 = new HashMap();
                            hashMap3.put("bundleUrl", wXJSExceptionInfo.getBundleUrl());
                            hashMap3.put("errorCode", wXJSExceptionInfo.getErrCode());
                            hashMap3.put("exception", wXJSExceptionInfo.getException());
                            hashMap3.put("extParams", wXJSExceptionInfo.getExtParams());
                            hashMap3.put(pg1.ATOM_function, wXJSExceptionInfo.getFunction());
                            hashMap3.put("instanceId", wXJSExceptionInfo.getInstanceId());
                            hashMap3.put("jsFrameworkVersion", wXJSExceptionInfo.getJsFrameworkVersion());
                            hashMap3.put(WXConfig.weexVersion, wXJSExceptionInfo.getWeexVersion());
                            map = hashMap3;
                        }
                        sDKInstance.B("exception", map);
                    }
                }
            } catch (Exception e) {
                Log.e("weex js err", "build weex callback data err", e);
            }
        }
    }

    static {
        t2o.a(85983247);
        t2o.a(985661524);
    }
}
