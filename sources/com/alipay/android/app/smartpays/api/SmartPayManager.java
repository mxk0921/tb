package com.alipay.android.app.smartpays.api;

import android.content.Context;
import com.alipay.android.app.safepaylog.utils.LogUtils;
import com.alipay.android.app.utils.SpOuterUtil;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.alipay.security.mobile.api.AuthenticatorApi;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.umipublish.draft.DraftMediaHelper;
import java.util.HashMap;

/* compiled from: Taobao */
@MpaasClassInfo(ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-safepaybase")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class SmartPayManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f3498a;

    public SmartPayManager(Context context) {
        HashMap hashMap = new HashMap();
        hashMap.put("action", "SmartPayManagerInit");
        SpOuterUtil.walletEventLog("1010897", "pay", hashMap);
        this.f3498a = context.getApplicationContext();
    }

    public String getFastPayAuthData(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("24072b27", new Object[]{this, str});
        }
        LogUtils.record(2, "SmartPayManager::getFastPayAuthData", "context:" + this.f3498a + ", userId:" + str);
        return AuthenticatorApi.getFastPayAuthData(this.f3498a, str);
    }

    public String getFastPayAuthDataWithNoLog(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8697611a", new Object[]{this, str});
        }
        LogUtils.record(2, "SmartPayManager::getFastPayAuthDataWithNoLog", "context:" + this.f3498a + ", userId:" + str);
        return AuthenticatorApi.getFastPayAuthData(this.f3498a, str);
    }

    public String getRegAuthData(int i, int i2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a174409f", new Object[]{this, new Integer(i), new Integer(i2), str});
        }
        LogUtils.record(2, "SmartPayManager::getRegAuthData", "context:" + this.f3498a + ",authType:" + i + ",wearableType:" + i2 + ",userId:" + str);
        return AuthenticatorApi.getRegAuthData(this.f3498a, i, i2, str);
    }
}
