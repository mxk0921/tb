package com.ali.user.open.ucc.remote.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.ali.user.mobile.base.helper.BroadCastHelper;
import com.ali.user.open.core.trace.SDKLogger;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ucp.util.LoginBroadcastReceiver;
import com.taobao.login4android.broadcast.LoginBroadcastHelper;
import java.lang.reflect.Method;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class UccBroadcastHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "UccBroadcastHelper";
    private static Method doSendBroadcast;
    private static IntentFilter mfilter;
    private static Method registerReceiverMethod;
    private static Method unRegisterReceiverMethod;

    public static void registerLoginReceiver(Context context, BroadcastReceiver broadcastReceiver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d919b1b", new Object[]{context, broadcastReceiver});
        } else {
            registerLoginReceiver(context, broadcastReceiver, mfilter);
        }
    }

    public static void sendBroadcast(Intent intent) {
        Method method = doSendBroadcast;
        if (method != null) {
            try {
                method.invoke(null, intent);
            } catch (Throwable th) {
                th.printStackTrace();
                SDKLogger.e(TAG, "sendBroadcast " + th.getMessage());
            }
        }
    }

    public static void unregisterLoginReceiver(Context context, BroadcastReceiver broadcastReceiver) {
        Method method = unRegisterReceiverMethod;
        if (method != null) {
            try {
                method.invoke(null, context, broadcastReceiver);
            } catch (Throwable th) {
                th.printStackTrace();
                SDKLogger.e(TAG, "unregisterLoginReceiver " + th.getMessage());
            }
        }
    }

    public static void registerLoginReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        Method method = registerReceiverMethod;
        if (method != null) {
            try {
                method.invoke(null, context, broadcastReceiver, intentFilter);
            } catch (Throwable th) {
                th.printStackTrace();
                SDKLogger.e(TAG, "registerLoginReceiver " + th.getMessage());
            }
        }
    }

    static {
        t2o.a(76546172);
        registerReceiverMethod = null;
        unRegisterReceiverMethod = null;
        doSendBroadcast = null;
        try {
            IpChange ipChange = LoginBroadcastHelper.$ipChange;
            registerReceiverMethod = LoginBroadcastHelper.class.getMethod("registerLoginReceiver", Context.class, BroadcastReceiver.class, IntentFilter.class);
            unRegisterReceiverMethod = LoginBroadcastHelper.class.getMethod("unregisterLoginReceiver", Context.class, BroadcastReceiver.class);
            IpChange ipChange2 = BroadCastHelper.$ipChange;
            doSendBroadcast = BroadCastHelper.class.getMethod("doSendBroadcast", Intent.class);
            mfilter = new IntentFilter();
            for (UccResultAction uccResultAction : UccResultAction.values()) {
                mfilter.addAction(uccResultAction.name());
            }
            mfilter.addAction(LoginBroadcastReceiver.NOTIFY_LOGIN_SUCCESS);
            mfilter.addAction(LoginBroadcastReceiver.NOTIFY_LOGOUT);
            mfilter.setPriority(1000);
        } catch (Exception e) {
            e.printStackTrace();
            SDKLogger.e(TAG, "static " + e.getMessage());
        }
    }
}
