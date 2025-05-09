package com.alipay.ma.decode;

import android.text.TextUtils;
import com.alipay.ma.MaLogger;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MaSdkConfigManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_MA_SDK_FILTER_CONFIG = "masdk_filter_config";

    /* renamed from: a  reason: collision with root package name */
    public static volatile String f3861a;

    public static synchronized boolean isSupportMaSdkConfig() {
        synchronized (MaSdkConfigManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("94545f6e", new Object[0])).booleanValue();
            } else if (TextUtils.isEmpty(f3861a)) {
                return false;
            } else {
                return true;
            }
        }
    }

    public static synchronized void refreshConfig(String str) {
        synchronized (MaSdkConfigManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6e4b20ce", new Object[]{str});
                return;
            }
            f3861a = str;
            MaDecode.setFilterConfigJ(str);
            MaLogger.d("MaSdkConfigManager", "refreshConfig =" + str);
            new StringBuilder("refreshConfig =").append(str);
        }
    }
}
