package org.android.agoo.honor;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.hihonor.push.sdk.internal.HonorPushErrorEnum;
import com.hihonor.push.sdk.ipc.HonorApiAvailability;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UtilityImpl;
import com.taobao.agoo.BaseNotifyClickActivity;
import org.android.agoo.control.NotifManager;
import tb.p5b;
import tb.q5b;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class HonorRegister {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String HONOR_TOKEN = "HONOR_TOKEN";
    private static final String TAG = "HonorRegister";
    private static Boolean isSupport;

    public static boolean isSupport(Context context) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("44a03800", new Object[]{context})).booleanValue();
        }
        Boolean bool = isSupport;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (!Build.BRAND.equalsIgnoreCase("honor")) {
            isSupport = Boolean.FALSE;
            return false;
        } else if (Build.VERSION.SDK_INT < 30) {
            ALog.e(TAG, "SDK_INT < 30", new Object[0]);
            isSupport = Boolean.FALSE;
            return false;
        } else {
            int b = HonorApiAvailability.b(context);
            ALog.e(TAG, "honor.isSupport", "type", Integer.valueOf(b));
            if (b == HonorPushErrorEnum.SUCCESS.statusCode) {
                z = true;
            }
            isSupport = Boolean.valueOf(z);
            return z;
        }
    }

    public static void registerBundle(final Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fa45d53", new Object[]{application});
            return;
        }
        try {
            if (!UtilityImpl.isMainProcess(application)) {
                ALog.e(TAG, "register not in main process, return", new Object[0]);
            } else if (!isSupport(application)) {
                ALog.e(TAG, "not support", new Object[0]);
            } else {
                BaseNotifyClickActivity.addNotifyListener(new HonorParseImpl());
                q5b.a().c(application, false);
                q5b.a().b(new p5b<String>() { // from class: org.android.agoo.honor.HonorRegister.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.p5b
                    public void onFailure(int i, String str) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("9a2a071b", new Object[]{this, new Integer(i), str});
                        } else {
                            ALog.e(HonorRegister.TAG, "honor.getPushToken.onFailure", "errorCode", Integer.valueOf(i), "errorString", str);
                        }
                    }

                    public void onSuccess(String str) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("37d948b5", new Object[]{this, str});
                            return;
                        }
                        try {
                            ALog.e(HonorRegister.TAG, "honor.getPushToken.onSuccess", "token", str);
                            if (!TextUtils.isEmpty(str)) {
                                NotifManager notifManager = new NotifManager();
                                notifManager.init(application);
                                notifManager.reportThirdPushToken(str, HonorRegister.HONOR_TOKEN);
                            }
                        } catch (Throwable th) {
                            ALog.e(HonorRegister.TAG, "onToken", th, new Object[0]);
                        }
                    }
                });
            }
        } catch (Throwable th) {
            ALog.e(TAG, "registerBundle err", th, new Object[0]);
        }
    }
}
