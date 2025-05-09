package org.android.agoo.oppo;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.heytap.msp.push.HeytapPushManager;
import com.heytap.msp.push.callback.ICallBackResultService;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UtilityImpl;
import com.taobao.agoo.BaseNotifyClickActivity;
import com.taobao.agoo.util.AgooUtils;
import org.android.agoo.control.NotifManager;
import tb.amo;
import tb.m8l;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class OppoRegister {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String OPPO_TOKEN = "OPPO_TOKEN";
    public static final String TAG = "OppoPush";
    private static Context mContext;
    private static volatile boolean reportedInOneRegister;

    public static /* synthetic */ Context access$000() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("bf71316f", new Object[0]);
        }
        return mContext;
    }

    public static /* synthetic */ void access$100(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fd8dda", new Object[]{context, str});
        } else {
            reportToken(context, str);
        }
    }

    public static boolean checkDevice(Context context) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f20f6c67", new Object[]{context})).booleanValue();
        }
        try {
            if ((context.getApplicationInfo().flags & 2) == 0) {
                z = false;
            }
            HeytapPushManager.init(context, z);
            return HeytapPushManager.isSupportPush(context);
        } catch (Throwable th) {
            ALog.e(TAG, "checkDevice err", th, new Object[0]);
            return false;
        }
    }

    public static void register(Context context, String str, String str2) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0e89372", new Object[]{context, str, str2});
            return;
        }
        try {
            Context applicationContext = context.getApplicationContext();
            mContext = applicationContext;
            if (!UtilityImpl.isMainProcess(applicationContext)) {
                ALog.e(TAG, "not in main process, return", new Object[0]);
                return;
            }
            Context context2 = mContext;
            if ((context2.getApplicationInfo().flags & 2) != 0) {
                z = true;
            } else {
                z = false;
            }
            HeytapPushManager.init(context2, z);
            boolean isSupportPush = HeytapPushManager.isSupportPush(context);
            ALog.e(TAG, "register", amo.a.POINT_NAME, Boolean.valueOf(isSupportPush));
            if (isSupportPush) {
                BaseNotifyClickActivity.addNotifyListener(new OppoMsgParseImpl());
                if (!AgooUtils.isOptimizationEnabled(context)) {
                    context = mContext;
                }
                HeytapPushManager.register(context, str, str2, new ICallBackResultService() { // from class: org.android.agoo.oppo.OppoRegister.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.heytap.msp.push.callback.ICallBackResultService
                    public void onError(int i, String str3) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7a671c9d", new Object[]{this, new Integer(i), str3});
                            return;
                        }
                        ALog.e(OppoRegister.TAG, "onError code=" + i, "s", str3);
                    }

                    @Override // com.heytap.msp.push.callback.ICallBackResultService
                    public void onGetNotificationStatus(int i, int i2) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("f6cffe3b", new Object[]{this, new Integer(i), new Integer(i2)});
                        } else {
                            ALog.i(OppoRegister.TAG, "onGetNotificationStatus", new Object[0]);
                        }
                    }

                    @Override // com.heytap.msp.push.callback.ICallBackResultService
                    public void onGetPushStatus(int i, int i2) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("50985cea", new Object[]{this, new Integer(i), new Integer(i2)});
                        } else {
                            ALog.i(OppoRegister.TAG, "onGetPushStatus", new Object[0]);
                        }
                    }

                    @Override // com.heytap.msp.push.callback.ICallBackResultService
                    public void onRegister(int i, String str3) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("ad50244", new Object[]{this, new Integer(i), str3});
                            return;
                        }
                        ALog.e(OppoRegister.TAG, "onRegister regid=" + str3, "err_code", Integer.valueOf(i));
                        OppoRegister.access$100(OppoRegister.access$000(), str3);
                    }

                    @Override // com.heytap.msp.push.callback.ICallBackResultService
                    public void onSetPushTime(int i, String str3) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("eb8efabc", new Object[]{this, new Integer(i), str3});
                        } else {
                            ALog.i(OppoRegister.TAG, "onSetPushTime", new Object[0]);
                        }
                    }

                    @Override // com.heytap.msp.push.callback.ICallBackResultService
                    public void onUnRegister(int i) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("a36cb0a1", new Object[]{this, new Integer(i)});
                            return;
                        }
                        ALog.e(OppoRegister.TAG, "onUnRegister code=" + i, new Object[0]);
                    }
                });
            }
        } catch (Throwable th) {
            ALog.e(TAG, "register error", th, new Object[0]);
        }
    }

    private static void reportToken(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fbf10e6", new Object[]{context, str});
        } else if (!reportedInOneRegister && !TextUtils.isEmpty(str) && context != null) {
            if (m8l.n() && AgooUtils.isOptimizationEnabled(context)) {
                reportedInOneRegister = true;
            }
            NotifManager notifManager = new NotifManager();
            notifManager.init(context.getApplicationContext());
            notifManager.reportThirdPushToken(str, OPPO_TOKEN, true);
        }
    }
}
