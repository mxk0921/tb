package com.ali.user.open.core.device;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.LocaleList;
import android.text.TextUtils;
import com.ali.user.open.core.context.KernelContext;
import com.ali.user.open.core.trace.SDKLogger;
import com.ali.user.open.core.util.ReflectionUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OConstant;
import java.util.Locale;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class DeviceInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static DeviceInfo INSTANCE = null;
    private static final String TAG = "DeviceInfo";
    public static String deviceId;

    static {
        t2o.a(71303187);
    }

    public static synchronized DeviceInfo getInstance() {
        synchronized (DeviceInfo.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DeviceInfo) ipChange.ipc$dispatch("91b8c366", new Object[0]);
            }
            if (INSTANCE == null) {
                INSTANCE = new DeviceInfo();
            }
            return INSTANCE;
        }
    }

    public static String getLocale(Context context) {
        Locale locale;
        LocaleList locales;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ce8c2ef", new Object[]{context});
        }
        if (Build.VERSION.SDK_INT >= 24) {
            locales = context.getResources().getConfiguration().getLocales();
            locale = locales.get(0);
        } else {
            locale = context.getResources().getConfiguration().locale;
        }
        return locale.getLanguage() + "_" + locale.getCountry();
    }

    public static void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{context});
        } else if (TextUtils.isEmpty(deviceId)) {
            initDeviceId(context);
        }
    }

    private static void initDeviceId(final Context context) {
        Class<?> loadClassQuietly = ReflectionUtils.loadClassQuietly(OConstant.REFLECT_UTDID);
        String str = null;
        if (loadClassQuietly != null) {
            try {
                Object invoke = loadClassQuietly.getMethod("getUtdid", Context.class).invoke(null, context);
                if (invoke == null) {
                    SDKLogger.e(TAG, "get utdid null");
                } else {
                    str = (String) invoke;
                }
            } catch (Exception unused) {
                SDKLogger.e(TAG, "get utdid error");
            }
        }
        if (str == null) {
            KernelContext.executorService.postTask(new Runnable() { // from class: com.ali.user.open.core.device.DeviceInfo.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        DeviceInfo.deviceId = context.getSharedPreferences("auth_sdk_device", 0).getString("deviceId", "");
                        SDKLogger.e(DeviceInfo.TAG, "DeviceInfo.deviceId = " + DeviceInfo.deviceId);
                    } catch (Throwable unused2) {
                    }
                }
            });
            return;
        }
        deviceId = str;
        SDKLogger.e(TAG, "utdid = ".concat(str));
        KernelContext.executorService.postTask(new Runnable() { // from class: com.ali.user.open.core.device.DeviceInfo.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    SharedPreferences.Editor edit = context.getSharedPreferences("auth_sdk_device", 0).edit();
                    edit.putString("deviceId", DeviceInfo.deviceId);
                    edit.apply();
                } catch (Throwable unused2) {
                }
            }
        });
    }
}
