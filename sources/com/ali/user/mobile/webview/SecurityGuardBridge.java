package com.ali.user.mobile.webview;

import android.content.ContextWrapper;
import android.os.Build;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.WindVaneInterface;
import android.text.TextUtils;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.utils.NetworkUtil;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.linkmanager.afc.windvane.DeviceInfoJsBridge;
import com.taobao.wireless.security.sdk.SecurityGuardManager;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;
import tb.kpw;
import tb.nsw;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class SecurityGuardBridge extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(70254905);
    }

    private void getEncryptedDevAndEnvInfo(WVCallBackContext wVCallBackContext, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59892c39", new Object[]{this, wVCallBackContext, str});
            return;
        }
        try {
            str2 = new JSONObject(str).optString("key");
        } catch (JSONException unused) {
            str2 = "";
        }
        if (TextUtils.isEmpty(str2)) {
            wVCallBackContext.error(nsw.RET_PARAM_ERR);
            return;
        }
        try {
            String encryptedDevAndEnvInfo = SecurityGuardManager.getInstance(new ContextWrapper(this.mContext)).getDataCollectionComp().getEncryptedDevAndEnvInfo(16, str2);
            nsw nswVar = new nsw();
            nswVar.b("encryptedInfo", encryptedDevAndEnvInfo);
            wVCallBackContext.success(nswVar);
        } catch (Exception unused2) {
            wVCallBackContext.error();
        }
    }

    @WindVaneInterface
    private void getInfo(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34eab732", new Object[]{this, wVCallBackContext, str});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("deviceID", DataProviderFactory.getDataProvider().getDeviceId());
        hashMap.put("ttid", DataProviderFactory.getDataProvider().getTTID());
        hashMap.put("network", NetworkUtil.getNetworkType(this.mContext));
        hashMap.put("sdkversion", "" + Build.VERSION.SDK_INT);
        wVCallBackContext.success(JSON.toJSONString(hashMap));
    }

    public static /* synthetic */ Object ipc$super(SecurityGuardBridge securityGuardBridge, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ali/user/mobile/webview/SecurityGuardBridge");
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if ("getSecurityGuardEncryptedDevAndEnvInfo".equals(str)) {
            getEncryptedDevAndEnvInfo(wVCallBackContext, str2);
        } else if (!DeviceInfoJsBridge.ACTION.equals(str)) {
            return false;
        } else {
            getInfo(wVCallBackContext, str2);
        }
        return true;
    }
}
