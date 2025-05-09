package org.android.agoo.huawei;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.aaid.HmsInstanceId;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.push.HmsMessaging;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UtilityImpl;
import com.taobao.agoo.BaseNotifyClickActivity;
import com.xiaomi.mipush.sdk.Constants;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import org.android.agoo.control.NotifManager;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class HuaWeiRegister {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "HuaWeiRegister";
    public static boolean isChannelRegister;
    private static ScheduledThreadPoolExecutor scheduleThreadPoolExecutor;

    public static /* synthetic */ void access$000(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fe40831", new Object[]{context});
        } else {
            getToken(context);
        }
    }

    public static boolean checkDevice() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("763e9f09", new Object[0])).booleanValue();
        }
        try {
            String str = Build.BRAND;
            if (!"huawei".equalsIgnoreCase(str) && !"honor".equalsIgnoreCase(str) && !"tianyi".equalsIgnoreCase(str) && !"liantong".equalsIgnoreCase(str) && !"hinova".equalsIgnoreCase(str) && !"nzone".equalsIgnoreCase(str)) {
                if (!"ptac".equalsIgnoreCase(str)) {
                    return false;
                }
            }
            return true;
        } catch (Exception e) {
            Log.e(TAG, "checkDevice failed.", e);
            return false;
        }
    }

    public static synchronized ScheduledThreadPoolExecutor getScheduledExecutor() {
        synchronized (HuaWeiRegister.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ScheduledThreadPoolExecutor) ipChange.ipc$dispatch("46f0cbe6", new Object[0]);
            }
            if (scheduleThreadPoolExecutor == null) {
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new ThreadFactory() { // from class: org.android.agoo.huawei.HuaWeiRegister.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.util.concurrent.ThreadFactory
                    public Thread newThread(Runnable runnable) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return (Thread) ipChange2.ipc$dispatch("d8079a58", new Object[]{this, runnable});
                        }
                        return new Thread(runnable, "ACCS-HW");
                    }
                });
                scheduleThreadPoolExecutor = scheduledThreadPoolExecutor;
                scheduledThreadPoolExecutor.setKeepAliveTime(30L, TimeUnit.SECONDS);
                scheduleThreadPoolExecutor.allowCoreThreadTimeOut(true);
            }
            return scheduleThreadPoolExecutor;
        }
    }

    private static void getToken(final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d188e7be", new Object[]{context});
        } else {
            getScheduledExecutor().execute(new Runnable() { // from class: org.android.agoo.huawei.HuaWeiRegister.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    String str;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    ALog.e(HuaWeiRegister.TAG, "getToken schedule", new Object[0]);
                    try {
                        String string = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getString(Constants.HUAWEI_HMS_CLIENT_APPID);
                        String str2 = "";
                        if (!TextUtils.isEmpty(string)) {
                            str2 = string.replace("appid=", str2);
                        }
                        ALog.e(HuaWeiRegister.TAG, "getToken", "appId", str2);
                        if (TextUtils.isEmpty(str2)) {
                            str = HmsInstanceId.getInstance(context).getToken();
                        } else {
                            str = HmsInstanceId.getInstance(context).getToken(str2, HmsMessaging.DEFAULT_TOKEN_SCOPE);
                        }
                        ALog.e(HuaWeiRegister.TAG, "onToken", "token", str);
                        if (!TextUtils.isEmpty(str)) {
                            NotifManager notifManager = new NotifManager();
                            notifManager.init(context);
                            notifManager.reportThirdPushToken(str, "HW_TOKEN");
                        }
                    } catch (Exception e) {
                        ALog.e(HuaWeiRegister.TAG, "getToken failed.", e, new Object[0]);
                    }
                }
            });
        }
    }

    private static boolean isSupport(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("44a03800", new Object[]{context})).booleanValue();
        }
        if (!checkDevice() || HuaweiApiAvailability.getInstance().isHuaweiMobileServicesAvailable(context) != 0) {
            return false;
        }
        return true;
    }

    public static void register(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc44075", new Object[]{application});
        } else {
            registerBundle(application, false);
        }
    }

    public static void registerBundle(final Application application, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4e7ffe1", new Object[]{application, new Boolean(z)});
            return;
        }
        try {
            isChannelRegister = z;
            if (!z && !UtilityImpl.isMainProcess(application)) {
                ALog.e(TAG, "register not in main process, return", new Object[0]);
            } else if (checkDevice()) {
                BaseNotifyClickActivity.addNotifyListener(new HuaweiMsgParseImpl());
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: org.android.agoo.huawei.HuaWeiRegister.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        ALog.e(HuaWeiRegister.TAG, "register begin", "isChannel", Boolean.valueOf(HuaWeiRegister.isChannelRegister));
                        HuaWeiRegister.access$000(application.getApplicationContext());
                    }
                }, 5000L);
            } else {
                ALog.e(TAG, "register checkDevice false", new Object[0]);
            }
        } catch (Throwable th) {
            ALog.e(TAG, "register", th, new Object[0]);
        }
    }
}
