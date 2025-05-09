package com.alipay.mobile.verifyidentity.alipay.H5Plugin;

import android.os.Bundle;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.security.rp.RPSDK;
import com.alipay.mobile.verifyidentity.alipay.listener.H5PluginListenerByVid;
import com.alipay.mobile.verifyidentity.common.Constants;
import com.alipay.mobile.verifyidentity.engine.VerifyIdentityEngine;
import com.alipay.mobile.verifyidentity.info.AppInfo;
import com.alipay.mobile.verifyidentity.info.EnvInfoUtil;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kpw;
import tb.nsw;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class VITaoBaoJSAPIAdapter extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static final String f4280a = "VITaoBaoJSAPIAdapter";
    public static final String getBioData = "BIO_DATA";
    public static final String getEnvData = "getEnvData";
    public static final String startEngine = "START_VERIFY";

    private void a(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77d86eb9", new Object[]{this, str, str2, wVCallBackContext});
            return;
        }
        try {
            if (getBioData.equals(str)) {
                RPSDK.initialize(RPSDK.RPSDKEnv.RPSDKEnv_DAILY, this.mContext);
                JSONObject parseObject = JSON.parseObject(RPSDK.getDeviceInfo());
                parseObject.put("apdid", (Object) AppInfo.getInstance().getApdid());
                nsw nswVar = new nsw();
                nswVar.b("bio_data", parseObject.toString());
                wVCallBackContext.success(nswVar);
                VerifyLogCat.d(f4280a, str2);
            } else if (startEngine.equals(str)) {
                VerifyIdentityEngine.getInstance(this.mContext).unifiedStartByVerifyId(JSON.parseObject(str2).getString(Constants.VI_ENGINE_VERIFYID), null, null, new Bundle(), new H5PluginListenerByVid(wVCallBackContext));
            } else if (getEnvData.equals(str)) {
                JSONObject parseObject2 = JSON.parseObject(str2);
                boolean booleanValue = parseObject2.getBooleanValue(EnvInfoUtil.KEY_IS_IPAY);
                String string = parseObject2.getString("uid");
                Bundle bundle = new Bundle();
                bundle.putBoolean(EnvInfoUtil.KEY_IS_IPAY, booleanValue);
                if (!TextUtils.isEmpty(string)) {
                    bundle.putString("USER_ID", string);
                }
                String envData = VerifyIdentityEngine.getInstance(this.mContext).getEnvData(bundle);
                nsw nswVar2 = new nsw();
                nswVar2.b("envInfo", envData);
                wVCallBackContext.success(nswVar2);
            }
        } catch (Exception e) {
            String str3 = f4280a;
            VerifyLogCat.e(str3, "error: " + e.getMessage());
            wVCallBackContext.error();
        }
    }

    public static /* synthetic */ Object ipc$super(VITaoBaoJSAPIAdapter vITaoBaoJSAPIAdapter, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/verifyidentity/alipay/H5Plugin/VITaoBaoJSAPIAdapter");
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if ("bioDataWithParams".equals(str)) {
            a(getBioData, str2, wVCallBackContext);
            return true;
        } else if ("startEngineWithParams".equals(str)) {
            a(startEngine, str2, wVCallBackContext);
            return true;
        } else if (!getEnvData.equalsIgnoreCase(str)) {
            return false;
        } else {
            a(getEnvData, str2, wVCallBackContext);
            return true;
        }
    }
}
