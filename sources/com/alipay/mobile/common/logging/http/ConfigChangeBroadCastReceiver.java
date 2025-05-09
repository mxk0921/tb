package com.alipay.mobile.common.logging.http;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.alipay.mobile.common.logging.strategy.LogLengthConfig;
import com.alipay.mobile.common.logging.util.perf.Constants;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ConfigChangeBroadCastReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "ConfigChangeBroadCastReceiver";

    public static /* synthetic */ Object ipc$super(ConfigChangeBroadCastReceiver configChangeBroadCastReceiver, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/common/logging/http/ConfigChangeBroadCastReceiver");
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            return;
        }
        LoggerFactory.getTraceLogger().info(TAG, "onReceive resetUploadUrl");
        UploadUrlConfig a2 = UploadUrlConfig.a();
        a2.f3974a = false;
        a2.b = false;
        LogLengthConfig a3 = LogLengthConfig.a();
        if (Constants.VAL_YES.equals(LoggerFactory.getLogContext().getApplicationContext().getSharedPreferences("UseLogHttpClientConfig", 0).getString("LogLengthLimitDisable", "no"))) {
            a3.f3984a = false;
        } else {
            a3.f3984a = true;
        }
    }
}
