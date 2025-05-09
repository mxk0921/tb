package com.taobao.browser.jsbridge;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.browser.utils.BrowserUtil;
import com.taobao.orange.OrangeConfig;
import tb.fsw;
import tb.ihc;
import tb.kpw;
import tb.m7r;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class DynamicJsbridgeService extends Service implements ihc {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "DynamicJsbridgeService";

    static {
        t2o.a(619708508);
        t2o.a(989856204);
    }

    private Class<? extends kpw> getPluginClass(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("57078ecd", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("#");
        if (split.length < 2) {
            return null;
        }
        String str2 = split[1];
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        String config = OrangeConfig.getInstance().getConfig(m7r.KEY_ORANGE_GROUP_WVAPI_BROWSER, str2, "");
        if (TextUtils.isEmpty(config)) {
            return null;
        }
        try {
            return Class.forName(config);
        } catch (Throwable unused) {
            Log.e(TAG, "getPluginClass fail:" + str + ", " + config);
            return null;
        }
    }

    public static /* synthetic */ Object ipc$super(DynamicJsbridgeService dynamicJsbridgeService, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/browser/jsbridge/DynamicJsbridgeService");
    }

    @Override // tb.ihc
    public Class<? extends kpw> getBridgeClass(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("fa8f40b7", new Object[]{this, str});
        }
        BrowserUtil.b(TAG, "getBridgeClass", str, null, null);
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.equals("TBDeviceInfo")) {
            return TBUrlCacheAndDevice.class;
        }
        if (str.equals("TBBase")) {
            return WVTBBase.class;
        }
        if (str.equals("TBURLCache")) {
            return TBUrlCacheAndDevice.class;
        }
        if (str.equals("Base")) {
            return WVWindow.class;
        }
        if (str.equals("WVUICityList")) {
            return WVUICityList.class;
        }
        if (str.equals("WVNative")) {
            return TBNative.class;
        }
        if (str.contains(fsw.b().f19515a)) {
            return getPluginClass(str);
        }
        return null;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBinder) ipChange.ipc$dispatch("30c27bd", new Object[]{this, intent});
        }
        return null;
    }
}
