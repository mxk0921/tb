package com.taobao.message.notification.base;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.connection.state.a;
import com.taobao.message.notification.util.BrandUtil;
import com.taobao.message.notification.util.OverlayPermission;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.log.TLog;
import tb.c21;
import tb.chb;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class DefaultEnvProvider implements IEnvProvider {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(610271289);
        t2o.a(610271293);
    }

    @Override // com.taobao.message.notification.base.IEnvProvider
    public boolean checkBrand(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d97e34b4", new Object[]{this, str})).booleanValue();
        }
        return Build.BRAND.toLowerCase().equals(str);
    }

    @Override // com.taobao.message.notification.base.IEnvProvider
    public boolean isAppBackGround(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63a3421a", new Object[]{this, str})).booleanValue();
        }
        chb g = c21.g();
        if (g == null || g.getBoolean("isInBackground", false)) {
            return true;
        }
        return false;
    }

    @Override // com.taobao.message.notification.base.IEnvProvider
    public boolean isWindowManagerAvaliable(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cd1f0055", new Object[]{this, context})).booleanValue();
        }
        if (OverlayPermission.hasPermission(context.getApplicationContext())) {
            return true;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return false;
        }
        return !BrandUtil.isXiaoMi();
    }

    @Override // com.taobao.message.notification.base.IEnvProvider
    public boolean isProcessRight(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("359ac94e", new Object[]{this, context})).booleanValue();
        }
        if (context != null) {
            try {
                BrandUtil.getInstance();
                if (!BrandUtil.isOPPO() || !"true".equals(OrangeConfig.getInstance().getConfig("mpm_business_switch", "isEnableMainProcessRightOpt", "true"))) {
                    String packageName = context.getPackageName();
                    ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
                    if (activityManager != null) {
                        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : activityManager.getRunningAppProcesses()) {
                            Log.e("TaobaoIntentService.TAG", "mainProcess:" + packageName + " appProcess:" + runningAppProcessInfo.processName);
                            if (runningAppProcessInfo.processName.equals(packageName)) {
                                return true;
                            }
                        }
                    }
                } else {
                    boolean A = a.v().A(context);
                    TLog.loge("TaobaoIntentService.TAG", "isProcessRight:" + A);
                    return A;
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }
}
