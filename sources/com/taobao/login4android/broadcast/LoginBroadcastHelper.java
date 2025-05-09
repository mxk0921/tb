package com.taobao.login4android.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.constants.LoginConstants;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class LoginBroadcastHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_NOTIFY_LOCAL_BROADCAST = "action_notify_local_broadcast";
    public static final String DATA_NOTIFY_LOCAL_BROADCAST = "data";
    private static final String TAG = "login.LoginBroadcastHelper";
    private static volatile BroadcastReceiver crossProcessNotifyReceiver;
    private static IntentFilter mfilter;

    static {
        t2o.a(516947970);
        try {
            mfilter = new IntentFilter();
            for (LoginAction loginAction : LoginAction.values()) {
                mfilter.addAction(loginAction.name());
            }
            mfilter.setPriority(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void ensureCrossProcessNotifyReady(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("468d7814", new Object[]{context});
        } else if (crossProcessNotifyReceiver == null) {
            synchronized (LoginBroadcastHelper.class) {
                try {
                    if (crossProcessNotifyReceiver == null) {
                        crossProcessNotifyReceiver = new BroadcastReceiver() { // from class: com.taobao.login4android.broadcast.LoginBroadcastHelper.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                                str.hashCode();
                                int hashCode = str.hashCode();
                                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/login4android/broadcast/LoginBroadcastHelper$1");
                            }

                            @Override // android.content.BroadcastReceiver
                            public void onReceive(Context context2, Intent intent) {
                                Intent intent2;
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context2, intent});
                                } else if (intent != null && (intent2 = (Intent) intent.getParcelableExtra("data")) != null) {
                                    LocalBroadcastManager.getInstance(context2).sendBroadcast(intent2);
                                }
                            }
                        };
                        context.getApplicationContext().registerReceiver(crossProcessNotifyReceiver, new IntentFilter(ACTION_NOTIFY_LOCAL_BROADCAST));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static void registerLoginReceiver(Context context, BroadcastReceiver broadcastReceiver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d919b1b", new Object[]{context, broadcastReceiver});
        } else {
            registerLoginReceiver(context, broadcastReceiver, mfilter);
        }
    }

    public static void sentInitFailBroadcast(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbf0d3a6", new Object[]{context});
            return;
        }
        Intent intent = new Intent(LoginAction.NOTIFY_LOGIN_FAILED.name());
        intent.putExtra(LoginConstants.LOGIN_FAIL_REASON, LoginConstants.LOGIN_FAIL_BY_APPKEY);
        LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
    }

    public static void unregisterLoginReceiver(Context context, BroadcastReceiver broadcastReceiver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac971e22", new Object[]{context, broadcastReceiver});
        } else if (broadcastReceiver != null && context != null) {
            ensureCrossProcessNotifyReady(context);
            LocalBroadcastManager.getInstance(context).unregisterReceiver(broadcastReceiver);
        }
    }

    public static void registerLoginReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fccb740", new Object[]{context, broadcastReceiver, intentFilter});
        } else if (broadcastReceiver != null && context != null) {
            ensureCrossProcessNotifyReady(context);
            LocalBroadcastManager.getInstance(context).registerReceiver(broadcastReceiver, intentFilter);
        }
    }
}
