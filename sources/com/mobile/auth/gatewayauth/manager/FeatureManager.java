package com.mobile.auth.gatewayauth.manager;

import android.text.TextUtils;
import com.mobile.auth.gatewayauth.ExceptionProcessor;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class FeatureManager {
    public static final String FEATURE_KEY_CACHE_LEVEL_VENDOR = "CACHE_LEVEL_VENDOR";
    public static final String FEATURE_KEY_CRASH = "CRASH_SDK";
    public static final String FEATURE_KEY_PERFORMANCE_TRACKER = "PERFORMANCE_TRACKER";
    protected static final String FEATURE_KEY_SWITCH_CELLULAR = "switchCellularEnable";
    public static final String FEATURE_KEY_UC_CRASH = "UC_CRASH";
    protected static final String FEATURE_KEY_WHITE_CHECK = "whiteFileCheck";
    private static volatile FeatureManager mInstance;
    private HashMap<String, Object> mConfigs = new HashMap<>(5);

    private FeatureManager() {
    }

    public static FeatureManager getInstance() {
        try {
            if (mInstance == null) {
                synchronized (FeatureManager.class) {
                    if (mInstance == null) {
                        mInstance = new FeatureManager();
                    }
                }
            }
            return mInstance;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    public Object get(String str) {
        try {
            HashMap<String, Object> hashMap = this.mConfigs;
            if (hashMap != null) {
                return hashMap.get(str);
            }
            return null;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    public void put(String str, Object obj) {
        HashMap<String, Object> hashMap;
        try {
            if (!TextUtils.isEmpty(str) && (hashMap = this.mConfigs) != null) {
                hashMap.put(str, obj);
            }
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }
}
