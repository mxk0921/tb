package org.android.agoo.honor;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import com.honor.push.sdk.mapi.notification.HonorPushNotificationManager;
import com.honor.push.sdk.mapi.notification.NotificationStatus;
import com.honor.push.sdk.mapi.notification.ResultCallback;
import com.taobao.accs.utl.ALog;
import java.util.concurrent.atomic.AtomicInteger;
import tb.hi0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class HonorNtfHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "HonorNtfHelper";
    private static AtomicInteger sRequestCode;

    public static /* synthetic */ AtomicInteger access$000() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicInteger) ipChange.ipc$dispatch("6567c5a1", new Object[0]);
        }
        return sRequestCode;
    }

    public static /* synthetic */ AtomicInteger access$002(AtomicInteger atomicInteger) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicInteger) ipChange.ipc$dispatch("8ab4920b", new Object[]{atomicInteger});
        }
        sRequestCode = atomicInteger;
        return atomicInteger;
    }

    public static void enableNtfByVip(final Activity activity, final hi0.f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5ba3d36", new Object[]{activity, fVar});
        } else if (activity == null || fVar == null) {
            ALog.e(TAG, "enableNtfByVip params err", new Object[0]);
        } else {
            try {
                HonorPushNotificationManager.getInstance().enableNotification(activity, new ResultCallback<NotificationStatus>() { // from class: org.android.agoo.honor.HonorNtfHelper.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    public void onCallback(NotificationStatus notificationStatus) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("6489bb00", new Object[]{this, notificationStatus});
                            return;
                        }
                        try {
                            if (notificationStatus == null) {
                                hi0.f.this.onFailure(-1, "no NotificationStatus");
                                return;
                            }
                            int statusCode = notificationStatus.getStatusCode();
                            int errCode = notificationStatus.getErrCode();
                            ALog.e(HonorNtfHelper.TAG, "onCallback,", "statusCode", Integer.valueOf(statusCode), "errCode", Integer.valueOf(errCode), "errMsg", notificationStatus.getErrMsg());
                            if (statusCode == 10000) {
                                ALog.e(HonorNtfHelper.TAG, "enableNtfByVip check: ntf already on", new Object[0]);
                                hi0.f.this.onSuccess();
                            } else if (statusCode == 10001) {
                                if (HonorNtfHelper.access$000() == null) {
                                    HonorNtfHelper.access$002(new AtomicInteger(1));
                                }
                                notificationStatus.startResolutionForResult(activity, HonorNtfHelper.access$000().getAndIncrement());
                                hi0.f.this.onSuccess();
                                ALog.e(HonorNtfHelper.TAG, "real startResolutionForResult", new Object[0]);
                            } else {
                                ALog.e(HonorNtfHelper.TAG, "enableNtfByVip check: failStatusCode", new Object[0]);
                                hi0.f.this.onFailure(statusCode, "failStatusCode");
                            }
                        } catch (Throwable th) {
                            hi0.f.this.onFailure(-2, "onCallback err");
                            ALog.e(HonorNtfHelper.TAG, "onCallback err", th, new Object[0]);
                        }
                    }
                });
            } catch (Throwable th) {
                fVar.onFailure(-3, "enableNotification err");
                ALog.e(TAG, "enableNotification err", th, new Object[0]);
            }
        }
    }
}
