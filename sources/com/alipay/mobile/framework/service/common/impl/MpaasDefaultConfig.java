package com.alipay.mobile.framework.service.common.impl;

import android.content.Context;
import android.text.TextUtils;
import com.alipay.mobile.common.netsdkextdependapi.appinfo.AppInfoUtil;
import com.alipay.mobile.common.rpc.RpcDefaultConfig;
import com.alipay.mobile.common.transport.Transport;
import com.alipay.mobile.common.transport.http.HttpUrlHeader;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.ReadSettingServerUrl;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MpaasDefaultConfig extends RpcDefaultConfig {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Context context;

    public MpaasDefaultConfig(Context context) {
        if (context != null) {
            this.context = context;
            return;
        }
        throw new IllegalArgumentException("context parameter can't be null ");
    }

    public static /* synthetic */ Object ipc$super(MpaasDefaultConfig mpaasDefaultConfig, String str, Object... objArr) {
        if (str.hashCode() == 1669530992) {
            super.giveResponseHeader((String) objArr[0], (HttpUrlHeader) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/framework/service/common/impl/MpaasDefaultConfig");
    }

    @Override // com.alipay.mobile.common.rpc.RpcDefaultConfig, com.alipay.mobile.common.rpc.Config
    public String getAppKey() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("49079005", new Object[]{this});
        }
        String appKeyForMPaaS = AppInfoUtil.getAppKeyForMPaaS();
        if (!TextUtils.isEmpty(appKeyForMPaaS)) {
            LogCatUtil.info("MpaasDefaultConfig", "Get appkey=[" + appKeyForMPaaS + "] from AppInfoUtil");
            return appKeyForMPaaS;
        }
        try {
            Object obj = this.context.getPackageManager().getApplicationInfo(this.context.getPackageName(), 128).metaData.get("appkey");
            if (obj != null) {
                str = obj.toString();
            } else {
                str = "";
            }
        } catch (Exception e) {
            LogCatUtil.warn("MpaasDefaultConfig", e);
        }
        if (!TextUtils.isEmpty(str)) {
            LogCatUtil.info("MpaasDefaultConfig", "Get appkey=[" + str + "] from metaData.");
            return str;
        }
        LogCatUtil.info("MpaasDefaultConfig", "Get appkey, Not exist appkey in metaData, return null");
        return "";
    }

    @Override // com.alipay.mobile.common.rpc.RpcDefaultConfig, com.alipay.mobile.common.rpc.Config
    public Transport getTransport() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Transport) ipChange.ipc$dispatch("de392016", new Object[]{this});
        }
        return MpaasHttpTransportSevice.getInstance(this.context);
    }

    @Override // com.alipay.mobile.common.rpc.RpcDefaultConfig, com.alipay.mobile.common.rpc.Config
    public String getUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this});
        }
        return ReadSettingServerUrl.getInstance().getGWFURL(this.context);
    }

    @Override // com.alipay.mobile.common.rpc.RpcDefaultConfig, com.alipay.mobile.common.rpc.Config
    public void giveResponseHeader(String str, HttpUrlHeader httpUrlHeader) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63830570", new Object[]{this, str, httpUrlHeader});
        } else {
            super.giveResponseHeader(str, httpUrlHeader);
        }
    }
}
